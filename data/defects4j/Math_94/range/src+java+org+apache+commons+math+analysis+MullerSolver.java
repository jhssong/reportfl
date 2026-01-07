{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 37,
      "end_line": 348,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions. Methods solve() and solve2() find\n * real zeros, using different ways to bypass complex arithmetics.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "signature": "org.apache.commons.math.analysis.MullerSolver.MullerSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.MullerSolver.MullerSolver()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(double, double, double)",
      "begin_line": 71,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 93,
      "end_line": 109,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 48)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 100,col 9)-(line 100,col 56)",
        "(line 102,col 9)-(line 102,col 38)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 104,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 136,
      "end_line": 216,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Original Muller\u0027s method would have function evaluation at complex point.\n     * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n     * condition is one way to go: by requiring bracketing in every iteration,\n     * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n     * \u003cp\u003e\n     * Normally Muller\u0027s method converges quadratically in the vicinity of a\n     * zero, however it may be very slow in regions far away from zeros. For\n     * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n     * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here use divided differences directly.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 67)",
        "(line 147,col 9)-(line 147,col 17)",
        "(line 147,col 19)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 17)",
        "(line 148,col 19)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 29)",
        "(line 149,col 31)-(line 149,col 47)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 154,col 9)-(line 154,col 38)",
        "(line 156,col 9)-(line 156,col 18)",
        "(line 157,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve2(double, double)",
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * solve2() differs from solve() in the way it avoids complex operations.\n     * Except for the initial [min, max], solve2() does not require bracketing\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n     * number arises in the computation, we simply use its modulus as real\n     * approximation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Because the interval may not be bracketing, bisection alternative is\n     * not applicable here. However in practice our treatment usually works\n     * well, especially near real zeros where the imaginary part of complex\n     * approximation is often negligible.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here do not use divided differences directly.\u003c/p\u003e\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     * @deprecated replaced by {@link #solve2(UnivariateRealFunction, double, double)\n     * since 2.0\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.MullerSolver.solve2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 277,
      "end_line": 347,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * solve2() differs from solve() in the way it avoids complex operations.\n     * Except for the initial [min, max], solve2() does not require bracketing\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n     * number arises in the computation, we simply use its modulus as real\n     * approximation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Because the interval may not be bracketing, bisection alternative is\n     * not applicable here. However in practice our treatment usually works\n     * well, especially near real zeros where the imaginary part of complex\n     * approximation is often negligible.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here do not use divided differences directly.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 50)",
        "(line 285,col 9)-(line 285,col 57)",
        "(line 287,col 9)-(line 287,col 17)",
        "(line 287,col 19)-(line 287,col 35)",
        "(line 288,col 9)-(line 288,col 17)",
        "(line 288,col 19)-(line 288,col 35)",
        "(line 289,col 9)-(line 289,col 29)",
        "(line 289,col 31)-(line 289,col 47)",
        "(line 292,col 9)-(line 292,col 38)",
        "(line 293,col 9)-(line 293,col 38)",
        "(line 294,col 9)-(line 294,col 38)",
        "(line 296,col 9)-(line 296,col 18)",
        "(line 297,col 9)-(line 297,col 40)",
        "(line 298,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 72)"
      ]
    }
  ]
}