{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 36,
      "end_line": 282,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions. Methods solve() and solve2() find\n * real zeros, using different ways to bypass complex arithmetics.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.analysis.MullerSolver.MullerSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double, double)",
      "begin_line": 65,
      "end_line": 80,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 48)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 56)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 42)",
        "(line 75,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double)",
      "begin_line": 106,
      "end_line": 185,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Original Muller\u0027s method would have function evaluation at complex point.\n     * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n     * condition is one way to go: by requiring bracketing in every iteration,\n     * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n     * \u003cp\u003e\n     * Normally Muller\u0027s method converges quadratically in the vicinity of a\n     * zero, however it may be very slow in regions far away from zeros. For\n     * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n     * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here use divided differences directly.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)",
        "(line 114,col 9)-(line 114,col 67)",
        "(line 116,col 9)-(line 116,col 17)",
        "(line 116,col 19)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 17)",
        "(line 117,col 19)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 29)",
        "(line 118,col 31)-(line 118,col 47)",
        "(line 121,col 9)-(line 121,col 38)",
        "(line 122,col 9)-(line 122,col 38)",
        "(line 123,col 9)-(line 123,col 38)",
        "(line 125,col 9)-(line 125,col 18)",
        "(line 126,col 9)-(line 126,col 40)",
        "(line 127,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve2(double, double)",
      "begin_line": 212,
      "end_line": 281,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * solve2() differs from solve() in the way it avoids complex operations.\n     * Except for the initial [min, max], solve2() does not require bracketing\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n     * number arises in the computation, we simply use its modulus as real\n     * approximation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Because the interval may not be bracketing, bisection alternative is\n     * not applicable here. However in practice our treatment usually works\n     * well, especially near real zeros where the imaginary part of complex\n     * approximation is often negligible.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here do not use divided differences directly.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 50)",
        "(line 219,col 9)-(line 219,col 57)",
        "(line 221,col 9)-(line 221,col 17)",
        "(line 221,col 19)-(line 221,col 35)",
        "(line 222,col 9)-(line 222,col 17)",
        "(line 222,col 19)-(line 222,col 35)",
        "(line 223,col 9)-(line 223,col 29)",
        "(line 223,col 31)-(line 223,col 47)",
        "(line 226,col 9)-(line 226,col 38)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 230,col 9)-(line 230,col 18)",
        "(line 231,col 9)-(line 231,col 40)",
        "(line 232,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 72)"
      ]
    }
  ]
}