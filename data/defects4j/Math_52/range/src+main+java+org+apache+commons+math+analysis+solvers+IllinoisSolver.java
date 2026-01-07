{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/analysis/solvers/IllinoisSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IllinoisSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseSecantSolver"
      ],
      "begin_line": 42,
      "end_line": 82,
      "comment": "\n * Implements the \u003cem\u003eIllinois\u003c/em\u003e method for root-finding (approximating\n * a zero of a univariate real function). It is a modified\n * {@link RegulaFalsiSolver \u003cem\u003eRegula Falsi\u003c/em\u003e} method.\n *\n * \u003cp\u003eLike the \u003cem\u003eRegula Falsi\u003c/em\u003e method, convergence is guaranteed by\n * maintaining a bracketed solution. The \u003cem\u003eIllinois\u003c/em\u003e method however,\n * should converge much faster than the original \u003cem\u003eRegula Falsi\u003c/em\u003e\n * method.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003cem\u003eIllinois\u003c/em\u003e method assumes that the function is continuous,\n * but not necessarily smooth.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.IllinoisSolver.IllinoisSolver()",
      "begin_line": 45,
      "end_line": 47,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.IllinoisSolver.IllinoisSolver(double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.IllinoisSolver.IllinoisSolver(double, double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.IllinoisSolver.IllinoisSolver(double, double, double)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 89)"
      ]
    }
  ]
}