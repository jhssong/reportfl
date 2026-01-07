{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/fitting/PolynomialFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 283,
      "comment": "\n * Test for class {@link CurveFitter} where the function to fit is a\n * polynomial.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testFit()",
      "begin_line": 40,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 76)",
        "(line 43,col 9)-(line 43,col 48)",
        "(line 45,col 9)-(line 45,col 84)",
        "(line 46,col 9)-(line 46,col 68)",
        "(line 47,col 9)-(line 47,col 51)",
        "(line 48,col 9)-(line 48,col 67)",
        "(line 51,col 9)-(line 54,col 9)",
        "(line 57,col 9)-(line 57,col 79)",
        "(line 59,col 9)-(line 59,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testNoError()",
      "begin_line": 62,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testSmallError()",
      "begin_line": 84,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 87,col 28)",
        "(line 88,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798()",
      "begin_line": 110,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 33)",
        "(line 113,col 9)-(line 113,col 88)",
        "(line 114,col 9)-(line 114,col 52)",
        "(line 115,col 9)-(line 115,col 30)",
        "(line 117,col 9)-(line 117,col 95)",
        "(line 118,col 9)-(line 118,col 88)",
        "(line 120,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798WithToleranceTooLow()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * But in the test case, the real problem is that the tolerance is way too\n     * stringent.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 34)",
        "(line 134,col 9)-(line 134,col 88)",
        "(line 135,col 9)-(line 135,col 52)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 138,col 9)-(line 138,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testMath798WithToleranceTooLowButNoException()",
      "begin_line": 148,
      "end_line": 161,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * Even if the real problem is that the tolerance is way too stringent, it\n     * is possible to get the best solution so far, i.e. a checker will return\n     * the point when the maximum iteration count has been reached.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 34)",
        "(line 151,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 97)",
        "(line 155,col 9)-(line 155,col 95)",
        "(line 156,col 9)-(line 156,col 88)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.doMath798(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer, int, double[])",
      "begin_line": 169,
      "end_line": 209,
      "comment": "\n     * @param optimizer Optimizer.\n     * @param maxEval Maximum number of function evaluations.\n     * @param init First guess.\n     * @return the solution found by the given optimizer.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 86)",
        "(line 174,col 9)-(line 174,col 52)",
        "(line 175,col 9)-(line 175,col 54)",
        "(line 176,col 9)-(line 176,col 52)",
        "(line 177,col 9)-(line 177,col 54)",
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 53)",
        "(line 180,col 9)-(line 180,col 53)",
        "(line 181,col 9)-(line 181,col 53)",
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 185,col 53)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 53)",
        "(line 188,col 9)-(line 188,col 52)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 51)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 53)",
        "(line 202,col 9)-(line 202,col 52)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 205,col 9)-(line 207,col 48)",
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testRedundantSolvable()",
      "begin_line": 211,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testRedundantUnsolvable()",
      "begin_line": 217,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.testLargeSample()",
      "begin_line": 223,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 60)",
        "(line 226,col 9)-(line 226,col 28)",
        "(line 227,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.checkUnsolvableProblem(org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer, boolean)",
      "begin_line": 250,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 52)",
        "(line 253,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.PolynomialFitterTest.buildRandomPolynomial(int, java.util.Random)",
      "begin_line": 276,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 61)",
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 52)"
      ]
    }
  ]
}