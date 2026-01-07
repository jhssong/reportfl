{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/solvers/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractDifferentiableUnivariateRealSolver"
      ],
      "begin_line": 31,
      "end_line": 85,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver(double)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction, double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Find a zero near the midpoint of {@code min} and {@code max}.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval?\n     * @param max Upper bound for the interval.\n     * @return the value where the function is zero.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximum evaluation count is exceeded.\n     * @throws IllegalArgumentException if {@code min \u003e\u003d max}.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.doSolve()",
      "begin_line": 69,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 62)",
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 18)",
        "(line 76,col 9)-(line 83,col 9)"
      ]
    }
  ]
}