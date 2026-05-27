#!/usr/bin/env python3
"""
Evaluate SBERT-retrieved recent reports with an LLM (system prompt by id).

From the reportfl directory:
  python scripts/recent_report_relevance_eval.py --bugid Lang_16 --topn 3
  python scripts/recent_report_relevance_eval.py --bugid Cli_1 --timewindow 60
  python scripts/recent_report_relevance_eval.py --bugid Lang_16 --llm-session
"""
from __future__ import annotations

import argparse
import hashlib
import json
import os
import sys
from datetime import datetime, timezone
from typing import Any

_SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
_REPORTFL_ROOT = os.path.dirname(_SCRIPT_DIR)
if _REPORTFL_ROOT not in sys.path:
    sys.path.insert(0, _REPORTFL_ROOT)

from lib.llm_utils import OpenAIEngine
from lib.recent_report_relevance import (
    REPORTFL_ROOT,
    build_relevance_user_message,
    get_current_bug_report,
    get_failing_test,
    get_recent_reports,
    load_system_prompt,
    parse_relevance_response,
)

DEFAULT_PROMPT_ID = "pmpt_69da618cf1b08197ab27ba55c603c5b108fc68919e70ad8b"
_MODELS_OMIT_TEMPERATURE = frozenset({"gpt-5.3-chat-latest"})


def _merge_temperature_kw(model: str, temperature: float) -> dict:
    if model in _MODELS_OMIT_TEMPERATURE:
        return {}
    return {"temperature": temperature}


def _apply_seed(kwargs: dict, seed: int | None) -> None:
    if seed is not None:
        kwargs["seed"] = seed


def _request_for_log(kwargs: dict) -> dict[str, Any]:
    return json.loads(json.dumps(kwargs))


def _summarize_bug_openai(
    engine: OpenAIEngine,
    failing: list[tuple[str, str]],
    current: dict,
    model: str,
    temperature: float,
    seed: int | None,
) -> tuple[str, dict]:
    user_parts: list[str] = []
    user_parts.append("Summarize the bug in 2–4 sentences for a developer, using only:")
    user_parts.append("1) the failing test code below,")
    user_parts.append("2) the current bug report (summary + description).")
    user_parts.append("")
    user_parts.append("Failing test(s):")
    for sig, snip in failing:
        user_parts.append(f"--- {sig}")
        user_parts.append(snip)
        user_parts.append("")
    user_parts.append("Current bug report (JSON):")
    user_parts.append(json.dumps(current, indent=2))
    kwargs = {
        "model": model,
        "messages": [
            {
                "role": "system",
                "content": "You write concise, technical bug summaries. Output plain text only, no markdown.",
            },
            {"role": "user", "content": "\n".join(user_parts)},
        ],
        **_merge_temperature_kw(model, temperature),
    }
    _apply_seed(kwargs, seed)
    req = _request_for_log(kwargs)
    resp = engine.get_LLM_response(**kwargs)
    text = resp["choices"][0]["message"]["content"].strip()
    return text, req


def _relevance_openai(
    engine: OpenAIEngine,
    system: str,
    user: str,
    model: str,
    temperature: float,
    seed: int | None,
) -> tuple[str, dict]:
    kwargs = {
        "model": model,
        "messages": [
            {"role": "system", "content": system},
            {"role": "user", "content": user},
        ],
        **_merge_temperature_kw(model, temperature),
    }
    _apply_seed(kwargs, seed)
    req = _request_for_log(kwargs)
    resp = engine.get_LLM_response(**kwargs)
    text = resp["choices"][0]["message"]["content"].strip()
    return text, req


