{
  "filepath": "/tmp/Math-20b/src/test/java/org/apache/commons/math3/optimization/fitting/PolynomialFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 242,
      "comment": "\n * Test for class {@link CurveFitter} where the function to fit is a\n * polynomial.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testFit()",
      "begin_line": 43,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 76)",
        "(line 46,col 9)-(line 46,col 48)",
        "(line 48,col 9)-(line 48,col 84)",
        "(line 49,col 9)-(line 49,col 68)",
        "(line 50,col 9)-(line 50,col 51)",
        "(line 51,col 9)-(line 51,col 67)",
        "(line 54,col 9)-(line 57,col 9)",
        "(line 60,col 9)-(line 60,col 79)",
        "(line 62,col 9)-(line 62,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testNoError()",
      "begin_line": 65,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 53)",
        "(line 68,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testSmallError()",
      "begin_line": 87,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 53)",
        "(line 90,col 9)-(line 90,col 28)",
        "(line 91,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798()",
      "begin_line": 113,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 88)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 118,col 9)-(line 118,col 30)",
        "(line 120,col 9)-(line 120,col 95)",
        "(line 121,col 9)-(line 121,col 88)",
        "(line 123,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798WithToleranceTooLow()",
      "begin_line": 134,
      "end_line": 147,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * But in the test case, the real problem is that the tolerance is way too\n     * stringent.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 88)",
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 141,col 95)",
        "(line 142,col 9)-(line 142,col 88)",
        "(line 144,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.doMath798(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, int, double[])",
      "begin_line": 155,
      "end_line": 195,
      "comment": "\n     * @param optimizer Optimizer.\n     * @param maxEval Maximum number of function evaluations.\n     * @param init First guess.\n     * @return the solution found by the given optimizer.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 86)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 54)",
        "(line 162,col 9)-(line 162,col 52)",
        "(line 163,col 9)-(line 163,col 54)",
        "(line 164,col 9)-(line 164,col 54)",
        "(line 165,col 9)-(line 165,col 53)",
        "(line 166,col 9)-(line 166,col 53)",
        "(line 167,col 9)-(line 167,col 53)",
        "(line 168,col 9)-(line 168,col 52)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 170,col 52)",
        "(line 171,col 9)-(line 171,col 53)",
        "(line 172,col 9)-(line 172,col 53)",
        "(line 173,col 9)-(line 173,col 53)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 53)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 51)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 52)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 191,col 9)-(line 193,col 48)",
        "(line 194,col 9)-(line 194,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantSolvable()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantUnsolvable()",
      "begin_line": 203,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.checkUnsolvableProblem(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, boolean)",
      "begin_line": 209,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 52)",
        "(line 212,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.buildRandomPolynomial(int, java.util.Random)",
      "begin_line": 235,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 61)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 52)"
      ]
    }
  ]
}