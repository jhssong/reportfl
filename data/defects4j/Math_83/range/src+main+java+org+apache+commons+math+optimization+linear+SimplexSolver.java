{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 30,
      "end_line": 195,
      "comment": "\n * Solves a linear problem using the Two-Phase Simplex Method.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default amount of error to accept in floating point comparisons. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Build a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver(double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Build a simplex solver with a specified accepted amount of error\n     * @param epsilon the amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 58,
      "end_line": 68,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     * @param tableau simple tableau for the problem\n     * @return column with the most negative coefficient\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 28)",
        "(line 60,col 9)-(line 60,col 30)",
        "(line 61,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 76,
      "end_line": 90,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 43)",
        "(line 78,col 9)-(line 78,col 35)",
        "(line 79,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 99,
      "end_line": 121,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws OptimizationException if the maximal iteration count has been\n     * exceeded or if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 37)",
        "(line 104,col 9)-(line 104,col 51)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 111,col 9)-(line 111,col 63)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 115,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 128,
      "end_line": 138,
      "comment": "\n     * Checks whether Phase 1 is solved.\n     * @param tableau simple tableau for the problem\n     * @return whether Phase 1 is solved\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @param tableau simple tableau for the problem\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 164,
      "end_line": 179,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @exception OptimizationException if the maximal number of iterations is\n     * exceeded, or if the problem is found not to have a bounded solution, or\n     * if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 182,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 185,col 9)-(line 186,col 89)",
        "(line 187,col 9)-(line 187,col 29)",
        "(line 188,col 9)-(line 188,col 45)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 37)"
      ]
    }
  ]
}