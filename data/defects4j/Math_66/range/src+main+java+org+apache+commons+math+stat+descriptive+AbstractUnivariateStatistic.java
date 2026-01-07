{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/stat/descriptive/AbstractUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 35,
      "end_line": 177,
      "comment": "\n * Abstract base class for all implementations of the\n * {@link UnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides a default implementation of \u003ccode\u003eevaluate(double[]),\u003c/code\u003e\n * delegating to \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e in the natural way.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Also includes a \u003ccode\u003etest\u003c/code\u003e method that performs generic parameter\n * validation for the \u003ccode\u003eevaluate\u003c/code\u003e methods.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[])",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 27)",
        "(line 43,col 9)-(line 43,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.copy()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int)",
      "begin_line": 75,
      "end_line": 105,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], double[], int, int)",
      "begin_line": 136,
      "end_line": 176,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], double[], int, int)\u003c/code\u003e methods\n     * to verify that the begin and length parameters designate a subarray of positive length\n     * and the weights are all non-negative, non-NaN, finite, and not all zero.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length and the weights array contains legitimate values.\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 47)",
        "(line 152,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 43)"
      ]
    }
  ]
}