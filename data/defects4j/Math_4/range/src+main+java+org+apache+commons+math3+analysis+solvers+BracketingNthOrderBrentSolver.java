{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BracketingNthOrderBrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketingNthOrderBrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
        "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver\u003corg.apache.commons.math3.analysis.UnivariateFunction\u003e"
      ],
      "begin_line": 45,
      "end_line": 413,
      "comment": "\n * This class implements a modification of the \u003ca\n * href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e Brent algorithm\u003c/a\u003e.\n * \u003cp\u003e\n * The changes with respect to the original Brent algorithm are:\n * \u003cul\u003e\n *   \u003cli\u003ethe returned value is chosen in the current interval according\n *   to user specified {@link AllowedSolution},\u003c/li\u003e\n *   \u003cli\u003ethe maximal order for the invert polynomial root search is\n *   user-specified instead of being invert quadratic only\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMAL_ORDER"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMAL_AGING"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Maximal aging triggering an attempt to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "REDUCTION_FACTOR"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Reduction factor for attempts to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalOrder"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "allowed"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The kinds of solutions that the algorithm may accept. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Construct a solver with default accuracy and maximal order (1e-6 and 5 respectively)\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, int)",
      "begin_line": 81,
      "end_line": 90,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 41)",
        "(line 89,col 9)-(line 89,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, double, int)",
      "begin_line": 100,
      "end_line": 110,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 109,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, double, double, int)",
      "begin_line": 121,
      "end_line": 132,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 73)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.getMaximalOrder()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Get the maximal order.\n     * @return maximal order\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.doSolve()",
      "begin_line": 144,
      "end_line": 355,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 56)",
        "(line 151,col 9)-(line 151,col 56)",
        "(line 152,col 9)-(line 152,col 24)",
        "(line 153,col 9)-(line 153,col 31)",
        "(line 154,col 9)-(line 154,col 24)",
        "(line 155,col 9)-(line 155,col 41)",
        "(line 158,col 9)-(line 158,col 43)",
        "(line 159,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 43)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 21)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 51)",
        "(line 202,col 9)-(line 202,col 46)",
        "(line 203,col 9)-(line 203,col 46)",
        "(line 204,col 9)-(line 204,col 40)",
        "(line 205,col 9)-(line 205,col 25)",
        "(line 206,col 9)-(line 206,col 42)",
        "(line 207,col 9)-(line 207,col 42)",
        "(line 208,col 9)-(line 208,col 40)",
        "(line 209,col 9)-(line 209,col 25)",
        "(line 212,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.guessX(double, double[], double[], int, int)",
      "begin_line": 371,
      "end_line": 390,
      "comment": " Guess an x value by n\u003csup\u003eth\u003c/sup\u003e order inverse polynomial interpolation.\n     * \u003cp\u003e\n     * The x value is guessed by evaluating polynomial Q(y) at y \u003d targetY, where Q\n     * is built such that for all considered points (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e),\n     * Q(y\u003csub\u003ei\u003c/sub\u003e) \u003d x\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * @param targetY target value for y\n     * @param x reference points abscissas for interpolation,\n     * note that this array \u003cem\u003eis\u003c/em\u003e modified during computation\n     * @param y reference points ordinates for interpolation\n     * @param start start index of the points to consider (inclusive)\n     * @param end end index of the points to consider (exclusive)\n     * @return guessed root (will be a NaN if two points share the same y)\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 380,col 9)",
        "(line 383,col 9)-(line 383,col 22)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.solve(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 393,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 39)",
        "(line 399,col 9)-(line 399,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver.solve(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 403,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 61)"
      ]
    }
  ]
}