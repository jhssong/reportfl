{
  "filepath": "/tmp/Math-28b/src/test/java/org/apache/commons/math3/optimization/fitting/PolynomialFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 240,
      "comment": "\n * Test for class {@link CurveFitter} where the function to fit is a\n * polynomial.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testFit()",
      "begin_line": 41,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 56)",
        "(line 44,col 9)-(line 44,col 33)",
        "(line 46,col 9)-(line 46,col 84)",
        "(line 47,col 9)-(line 47,col 68)",
        "(line 48,col 9)-(line 48,col 51)",
        "(line 49,col 9)-(line 49,col 67)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 58,col 9)-(line 58,col 79)",
        "(line 60,col 9)-(line 60,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testNoError()",
      "begin_line": 63,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 53)",
        "(line 66,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testSmallError()",
      "begin_line": 85,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)",
        "(line 88,col 9)-(line 88,col 28)",
        "(line 89,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798()",
      "begin_line": 111,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)",
        "(line 114,col 9)-(line 114,col 88)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 30)",
        "(line 118,col 9)-(line 118,col 95)",
        "(line 119,col 9)-(line 119,col 88)",
        "(line 121,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798WithToleranceTooLow()",
      "begin_line": 132,
      "end_line": 145,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * But in the test case, the real problem is that the tolerance is way too\n     * stringent.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 88)",
        "(line 136,col 9)-(line 136,col 52)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 139,col 9)-(line 139,col 95)",
        "(line 140,col 9)-(line 140,col 88)",
        "(line 142,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.doMath798(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, int, double[])",
      "begin_line": 153,
      "end_line": 193,
      "comment": "\n     * @param optimizer Optimizer.\n     * @param maxEval Maximum number of function evaluations.\n     * @param init First guess.\n     * @return the solution found by the given optimizer.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 62)",
        "(line 158,col 9)-(line 158,col 52)",
        "(line 159,col 9)-(line 159,col 54)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 54)",
        "(line 162,col 9)-(line 162,col 54)",
        "(line 163,col 9)-(line 163,col 53)",
        "(line 164,col 9)-(line 164,col 53)",
        "(line 165,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 52)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 168,col 52)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 170,col 53)",
        "(line 171,col 9)-(line 171,col 53)",
        "(line 172,col 9)-(line 172,col 52)",
        "(line 173,col 9)-(line 173,col 53)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 175,col 52)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 51)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 189,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantSolvable()",
      "begin_line": 195,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantUnsolvable()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.checkUnsolvableProblem(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, boolean)",
      "begin_line": 207,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.buildRandomPolynomial(int, java.util.Random)",
      "begin_line": 233,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 52)"
      ]
    }
  ]
}