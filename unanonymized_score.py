import os
import json

GPT_VERSION = "gpt-4.1-mini-2025-04-14"
REPETITION = 1
REPORTFL_RESULT = (
    f"combined_fl_results/reportfl/{GPT_VERSION}_R{REPETITION}_full_light.json"
)
UNANONYMIZED_RESULT = f"combined_fl_results/reportfl_unanonymized/{GPT_VERSION}_R{REPETITION}_full_light.json"
COMBINED_RESULT = f"combined_fl_results/reportfl_unanonymized_combined/{GPT_VERSION}_R{REPETITION}_full_light.json"


def calculate_acc(buggy_method_ranks, key="autofl_rank", n=1):
    acc = 0
    for bug_name in buggy_method_ranks:
        ranks = [
            buggy_method_ranks[bug_name][method][key]
            for method in buggy_method_ranks[bug_name]
        ]
        assert None not in ranks
        if any([r <= n for r in ranks]):
            acc += 1
    return acc


with open(REPORTFL_RESULT, "r") as f:
    reportfl_result_data = json.load(f)
with open(UNANONYMIZED_RESULT, "r") as f:
    unanonymized_result_data = json.load(f)


reportfl_buggy_method_ranks = reportfl_result_data["buggy_methods"]
unanonymized_buggy_method_ranks = unanonymized_result_data["buggy_methods"]

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

# for b in bug_list:
#     reportfl_buggy_method_ranks[b] = unanonymized_buggy_method_ranks[b]

data = {}
for b in bug_list:
    data[b] = reportfl_buggy_method_ranks[b]

summary = {}

for n in range(1, 11):
    summary[f"acc@{n}"] = calculate_acc(data, key="autofl_rank", n=n)

data = {
    "summary": summary,
    "buggy_methods": reportfl_buggy_method_ranks,
}

os.makedirs(os.path.dirname(COMBINED_RESULT), exist_ok=True)
with open(COMBINED_RESULT, "w") as f:
    json.dump(data, f, indent=4)
