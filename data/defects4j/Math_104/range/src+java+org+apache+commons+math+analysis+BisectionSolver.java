{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/analysis/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 30,
      "end_line": 106,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions. \n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\n * \n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.analysis.BisectionSolver.BisectionSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double, double)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "\n     * Find a zero in the given interval.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (ignored).\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException the maximum iteration count is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BisectionSolver.solve(double, double)",
      "begin_line": 73,
      "end_line": 105,
      "comment": "\n     * Find a zero root in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 22)",
        "(line 77,col 9)-(line 77,col 32)",
        "(line 78,col 9)-(line 78,col 17)",
        "(line 79,col 9)-(line 79,col 18)",
        "(line 80,col 9)-(line 80,col 20)",
        "(line 82,col 9)-(line 82,col 18)",
        "(line 83,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 72)"
      ]
    }
  ]
}