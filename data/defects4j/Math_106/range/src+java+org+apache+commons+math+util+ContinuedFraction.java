{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 177,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getA(int, double)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getB(int, double)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 128,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003e\n     * Evaluates the continued fraction at the value x.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The implementation of this method is based on equations 14-17 of:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     *   Eric W. Weisstein. \"Continued Fraction.\" From MathWorld--A Wolfram Web\n     *   Resource. \u003ca target\u003d\"_blank\"\n     *   href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     *   http://mathworld.wolfram.com/ContinuedFraction.html\u003c/a\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * The recurrence relationship defined in those equations can result in\n     * very large intermediate results which can result in numerical overflow.\n     * As a means to combat these overflow conditions, the intermediate results\n     * are scaled whenever they threaten to become numerically unstable.\n     *   \n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)",
        "(line 132,col 9)-(line 132,col 31)",
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 24)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 136,col 9)-(line 136,col 18)",
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 17)"
      ]
    }
  ]
}