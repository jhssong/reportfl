{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 711,
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
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The value of the {@code g} constant in the Lanczos approximation, see\n     * {@link #lanczos(double)}.\n     * @since 3.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 72,
      "end_line": 88,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TWO_PI"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The constant value of \u0026radic;(2\u0026pi;). "
    },
    {
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " S limit. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A0"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The constant {@code A0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A1"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The constant {@code A1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B1"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The constant {@code B1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B2"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The constant {@code B2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B3"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The constant {@code B3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B4"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The constant {@code B4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B5"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The constant {@code B5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B6"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The constant {@code B6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B7"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The constant {@code B7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B8"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " The constant {@code B8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P0"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The constant {@code P0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P1"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The constant {@code P1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P2"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The constant {@code P2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P3"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The constant {@code P3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P4"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The constant {@code P4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P5"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The constant {@code P5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P6"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " The constant {@code P6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q1"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The constant {@code Q1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q2"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The constant {@code Q2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q3"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " The constant {@code Q3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q4"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " The constant {@code Q4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " The constant {@code C} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C0"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " The constant {@code C0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C1"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " The constant {@code C1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C2"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " The constant {@code C2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C3"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " The constant {@code C3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C4"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " The constant {@code C4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C5"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " The constant {@code C5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C6"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " The constant {@code C6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C7"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " The constant {@code C7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C8"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " The constant {@code C8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C9"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " The constant {@code C9} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C10"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " The constant {@code C10} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C11"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " The constant {@code C11} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C12"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " The constant {@code C12} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C13"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " The constant {@code C13} defined in {@code DGAM1}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Gamma.Gamma()",
      "begin_line": 219,
      "end_line": 219,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma(double)",
      "begin_line": 244,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003e\n     * Returns the value of log\u0026nbsp;\u0026Gamma;(x) for x\u0026nbsp;\u0026gt;\u0026nbsp;0.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For x \u0026le; 8, the implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAMLN}. For x \u0026gt; 8, the implementation is based on\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003eGamma\n     *     Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     *     Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     *     the computation of the convergent Lanczos complex Gamma\n     *     approximation\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Argument.\n     * @return the value of {@code log(Gamma(x))}, {@code Double.NaN} if\n     * {@code x \u003c\u003d 0.0}.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 19)",
        "(line 247,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a Parameter.\n     * @param x Value.\n     * @return the regularized gamma function P(a, x).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 310,
      "end_line": 349,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1)\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     *   Incomplete Gamma Function\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     *   Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 19)",
        "(line 316,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 348,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 388,
      "end_line": 422,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     *   Regularized incomplete gamma function: Continued fraction representations\n     *   (formula 06.08.10.0003)\u003c/a\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 19)",
        "(line 394,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-2f31ff12-7f12-425a-99a4-361e24f326ef.getA(int, double)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 408,col 21)-(line 408,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-933c317e-15d1-470f-8ef5-87173556ac78.getB(int, double)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 413,col 21)-(line 413,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.digamma(double)",
      "begin_line": 445,
      "end_line": 462,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003eDigamma\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003eBernardo\u0026apos;s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.trigamma(double)",
      "begin_line": 475,
      "end_line": 490,
      "comment": "\n     * Computes the trigamma function of x.\n     * This function is derived by taking the derivative of the implementation\n     * of digamma.\n     *\n     * @param x Argument.\n     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003eTrigamma\u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.lanczos(double)",
      "begin_line": 512,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003e\n     * Returns the Lanczos approximation used to compute the gamma function.\n     * The Lanczos approximation is related to the Gamma function by the\n     * following equation\n     * \u003ccenter\u003e\n     * {@code gamma(x) \u003d sqrt(2 * pi) / x * (x + g + 0.5) ^ (x + 0.5)\n     *                   * exp(-x - g - 0.5) * lanczos(x)},\n     * \u003c/center\u003e\n     * where {@code g} is the Lanczos constant.\n     * \u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return The Lanczos approximation.\n     * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003eLanczos Approximation\u003c/a\u003e\n     * equations (1) through (5), and Paul Godfrey\u0027s\n     * \u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003eNote on the computation\n     * of the convergent Lanczos complex Gamma approximation\u003c/a\u003e\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 25)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.invGamma1pm1(double)",
      "begin_line": 532,
      "end_line": 612,
      "comment": "\n     * Returns the value of 1 / \u0026Gamma;(1 + x) - 1 for -0\u0026#46;5 \u0026le; x \u0026le;\n     * 1\u0026#46;5. This implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAM1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code 1.0 / Gamma(1.0 + x) - 1.0}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 541,col 9)-(line 541,col 25)",
        "(line 542,col 9)-(line 542,col 56)",
        "(line 543,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 611,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma1p(double)",
      "begin_line": 625,
      "end_line": 636,
      "comment": "\n     * Returns the value of log \u0026Gamma;(1 + x) for -0\u0026#46;5 \u0026le; x \u0026le; 1\u0026#46;5.\n     * This implementation is based on the double precision implementation in\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code DGMLN1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code log(Gamma(1 + x))}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}.\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 635,col 9)-(line 635,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.gamma(double)",
      "begin_line": 648,
      "end_line": 710,
      "comment": "\n     * Returns the value of Γ(x). Based on the \u003cem\u003eNSWC Library of\n     * Mathematics Subroutines\u003c/em\u003e double precision implementation,\n     * {@code DGAMMA}.\n     *\n     * @param x Argument.\n     * @return the value of {@code Gamma(x)}.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 25)",
        "(line 655,col 9)-(line 655,col 44)",
        "(line 656,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 19)"
      ]
    }
  ]
}