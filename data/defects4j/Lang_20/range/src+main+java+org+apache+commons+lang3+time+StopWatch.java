{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/time/StopWatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StopWatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 382,
      "comment": "\n * \u003cp\u003e\n * \u003ccode\u003eStopWatch\u003c/code\u003e provides a convenient API for timings.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To start the watch, call {@link #start()}. At this point you can:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e{@link #split()} the watch to get the time whilst the watch continues in the background. {@link #unsplit()} will\n * remove the effect of the split. At this point, these three options are available again.\u003c/li\u003e\n * \u003cli\u003e{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch to continue. Any time between the\n * suspend and resume will not be counted in the total. At this point, these three options are available again.\u003c/li\u003e\n * \u003cli\u003e{@link #stop()} the watch to complete the timing session.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cp\u003e\n * It is intended that the output methods {@link #toString()} and {@link #getTime()} should only be called after stop,\n * split or suspend, however a suitable result will be returned at other points.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * NOTE: As from v2.1, the methods protect against inappropriate calls. Thus you cannot now call stop before start,\n * resume before suspend or unsplit before split.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * 1. split(), suspend(), or stop() cannot be invoked twice\u003cbr /\u003e\n * 2. unsplit() may only be called if the watch has been split()\u003cbr /\u003e\n * 3. resume() may only be called if the watch has been suspend()\u003cbr /\u003e\n * 4. start() cannot be called twice without calling reset()\n * \u003c/p\u003e\n * \n * \u003cp\u003eThis class is not thread-safe\u003c/p\u003e\n * \n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "NANO_2_MILLIS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSTARTED"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " running states"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_RUNNING"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_STOPPED"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SUSPENDED"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSPLIT"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " split state"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SPLIT"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runningState"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The current running state of the StopWatch.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "splitState"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Whether the stopwatch has a split time recorded.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * The start time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startTimeMillis"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The start time in Millis - nanoTime is only for elapsed time so we \n     * need to also store the currentTimeMillis to maintain the old \n     * getStartTime API.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stopTime"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * The stop time.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.StopWatch.StopWatch()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.start()",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003e\n     * Start the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method starts a new timing session, clearing any previous values.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is already running.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 43)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.stop()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003e\n     * Stop the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method ends a new timing session, allowing the time to be retrieved.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.reset()",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003e\n     * Resets the stopwatch. Stops it if need be.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method clears the internal values to allow the object to be reused.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 44)",
        "(line 169,col 9)-(line 169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.split()",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003e\n     * Split the time.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method sets the stop time of the watch to allow a time to be extracted. The start time is unaffected,\n     * enabling {@link #unsplit()} to continue the timing from the original start point.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 42)",
        "(line 190,col 9)-(line 190,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.unsplit()",
      "begin_line": 206,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003e\n     * Remove a split.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method clears the stop time. The start time is unaffected, enabling timing from the original start point to\n     * continue.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not been split.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.suspend()",
      "begin_line": 226,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003e\n     * Suspend the stopwatch for later resumption.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method suspends the watch until it is resumed. The watch will not include time between the suspend and\n     * resume calls in the total time.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not currently running.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 42)",
        "(line 231,col 9)-(line 231,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.resume()",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * \u003cp\u003e\n     * Resume the stopwatch after a suspend.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method resumes the watch after it was suspended. The watch will not include time between the suspend and\n     * resume calls in the total time.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not been suspended.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 62)",
        "(line 252,col 9)-(line 252,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.getTime()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * \u003cp\u003e\n     * Get the time on the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is either the time between the start and the moment this method is called, or the amount of time between\n     * start and stop.\n     * \u003c/p\u003e\n     * \n     * @return the time in milliseconds\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.getNanoTime()",
      "begin_line": 283,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003e\n     * Get the time on the stopwatch in nanoseconds.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is either the time between the start and the moment this method is called, or the amount of time between\n     * start and stop.\n     * \u003c/p\u003e\n     * \n     * @return the time in nanoseconds\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.getSplitTime()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003e\n     * Get the split time on the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is the time between start and latest split.\n     * \u003c/p\u003e\n     * \n     * @return the split time in milliseconds\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not yet been split.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.getSplitNanoTime()",
      "begin_line": 327,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003e\n     * Get the split time on the stopwatch in nanoseconds.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is the time between start and latest split.\n     * \u003c/p\u003e\n     * \n     * @return the split time in nanoseconds\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not yet been split.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.getStartTime()",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\n     * Returns the time this stopwatch was started.\n     * \n     * @return the time this stopwatch was started\n     * @throws IllegalStateException\n     *             if this StopWatch has not been started\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.toString()",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003e\n     * Gets a summary of the time that the stopwatch recorded as a string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The format used is ISO8601-like, \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.StopWatch.toSplitString()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003e\n     * Gets a summary of the split time that the stopwatch recorded as a string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The format used is ISO8601-like, \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the split time as a String\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 69)"
      ]
    }
  ]
}