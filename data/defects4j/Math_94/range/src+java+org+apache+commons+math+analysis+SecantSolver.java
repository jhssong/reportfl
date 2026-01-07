{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 187,
      "comment": "\n * Implements a modified version of the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.  \n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SecantSolver.SecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SecantSolver.SecantSolver()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(double, double)",
      "begin_line": 68,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(double, double, double)",
      "begin_line": 75,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Find a zero in the given interval.\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use (ignored)\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 113,
      "end_line": 185,
      "comment": "\n     * Find a zero in the given interval.\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException  if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 22)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 125,col 9)-(line 125,col 24)",
        "(line 126,col 9)-(line 126,col 24)",
        "(line 127,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 32)",
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 23)",
        "(line 139,col 9)-(line 139,col 23)",
        "(line 140,col 9)-(line 140,col 34)",
        "(line 141,col 9)-(line 141,col 18)",
        "(line 142,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 72)"
      ]
    }
  ]
}