{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/summary/SumOfLogs.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfLogs",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 163,
      "comment": "\n * Returns the sum of the natural logs for this collection of values.\n * \u003cp\u003e\n * Uses {@link java.lang.Math#log(double)} to compute the logs.  Therefore,\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u003c 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the\n * result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and\n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The currently running value\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.SumOfLogs()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Create a SumOfLogs instance\n     ",
      "child_ranges": [
        "(line 61,col 8)-(line 61,col 18)",
        "(line 62,col 8)-(line 62,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.SumOfLogs(org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfLogs} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfLogs} instance to copy\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.increment(double)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.getResult()",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.getN()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.clear()",
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
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.evaluate(double[], int, int)",
      "begin_line": 129,
      "end_line": 139,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link SumOfLogs}.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.copy()",
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
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.copy(org.apache.commons.math.stat.descriptive.summary.SumOfLogs, org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfLogs to copy\n     * @param dest SumOfLogs to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 26)",
        "(line 161,col 9)-(line 161,col 34)"
      ]
    }
  ]
}