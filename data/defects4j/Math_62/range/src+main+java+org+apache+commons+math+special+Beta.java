{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 202,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Beta.Beta()",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, int)",
      "begin_line": 88,
      "end_line": 92,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double, int)",
      "begin_line": 117,
      "end_line": 158,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 19)",
        "(line 122,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-53f68fec-a586-4888-ac7a-929668869add.getB(int, double)",
      "begin_line": 131,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 133,col 21)-(line 133,col 31)",
        "(line 134,col 21)-(line 134,col 29)",
        "(line 135,col 21)-(line 143,col 21)",
        "(line 144,col 21)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-a30c7cde-fafd-424c-b06a-6fa286a9f56c.getA(int, double)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 21)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 188,
      "end_line": 201,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 19)",
        "(line 193,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 19)"
      ]
    }
  ]
}