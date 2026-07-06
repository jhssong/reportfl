LABEL="reportfl_random"
REPETITION=5
MODEL="gpt-4.1-mini-2025-04-14"
PROMPT_FILE="prompts/reportfl.txt"
USE_PURE_AUTOFL=true
USE_CURRENT_BUG_REPORT=true
USE_RECENT_BUG_REPORT=true
TIMEWINDOW=90
TWO_PHASE=true

for RANDOM_SEED in {0..9}; do
    echo "===== RANDOM_SEED=${RANDOM_SEED} ====="

    bash runner.sh \
        "${LABEL}_seed${RANDOM_SEED}" \
        ${REPETITION} \
        ${MODEL} \
        ${PROMPT_FILE} \
        ${USE_PURE_AUTOFL} \
        ${USE_CURRENT_BUG_REPORT} \
        ${USE_RECENT_BUG_REPORT} \
        ${TIMEWINDOW} \
        ${TWO_PHASE} \
        ${RANDOM_SEED}

    bash runner-combined_results.sh \
        "${LABEL}_seed${RANDOM_SEED}" \
        ${REPETITION} \
        ${MODEL} \
        ${USE_PURE_AUTOFL}
done
