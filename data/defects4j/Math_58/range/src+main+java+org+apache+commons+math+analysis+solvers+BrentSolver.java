{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver"
      ],
      "begin_line": 36,
      "end_line": 230,
      "comment": "\n * This class implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for finding zeros of real univariate functions.\n * The function should be continuous but not necessarily smooth.\n * The {@code solve} method returns a zero {@code x} of the function {@code f}\n * in the given interval {@code [a, b]} to within a tolerance\n * {@code 6 eps abs(x) + t} where {@code eps} is the relative accuracy and\n * {@code t} is the absolute accuracy.\n * The given interval must bracket the root.\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double, double)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double, double, double)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.doSolve()",
      "begin_line": 82,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 30)",
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 92,col 9)-(line 92,col 57)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 98,col 9)-(line 98,col 49)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.brent(double, double, double, double)",
      "begin_line": 138,
      "end_line": 229,
      "comment": "\n     * Search for a zero inside the provided interval.\n     * This implemenation is based on the algorithm described at page 58 of\n     * the book\n     * \u003cquote\u003e\n     *  \u003cb\u003eAlgorithms for Minimization Without Derivatives\u003c/b\u003e\n     *  \u003cit\u003eRichard P. Brent\u003c/it\u003e\n     *  Dover 0-486-41998-3\n     * \u003c/quote\u003e\n     *\n     * @param lo Lower bound of the search interval.\n     * @param hi Higher bound of the search interval.\n     * @param fLo Function value at the lower bound of the search interval.\n     * @param fHi Function value at the higher bound of the search interval.\n     * @return the value where the function is zero.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 22)",
        "(line 141,col 9)-(line 141,col 24)",
        "(line 142,col 9)-(line 142,col 22)",
        "(line 143,col 9)-(line 143,col 24)",
        "(line 144,col 9)-(line 144,col 21)",
        "(line 145,col 9)-(line 145,col 23)",
        "(line 146,col 9)-(line 146,col 25)",
        "(line 147,col 9)-(line 147,col 21)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 150,col 49)",
        "(line 152,col 9)-(line 228,col 9)"
      ]
    }
  ]
}