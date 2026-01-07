{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/RiddersSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RiddersSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 35,
      "end_line": 143,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RiddersMethod.html\"\u003e\n * Ridders\u0027 Method\u003c/a\u003e for root finding of real univariate functions. For\n * reference, see C. Ridders, \u003ci\u003eA new algorithm for computing a single root\n * of a real continuous function \u003c/i\u003e, IEEE Transactions on Circuits and\n * Systems, 26 (1979), 979 - 980.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RiddersSolver.RiddersSolver()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RiddersSolver.RiddersSolver(double)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RiddersSolver.RiddersSolver(double, double)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.RiddersSolver.doSolve()",
      "begin_line": 67,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 72,col 30)",
        "(line 76,col 9)-(line 76,col 24)",
        "(line 77,col 9)-(line 77,col 46)",
        "(line 78,col 9)-(line 78,col 24)",
        "(line 79,col 9)-(line 79,col 46)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 35)",
        "(line 90,col 9)-(line 90,col 62)",
        "(line 91,col 9)-(line 91,col 72)",
        "(line 92,col 9)-(line 92,col 62)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 141,col 9)"
      ]
    }
  ]
}