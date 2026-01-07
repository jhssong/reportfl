{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 287,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS_MIN"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Tolerance to avoid division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "GOLD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "growLimit"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Factor for expanding the interval.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Counter for function evaluations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Lower bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Higher bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mid"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Point inside the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Function value at {@link #lo}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Function value at {@link #hi}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fMid"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Function value at {@link #mid}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.BracketFinder()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructor with default values {@code 100, 50} (see the\n     * {@link #BracketFinder(double,int) other constructor}).\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.BracketFinder(double, int)",
      "begin_line": 89,
      "end_line": 100,
      "comment": "\n     * Create a bracketing interval finder.\n     *\n     * @param growLimit Expanding factor.\n     * @param maxEvaluations Maximum number of evaluations allowed for finding\n     * a bracketing interval.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 35)",
        "(line 99,col 9)-(line 99,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.search(org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.optim.nonlinear.scalar.GoalType, double, double)",
      "begin_line": 112,
      "end_line": 208,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketed.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 116,col 9)-(line 116,col 35)",
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 35)",
        "(line 134,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 16)",
        "(line 193,col 9)-(line 193,col 17)",
        "(line 194,col 9)-(line 194,col 17)",
        "(line 195,col 9)-(line 195,col 18)",
        "(line 196,col 9)-(line 196,col 16)",
        "(line 197,col 9)-(line 197,col 17)",
        "(line 199,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getMaxEvaluations()",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getEvaluations()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getLo()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * @return the lower bound of the bracket.\n     * @see #getFLo()\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getFLo()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Get function value at {@link #getLo()}.\n     * @return function value at {@link #getLo()}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getHi()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * @return the higher bound of the bracket.\n     * @see #getFHi()\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getFHi()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Get function value at {@link #getHi()}.\n     * @return function value at {@link #getHi()}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getMid()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * @return a point in the middle of the bracket.\n     * @see #getFMid()\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.getFMid()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Get function value at {@link #getMid()}.\n     * @return function value at {@link #getMid()}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BracketFinder.eval(org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 279,
      "end_line": 286,
      "comment": "\n     * @param f Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 26)"
      ]
    }
  ]
}