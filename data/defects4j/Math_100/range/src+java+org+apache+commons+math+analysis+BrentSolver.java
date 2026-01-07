{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 31,
      "end_line": 258,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for  finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BrentSolver.BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double, double)",
      "begin_line": 64,
      "end_line": 107,
      "comment": "\n     * Find a zero in the given interval with an initial guess.\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the values of the\n     * function at the three points have the same sign (note that it is\n     * allowed to have endpoints with the same sign if the initial point has\n     * opposite sign function-wise).\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (must be set to min if no\n     * initial point is known).\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException the maximum iteration count\n     * is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if initial is not between min and max\n     * (even if it \u003cem\u003eis\u003c/em\u003e a root)\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 71,col 9)",
        "(line 74,col 9)-(line 74,col 43)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 81,col 9)-(line 81,col 35)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 93,col 9)-(line 93,col 35)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 105,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double)",
      "begin_line": 125,
      "end_line": 145,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Requires that the values of the function at the endpoints have opposite\n     * signs. An \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown if this is not\n     * the case.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 22)",
        "(line 129,col 9)-(line 129,col 33)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 135,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 143,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double, double, double, double, double)",
      "begin_line": 163,
      "end_line": 257,
      "comment": "\n     * Find a zero starting search according to the three provided points.\n     * @param x0 old approximation for the root\n     * @param y0 function value at the approximation for the root\n     * @param x1 last calculated approximation for the root\n     * @param y1 function value at the last calculated approximation\n     * for the root\n     * @param x2 bracket point (must be set to x0 if no bracket point is\n     * known, this will force starting with linear interpolation)\n     * @param y2 function value at the bracket point.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function \n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 31)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 171,col 9)-(line 171,col 18)",
        "(line 172,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 72)"
      ]
    }
  ]
}