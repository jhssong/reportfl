{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/analysis/NevilleInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 138,
      "comment": "\n * Testcase for Neville interpolator.\n * \u003cp\u003e\n * The error of polynomial interpolation is\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\n * where f^(n) is the n-th derivative of the approximated function and\n * zeta is some point in the interval determined by x[] and z.\n * \u003cp\u003e\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\n * it and use the absolute value upper bound for estimates. For reference,\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testSinFunction()",
      "begin_line": 43,
      "end_line": 67,
      "comment": "\n     * Test of interpolator for the sine function.\n     * \u003cp\u003e\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 53)",
        "(line 45,col 9)-(line 45,col 76)",
        "(line 46,col 9)-(line 46,col 56)",
        "(line 49,col 9)-(line 49,col 18)",
        "(line 50,col 9)-(line 50,col 44)",
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 52,col 26)",
        "(line 53,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 37)",
        "(line 58,col 9)-(line 58,col 66)",
        "(line 60,col 9)-(line 60,col 24)",
        "(line 60,col 26)-(line 60,col 47)",
        "(line 60,col 49)-(line 60,col 68)",
        "(line 61,col 9)-(line 61,col 67)",
        "(line 62,col 9)-(line 62,col 50)",
        "(line 64,col 9)-(line 64,col 26)",
        "(line 64,col 28)-(line 64,col 49)",
        "(line 64,col 51)-(line 64,col 70)",
        "(line 65,col 9)-(line 65,col 67)",
        "(line 66,col 9)-(line 66,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testExpm1Function()",
      "begin_line": 74,
      "end_line": 102,
      "comment": "\n     * Test of interpolator for the exponential function.\n     * \u003cp\u003e\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 55)",
        "(line 76,col 9)-(line 76,col 76)",
        "(line 77,col 9)-(line 77,col 56)",
        "(line 80,col 9)-(line 80,col 18)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 26)",
        "(line 83,col 9)-(line 83,col 26)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 40)",
        "(line 89,col 9)-(line 89,col 66)",
        "(line 91,col 9)-(line 91,col 16)",
        "(line 91,col 18)-(line 91,col 39)",
        "(line 91,col 41)-(line 91,col 60)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 95,col 9)-(line 95,col 16)",
        "(line 95,col 18)-(line 95,col 39)",
        "(line 95,col 41)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 67)",
        "(line 97,col 9)-(line 97,col 50)",
        "(line 99,col 9)-(line 99,col 17)",
        "(line 99,col 19)-(line 99,col 40)",
        "(line 99,col 42)-(line 99,col 61)",
        "(line 100,col 9)-(line 100,col 67)",
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testParameters()",
      "begin_line": 107,
      "end_line": 120,
      "comment": "\n     * Test of parameters for the interpolator.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 76)",
        "(line 110,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.partialerror(double[], double)",
      "begin_line": 125,
      "end_line": 137,
      "comment": "\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 23)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    }
  ]
}