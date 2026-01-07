{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/solvers/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 34,
      "end_line": 136,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(double, double)",
      "begin_line": 57,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(double, double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * Find a zero near the midpoint of \u003ccode\u003emin\u003c/code\u003e and \u003ccode\u003emax\u003c/code\u003e.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 103,
      "end_line": 134,
      "comment": "\n     * Find a zero near the value \u003ccode\u003estartValue\u003c/code\u003e.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval (ignored).\n     * @param max the upper bound for the interval (ignored).\n     * @param startValue the start value to use.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if startValue is not between min and max or\n     * if function is not a {@link DifferentiableUnivariateRealFunction} instance\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 133,col 9)"
      ]
    }
  ]
}