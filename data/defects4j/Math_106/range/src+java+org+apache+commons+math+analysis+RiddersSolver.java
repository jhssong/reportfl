{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 33,
      "end_line": 158,
      "comment": "\r\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\r\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\r\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\r\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\r\n * Systems, 26 (1979), 979 - 980.\r\n * \u003cp\u003e\r\n * The function should be continuous but not necessarily smooth.\r\n *  \r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.RiddersSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\r\n     * Construct a solver for the given function.\r\n     * \r\n     * @param f function to solve\r\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double, double)",
      "begin_line": 62,
      "end_line": 77,
      "comment": "\r\n     * Find a root in the given interval with initial value.\r\n     * \u003cp\u003e\r\n     * Requires bracketing condition.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function\r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 48)",
        "(line 67,col 9)-(line 67,col 48)",
        "(line 68,col 9)-(line 68,col 56)",
        "(line 70,col 9)-(line 70,col 38)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double)",
      "begin_line": 93,
      "end_line": 157,
      "comment": "\r\n     * Find a root in the given interval.\r\n     * \u003cp\u003e\r\n     * Requires bracketing condition.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 80)",
        "(line 101,col 9)-(line 101,col 17)",
        "(line 101,col 19)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 17)",
        "(line 102,col 19)-(line 102,col 35)",
        "(line 105,col 9)-(line 105,col 38)",
        "(line 106,col 9)-(line 106,col 38)",
        "(line 107,col 9)-(line 107,col 38)",
        "(line 109,col 9)-(line 109,col 18)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 81)"
      ]
    }
  ]
}