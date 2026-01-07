{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 33,
      "end_line": 226,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions. This implementation is an adaptation partly\n * based on the Python code from SciPy (module \"optimize.py\" v0.5).\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentOptimizer()",
      "begin_line": 42,
      "end_line": 47,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 32)",
        "(line 44,col 9)-(line 44,col 38)",
        "(line 45,col 9)-(line 45,col 35)",
        "(line 46,col 9)-(line 46,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 50,
      "end_line": 55,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(boolean, double, double, double, double, double)",
      "begin_line": 81,
      "end_line": 225,
      "comment": "\n     * Find the minimum of the function within the interval {@code (lo, hi)}.\n     *\n     * If the function is defined on the interval {@code (lo, hi)}, then\n     * this method finds an approximation {@code x} to the point at which\n     * the function attains its minimum.\u003cbr/\u003e\n     * {@code t} and {@code eps} define a tolerance {@code tol \u003d eps |x| + t}\n     * and the function is never evaluated at two points closer together than\n     * {@code tol}. {@code eps} should be no smaller than \u003cem\u003e2 macheps\u003c/em\u003e and\n     * preferable not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e, where\n     * \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code t} should be\n     * positive.\n     * @param isMinim {@code true} when minimizing the function.\n     * @param lo Lower bound of the interval.\n     * @param mid Point inside the interval {@code [lo, hi]}.\n     * @param hi Higher bound of the interval.\n     * @param eps Relative accuracy.\n     * @param t Absolute accuracy.\n     * @return the optimum point.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 17)",
        "(line 92,col 9)-(line 92,col 17)",
        "(line 93,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 23)",
        "(line 102,col 9)-(line 102,col 21)",
        "(line 103,col 9)-(line 103,col 21)",
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 105,col 21)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 23)",
        "(line 111,col 9)-(line 111,col 23)",
        "(line 113,col 9)-(line 224,col 9)"
      ]
    }
  ]
}