{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 42,
      "end_line": 251,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions. This implementation is an adaptation partly\n * based on the Python code from SciPy (module \"optimize.py\" v0.5).\n * If the function is defined on some interval {@code (lo, hi)}, then\n * this method finds an approximation {@code x} to the point at which\n * the function attains its minimum.\n * \u003cbr/\u003e\n * The user is responsible for calling {@link\n * #setConvergenceChecker(ConvergenceChecker) ConvergenceChecker}\n * prior to using the optimizer.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MIN_RELATIVE_TOLERANCE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Minimum relative tolerance.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "relativeThreshold"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Relative threshold.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "absoluteThreshold"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Absolute threshold.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentOptimizer(double, double)",
      "begin_line": 74,
      "end_line": 84,
      "comment": "\n     * The arguments are used implement the original stopping criterion\n     * of Brent\u0027s algorithm.\n     * {@code abs} and {@code rel} define a tolerance\n     * {@code tol \u003d rel |x| + abs}. {@code rel} should be no smaller than\n     * \u003cem\u003e2 macheps\u003c/em\u003e and preferably not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e,\n     * where \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code abs} must\n     * be positive.\n     *\n     * @param rel Relative threshold.\n     * @param abs Absolute threshold.\n     * @throws NotStrictlyPositiveException if {@code abs \u003c\u003d 0}.\n     * @throws NumberIsTooSmallException if {@code rel \u003c 2 * Math.ulp(1d)}.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 32)",
        "(line 83,col 9)-(line 83,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 87,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 67)",
        "(line 90,col 9)-(line 90,col 35)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 35)",
        "(line 95,col 9)-(line 96,col 38)",
        "(line 98,col 9)-(line 98,col 17)",
        "(line 99,col 9)-(line 99,col 17)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 110,col 21)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 112,col 21)",
        "(line 113,col 9)-(line 113,col 45)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 118,col 23)",
        "(line 120,col 9)-(line 120,col 53)",
        "(line 121,col 9)-(line 122,col 70)",
        "(line 124,col 9)-(line 124,col 21)",
        "(line 125,col 9)-(line 249,col 9)"
      ]
    }
  ]
}