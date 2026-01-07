{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 289,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS_MIN"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Tolerance to avoid division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "GOLD"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "growLimit"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Factor for expanding the interval.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Counter for function evaluations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Lower bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Higher bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mid"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Point inside the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Function value at {@link #lo}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Function value at {@link #hi}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fMid"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Function value at {@link #mid}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.BracketFinder()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Constructor with default values {@code 100, 50} (see the\n     * {@link #BracketFinder(double,int) other constructor}).\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.BracketFinder(double, int)",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\n     * Create a bracketing interval finder.\n     *\n     * @param growLimit Expanding factor.\n     * @param maxEvaluations Maximum number of evaluations allowed for finding\n     * a bracketing interval.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 35)",
        "(line 101,col 9)-(line 101,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.search(org.apache.commons.math3.analysis.UnivariateFunction, org.apache.commons.math3.optimization.GoalType, double, double)",
      "begin_line": 114,
      "end_line": 210,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketed.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 118,col 9)-(line 118,col 35)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 42)",
        "(line 134,col 9)-(line 134,col 35)",
        "(line 136,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 16)",
        "(line 195,col 9)-(line 195,col 17)",
        "(line 196,col 9)-(line 196,col 17)",
        "(line 197,col 9)-(line 197,col 18)",
        "(line 198,col 9)-(line 198,col 16)",
        "(line 199,col 9)-(line 199,col 17)",
        "(line 201,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getMaxEvaluations()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getEvaluations()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getLo()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * @return the lower bound of the bracket.\n     * @see #getFLo()\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getFLo()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Get function value at {@link #getLo()}.\n     * @return function value at {@link #getLo()}\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getHi()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * @return the higher bound of the bracket.\n     * @see #getFHi()\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getFHi()",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Get function value at {@link #getHi()}.\n     * @return function value at {@link #getHi()}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getMid()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * @return a point in the middle of the bracket.\n     * @see #getFMid()\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.getFMid()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Get function value at {@link #getMid()}.\n     * @return function value at {@link #getMid()}\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BracketFinder.eval(org.apache.commons.math3.analysis.UnivariateFunction, double)",
      "begin_line": 281,
      "end_line": 288,
      "comment": "\n     * @param f Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 26)"
      ]
    }
  ]
}