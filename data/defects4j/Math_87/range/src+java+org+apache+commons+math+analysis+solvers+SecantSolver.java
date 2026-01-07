{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl",
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 189,
      "comment": "\n * Implements a modified version of the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.  \n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double)",
      "begin_line": 70,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(double, double, double)",
      "begin_line": 77,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Find a zero in the given interval.\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use (ignored)\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 115,
      "end_line": 187,
      "comment": "\n     * Find a zero in the given interval.\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException  if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 22)",
        "(line 120,col 9)-(line 120,col 33)",
        "(line 127,col 9)-(line 127,col 24)",
        "(line 128,col 9)-(line 128,col 24)",
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 133,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 23)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 142,col 34)",
        "(line 143,col 9)-(line 143,col 18)",
        "(line 144,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 72)"
      ]
    }
  ]
}