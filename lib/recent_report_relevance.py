"""Data loading and parsing for recent-report relevance evaluation."""
from __future__ import annotations

import json
import os
import re
from typing import Any, TypedDict


REPORTFL_ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
BUG_INFO_DIR = os.path.join(REPORTFL_ROOT, "data", "defects4j")
PROMPTS_DIR = os.path.join(REPORTFL_ROOT, "prompts")


def relevant_reports_filename(timewindow_days: int) -> str:
    return f"relevant_reports_timewindow_{timewindow_days}.json"


class RecentEntry(TypedDict):
    similarity: float
    report: dict[str, Any]


def _bug_dir(bugid: str) -> str:
    return os.path.join(BUG_INFO_DIR, bugid)


def get_recent_reports(bugid: str, topn: int, timewindow_days: int = 30) -> list[RecentEntry]:
    path = os.path.join(_bug_dir(bugid), relevant_reports_filename(timewindow_days))
    if not os.path.isfile(path):
        raise FileNotFoundError(path)
    with open(path, encoding="utf-8") as f:
        data: list[RecentEntry] = json.load(f)
    ranked = sorted(data, key=lambda x: float(x["similarity"]), reverse=True)
    return ranked[: max(0, topn)]


def _all_failing_test_signatures(bugid: str) -> list[str]:
    path = os.path.join(_bug_dir(bugid), "failing_tests")
    sigs: list[str] = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("--- "):
                tc_name = line.split()[-1].strip()
                sigs.append(tc_name.replace("::", ".") + "()")
    if not sigs:
        raise ValueError(f"No failing tests in {path}")
    return sigs


def _load_test_snippets(bugid: str) -> list[dict[str, Any]]:
    path = os.path.join(_bug_dir(bugid), "test_snippet.json")
    with open(path, encoding="utf-8") as f:
        return json.load(f)


def _method_suffix_signature(signature: str) -> str:
    """Part after the last '.' (Defects4J `Class::method` → `Class.method()` → `method()`)."""
    if "." in signature:
        return signature.rsplit(".", 1)[-1]
    return signature


def _snippet_for_signature(test_rows: list[dict[str, Any]], signature: str) -> str:
    for row in test_rows:
        if row.get("signature") == signature:
            return row.get("snippet") or ""
    suffix = _method_suffix_signature(signature)
    for row in test_rows:
        rs = row.get("signature") or ""
        if rs.endswith(suffix):
            return row.get("snippet") or ""
    return ""


def get_failing_test(bugid: str) -> list[tuple[str, str]]:
    signatures = _all_failing_test_signatures(bugid)
    rows = _load_test_snippets(bugid)
    return [(s, _snippet_for_signature(rows, s)) for s in signatures]


def get_current_bug_report(bugid: str) -> dict[str, Any]:
    path = os.path.join(_bug_dir(bugid), "current_report.json")
    if not os.path.isfile(path):
        raise FileNotFoundError(path)
    with open(path, encoding="utf-8") as f:
        return json.load(f)


def load_system_prompt(prompt_id: str) -> str:
    path = os.path.join(PROMPTS_DIR, f"{prompt_id}.txt")
    if not os.path.isfile(path):
        raise FileNotFoundError(
            f"Missing system prompt file: {path}\n"
            "Create it with your system instructions for relevance labeling."
        )
    with open(path, encoding="utf-8") as f:
        text = f.read().strip()
    if not text:
        raise ValueError(f"System prompt file is empty: {path}")
    return text


def format_current_bug_report_block(report: dict[str, Any]) -> str:
    lines = [
        "{",
        f'    "summary": {json.dumps(report.get("summary", ""))}',
        f'    "description": {json.dumps(report.get("description", ""))}',
        "}",
    ]
    return "\n".join(lines)


def build_relevance_user_message(
    failing: list[tuple[str, str]],
    current_report: dict[str, Any],
    recent: list[RecentEntry],
) -> str:
    sig_list = [f"'{s}'" for s, _ in failing]
    test_list_repr = "[" + ", ".join(sig_list) + "]"
    parts: list[str] = [
        "The test",
        test_list_repr,
        "failed.",
        "",
        "The test looks like: ",
    ]
    for _, snippet in failing:
        parts.append(snippet.rstrip())
        parts.append("")
    parts.append("Current bug report: ")
    parts.append(format_current_bug_report_block(current_report))
    parts.append("")
    parts.append("Recent bug reports: ")
    for item in recent:
        rep = item["report"]
        key = rep["issue_key"]
        summ = rep.get("summary", "")
        desc = rep.get("description", "")
        parts.append(f"RPT#{key}: {{")
        parts.append(f' "summary": {json.dumps(summ)}')
        parts.append(f' "description": {json.dumps(desc)}')
        parts.append("}")
        parts.append("")
    return "\n".join(parts).rstrip() + "\n"


