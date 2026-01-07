{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 207,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getA(int, double)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getB(int, double)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 125,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003e\n     * Evaluates the continued fraction at the value x.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The implementation of this method is based on equations 14-17 of:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     *   Eric W. Weisstein. \"Continued Fraction.\" From MathWorld--A Wolfram Web\n     *   Resource. \u003ca target\u003d\"_blank\"\n     *   href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     *   http://mathworld.wolfram.com/ContinuedFraction.html\u003c/a\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * The recurrence relationship defined in those equations can result in\n     * very large intermediate results which can result in numerical overflow.\n     * As a means to combat these overflow conditions, the intermediate results\n     * are scaled whenever they threaten to become numerically unstable.\u003c/p\u003e\n     *\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 129,col 31)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 132,col 27)",
        "(line 133,col 9)-(line 133,col 18)",
        "(line 134,col 9)-(line 134,col 48)",
        "(line 135,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 17)"
      ]
    }
  ]
}