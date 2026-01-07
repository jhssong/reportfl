{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/AbstractUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 39,
      "end_line": 314,
      "comment": "\n * Abstract base class for all implementations of the\n * {@link UnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides a default implementation of \u003ccode\u003eevaluate(double[]),\u003c/code\u003e\n * delegating to \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e in the natural way.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Also includes a \u003ccode\u003etest\u003c/code\u003e method that performs generic parameter\n * validation for the \u003ccode\u003eevaluate\u003c/code\u003e methods.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "storedData"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Stored data. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.setData(double[])",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Set the data array.\n     * \u003cp\u003e\n     * The stored value is a copy of the parameter array, not the array itself.\n     * \u003c/p\u003e\n     * @param values data array to store (may be null to remove stored data)\n     * @see #evaluate()\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.getData()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Get a copy of the stored data array.\n     * @return copy of the stored data array (may be null)\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.getDataRef()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Get a reference to the stored data array.\n     * @return reference to the stored data array (may be null)\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.setData(double[], int, int)",
      "begin_line": 83,
      "end_line": 103,
      "comment": "\n     * Set the data array.  The input array is copied, not referenced.\n     *\n     * @param values data array to store\n     * @param begin the index of the first element to include\n     * @param length the number of elements to include\n     * @throws MathIllegalArgumentException if values is null or the indices\n     * are not valid\n     * @see #evaluate()\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 40)",
        "(line 102,col 9)-(line 102,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.evaluate()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Returns the result of evaluating the statistic over the stored data.\n     * \u003cp\u003e\n     * The stored array is the one which was set by previous calls to {@link #setData(double[])}.\n     * \u003c/p\u003e\n     * @return the value of the statistic applied to the stored data\n     * @throws MathIllegalArgumentException if the stored data array is null\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[])",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 27)",
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 128,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.copy()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int)",
      "begin_line": 155,
      "end_line": 160,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws MathIllegalArgumentException if the indices are invalid or the array is null\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int, boolean)",
      "begin_line": 183,
      "end_line": 209,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * non-negative length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0 unless \u003ccode\u003eallowEmpty\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @param allowEmpty if \u003ccode\u003etrue\u003c/code\u003e then zero length arrays are allowed\n     * @return true if the parameters are valid\n     * @throws MathIllegalArgumentException if the indices are invalid or the array is null\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.test(double[], double[], int, int)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], double[], int, int)\u003c/code\u003e methods\n     * to verify that the begin and length parameters designate a subarray of positive length\n     * and the weights are all non-negative, non-NaN, finite, and not all zero.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * positive length and the weights array contains legitimate values.\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param weights the weights array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws MathIllegalArgumentException if the indices are invalid or the array is null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic.test(double[], double[], int, int, boolean)",
      "begin_line": 281,
      "end_line": 313,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], double[], int, int)\u003c/code\u003e methods\n     * to verify that the begin and length parameters designate a subarray of positive length\n     * and the weights are all non-negative, non-NaN, finite, and not all zero.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of\n     * non-negative length and the weights array contains legitimate values.\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e if any of the following are true:\n     * \u003cul\u003e\u003cli\u003ethe values array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array is null\u003c/li\u003e\n     *     \u003cli\u003ethe weights array does not have the same length as the values array\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more infinite values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains one or more NaN values\u003c/li\u003e\n     *     \u003cli\u003ethe weights array contains negative values\u003c/li\u003e\n     *     \u003cli\u003ethe start and length arguments do not determine a valid array\u003c/li\u003e\u003c/ul\u003e\n     * \u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but\n     * \u003ccode\u003elength\u003c/code\u003e is 0 unless \u003ccode\u003eallowEmpty\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array.\n     * @param weights the weights array.\n     * @param begin index of the first array element to include.\n     * @param length the number of elements to include.\n     * @param allowEmpty if {@code true} than allow zero length arrays to pass.\n     * @return {@code true} if the parameters are valid.\n     * @throws NullArgumentException if either of the arrays are null\n     * @throws MathIllegalArgumentException if the array indices are not valid,\n     * the weights array contains NaN, infinite or negative elements, or there\n     * are no positive weights.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 47)",
        "(line 293,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 55)"
      ]
    }
  ]
}