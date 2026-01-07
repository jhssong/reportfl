{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 198,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Beta.Beta()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, int)",
      "begin_line": 87,
      "end_line": 91,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double, int)",
      "begin_line": 116,
      "end_line": 154,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 19)",
        "(line 121,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-17a949b3-be95-4f52-9485-a06eba134046.getB(int, double)",
      "begin_line": 129,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 130,col 21)-(line 130,col 31)",
        "(line 131,col 21)-(line 131,col 29)",
        "(line 132,col 21)-(line 140,col 21)",
        "(line 141,col 21)-(line 141,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-cb80119c-8061-4bab-90e0-015c629a22f8.getA(int, double)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 21)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 184,
      "end_line": 197,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 19)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    }
  ]
}