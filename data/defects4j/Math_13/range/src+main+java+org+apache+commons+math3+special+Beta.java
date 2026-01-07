{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 511,
      "comment": "\n * \u003cp\u003e\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Implementation of {@link #logBeta(double, double)} is based on the\n * algorithms described in\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/22721.23109\"\u003eDidonato and Morris\n *     (1986)\u003c/a\u003e, \u003cem\u003eComputation of the Incomplete Gamma Function Ratios\n *     and their Inverse\u003c/em\u003e, TOMS 12(4), 377-393,\u003c/li\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/131766.131776\"\u003eDidonato and Morris\n *     (1992)\u003c/a\u003e, \u003cem\u003eAlgorithm 708: Significant Digit Computation of the\n *     Incomplete Beta Function Ratios\u003c/em\u003e, TOMS 18(3), 360-373,\u003c/li\u003e\n * \u003c/ul\u003e\n * and implemented in the\n * \u003ca href\u003d\"http://www.dtic.mil/docs/citations/ADA476840\"\u003eNSWC Library of Mathematical Functions\u003c/a\u003e,\n * available\n * \u003ca href\u003d\"http://www.ualberta.ca/CNS/RESEARCH/Software/NumericalNSWC/site.html\"\u003ehere\u003c/a\u003e.\n * This library is \"approved for public release\", and the\n * \u003ca href\u003d\"http://www.dtic.mil/dtic/pdf/announcements/CopyrightGuidance.pdf\"\u003eCopyright guidance\u003c/a\u003e\n * indicates that unless otherwise stated in the code, all FORTRAN functions in\n * this library are license free. Since no such notice appears in the code these\n * functions can safely be ported to Commons-Math.\n * \u003c/p\u003e\n *\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "field",
      "varNames": [
        "HALF_LOG_TWO_PI"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The constant value of ½log 2π. "
    },
    {
      "type": "field",
      "varNames": [
        "DELTA"
      ],
      "begin_line": 81,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003e\n     * The coefficients of the series expansion of the Δ function. This function\n     * is defined as follows\n     * \u003c/p\u003e\n     * \u003ccenter\u003eΔ(x) \u003d log Γ(x) - (x - 0.5) log a + a - 0.5 log 2π,\u003c/center\u003e\n     * \u003cp\u003e\n     * see equation (23) in Didonato and Morris (1992). The series expansion,\n     * which applies for x ≥ 10, reads\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     *                 14\n     *                \u003d\u003d\u003d\u003d\n     *             1  \\                2 n\n     *     Δ(x) \u003d ---  \u003e    d  (10 / x)\n     *             x  /      n\n     *                \u003d\u003d\u003d\u003d\n     *                n \u003d 0\n     * \u003cpre\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.special.Beta.Beta()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Default constructor.  Prohibit instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.regularizedBeta(double, double, double)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x Value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @return the regularized beta function I(x, a, b).\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.regularizedBeta(double, double, double, double)",
      "begin_line": 135,
      "end_line": 139,
      "comment": "\n     * Returns the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * regularized beta function\u003c/a\u003e I(x, a, b).\n     *\n     * @param x Value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.regularizedBeta(double, double, double, int)",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * @param x the value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.regularizedBeta(double, double, double, double, int)",
      "begin_line": 182,
      "end_line": 227,
      "comment": "\n     * Returns the regularized beta function I(x, a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/RegularizedBetaFunction.html\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003cli\u003e\n     * \u003ca href\u003d\"http://functions.wolfram.com/06.21.10.0001.01\"\u003e\n     * Regularized Beta Function\u003c/a\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x the value.\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return the regularized beta function I(x, a, b)\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 19)",
        "(line 187,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.Anonymous-13fdadc2-2856-4df4-b3e2-e787c5ed7a06.getB(int, double)",
      "begin_line": 200,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 202,col 21)-(line 202,col 31)",
        "(line 203,col 21)-(line 203,col 29)",
        "(line 204,col 21)-(line 212,col 21)",
        "(line 213,col 21)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.Anonymous-011b3393-9681-4ed0-9a3f-641018f72820.getA(int, double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 21)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon This parameter is ignored.\n     * @param maxIterations This parameter is ignored.\n     * @return log(B(a, b)).\n     * @deprecated as of version 3.1, this method is deprecated as the\n     * computation of the beta function is no longer iterative; it will be\n     * removed in version 4.0. Current implementation of this method\n     * internally calls {@link #logBeta(double, double)}.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logGammaSum(double, double)",
      "begin_line": 269,
      "end_line": 287,
      "comment": "\n     * Returns the value of log Γ(a + b) for 1 ≤ a, b ≤ 2. Based on the\n     * \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e double precision\n     * implementation, {@code DGSMLN}. In {@link BetaTest#testLogGammaSum()},\n     * this private method is accessed through reflection.\n     *\n     * @param a First argument.\n     * @param b Second argument.\n     * @return the value of {@code log(Gamma(a + b))}.\n     * @throws OutOfRangeException if {@code a} or {@code b} is lower than\n     * {@code 1.0} or greater than {@code 2.0}.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 47)",
        "(line 280,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logGammaMinusLogGammaSum(double, double)",
      "begin_line": 301,
      "end_line": 329,
      "comment": "\n     * Returns the value of log[Γ(b) / Γ(a + b)] for a ≥ 0 and b ≥ 10. Based on\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e double precision\n     * implementation, {@code DLGDIV}. In\n     * {@link BetaTest#testLogGammaMinusLogGammaSum()}, this private method is\n     * accessed through reflection.\n     *\n     * @param a First argument.\n     * @param b Second argument.\n     * @return the value of {@code log(Gamma(b) / Gamma(a + b))}.\n     * @throws NumberIsTooSmallException if {@code a \u003c 0.0} or {@code b \u003c 10.0}.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 315,col 9)-(line 315,col 23)",
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 51)",
        "(line 326,col 9)-(line 326,col 53)",
        "(line 328,col 9)-(line 328,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.deltaMinusDeltaSum(double, double)",
      "begin_line": 341,
      "end_line": 374,
      "comment": "\n     * Returns the value of Δ(b) - Δ(a + b), with 0 ≤ a ≤ b and b ≥ 10. Based\n     * on equations (26), (27) and (28) in Didonato and Morris (1992).\n     *\n     * @param a First argument.\n     * @param b Second argument.\n     * @return the value of {@code Delta(b) - Delta(a + b)}\n     * @throws OutOfRangeException if {@code a \u003c 0} or {@code a \u003e b}\n     * @throws NumberIsTooSmallException if {@code b \u003c 10}\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 352,col 31)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 354,col 9)-(line 354,col 41)",
        "(line 355,col 9)-(line 355,col 32)",
        "(line 359,col 9)-(line 359,col 52)",
        "(line 360,col 9)-(line 360,col 19)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 367,col 9)-(line 367,col 38)",
        "(line 368,col 9)-(line 368,col 39)",
        "(line 369,col 9)-(line 369,col 61)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.sumDeltaMinusDeltaSum(double, double)",
      "begin_line": 388,
      "end_line": 407,
      "comment": "\n     * Returns the value of Δ(p) + Δ(q) - Δ(p + q), with p, q ≥ 10. Based on\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e double precision\n     * implementation, {@code DBCORR}. In\n     * {@link BetaTest#testSumDeltaMinusDeltaSum()}, this private method is\n     * accessed through reflection.\n     *\n     * @param p First argument.\n     * @param q Second argument.\n     * @return the value of {@code Delta(p) + Delta(q) - Delta(p + q)}.\n     * @throws NumberIsTooSmallException if {@code p \u003c 10.0} or {@code q \u003c 10.0}.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 398,col 44)",
        "(line 399,col 9)-(line 399,col 44)",
        "(line 400,col 9)-(line 400,col 38)",
        "(line 401,col 9)-(line 401,col 39)",
        "(line 402,col 9)-(line 402,col 43)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logBeta(double, double)",
      "begin_line": 419,
      "end_line": 510,
      "comment": "\n     * Returns the value of log B(p, q) for 0 ≤ x ≤ 1 and p, q \u003e 0. Based on the\n     * \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e implementation,\n     * {@code DBETLN}.\n     *\n     * @param p First argument.\n     * @param q Second argument.\n     * @return the value of {@code log(Beta(p, q))}, {@code NaN} if\n     * {@code p \u003c\u003d 0} or {@code q \u003c\u003d 0}.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 425,col 44)",
        "(line 426,col 9)-(line 509,col 9)"
      ]
    }
  ]
}