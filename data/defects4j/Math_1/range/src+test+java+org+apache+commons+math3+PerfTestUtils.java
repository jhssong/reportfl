{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/PerfTestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerfTestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 260,
      "comment": "\n * Simple benchmarking utilities.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NANO_TO_MILLI"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Nanoseconds to milliseconds conversion factor ({@value}). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_REPEAT_CHUNK"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default number of code repeat per timed block. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_REPEAT_STAT"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default number of code repeats for computing the average run time. "
    },
    {
      "type": "field",
      "varNames": [
        "rng"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " RNG. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.time(int, int, boolean, java.util.concurrent.Callable\u003cjava.lang.Double\u003e...)",
      "begin_line": 53,
      "end_line": 73,
      "comment": "\n     * Timing.\n     *\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a\n     * {@link StatisticalSummary} of the average times (in milliseconds)\n     * taken by a single call to the {@code call} method (i.e. the time\n     * taken by each timed block divided by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 60,col 60)",
        "(line 62,col 9)-(line 62,col 39)",
        "(line 63,col 9)-(line 63,col 71)",
        "(line 64,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timesAndResults(int, int, boolean, java.util.concurrent.Callable\u003cjava.lang.Double\u003e...)",
      "begin_line": 97,
      "end_line": 141,
      "comment": "\n     * Timing.\n     *\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods} (first dimension), and\n     * each of the {@code repeatStat} runs (second dimension):\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   the average time (in milliseconds) taken by a single call to the\n     *   {@code call} method (i.e. the time taken by each timed block divided\n     *   by {@code repeatChunk})\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   the result returned by the {@code call} method.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 46)",
        "(line 102,col 9)-(line 102,col 83)",
        "(line 104,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 51)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timeAndReport(java.lang.String, int, int, boolean, org.apache.commons.math3.PerfTestUtils.RunTest...)",
      "begin_line": 161,
      "end_line": 214,
      "comment": "\n     * Timing and report (to standard output) the average time and standard\n     * deviation of a single call.\n     * The timing is performed by calling the\n     * {@link #time(int,int,boolean,Callable[]) time} method.\n     *\n     * @param title Title of the test (for the report).\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a statistics of the\n     * average times (in milliseconds) taken by a single call to the\n     * {@code call} method (i.e. the time taken by each timed block divided\n     * by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 97)",
        "(line 171,col 9)-(line 171,col 27)",
        "(line 172,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 63)",
        "(line 181,col 9)-(line 181,col 78)",
        "(line 183,col 9)-(line 183,col 78)",
        "(line 185,col 9)-(line 188,col 54)",
        "(line 189,col 9)-(line 195,col 56)",
        "(line 196,col 9)-(line 199,col 56)",
        "(line 200,col 9)-(line 200,col 61)",
        "(line 201,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timeAndReport(java.lang.String, org.apache.commons.math3.PerfTestUtils.RunTest...)",
      "begin_line": 228,
      "end_line": 235,
      "comment": "\n     * Timing and report (to standard output).\n     * This method calls {@link #timeAndReport(String,int,int,boolean,RunTest[])\n     * timeAndReport(title, 1000, 10000, false, methods)}.\n     *\n     * @param title Title of the test (for the report).\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a statistics of the\n     * average times (in milliseconds) taken by a single call to the\n     * {@code call} method (i.e. the time taken by each timed block divided\n     * by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 234,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RunTest",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 240,
      "end_line": 259,
      "comment": "\n     * Utility class for storing a test label.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.RunTest(java.lang.String)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n         * @param name Test name.\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.getName()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n         * @return the name of this test.\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.call()",
      "begin_line": 258,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}