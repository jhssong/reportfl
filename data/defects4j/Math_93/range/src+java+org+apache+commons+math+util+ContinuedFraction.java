{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/util/ContinuedFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContinuedFraction",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 180,
      "comment": "\n * Provides a generic means to evaluate continued fractions.  Subclasses simply\n * provided the a and b coefficients to evaluate the continued fraction.\n *\n * \u003cp\u003e\n * References:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n * Continued Fraction\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Maximum allowed numerical error. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.ContinuedFraction.ContinuedFraction()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getA(int, double)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Access the n-th a coefficient of the continued fraction.  Since a can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th a coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.getB(int, double)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Access the n-th b coefficient of the continued fraction.  Since b can be\n     * a function of the evaluation point, x, that is passed in as well.\n     * @param n the coefficient index to retrieve.\n     * @param x the evaluation point.\n     * @return the n-th b coefficient.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Evaluates the continued fraction at the value x.\n     * @param x the evaluation point.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ContinuedFraction.evaluate(double, double, int)",
      "begin_line": 130,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003e\n     * Evaluates the continued fraction at the value x.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The implementation of this method is based on equations 14-17 of:\n     * \u003cul\u003e\n     * \u003cli\u003e\n     *   Eric W. Weisstein. \"Continued Fraction.\" From MathWorld--A Wolfram Web\n     *   Resource. \u003ca target\u003d\"_blank\"\n     *   href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     *   http://mathworld.wolfram.com/ContinuedFraction.html\u003c/a\u003e\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     * The recurrence relationship defined in those equations can result in\n     * very large intermediate results which can result in numerical overflow.\n     * As a means to combat these overflow conditions, the intermediate results\n     * are scaled whenever they threaten to become numerically unstable.\u003c/p\u003e\n     *   \n     * @param x the evaluation point.\n     * @param epsilon maximum error allowed.\n     * @param maxIterations maximum number of convergents\n     * @return the value of the continued fraction evaluated at x. \n     * @throws MathException if the algorithm fails to converge.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 27)",
        "(line 138,col 9)-(line 138,col 18)",
        "(line 139,col 9)-(line 139,col 48)",
        "(line 140,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 17)"
      ]
    }
  ]
}