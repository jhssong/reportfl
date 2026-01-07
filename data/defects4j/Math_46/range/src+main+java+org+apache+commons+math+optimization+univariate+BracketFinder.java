{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/optimization/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 291,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS_MIN"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Tolerance to avoid division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "GOLD"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "growLimit"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Factor for expanding the interval.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Counter for function evaluations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Lower bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Higher bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mid"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Point inside the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Function value at {@link #lo}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Function value at {@link #hi}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fMid"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Function value at {@link #mid}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Constructor with default values {@code 100, 50} (see the\n     * {@link #BracketFinder(double,int) other constructor}).\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder(double, int)",
      "begin_line": 90,
      "end_line": 101,
      "comment": "\n     * Create a bracketing interval finder.\n     *\n     * @param growLimit Expanding factor.\n     * @param maxEvaluations Maximum number of evaluations allowed for finding\n     * a bracketing interval.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.search(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 114,
      "end_line": 211,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketed.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     * @throws MathUserException if function throw one\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 120,col 9)-(line 120,col 35)",
        "(line 121,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 135,col 35)",
        "(line 137,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 16)",
        "(line 196,col 9)-(line 196,col 17)",
        "(line 197,col 9)-(line 197,col 17)",
        "(line 198,col 9)-(line 198,col 18)",
        "(line 199,col 9)-(line 199,col 16)",
        "(line 200,col 9)-(line 200,col 17)",
        "(line 202,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMaxEvaluations()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getEvaluations()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getLo()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * @return the lower bound of the bracket.\n     * @see #getFLo()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFLo()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Get function value at {@link #getLo()}.\n     * @return function value at {@link #getLo()}\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getHi()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * @return the higher bound of the bracket.\n     * @see #getFHi()\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFHi()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Get function value at {@link #getHi()}.\n     * @return function value at {@link #getHi()}\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMid()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * @return a point in the middle of the bracket.\n     * @see #getFMid()\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFMid()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Get function value at {@link #getMid()}.\n     * @return function value at {@link #getMid()}\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.eval(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 283,
      "end_line": 290,
      "comment": "\n     * @param f Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     * @throws MathUserException if f throws one.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 26)"
      ]
    }
  ]
}