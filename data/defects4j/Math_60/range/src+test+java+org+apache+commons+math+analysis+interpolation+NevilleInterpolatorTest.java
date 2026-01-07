{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/analysis/interpolation/NevilleInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 43,
      "end_line": 145,
      "comment": "\n * Testcase for Neville interpolator.\n * \u003cp\u003e\n * The error of polynomial interpolation is\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\n * where f^(n) is the n-th derivative of the approximated function and\n * zeta is some point in the interval determined by x[] and z.\n * \u003cp\u003e\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\n * it and use the absolute value upper bound for estimates. For reference,\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testSinFunction()",
      "begin_line": 50,
      "end_line": 74,
      "comment": "\n     * Test of interpolator for the sine function.\n     * \u003cp\u003e\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 53)",
        "(line 52,col 9)-(line 52,col 76)",
        "(line 53,col 9)-(line 53,col 56)",
        "(line 56,col 9)-(line 56,col 18)",
        "(line 57,col 9)-(line 57,col 48)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 37)",
        "(line 65,col 9)-(line 65,col 66)",
        "(line 67,col 9)-(line 67,col 28)",
        "(line 67,col 30)-(line 67,col 51)",
        "(line 67,col 53)-(line 67,col 72)",
        "(line 68,col 9)-(line 68,col 71)",
        "(line 69,col 9)-(line 69,col 50)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 71,col 32)-(line 71,col 53)",
        "(line 71,col 55)-(line 71,col 74)",
        "(line 72,col 9)-(line 72,col 71)",
        "(line 73,col 9)-(line 73,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testExpm1Function()",
      "begin_line": 81,
      "end_line": 109,
      "comment": "\n     * Test of interpolator for the exponential function.\n     * \u003cp\u003e\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 55)",
        "(line 83,col 9)-(line 83,col 76)",
        "(line 84,col 9)-(line 84,col 56)",
        "(line 87,col 9)-(line 87,col 18)",
        "(line 88,col 9)-(line 88,col 37)",
        "(line 89,col 9)-(line 89,col 26)",
        "(line 90,col 9)-(line 90,col 26)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 44)",
        "(line 96,col 9)-(line 96,col 66)",
        "(line 98,col 9)-(line 98,col 16)",
        "(line 98,col 18)-(line 98,col 39)",
        "(line 98,col 41)-(line 98,col 60)",
        "(line 99,col 9)-(line 99,col 71)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 102,col 9)-(line 102,col 16)",
        "(line 102,col 18)-(line 102,col 39)",
        "(line 102,col 41)-(line 102,col 60)",
        "(line 103,col 9)-(line 103,col 71)",
        "(line 104,col 9)-(line 104,col 50)",
        "(line 106,col 9)-(line 106,col 17)",
        "(line 106,col 19)-(line 106,col 40)",
        "(line 106,col 42)-(line 106,col 61)",
        "(line 107,col 9)-(line 107,col 71)",
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testParameters()",
      "begin_line": 114,
      "end_line": 127,
      "comment": "\n     * Test of parameters for the interpolator.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 76)",
        "(line 117,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.partialerror(double[], double)",
      "begin_line": 132,
      "end_line": 144,
      "comment": "\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 23)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 19)"
      ]
    }
  ]
}