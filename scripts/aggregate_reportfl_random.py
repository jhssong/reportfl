import os
import json
from collections import defaultdict

combined_results_dir = "./combined_fl_results"
RESULT_PATH = "./combined_fl_results/reportfl_random"

os.makedirs(RESULT_PATH, exist_ok=True)

GPT_3_5 = "gpt-3.5-turbo-0125"
GPT_4_1 = "gpt-4.1-mini-2025-04-14"


TOTAL_COUNT = 10

for gpt_version in [GPT_3_5, GPT_4_1]:
    for rep in [1, 5]:
        summary_sum = defaultdict(int)
        rank_sum = defaultdict(lambda: defaultdict(int))

        for i in range(10):
            file_path = f"{combined_results_dir}/reportfl_random_seed{i}/{gpt_version}_R{rep}_full_light.json"
            with open(file_path, "r") as f:
                data = json.load(f)

            # summary
            for key, value in data["summary"].items():
                summary_sum[key] += value

            # buggy methods
            for bug_id, methods in data["buggy_methods"].items():
                for method_name, info in methods.items():
                    rank_sum[bug_id][method_name] += info["autofl_rank"]

        summary_avg = {
            key: (int)(summary_sum[key] / TOTAL_COUNT) for key in summary_sum
        }

        buggy_methods_avg = {}

        for bug_id, methods in rank_sum.items():
            buggy_methods_avg[bug_id] = {}

            for method_name, total_rank in methods.items():
                avg_rank = (int)(total_rank / TOTAL_COUNT)

                buggy_methods_avg[bug_id][method_name] = {"autofl_rank": avg_rank}

        result = {
            "summary": summary_avg,
            "buggy_methods": buggy_methods_avg,
        }

        with open(f"{RESULT_PATH}/{gpt_version}_R{rep}_full_light.json", "w") as f:
            json.dump(result, f, indent=4)
