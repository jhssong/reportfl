{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/optimization/fitting/PolynomialFitterTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFitterTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 286,
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
      "end_line": 142,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * But in the test case, the real problem is that the tolerance is way too\n     * stringent.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 88)",
        "(line 138,col 9)-(line 138,col 52)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 141,col 9)-(line 141,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testMath798WithToleranceTooLowButNoException()",
      "begin_line": 151,
      "end_line": 164,
      "comment": "\n     * This test shows that the user can set the maximum number of iterations\n     * to avoid running for too long.\n     * Even if the real problem is that the tolerance is way too stringent, it\n     * is possible to get the best solution so far, i.e. a checker will return\n     * the point when the maximum iteration count has been reached.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)",
        "(line 154,col 9)-(line 154,col 52)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 97)",
        "(line 158,col 9)-(line 158,col 95)",
        "(line 159,col 9)-(line 159,col 88)",
        "(line 161,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.doMath798(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, int, double[])",
      "begin_line": 172,
      "end_line": 212,
      "comment": "\n     * @param optimizer Optimizer.\n     * @param maxEval Maximum number of function evaluations.\n     * @param init First guess.\n     * @return the solution found by the given optimizer.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 86)",
        "(line 177,col 9)-(line 177,col 52)",
        "(line 178,col 9)-(line 178,col 54)",
        "(line 179,col 9)-(line 179,col 52)",
        "(line 180,col 9)-(line 180,col 54)",
        "(line 181,col 9)-(line 181,col 54)",
        "(line 182,col 9)-(line 182,col 53)",
        "(line 183,col 9)-(line 183,col 53)",
        "(line 184,col 9)-(line 184,col 53)",
        "(line 185,col 9)-(line 185,col 52)",
        "(line 186,col 9)-(line 186,col 53)",
        "(line 187,col 9)-(line 187,col 52)",
        "(line 188,col 9)-(line 188,col 53)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 190,col 9)-(line 190,col 53)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 51)",
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 199,col 51)",
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 53)",
        "(line 202,col 9)-(line 202,col 53)",
        "(line 203,col 9)-(line 203,col 53)",
        "(line 204,col 9)-(line 204,col 53)",
        "(line 205,col 9)-(line 205,col 52)",
        "(line 206,col 9)-(line 206,col 53)",
        "(line 208,col 9)-(line 210,col 48)",
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantSolvable()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testRedundantUnsolvable()",
      "begin_line": 220,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 114)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.testLargeSample()",
      "begin_line": 226,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 60)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.checkUnsolvableProblem(org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer, boolean)",
      "begin_line": 253,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 52)",
        "(line 256,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.fitting.PolynomialFitterTest.buildRandomPolynomial(int, java.util.Random)",
      "begin_line": 279,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 61)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 52)"
      ]
    }
  ]
}