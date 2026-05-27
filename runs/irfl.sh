LABEL="irfl_current"
USE_CURRENT_BUG_REPORT=true
USE_RECENT_BUG_REPORT=false
TIMEWINDOW=30


bash runner-irfl.sh ${LABEL} ${USE_CURRENT_BUG_REPORT} ${USE_RECENT_BUG_REPORT} ${TIMEWINDOW}
bash runner-combined_results.sh ${LABEL} 1 ''
