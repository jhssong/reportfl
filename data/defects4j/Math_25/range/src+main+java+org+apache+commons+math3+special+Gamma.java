{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 356,
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
        "LANCZOS_G"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * The value of the {@code g} constant in the Lanczos approximation, see\n     * {@link #lanczos(double)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 45,
      "end_line": 61,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " S limit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Gamma.Gamma()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma(double)",
      "begin_line": 92,
      "end_line": 106,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 19)",
        "(line 95,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a Parameter.\n     * @param x Value.\n     * @return the regularized gamma function P(a, x).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 148,
      "end_line": 187,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1)\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     *   Incomplete Gamma Function\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     *   Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 19)",
        "(line 154,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 226,
      "end_line": 260,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     *   Regularized incomplete gamma function: Continued fraction representations\n     *   (formula 06.08.10.0003)\u003c/a\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 19)",
        "(line 232,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-46079e81-1aff-47ea-917d-a32949c1f1a9.getA(int, double)",
      "begin_line": 244,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 246,col 21)-(line 246,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-ad4220fa-345e-40e3-a522-a816dd679f58.getB(int, double)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 251,col 21)-(line 251,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.digamma(double)",
      "begin_line": 283,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003eDigamma\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003eBernardo\u0026apos;s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.trigamma(double)",
      "begin_line": 313,
      "end_line": 328,
      "comment": "\n     * Computes the trigamma function of x.\n     * This function is derived by taking the derivative of the implementation\n     * of digamma.\n     *\n     * @param x Argument.\n     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003eTrigamma\u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.lanczos(double)",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003e\n     * Returns the Lanczos approximation used to compute the gamma function.\n     * The Lanczos approximation is related to the Gamma function by the\n     * following equation\n     * \u003ccenter\u003e\n     * {@code gamma(x) \u003d sqrt(2 * pi) / x * (x + g + 0.5) ^ (x + 0.5)\n     *                   * exp(-x - g - 0.5) * lanczos(x)},\n     * \u003c/center\u003e\n     * where {@code g} is a constant, returned by {@link #getLanczosG()}.\n     * \u003c/p\u003e\n     *\n     * @param x the argument\n     * @return the Lanczos approximation\n     * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003eLanczos Approximation\u003c/a\u003e\n     * equations (1) through (5), and Paul Godfrey\u0027s\n     * \u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003eNote on the computation\n     * of the convergent Lanczos complex Gamma approximation\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 25)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 32)"
      ]
    }
  ]
}