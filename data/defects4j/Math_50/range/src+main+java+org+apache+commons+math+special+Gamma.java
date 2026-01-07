{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 328,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Gamma family of functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "GAMMA"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Euler-Mascheroni_constant\"\u003eEuler-Mascheroni constant\u003c/a\u003e\n     * @since 2.0\n     "
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
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 38,
      "end_line": 54,
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
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " S limit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Gamma.Gamma()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.logGamma(double)",
      "begin_line": 85,
      "end_line": 105,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 19)",
        "(line 88,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a Parameter.\n     * @param x Value.\n     * @return the regularized gamma function P(a, x).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 147,
      "end_line": 186,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1)\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     *   Incomplete Gamma Function\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     *   Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 19)",
        "(line 153,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 225,
      "end_line": 259,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     *   Regularized incomplete gamma function: Continued fraction representations\n     *   (formula 06.08.10.0003)\u003c/a\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 19)",
        "(line 231,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-000a4154-2e46-4a9a-b1e9-e8e839c39b0a.getA(int, double)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 21)-(line 245,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-4cdda6b9-cfbd-455c-ab83-0ff9ae5828ea.getB(int, double)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 250,col 21)-(line 250,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.digamma(double)",
      "begin_line": 282,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003eDigamma\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003eBernardo\u0026apos;s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.trigamma(double)",
      "begin_line": 312,
      "end_line": 327,
      "comment": "\n     * Computes the trigamma function of x.\n     * This function is derived by taking the derivative of the implementation\n     * of digamma.\n     *\n     * @param x Argument.\n     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003eTrigamma\u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 45)"
      ]
    }
  ]
}