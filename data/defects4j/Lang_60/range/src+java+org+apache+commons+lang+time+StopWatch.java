{
  "filepath": "/tmp/Lang-60b/src/java/org/apache/commons/lang/time/StopWatch.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StopWatch",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 264,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eStopWatch\u003c/code\u003e provides a convenient API for timings.\u003c/p\u003e\n * \n * \u003cp\u003eTo start the watch, call {@link #start()}. At this point you can:\u003c/p\u003e\n * \u003cul\u003e\n *  \u003cli\u003e{@link #split()} the watch to get the time whilst the watch continues in the\n *   background. {@link #unsplit()} will remove the effect of the split. At this point,\n *   these three options are available again.\u003c/li\u003e\n *  \u003cli\u003e{@link #suspend()} the watch to pause it. {@link #resume()} allows the watch\n *   to continue. Any time between the suspend and resume will not be counted in\n *   the total. At this point, these three options are available again.\u003c/li\u003e\n *  \u003cli\u003e{@link #stop()} the watch to complete the timing session.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eIt is intended that the output methods {@link #toString()} and {@link #getTime()}\n * should only be called after stop, split or suspend, however a suitable result will\n * be returned at other points.\u003c/p\u003e\n *\n * \u003cp\u003eNOTE: As from v2.1, the methods protect against inappropriate calls.\n * Thus you cannot now call stop before start, resume before suspend or\n * unsplit before split.\u003c/p\u003e\n *\n * \u003cp\u003e1. split(), suspend(), or stop() cannot be invoked twice\u003cbr /\u003e\n * 2. unsplit() may only be called if the watch has been split()\u003cbr /\u003e\n * 3. resume() may only be called if the watch has been suspend()\u003cbr /\u003e\n * 4. start() cannot be called twice without calling reset()\u003c/p\u003e\n *\n * @author Henri Yandell\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSTARTED"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " running states"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_RUNNING"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_STOPPED"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SUSPENDED"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STATE_UNSPLIT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " split state"
    },
    {
      "type": "field",
      "varNames": [
        "STATE_SPLIT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runningState"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     *  The current running state of the StopWatch. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "splitState"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Whether the stopwatch has a split time recorded. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "startTime"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * The start time.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stopTime"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The stop time.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.StopWatch.StopWatch()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eConstructor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.start()",
      "begin_line": 96,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eStart the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method starts a new timing session, clearing any previous values.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is already running.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.stop()",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eStop the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method ends a new timing session, allowing the time to be retrieved.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 120,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.reset()",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eResets the stopwatch. Stops it if need be. \u003c/p\u003e\n     * \n     * \u003cp\u003eThis method clears the internal values to allow the object to be reused.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 44)",
        "(line 130,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.split()",
      "begin_line": 144,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eSplit the time.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method sets the stop time of the watch to allow a time to be extracted.\n     * The start time is unaffected, enabling {@link #unsplit()} to continue the \n     * timing from the original start point.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not running.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.unsplit()",
      "begin_line": 160,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eRemove a split.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method clears the stop time. The start time is unaffected, enabling \n     * timing from the original start point to continue.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch has not been split.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 22)",
        "(line 165,col 9)-(line 165,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.suspend()",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eSuspend the stopwatch for later resumption.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method suspends the watch until it is resumed. The watch will not include\n     * time between the suspend and resume calls in the total time.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch is not currently running.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 181,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.resume()",
      "begin_line": 192,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eResume the stopwatch after a suspend.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method resumes the watch after it was suspended. The watch will not include\n     * time between the suspend and resume calls in the total time.\u003c/p\u003e\n     *\n     * @throws IllegalStateException if the StopWatch has not been suspended. \n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 61)",
        "(line 197,col 9)-(line 197,col 22)",
        "(line 198,col 9)-(line 198,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getTime()",
      "begin_line": 209,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eGet the time on the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is either the time between the start and the moment this method \n     * is called, or the amount of time between start and stop.\u003c/p\u003e\n     * \n     * @return the time in milliseconds\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.getSplitTime()",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eGet the split time on the stopwatch.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is the time between start and latest split. \u003c/p\u003e\n     * \n     * @return the split time in milliseconds\n     *\n     * @throws IllegalStateException if the StopWatch has not yet been split.\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toString()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * \u003cp\u003eGets a summary of the time that the stopwatch recorded as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like,\n     * \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @return the time as a String\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.StopWatch.toSplitString()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * \u003cp\u003eGets a summary of the split time that the stopwatch recorded as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like,\n     * \u003ci\u003ehours\u003c/i\u003e:\u003ci\u003eminutes\u003c/i\u003e:\u003ci\u003eseconds\u003c/i\u003e.\u003ci\u003emilliseconds\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @return the split time as a String\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 69)"
      ]
    }
  ]
}