{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 43,
      "end_line": 136,
      "comment": "\n * Implements the \u003cem\u003eSecant\u003c/em\u003e method for root-finding (approximating a\n * zero of a univariate real function). The solution that is maintained is\n * not bracketed, and as such convergence is not guaranteed.\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * \u003cp\u003eNote that since release 3.0 this class implements the actual\n * \u003cem\u003eSecant\u003c/em\u003e algorithm, and not a modified one. As such, the 3.0 version\n * is not backwards compatible with previous versions. To use an algorithm\n * similar to the pre-3.0 releases, use the\n * {@link IllinoisSolver \u003cem\u003eIllinois\u003c/em\u003e} algorithm or the\n * {@link PegasusSolver \u003cem\u003ePegasus\u003c/em\u003e} algorithm.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.SecantSolver.SecantSolver(double)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.SecantSolver.SecantSolver(double, double)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.SecantSolver.doSolve()",
      "begin_line": 74,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)",
        "(line 80,col 9)-(line 80,col 29)",
        "(line 81,col 9)-(line 81,col 46)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 95,col 9)-(line 95,col 33)",
        "(line 98,col 9)-(line 98,col 55)",
        "(line 99,col 9)-(line 99,col 50)",
        "(line 100,col 9)-(line 100,col 50)",
        "(line 103,col 9)-(line 133,col 9)"
      ]
    }
  ]
}