{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/solvers/SecantSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SecantSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 39,
      "end_line": 150,
      "comment": "\n * Implements a modified version of the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/SecantMethod.html\"\u003esecant method\u003c/a\u003e\n * for approximating a zero of a real univariate function.\n * \u003cp\u003e\n * The algorithm is modified to maintain bracketing of a root by successive\n * approximations. Because of forced bracketing, convergence may be slower than\n * the unrestricted secant algorithm. However, this implementation should in\n * general outperform the\n * \u003ca href\u003d\"http://mathworld.wolfram.com/MethodofFalsePosition.html\"\u003e\n * regula falsi method.\u003c/a\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The function is assumed to be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a solver with default accuracy.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.SecantSolver(double, double)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.SecantSolver.doSolve()",
      "begin_line": 71,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 30)",
        "(line 75,col 9)-(line 75,col 33)",
        "(line 77,col 9)-(line 77,col 72)",
        "(line 84,col 9)-(line 84,col 24)",
        "(line 85,col 9)-(line 85,col 24)",
        "(line 87,col 9)-(line 87,col 46)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 94,col 9)-(line 94,col 46)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 105,col 62)",
        "(line 107,col 9)-(line 107,col 23)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 34)",
        "(line 110,col 9)-(line 148,col 9)"
      ]
    }
  ]
}