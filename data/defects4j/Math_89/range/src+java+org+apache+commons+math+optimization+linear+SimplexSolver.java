{
  "filepath": "/tmp/Math-89b/src/java/org/apache/commons/math/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 30,
      "end_line": 198,
      "comment": "\n * Solves a linear problem using the Two-Phase Simplex Method.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EPSILON"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Default amount of error to accept in floating point comparisons. "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Amount of error to accept in floating point comparisons. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Build a simplex solver with default settings.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.SimplexSolver(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Build a simplex solver with a specified accepted amount of error\n     * @param epsilon the amount of error to accept in floating point comparisons\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 61,
      "end_line": 71,
      "comment": "\n     * Returns the column with the most negative coefficient in the objective function row.\n     * @param tableau simple tableau for the problem\n     * @return column with the most negative coefficient\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 30)",
        "(line 64,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 79,
      "end_line": 93,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn()}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 43)",
        "(line 81,col 9)-(line 81,col 35)",
        "(line 82,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 102,
      "end_line": 124,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws OptimizationException if the maximal iteration count has been\n     * exceeded or if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 37)",
        "(line 107,col 9)-(line 107,col 51)",
        "(line 108,col 9)-(line 108,col 58)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 114,col 63)",
        "(line 115,col 9)-(line 115,col 46)",
        "(line 118,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 131,
      "end_line": 141,
      "comment": "\n     * Checks whether Phase 1 is solved.\n     * @param tableau simple tableau for the problem\n     * @return whether Phase 1 is solved\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 148,
      "end_line": 158,
      "comment": "\n     * Returns whether the problem is at an optimal state.\n     * @param tableau simple tableau for the problem\n     * @return whether the model has been solved\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 167,
      "end_line": 182,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @exception OptimizationException if the maximal number of iterations is\n     * exceeded, or if the problem is found not to have a bounded solution, or\n     * if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 185,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 189,col 89)",
        "(line 190,col 9)-(line 190,col 29)",
        "(line 191,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 37)"
      ]
    }
  ]
}