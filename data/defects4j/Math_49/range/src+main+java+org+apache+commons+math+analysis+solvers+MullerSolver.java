{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/analysis/solvers/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 48,
      "end_line": 195,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions.\n * This class differs from {@link MullerSolver} in the way it avoids complex\n * operations.\u003c/p\u003e\n * Muller\u0027s original method would have function evaluation at complex point.\n * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n * condition is one way to go: by requiring bracketing in every iteration,\n * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n * \u003cp\u003e\n * Normally Muller\u0027s method converges quadratically in the vicinity of a\n * zero, however it may be very slow in regions far away from zeros. For\n * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n * \u003cp\u003e\n * The formulas here use divided differences directly.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n * @see MullerSolver2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver(double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver(double, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.doSolve()",
      "begin_line": 81,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 36)",
        "(line 85,col 9)-(line 85,col 47)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 92,col 9)-(line 92,col 55)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 55)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 63)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 35)",
        "(line 107,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(double, double, double, double)",
      "begin_line": 123,
      "end_line": 194,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param fMin function value at the lower bound.\n     * @param fMax function value at the upper bound.\n     * @return the point at which the function value is zero.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 126,col 62)",
        "(line 127,col 9)-(line 127,col 72)",
        "(line 134,col 9)-(line 134,col 24)",
        "(line 135,col 9)-(line 135,col 25)",
        "(line 136,col 9)-(line 136,col 24)",
        "(line 137,col 9)-(line 137,col 25)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 141,col 9)-(line 141,col 47)",
        "(line 142,col 9)-(line 193,col 9)"
      ]
    }
  ]
}