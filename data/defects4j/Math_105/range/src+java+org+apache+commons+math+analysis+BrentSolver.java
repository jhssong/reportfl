{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 30,
      "end_line": 193,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for  finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BrentSolver.BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eConvergenceException\u003c/code\u003e if the values of the function\n     * at the endpoints of the interval have the same sign.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (ignored).\n     * @return the value where the function is zero\n     * @throws ConvergenceException the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if initial is not between min and max\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double)",
      "begin_line": 81,
      "end_line": 192,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Requires that the values of the function at the endpoints have opposite\n     * signs. An \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown if this is not\n     * the case.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 33)",
        "(line 90,col 9)-(line 90,col 24)",
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 92,col 18)",
        "(line 93,col 9)-(line 93,col 18)",
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 25)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 23)",
        "(line 106,col 9)-(line 106,col 23)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 108,col 9)-(line 108,col 32)",
        "(line 110,col 9)-(line 110,col 18)",
        "(line 111,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 81)"
      ]
    }
  ]
}