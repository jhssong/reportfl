{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 34,
      "end_line": 277,
      "comment": "\r\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\r\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\r\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\r\n * chapter 3.\r\n * \u003cp\u003e\r\n * Muller\u0027s method applies to both real and complex functions, but here we\r\n * restrict ourselves to real functions. Methods solve() and solve2() find\r\n * real zeros, using different ways to bypass complex arithmetics.\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.MullerSolver.MullerSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\r\n     * Construct a solver for the given function.\r\n     * \r\n     * @param f function to solve\r\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double, double)",
      "begin_line": 63,
      "end_line": 78,
      "comment": "\r\n     * Find a real root in the given interval with initial value.\r\n     * \u003cp\u003e\r\n     * Requires bracketing condition.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function\r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
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
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double)",
      "begin_line": 104,
      "end_line": 181,
      "comment": "\r\n     * Find a real root in the given interval.\r\n     * \u003cp\u003e\r\n     * Original Muller\u0027s method would have function evaluation at complex point.\r\n     * Since our f(x) is real, we have to find ways to avoid that. Bracketing\r\n     * condition is one way to go: by requiring bracketing in every iteration,\r\n     * the newly computed approximation is guaranteed to be real.\r\n     * \u003cp\u003e\r\n     * Normally Muller\u0027s method converges quadratically in the vicinity of a\r\n     * zero, however it may be very slow in regions far away from zeros. For\r\n     * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\r\n     * bisection as a safety backup if it performs very poorly.\r\n     * \u003cp\u003e\r\n     * The formulas here use divided differences directly.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 50)",
        "(line 112,col 9)-(line 112,col 67)",
        "(line 114,col 9)-(line 114,col 17)",
        "(line 114,col 19)-(line 114,col 35)",
        "(line 115,col 9)-(line 115,col 17)",
        "(line 115,col 19)-(line 115,col 35)",
        "(line 116,col 9)-(line 116,col 29)",
        "(line 116,col 31)-(line 116,col 47)",
        "(line 119,col 9)-(line 119,col 38)",
        "(line 120,col 9)-(line 120,col 38)",
        "(line 121,col 9)-(line 121,col 38)",
        "(line 123,col 9)-(line 123,col 18)",
        "(line 124,col 9)-(line 124,col 40)",
        "(line 125,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve2(double, double)",
      "begin_line": 208,
      "end_line": 276,
      "comment": "\r\n     * Find a real root in the given interval.\r\n     * \u003cp\u003e\r\n     * solve2() differs from solve() in the way it avoids complex operations.\r\n     * Except for the initial [min, max], solve2() does not require bracketing\r\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\r\n     * number arises in the computation, we simply use its modulus as real\r\n     * approximation.\r\n     * \u003cp\u003e\r\n     * Because the interval may not be bracketing, bisection alternative is\r\n     * not applicable here. However in practice our treatment usually works\r\n     * well, especially near real zeros where the imaginary part of complex\r\n     * approximation is often negligible.\r\n     * \u003cp\u003e\r\n     * The formulas here do not use divided differences directly.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 215,col 57)",
        "(line 217,col 9)-(line 217,col 17)",
        "(line 217,col 19)-(line 217,col 35)",
        "(line 218,col 9)-(line 218,col 17)",
        "(line 218,col 19)-(line 218,col 35)",
        "(line 219,col 9)-(line 219,col 29)",
        "(line 219,col 31)-(line 219,col 47)",
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 226,col 9)-(line 226,col 18)",
        "(line 227,col 9)-(line 227,col 40)",
        "(line 228,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 81)"
      ]
    }
  ]
}