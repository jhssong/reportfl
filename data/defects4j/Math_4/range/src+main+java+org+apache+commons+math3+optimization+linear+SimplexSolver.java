{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 35,
      "end_line": 239,
      "comment": "\n * Solves a linear problem using the Two-Phase Simplex Method.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Build a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.SimplexSolver(double, int)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Build a simplex solver with a specified accepted amount of error\n     * @param epsilon the amount of error to accept for algorithm convergence\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 31)",
        "(line 64,col 9)-(line 64,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 72,
      "end_line": 85,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     * @param tableau simple tableau for the problem\n     * @return column with the most negative coefficient\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 30)",
        "(line 75,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau, int)",
      "begin_line": 93,
      "end_line": 161,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 67)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 97,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 169,
      "end_line": 191,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 37)",
        "(line 174,col 9)-(line 174,col 51)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 181,col 63)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 185,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 200,
      "end_line": 216,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     * @throws NoFeasibleSolutionException if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 219,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 222,col 9)-(line 228,col 40)",
        "(line 230,col 9)-(line 230,col 29)",
        "(line 231,col 9)-(line 231,col 38)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 37)"
      ]
    }
  ]
}