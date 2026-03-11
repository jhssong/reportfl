import os
import json
import time
import argparse

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




class IRFL:
    def __init__(
        self,
        bug_name,
        use_current_bug_report=False,
        use_recent_bug_report=False,
        timewindow=0,
    ):
        self._bug_name = bug_name
        self._timewindow = timewindow
        self._use_current_bug_report = use_current_bug_report
        self._use_recent_bug_report = use_recent_bug_report
        self._ri = get_repo_interface(bug_name=bug_name, timewindow=timewindow)

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
        print (f"{fail_test_signatures}\n{test_snippets}")
        import sys; sys.exit()
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
        for method_signature in self._load_buggy_method_signatures():
            embedded_method_signature = self._embed_text(method_signature)
            sims = cosine_similarity(embedded_text, embedded_method_signature)[0]
            method_signature_list.append(method_signature)
            irfl_scores[method_signature] = sims[0]

        return method_signature_list, irfl_scores


"""
1. 후보 메서드 임베딩 및 코사인 유사도 비교
2. 정답 메서드 찾기 / 아닌거랑 구분
3. 점수 측정을 위해 간략화된 점수 파일과 동일한 형태로 output 작성
combined_fl_results/reportfl/gpt-4.1-mini-2025-04-14_R1_full_light.json
이런 형태가 나와야됨

IRFL의 result 파일을 아래 형식처럼 작성

{
  "buggy_methods": [
    "org.foo.A.method1()",
    "org.foo.B.method2()"
  ],
  "messages": [
    {
      "role": "assistant",
      "content": "org.foo.A.method1()\norg.foo.C.method3()\norg.foo.B.method2()"
      > \n으로 구분하면 됨
      > 정답 메서드에 대해서만 언급하고, cosine sim을 아래와 같이 작성하기
    }
  ],
  "irfl_scores": {
    "org.foo.A.method1()": 0.82,
    "org.foo.C.method3()": 0.74,
    "org.foo.B.method2()": 0.71
  }
}

전체 메서드를 검사하고, 그 중에서 buggy method만 결과를 남기면 됨
"""


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="")
    parser.add_argument("-b", "--bug_name", default="Chart_1")
    parser.add_argument("-o", "--out", default="test.json")
    parser.add_argument("--use_current_bug_report", action="store_true")
    parser.add_argument("--use_recent_bug_report", action="store_true")
    parser.add_argument("--timewindow", default=0, type=int)
    args = parser.parse_args()

    project_name, bug_number = args.bug_name.split("_")

    print(f"Start {args.bug_name}", flush=True)

    irfl = IRFL(
        args.bug_name,
        args.use_current_bug_report,
        args.use_recent_bug_report,
        args.timewindow,
    )
    method_signature_list, irfl_scores = irfl.run()
    with open(args.out, "w") as f:
        json.dump(
            {
                "time": time.time(),
                "messages": [
                    {
                        "role": "assistant",
                        "content": "".join(
                            signature for signature in method_signature_list
                        ),
                    }
                ],
                "buggy_methods": method_signature_list,
                "irfl_scores": irfl_scores,
            },
            f,
            indent=4,
        )
