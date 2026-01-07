{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 207,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Beta.Beta()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x Value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @return the regularized beta function I(x, a, b).\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x Value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, int)",
      "begin_line": 85,
      "end_line": 89,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * @param x the value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double, int)",
      "begin_line": 115,
      "end_line": 160,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 19)",
        "(line 120,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-2726bb55-c2eb-485b-9495-aa31bec1432a.getB(int, double)",
      "begin_line": 133,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 135,col 21)-(line 135,col 31)",
        "(line 136,col 21)-(line 136,col 29)",
        "(line 137,col 21)-(line 145,col 21)",
        "(line 146,col 21)-(line 146,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-4a11a2cb-2240-4dee-b566-cd8a3551e1cd.getA(int, double)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 21)-(line 151,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @return log(B(a, b)).\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 190,
      "end_line": 206,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return log(B(a, b)).\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)",
        "(line 195,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    }
  ]
}