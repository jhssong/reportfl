{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/special/Gamma.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Gamma",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 865,
      "comment": "\n * \u003cp\u003e\n * This is a utility class that provides computation methods related to the\n * \u0026Gamma; (Gamma) family of functions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Implementation of {@link #invGamma1pm1(double)},\n * {@link #logGamma1p(double)} and {@link #logGammaSum(double, double)} is\n * based on the algorithms described in\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/22721.23109\"\u003eDidonato and Morris\n * (1986)\u003c/a\u003e, \u003cem\u003eComputation of the Incomplete Gamma Function Ratios and\n *     their Inverse\u003c/em\u003e, TOMS 12(4), 377-393,\u003c/li\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/131766.131776\"\u003eDidonato and Morris\n * (1992)\u003c/a\u003e, \u003cem\u003eAlgorithm 708: Significant Digit Computation of the\n *     Incomplete Beta Function Ratios\u003c/em\u003e, TOMS 18(3), 360-373,\u003c/li\u003e\n * \u003c/ul\u003e\n * and implemented in the\n * \u003ca href\u003d\"http://www.dtic.mil/docs/citations/ADA476840\"\u003eNSWC Library of Mathematical Functions\u003c/a\u003e,\n * available\n * \u003ca href\u003d\"http://www.ualberta.ca/CNS/RESEARCH/Software/NumericalNSWC/site.html\"\u003ehere\u003c/a\u003e.\n * This library is \"approved for public release\", and the\n * \u003ca href\u003d\"http://www.dtic.mil/dtic/pdf/announcements/CopyrightGuidance.pdf\"\u003eCopyright guidance\u003c/a\u003e\n * indicates that unless otherwise stated in the code, all FORTRAN functions in\n * this library are license free. Since no such notice appears in the code these\n * functions can safely be ported to Commons-Math.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "GAMMA"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Euler-Mascheroni_constant\"\u003eEuler-Mascheroni constant\u003c/a\u003e\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS_G"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * The value of the {@code g} constant in the Lanczos approximation, see\n     * {@link #lanczos(double)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "LANCZOS"
      ],
      "begin_line": 73,
      "end_line": 89,
      "comment": " Lanczos coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_2_PI"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Avoid repeated computation of log of 2 PI in logGamma "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_TWO_PI"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The constant value of \u0026radic;(2\u0026pi;). "
    },
    {
      "type": "field",
      "varNames": [
        "C_LIMIT"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " C limit. "
    },
    {
      "type": "field",
      "varNames": [
        "S_LIMIT"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " S limit. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A0"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The constant {@code A0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_A1"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " The constant {@code A1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B1"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The constant {@code B1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B2"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The constant {@code B2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B3"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The constant {@code B3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B4"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The constant {@code B4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B5"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The constant {@code B5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B6"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The constant {@code B6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B7"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The constant {@code B7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_B8"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The constant {@code B8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P0"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The constant {@code P0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P1"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The constant {@code P1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P2"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The constant {@code P2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P3"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The constant {@code P3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P4"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " The constant {@code P4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P5"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The constant {@code P5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_P6"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The constant {@code P6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q1"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " The constant {@code Q1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q2"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " The constant {@code Q2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q3"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " The constant {@code Q3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_Q4"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " The constant {@code Q4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " The constant {@code C} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C0"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " The constant {@code C0} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C1"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " The constant {@code C1} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C2"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The constant {@code C2} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C3"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The constant {@code C3} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C4"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The constant {@code C4} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C5"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The constant {@code C5} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C6"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The constant {@code C6} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C7"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The constant {@code C7} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C8"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The constant {@code C8} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C9"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The constant {@code C9} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C10"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " The constant {@code C10} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C11"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The constant {@code C11} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C12"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The constant {@code C12} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "INV_GAMMA1P_M1_C13"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The constant {@code C13} defined in {@code DGAM1}. "
    },
    {
      "type": "field",
      "varNames": [
        "D0"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * \u003cp\u003e\n     * The d\u003csub\u003e0\u003c/sub\u003e coefficient of the minimax approximation of the Δ\n     * function. This function is defined as follows\n     * \u003c/p\u003e\n     * \u003ccenter\u003eΔ(x) \u003d log Γ(x) - (x - 0.5) log a + a - 0.5 log 2π,\u003c/center\u003e\n     * \u003cp\u003e\n     * The minimax approximation is defined by the following sum\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     *             5\n     *            \u003d\u003d\u003d\u003d\n     *            \\         - 2 n - 1\n     *     Δ(x) \u003d  \u003e    d  x\n     *            /      n\n     *            \u003d\u003d\u003d\u003d\n     *            n \u003d 0\n     * \u003cpre\u003e\n     * \u003cp\u003e\n     * see equations (23) and (25) in Didonato and Morris (1992).\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "D1"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": "\n     * The d\u003csub\u003e1\u003c/sub\u003e coefficent of the minimax approximation of the Δ\n     * function (see {@link #D0}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "D2"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n     * The d\u003csub\u003e2\u003c/sub\u003e coefficent of the minimax approximation of the Δ\n     * function (see {@link #D0}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "D3"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": "\n     * The d\u003csub\u003e3\u003c/sub\u003e coefficent of the minimax approximation of the Δ\n     * function (see {@link #D0}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "D4"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * The d\u003csub\u003e4\u003c/sub\u003e coefficent of the minimax approximation of the Δ\n     * function (see {@link #D0}).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "D5"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n     * The d\u003csub\u003e5\u003c/sub\u003e coefficent of the minimax approximation of the Δ\n     * function (see {@link #D0}).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Gamma.Gamma()",
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma(double)",
      "begin_line": 307,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003e\n     * Returns the value of log\u0026nbsp;\u0026Gamma;(x) for x\u0026nbsp;\u0026gt;\u0026nbsp;0.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * For x \u0026le; 8, the implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAMLN}. For x \u0026gt; 8, the implementation is based on\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/GammaFunction.html\"\u003eGamma\n     *     Function\u003c/a\u003e, equation (28).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003e\n     *     Lanczos Approximation\u003c/a\u003e, equations (1) through (5).\u003c/li\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003ePaul Godfrey, A note on\n     *     the computation of the convergent Lanczos complex Gamma\n     *     approximation\u003c/a\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x Argument.\n     * @return the value of {@code log(Gamma(x))}, {@code Double.NaN} if\n     * {@code x \u003c\u003d 0.0}.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 19)",
        "(line 310,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * @param a Parameter.\n     * @param x Value.\n     * @return the regularized gamma function P(a, x).\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaP(double, double, double, int)",
      "begin_line": 373,
      "end_line": 412,
      "comment": "\n     * Returns the regularized gamma function P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1)\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/IncompleteGammaFunction.html\"\u003e\n     *   Incomplete Gamma Function\u003c/a\u003e, equation (4).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/ConfluentHypergeometricFunctionoftheFirstKind.html\"\u003e\n     *   Confluent Hypergeometric Function of the First Kind\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 19)",
        "(line 379,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @return the regularized gamma function Q(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.regularizedGammaQ(double, double, double, int)",
      "begin_line": 451,
      "end_line": 485,
      "comment": "\n     * Returns the regularized gamma function Q(a, x) \u003d 1 - P(a, x).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedGammaFunction.html\"\u003e\n     *   Regularized Gamma Function\u003c/a\u003e, equation (1).\n     *  \u003c/li\u003e\n     *  \u003cli\u003e\n     *   \u003ca href\u003d\"http://functions.wolfram.com/GammaBetaErf/GammaRegularized/10/0003/\"\u003e\n     *   Regularized incomplete gamma function: Continued fraction representations\n     *   (formula 06.08.10.0003)\u003c/a\u003e\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a the a parameter.\n     * @param x the value.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized gamma function P(a, x)\n     * @throws MaxCountExceededException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 19)",
        "(line 457,col 9)-(line 482,col 9)",
        "(line 484,col 9)-(line 484,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-9732b2f6-3ea8-4db3-9452-e85fe040a871.getA(int, double)",
      "begin_line": 469,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 471,col 21)-(line 471,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.Anonymous-123f38e9-b2a3-4798-92bb-1563d2957baf.getB(int, double)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 476,col 21)-(line 476,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.digamma(double)",
      "begin_line": 508,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eComputes the digamma function of x.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is an independently written implementation of the algorithm described in\n     * Jose Bernardo, Algorithm AS 103: Psi (Digamma) Function, Applied Statistics, 1976.\u003c/p\u003e\n     *\n     * \u003cp\u003eSome of the constants have been changed to increase accuracy at the moderate expense\n     * of run-time.  The result should be accurate to within 10^-8 absolute tolerance for\n     * x \u003e\u003d 10^-5 and within 10^-8 relative tolerance for x \u003e 0.\u003c/p\u003e\n     *\n     * \u003cp\u003ePerformance for large negative values of x will be quite expensive (proportional to\n     * |x|).  Accuracy for negative values of x should be about 10^-8 absolute for results\n     * less than 10^5 and 10^-8 relative for results larger than that.\u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return digamma(x) to within 10-8 relative or absolute error whichever is smaller.\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Digamma_function\"\u003eDigamma\u003c/a\u003e\n     * @see \u003ca href\u003d\"http://www.uv.es/~bernardo/1976AppStatist.pdf\"\u003eBernardo\u0026apos;s original article \u003c/a\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.trigamma(double)",
      "begin_line": 538,
      "end_line": 553,
      "comment": "\n     * Computes the trigamma function of x.\n     * This function is derived by taking the derivative of the implementation\n     * of digamma.\n     *\n     * @param x Argument.\n     * @return trigamma(x) to within 10-8 relative or absolute error whichever is smaller\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Trigamma_function\"\u003eTrigamma\u003c/a\u003e\n     * @see Gamma#digamma(double)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 543,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.lanczos(double)",
      "begin_line": 574,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003e\n     * Returns the Lanczos approximation used to compute the gamma function.\n     * The Lanczos approximation is related to the Gamma function by the\n     * following equation\n     * \u003ccenter\u003e\n     * {@code gamma(x) \u003d sqrt(2 * pi) / x * (x + g + 0.5) ^ (x + 0.5)\n     *                   * exp(-x - g - 0.5) * lanczos(x)},\n     * \u003c/center\u003e\n     * where {@code g} is the Lanczos constant.\n     * \u003c/p\u003e\n     *\n     * @param x Argument.\n     * @return The Lanczos approximation.\n     * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LanczosApproximation.html\"\u003eLanczos Approximation\u003c/a\u003e\n     * equations (1) through (5), and Paul Godfrey\u0027s\n     * \u003ca href\u003d\"http://my.fit.edu/~gabdo/gamma.txt\"\u003eNote on the computation\n     * of the convergent Lanczos complex Gamma approximation\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 25)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.invGamma1pm1(double)",
      "begin_line": 593,
      "end_line": 673,
      "comment": "\n     * Returns the value of 1 / \u0026Gamma;(1 + x) - 1 for -0\u0026#46;5 \u0026le; x \u0026le;\n     * 1\u0026#46;5. This implementation is based on the double precision\n     * implementation in the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e,\n     * {@code DGAM1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code 1.0 / Gamma(1.0 + x) - 1.0}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 25)",
        "(line 603,col 9)-(line 603,col 56)",
        "(line 604,col 9)-(line 670,col 9)",
        "(line 672,col 9)-(line 672,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGamma1p(double)",
      "begin_line": 685,
      "end_line": 696,
      "comment": "\n     * Returns the value of log \u0026Gamma;(1 + x) for -0\u0026#46;5 \u0026le; x \u0026le; 1\u0026#46;5.\n     * This implementation is based on the double precision implementation in\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code DGMLN1}.\n     *\n     * @param x Argument.\n     * @return The value of {@code log(Gamma(1 + x))}.\n     * @throws NumberIsTooSmallException if {@code x \u003c -0.5}.\n     * @throws NumberIsTooLargeException if {@code x \u003e 1.5}.\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.gamma(double)",
      "begin_line": 707,
      "end_line": 767,
      "comment": "\n     * Returns the value of \u0026Gamma;(x). The present implementation is based on\n     * the double precision implementation in the\n     * \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code DGAMMA}.\n     *\n     * @param x the argument\n     * @return the value of {@code Gamma(x)}\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 25)",
        "(line 712,col 9)-(line 712,col 44)",
        "(line 713,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGammaSum(double, double)",
      "begin_line": 780,
      "end_line": 798,
      "comment": "\n     * Returns the value of log Γ(a + b) for 1 ≤ a, b ≤ 2. The present\n     * implementation is based on the double precision implementation in the\n     * \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code GSUMLN}.\n     *\n     * @param a First argument.\n     * @param b Second argument.\n     * @return the value of {@code log(Gamma(a + b))}.\n     * @throws OutOfRangeException if {@code a} or {@code b} is lower than\n     * {@code 1.0} or greater than {@code 2.0}.\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 37)",
        "(line 791,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Gamma.logGammaMinusLogGammaSum(double, double)",
      "begin_line": 810,
      "end_line": 864,
      "comment": "\n     * Returns the value of log[Γ(b) / Γ(a + b)] for a ≥ 0 and b ≥ 8. The\n     * present implementation is based on the double precision implementation in\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e, {@code ALGDIV}.\n     *\n     * @param a First argument.\n     * @param b Second argument.\n     * @return the value of {@code log(Gamma(b) / Gamma(a + b))}.\n     * @throws NumberIsTooSmallException if {@code a \u003c 0.0} or {@code b \u003c 8.0}.\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 824,col 9)-(line 824,col 23)",
        "(line 825,col 9)-(line 825,col 23)",
        "(line 826,col 9)-(line 826,col 23)",
        "(line 827,col 9)-(line 837,col 9)",
        "(line 841,col 9)-(line 841,col 32)",
        "(line 842,col 9)-(line 842,col 41)",
        "(line 843,col 9)-(line 843,col 46)",
        "(line 844,col 9)-(line 844,col 46)",
        "(line 845,col 9)-(line 845,col 46)",
        "(line 846,col 9)-(line 846,col 47)",
        "(line 850,col 9)-(line 850,col 35)",
        "(line 851,col 9)-(line 851,col 35)",
        "(line 852,col 9)-(line 852,col 28)",
        "(line 853,col 9)-(line 853,col 28)",
        "(line 854,col 9)-(line 854,col 28)",
        "(line 855,col 9)-(line 855,col 28)",
        "(line 856,col 9)-(line 856,col 28)",
        "(line 857,col 9)-(line 857,col 23)",
        "(line 858,col 9)-(line 858,col 19)",
        "(line 860,col 9)-(line 860,col 51)",
        "(line 861,col 9)-(line 861,col 53)",
        "(line 863,col 9)-(line 863,col 50)"
      ]
    }
  ]
}