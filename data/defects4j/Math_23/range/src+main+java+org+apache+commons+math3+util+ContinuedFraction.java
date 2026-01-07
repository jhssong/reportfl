{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 196,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.getA(int, double)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.getB(int, double)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double)",
      "begin_line": 73,
      "end_line": 80,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     * @throws MaxCountExceededException if maximal number of iterations is reached\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 137,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003e\n     * Evaluates the continued fraction at the value x.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The implementation of this method is based on the modified Lentz algorithm as described\n     * on page 18 ff. in:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     *   I. J. Thompson,  A. R. Barnett. \"Coulomb and Bessel Functions of Complex Arguments and Order.\"\n     *   \u003ca target\u003d\"_blank\" href\u003d\"http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf\"\u003e\n     *   http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf\u003c/a\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * Note: the implementation uses the terms a\u003csub\u003ei\u003c/sub\u003e and b\u003csub\u003ei\u003c/sub\u003e as defined in\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003eContinued Fraction / MathWorld\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     * @throws MaxCountExceededException if maximal number of iterations is reached\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 18)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 149,col 9)-(line 149,col 29)",
        "(line 150,col 9)-(line 150,col 26)",
        "(line 152,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 18)"
      ]
    }
  ]
}