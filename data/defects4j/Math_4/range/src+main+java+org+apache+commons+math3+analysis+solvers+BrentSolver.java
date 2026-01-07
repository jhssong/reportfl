{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver"
      ],
      "begin_line": 38,
      "end_line": 234,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for finding zeros of real univariate functions.\n * The function should be continuous but not necessarily smooth.\n * The {@code solve} method returns a zero {@code x} of the function {@code f}\n * in the given interval {@code [a, b]} to within a tolerance\n * {@code 6 eps abs(x) + t} where {@code eps} is the relative accuracy and\n * {@code t} is the absolute accuracy.\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.BrentSolver()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.BrentSolver(double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.BrentSolver(double, double)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.BrentSolver(double, double, double)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.doSolve()",
      "begin_line": 83,
      "end_line": 124,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 30)",
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 90,col 47)",
        "(line 91,col 9)-(line 91,col 72)",
        "(line 93,col 9)-(line 93,col 42)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 49)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BrentSolver.brent(double, double, double, double)",
      "begin_line": 142,
      "end_line": 233,
      "comment": "\n     * Search for a zero inside the provided interval.\n     * This implementation is based on the algorithm described at page 58 of\n     * the book\n     * \u003cquote\u003e\n     *  \u003cb\u003eAlgorithms for Minimization Without Derivatives\u003c/b\u003e\n     *  \u003cit\u003eRichard P. Brent\u003c/it\u003e\n     *  Dover 0-486-41998-3\n     * \u003c/quote\u003e\n     *\n     * @param lo Lower bound of the search interval.\n     * @param hi Higher bound of the search interval.\n     * @param fLo Function value at the lower bound of the search interval.\n     * @param fHi Function value at the higher bound of the search interval.\n     * @return the value where the function is zero.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 22)",
        "(line 145,col 9)-(line 145,col 24)",
        "(line 146,col 9)-(line 146,col 22)",
        "(line 147,col 9)-(line 147,col 24)",
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 151,col 21)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 154,col 9)-(line 154,col 49)",
        "(line 156,col 9)-(line 232,col 9)"
      ]
    }
  ]
}