def run(
    bugid: str,
    topn: int,
    timewindow_days: int,
    model: str,
    prompt_id: str,
    out_path: str | None,
    skip_summary: bool,
    include_debug: bool,
    temperature: float,
    seed: int | None,
    export_relevance_request: str | None,
    llm_session_path: str | None,
) -> dict:
    recent = get_recent_reports(bugid, topn, timewindow_days)
    failing = get_failing_test(bugid)
    current = get_current_bug_report(bugid)

    system = load_system_prompt(prompt_id)
    user_msg = build_relevance_user_message(failing, current, recent)

    temp_omitted = model in _MODELS_OMIT_TEMPERATURE
    session_calls: list[dict[str, Any]] = []

    if export_relevance_request:
        os.makedirs(os.path.dirname(export_relevance_request) or ".", exist_ok=True)
        with open(export_relevance_request, "w", encoding="utf-8") as ef:
            json.dump(
                {
                    "model": model,
                    "temperature": None if temp_omitted else temperature,
                    "temperature_omitted": temp_omitted,
                    "seed": seed,
                    "prompt_id": prompt_id,
                    "system_prompt_sha256": hashlib.sha256(
                        system.encode("utf-8")
                    ).hexdigest(),
                    "messages": [
                        {"role": "system", "content": system},
                        {"role": "user", "content": user_msg},
                    ],
                },
                ef,
                indent=2,
                ensure_ascii=False,
            )
            ef.write("\n")

    engine = OpenAIEngine()
    relevance_text, rel_req = _relevance_openai(
        engine, system, user_msg, model, temperature, seed
    )
    session_calls.append(
        {"call": "relevance", "request": rel_req, "response_text": relevance_text}
    )

    if skip_summary:
        summary_of_bug = ""
    else:
        summary_of_bug, sum_req = _summarize_bug_openai(
            engine, failing, current, model, temperature, seed
        )
        session_calls.append(
            {
                "call": "summary_of_bug",
                "request": sum_req,
                "response_text": summary_of_bug,
            }
        )

    if llm_session_path:
        os.makedirs(os.path.dirname(llm_session_path) or ".", exist_ok=True)
        doc = {
            "created_utc": datetime.now(timezone.utc).isoformat(),
            "bugid": bugid,
            "topn": topn,
            "timewindow_days": timewindow_days,
            "model": model,
            "prompt_id": prompt_id,
            "temperature_cli": temperature,
            "temperature_omitted_for_model": temp_omitted,
            "seed": seed,
            "system_prompt_sha256": hashlib.sha256(system.encode("utf-8")).hexdigest(),
            "user_message_sha256_relevance": hashlib.sha256(
                user_msg.encode("utf-8")
            ).hexdigest(),
            "calls": session_calls,
        }
        with open(llm_session_path, "w", encoding="utf-8") as sf:
            json.dump(doc, sf, indent=2, ensure_ascii=False)
            sf.write("\n")

    parsed, warnings = parse_relevance_response(relevance_text, recent)
    sbert_by_key = {e["report"]["issue_key"]: float(e["similarity"]) for e in recent}

    out: dict = {"timewindow_days": timewindow_days, "summary_of_bug": summary_of_bug}
    if include_debug:
        if warnings:
            out["_parse_warnings"] = warnings
        out["_raw_relevance_response"] = relevance_text
        out["_request_meta"] = {
            "model": model,
            "temperature": None if temp_omitted else temperature,
            "temperature_omitted": temp_omitted,
            "seed": seed,
            "prompt_id": prompt_id,
            "system_prompt_sha256": hashlib.sha256(system.encode("utf-8")).hexdigest(),
            "user_message_sha256": hashlib.sha256(user_msg.encode("utf-8")).hexdigest(),
        }
        if llm_session_path:
            out["_llm_session_file"] = llm_session_path

    for e in recent:
        key = e["report"]["issue_key"]
        sbert = sbert_by_key[key]
        block = parsed.get(key)
        if block:
            out[key] = {
                "label": block["label"],
                "reason": block["reason"],
                "llm_simscore": block["llm_simscore"],
                "sbert_simscore": sbert,
            }
        else:
            out[key] = {
                "label": None,
                "reason": None,
                "llm_simscore": None,
                "sbert_simscore": sbert,
            }

    if out_path:
        os.makedirs(os.path.dirname(out_path) or ".", exist_ok=True)
        with open(out_path, "w", encoding="utf-8") as f:
            json.dump(out, f, indent=2, ensure_ascii=False)
            f.write("\n")

    return out


def main() -> None:
    os.chdir(REPORTFL_ROOT)
    p = argparse.ArgumentParser(description="LLM relevance eval for recent SBERT reports")
    p.add_argument("--bugid", required=True, help="e.g. Lang_16")
    p.add_argument("--topn", type=int, default=3)
    p.add_argument(
        "--timewindow",
        type=int,
        default=30,
        metavar="DAYS",
        help="Which data/defects4j/<bugid>/relevant_reports_timewindow_{DAYS}.json to load (default: 30)",
    )
    p.add_argument("--model", default="gpt-5.4", help="OpenAI chat model id")
    p.add_argument("--temperature", type=float, default=0.2)
    p.add_argument("--prompt-id", default=DEFAULT_PROMPT_ID)
    p.add_argument("-o", "--output", help="Output JSON (default: results/relevance_eval/{bugid}_relevance.json)")
    p.add_argument("--skip-summary", action="store_true", help="Only run relevance (no summary_of_bug LLM call)")
    p.add_argument("--debug", action="store_true")
    p.add_argument("--seed", type=int, default=None)
    p.add_argument("--export-relevance-request", metavar="PATH")
    p.add_argument(
        "--llm-session",
        nargs="?",
        const="__DEFAULT__",
        default=None,
        metavar="PATH",
        help="Write full request/response trace JSON (default path if flag alone)",
    )
    args = p.parse_args()

    out_path = args.output or os.path.join(
        REPORTFL_ROOT, "results", "relevance_eval", f"{args.bugid}_relevance.json"
    )
    if args.llm_session == "__DEFAULT__":
        llm_session = os.path.join(
            REPORTFL_ROOT,
            "results",
            "relevance_eval",
            f"{args.bugid}_llm_session.json",
        )
    elif args.llm_session:
        llm_session = args.llm_session
    else:
        llm_session = None

    try:
        out = run(
            args.bugid,
            args.topn,
            args.timewindow,
            args.model,
            args.prompt_id,
            out_path,
            args.skip_summary,
            args.debug,
            args.temperature,
            args.seed,
            args.export_relevance_request,
            llm_session,
        )
    except Exception as e:
        print(f"Error: {e}", file=sys.stderr)
        sys.exit(1)

    print(json.dumps(out, indent=2, ensure_ascii=False))
    print(f"\nWrote: {out_path}", file=sys.stderr)
    if llm_session:
        print(f"LLM session: {llm_session}", file=sys.stderr)

if __name__ == "__main__":
    main()
