{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/analysis/minimization/BrentMinimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentMinimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizerImpl"
      ],
      "begin_line": 31,
      "end_line": 203,
      "comment": "\n * Implements Richard Brent\u0027s algorithm (from his book \"Algorithms for\n * Minimization without Derivatives\", p. 79) for finding minima of real\n * univariate functions.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Golden section.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.minimization.BrentMinimizer.BrentMinimizer()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.BrentMinimizer.minimize(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Find a minimum in the given interval, start at startValue.\n     * \u003cp\u003e\n     * A minimizer may require that the interval brackets a single minimum.\n     * \u003c/p\u003e\n     * @param f the function to minimize.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue this parameter is \u003cem\u003enot\u003c/em\u003e used at all\n     * @return a value where the function is minimum\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the minimizer detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the minimizer\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.BrentMinimizer.minimize(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 72,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 22)",
        "(line 77,col 9)-(line 77,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.BrentMinimizer.localMin(double, double, double, double, org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 103,
      "end_line": 201,
      "comment": "\n     * Find the minimum of the function {@code f} within the interval {@code (a, b)}.\n     *\n     * If the function {@code f} is defined on the interval {@code (a, b)}, then\n     * this method finds an approximation {@code x} to the point at which {@code f}\n     * attains its minimum.\u003cbr/\u003e\n     * {@code t} and {@code eps} define a tolerance {@code tol \u003d eps |x| + t} and\n     * {@code f} is never evaluated at two points closer together than {@code tol}.\n     * {@code eps} should be no smaller than \u003cem\u003e2 macheps\u003c/em\u003e and preferable not\n     * much less than \u003cem\u003esqrt(macheps)\u003c/em\u003e, where \u003cem\u003emacheps\u003c/em\u003e is the relative\n     * machine precision. {@code t} should be positive.\n     *\n     * @param f the function to solve\n     * @param a Lower bound of the interval.\n     * @param b Higher bound of the interval.\n     * @param eps Relative accuracy.\n     * @param t Absolute accuracy.\n     * @return the point at which the function is minimal.\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded.\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function. \n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 35)",
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 108,col 21)",
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 110,col 31)",
        "(line 111,col 9)-(line 111,col 23)",
        "(line 112,col 9)-(line 112,col 23)",
        "(line 114,col 9)-(line 114,col 22)",
        "(line 115,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 72)"
      ]
    }
  ]
}