{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/RegulaFalsiSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegulaFalsiSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseSecantSolver"
      ],
      "begin_line": 56,
      "end_line": 95,
      "comment": "\n * Implements the \u003cem\u003eRegula Falsi\u003c/em\u003e or \u003cem\u003eFalse position\u003c/em\u003e method for\n * root-finding (approximating a zero of a univariate real function). It is a\n * modified {@link SecantSolver \u003cem\u003eSecant\u003c/em\u003e} method.\n *\n * \u003cp\u003eThe \u003cem\u003eRegula Falsi\u003c/em\u003e method is included for completeness, for\n * testing purposes, for educational purposes, for comparison to other\n * algorithms, etc. It is however \u003cstrong\u003enot\u003c/strong\u003e intended to be used\n * for actual problems, as one of the bounds often remains fixed, resulting\n * in very slow convergence. Instead, one of the well-known modified\n * \u003cem\u003eRegula Falsi\u003c/em\u003e algorithms can be used ({@link IllinoisSolver\n * \u003cem\u003eIllinois\u003c/em\u003e} or {@link PegasusSolver \u003cem\u003ePegasus\u003c/em\u003e}). These two\n * algorithms solve the fundamental issues of the original \u003cem\u003eRegula\n * Falsi\u003c/em\u003e algorithm, and greatly out-performs it for most, if not all,\n * (practical) functions.\n *\n * \u003cp\u003eUnlike the \u003cem\u003eSecant\u003c/em\u003e method, the \u003cem\u003eRegula Falsi\u003c/em\u003e guarantees\n * convergence, by maintaining a bracketed solution. Note however, that due to\n * the finite/limited precision of Java\u0027s {@link Double double} type, which is\n * used in this implementation, the algorithm may get stuck in a situation\n * where it no longer makes any progress. Such cases are detected and result\n * in a {@code ConvergenceException} exception being thrown. In other words,\n * the algorithm theoretically guarantees convergence, but the implementation\n * does not.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003cem\u003eRegula Falsi\u003c/em\u003e method assumes that the function is continuous,\n * but not necessarily smooth.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver()",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Construct a solver with default accuracy (1e-6). ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double, double)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver.RegulaFalsiSolver(double, double, double)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Maximum function value error.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 94)"
      ]
    }
  ]
}