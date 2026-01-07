{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/univariate/BracketFinder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketFinder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 261,
      "comment": "\n * Provide an interval that brackets a local optimum of a function.\n * This code is based on a Python implementation (from \u003cem\u003eSciPy\u003c/em\u003e,\n * module {@code optimize.py} v0.5).\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS_MIN"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GOLD"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "growLimit"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Factor for expanding the interval.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Maximum number of iterations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Number of iterations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Number of function evaluations.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lo"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Lower bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hi"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Higher bound of the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mid"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Point inside the bracket.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fLo"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Function value at {@link #lo}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fHi"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Function value at {@link #hi}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fMid"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Function value at {@link #mid}.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Constructor with default values {@code 100, 50} (see the\n     * {@link #BracketFinder(double,int) other constructor}).\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.BracketFinder(double, int)",
      "begin_line": 92,
      "end_line": 103,
      "comment": "\n     * Create a bracketing interval finder.\n     *\n     * @param growLimit Expanding factor.\n     * @param maxIterations Maximum number of iterations allowed for finding\n     * a bracketing interval.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 102,col 9)-(line 102,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.search(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 113,
      "end_line": 207,
      "comment": "\n     * Search new points that bracket a local optimum of the function.\n     *\n     * @param func Function whose optimum should be bracketted.\n     * @param goal {@link GoalType Goal type}.\n     * @param xA Initial point.\n     * @param xB Initial point.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 16)",
        "(line 120,col 9)-(line 120,col 60)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 139,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 16)",
        "(line 202,col 9)-(line 202,col 17)",
        "(line 203,col 9)-(line 203,col 16)",
        "(line 204,col 9)-(line 204,col 17)",
        "(line 205,col 9)-(line 205,col 18)",
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getIterations()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * @return the number of iterations.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getEvaluations()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * @return the number of evalutations.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getLo()",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * @return the lower bound of the bracket.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getHi()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * @return the higher bound of the bracket.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.getMid()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * @return a point in the middle of the bracket.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.eval(org.apache.commons.math.analysis.UnivariateRealFunction, double)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "\n     * @param func Function.\n     * @param x Argument.\n     * @return {@code f(x)}\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 22)",
        "(line 251,col 9)-(line 251,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BracketFinder.reset()",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Reset internal state.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 23)",
        "(line 259,col 9)-(line 259,col 24)"
      ]
    }
  ]
}