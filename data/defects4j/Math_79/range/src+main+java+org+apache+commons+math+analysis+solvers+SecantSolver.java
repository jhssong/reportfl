{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 42,
      "end_line": 184,
      "comment": "\n * Implements a modified version of the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.\n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double, double)",
      "begin_line": 72,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Find a zero in the given interval.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use (ignored)\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 110,
      "end_line": 182,
      "comment": "\n     * Find a zero in the given interval.\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException  if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 22)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 122,col 9)-(line 122,col 24)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 124,col 32)",
        "(line 125,col 9)-(line 125,col 32)",
        "(line 128,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 23)",
        "(line 136,col 9)-(line 136,col 23)",
        "(line 137,col 9)-(line 137,col 34)",
        "(line 138,col 9)-(line 138,col 18)",
        "(line 139,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 72)"
      ]
    }
  ]
}