{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 297,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
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
      "begin_line": 115,
      "end_line": 215,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketted.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     * @throws TooManyEvaluationsException if the maximum number of evaluations\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 33)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 141,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 16)",
        "(line 200,col 9)-(line 200,col 17)",
        "(line 201,col 9)-(line 201,col 17)",
        "(line 202,col 9)-(line 202,col 18)",
        "(line 203,col 9)-(line 203,col 16)",
        "(line 204,col 9)-(line 204,col 17)",
        "(line 206,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMaxEvaluations()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getEvaluations()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getLo()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * @return the lower bound of the bracket.\n     * @see #getFLo()\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFLo()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Get function value at {@link #getLo()}.\n     * @return function value at {@link #getLo()}\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getHi()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * @return the higher bound of the bracket.\n     * @see #getFHi()\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFHi()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Get function value at {@link #getHi()}.\n     * @return function value at {@link #getHi()}\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMid()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * @return a point in the middle of the bracket.\n     * @see #getFMid()\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFMid()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Get function value at {@link #getMid()}.\n     * @return function value at {@link #getMid()}\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.eval(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 287,
      "end_line": 296,
      "comment": "\n     * @param f Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     * @throws FunctionEvaluationException if function cannot be evaluated.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 26)"
      ]
    }
  ]
}