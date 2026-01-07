{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 41,
      "end_line": 132,
      "comment": "\n * Implements the \u003cem\u003eSecant\u003c/em\u003e method for root-finding (approximating a\n * zero of a univariate real function). The solution that is maintained is\n * not bracketed, and as such convergence is not guaranteed.\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * \u003cp\u003eNote that since release 3.0 this class implements the actual\n * \u003cem\u003eSecant\u003c/em\u003e algorithm, and not a modified one. As such, the 3.0 version\n * is not backwards compatible with previous versions. To use an algorithm\n * similar to the pre-3.0 releases, use the\n * {@link IllinoisSolver \u003cem\u003eIllinois\u003c/em\u003e} algorithm or the\n * {@link PegasusSolver \u003cem\u003ePegasus\u003c/em\u003e} algorithm.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 47,
      "end_line": 49,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(double)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(double, double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.doSolve()",
      "begin_line": 72,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)",
        "(line 76,col 9)-(line 76,col 29)",
        "(line 77,col 9)-(line 77,col 46)",
        "(line 78,col 9)-(line 78,col 46)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 91,col 33)",
        "(line 94,col 9)-(line 94,col 55)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 99,col 9)-(line 129,col 9)"
      ]
    }
  ]
}