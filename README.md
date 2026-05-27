# ReportFL

ReportFL is an LLM-based fault localization approach that adapts the [AutoFL](https://github.com/coinse/autofl/) framework. 
While AutoFL utilizes execution-based coverage information, **ReportFL replaces the coverage module** with a semantic reasoning component that utilizes current and historical bug reports.

## Differences from AutoFL: From Coverage to Reports

The core difference is the transition from **Coverage-based** localization to **Report-based** localization.

### Information Source: Reports vs. Coverage

AutoFL builds its localization signal using code coverage and failure semantics. 
**ReportFL adapts this framework** to operate in scenarios where coverage data may not be utilized, instead relying on:

- The name of the failing test.
- The textual content of the current bug report.
- Semantically related historical bug reports.

###  Bug Report Data & Processing
In addition to the original AutoFL datasets, this repository includes new bug report data located in [`./data/defects4j_bug_reports`](./data/defects4j_bug_reports). 
For each bug, the reports are processed using [`./relevant_report_extractor.py`](./relevant_report_extractor.py), which uses SBERT for relevant past issue report retrieval. The corresponding outputs are as below:

- `current_report.json`: The target issue report (e.g., JIRA's LANG-747) that corresponds to the specific Defects4J bug identifier (e.g., Lang_1).
- `relevant_reports_timewindow_30.json`: A collection of all past relevant issue reports created within a 30-day window prior to the creation date of the current_report.
- `relevant_reports_timewindow_60.json`: A collection of all past relevant issue reports created within a 60-day window prior to the creation date of the current_report.
- `relevant_reports_timewindow_90.json`: A collection of all past relevant issue reports created within a 90-day window prior to the creation date of the current_report.

#### Examples

- [current_report.json](./data/defects4j/Lang_1/current_report.json)
- [relevant_reports_timewindow_30.json](./data/defects4j/Lang_1/relevant_reports_timewindow_30.json)
- [relevant_reports_timewindow_60.json](./data/defects4j/Lang_1/relevant_reports_timewindow_60.json)
- [relevant_reports_timewindow_90.json](./data/defects4j/Lang_1/relevant_reports_timewindow_90.json)

## Environmental Setup
### Python Dependencies
- Compatible with Python >= 3.10
- Compatible with `openai>=0.27.8,<=0.28.1` (not compatible with `openai>=1.0.0`)

Install the required dependencies using the following command:

```shell
pip install pandas python-dotenv tqdm markdown2 tiktoken "openai>=0.27.8,<=0.28.1" javalang-ext scipy numpy matplotlib jupyter seaborn nbformat sentence-transformers scikit-learn nltk
```

### OpenAI API Setup
Before using ReportFL, set up your OpenAI API credentials by creating a `.env` file with the following content:

```shell
OPENAI_API_KEY={YOUR_API_KEY}
OPENAI_ORG_KEY={YOUR_ORG_KEY} # Optional
```
Replace `{YOUR_API_KEY}` with your OpenAI API key and `{YOUR_ORG_KEY}` with your organization's API key.

## Guide to Reproduction

### 0. Raw Result Files
- `./results/{label}/{model}/XFL-{bugname}.json`: the `ReportFL` results
- `./combined_fl_results`: minimized version of FL results (summary, buggy_methods autofl_ranks)

### 1. Generate ReportFL results

To obtain new ReportFL results, please execute the following command:
```shell
# ReportFL (GPT-3.5)
bash runs/gpt-3.5/reportfl.sh
# ReportFL (GPT-4.1-mini)
bash runs/gpt-4.1-mini/reportfl.sh
```

### 2. Generate combined FL results

To obtain combined FL results files only, please execute the following command:
```shell
bash compute_scores.sh
```
Running this command will generate complete score data files (`*_full.json`) within the `combined_fl_results/{label}` directory, utilizing the raw data sourced from the `results` directory.

### 3. Reproduce Results in the Paper

- After generating the comprehensive FL results files, the figures in the paper can be reproduced via the Jupyter notebook files within the directory [`./notebooks`](./notebooks/).


##  Attribution & Citation
This project is an adaptation of the AutoFL artifact by the COINSE Lab. We have maintained the original data structure while modifying the core localization logic to prioritize bug report data.

Original Paper: ```Kang, S., et al. "A Quantitative and Qualitative Evaluation of LLM-based Explainable Fault Localization." (FSE 2024).```

License Note: As the original repository does not specify a license, this adaptation is provided for research and reproduction purposes only.