_RPT_LINE = re.compile(
    r"^\s*Rpt\s*(\d+)\s*:\s*([RPI])\s*\(\s*([0-9]*\.?[0-9]+)\s*\)\s*$",
    re.IGNORECASE,
)
# RPT#LANG-738: P (0.32)  OR  RPT#LANG-738: <P> (0.32)  (tail may include "Reasoning:" on same line)
_RPT_ISSUE_LINE = re.compile(
    r"^\s*RPT#([A-Za-z0-9_.-]+)\s*:\s*(.+)\s*$",
    re.IGNORECASE,
)
_REASONING_PREFIX = re.compile(r"^\s*Reasoning\s*:\s*", re.IGNORECASE)


def _canonical_issue_key(raw: str, recent_ordered: list[RecentEntry]) -> tuple[str | None, str | None]:
    keys = [e["report"]["issue_key"] for e in recent_ordered]
    if raw in keys:
        return raw, None
    rlow = raw.lower()
    for k in keys:
        if k.lower() == rlow:
            return k, None
    return None, f"Unknown issue_key in model output: {raw!r}"


def _parse_label_score_tail(tail: str) -> tuple[str, float]:
    """
    Supports prompt style: RPT#KEY: P (0.32) or <P> (0.32), and legacy (P), 0.05 / Irrelevant — 0.05.
    If the model puts 'Reasoning:' on the same line, only the segment before it is used for label/score.
    """
    tail = tail.strip()
    if re.search(r"(?i)Reasoning\s*:", tail) and not re.match(
        r"^\s*Reasoning\s*:", tail
    ):
        tail = re.split(r"(?i)Reasoning\s*:", tail, maxsplit=1)[0].strip()

    label: str | None = None

    # <P> (0.32) or <R> (1.0)
    m = re.match(
        r"^\s*<([RPI])>\s*\(\s*([0-9]*\.?[0-9]+)\s*\)\s*$", tail, re.IGNORECASE
    )
    if m:
        return m.group(1).upper(), float(m.group(2))

    # P (0.32) / R (0.9) — letter then score in parentheses (matches prompt output format)
    m = re.match(
        r"^\s*([RPI])\s*\(\s*([0-9]*\.?[0-9]+)\s*\)\s*$", tail, re.IGNORECASE
    )
    if m:
        return m.group(1).upper(), float(m.group(2))

    # (P) with score elsewhere
    m = re.search(r"\(([RPI])\)", tail, re.IGNORECASE)
    if m:
        label = m.group(1).upper()
    else:
        tl = tail.lower()
        if "partially" in tl and "relevant" in tl:
            label = "P"
        elif "irrelevant" in tl:
            label = "I"
        elif re.search(r"\brelevant\b", tl):
            label = "R"
    if label is None:
        label = "I"

    nums = re.findall(r"\d+\.\d+|\d+", tail)
    score = float(nums[-1]) if nums else 0.0
    return label, score


def _line_starts_block(line: str) -> tuple[str, Any]:
    m1 = _RPT_LINE.match(line)
    if m1:
        return "rpt", m1
    m2 = _RPT_ISSUE_LINE.match(line)
    if m2:
        return "issue", m2
    return "", None


def parse_relevance_response(
    text: str, recent_ordered: list[RecentEntry]
) -> tuple[dict[str, dict[str, Any]], list[str]]:
    warnings: list[str] = []
    lines = text.replace("\r\n", "\n").split("\n")
    by_key: dict[str, dict[str, Any]] = {}

    i = 0
    while i < len(lines):
        kind, m = _line_starts_block(lines[i])
        if not kind:
            i += 1
            continue

        if kind == "rpt":
            idx = int(m.group(1))
            label = m.group(2).upper()
            try:
                score = float(m.group(3))
            except ValueError:
                score = 0.0
            if idx < 1 or idx > len(recent_ordered):
                warnings.append(f"Rpt index {idx} out of range (1..{len(recent_ordered)})")
                i += 1
                continue
            issue_key = recent_ordered[idx - 1]["report"]["issue_key"]
            i += 1
        else:
            raw_key = m.group(1)
            tail = m.group(2)
            label, score = _parse_label_score_tail(tail)
            canon, warn = _canonical_issue_key(raw_key, recent_ordered)
            if warn:
                warnings.append(warn)
            if canon is None:
                i += 1
                continue
            issue_key = canon
            i += 1

        reason_lines: list[str] = []
        while i < len(lines):
            nk, _ = _line_starts_block(lines[i])
            if nk:
                break
            reason_lines.append(lines[i])
            i += 1
        reason = "\n".join(reason_lines).strip()
        reason = _REASONING_PREFIX.sub("", reason, count=1).strip()

        by_key[issue_key] = {
            "label": label,
            "reason": reason,
            "llm_simscore": score,
        }

    return by_key, warnings
