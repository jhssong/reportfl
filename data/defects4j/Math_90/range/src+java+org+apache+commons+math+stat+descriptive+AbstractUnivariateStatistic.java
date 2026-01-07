{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/stat/descriptive/AbstractUnivariateStatistic.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUnivariateStatistic",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 106,
      "comment": "\n * Abstract base class for all implementations of the \n * {@link UnivariateStatistic} interface.\n * \u003cp\u003e\n * Provides a default implementation of \u003ccode\u003eevaluate(double[]),\u003c/code\u003e \n * delegating to \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e in the natural way.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Also includes a \u003ccode\u003etest\u003c/code\u003e method that performs generic parameter\n * validation for the \u003ccode\u003eevaluate\u003c/code\u003e methods.\u003c/p\u003e\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[])",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)",
        "(line 45,col 9)-(line 45,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.evaluate(double[], int, int)",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.copy()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic.test(double[], int, int)",
      "begin_line": 77,
      "end_line": 105,
      "comment": "\n     * This method is used by \u003ccode\u003eevaluate(double[], int, int)\u003c/code\u003e methods\n     * to verify that the input parameters designate a subarray of positive length.\n     * \u003cp\u003e\n     * \u003cul\u003e\n     * \u003cli\u003ereturns \u003ccode\u003etrue\u003c/code\u003e iff the parameters designate a subarray of \n     * positive length\u003c/li\u003e\n     * \u003cli\u003ethrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the array is null or\n     * or the indices are invalid\u003c/li\u003e\n     * \u003cli\u003ereturns \u003ccode\u003efalse\u003c/li\u003e if the array is non-null, but \n     * \u003ccode\u003elength\u003c/code\u003e is 0.\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param values the input array\n     * @param begin index of the first array element to include\n     * @param length the number of elements to include\n     * @return true if the parameters are valid and designate a subarray of positive length\n     * @throws IllegalArgumentException if the indices are invalid or the array is null\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    }
  ]
}