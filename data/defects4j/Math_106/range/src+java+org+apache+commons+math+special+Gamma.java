{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 256,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Gamma family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "lanczos"
      ],
      "begin_line": 36,
      "end_line": 53,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Gamma.Gamma()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.logGamma(double)",
      "begin_line": 83,
      "end_line": 103,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param x the value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 19)",
        "(line 86,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 146,
      "end_line": 184,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     * Incomplete Gamma Function\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     * Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 19)",
        "(line 154,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 222,
      "end_line": 255,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     * \n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"    http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     * Regularized incomplete gamma function: Continued fraction representations  (formula 06.08.10.0003)\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete. \n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 19)",
        "(line 230,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-d0dcdc82-4700-4c6f-bfbb-a273065a80ff.getA(int, double)",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 21)-(line 242,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-fea0ce38-32e6-4533-bff3-9928a69bd4ed.getB(int, double)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 21)-(line 246,col 39)"
      ]
    }
  ]
}