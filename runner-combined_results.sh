LABEL=$1
if [ -z  "$1" ]; then
    echo "Please provide an experiment label."
    exit 0
fi
REPETITION=$2
MODEL=$3
USE_PURE_AUTOFL=$4

OUTPUT_DIRS="combined_fl_results/${LABEL}"
mkdir -p "${OUTPUT_DIRS}"

INPUT_DIRS_R1="results/${LABEL}/R_1/${MODEL}"
OUTPUT_FILE_R1="${OUTPUT_DIRS}/${MODEL}_R1_full.json"

cmd="python compute_score.py ${INPUT_DIRS_R1} -l java -a -o "${OUTPUT_FILE_R1}""
if [ "$USE_PURE_AUTOFL" = "false" ]; then
    cmd="${cmd} --autofl"
fi
time ${cmd}

echo "R1 score computation finished. Results saved to: ${OUTPUT_FILE_R1}"

if [ "$REPETITION" -gt 1 ]; then
    INPUT_DIRS_MAX=""
    for rep in $(seq 1 "$REPETITION"); do
        INPUT_DIRS_MAX="${INPUT_DIRS_MAX} results/${LABEL}/R_${rep}/${MODEL}"
    done

    OUTPUT_FILE_MAX="${OUTPUT_DIRS}/${MODEL}_R${REPETITION}_full.json"
    cmd="python compute_score.py ${INPUT_DIRS_MAX} -l java -a -o "${OUTPUT_FILE_MAX}""
    if [ "$USE_PURE_AUTOFL" = "false" ]; then
        cmd="${cmd} --autofl"
    fi
    time ${cmd}
fi

echo "Score computation finished. Results saved to: ${OUTPUT_DIRS}"