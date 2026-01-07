{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 32,
      "end_line": 191,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
      "end_line": 44,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 47,
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 54,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)",
        "(line 58,col 9)-(line 58,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double)",
      "begin_line": 85,
      "end_line": 189,
      "comment": "\n     * Find the minimum of the function {@code f} within the interval {@code (a, b)}.\n     *\n     * If the function {@code f} is defined on the interval {@code (a, b)}, then\n     * this method finds an approximation {@code x} to the point at which {@code f}\n     * attains its minimum.\u003cbr/\u003e\n     * {@code t} and {@code eps} define a tolerance {@code tol \u003d eps |x| + t} and\n     * {@code f} is never evaluated at two points closer together than {@code tol}.\n     * {@code eps} should be no smaller than \u003cem\u003e2 macheps\u003c/em\u003e and preferable not\n     * much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e, where \u003cem\u003emacheps\u003c/em\u003e is the relative\n     * machine precision. {@code t} should be positive.\n     * @param f the function to solve\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param a Lower bound of the interval\n     * @param b Higher bound of the interval\n     * @param eps Relative accuracy\n     * @param t Absolute accuracy\n     * @return the point at which the function is minimal.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 89,col 21)",
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 91,col 21)",
        "(line 92,col 9)-(line 92,col 48)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 99,col 9)-(line 99,col 22)",
        "(line 100,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 72)"
      ]
    }
  ]
}