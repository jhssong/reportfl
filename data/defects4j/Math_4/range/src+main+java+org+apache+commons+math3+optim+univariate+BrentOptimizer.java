{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.univariate.UnivariateOptimizer"
      ],
      "begin_line": 44,
      "end_line": 315,
      "comment": "\n * For a function defined on some interval {@code (lo, hi)}, this class\n * finds an approximation {@code x} to the point at which the function\n * attains its minimum.\n * It implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions.\n * \u003cbr/\u003e\n * This code is an adaptation, partly based on the Python code from SciPy\n * (module \"optimize.py\" v0.5); the original algorithm is also modified\n * \u003cul\u003e\n *  \u003cli\u003eto use an initial guess provided by the user,\u003c/li\u003e\n *  \u003cli\u003eto ensure that the best point encountered is the one returned.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.BrentOptimizer.BrentOptimizer(double, double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.univariate.UnivariatePointValuePair\u003e)",
      "begin_line": 78,
      "end_line": 92,
      "comment": "\n     * The arguments are used implement the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Additional, user-defined, convergence checking\n     * procedure.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 23)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.BrentOptimizer.BrentOptimizer(double, double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * The arguments are used for implementing the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 114,
      "end_line": 286,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 67)",
        "(line 117,col 9)-(line 117,col 35)",
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 119,col 35)",
        "(line 122,col 9)-(line 123,col 38)",
        "(line 125,col 9)-(line 125,col 17)",
        "(line 126,col 9)-(line 126,col 17)",
        "(line 127,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 23)",
        "(line 136,col 9)-(line 136,col 21)",
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 21)",
        "(line 139,col 9)-(line 139,col 21)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 23)",
        "(line 145,col 9)-(line 145,col 23)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 149,col 66)",
        "(line 151,col 9)-(line 151,col 48)",
        "(line 153,col 9)-(line 153,col 21)",
        "(line 154,col 9)-(line 285,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.BrentOptimizer.best(org.apache.commons.math3.optim.univariate.UnivariatePointValuePair, org.apache.commons.math3.optim.univariate.UnivariatePointValuePair, boolean)",
      "begin_line": 299,
      "end_line": 314,
      "comment": "\n     * Selects the best of two points.\n     *\n     * @param a Point and value.\n     * @param b Point and value.\n     * @param isMinim {@code true} if the selected point must be the one with\n     * the lowest value.\n     * @return the best point, or {@code null} if {@code a} and {@code b} are\n     * both {@code null}. When {@code a} and {@code b} have the same function\n     * value, {@code a} is returned.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 313,col 9)"
      ]
    }
  ]
}