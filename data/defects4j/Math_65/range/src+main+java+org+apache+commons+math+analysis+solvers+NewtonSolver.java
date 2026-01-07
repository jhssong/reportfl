{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/analysis/solvers/NewtonSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NewtonSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 35,
      "end_line": 137,
      "comment": "\n * Implements \u003ca href\u003d\"http://mathworld.wolfram.com/NewtonsMethod.html\"\u003e\n * Newton\u0027s Method\u003c/a\u003e for finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver(org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.NewtonSolver()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(double, double)",
      "begin_line": 58,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(double, double, double)",
      "begin_line": 66,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Find a zero near the midpoint of \u003ccode\u003emin\u003c/code\u003e and \u003ccode\u003emax\u003c/code\u003e.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.NewtonSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 104,
      "end_line": 135,
      "comment": "\n     * Find a zero near the value \u003ccode\u003estartValue\u003c/code\u003e.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval (ignored).\n     * @param max the upper bound for the interval (ignored).\n     * @param startValue the start value to use.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function or derivative\n     * @throws IllegalArgumentException if startValue is not between min and max or\n     * if function is not a {@link DifferentiableUnivariateRealFunction} instance\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 134,col 9)"
      ]
    }
  ]
}