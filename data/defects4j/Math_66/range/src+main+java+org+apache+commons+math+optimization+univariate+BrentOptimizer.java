{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 34,
      "end_line": 245,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions. This implementation is an adaptation partly\n * based on the Python code from SciPy (module \"optimize.py\" v0.5).\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "GOLDEN_SECTION"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentOptimizer()",
      "begin_line": 43,
      "end_line": 48,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 45)",
        "(line 45,col 9)-(line 45,col 38)",
        "(line 46,col 9)-(line 46,col 35)",
        "(line 47,col 9)-(line 47,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.doOptimize()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Perform the optimization.\n     *\n     * @return the optimum.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 59,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 63,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(boolean, org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double, double)",
      "begin_line": 93,
      "end_line": 244,
      "comment": "\n     * Find the minimum of the function within the interval {@code (lo, hi)}.\n     *\n     * If the function is defined on the interval {@code (lo, hi)}, then\n     * this method finds an approximation {@code x} to the point at which\n     * the function attains its minimum.\u003cbr/\u003e\n     * {@code t} and {@code eps} define a tolerance {@code tol \u003d eps |x| + t}\n     * and the function is never evaluated at two points closer together than\n     * {@code tol}. {@code eps} should be no smaller than \u003cem\u003e2 macheps\u003c/em\u003e and\n     * preferable not much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e, where\n     * \u003cem\u003emacheps\u003c/em\u003e is the relative machine precision. {@code t} should be\n     * positive.\n     * @param isMinim {@code true} when minimizing the function.\n     * @param lo Lower bound of the interval.\n     * @param mid Point inside the interval {@code [lo, hi]}.\n     * @param hi Higher bound of the interval.\n     * @param eps Relative accuracy.\n     * @param t Absolute accuracy.\n     * @return the optimum point.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 20)",
        "(line 106,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 23)",
        "(line 115,col 9)-(line 115,col 21)",
        "(line 116,col 9)-(line 116,col 21)",
        "(line 117,col 9)-(line 117,col 21)",
        "(line 118,col 9)-(line 118,col 21)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 124,col 23)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 72)"
      ]
    }
  ]
}