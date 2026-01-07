{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/analysis/solvers/BracketingNthOrderBrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketingNthOrderBrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.AbstractUnivariateSolver",
        "org.apache.commons.math.analysis.solvers.BracketedUnivariateSolver\u003corg.apache.commons.math.analysis.UnivariateFunction\u003e"
      ],
      "begin_line": 43,
      "end_line": 403,
      "comment": "\n * This class implements a modification of the \u003ca\n * href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e Brent algorithm\u003c/a\u003e.\n * \u003cp\u003e\n * The changes with respect to the original Brent algorithm are:\n * \u003cul\u003e\n *   \u003cli\u003ethe returned value is chosen in the current interval according\n *   to user specified {@link AllowedSolution},\u003c/li\u003e\n *   \u003cli\u003ethe maximal order for the invert polynomial root search is\n *   user-specified instead of being invert quadratic only\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMAL_ORDER"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMAL_AGING"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Maximal aging triggering an attempt to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "REDUCTION_FACTOR"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Reduction factor for attempts to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalOrder"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "allowed"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The kinds of solutions that the algorithm may accept. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Construct a solver with default accuracy and maximal order (1e-6 and 5 respectively)\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, int)",
      "begin_line": 79,
      "end_line": 88,
      "comment": "\n     * Construct a solver.\n     *\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 41)",
        "(line 87,col 9)-(line 87,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, double, int)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 50)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 41)",
        "(line 107,col 9)-(line 107,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.BracketingNthOrderBrentSolver(double, double, double, int)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 73)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.getMaximalOrder()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " Get the maximal order.\n     * @return maximal order\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.doSolve()",
      "begin_line": 142,
      "end_line": 351,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 56)",
        "(line 147,col 9)-(line 147,col 56)",
        "(line 148,col 9)-(line 148,col 24)",
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 24)",
        "(line 151,col 9)-(line 151,col 41)",
        "(line 154,col 9)-(line 154,col 43)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 161,col 43)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 21)",
        "(line 168,col 9)-(line 168,col 28)",
        "(line 169,col 9)-(line 192,col 9)",
        "(line 195,col 9)-(line 195,col 51)",
        "(line 198,col 9)-(line 198,col 46)",
        "(line 199,col 9)-(line 199,col 46)",
        "(line 200,col 9)-(line 200,col 40)",
        "(line 201,col 9)-(line 201,col 25)",
        "(line 202,col 9)-(line 202,col 42)",
        "(line 203,col 9)-(line 203,col 42)",
        "(line 204,col 9)-(line 204,col 40)",
        "(line 205,col 9)-(line 205,col 25)",
        "(line 208,col 9)-(line 349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.guessX(double, double[], double[], int, int)",
      "begin_line": 367,
      "end_line": 386,
      "comment": " Guess an x value by n\u003csup\u003eth\u003c/sup\u003e order inverse polynomial interpolation.\n     * \u003cp\u003e\n     * The x value is guessed by evaluating polynomial Q(y) at y \u003d targetY, where Q\n     * is built such that for all considered points (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e),\n     * Q(y\u003csub\u003ei\u003c/sub\u003e) \u003d x\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * @param targetY target value for y\n     * @param x reference points abscissas for interpolation,\n     * note that this array \u003cem\u003eis\u003c/em\u003e modified during computation\n     * @param y reference points ordinates for interpolation\n     * @param start start index of the points to consider (inclusive)\n     * @param end end index of the points to consider (exclusive)\n     * @return guessed root (will be a NaN if two points share the same y)\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 376,col 9)",
        "(line 379,col 9)-(line 379,col 22)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)",
      "begin_line": 389,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 39)",
        "(line 392,col 9)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver.solve(int, org.apache.commons.math.analysis.UnivariateFunction, double, double, double, org.apache.commons.math.analysis.solvers.AllowedSolution)",
      "begin_line": 396,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 39)",
        "(line 400,col 9)-(line 400,col 61)"
      ]
    }
  ]
}