{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/descriptive/rank/Min.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Min",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 124,
      "comment": "\n * Returns the minimum of the available values.\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e, \n * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n * \u003c/ul\u003e \n * \u003cp\u003e\n * \u003cstrong\u003eNote that this implementation is not synchronized.\u003c/strong\u003e If \n * multiple threads access an instance of this class concurrently, and at least\n * one of the threads invokes the \u003ccode\u003eincrement()\u003c/code\u003e or \n * \u003ccode\u003eclear()\u003c/code\u003e method, it must be synchronized externally.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "Number of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "Current value of the statistic "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.Min()",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Create a Min instance\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 14)",
        "(line 55,col 9)-(line 55,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.increment(double)",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#increment(double)\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.clear()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#clear()\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 27)",
        "(line 73,col 9)-(line 73,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.getResult()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getResult()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.getN()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic#getN()\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.rank.Min.evaluate(double[], int, int)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "\n     * Returns the minimum of the entries in the specified portion of\n     * the input array, or \u003ccode\u003eDouble.NaN\u003c/code\u003e if the designated subarray\n     * is empty.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * the array index parameters are not valid.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003eThe result is \u003ccode\u003eNaN\u003c/code\u003e iff all values are \u003ccode\u003eNaN\u003c/code\u003e \n     * (i.e. \u003ccode\u003eNaN\u003c/code\u003e values have no impact on the value of the statistic).\u003c/li\u003e\n     * \u003cli\u003eIf any of the values equals \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e, \n     * the result is \u003ccode\u003eDouble.NEGATIVE_INFINITY.\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e \n     * \n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return the minimum of the values or Double.NaN if length \u003d 0\n     * @throws IllegalArgumentException if the array is null or the array index\n     *  parameters are not valid\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)",
        "(line 114,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    }
  ]
}