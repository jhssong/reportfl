{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/dfp/BracketingNthOrderBrentSolverDFP.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketingNthOrderBrentSolverDFP",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 437,
      "comment": "\n * This class implements a modification of the \u003ca\n * href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e Brent algorithm\u003c/a\u003e.\n * \u003cp\u003e\n * The changes with respect to the original Brent algorithm are:\n * \u003cul\u003e\n *   \u003cli\u003ethe returned value is chosen in the current interval according\n *   to user specified {@link AllowedSolution},\u003c/li\u003e\n *   \u003cli\u003ethe maximal order for the invert polynomial root search is\n *   user-specified instead of being invert quadratic only\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * The given interval must bracket the root.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAXIMAL_AGING"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal aging triggering an attempt to balance the bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "maximalOrder"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "functionValueAccuracy"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Function value accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteAccuracy"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Absolute accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "relativeAccuracy"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Relative accuracy. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Evaluations counter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.BracketingNthOrderBrentSolverDFP(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, int)",
      "begin_line": 73,
      "end_line": 85,
      "comment": "\n     * Construct a solver.\n     *\n     * @param relativeAccuracy Relative accuracy.\n     * @param absoluteAccuracy Absolute accuracy.\n     * @param functionValueAccuracy Function value accuracy.\n     * @param maximalOrder maximal order.\n     * @exception NumberIsTooSmallException if maximal order is lower than 2\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 41)",
        "(line 82,col 9)-(line 82,col 49)",
        "(line 83,col 9)-(line 83,col 49)",
        "(line 84,col 9)-(line 84,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getMaximalOrder()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " Get the maximal order.\n     * @return maximal order\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getMaxEvaluations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Get the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getEvaluations()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getAbsoluteAccuracy()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Get the absolute accuracy.\n     * @return absolute accuracy\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getRelativeAccuracy()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Get the relative accuracy.\n     * @return relative accuracy\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.getFunctionValueAccuracy()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Get the function accuracy.\n     * @return function accuracy\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.solve(int, org.apache.commons.math3.dfp.UnivariateDfpFunction, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 155,
      "end_line": 159,
      "comment": "\n     * Solve for a zero in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a value where the function is zero.\n     * @exception NullArgumentException if f is null.\n     * @exception NoBracketingException if root cannot be bracketed\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.solve(int, org.apache.commons.math3.dfp.UnivariateDfpFunction, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 178,
      "end_line": 400,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return a value where the function is zero.\n     * @exception NullArgumentException if f is null.\n     * @exception NoBracketingException if root cannot be bracketed\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 34)",
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 33)",
        "(line 189,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 190,col 56)",
        "(line 193,col 9)-(line 193,col 50)",
        "(line 194,col 9)-(line 194,col 50)",
        "(line 195,col 9)-(line 195,col 19)",
        "(line 196,col 9)-(line 196,col 26)",
        "(line 197,col 9)-(line 197,col 19)",
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 29)",
        "(line 202,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 209,col 29)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 21)",
        "(line 216,col 9)-(line 216,col 28)",
        "(line 217,col 9)-(line 242,col 9)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 248,col 9)-(line 248,col 43)",
        "(line 249,col 9)-(line 249,col 43)",
        "(line 250,col 9)-(line 250,col 29)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 25)",
        "(line 253,col 9)-(line 253,col 39)",
        "(line 254,col 9)-(line 254,col 39)",
        "(line 255,col 9)-(line 255,col 29)",
        "(line 256,col 9)-(line 256,col 29)",
        "(line 257,col 9)-(line 257,col 25)",
        "(line 260,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFP.guessX(org.apache.commons.math3.dfp.Dfp, org.apache.commons.math3.dfp.Dfp[], org.apache.commons.math3.dfp.Dfp[], int, int)",
      "begin_line": 416,
      "end_line": 435,
      "comment": " Guess an x value by n\u003csup\u003eth\u003c/sup\u003e order inverse polynomial interpolation.\n     * \u003cp\u003e\n     * The x value is guessed by evaluating polynomial Q(y) at y \u003d targetY, where Q\n     * is built such that for all considered points (x\u003csub\u003ei\u003c/sub\u003e, y\u003csub\u003ei\u003c/sub\u003e),\n     * Q(y\u003csub\u003ei\u003c/sub\u003e) \u003d x\u003csub\u003ei\u003c/sub\u003e.\n     * \u003c/p\u003e\n     * @param targetY target value for y\n     * @param x reference points abscissas for interpolation,\n     * note that this array \u003cem\u003eis\u003c/em\u003e modified during computation\n     * @param y reference points ordinates for interpolation\n     * @param start start index of the points to consider (inclusive)\n     * @param end end index of the points to consider (exclusive)\n     * @return guessed root (will be a NaN if two points share the same y)\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 425,col 9)",
        "(line 428,col 9)-(line 428,col 35)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 433,col 18)"
      ]
    }
  ]
}