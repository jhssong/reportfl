{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 339,
      "comment": "\n * This is a utility class that provides computation methods related to the\n * Gamma family of functions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "GAMMA"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Euler-Mascheroni_constant\"\u003eEuler-Mascheroni constant\u003c/a\u003e\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 42,
      "end_line": 59,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 62,
      "end_line": 62,
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
      "begin_line": 69,
      "end_line": 69,
      "comment": " S limit. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.special.Gamma.Gamma()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.logGamma(double)",
      "begin_line": 95,
      "end_line": 115,
      "comment": "\n     * Returns the natural logarithm of the gamma function \u0026#915;(x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003e\n     * Gamma Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     * Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     * the computation of the convergent Lanczos complex Gamma approximation\n     * \u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @return log(\u0026#915;(x))\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 19)",
        "(line 98,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 158,
      "end_line": 197,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     * Incomplete Gamma Function\u003c/a\u003e, equation (4).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     * Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 19)",
        "(line 166,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 207,
      "end_line": 211,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 235,
      "end_line": 271,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     * Regularized Gamma Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     * Regularized incomplete gamma function: Continued fraction representations  (formula 06.08.10.0003)\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     *                series is less than epsilon the approximation ceases\n     *                to calculate further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 19)",
        "(line 243,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-661db3c3-d92b-4275-b527-8c7e58521b3f.getA(int, double)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 21)-(line 257,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.Anonymous-dfe3a155-f97e-4853-b2a0-32063fa943ce.getB(int, double)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 21)-(line 262,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.digamma(double)",
      "begin_line": 294,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x  the argument\n     * @return   digamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003e Digamma at wikipedia \u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003e Bernardo\u0027s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 299,col 9)",
        "(line 301,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.Gamma.trigamma(double)",
      "begin_line": 323,
      "end_line": 338,
      "comment": "\n     * \u003cp\u003eComputes the trigamma function of x.  This function is derived by taking the derivative of\n     * the implementation of digamma.\u003c/p\u003e\n     *\n     * @param x  the argument\n     * @return   trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003e Trigamma at wikipedia \u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 45)"
      ]
    }
  ]
}