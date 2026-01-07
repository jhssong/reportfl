{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/analysis/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 157,
      "comment": "\n * Implements a modified version of the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.  \n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the \n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SecantSolver.SecantSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Construct a solver for the given function.\n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(double, double, double)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Find a zero in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use (ignored)\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SecantSolver.solve(double, double)",
      "begin_line": 84,
      "end_line": 155,
      "comment": "\n     * Find a zero in the given interval.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException  if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 22)",
        "(line 88,col 9)-(line 88,col 33)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 96,col 9)-(line 96,col 24)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 32)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 23)",
        "(line 110,col 9)-(line 110,col 34)",
        "(line 111,col 9)-(line 111,col 18)",
        "(line 112,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 72)"
      ]
    }
  ]
}