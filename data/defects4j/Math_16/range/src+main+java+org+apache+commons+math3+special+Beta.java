{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/special/Beta.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Beta",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 329,
      "comment": "\n * \u003cp\u003e\n * This is a utility class that provides computation methods related to the\n * Beta family of functions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Implementation of {@link #bcorr(double, double)} is based on the algorithms\n * described in\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/22721.23109\"\u003eDidonato and Morris\n * (1986)\u003c/a\u003e, \u003cem\u003eComputation of the Incomplete Gamma Function Ratios and\n *     their Inverse\u003c/em\u003e, TOMS 12(4), 377-393,\u003c/li\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://dx.doi.org/10.1145/131766.131776\"\u003eDidonato and Morris\n * (1992)\u003c/a\u003e, \u003cem\u003eAlgorithm 708: Significant Digit Computation of the\n *     Incomplete Beta Function Ratios\u003c/em\u003e, TOMS 18(3), 360-373,\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * and implemented in the\n * \u003ca href\u003d\"http://www.dtic.mil/docs/citations/ADA476840\"\u003eNSWC Library of Mathematical Functions\u003c/a\u003e,\n * available\n * \u003ca href\u003d\"http://www.ualberta.ca/CNS/RESEARCH/Software/NumericalNSWC/site.html\"\u003ehere\u003c/a\u003e.\n * This library is \"approved for public release\", and the\n * \u003ca href\u003d\"http://www.dtic.mil/dtic/pdf/announcements/CopyrightGuidance.pdf\"\u003eCopyright guidance\u003c/a\u003e\n * indicates that unless otherwise stated in the code, all FORTRAN functions in\n * this library are license free. Since no such notice appears in the code these\n * functions can safely be ported to Commons-Math.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
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
        "DELTA"
      ],
      "begin_line": 81,
      "end_line": 97,
      "comment": "\n     * \u003cp\u003e\n     * The coefficients of the series expansion of the Δ function. This\n     * function is defined as follows\n     * \u003c/p\u003e\n     * \u003ccenter\u003eΔ(x) \u003d log Γ(x) - (x - 0.5) log a + a - 0.5 log 2π,\u003c/center\u003e\n     * \u003cp\u003e\n     * see equation (23) in Didonato and Morris (1992). The series expansion\n     * reads\n     * \u003c/p\u003e\n     * \u003cpre\u003e\n     *                n\n     *               \u003d\u003d\u003d\u003d\n     *            1  \\             i\n     *    Δ(x) \u003d ---  \u003e    DELTA  t\n     *            x  /          i\n     *               \u003d\u003d\u003d\u003d\n     *               i \u003d 0\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * where {@code t \u003d (10 / x)^2}. This series applies for {@code x \u003e\u003d 10.0}.\n     * \u003c/p\u003e\n     "
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
      "signature": "org.apache.commons.math3.special.Beta.Anonymous-f5daeec6-7b44-49bb-868e-9184c53e63f1.getB(int, double)",
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
      "signature": "org.apache.commons.math3.special.Beta.Anonymous-a00d33a6-8f7b-4015-9832-fba6400a2ea9.getA(int, double)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 21)-(line 218,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logBeta(double, double)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @return log(B(a, b)).\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.logBeta(double, double, double, int)",
      "begin_line": 257,
      "end_line": 273,
      "comment": "\n     * Returns the natural logarithm of the beta function B(a, b).\n     *\n     * The implementation of this method is based on:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/BetaFunction.html\"\u003e\n     * Beta Function\u003c/a\u003e, equation (1).\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a Parameter {@code a}.\n     * @param b Parameter {@code b}.\n     * @param epsilon When the absolute value of the nth item in the\n     * series is less than epsilon the approximation ceases to calculate\n     * further elements in the series.\n     * @param maxIterations Maximum number of \"iterations\" to complete.\n     * @return log(B(a, b)).\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 19)",
        "(line 262,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.special.Beta.bcorr(double, double)",
      "begin_line": 285,
      "end_line": 328,
      "comment": "\n     * Returns the value of Δ(p) + Δ(q) - Δ(p + q), with p, q ≥ 10. Based on\n     * the \u003cem\u003eNSWC Library of Mathematics Subroutines\u003c/em\u003e implementation,\n     * {@code BCORR}.\n     *\n     * @param p First argument.\n     * @param q Second argument.\n     * @return the value of {@code Delta(p) + Delta(q) - Delta(p + q)}.\n     * @throws NumberIsTooSmallException if {@code p \u003c 10.0} or {@code q \u003c 10.0}.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 296,col 31)",
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 298,col 41)",
        "(line 299,col 9)-(line 299,col 32)",
        "(line 303,col 9)-(line 303,col 52)",
        "(line 304,col 9)-(line 304,col 19)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 311,col 9)-(line 311,col 30)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 313,col 9)-(line 313,col 61)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 19)",
        "(line 321,col 9)-(line 321,col 23)",
        "(line 322,col 9)-(line 322,col 36)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 25)"
      ]
    }
  ]
}