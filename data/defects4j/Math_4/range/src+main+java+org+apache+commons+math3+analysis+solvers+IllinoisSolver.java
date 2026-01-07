{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/IllinoisSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IllinoisSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseSecantSolver"
      ],
      "begin_line": 44,
      "end_line": 83,
      "comment": "\n * Implements the \u003cem\u003eIllinois\u003c/em\u003e method for root-finding (approximating\n * a zero of a univariate real function). It is a modified\n * {@link RegulaFalsiSolver \u003cem\u003eRegula Falsi\u003c/em\u003e} method.\n *\n * \u003cp\u003eLike the \u003cem\u003eRegula Falsi\u003c/em\u003e method, convergence is guaranteed by\n * maintaining a bracketed solution. The \u003cem\u003eIllinois\u003c/em\u003e method however,\n * should converge much faster than the original \u003cem\u003eRegula Falsi\u003c/em\u003e\n * method. Furthermore, this implementation of the \u003cem\u003eIllinois\u003c/em\u003e method\n * should not suffer from the same implementation issues as the \u003cem\u003eRegula\n * Falsi\u003c/em\u003e method, which may fail to convergence in certain cases.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003cem\u003eIllinois\u003c/em\u003e method assumes that the function is continuous,\n * but not necessarily smooth.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.IllinoisSolver.IllinoisSolver()",
      "begin_line": 47,
      "end_line": 49,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.IllinoisSolver.IllinoisSolver(double)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.IllinoisSolver.IllinoisSolver(double, double)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 67)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.IllinoisSolver.IllinoisSolver(double, double, double)",
      "begin_line": 78,
      "end_line": 82,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 89)"
      ]
    }
  ]
}