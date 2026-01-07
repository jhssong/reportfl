{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BaseSecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseSecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
        "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver\u003corg.apache.commons.math3.analysis.UnivariateFunction\u003e"
      ],
      "begin_line": 49,
      "end_line": 279,
      "comment": "\n * Base class for all bracketing \u003cem\u003eSecant\u003c/em\u003e-based methods for root-finding\n * (approximating a zero of a univariate real function).\n *\n * \u003cp\u003eImplementation of the {@link RegulaFalsiSolver \u003cem\u003eRegula Falsi\u003c/em\u003e} and\n * {@link IllinoisSolver \u003cem\u003eIllinois\u003c/em\u003e} methods is based on the\n * following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation of the {@link PegasusSolver \u003cem\u003ePegasus\u003c/em\u003e} method is\n * based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eThe \"Pegasus\" method for computing the root of an equation\u003c/em\u003e,\n * BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,\n * 1972.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link SecantSolver \u003cem\u003eSecant\u003c/em\u003e} method is \u003cem\u003enot\u003c/em\u003e a\n * bracketing method, so it is not implemented here. It has a separate\n * implementation.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "allowed"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The kinds of solutions that the algorithm may accept. "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 32)",
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, double, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 81,
      "end_line": 87,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, double, double, org.apache.commons.math3.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 73)",
        "(line 102,col 9)-(line 102,col 48)",
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 107,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 114,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, double)",
      "begin_line": 122,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseSecantSolver.doSolve()",
      "begin_line": 134,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws ConvergenceException if the algorithm failed due to finite\n     * precision.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 29)",
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 166,col 9)-(line 260,col 9)"
      ]
    }
  ]
}