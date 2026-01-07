{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/stat/descriptive/summary/SumOfLogs.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfLogs",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 167,
      "comment": "\n * Returns the sum of the natural logs for this collection of values.\n * \u003cp\u003e\n * Uses {@link org.apache.commons.math3.util.FastMath#log(double)} to compute the logs.\n * Therefore,\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u0026lt; 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the\n * result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and\n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The currently running value\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.SumOfLogs()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Create a SumOfLogs instance\n     ",
      "child_ranges": [
        "(line 65,col 8)-(line 65,col 18)",
        "(line 66,col 8)-(line 66,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.SumOfLogs(org.apache.commons.math3.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfLogs} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfLogs} instance to copy\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.increment(double)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.getResult()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.getN()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.clear()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 19)",
        "(line 109,col 9)-(line 109,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.evaluate(double[], int, int)",
      "begin_line": 129,
      "end_line": 139,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link SumOfLogs}.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or 0 if\n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.copy()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 43)",
        "(line 147,col 9)-(line 147,col 27)",
        "(line 148,col 9)-(line 148,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.copy(org.apache.commons.math3.stat.descriptive.summary.SumOfLogs, org.apache.commons.math3.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfLogs to copy\n     * @param dest SumOfLogs to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 37)",
        "(line 163,col 9)-(line 163,col 42)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 34)"
      ]
    }
  ]
}