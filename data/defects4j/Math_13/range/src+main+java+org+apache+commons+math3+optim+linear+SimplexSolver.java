{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/optim/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.linear.LinearOptimizer"
      ],
      "begin_line": 31,
      "end_line": 245,
      "comment": "\n * Solves a linear problem using the \"Two-Phase Simplex\" method.\n *\n * @version $Id: SimplexSolver.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Builds a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.SimplexSolver(double, int)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Builds a simplex solver with a specified accepted amount of error.\n     *\n     * @param epsilon Amount of error to accept for algorithm convergence.\n     * @param maxUlps Amount of error to accept in floating point comparisons.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)",
        "(line 60,col 9)-(line 60,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotColumn(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 69,
      "end_line": 82,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @return the column with the most negative coefficient.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.getPivotRow(org.apache.commons.math3.optim.linear.SimplexTableau, int)",
      "begin_line": 91,
      "end_line": 161,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     *\n     * @param tableau Simple tableau for the problem.\n     * @param col Column to test the ratio of (see {@link #getPivotColumn(SimplexTableau)}).\n     * @return the row with the minimum ratio.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 67)",
        "(line 94,col 9)-(line 94,col 43)",
        "(line 95,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doIteration(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 170,
      "end_line": 193,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)",
        "(line 176,col 9)-(line 176,col 51)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 183,col 63)",
        "(line 184,col 9)-(line 184,col 46)",
        "(line 187,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.solvePhase1(org.apache.commons.math3.optim.linear.SimplexTableau)",
      "begin_line": 203,
      "end_line": 221,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     *\n     * @param tableau Simple tableau for the problem.\n     * @throws TooManyIterationsException if the allowed number of iterations has been exhausted.\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution.\n     * @throws NoFeasibleSolutionException if there is no feasible solution?\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 218,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.SimplexSolver.doOptimize()",
      "begin_line": 224,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 235,col 40)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 37)"
      ]
    }
  ]
}