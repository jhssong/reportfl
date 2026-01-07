{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/stat/descriptive/summary/SumOfLogs.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfLogs",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 164,
      "comment": "\n * Returns the sum of the natural logs for this collection of values.\n * \u003cp\u003e\n * Uses {@link java.lang.Math#log(double)} to compute the logs.  Therefore,\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u003c 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the\n * result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and\n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * The currently running value\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.SumOfLogs()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a SumOfLogs instance\n     ",
      "child_ranges": [
        "(line 62,col 8)-(line 62,col 18)",
        "(line 63,col 8)-(line 63,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.SumOfLogs(org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfLogs} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfLogs} instance to copy\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.increment(double)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 33)",
        "(line 82,col 9)-(line 82,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.getResult()",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.getN()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.clear()",
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 19)",
        "(line 110,col 9)-(line 110,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.evaluate(double[], int, int)",
      "begin_line": 130,
      "end_line": 140,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link SumOfLogs}.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or Double.NaN if\n     * length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 35)",
        "(line 133,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.copy()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.summary.SumOfLogs.copy(org.apache.commons.math.stat.descriptive.summary.SumOfLogs, org.apache.commons.math.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfLogs to copy\n     * @param dest SumOfLogs to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 26)",
        "(line 162,col 9)-(line 162,col 34)"
      ]
    }
  ]
}