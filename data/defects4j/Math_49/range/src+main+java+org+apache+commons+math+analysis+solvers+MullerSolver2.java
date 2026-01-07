{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/analysis/solvers/MullerSolver2.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MullerSolver2",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 48,
      "end_line": 164,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/MullersMethod.html\"\u003e\n * Muller\u0027s Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e, ISBN 0070124477,\n * chapter 3.\n * \u003cp\u003e\n * Muller\u0027s method applies to both real and complex functions, but here we\n * restrict ourselves to real functions.\u003c\n * This class differs from {@link MullerSolver} in the way it avoids complex\n * operations.\u003c/p\u003e\n * Except for the initial [min, max], it does not require bracketing\n * condition, e.g. f(x0), f(x1), f(x2) can have the same sign. If complex\n * number arises in the computation, we simply use its modulus as real\n * approximation.\u003c/p\u003e\n * \u003cp\u003e\n * Because the interval may not be bracketing, bisection alternative is\n * not applicable here. However in practice our treatment usually works\n * well, especially near real zeroes where the imaginary part of complex\n * approximation is often negligible.\u003c/p\u003e\n * \u003cp\u003e\n * The formulas here do not use divided differences directly.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n * @see MullerSolver\n "
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
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2.MullerSolver2()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2.MullerSolver2(double)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2.MullerSolver2(double, double)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.MullerSolver2.doSolve()",
      "begin_line": 81,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 36)",
        "(line 84,col 9)-(line 84,col 36)",
        "(line 86,col 9)-(line 86,col 33)",
        "(line 88,col 9)-(line 88,col 62)",
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 72)",
        "(line 96,col 9)-(line 96,col 24)",
        "(line 97,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 102,col 46)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 36)",
        "(line 112,col 9)-(line 112,col 46)",
        "(line 114,col 9)-(line 114,col 47)",
        "(line 115,col 9)-(line 162,col 9)"
      ]
    }
  ]
}