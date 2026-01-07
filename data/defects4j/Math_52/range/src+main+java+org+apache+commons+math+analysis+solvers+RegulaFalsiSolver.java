{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/analysis/solvers/RegulaFalsiSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegulaFalsiSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.BaseSecantSolver"
      ],
      "begin_line": 39,
      "end_line": 78,
      "comment": "\n * Implements the \u003cem\u003eRegula Falsi\u003c/em\u003e or \u003cem\u003eFalse position\u003c/em\u003e method for\n * root-finding (approximating a zero of a univariate real function). It is a\n * modified {@link SecantSolver \u003cem\u003eSecant\u003c/em\u003e} method. Unlike the\n * \u003cem\u003eSecant\u003c/em\u003e method, convergence is guaranteed by maintaining a\n * bracketed solution.\n *\n * \u003cp\u003eThe \u003cem\u003eRegula Falsi\u003c/em\u003e method assumes that the function is continuous,\n * but not necessarily smooth.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver()",
      "begin_line": 42,
      "end_line": 44,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double, double, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 94)"
      ]
    }
  ]
}