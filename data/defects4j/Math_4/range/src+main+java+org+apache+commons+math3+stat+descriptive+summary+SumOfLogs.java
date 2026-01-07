{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/summary/SumOfLogs.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SumOfLogs",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 171,
      "comment": "\n * Returns the sum of the natural logs for this collection of values.\n * \u003cp\u003e\n * Uses {@link org.apache.commons.math3.util.FastMath#log(double)} to compute the logs.\n * Therefore,\n * \u003cul\u003e\n * \u003cli\u003eIf any of values are \u0026lt; 0, the result is \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf all values are non-negative and less than\n * \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e,  but at least one value is 0, the\n * result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003cli\u003eIf both \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e and\n * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e are among the values, the result is\n * \u003ccode\u003eNaN.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * The currently running value\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.SumOfLogs()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Create a SumOfLogs instance\n     ",
      "child_ranges": [
        "(line 66,col 8)-(line 66,col 18)",
        "(line 67,col 8)-(line 67,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.SumOfLogs(org.apache.commons.math3.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Copy constructor, creates a new {@code SumOfLogs} identical\n     * to the {@code original}\n     *\n     * @param original the {@code SumOfLogs} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.increment(double)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 33)",
        "(line 87,col 9)-(line 87,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.getResult()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.getN()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.clear()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 19)",
        "(line 111,col 9)-(line 111,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.evaluate(double[], int, int)",
      "begin_line": 131,
      "end_line": 142,
      "comment": "\n     * Returns the sum of the natural logs of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null.\u003c/p\u003e\n     * \u003cp\u003e\n     * See {@link SumOfLogs}.\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the sum of the natural logs of the values or 0 if\n     * length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 35)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.copy()",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 43)",
        "(line 151,col 9)-(line 151,col 27)",
        "(line 152,col 9)-(line 152,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.summary.SumOfLogs.copy(org.apache.commons.math3.stat.descriptive.summary.SumOfLogs, org.apache.commons.math3.stat.descriptive.summary.SumOfLogs)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SumOfLogs to copy\n     * @param dest SumOfLogs to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 39)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 167,col 42)",
        "(line 168,col 9)-(line 168,col 26)",
        "(line 169,col 9)-(line 169,col 34)"
      ]
    }
  ]
}