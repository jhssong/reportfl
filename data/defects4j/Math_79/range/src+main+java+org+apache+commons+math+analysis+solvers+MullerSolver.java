{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/solvers/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 38,
      "end_line": 353,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions. Methods solve() and solve2() find\n * real zeros, using different ways to bypass complex arithmetics.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(double, double, double)",
      "begin_line": 69,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 91,
      "end_line": 107,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
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
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 134,
      "end_line": 217,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Original Muller\u0027s method would have function evaluation at complex point.\n     * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n     * condition is one way to go: by requiring bracketing in every iteration,\n     * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n     * \u003cp\u003e\n     * Normally Muller\u0027s method converges quadratically in the vicinity of a\n     * zero, however it may be very slow in regions far away from zeros. For\n     * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n     * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here use divided differences directly.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 24)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 145,col 9)-(line 145,col 24)",
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 147,col 36)",
        "(line 148,col 9)-(line 148,col 32)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 159,col 9)-(line 159,col 47)",
        "(line 160,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve2(double, double)",
      "begin_line": 246,
      "end_line": 250,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * solve2() differs from solve() in the way it avoids complex operations.\n     * Except for the initial [min, max], solve2() does not require bracketing\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n     * number arises in the computation, we simply use its modulus as real\n     * approximation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Because the interval may not be bracketing, bisection alternative is\n     * not applicable here. However in practice our treatment usually works\n     * well, especially near real zeros where the imaginary part of complex\n     * approximation is often negligible.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here do not use divided differences directly.\u003c/p\u003e\n     *\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     * @deprecated replaced by {@link #solve2(UnivariateRealFunction, double, double)}\n     * since 2.0\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve2(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 278,
      "end_line": 352,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * solve2() differs from solve() in the way it avoids complex operations.\n     * Except for the initial [min, max], solve2() does not require bracketing\n     * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n     * number arises in the computation, we simply use its modulus as real\n     * approximation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Because the interval may not be bracketing, bisection alternative is\n     * not applicable here. However in practice our treatment usually works\n     * well, especially near real zeros where the imaginary part of complex\n     * approximation is often negligible.\u003c/p\u003e\n     * \u003cp\u003e\n     * The formulas here do not use divided differences directly.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 24)",
        "(line 287,col 9)-(line 287,col 32)",
        "(line 288,col 9)-(line 288,col 24)",
        "(line 289,col 9)-(line 289,col 32)",
        "(line 290,col 9)-(line 290,col 36)",
        "(line 291,col 9)-(line 291,col 32)",
        "(line 294,col 9)-(line 294,col 38)",
        "(line 295,col 9)-(line 295,col 38)",
        "(line 296,col 9)-(line 296,col 38)",
        "(line 298,col 9)-(line 298,col 47)",
        "(line 299,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 72)"
      ]
    }
  ]
}