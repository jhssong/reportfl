{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/analysis/solvers/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver"
      ],
      "begin_line": 43,
      "end_line": 372,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see\n * \u003cquote\u003e\n *  \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e\n *  ISBN 048641454X, chapter 8.\n * \u003c/quote\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\n * The algorithm requires a bracketing condition.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "complexSolver"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Complex solver. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double, double)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double, double, double)",
      "begin_line": 80,
      "end_line": 84,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.doSolve()",
      "begin_line": 89,
      "end_line": 127,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 36)",
        "(line 92,col 9)-(line 92,col 36)",
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 94,col 72)",
        "(line 96,col 9)-(line 96,col 42)",
        "(line 99,col 9)-(line 99,col 63)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 105,col 55)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 116,col 55)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.laguerre(double, double, double, double)",
      "begin_line": 149,
      "end_line": 170,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * Despite the bracketing condition, the root returned by\n     * {@link LaguerreSolver.ComplexSolver#solve(Complex[],Complex)} may\n     * not be a real zero inside {@code [min, max]}.\n     * For example, \u003ccode\u003ep(x) \u003d x\u003csup\u003e3\u003c/sup\u003e + 1,\u003c/code\u003e\n     * with {@code min \u003d -2}, {@code max \u003d 2}, {@code initial \u003d 0}.\n     * When it occurs, this code calls\n     * {@link LaguerreSolver.ComplexSolver#solveAll(Complex[],Complex)}\n     * in order to obtain all roots and picks up one real root.\n     *\n     * @param lo Lower bound of the search interval.\n     * @param hi Higher bound of the search interval.\n     * @param fLo Function value at the lower bound of the search interval.\n     * @param fHi Function value at the higher bound of the search interval.\n     * @return the point at which the function value is zero.\n     * @deprecated This method should not be part of the public API: It will\n     * be made private in version 4.0.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 77)",
        "(line 154,col 9)-(line 154,col 64)",
        "(line 155,col 9)-(line 155,col 58)",
        "(line 156,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.solveAllComplex(double[], double)",
      "begin_line": 187,
      "end_line": 196,
      "comment": "\n     * Find all complex roots for the polynomial with the given\n     * coefficients, starting from the given initial value.\n     * \u003cbr/\u003e\n     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.\n     *\n     * @param coefficients Polynomial coefficients.\n     * @param initial Start value.\n     * @return the point at which the function value is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum number of evaluations is exceeded.\n     * @throws NullArgumentException if the {@code coefficients} is\n     * {@code null}.\n     * @throws NoDataException if the {@code coefficients} array is empty.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 193,col 23)",
        "(line 194,col 9)-(line 195,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.solveComplex(double[], double)",
      "begin_line": 213,
      "end_line": 222,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \u003cbr/\u003e\n     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.\n     *\n     * @param coefficients Polynomial coefficients.\n     * @param initial Start value.\n     * @return the point at which the function value is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum number of evaluations is exceeded.\n     * @throws NullArgumentException if the {@code coefficients} is\n     * {@code null}.\n     * @throws NoDataException if the {@code coefficients} array is empty.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 219,col 23)",
        "(line 220,col 9)-(line 221,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComplexSolver",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 227,
      "end_line": 371,
      "comment": "\n     * Class for searching all (complex) roots.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.isRoot(double, double, org.apache.commons.math3.complex.Complex)",
      "begin_line": 237,
      "end_line": 244,
      "comment": "\n         * Check whether the given complex root is actually a real zero\n         * in the given interval, within the solver tolerance level.\n         *\n         * @param min Lower bound for the interval.\n         * @param max Upper bound for the interval.\n         * @param z Complex root.\n         * @return {@code true} if z is a real zero.\n         ",
      "child_ranges": [
        "(line 238,col 13)-(line 242,col 13)",
        "(line 243,col 13)-(line 243,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.solveAll(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex)",
      "begin_line": 259,
      "end_line": 290,
      "comment": "\n         * Find all complex roots for the polynomial with the given\n         * coefficients, starting from the given initial value.\n         *\n         * @param coefficients Polynomial coefficients.\n         * @param initial Start value.\n         * @return the point at which the function value is zero.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the maximum number of evaluations is exceeded.\n         * @throws NullArgumentException if the {@code coefficients} is\n         * {@code null}.\n         * @throws NoDataException if the {@code coefficients} array is empty.\n         ",
      "child_ranges": [
        "(line 260,col 13)-(line 262,col 13)",
        "(line 263,col 13)-(line 263,col 50)",
        "(line 264,col 13)-(line 266,col 13)",
        "(line 268,col 13)-(line 268,col 51)",
        "(line 269,col 13)-(line 271,col 13)",
        "(line 274,col 13)-(line 274,col 50)",
        "(line 275,col 13)-(line 287,col 13)",
        "(line 289,col 13)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.solve(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex)",
      "begin_line": 305,
      "end_line": 370,
      "comment": "\n         * Find a complex root for the polynomial with the given coefficients,\n         * starting from the given initial value.\n         *\n         * @param coefficients Polynomial coefficients.\n         * @param initial Start value.\n         * @return the point at which the function value is zero.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the maximum number of evaluations is exceeded.\n         * @throws NullArgumentException if the {@code coefficients} is\n         * {@code null}.\n         * @throws NoDataException if the {@code coefficients} array is empty.\n         ",
      "child_ranges": [
        "(line 306,col 13)-(line 308,col 13)",
        "(line 310,col 13)-(line 310,col 50)",
        "(line 311,col 13)-(line 313,col 13)",
        "(line 315,col 13)-(line 315,col 66)",
        "(line 316,col 13)-(line 316,col 66)",
        "(line 317,col 13)-(line 317,col 76)",
        "(line 319,col 13)-(line 319,col 50)",
        "(line 320,col 13)-(line 320,col 54)",
        "(line 322,col 13)-(line 322,col 32)",
        "(line 323,col 13)-(line 324,col 65)",
        "(line 325,col 13)-(line 369,col 13)"
      ]
    }
  ]
}