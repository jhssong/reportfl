{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/time/StopWatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StopWatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 57,
      "end_line": 340,
      "comment": "\n * \u003cp\u003e\n * \u003ccode\u003eStopWatch\u003c/code\u003e provides a convenient API for timings.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * To start the watch, call {@link #start()}. At this point you can:\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e{@link #split()} the watch to get the time whilst the watch continues in the background. {@link #unsplit()} will\n * remove the effect of the split. At this point, these three options are available again.\u003c/li\u003e\n * \u003cli\u003e{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch to continue. Any time between the\n * suspend and resume will not be counted in the total. At this point, these three options are available again.\u003c/li\u003e\n * \u003cli\u003e{@link #stop()} the watch to complete the timing session.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cp\u003e\n * It is intended that the output methods {@link #toString()} and {@link #getTime()} should only be called after stop,\n * split or suspend, however a suitable result will be returned at other points.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * NOTE: As from v2.1, the methods protect against inappropriate calls. Thus you cannot now call stop before start,\n * resume before suspend or unsplit before split.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * 1. split(), suspend(), or stop() cannot be invoked twice\u003cbr /\u003e\n * 2. unsplit() may only be called if the watch has been split()\u003cbr /\u003e\n * 3. resume() may only be called if the watch has been suspend()\u003cbr /\u003e\n * 4. start() cannot be called twice without calling reset()\n * \u003c/p\u003e\n * \n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSTARTED"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " running states"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_RUNNING"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_STOPPED"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SUSPENDED"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSPLIT"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " split state"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SPLIT"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runningState"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * The current running state of the StopWatch.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "splitState"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Whether the stopwatch has a split time recorded.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * The start time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stopTime"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The stop time.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.StopWatch.StopWatch()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * \u003cp\u003e\n     * Constructor.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.start()",
      "begin_line": 114,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003e\n     * Start the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method starts a new timing session, clearing any previous values.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is already running.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 52)",
        "(line 123,col 9)-(line 123,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.stop()",
      "begin_line": 138,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003e\n     * Stop the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method ends a new timing session, allowing the time to be retrieved.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.reset()",
      "begin_line": 157,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003e\n     * Resets the stopwatch. Stops it if need be.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method clears the internal values to allow the object to be reused.\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 44)",
        "(line 159,col 9)-(line 159,col 40)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 161,col 9)-(line 161,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.split()",
      "begin_line": 177,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003e\n     * Split the time.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method sets the stop time of the watch to allow a time to be extracted. The start time is unaffected,\n     * enabling {@link #unsplit()} to continue the timing from the original start point.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 182,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.unsplit()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003e\n     * Remove a split.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method clears the stop time. The start time is unaffected, enabling timing from the original start point to\n     * continue.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not been split.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 27)",
        "(line 203,col 9)-(line 203,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.suspend()",
      "begin_line": 219,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003e\n     * Suspend the stopwatch for later resumption.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method suspends the watch until it is resumed. The watch will not include time between the suspend and\n     * resume calls in the total time.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch is not currently running.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.resume()",
      "begin_line": 240,
      "end_line": 247,
      "comment": "\n     * \u003cp\u003e\n     * Resume the stopwatch after a suspend.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This method resumes the watch after it was suspended. The watch will not include time between the suspend and\n     * resume calls in the total time.\n     * \u003c/p\u003e\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not been suspended.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 71)",
        "(line 245,col 9)-(line 245,col 27)",
        "(line 246,col 9)-(line 246,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getTime()",
      "begin_line": 261,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003e\n     * Get the time on the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is either the time between the start and the moment this method is called, or the amount of time between\n     * start and stop.\n     * \u003c/p\u003e\n     * \n     * @return the time in milliseconds\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getSplitTime()",
      "begin_line": 287,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003e\n     * Get the split time on the stopwatch.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This is the time between start and latest split.\n     * \u003c/p\u003e\n     * \n     * @return the split time in milliseconds\n     * \n     * @throws IllegalStateException\n     *             if the StopWatch has not yet been split.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getStartTime()",
      "begin_line": 302,
      "end_line": 307,
      "comment": "\n     * Returns the time this stopwatch was started.\n     * \n     * @return the time this stopwatch was started\n     * @throws IllegalStateException\n     *             if this StopWatch has not been started\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toString()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * \u003cp\u003e\n     * Gets a summary of the time that the stopwatch recorded as a string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The format used is ISO8601-like, \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toSplitString()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * \u003cp\u003e\n     * Gets a summary of the split time that the stopwatch recorded as a string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The format used is ISO8601-like, \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the split time as a String\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 69)"
      ]
    }
  ]
}