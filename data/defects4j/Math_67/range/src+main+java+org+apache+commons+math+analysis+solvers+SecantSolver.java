{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 43,
      "end_line": 183,
      "comment": "\n * Implements a modified version of the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.\n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double)",
      "begin_line": 66,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\n     * Find a zero in the given interval.\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use (ignored)\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 111,
      "end_line": 181,
      "comment": "\n     * Find a zero in the given interval.\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException  if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 22)",
        "(line 116,col 9)-(line 116,col 33)",
        "(line 123,col 9)-(line 123,col 24)",
        "(line 124,col 9)-(line 124,col 24)",
        "(line 125,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 32)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 23)",
        "(line 135,col 9)-(line 135,col 23)",
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 18)",
        "(line 138,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 72)"
      ]
    }
  ]
}