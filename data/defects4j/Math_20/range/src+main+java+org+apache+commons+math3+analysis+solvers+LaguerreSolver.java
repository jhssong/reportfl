{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/analysis/solvers/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractPolynomialSolver"
      ],
      "begin_line": 45,
      "end_line": 389,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see\n * \u003cquote\u003e\n *  \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e\n *  ISBN 048641454X, chapter 8.\n * \u003c/quote\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\n * The algorithm requires a bracketing condition.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "complexSolver"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Complex solver. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct a solver with default accuracy (1e-6).\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double, double)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.LaguerreSolver(double, double, double)",
      "begin_line": 82,
      "end_line": 86,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.doSolve()",
      "begin_line": 91,
      "end_line": 132,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)",
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 72)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 110,col 9)-(line 110,col 55)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 121,col 55)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.laguerre(double, double, double, double)",
      "begin_line": 154,
      "end_line": 175,
      "comment": "\n     * Find a real root in the given interval.\n     *\n     * Despite the bracketing condition, the root returned by\n     * {@link LaguerreSolver.ComplexSolver#solve(Complex[],Complex)} may\n     * not be a real zero inside {@code [min, max]}.\n     * For example, \u003ccode\u003ep(x) \u003d x\u003csup\u003e3\u003c/sup\u003e + 1,\u003c/code\u003e\n     * with {@code min \u003d -2}, {@code max \u003d 2}, {@code initial \u003d 0}.\n     * When it occurs, this code calls\n     * {@link LaguerreSolver.ComplexSolver#solveAll(Complex[],Complex)}\n     * in order to obtain all roots and picks up one real root.\n     *\n     * @param lo Lower bound of the search interval.\n     * @param hi Higher bound of the search interval.\n     * @param fLo Function value at the lower bound of the search interval.\n     * @param fHi Function value at the higher bound of the search interval.\n     * @return the point at which the function value is zero.\n     * @deprecated This method should not be part of the public API: It will\n     * be made private in version 4.0.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 77)",
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 160,col 58)",
        "(line 161,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.solveAllComplex(double[], double)",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\n     * Find all complex roots for the polynomial with the given\n     * coefficients, starting from the given initial value.\n     * \u003cbr/\u003e\n     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.\n     *\n     * @param coefficients Polynomial coefficients.\n     * @param initial Start value.\n     * @return the point at which the function value is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum number of evaluations is exceeded.\n     * @throws NullArgumentException if the {@code coefficients} is\n     * {@code null}.\n     * @throws NoDataException if the {@code coefficients} array is empty.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 201,col 23)",
        "(line 202,col 9)-(line 203,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.solveComplex(double[], double)",
      "begin_line": 221,
      "end_line": 233,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \u003cbr/\u003e\n     * Note: This method is not part of the API of {@link BaseUnivariateSolver}.\n     *\n     * @param coefficients Polynomial coefficients.\n     * @param initial Start value.\n     * @return the point at which the function value is zero.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum number of evaluations is exceeded.\n     * @throws NullArgumentException if the {@code coefficients} is\n     * {@code null}.\n     * @throws NoDataException if the {@code coefficients} array is empty.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 230,col 23)",
        "(line 231,col 9)-(line 232,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComplexSolver",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 238,
      "end_line": 388,
      "comment": "\n     * Class for searching all (complex) roots.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.isRoot(double, double, org.apache.commons.math3.complex.Complex)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n         * Check whether the given complex root is actually a real zero\n         * in the given interval, within the solver tolerance level.\n         *\n         * @param min Lower bound for the interval.\n         * @param max Upper bound for the interval.\n         * @param z Complex root.\n         * @return {@code true} if z is a real zero.\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 253,col 13)",
        "(line 254,col 13)-(line 254,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.solveAll(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex)",
      "begin_line": 270,
      "end_line": 304,
      "comment": "\n         * Find all complex roots for the polynomial with the given\n         * coefficients, starting from the given initial value.\n         *\n         * @param coefficients Polynomial coefficients.\n         * @param initial Start value.\n         * @return the point at which the function value is zero.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the maximum number of evaluations is exceeded.\n         * @throws NullArgumentException if the {@code coefficients} is\n         * {@code null}.\n         * @throws NoDataException if the {@code coefficients} array is empty.\n         ",
      "child_ranges": [
        "(line 274,col 13)-(line 276,col 13)",
        "(line 277,col 13)-(line 277,col 50)",
        "(line 278,col 13)-(line 280,col 13)",
        "(line 282,col 13)-(line 282,col 51)",
        "(line 283,col 13)-(line 285,col 13)",
        "(line 288,col 13)-(line 288,col 50)",
        "(line 289,col 13)-(line 301,col 13)",
        "(line 303,col 13)-(line 303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.LaguerreSolver.ComplexSolver.solve(org.apache.commons.math3.complex.Complex[], org.apache.commons.math3.complex.Complex)",
      "begin_line": 319,
      "end_line": 387,
      "comment": "\n         * Find a complex root for the polynomial with the given coefficients,\n         * starting from the given initial value.\n         *\n         * @param coefficients Polynomial coefficients.\n         * @param initial Start value.\n         * @return the point at which the function value is zero.\n         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n         * if the maximum number of evaluations is exceeded.\n         * @throws NullArgumentException if the {@code coefficients} is\n         * {@code null}.\n         * @throws NoDataException if the {@code coefficients} array is empty.\n         ",
      "child_ranges": [
        "(line 323,col 13)-(line 325,col 13)",
        "(line 327,col 13)-(line 327,col 50)",
        "(line 328,col 13)-(line 330,col 13)",
        "(line 332,col 13)-(line 332,col 66)",
        "(line 333,col 13)-(line 333,col 66)",
        "(line 334,col 13)-(line 334,col 76)",
        "(line 336,col 13)-(line 336,col 50)",
        "(line 337,col 13)-(line 337,col 54)",
        "(line 339,col 13)-(line 339,col 32)",
        "(line 340,col 13)-(line 341,col 65)",
        "(line 342,col 13)-(line 386,col 13)"
      ]
    }
  ]
}