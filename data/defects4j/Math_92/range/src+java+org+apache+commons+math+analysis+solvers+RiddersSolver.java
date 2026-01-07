{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/analysis/solvers/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 37,
      "end_line": 190,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\n * Systems, 26 (1979), 979 - 980.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.RiddersSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.RiddersSolver()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.solve(double, double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.solve(double, double, double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 92,
      "end_line": 108,
      "comment": "\n     * Find a root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 48)",
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 99,col 56)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 124,
      "end_line": 189,
      "comment": "\n     * Find a root in the given interval.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 80)",
        "(line 133,col 9)-(line 133,col 17)",
        "(line 133,col 19)-(line 133,col 35)",
        "(line 134,col 9)-(line 134,col 17)",
        "(line 134,col 19)-(line 134,col 35)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 141,col 9)-(line 141,col 18)",
        "(line 142,col 9)-(line 142,col 40)",
        "(line 143,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 72)"
      ]
    }
  ]
}