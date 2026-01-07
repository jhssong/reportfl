{
  "filepath": "/tmp/Math-32b/src/test/java/org/apache/commons/math3/PerfTestUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerfTestUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 258,
      "comment": "\n * Simple benchmarking utilities.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NANO_TO_MILLI"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Nanoseconds to milliseconds conversion factor ({@value}). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_REPEAT_CHUNK"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Default number of code repeat per timed block. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_REPEAT_STAT"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Default number of code repeats for computing the average run time. "
    },
    {
      "type": "field",
      "varNames": [
        "rng"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " RNG. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.time(int, int, boolean, java.util.concurrent.Callable\u003cjava.lang.Double\u003e...)",
      "begin_line": 52,
      "end_line": 72,
      "comment": "\n     * Timing.\n     *\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a\n     * {@link StatisticalSummary} of the average times (in milliseconds)\n     * taken by a single call to the {@code call} method (i.e. the time\n     * taken by each timed block divided by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 59,col 60)",
        "(line 61,col 9)-(line 61,col 39)",
        "(line 62,col 9)-(line 62,col 71)",
        "(line 63,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timesAndResults(int, int, boolean, java.util.concurrent.Callable\u003cjava.lang.Double\u003e...)",
      "begin_line": 96,
      "end_line": 140,
      "comment": "\n     * Timing.\n     *\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods} (first dimension), and\n     * each of the {@code repeatStat} runs (second dimension):\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   the average time (in milliseconds) taken by a single call to the\n     *   {@code call} method (i.e. the time taken by each timed block divided\n     *   by {@code repeatChunk})\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   the result returned by the {@code call} method.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 46)",
        "(line 101,col 9)-(line 101,col 83)",
        "(line 103,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 51)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timeAndReport(java.lang.String, int, int, boolean, org.apache.commons.math3.PerfTestUtils.RunTest...)",
      "begin_line": 160,
      "end_line": 212,
      "comment": "\n     * Timing and report (to standard output) the average time and standard\n     * deviation of a single call.\n     * The timing is performed by calling the\n     * {@link #time(int,int,boolean,Callable[]) time} method.\n     *\n     * @param title Title of the test (for the report).\n     * @param repeatChunk Each timing measurement will done done for that\n     * number of repeats of the code.\n     * @param repeatStat Timing will be averaged over that number of runs.\n     * @param runGC Call {@code System.gc()} between each timed block. When\n     * set to {@code true}, the test will run much slower.\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a statistics of the\n     * average times (in milliseconds) taken by a single call to the\n     * {@code call} method (i.e. the time taken by each timed block divided\n     * by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 97)",
        "(line 169,col 9)-(line 169,col 27)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 63)",
        "(line 179,col 9)-(line 179,col 78)",
        "(line 181,col 9)-(line 181,col 78)",
        "(line 183,col 9)-(line 186,col 54)",
        "(line 187,col 9)-(line 193,col 56)",
        "(line 194,col 9)-(line 197,col 56)",
        "(line 198,col 9)-(line 198,col 61)",
        "(line 199,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.timeAndReport(java.lang.String, org.apache.commons.math3.PerfTestUtils.RunTest...)",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * Timing and report (to standard output).\n     * This method calls {@link #timeAndReport(String,int,int,boolean,RunTest[])\n     * timeAndReport(title, 1000, 10000, false, methods)}.\n     *\n     * @param title Title of the test (for the report).\n     * @param methods Codes being timed.\n     * @return for each of the given {@code methods}, a statistics of the\n     * average times (in milliseconds) taken by a single call to the\n     * {@code call} method (i.e. the time taken by each timed block divided\n     * by {@code repeatChunk}).\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 232,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RunTest",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 238,
      "end_line": 257,
      "comment": "\n     * Utility class for storing a test label.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.RunTest(java.lang.String)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n         * @param name Test name.\n         ",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.getName()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n         * @return the name of this test.\n         ",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.PerfTestUtils.RunTest.call()",
      "begin_line": 256,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}