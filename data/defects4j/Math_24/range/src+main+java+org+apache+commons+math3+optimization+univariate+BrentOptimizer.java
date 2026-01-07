{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.univariate.BaseAbstractUnivariateOptimizer"
      ],
      "begin_line": 38,
      "end_line": 299,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions. This implementation is an adaptation partly\n * based on the Python code from SciPy (module \"optimize.py\" v0.5).\n * If the function is defined on some interval {@code (lo, hi)}, then\n * this method finds an approximation {@code x} to the point at which\n * the function attains its minimum.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.BrentOptimizer.BrentOptimizer(double, double, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.univariate.UnivariatePointValuePair\u003e)",
      "begin_line": 72,
      "end_line": 86,
      "comment": "\n     * The arguments are used implement the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @param checker Additional, user-defined, convergence checking\n     * procedure.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 23)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 32)",
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.BrentOptimizer.BrentOptimizer(double, double)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * The arguments are used for implementing the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 108,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 67)",
        "(line 111,col 9)-(line 111,col 35)",
        "(line 112,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 116,col 9)-(line 117,col 38)",
        "(line 119,col 9)-(line 119,col 17)",
        "(line 120,col 9)-(line 120,col 17)",
        "(line 121,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 23)",
        "(line 130,col 9)-(line 130,col 21)",
        "(line 131,col 9)-(line 131,col 21)",
        "(line 132,col 9)-(line 132,col 21)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 134,col 45)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 23)",
        "(line 139,col 9)-(line 139,col 23)",
        "(line 141,col 9)-(line 141,col 49)",
        "(line 142,col 9)-(line 143,col 66)",
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BrentOptimizer.best(org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, boolean)",
      "begin_line": 283,
      "end_line": 298,
      "comment": "\n     * Selects the best of two points.\n     *\n     * @param a Point and value.\n     * @param b Point and value.\n     * @param isMinim {@code true} if the selected point must be the one with\n     * the lowest value.\n     * @return the best point, or {@code null} if {@code a} and {@code b} are\n     * both {@code null}.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 297,col 9)"
      ]
    }
  ]
}