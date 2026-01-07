{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/stat/descriptive/AbstractUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 38,
      "end_line": 291,
      "comment": "\n * Abstract base class for all implementations of the\n * {@link UnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides a default implementation of \u003ccode\u003eevaluate(double[]),\u003c/code\u003e\n * delegating to \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e in the natural way.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Also includes a \u003ccode\u003etest\u003c/code\u003e method that performs generic parameter\n * validation for the \u003ccode\u003eevaluate\u003c/code\u003e methods.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "storedData"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Stored data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.setData(double[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Set the data array.\n     * \u003cp\u003e\n     * The stored value is a copy of the parameter array, not the array itself\n     * \u003c/p\u003e\n     * @param values data array to store (may be null to remove stored data)\n     * @see #evaluate()\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.getData()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Get a copy of the stored data array.\n     * @return copy of the stored data array (may be null)\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.getDataRef()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Get a reference to the stored data array.\n     * @return reference to the stored data array (may be null)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.setData(double[], int, int)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Set the data array.\n     * @param values data array to store\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @see #evaluate()\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 40)",
        "(line 81,col 9)-(line 81,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Returns the result of evaluating the statistic over the stored data.\n     * \u003cp\u003e\n     * The stored array is the one which was set by previous calls to\n     * \u003c/p\u003e\n     * @return the value of the statistic applied to the stored data\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[])",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 27)",
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.copy()",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int)",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int, boolean)",
      "begin_line": 160,
      "end_line": 185,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * non-negative length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0 unless \u003ccode\u003eallowEmpty\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @param allowEmpty if \u003ccode\u003etrue\u003c/code\u003e then zero length arrays are allowed\n     * @return true if the parameters are valid\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], double[], int, int)",
      "begin_line": 216,
      "end_line": 222,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], double[], int, int)\u003c/code\u003e methods\n     * to verify that the begin and length parameters designate a subarray of positive length\n     * and the weights are all non-negative, non-NaN, finite, and not all zero.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length and the weights array contains legitimate values.\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], double[], int, int, boolean)",
      "begin_line": 255,
      "end_line": 290,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], double[], int, int)\u003c/code\u003e methods\n     * to verify that the begin and length parameters designate a subarray of positive length\n     * and the weights are all non-negative, non-NaN, finite, and not all zero.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * non-negative length and the weights array contains legitimate values.\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0 unless \u003ccode\u003eallowEmpty\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array.\n     * @param weights the weights array.\n     * @param begin index of the first array element to include.\n     * @param length the number of elements to include.\n     * @param allowEmpty if {@code true} than allow zero length arrays to pass.\n     * @return {@code true} if the parameters are valid.\n     * @throws IllegalArgumentException if the indices are invalid or the array\n     * is {@code null}.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 47)",
        "(line 266,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 55)"
      ]
    }
  ]
}