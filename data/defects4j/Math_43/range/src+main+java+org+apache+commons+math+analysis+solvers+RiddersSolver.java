{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/analysis/solvers/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 33,
      "end_line": 139,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\n * Systems, 26 (1979), 979 - 980.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.RiddersSolver()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.RiddersSolver(double)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.RiddersSolver(double, double)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.RiddersSolver.doSolve()",
      "begin_line": 65,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 30)",
        "(line 68,col 9)-(line 68,col 30)",
        "(line 72,col 9)-(line 72,col 24)",
        "(line 73,col 9)-(line 73,col 46)",
        "(line 74,col 9)-(line 74,col 24)",
        "(line 75,col 9)-(line 75,col 46)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 35)",
        "(line 86,col 9)-(line 86,col 62)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 88,col 9)-(line 88,col 62)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 91,col 9)-(line 137,col 9)"
      ]
    }
  ]
}