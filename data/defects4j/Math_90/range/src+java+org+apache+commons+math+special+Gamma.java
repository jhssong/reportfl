{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 31,
      "end_line": 264,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Gamma family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "lanczos"
      ],
      "begin_line": 40,
      "end_line": 57,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Gamma.Gamma()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.logGamma(double)",
      "begin_line": 87,
      "end_line": 107,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 19)",
        "(line 90,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 150,
      "end_line": 187,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     * Incomplete Gamma Function\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     * Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 19)",
        "(line 158,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 225,
      "end_line": 263,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"    http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     * Regularized incomplete gamma function: Continued fraction representations  (formula 06.08.10.0003)\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 19)",
        "(line 233,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-c2a6335a-f1f2-4423-8664-290901407001.getA(int, double)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 21)-(line 249,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-7ac9fceb-d810-4394-855a-3e047d74f3c8.getB(int, double)",
      "begin_line": 252,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 254,col 21)-(line 254,col 39)"
      ]
    }
  ]
}