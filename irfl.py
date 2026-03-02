import os
import json
import nltk
import time
import argparse
import numpy as np
from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity

from lib import name_utils
from lib.repo_interface import get_repo_interface

nltk.download("punkt_tab")

BUG_INFO_DIR = os.path.join(
    os.path.dirname(os.path.abspath(__file__)),
    "data/defects4j/",
)
BUG_REPORT_DIR = os.path.join(
    os.path.dirname(os.path.abspath(__file__)),
    "data/defects4j_bug_reports/",
)


class IRFL:
    def __init__(
        self,
        bug_name,
        allow_multi_predictions=False,
        use_current_bug_report=False,
        use_recent_bug_report=False,
        timewindow=0,
    ):
        self._bug_name = bug_name
        self._allow_multi_predictions = allow_multi_predictions
        self._timewindow = timewindow
        self._use_current_bug_report = use_current_bug_report
        self._use_recent_bug_report = use_recent_bug_report
        self._ri = get_repo_interface(bug_name=bug_name, timewindow=timewindow)
        self._embedder = SentenceTransformer("sentence-transformers/all-MiniLM-L12-v2")

    def _embed_text(self, text):
        return np.array(
            self._embedder.encode(text, normalize_embeddings=True).tolist()
        ).reshape(1, -1)

    def _load_failing_test_text(self):
        fail_test_signatures = [
            signature
            for signature in self._ri.failing_test_signatures
            if self._ri.get_test_snippet(signature) is not None
        ]

        if not fail_test_signatures:
            raise ValueError(f"Could not find test snippet for bug {self._bug_name}")

        test_snippets = "\n\n".join(
            self._ri.get_test_snippet(signature).rstrip()
            for signature in fail_test_signatures
        )
        return f"{fail_test_signatures}\n{test_snippets}"

    def _load_current_bug_report_text(self):
        current_bug_report = self._ri.get_current_bug_report()
        if not current_bug_report:
            return None

        text = f"{current_bug_report.get('summary', '')}\n{current_bug_report.get('description', '')[0:400]}"
        return text

    def _load_recent_bug_report_text(self):
        recent_bug_reports = self._ri.get_recent_bug_reports()
        if not recent_bug_reports:
            return None

        text = "\n\n".join(
            f"{recent_bug_report.get('summary', '')}\n{recent_bug_report.get('description', '')[0:400]}"
            for recent_bug_report in recent_bug_reports
        )
        return text

    def _load_buggy_method_signatures(self):
        return self._ri.buggy_method_signatures

    def _load_method_signatures(self):
        return self._ri.method_signatures

    def grade(self, answer):
        if self._allow_multi_predictions:
            pred_exprs = answer.splitlines()
        else:
            pred_exprs = [answer]

        matching_method_signatures = {
            pred_expr: self._ri.get_matching_method_signatures(pred_expr)
            for pred_expr in pred_exprs
        }

        grade_result = {}
        for method in self._ri.buggy_method_signatures:
            pred_match = [
                pred_expr
                for pred_expr in pred_exprs
                if method in matching_method_signatures[pred_expr]
            ]
            grade_result[method] = {
                "is_found": len(pred_match) > 0,
                "matching_answer": pred_match,
            }
        return grade_result

    def run(self):
        text = ""
        failing_test = self._load_failing_test_text()
        text += f"\n{failing_test}"
        if self._use_current_bug_report:
            current_bug_report_text = self._load_current_bug_report_text()
            text += f"\n{current_bug_report_text}"
        if self._use_recent_bug_report:
            recent_bug_reports_text = self._load_recent_bug_report_text()
            text += f"\n{recent_bug_reports_text}"

        embedded_text = self._embed_text(text)
        method_signature_list = []
        irfl_scores = {}
        for (
            method_signature
        ) in self._load_method_signatures():  # _load_buggy_method_signatures():
            embedded_method_signature = self._embed_text(method_signature)
            sims = cosine_similarity(embedded_text, embedded_method_signature)[0]
            method_signature_list.append(method_signature)
            irfl_scores[method_signature] = sims[0]

        sorted_methods = sorted(irfl_scores.items(), key=lambda x: x[1], reverse=True)
        ranked_methods = [m for m, _ in sorted_methods]

        # TODO allow_multi_predictions 했을 경우 어디까지 정답으로 인정할지 고민 해봐야 함.
        final_response = ranked_methods[0]
        grade_result = self.grade(final_response)
        return grade_result, final_response


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="")
    parser.add_argument("-b", "--bug_name", default="Chart_1")
    parser.add_argument("-o", "--out", default="test.json")
    parser.add_argument("--allow_multi_predictions", action="store_true")
    parser.add_argument("--use_current_bug_report", action="store_true")
    parser.add_argument("--use_recent_bug_report", action="store_true")
    parser.add_argument("--timewindow", default=0, type=int)
    args = parser.parse_args()

    project_name, bug_number = args.bug_name.split("_")

    print(f"Start {args.bug_name}", flush=True)

    irfl = IRFL(
        args.bug_name,
        args.allow_multi_predictions,
        args.use_current_bug_report,
        args.use_recent_bug_report,
        args.timewindow,
    )
    grade, final_response = irfl.run()
    with open(args.out, "w") as f:
        json.dump(
            {
                "time": time.time(),
                "messages": [
                    {
                        "role": "assistant",
                        "content": final_response,
                    }
                ],
                "buggy_methods": grade,
            },
            f,
            indent=4,
        )
