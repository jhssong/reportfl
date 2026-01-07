{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 33,
      "end_line": 238,
      "comment": "\n * Solves a linear problem using the Two-Phase Simplex Method.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ULPS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Amount of error to accept for algorithm convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "maxUlps"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Amount of error to accept in floating point comparisons (as ulps). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Build a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.SimplexSolver(double, int)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Build a simplex solver with a specified accepted amount of error\n     * @param epsilon the amount of error to accept for algorithm convergence\n     * @param maxUlps amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 31)",
        "(line 61,col 9)-(line 61,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 69,
      "end_line": 82,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     * @param tableau simple tableau for the problem\n     * @return column with the most negative coefficient\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau, int)",
      "begin_line": 90,
      "end_line": 160,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 168,
      "end_line": 190,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 37)",
        "(line 173,col 9)-(line 173,col 51)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 63)",
        "(line 181,col 9)-(line 181,col 46)",
        "(line 184,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)",
      "begin_line": 199,
      "end_line": 215,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     * @throws NoFeasibleSolutionException if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 212,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 218,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 9)-(line 227,col 40)",
        "(line 229,col 9)-(line 229,col 29)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 37)"
      ]
    }
  ]
}