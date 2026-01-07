{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/linear/SimplexSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplexSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer"
      ],
      "begin_line": 33,
      "end_line": 185,
      "comment": "\n * Solves a linear problem using the Two-Phase Simplex Method.\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(org.apache.commons.math.optimization.linear.SimplexTableau, int)",
      "begin_line": 79,
      "end_line": 114,
      "comment": "\n     * Returns the row with the minimum ratio as given by the minimum ratio test (MRT).\n     * @param tableau simple tableau for the problem\n     * @param col the column to test the ratio of.  See {@link #getPivotColumn(SimplexTableau)}\n     * @return row with the minimum ratio\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 67)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 83,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 122,
      "end_line": 144,
      "comment": "\n     * Runs one iteration of the Simplex method on the given model.\n     * @param tableau simple tableau for the problem\n     * @throws OptimizationException if the maximal iteration count has been\n     * exceeded or if the model is found not to have a bounded solution\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 37)",
        "(line 127,col 9)-(line 127,col 51)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 63)",
        "(line 135,col 9)-(line 135,col 46)",
        "(line 138,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)",
      "begin_line": 153,
      "end_line": 168,
      "comment": "\n     * Solves Phase 1 of the Simplex method.\n     * @param tableau simple tableau for the problem\n     * @exception OptimizationException if the maximal number of iterations is\n     * exceeded, or if the problem is found not to have a bounded solution, or\n     * if there is no feasible solution\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize()",
      "begin_line": 171,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 174,col 88)",
        "(line 176,col 9)-(line 176,col 29)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 37)"
      ]
    }
  ]
}