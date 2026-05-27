import os
import re
import csv
import json
import nltk
import signal
import argparse
import datetime
import numpy as np
import time
from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity

from lib import name_utils
from lib.repo_interface import get_repo_interface

BUG_INFO_DIR = os.path.join(
    os.path.dirname(os.path.abspath(__file__)),
    "data/defects4j/",
)
BUG_REPORT_DIR = os.path.join(
    os.path.dirname(os.path.abspath(__file__)),
    "data/defects4j_bug_reports/",
)

nltk.download("punkt_tab")


class RelevantReportExtractor:
    def __init__(self, bug_name, timewindow):
        self._bug_name = bug_name
        self._timewindow = timewindow
        self._ri = get_repo_interface(bug_name=bug_name, timewindow=timewindow)
        self._embedder = SentenceTransformer("sentence-transformers/all-MiniLM-L12-v2")
        self._all_bug_reports = self._load_all_bug_reports(bug_name)
        self._current_bug_report = self._load_current_bug_report(bug_name)
        self._recent_bug_reports = self._load_recent_bug_reports()

    def _load_all_bug_reports(self, bug_name):
        project_name = bug_name.split("_")[0]
        with open(
            os.path.join(BUG_REPORT_DIR, f"{project_name}.json"), "r", encoding="utf-8"
        ) as f:
            bug_reports = json.load(f)
            return bug_reports

    def _load_current_bug_report(self, bug_name):
        project_name, bug_number = bug_name.split("_")
        current_issue_key = None
        with open(
            os.path.join(BUG_REPORT_DIR, f"{project_name}_issue_key.csv"),
            "r",
            encoding="utf-8",
        ) as csvfile:
            reader = csv.reader(csvfile)
            for number, issue_key in reader:
                if number == bug_number:
                    current_issue_key = issue_key
                    break

        if current_issue_key is None:
            return None
        for report in self._all_bug_reports:
            if report.get("issue_key") == current_issue_key:
                # Masking classes and methods that explicitly contain the answer text
                summary, description = self._masking_answer_metioned_in_report(
                    report.get("summary", ""), report.get("description", "")
                )
                report["summary"] = summary
                report["description"] = description
                return report
        return None

    def _load_recent_bug_reports(self):
        if not self._current_bug_report:
            return []
        # Get current report created date
        current_report_created_date_value = self._current_bug_report.get("created")
        if current_report_created_date_value:
            if isinstance(current_report_created_date_value, str):
                current_report_created_date = datetime.datetime.fromisoformat(
                    current_report_created_date_value
                )
            elif isinstance(current_report_created_date_value, (int, float)):
                current_report_created_date = datetime.datetime.fromtimestamp(
                    current_report_created_date_value / 1000
                )
            else:
                return []
        else:
            return []

        timewindow_days_ago = current_report_created_date - datetime.timedelta(
            days=self._timewindow
        )

        res = []
        for report in self._all_bug_reports:
            created_date_value = report.get("created", "")
            if isinstance(created_date_value, str):
                created_date = datetime.datetime.fromisoformat(created_date_value)
            elif isinstance(created_date_value, (int, float)):
                created_date = datetime.datetime.fromtimestamp(
                    created_date_value / 1000
                )
            else:
                continue

            # Process only reports created within the specified time window.
            if timewindow_days_ago <= created_date <= current_report_created_date:
                # Pass the current report
                if report.get("issue_key") == self._current_bug_report.get("issue_key"):
                    continue
                # Take only first three sentences from report description
                description = report.get("description")
                if description:
                    report["description"] = self._extract_three_sentences(description)
                else:
                    continue
                res.append(report)
        return res

    def _masking_answer_metioned_in_report(self, summary, description):
        method_pattern = re.compile(r"\b[A-Z]\w*(?:\.|#)\w+\s*(?:\([^)]*\))?")

        mentions_in_summary = list(set(method_pattern.findall(summary)))
        mentions_in_description = list(set(method_pattern.findall(description)))

        def extract_arguments(signature):
            m = re.search(r"\((.*)\)", signature)
            return m.group(1) if m else ""

        for mention in mentions_in_summary:
            for index, gt in enumerate(self._ri._buggy_methods):
                if name_utils.lenient_matcher(mention, gt):
                    summary = summary.replace(
                        mention, f"c{index}.m{index}({extract_arguments(mention)})"
                    )

        for mention in mentions_in_description:
            for index, gt in enumerate(self._ri._buggy_methods):
                if name_utils.lenient_matcher(mention, gt):
                    description = description.replace(
                        mention, f"c{index}.m{index}({extract_arguments(mention)})"
                    )

        return [summary, description]

    def _extract_three_sentences(self, text):
        # Step 0: Remove empty or whitespace-only lines
        text = "\n".join(line for line in text.splitlines() if line.strip())
        # Step 1: Split into text and code parts
        parts = re.split(
            r"(```[\s\S]*?```)", text
        )  # handles language-tagged code fences too
        sentences = []
        for part in parts:
            part = part.strip()
            if not part:
                continue
            if part.startswith("```") and part.endswith("```"):
                # Code block → one independent sentence
                sentences.append(part)
            else:
                # Use NLTK sentence tokenizer for prose
                sentences.extend(nltk.sent_tokenize(part))
        return " ".join(sentences[:3])

    def _embed_report(self, report):
        if not report:
            return None
        text = f"{report.get('summary', '')}\n{report.get('description', '')}"
        return self._embedder.encode(text, normalize_embeddings=True).tolist()

    def get_related_recent_bug_reports(self):
        # Check current bug report, recent bug reports, fail info text exists
        if (
            not self._current_bug_report
            or not len(self._recent_bug_reports) > 0
            or not self._ri._fail_info
        ):
            missing_data = []
            if not self._current_bug_report:
                missing_data.append("current_bug_report")
            if not len(self._recent_bug_reports) > 0:
                missing_data.append("recent_bug_reports")
            if not self._ri._fail_info:
                missing_data.append("fail_info")

            print(f"One of required data is missing: {', '.join(missing_data)}")
            return None

        current_bug_report_emb = np.array(
            self._embed_report(self._current_bug_report)
            if self._current_bug_report
            else None
        ).reshape(1, -1)
        recent_bug_reports_embs = np.array(
            [self._embed_report(r) for r in self._recent_bug_reports]
            if self._recent_bug_reports
            else None
        )
        fail_texts = []
        for signature, _ in self._ri._fail_info.items():
            snippet = self._ri.get_test_snippet(signature) or ""
            fail_texts.append(f"{signature} {snippet}\n")
        fail_info_text = "\n".join(fail_texts)
        fail_info_emb = np.array(
            self._embedder.encode(fail_info_text, normalize_embeddings=True).tolist()
        ).reshape(1, -1)

        combined_emb = current_bug_report_emb * 0.7 + fail_info_emb * 0.3
        sims = cosine_similarity(combined_emb, recent_bug_reports_embs)[0]
        results = []
        top_idx = sims.argsort()[::-1]
        for i in top_idx:
            report = self._recent_bug_reports[i]
            results.append(
                {
                    "similarity": float(sims[i]),
                    "report": report,
                }
            )
        return results


