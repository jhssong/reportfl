{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 33,
      "end_line": 200,
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
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Build a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver(double, int)",
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
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 69,
      "end_line": 80,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     * @param tableau simple tableau for the problem\n     * @return column with the most negative coefficient\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(org.apache.commons.math.optimization.linear.SimplexTableau, int)",
      "begin_line": 88,
      "end_line": 126,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 67)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 134,
      "end_line": 156,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 146,col 9)-(line 146,col 63)",
        "(line 147,col 9)-(line 147,col 46)",
        "(line 150,col 9)-(line 155,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 165,
      "end_line": 181,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @throws MaxCountExceededException if the maximal iteration count has been exceeded\n     * @throws UnboundedSolutionException if the model is found not to have a bounded solution\n     * @throws NoFeasibleSolutionException if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 184,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 49)",
        "(line 191,col 9)-(line 191,col 29)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 37)"
      ]
    }
  ]
}