import os
import re
import csv
import json
import argparse
import time

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


class RelevantReportExtractor:
    def __init__(self, bug_name):
        self._bug_name = bug_name
        self._ri = get_repo_interface(bug_name=bug_name, timewindow=30)
        self._all_bug_reports = self._load_all_bug_reports(bug_name)
        self._current_bug_report = self._load_current_bug_report(bug_name)

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
                report["summary"] = report.get("summary", "")
                report["description"] = report.get("description", "")
                return report
        return None

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


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="")
    args = parser.parse_args()

    bug_list = [
        "Cli_28",
        "Cli_9",
        "Codec_18",
        "Codec_9",
        "Compress_38",
        "Compress_41",
        "Csv_16",
        "Lang_17",
        "Lang_24",
        "Lang_33",
        "Lang_35",
        "Lang_46",
        "Math_101",
        "Math_11",
        "Math_2",
        "Math_29",
        "Math_41",
        "Math_56",
        "Math_69",
        "Math_8",
        "Math_9",
    ]

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

    for bug_name in bug_list:
        project_name, bug_number = bug_name.split("_")

        print(f"Start {bug_name}", flush=True)

        # Check bug report exists
        if not os.path.exists(os.path.join(BUG_REPORT_DIR, f"{project_name}.json")):
            print("Missing bug report json file")
            continue

        bug_path = os.path.join(BUG_INFO_DIR, bug_name)
        if not os.path.isdir(bug_path):
            continue

        current_save_file = os.path.join(bug_path, "plain_current_report.json")

        rre = RelevantReportExtractor(bug_name)

        current_report = rre._current_bug_report
        if current_report:
            with open(current_save_file, "w") as f:
                json.dump(current_report, f, indent=4)
            print(f"Save current report: {current_save_file}")