def signal_handler(sig, frame):
    exit(0)


signal.signal(signal.SIGINT, signal_handler)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="")
    parser.add_argument("-t", "--timewindow", default=30, type=int)
    parser.add_argument("--overwrite", action="store_true")
    args = parser.parse_args()

    report_count = {
        "Cli": 0,
        "Codec": 0,
        "Collections": 0,
        "Compress": 0,
        "Csv": 0,
        "JxPath": 0,
        "Lang": 0,
        "Math": 0,
    }
    retrieval_times = {}

    for bug_name in sorted(os.listdir(BUG_INFO_DIR)):
        project_name, bug_number = bug_name.split("_")

        print(f"Start {bug_name}", flush=True)

        # Check bug report exists
        if not os.path.exists(os.path.join(BUG_REPORT_DIR, f"{project_name}.json")):
            print("Missing bug report json file")
            continue

        bug_path = os.path.join(BUG_INFO_DIR, bug_name)
        if not os.path.isdir(bug_path):
            continue

        current_save_file = os.path.join(bug_path, "current_report.json")
        relevant_save_file = os.path.join(
            bug_path, f"relevant_reports_timewindow_{args.timewindow}.json"
        )

        rre = RelevantReportExtractor(bug_name, args.timewindow)

        current_report = rre._current_bug_report
        if current_report:
            if os.path.exists(current_save_file):
                print("Current report already exists")
            else:
                with open(current_save_file, "w") as f:
                    json.dump(current_report, f, indent=4)
                print(f"Save current report: {current_save_file}")
        else:
            print(f"No current report to save")

        start_time = time.time()
        relevant_reports = rre.get_related_recent_bug_reports()
        elapsed_time = time.time() - start_time

        retrieval_times[bug_name] = elapsed_time
        if relevant_reports:
            if os.path.exists(relevant_save_file) and args.overwrite is False:
                print("Relevant reports already exists")
            else:
                with open(relevant_save_file, "w") as f:
                    json.dump(relevant_reports, f, indent=4)
                print(f"Save relevant reports: {relevant_save_file}")
                report_count[project_name] += len(relevant_reports)
        else:
            print(f"No relevant reports to save")

    print(report_count)

    time_save_path = os.path.join(
        os.path.dirname(os.path.abspath(__file__)),
        f"relevant_report_retrieval_times_timewindow_{args.timewindow}.json",
    )

    with open(time_save_path, "w") as f:
        json.dump(retrieval_times, f, indent=4)

    print(f"Saved retrieval times to {time_save_path}")
