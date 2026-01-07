{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 704,
      "comment": "\n * \u003cp\u003e\n * This is a utility class that provides computation methods related to the\n * \u0026Gamma; (Gamma) family of functions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Implementation of {@link #invGamma1pm1(double)} and\n * {@link #logGamma1p(double)} is based on the algorithms described in\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/22721.23109\"\u003eDidonato and Morris\n * (1986)\u003c/a\u003e, \u003cem\u003eComputation of the Incomplete Gamma Function Ratios and\n *     their Inverse\u003c/em\u003e, TOMS 12(4), 377-393,\u003c/li\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/131766.131776\"\u003eDidonato and Morris\n * (1992)\u003c/a\u003e, \u003cem\u003eAlgorithm 708: Significant Digit Computation of the\n *     Incomplete Beta Function Ratios\u003c/em\u003e, TOMS 18(3), 360-373,\u003c/li\u003e\n * \u003c/ul\u003e\n * and implemented in the\n * \u003ca href\u003d\"http://www.dtic.mil/docs/citations/ADA476840\"\u003eNSWC Library of Mathematical Functions\u003c/a\u003e,\n * available\n * \u003ca href\u003d\"http://www.ualberta.ca/CNS/RESEARCH/Software/NumericalNSWC/site.html\"\u003ehere\u003c/a\u003e.\n * This library is \"approved for public release\", and the\n * \u003ca href\u003d\"http://www.dtic.mil/dtic/pdf/announcements/CopyrightGuidance.pdf\"\u003eCopyright guidance\u003c/a\u003e\n * indicates that unless otherwise stated in the code, all FORTRAN functions in\n * this library are license free. Since no such notice appears in the code these\n * functions can safely be ported to Commons-Math.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "GAMMA"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Euler-Mascheroni_constant\"\u003eEuler-Mascheroni constant\u003c/a\u003e\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS_G"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The value of the {@code g} constant in the Lanczos approximation, see\n     * {@link #lanczos(double)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 71,
      "end_line": 87,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TWO_PI"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The constant value of \u0026radic;(2\u0026pi;). "
    },
    {
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " S limit. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A0"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The constant {@code A0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A1"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The constant {@code A1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B1"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The constant {@code B1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B2"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The constant {@code B2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B3"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The constant {@code B3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B4"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The constant {@code B4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B5"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The constant {@code B5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B6"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The constant {@code B6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B7"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The constant {@code B7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B8"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The constant {@code B8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P0"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " The constant {@code P0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P1"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " The constant {@code P1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P2"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " The constant {@code P2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P3"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The constant {@code P3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P4"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The constant {@code P4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P5"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The constant {@code P5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P6"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The constant {@code P6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q1"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The constant {@code Q1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q2"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The constant {@code Q2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q3"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The constant {@code Q3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q4"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The constant {@code Q4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " The constant {@code C} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C0"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The constant {@code C0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C1"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The constant {@code C1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C2"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The constant {@code C2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C3"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " The constant {@code C3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C4"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " The constant {@code C4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C5"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " The constant {@code C5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C6"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " The constant {@code C6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C7"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " The constant {@code C7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C8"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " The constant {@code C8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C9"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " The constant {@code C9} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C10"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " The constant {@code C10} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C11"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " The constant {@code C11} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C12"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " The constant {@code C12} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C13"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " The constant {@code C13} defined in {@code DGAM1}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Gamma.Gamma()",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma(double)",
      "begin_line": 243,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003e\n     * Returns the value of log\u0026nbsp;\u0026Gamma;(x) for x\u0026nbsp;\u0026gt;\u0026nbsp;0.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For x \u0026le; 8, the implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAMLN}. For x \u0026gt; 8, the implementation is based on\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003eGamma\n     *     Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     *     Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     *     the computation of the convergent Lanczos complex Gamma\n     *     approximation\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Argument.\n     * @return the value of {@code log(Gamma(x))}, {@code Double.NaN} if\n     * {@code x \u003c\u003d 0.0}.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 19)",
        "(line 246,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a Parameter.\n     * @param x Value.\n     * @return the regularized gamma function P(a, x).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 309,
      "end_line": 348,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1)\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     *   Incomplete Gamma Function\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     *   Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 19)",
        "(line 315,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 387,
      "end_line": 421,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     *   Regularized incomplete gamma function: Continued fraction representations\n     *   (formula 06.08.10.0003)\u003c/a\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 19)",
        "(line 393,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 420,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-73043520-26ad-4ff2-b690-32c7b558e2b2.getA(int, double)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 21)-(line 407,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-2773c455-638b-48c5-9f18-e96b5b761c0c.getB(int, double)",
      "begin_line": 410,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 412,col 21)-(line 412,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.digamma(double)",
      "begin_line": 444,
      "end_line": 461,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003eDigamma\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003eBernardo\u0026apos;s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.trigamma(double)",
      "begin_line": 474,
      "end_line": 489,
      "comment": "\n     * Computes the trigamma function of x.\n     * This function is derived by taking the derivative of the implementation\n     * of digamma.\n     *\n     * @param x Argument.\n     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003eTrigamma\u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 488,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.lanczos(double)",
      "begin_line": 510,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003e\n     * Returns the Lanczos approximation used to compute the gamma function.\n     * The Lanczos approximation is related to the Gamma function by the\n     * following equation\n     * \u003ccenter\u003e\n     * {@code gamma(x) \u003d sqrt(2 * pi) / x * (x + g + 0.5) ^ (x + 0.5)\n     *                   * exp(-x - g - 0.5) * lanczos(x)},\n     * \u003c/center\u003e\n     * where {@code g} is a constant, returned by {@link #getLanczosG()}.\n     * \u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return The Lanczos approximation.\n     * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003eLanczos Approximation\u003c/a\u003e\n     * equations (1) through (5), and Paul Godfrey\u0027s\n     * \u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003eNote on the computation\n     * of the convergent Lanczos complex Gamma approximation\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 25)",
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.invGamma1pm1(double)",
      "begin_line": 529,
      "end_line": 609,
      "comment": "\n     * Returns the value of 1 / \u0026Gamma;(1 + x) - 1 for -0\u0026#46;5 \u0026le; x \u0026le;\n     * 1\u0026#46;5. This implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAM1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code 1.0 / Gamma(1.0 + x) - 1.0}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 538,col 25)",
        "(line 539,col 9)-(line 539,col 56)",
        "(line 540,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma1p(double)",
      "begin_line": 621,
      "end_line": 632,
      "comment": "\n     * Returns the value of log \u0026Gamma;(1 + x) for -0\u0026#46;5 \u0026le; x \u0026le; 1\u0026#46;5.\n     * This implementation is based on the double precision implementation in\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code DGMLN1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code log(Gamma(1 + x))}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}.\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}.\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.gamma(double)",
      "begin_line": 643,
      "end_line": 703,
      "comment": "\n     * Returns the value of \u0026Gamma;(x). The present implementation is based on\n     * the double precision implementation in the\n     * \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code DGAMMA}.\n     *\n     * @param x the argument\n     * @return the value of {@code Gamma(x)}\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 25)",
        "(line 648,col 9)-(line 648,col 44)",
        "(line 649,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 19)"
      ]
    }
  ]
}