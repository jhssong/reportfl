{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 182,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.getA(int, double)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.getB(int, double)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     * @throws MaxCountExceededException if maximal number of iterations is reached\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 123,
      "end_line": 180,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * \u003cp\u003e\n     * The implementation of this method is based on the modified Lentz algorithm as described\n     * on page 18 ff. in:\n     * \u003cul\u003e\n     *   \u003cli\u003e\n     *   I. J. Thompson,  A. R. Barnett. \"Coulomb and Bessel Functions of Complex Arguments and Order.\"\n     *   \u003ca target\u003d\"_blank\" href\u003d\"http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf\"\u003e\n     *   http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf\u003c/a\u003e\n     *   \u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e the implementation uses the terms a\u003csub\u003ei\u003c/sub\u003e and b\u003csub\u003ei\u003c/sub\u003e as defined in\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003eContinued Fraction @ MathWorld\u003c/a\u003e.\n     * \u003c/p\u003e\n     *\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws ConvergenceException if the algorithm fails to converge.\n     * @throws MaxCountExceededException if maximal number of iterations is reached\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 126,col 34)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 18)",
        "(line 134,col 9)-(line 134,col 27)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 136,col 26)",
        "(line 138,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 18)"
      ]
    }
  ]
}