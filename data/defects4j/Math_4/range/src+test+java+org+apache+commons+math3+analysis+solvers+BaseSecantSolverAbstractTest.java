{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/solvers/BaseSecantSolverAbstractTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseSecantSolverAbstractTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 258,
      "comment": "\n * Base class for root-finding algorithms tests derived from\n * {@link BaseSecantSolver}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.getSolver()",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Returns the solver to use to perform the tests.\n     * @return the solver to use to perform the tests\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.getQuinticEvalCounts()",
      "begin_line": 47,
      "end_line": 47,
      "comment": " Returns the expected number of evaluations for the\n     * {@link #testQuinticZero} unit test. A value of {@code -1} indicates that\n     * the test should be skipped for that solver.\n     * @return the expected number of evaluations for the\n     * {@link #testQuinticZero} unit test\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSinZero()",
      "begin_line": 49,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 41)",
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 46)",
        "(line 58,col 9)-(line 58,col 44)",
        "(line 61,col 9)-(line 61,col 79)",
        "(line 62,col 9)-(line 62,col 56)",
        "(line 63,col 9)-(line 63,col 44)",
        "(line 66,col 9)-(line 66,col 79)",
        "(line 67,col 9)-(line 67,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testQuinticZero()",
      "begin_line": 70,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 53)",
        "(line 81,col 9)-(line 81,col 22)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 83,col 9)-(line 83,col 51)",
        "(line 84,col 9)-(line 84,col 46)",
        "(line 87,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 26)",
        "(line 101,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testRootEndpoints()",
      "begin_line": 117,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 53)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 125,col 46)",
        "(line 127,col 9)-(line 127,col 48)",
        "(line 128,col 9)-(line 128,col 46)",
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 46)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testBadEndpoints()",
      "begin_line": 137,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 41)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionLeftSide()",
      "begin_line": 161,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 41)",
        "(line 164,col 9)-(line 164,col 46)",
        "(line 165,col 9)-(line 165,col 27)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionRightSide()",
      "begin_line": 180,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 185,col 9)-(line 185,col 28)",
        "(line 186,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionBelowSide()",
      "begin_line": 198,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 41)",
        "(line 201,col 9)-(line 201,col 46)",
        "(line 202,col 9)-(line 202,col 27)",
        "(line 203,col 9)-(line 203,col 28)",
        "(line 204,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.testSolutionAboveSide()",
      "begin_line": 217,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 41)",
        "(line 220,col 9)-(line 220,col 46)",
        "(line 221,col 9)-(line 221,col 27)",
        "(line 222,col 9)-(line 222,col 28)",
        "(line 223,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolverAbstractTest.getSolution(org.apache.commons.math3.analysis.solvers.UnivariateSolver, int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 236,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 255,col 9)"
      ]
    }
  ]
}