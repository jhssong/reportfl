LABEL="irfl_60days"
USE_CURRENT_BUG_REPORT=true
USE_RECENT_BUG_REPORT=true
TIMEWINDOW=60


bash runner-irfl.sh ${LABEL} ${USE_CURRENT_BUG_REPORT} ${USE_RECENT_BUG_REPORT} ${TIMEWINDOW}
bash runner-combined_results.sh ${LABEL} 1 ''
