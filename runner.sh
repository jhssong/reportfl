LABEL=$1
if [ -z  "$1" ]; then
    echo "Please provide an experiment label."
    exit 0
fi
REPETITION=$2
DATA_DIR=./data/defects4j/
MODEL=$3
PROMPT_FILE=$4
USE_PURE_AUTOFL=$5
USE_CURRENT_BUG_REPORT=$6
USE_RECENT_BUG_REPORT=$7
TIMEWINDOW=$8
TWO_PHASE=$9
RANDOM_SEED=${10:--1}
BUDGET="10"
NUM_TESTS="1"

cmd="python autofl.py -m ${MODEL} -p ${PROMPT_FILE} --max_budget ${BUDGET} --max_num_tests ${NUM_TESTS} --show_line_number --postprocess_test_snippet --allow_multi_predictions"

if [ "$USE_PURE_AUTOFL" = "true" ]; then
    cmd="${cmd} --use_pure_autofl"
fi
if [ "$USE_CURRENT_BUG_REPORT" = "true" ]; then
    cmd="${cmd} --use_current_bug_report"
fi
if [ "$USE_RECENT_BUG_REPORT" = "true" ]; then
    cmd="${cmd} --use_recent_bug_report --timewindow ${TIMEWINDOW}"
fi
if [ "$TWO_PHASE" = "true" ]; then
    cmd="${cmd} --two_phase"
fi
if [ "$RANDOM_SEED" -ne -1 ]; then
    cmd="${cmd} --random_seed ${RANDOM_SEED}"
fi

trap 'echo interrupted; exit 1' INT

no_current_bug_report=('Cli_3' 'Cli_4' 'Cli_11' 'Cli_12' 'Cli_22' 'Cli_37' 'Cli_38' 'Compress_31' 'Csv_3' 'Lang_18' 'Lang_25' 'Lang_48' 'Math_46' 'Math_47')

for rep in $(seq 1 "$REPETITION"); do
    save_dir="results/${LABEL}/R_${rep}/${MODEL}"
    time_dir="results/${LABEL}/R_${rep}/${MODEL}/runtime"
    mkdir -p "${save_dir}"
    mkdir -p "${time_dir}"

    for bugname in $(ls -d ${DATA_DIR}/*/ | xargs -n1 basename); do
        if printf '%s\n' "${no_current_bug_report[@]}" | grep -qx "$bugname"; then
            echo "Skip (no current bug report): $bugname"
            continue
        fi

        save_file="${save_dir}/XFL-${bugname}.json"
        time_file="${time_dir}/time-${bugname}.json"
        
        if [ -f ${save_file} ]; then
            echo "${save_file} exists"
            continue
        fi
        if [ -f "${DATA_DIR}/${bugname}/snippet.json" ]; then
            cmd="${cmd} -b ${bugname} -o ${save_file} --test_offset $((rep - 1))"
            echo "${LABEL}_${rep}: ${bugname} - ${save_file}"
            
            start_time=$(date +%s.%N)
            timeout 10m ${cmd}
            exit_code=$?
            end_time=$(date +%s.%N)
            
            runtime=$(python3 -c "print(round($end_time - $start_time, 4))")
            echo "{\"bugname\": \"$bugname\", \"repetition\": $rep, \"runtime_sec\": $runtime, \"exit_code\": $exit_code}" > "${time_file}"
        fi
    done
done