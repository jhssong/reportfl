{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/optimization/univariate/BrentOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.univariate.AbstractUnivariateRealOptimizer"
      ],
      "begin_line": 32,
      "end_line": 194,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.BrentOptimizer()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 50,
      "end_line": 54,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 57,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.univariate.BrentOptimizer.localMin(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double, double)",
      "begin_line": 88,
      "end_line": 192,
      "comment": "\n     * Find the minimum of the function {@code f} within the interval {@code (a, b)}.\n     *\n     * If the function {@code f} is defined on the interval {@code (a, b)}, then\n     * this method finds an approximation {@code x} to the point at which {@code f}\n     * attains its minimum.\u003cbr/\u003e\n     * {@code t} and {@code eps} define a tolerance {@code tol \u003d eps |x| + t} and\n     * {@code f} is never evaluated at two points closer together than {@code tol}.\n     * {@code eps} should be no smaller than \u003cem\u003e2 macheps\u003c/em\u003e and preferable not\n     * much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e, where \u003cem\u003emacheps\u003c/em\u003e is the relative\n     * machine precision. {@code t} should be positive.\n     * @param f the function to solve\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param a Lower bound of the interval\n     * @param b Higher bound of the interval\n     * @param eps Relative accuracy\n     * @param t Absolute accuracy\n     * @return the point at which the function is minimal.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function. \n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)",
        "(line 92,col 9)-(line 92,col 21)",
        "(line 93,col 9)-(line 93,col 21)",
        "(line 94,col 9)-(line 94,col 21)",
        "(line 95,col 9)-(line 95,col 31)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 23)",
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 72)"
      ]
    }
  ]
}