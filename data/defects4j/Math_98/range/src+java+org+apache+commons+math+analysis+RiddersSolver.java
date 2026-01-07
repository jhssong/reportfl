{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/analysis/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 35,
      "end_line": 158,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\n * Systems, 26 (1979), 979 - 980.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.RiddersSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double, double)",
      "begin_line": 63,
      "end_line": 78,
      "comment": "\n     * Find a root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 48)",
        "(line 68,col 9)-(line 68,col 48)",
        "(line 69,col 9)-(line 69,col 56)",
        "(line 71,col 9)-(line 71,col 38)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double)",
      "begin_line": 93,
      "end_line": 157,
      "comment": "\n     * Find a root in the given interval.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
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
        "(line 156,col 9)-(line 156,col 72)"
      ]
    }
  ]
}