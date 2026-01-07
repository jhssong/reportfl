{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/analysis/solvers/MullerSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 48,
      "end_line": 196,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions.\n * This class differs from {@link MullerSolver} in the way it avoids complex\n * operations.\u003c/p\u003e\n * Muller\u0027s original method would have function evaluation at complex point.\n * Since our f(x) is real, we have to find ways to avoid that. Bracketing\n * condition is one way to go: by requiring bracketing in every iteration,\n * the newly computed approximation is guaranteed to be real.\u003c/p\u003e\n * \u003cp\u003e\n * Normally Muller\u0027s method converges quadratically in the vicinity of a\n * zero, however it may be very slow in regions far away from zeros. For\n * example, f(x) \u003d exp(x) - 1, min \u003d -50, max \u003d 100. In such case we use\n * bisection as a safety backup if it performs very poorly.\u003c/p\u003e\n * \u003cp\u003e\n * The formulas here use divided differences directly.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @see MullerSolver2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver(double)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.MullerSolver(double, double)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.doSolve()",
      "begin_line": 82,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 36)",
        "(line 85,col 9)-(line 85,col 36)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 88,col 9)-(line 88,col 72)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 35)",
        "(line 108,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver.solve(double, double, double, double)",
      "begin_line": 124,
      "end_line": 195,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param fMin function value at the lower bound.\n     * @param fMax function value at the upper bound.\n     * @return the point at which the function value is zero.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 62)",
        "(line 127,col 9)-(line 127,col 62)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 135,col 9)-(line 135,col 24)",
        "(line 136,col 9)-(line 136,col 25)",
        "(line 137,col 9)-(line 137,col 24)",
        "(line 138,col 9)-(line 138,col 25)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 142,col 9)-(line 142,col 47)",
        "(line 143,col 9)-(line 194,col 9)"
      ]
    }
  ]
}