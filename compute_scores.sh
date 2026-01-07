[ ! -d combined_fl_results ] && mkdir combined_fl_results

# GPT-3.5 (M = 1 and M = 5)

# AutoFL
bash runner-combined_results.sh autofl 5 gpt-3.5-turbo-0125 false
# AutoFL_onlyft
bash runner-combined_results.sh autofl_onlyft 5 gpt-3.5-turbo-0125 true
# ReportFL
bash runner-combined_results.sh reportfl 5 gpt-3.5-turbo-0125 true
# ReportFL_60days
bash runner-combined_results.sh reportfl_60days 5 gpt-3.5-turbo-0125 true
# ReportFL_90days
bash runner-combined_results.sh reportfl_90days 5 gpt-3.5-turbo-0125 true
# ReportFL_current
bash runner-combined_results.sh current 5 gpt-3.5-turbo-0125 true

# GPT-4.1-mini (M = 1 and M = 5)

# AutoFL
bash runner-combined_results.sh autofl 5 gpt-4.1-mini-2025-04-14 false
# AutoFL_onlyft
bash runner-combined_results.sh autofl_onlyft 5 gpt-4.1-mini-2025-04-14 true
# ReportFL
bash runner-combined_results.sh reportfl 5 gpt-4.1-mini-2025-04-14 true
# ReportFL_60days
bash runner-combined_results.sh reportfl_60days 5 gpt-4.1-mini-2025-04-14 true
# ReportFL_90days
bash runner-combined_results.sh reportfl_90days 5 gpt-4.1-mini-2025-04-14 true
# ReportFL_current
bash runner-combined_results.sh current 5 gpt-4.1-mini-2025-04-14 true
