{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/dfp/BracketingNthOrderBrentSolverDFP.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketingNthOrderBrentSolverDFP",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 438,
      "comment": "\n * This class implements a modification of the \u003ca\n * href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e Brent algorithm\u003c/a\u003e.\n * \u003cp\u003e\n * The changes with respect to the original Brent algorithm are:\n * \u003cul\u003e\n *   \u003cli\u003ethe returned value is chosen in the current interval according\n *   to user specified {@link AllowedSolution},\u003c/li\u003e\n *   \u003cli\u003ethe maximal order for the invert polynomial root search is\n *   user-specified instead of being invert quadratic only\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMAL_AGING"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Maximal aging triggering an attempt to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalOrder"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Evaluations counter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.BracketingNthOrderBrentSolverDFP(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, int)",
      "begin_line": 72,
      "end_line": 84,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 81,col 9)-(line 81,col 49)",
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getMaximalOrder()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Get the maximal order.\n     * @return maximal order\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getMaxEvaluations()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Get the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getEvaluations()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getAbsoluteAccuracy()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Get the absolute accuracy.\n     * @return absolute accuracy\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getRelativeAccuracy()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Get the relative accuracy.\n     * @return relative accuracy\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.getFunctionValueAccuracy()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Get the function accuracy.\n     * @return function accuracy\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.solve(int, org.apache.commons.math.dfp.UnivariateDfpFunction, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.analysis.solvers.AllowedSolution)",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Solve for a zero in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a value where the function is zero.\n     * @throws org.apache.commons.math.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.solve(int, org.apache.commons.math.dfp.UnivariateDfpFunction, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp, org.apache.commons.math.analysis.solvers.AllowedSolution)",
      "begin_line": 180,
      "end_line": 401,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a value where the function is zero.\n     * @throws org.apache.commons.math.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 34)",
        "(line 188,col 9)-(line 188,col 45)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 40)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 50)",
        "(line 196,col 9)-(line 196,col 19)",
        "(line 197,col 9)-(line 197,col 26)",
        "(line 198,col 9)-(line 198,col 19)",
        "(line 201,col 9)-(line 201,col 37)",
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 210,col 29)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 21)",
        "(line 217,col 9)-(line 217,col 28)",
        "(line 218,col 9)-(line 243,col 9)",
        "(line 246,col 9)-(line 246,col 45)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 43)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 29)",
        "(line 253,col 9)-(line 253,col 25)",
        "(line 254,col 9)-(line 254,col 39)",
        "(line 255,col 9)-(line 255,col 39)",
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 257,col 29)",
        "(line 258,col 9)-(line 258,col 25)",
        "(line 261,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.dfp.BracketingNthOrderBrentSolverDFP.guessX(org.apache.commons.math.dfp.Dfp, org.apache.commons.math.dfp.Dfp[], org.apache.commons.math.dfp.Dfp[], int, int)",
      "begin_line": 417,
      "end_line": 436,
      "comment": " Guess an x value by n\u003csup\u003eth\u003c/sup\u003e order inverse polynomial interpolation.\n     * \u003cp\u003e\n     * The x value is guessed by evaluating polynomial Q(y) at y \u003d targetY, where Q\n     * is built such that for all considered points (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e),\n     * Q(y\u003csub\u003ei\u003c/sub\u003e) \u003d x\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * @param targetY target value for y\n     * @param x reference points abscissas for interpolation,\n     * note that this array \u003cem\u003eis\u003c/em\u003e modified during computation\n     * @param y reference points ordinates for interpolation\n     * @param start start index of the points to consider (inclusive)\n     * @param end end index of the points to consider (exclusive)\n     * @return guessed root (will be a NaN if two points share the same y)\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 426,col 9)",
        "(line 429,col 9)-(line 429,col 35)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 434,col 18)"
      ]
    }
  ]
}