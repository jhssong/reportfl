{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/analysis/solvers/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractDifferentiableUnivariateSolver"
      ],
      "begin_line": 31,
      "end_line": 88,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonSolver.NewtonSolver()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonSolver.NewtonSolver(double)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonSolver.solve(int, org.apache.commons.math3.analysis.DifferentiableUnivariateFunction, double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * Find a zero near the midpoint of {@code min} and {@code max}.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param maxEval Maximum number of evaluations.\n     * @return the value where the function is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum evaluation count is exceeded.\n     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException\n     * if {@code min \u003e\u003d max}.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonSolver.doSolve()",
      "begin_line": 72,
      "end_line": 87,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 50)",
        "(line 75,col 9)-(line 75,col 62)",
        "(line 77,col 9)-(line 77,col 31)",
        "(line 78,col 9)-(line 78,col 18)",
        "(line 79,col 9)-(line 86,col 9)"
      ]
    }
  ]
}