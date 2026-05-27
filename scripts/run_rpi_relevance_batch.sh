#!/usr/bin/env bash
# Batch-run recent_report_relevance_eval.py for bugs listed in notebooks/rpi.ipynb (rpi_data keys).
# Usage (from anywhere):
#   bash scripts/run_rpi_relevance_batch.sh
# Extra args are forwarded to each Python invocation, e.g.:
#   bash scripts/run_rpi_relevance_batch.sh --skip-summary --llm-session
# Env TIMEWINDOW (default 30) selects data/defects4j/<bug>/relevant_reports_timewindow_${TIMEWINDOW}.json
# Bugs without that file are skipped (not counted as failures); see end-of-run summary.

set -uo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPORTFL_ROOT="$(cd "${SCRIPT_DIR}/.." && pwd)"
cd "${REPORTFL_ROOT}" || exit 1

DATA_DEFECTS="${REPORTFL_ROOT}/data/defects4j"

# Keys from rpi_data in notebooks/rpi.ipynb (lines ~17–48)
BUGS=(
  Cli_1
  Cli_28
  Cli_30 #
  Codec_10
  Compress_11
  Compress_15
  Compress_2
  Compress_30
  Compress_4
  Compress_46
  Compress_8
  JxPath_5
  Lang_11
  Lang_16
  Lang_24
  Lang_34
  Lang_37
  Lang_42
  Lang_49
  Lang_58
  Lang_8 #
  Math_11
  Math_16
  Math_20
  Math_43 # 
  Math_58
  Math_76
  Math_83
  Math_84
  Math_86
)

BUGS=(
  Cli_30
  Lang_8
  Math_43
)

PY="${PYTHON:-python3}"
EVAL="${REPORTFL_ROOT}/scripts/recent_report_relevance_eval.py"
TOPN="${TOPN:-3}"
TIMEWINDOW="${TIMEWINDOW:-90}"

failed=0
ok=0
skipped=()
for bug in "${BUGS[@]}"; do
  RR_FILE="${DATA_DEFECTS}/${bug}/relevant_reports_timewindow_${TIMEWINDOW}.json"
  if [[ ! -f "${RR_FILE}" ]]; then
    echo "[batch] SKIP: ${bug} (no file for timewindow ${TIMEWINDOW})" >&2
    skipped+=("${bug}")
    continue
  fi
  echo "========== ${bug} ==========" >&2
  if ! "${PY}" "${EVAL}" --bugid "${bug}" --topn "${TOPN}" --llm-session --timewindow "${TIMEWINDOW}" "$@"; then
    echo "[batch] FAILED: ${bug}" >&2
    failed=$((failed + 1))
  else
    ok=$((ok + 1))
  fi
done

echo "[batch] Done. OK: ${ok}, Failed: ${failed}, Skipped (missing file): ${#skipped[@]}, Listed: ${#BUGS[@]}" >&2
if [[ "${#skipped[@]}" -gt 0 ]]; then
  echo "[batch] Skipped bugs (timewindow=${TIMEWINDOW}):" >&2
  for s in "${skipped[@]}"; do
    echo "  ${s}" >&2
  done
fi
exit "${failed}"
