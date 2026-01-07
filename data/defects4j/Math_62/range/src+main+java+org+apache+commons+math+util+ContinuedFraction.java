{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 208,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getA(int, double)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getB(int, double)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 126,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003e\n     * Evaluates the continued fraction at the value x.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The implementation of this method is based on equations 14-17 of:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     *   Eric W. Weisstein. \"Continued Fraction.\" From MathWorld--A Wolfram Web\n     *   Resource. \u003ca target\u003d\"_blank\"\n     *   href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     *   http://mathworld.wolfram.com/ContinuedFraction.html\u003c/a\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * The recurrence relationship defined in those equations can result in\n     * very large intermediate results which can result in numerical overflow.\n     * As a means to combat these overflow conditions, the intermediate results\n     * are scaled whenever they threaten to become numerically unstable.\u003c/p\u003e\n     *\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x.\n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 24)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 132,col 24)",
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 18)",
        "(line 135,col 9)-(line 135,col 48)",
        "(line 136,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 17)"
      ]
    }
  ]
}