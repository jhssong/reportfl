{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/analysis/interpolation/NevilleInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 142,
      "comment": "\n * Testcase for Neville interpolator.\n * \u003cp\u003e\n * The error of polynomial interpolation is\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\n * where f^(n) is the n-th derivative of the approximated function and\n * zeta is some point in the interval determined by x[] and z.\n * \u003cp\u003e\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\n * it and use the absolute value upper bound for estimates. For reference,\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testSinFunction()",
      "begin_line": 47,
      "end_line": 71,
      "comment": "\n     * Test of interpolator for the sine function.\n     * \u003cp\u003e\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 53)",
        "(line 49,col 9)-(line 49,col 76)",
        "(line 50,col 9)-(line 50,col 56)",
        "(line 53,col 9)-(line 53,col 18)",
        "(line 54,col 9)-(line 54,col 44)",
        "(line 55,col 9)-(line 55,col 26)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 62,col 66)",
        "(line 64,col 9)-(line 64,col 24)",
        "(line 64,col 26)-(line 64,col 47)",
        "(line 64,col 49)-(line 64,col 68)",
        "(line 65,col 9)-(line 65,col 67)",
        "(line 66,col 9)-(line 66,col 50)",
        "(line 68,col 9)-(line 68,col 26)",
        "(line 68,col 28)-(line 68,col 49)",
        "(line 68,col 51)-(line 68,col 70)",
        "(line 69,col 9)-(line 69,col 67)",
        "(line 70,col 9)-(line 70,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testExpm1Function()",
      "begin_line": 78,
      "end_line": 106,
      "comment": "\n     * Test of interpolator for the exponential function.\n     * \u003cp\u003e\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 55)",
        "(line 80,col 9)-(line 80,col 76)",
        "(line 81,col 9)-(line 81,col 56)",
        "(line 84,col 9)-(line 84,col 18)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 26)",
        "(line 87,col 9)-(line 87,col 26)",
        "(line 88,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 66)",
        "(line 95,col 9)-(line 95,col 16)",
        "(line 95,col 18)-(line 95,col 39)",
        "(line 95,col 41)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 67)",
        "(line 97,col 9)-(line 97,col 50)",
        "(line 99,col 9)-(line 99,col 16)",
        "(line 99,col 18)-(line 99,col 39)",
        "(line 99,col 41)-(line 99,col 60)",
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 101,col 50)",
        "(line 103,col 9)-(line 103,col 17)",
        "(line 103,col 19)-(line 103,col 40)",
        "(line 103,col 42)-(line 103,col 61)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.testParameters()",
      "begin_line": 111,
      "end_line": 124,
      "comment": "\n     * Test of parameters for the interpolator.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 76)",
        "(line 114,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.NevilleInterpolatorTest.partialerror(double[], double)",
      "begin_line": 129,
      "end_line": 141,
      "comment": "\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 23)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 19)"
      ]
    }
  ]
}