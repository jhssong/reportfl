{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/rank/Min.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Min",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 172,
      "comment": "\n * Returns the minimum of the available values.\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If\n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or\n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "Current value of the statistic "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.Min()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Create a Min instance\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 14)",
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.Min(org.apache.commons.math3.stat.descriptive.rank.Min)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Copy constructor, creates a new {@code Min} identical\n     * to the {@code original}\n     *\n     * @param original the {@code Min} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.increment(double)",
      "begin_line": 76,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.clear()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)",
        "(line 90,col 9)-(line 90,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.getResult()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.getN()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.evaluate(double[], int, int)",
      "begin_line": 130,
      "end_line": 143,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e\n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e,\n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws MathIllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.copy()",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 31)",
        "(line 152,col 9)-(line 152,col 27)",
        "(line 153,col 9)-(line 153,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.rank.Min.copy(org.apache.commons.math3.stat.descriptive.rank.Min, org.apache.commons.math3.stat.descriptive.rank.Min)",
      "begin_line": 164,
      "end_line": 171,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source Min to copy\n     * @param dest Min to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 39)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 168,col 9)-(line 168,col 42)",
        "(line 169,col 9)-(line 169,col 26)",
        "(line 170,col 9)-(line 170,col 34)"
      ]
    }
  ]
}