{
  "filepath": "/tmp/Math-34b/src/main/java/org/apache/commons/math3/analysis/solvers/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 47,
      "end_line": 194,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions.\n * This class differs from {@link MullerSolver} in the way it avoids complex\n * operations.\u003c/p\u003e\n * Muller\u0027s original method would have function evaluation at complex point.\n * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n * condition is one way to go: by requiring bracketing in every iteration,\n * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n * \u003cp\u003e\n * Normally Muller\u0027s method converges quadratically in the vicinity of a\n * zero, however it may be very slow in regions far away from zeros. For\n * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n * \u003cp\u003e\n * The formulas here use divided differences directly.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n * @see MullerSolver2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver(double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.MullerSolver(double, double)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.doSolve()",
      "begin_line": 80,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)",
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 47)",
        "(line 86,col 9)-(line 86,col 72)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 55)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 63)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.MullerSolver.solve(double, double, double, double)",
      "begin_line": 122,
      "end_line": 193,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param fMin function value at the lower bound.\n     * @param fMax function value at the upper bound.\n     * @return the point at which the function value is zero.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 62)",
        "(line 125,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 133,col 9)-(line 133,col 24)",
        "(line 134,col 9)-(line 134,col 25)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 25)",
        "(line 137,col 9)-(line 137,col 36)",
        "(line 138,col 9)-(line 138,col 46)",
        "(line 140,col 9)-(line 140,col 47)",
        "(line 141,col 9)-(line 192,col 9)"
      ]
    }
  ]
}