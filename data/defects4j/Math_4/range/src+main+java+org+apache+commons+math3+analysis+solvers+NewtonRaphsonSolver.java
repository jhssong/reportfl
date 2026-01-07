{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/NewtonRaphsonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonRaphsonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateDifferentiableSolver"
      ],
      "begin_line": 33,
      "end_line": 93,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate differentiable\n * functions.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver.NewtonRaphsonSolver()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver.NewtonRaphsonSolver(double)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver.solve(int, org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction, double, double)",
      "begin_line": 65,
      "end_line": 70,
      "comment": "\n     * Find a zero near the midpoint of {@code min} and {@code max}.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param maxEval Maximum number of evaluations.\n     * @return the value where the function is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum evaluation count is exceeded.\n     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException\n     * if {@code min \u003e\u003d max}.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver.doSolve()",
      "begin_line": 75,
      "end_line": 92,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 50)",
        "(line 79,col 9)-(line 79,col 62)",
        "(line 81,col 9)-(line 81,col 31)",
        "(line 82,col 9)-(line 82,col 18)",
        "(line 83,col 9)-(line 91,col 9)"
      ]
    }
  ]
}