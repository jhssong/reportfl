{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 36,
      "end_line": 229,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for finding zeros of real univariate functions.\n * The function should be continuous but not necessarily smooth.\n * The {@code solve} method returns a zero {@code x} of the function {@code f}\n * in the given interval {@code [a, b]} to within a tolerance\n * {@code 6 eps abs(x) + t} where {@code eps} is the relative accuracy and\n * {@code t} is the absolute accuracy.\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double, double)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double, double, double)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.doSolve()",
      "begin_line": 81,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)",
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 47)",
        "(line 86,col 9)-(line 86,col 72)",
        "(line 88,col 9)-(line 88,col 42)",
        "(line 91,col 9)-(line 91,col 57)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 49)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 108,col 9)-(line 108,col 49)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.brent(double, double, double, double)",
      "begin_line": 137,
      "end_line": 228,
      "comment": "\n     * Search for a zero inside the provided interval.\n     * This implementation is based on the algorithm described at page 58 of\n     * the book\n     * \u003cquote\u003e\n     *  \u003cb\u003eAlgorithms for Minimization Without Derivatives\u003c/b\u003e\n     *  \u003cit\u003eRichard P. Brent\u003c/it\u003e\n     *  Dover 0-486-41998-3\n     * \u003c/quote\u003e\n     *\n     * @param lo Lower bound of the search interval.\n     * @param hi Higher bound of the search interval.\n     * @param fLo Function value at the lower bound of the search interval.\n     * @param fHi Function value at the higher bound of the search interval.\n     * @return the value where the function is zero.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 140,col 24)",
        "(line 141,col 9)-(line 141,col 22)",
        "(line 142,col 9)-(line 142,col 24)",
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 145,col 25)",
        "(line 146,col 9)-(line 146,col 21)",
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 149,col 49)",
        "(line 151,col 9)-(line 227,col 9)"
      ]
    }
  ]
}