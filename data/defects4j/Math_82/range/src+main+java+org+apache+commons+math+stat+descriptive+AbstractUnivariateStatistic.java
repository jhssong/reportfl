{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/stat/descriptive/AbstractUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 34,
      "end_line": 105,
      "comment": "\n * Abstract base class for all implementations of the \n * {@link UnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides a default implementation of \u003ccode\u003eevaluate(double[]),\u003c/code\u003e \n * delegating to \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e in the natural way.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Also includes a \u003ccode\u003etest\u003c/code\u003e method that performs generic parameter\n * validation for the \u003ccode\u003eevaluate\u003c/code\u003e methods.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[])",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 27)",
        "(line 42,col 9)-(line 42,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.copy()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int)",
      "begin_line": 74,
      "end_line": 104,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of \n     * positive length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but \n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    }
  ]
}