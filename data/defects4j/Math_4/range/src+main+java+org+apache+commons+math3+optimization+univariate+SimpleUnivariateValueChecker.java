{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/univariate/SimpleUnivariateValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleUnivariateValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.AbstractConvergenceChecker\u003corg.apache.commons.math3.optimization.univariate.UnivariatePointValuePair\u003e"
      ],
      "begin_line": 43,
      "end_line": 140,
      "comment": "\n * Simple implementation of the\n * {@link org.apache.commons.math3.optimization.ConvergenceChecker} interface\n * that uses only objective function values.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold.\n * \u003cbr/\u003e\n * The {@link #converged(int,UnivariatePointValuePair,UnivariatePointValuePair)\n * converged} method will also return {@code true} if the number of iterations\n * has been set (see {@link #SimpleUnivariateValueChecker(double,double,int)\n * this constructor}).\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "ITERATION_CHECK_DISABLED"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * If {@link #maxIterationCount} is set to this value, the number of\n     * iterations will never cause\n     * {@link #converged(int,UnivariatePointValuePair,UnivariatePointValuePair)}\n     * to return {@code true}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Number of iterations after which the\n     * {@link #converged(int,UnivariatePointValuePair,UnivariatePointValuePair)}\n     * method will return true (unless the check is disabled).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.SimpleUnivariateValueChecker()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Build an instance with default thresholds.\n     * @deprecated See {@link AbstractConvergenceChecker#AbstractConvergenceChecker()}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.SimpleUnivariateValueChecker(double, double)",
      "begin_line": 78,
      "end_line": 82,
      "comment": " Build an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 52)",
        "(line 81,col 9)-(line 81,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.SimpleUnivariateValueChecker(double, double, int)",
      "begin_line": 98,
      "end_line": 107,
      "comment": "\n     * Builds an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     * @param maxIter Maximum iteration count.\n     * @throws NotStrictlyPositiveException if {@code maxIter \u003c\u003d 0}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 52)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.converged(int, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair)",
      "begin_line": 125,
      "end_line": 139,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm has converged.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 44)",
        "(line 135,col 9)-(line 135,col 54)",
        "(line 136,col 9)-(line 136,col 75)",
        "(line 137,col 9)-(line 138,col 49)"
      ]
    }
  ]
}