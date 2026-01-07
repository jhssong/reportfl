{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/analysis/interpolation/NevilleInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 42,
      "end_line": 144,
      "comment": "\n * Testcase for Neville interpolator.\n * \u003cp\u003e\n * The error of polynomial interpolation is\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\n * where f^(n) is the n-th derivative of the approximated function and\n * zeta is some point in the interval determined by x[] and z.\n * \u003cp\u003e\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\n * it and use the absolute value upper bound for estimates. For reference,\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testSinFunction()",
      "begin_line": 49,
      "end_line": 73,
      "comment": "\n     * Test of interpolator for the sine function.\n     * \u003cp\u003e\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 53)",
        "(line 51,col 9)-(line 51,col 76)",
        "(line 52,col 9)-(line 52,col 56)",
        "(line 55,col 9)-(line 55,col 18)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 37)",
        "(line 64,col 9)-(line 64,col 66)",
        "(line 66,col 9)-(line 66,col 28)",
        "(line 66,col 30)-(line 66,col 51)",
        "(line 66,col 53)-(line 66,col 72)",
        "(line 67,col 9)-(line 67,col 71)",
        "(line 68,col 9)-(line 68,col 50)",
        "(line 70,col 9)-(line 70,col 30)",
        "(line 70,col 32)-(line 70,col 53)",
        "(line 70,col 55)-(line 70,col 74)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testExpm1Function()",
      "begin_line": 80,
      "end_line": 108,
      "comment": "\n     * Test of interpolator for the exponential function.\n     * \u003cp\u003e\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 55)",
        "(line 82,col 9)-(line 82,col 76)",
        "(line 83,col 9)-(line 83,col 56)",
        "(line 86,col 9)-(line 86,col 18)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 26)",
        "(line 89,col 9)-(line 89,col 26)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 66)",
        "(line 97,col 9)-(line 97,col 16)",
        "(line 97,col 18)-(line 97,col 39)",
        "(line 97,col 41)-(line 97,col 60)",
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 50)",
        "(line 101,col 9)-(line 101,col 16)",
        "(line 101,col 18)-(line 101,col 39)",
        "(line 101,col 41)-(line 101,col 60)",
        "(line 102,col 9)-(line 102,col 71)",
        "(line 103,col 9)-(line 103,col 50)",
        "(line 105,col 9)-(line 105,col 17)",
        "(line 105,col 19)-(line 105,col 40)",
        "(line 105,col 42)-(line 105,col 61)",
        "(line 106,col 9)-(line 106,col 71)",
        "(line 107,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testParameters()",
      "begin_line": 113,
      "end_line": 126,
      "comment": "\n     * Test of parameters for the interpolator.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 76)",
        "(line 116,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.partialerror(double[], double)",
      "begin_line": 131,
      "end_line": 143,
      "comment": "\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 23)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    }
  ]
}