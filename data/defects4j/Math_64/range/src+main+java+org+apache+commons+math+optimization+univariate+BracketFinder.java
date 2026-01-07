{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 298,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS_MIN"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Tolerance to avoid division by zero. "
    },
    {
      "type": "field",
      "varNames": [
        "GOLD"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "growLimit"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Factor for expanding the interval.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Maximum number of iterations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Number of iterations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Number of function evaluations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Lower bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Higher bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mid"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Point inside the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Function value at {@link #lo}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Function value at {@link #hi}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fMid"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Function value at {@link #mid}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Constructor with default values {@code 100, 50} (see the\n     * {@link #BracketFinder(double,int) other constructor}).\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder(double, int)",
      "begin_line": 95,
      "end_line": 106,
      "comment": "\n     * Create a bracketing interval finder.\n     *\n     * @param growLimit Expanding factor.\n     * @param maxIterations Maximum number of iterations allowed for finding\n     * a bracketing interval.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 35)",
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.search(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 120,
      "end_line": 214,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketted.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 16)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 129,col 9)-(line 129,col 35)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 146,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 16)",
        "(line 209,col 9)-(line 209,col 17)",
        "(line 210,col 9)-(line 210,col 16)",
        "(line 211,col 9)-(line 211,col 17)",
        "(line 212,col 9)-(line 212,col 18)",
        "(line 213,col 9)-(line 213,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getIterations()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * @return the number of iterations.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getEvaluations()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getLo()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * @return the lower bound of the bracket.\n     * @see #getFLow()\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFLow()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Get function value at {@link #getLo()}.\n     * @return function value at {@link #getLo()}\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getHi()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * @return the higher bound of the bracket.\n     * @see #getFHi()\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFHi()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Get function value at {@link #getHi()}.\n     * @return function value at {@link #getHi()}\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMid()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * @return a point in the middle of the bracket.\n     * @see #getFMid()\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getFMid()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Get function value at {@link #getMid()}.\n     * @return function value at {@link #getMid()}\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.eval(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n     * @param f Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     * @throws FunctionEvaluationException if function cannot be evaluated at x\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 22)",
        "(line 288,col 9)-(line 288,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.reset()",
      "begin_line": 294,
      "end_line": 297,
      "comment": "\n     * Reset internal state.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 23)",
        "(line 296,col 9)-(line 296,col 24)"
      ]
    }
  ]
}