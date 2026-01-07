{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 29,
      "end_line": 106,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions. \n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double, double)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Find a zero in the given interval.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (ignored).\n     * @return the value where the function is zero\n     * @throws ConvergenceException the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double)",
      "begin_line": 72,
      "end_line": 105,
      "comment": "\n     * Find a zero root in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 76,col 32)",
        "(line 77,col 9)-(line 77,col 17)",
        "(line 78,col 9)-(line 78,col 18)",
        "(line 79,col 9)-(line 79,col 20)",
        "(line 81,col 9)-(line 81,col 18)",
        "(line 82,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 104,col 81)"
      ]
    }
  ]
}