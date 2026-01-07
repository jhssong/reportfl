{
  "filepath": "/tmp/Math-62b/src/test/java/org/apache/commons/math/analysis/interpolation/DividedDifferenceInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DividedDifferenceInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 41,
      "end_line": 143,
      "comment": "\n * Testcase for Divided Difference interpolator.\n * \u003cp\u003e\n * The error of polynomial interpolation is\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\n * where f^(n) is the n-th derivative of the approximated function and\n * zeta is some point in the interval determined by x[] and z.\n * \u003cp\u003e\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\n * it and use the absolute value upper bound for estimates. For reference,\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolatorTest.testSinFunction()",
      "begin_line": 48,
      "end_line": 72,
      "comment": "\n     * Test of interpolator for the sine function.\n     * \u003cp\u003e\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 53)",
        "(line 50,col 9)-(line 50,col 86)",
        "(line 51,col 9)-(line 51,col 56)",
        "(line 54,col 9)-(line 54,col 18)",
        "(line 55,col 9)-(line 55,col 48)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 37)",
        "(line 63,col 9)-(line 63,col 66)",
        "(line 65,col 9)-(line 65,col 28)",
        "(line 65,col 30)-(line 65,col 51)",
        "(line 65,col 53)-(line 65,col 72)",
        "(line 66,col 9)-(line 66,col 71)",
        "(line 67,col 9)-(line 67,col 50)",
        "(line 69,col 9)-(line 69,col 30)",
        "(line 69,col 32)-(line 69,col 53)",
        "(line 69,col 55)-(line 69,col 74)",
        "(line 70,col 9)-(line 70,col 71)",
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolatorTest.testExpm1Function()",
      "begin_line": 79,
      "end_line": 107,
      "comment": "\n     * Test of interpolator for the exponential function.\n     * \u003cp\u003e\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 55)",
        "(line 81,col 9)-(line 81,col 86)",
        "(line 82,col 9)-(line 82,col 56)",
        "(line 85,col 9)-(line 85,col 18)",
        "(line 86,col 9)-(line 86,col 37)",
        "(line 87,col 9)-(line 87,col 26)",
        "(line 88,col 9)-(line 88,col 26)",
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 44)",
        "(line 94,col 9)-(line 94,col 66)",
        "(line 96,col 9)-(line 96,col 16)",
        "(line 96,col 18)-(line 96,col 39)",
        "(line 96,col 41)-(line 96,col 60)",
        "(line 97,col 9)-(line 97,col 71)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 100,col 9)-(line 100,col 16)",
        "(line 100,col 18)-(line 100,col 39)",
        "(line 100,col 41)-(line 100,col 60)",
        "(line 101,col 9)-(line 101,col 71)",
        "(line 102,col 9)-(line 102,col 50)",
        "(line 104,col 9)-(line 104,col 17)",
        "(line 104,col 19)-(line 104,col 40)",
        "(line 104,col 42)-(line 104,col 61)",
        "(line 105,col 9)-(line 105,col 71)",
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolatorTest.testParameters()",
      "begin_line": 112,
      "end_line": 125,
      "comment": "\n     * Test of parameters for the interpolator.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 86)",
        "(line 115,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.DividedDifferenceInterpolatorTest.partialerror(double[], double)",
      "begin_line": 130,
      "end_line": 142,
      "comment": "\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 23)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    }
  ]
}