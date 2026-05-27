#!/usr/bin/env python3
"""
Aggregate results/relevance_eval/*_relevance.json into one JSON object per bug.

Each bug maps to parallel lists (same order as in the source file: SBERT rank order):

  issue_keys     — JIRA keys (e.g. MATH-272)
  rpi_list       — LLM relevance labels (R / P / I / …), same meaning as rpi.ipynb
  llm_scores     — same labels as rpi_list (duplicate key for callers expecting it)
  llm_simscores  — LLM numeric similarity scores
  sim_scores     — SBERT similarities (sbert_simscore in the file)

Skips metadata keys: timewindow_days, summary_of_bug, and any key starting with '_'.

Usage (from reportfl/):
  python scripts/aggregate_relevance_json.py
  python scripts/aggregate_relevance_json.py -o results/relevance_eval/aggregated_rpi.json
"""
from __future__ import annotations

import argparse
import json
import os
import re
import sys

_SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
_REPORTFL_ROOT = os.path.dirname(_SCRIPT_DIR)
if _REPORTFL_ROOT not in sys.path:
    sys.path.insert(0, _REPORTFL_ROOT)

_RELEVANCE_STEM = re.compile(r"^(.+)_relevance\.json$")


def _bugid_from_filename(name: str) -> str | None:
    m = _RELEVANCE_STEM.match(name)
    return m.group(1) if m else None


def _is_report_block(key: str) -> bool:
    if key.startswith("_"):
        return False
    if key in ("timewindow_days", "summary_of_bug"):
        return False
    return True


def _aggregate_one(path: str) -> dict:
    with open(path, encoding="utf-8") as f:
        data: dict = json.load(f)
    issue_keys: list[str] = []
    labels: list[str | None] = []
    llm_sims: list[float | None] = []
    sbert_sims: list[float] = []
    for key in data:
        if not _is_report_block(key):
            continue
        block = data[key]
        if not isinstance(block, dict):
            continue
        issue_keys.append(key)
        lab = block.get("label")
        labels.append(lab if lab is None else str(lab))
        raw_llm = block.get("llm_simscore")
        if raw_llm is None:
            llm_sims.append(None)
        else:
            llm_sims.append(float(raw_llm))
        sbert_sims.append(float(block["sbert_simscore"]))
    return {
        "issue_keys": issue_keys,
        "rpi_list": labels,
        "llm_scores": list(labels),
        "llm_simscores": llm_sims,
        "sim_scores": sbert_sims,
    }


def main() -> None:
    os.chdir(_REPORTFL_ROOT)
    p = argparse.ArgumentParser(description="Aggregate *_relevance.json into one JSON dict")
    p.add_argument(
        "--input-dir",
        default=os.path.join(_REPORTFL_ROOT, "results", "relevance_eval"),
        help="Directory containing *_relevance.json",
    )
    p.add_argument(
        "-o",
        "--output",
        help="Write JSON here (default: stdout)",
    )
    args = p.parse_args()

    indir = os.path.abspath(args.input_dir)
    if not os.path.isdir(indir):
        print(f"Not a directory: {indir}", file=sys.stderr)
        sys.exit(1)

    out: dict[str, dict] = {}
    for name in sorted(os.listdir(indir)):
        if not name.endswith("_relevance.json"):
            continue
        bugid = _bugid_from_filename(name)
        if not bugid:
            continue
        path = os.path.join(indir, name)
        out[bugid] = _aggregate_one(path)

    text = json.dumps(out, indent=2, ensure_ascii=False) + "\n"
    if args.output:
        os.makedirs(os.path.dirname(os.path.abspath(args.output)) or ".", exist_ok=True)
        with open(args.output, "w", encoding="utf-8") as wf:
            wf.write(text)
        print(f"Wrote {len(out)} bugs -> {args.output}", file=sys.stderr)
    else:
        sys.stdout.write(text)


if __name__ == "__main__":
    main()
