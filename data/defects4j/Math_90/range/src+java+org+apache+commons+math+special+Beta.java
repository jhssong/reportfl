{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 208,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Beta.Beta()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, int)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.regularizedBeta(double, double, double, double, int)",
      "begin_line": 121,
      "end_line": 164,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)",
        "(line 126,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-d779123b-8dbe-443d-8ad0-c022e65d999b.getB(int, double)",
      "begin_line": 137,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 139,col 21)-(line 139,col 31)",
        "(line 140,col 21)-(line 140,col 29)",
        "(line 141,col 21)-(line 149,col 21)",
        "(line 150,col 21)-(line 150,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-b1e0d974-fa53-4763-86bc-4e79949161ee.getA(int, double)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 21)-(line 155,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 194,
      "end_line": 207,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 19)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 19)"
      ]
    }
  ]
}