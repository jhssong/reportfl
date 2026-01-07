{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/solvers/BaseSecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseSecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver",
        "org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver\u003corg.apache.commons.math.analysis.UnivariateRealFunction\u003e"
      ],
      "begin_line": 48,
      "end_line": 262,
      "comment": "\n * Base class for all bracketing \u003cem\u003eSecant\u003c/em\u003e-based methods for root-finding\n * (approximating a zero of a univariate real function).\n *\n * \u003cp\u003eImplementation of the {@link RegulaFalsiSolver \u003cem\u003eRegula Falsi\u003c/em\u003e} and\n * {@link IllinoisSolver \u003cem\u003eIllinois\u003c/em\u003e} methods is based on the\n * following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eA modified regula falsi method for computing the root of an\n * equation\u003c/em\u003e, BIT Numerical Mathematics, volume 11, number 2,\n * pages 168-174, Springer, 1971.\u003c/p\u003e\n *\n * \u003cp\u003eImplementation of the {@link PegasusSolver \u003cem\u003ePegasus\u003c/em\u003e} method is\n * based on the following article: M. Dowell and P. Jarratt,\n * \u003cem\u003eThe \"Pegasus\" method for computing the root of an equation\u003c/em\u003e,\n * BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,\n * 1972.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link SecantSolver \u003cem\u003eSecant\u003c/em\u003e} method is \u003cem\u003enot\u003c/em\u003e a\n * bracketing method, so it is not implemented here. It has a separate\n * implementation.\u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "allowed"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The kinds of solutions that the algorithm may accept. "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " The \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy absolute accuracy\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 32)",
        "(line 69,col 9)-(line 69,col 49)",
        "(line 70,col 9)-(line 70,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, double, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 80,
      "end_line": 86,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy relative accuracy\n     * @param absoluteAccuracy absolute accuracy\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 49)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.BaseSecantSolver(double, double, double, org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Maximum relative error.\n     * @param absoluteAccuracy Maximum absolute error.\n     * @param functionValueAccuracy Maximum function value error.\n     * @param method \u003cem\u003eSecant\u003c/em\u003e-based root-finding method to use\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 73)",
        "(line 101,col 9)-(line 101,col 49)",
        "(line 102,col 9)-(line 102,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolutions)",
      "begin_line": 106,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolutions)",
      "begin_line": 113,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.solve(int, org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 121,
      "end_line": 125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseSecantSolver.doSolve()",
      "begin_line": 128,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 46)",
        "(line 133,col 9)-(line 133,col 46)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 146,col 9)-(line 146,col 33)",
        "(line 149,col 9)-(line 149,col 55)",
        "(line 150,col 9)-(line 150,col 50)",
        "(line 151,col 9)-(line 151,col 50)",
        "(line 155,col 9)-(line 155,col 33)",
        "(line 158,col 9)-(line 243,col 9)"
      ]
    }
  ]
}