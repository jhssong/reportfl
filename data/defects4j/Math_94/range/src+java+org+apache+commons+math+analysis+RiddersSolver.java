{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 36,
      "end_line": 189,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\n * Systems, 26 (1979), 979 - 980.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.RiddersSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.RiddersSolver()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double)",
      "begin_line": 63,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(double, double, double)",
      "begin_line": 70,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 91,
      "end_line": 107,
      "comment": "\n     * Find a root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 48)",
        "(line 98,col 9)-(line 98,col 56)",
        "(line 100,col 9)-(line 100,col 38)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RiddersSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 123,
      "end_line": 188,
      "comment": "\n     * Find a root in the given interval.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 80)",
        "(line 132,col 9)-(line 132,col 17)",
        "(line 132,col 19)-(line 132,col 35)",
        "(line 133,col 9)-(line 133,col 17)",
        "(line 133,col 19)-(line 133,col 35)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 140,col 9)-(line 140,col 18)",
        "(line 141,col 9)-(line 141,col 40)",
        "(line 142,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 72)"
      ]
    }
  ]
}