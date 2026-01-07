{
  "filepath": "/tmp/Math-35b/src/main/java/org/apache/commons/math3/analysis/solvers/BisectionSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BisectionSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 29,
      "end_line": 90,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/Bisection.html\"\u003e\n * bisection algorithm\u003c/a\u003e for finding zeros of univariate real functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BisectionSolver.BisectionSolver()",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BisectionSolver.BisectionSolver(double)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BisectionSolver.BisectionSolver(double, double)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BisectionSolver.doSolve()",
      "begin_line": 61,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 30)",
        "(line 64,col 9)-(line 64,col 30)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 17)",
        "(line 68,col 9)-(line 68,col 18)",
        "(line 69,col 9)-(line 69,col 20)",
        "(line 71,col 9)-(line 88,col 9)"
      ]
    }
  ]
}