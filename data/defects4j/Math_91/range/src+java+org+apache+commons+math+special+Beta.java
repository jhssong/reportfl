{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 206,
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
      "end_line": 162,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized beta function I(x, a, b)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 19)",
        "(line 126,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
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
      "signature": "org.apache.commons.math.special.Beta.Anonymous-031d7433-74d8-464a-a593-9cd1dc13325c.getB(int, double)",
      "begin_line": 137,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 138,col 21)-(line 138,col 31)",
        "(line 139,col 21)-(line 139,col 29)",
        "(line 140,col 21)-(line 148,col 21)",
        "(line 149,col 21)-(line 149,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.Anonymous-0d664b1c-a835-4b46-9775-5706d17e2674.getA(int, double)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 21)-(line 153,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 192,
      "end_line": 205,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param b the b parameter.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return log(B(a, b))\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 19)",
        "(line 197,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    }
  ]
}