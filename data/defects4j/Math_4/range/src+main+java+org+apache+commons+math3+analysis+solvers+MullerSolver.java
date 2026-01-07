{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 50,
      "end_line": 203,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions.\n * This class differs from {@link MullerSolver} in the way it avoids complex\n * operations.\u003c/p\u003e\n * Muller\u0027s original method would have function evaluation at complex point.\n * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n * condition is one way to go: by requiring bracketing in every iteration,\n * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n * \u003cp\u003e\n * Normally Muller\u0027s method converges quadratically in the vicinity of a\n * zero, however it may be very slow in regions far away from zeros. For\n * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n * \u003cp\u003e\n * The formulas here use divided differences directly.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n * @see MullerSolver2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver(double)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver(double, double)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.doSolve()",
      "begin_line": 83,
      "end_line": 117,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 36)",
        "(line 89,col 9)-(line 89,col 36)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 92,col 9)-(line 92,col 72)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 35)",
        "(line 112,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.solve(double, double, double, double)",
      "begin_line": 130,
      "end_line": 202,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param fMin function value at the lower bound.\n     * @param fMax function value at the upper bound.\n     * @return the point at which the function value is zero.\n     * @throws TooManyEvaluationsException if the allowed number of calls to\n     * the function to be solved has been exhausted.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 62)",
        "(line 134,col 9)-(line 134,col 62)",
        "(line 135,col 9)-(line 135,col 72)",
        "(line 142,col 9)-(line 142,col 24)",
        "(line 143,col 9)-(line 143,col 25)",
        "(line 144,col 9)-(line 144,col 24)",
        "(line 145,col 9)-(line 145,col 25)",
        "(line 146,col 9)-(line 146,col 36)",
        "(line 147,col 9)-(line 147,col 46)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 201,col 9)"
      ]
    }
  ]
}