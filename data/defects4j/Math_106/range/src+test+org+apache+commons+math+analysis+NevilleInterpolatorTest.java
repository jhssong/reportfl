{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/analysis/NevilleInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NevilleInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 137,
      "comment": "\r\n * Testcase for Neville interpolator.\r\n * \u003cp\u003e\r\n * The error of polynomial interpolation is\r\n *     f(z) - p(z) \u003d f^(n)(zeta) * (z-x[0])(z-x[1])...(z-x[n-1]) / n!\r\n * where f^(n) is the n-th derivative of the approximated function and\r\n * zeta is some point in the interval determined by x[] and z.\r\n * \u003cp\u003e\r\n * Since zeta is unknown, f^(n)(zeta) cannot be calculated. But we can bound\r\n * it and use the absolute value upper bound for estimates. For reference,\r\n * see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\r\n * \r\n * @version $Revision$ $Date$ \r\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testSinFunction()",
      "begin_line": 42,
      "end_line": 66,
      "comment": "\r\n     * Test of interpolator for the sine function.\r\n     * \u003cp\u003e\r\n     * |sin^(n)(zeta)| \u003c\u003d 1.0, zeta in [0, 2*PI]\r\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 53)",
        "(line 44,col 9)-(line 44,col 76)",
        "(line 45,col 9)-(line 45,col 56)",
        "(line 48,col 9)-(line 48,col 18)",
        "(line 49,col 9)-(line 49,col 44)",
        "(line 50,col 9)-(line 50,col 26)",
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 37)",
        "(line 57,col 9)-(line 57,col 66)",
        "(line 59,col 9)-(line 59,col 24)",
        "(line 59,col 26)-(line 59,col 47)",
        "(line 59,col 49)-(line 59,col 68)",
        "(line 60,col 9)-(line 60,col 67)",
        "(line 61,col 9)-(line 61,col 50)",
        "(line 63,col 9)-(line 63,col 26)",
        "(line 63,col 28)-(line 63,col 49)",
        "(line 63,col 51)-(line 63,col 70)",
        "(line 64,col 9)-(line 64,col 67)",
        "(line 65,col 9)-(line 65,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testExpm1Function()",
      "begin_line": 73,
      "end_line": 101,
      "comment": "\r\n     * Test of interpolator for the exponential function.\r\n     * \u003cp\u003e\r\n     * |expm1^(n)(zeta)| \u003c\u003d e, zeta in [-1, 1]\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 76)",
        "(line 76,col 9)-(line 76,col 56)",
        "(line 79,col 9)-(line 79,col 18)",
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 26)",
        "(line 83,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 40)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 90,col 9)-(line 90,col 16)",
        "(line 90,col 18)-(line 90,col 39)",
        "(line 90,col 41)-(line 90,col 60)",
        "(line 91,col 9)-(line 91,col 67)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 94,col 9)-(line 94,col 16)",
        "(line 94,col 18)-(line 94,col 39)",
        "(line 94,col 41)-(line 94,col 60)",
        "(line 95,col 9)-(line 95,col 67)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 98,col 9)-(line 98,col 17)",
        "(line 98,col 19)-(line 98,col 40)",
        "(line 98,col 42)-(line 98,col 61)",
        "(line 99,col 9)-(line 99,col 67)",
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.testParameters()",
      "begin_line": 106,
      "end_line": 119,
      "comment": "\r\n     * Test of parameters for the interpolator.\r\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 76)",
        "(line 109,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.NevilleInterpolatorTest.partialerror(double[], double)",
      "begin_line": 124,
      "end_line": 136,
      "comment": "\r\n     * Returns the partial error term (z-x[0])(z-x[1])...(z-x[n-1])/n!\r\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    }
  ]
}