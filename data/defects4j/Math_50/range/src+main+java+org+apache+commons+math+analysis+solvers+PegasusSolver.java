{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/analysis/solvers/PegasusSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PegasusSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseSecantSolver"
      ],
      "begin_line": 43,
      "end_line": 83,
      "comment": "\n * Implements the \u003cem\u003ePegasus\u003c/em\u003e method for root-finding (approximating\n * a zero of a univariate real function). It is a modified\n * {@link RegulaFalsiSolver \u003cem\u003eRegula Falsi\u003c/em\u003e} method.\n *\n * \u003cp\u003eLike the \u003cem\u003eRegula Falsi\u003c/em\u003e method, convergence is guaranteed by\n * maintaining a bracketed solution. The \u003cem\u003ePegasus\u003c/em\u003e method however,\n * should converge much faster than the original \u003cem\u003eRegula Falsi\u003c/em\u003e method.\n * Furthermore, it should converge faster than the\n * {@link IllinoisSolver \u003cem\u003eIllinois\u003c/em\u003e} method, another\n * \u003cem\u003eRegula Falsi\u003c/em\u003e-based method.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003cem\u003ePegasus\u003c/em\u003e method assumes that the function is continuous,\n * but not necessarily smooth.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eThe \"Pegasus\" method for computing the root of an equation\u003c/em\u003e,\n * BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,\n * 1972.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.PegasusSolver.PegasusSolver()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.PegasusSolver.PegasusSolver(double)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.PegasusSolver.PegasusSolver(double, double)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.PegasusSolver.PegasusSolver(double, double, double)",
      "begin_line": 77,
      "end_line": 81,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 89)"
      ]
    }
  ]
}