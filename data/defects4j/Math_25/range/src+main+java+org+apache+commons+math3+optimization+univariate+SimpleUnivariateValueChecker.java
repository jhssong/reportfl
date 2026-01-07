{
  "filepath": "/tmp/Math-25b/src/main/java/org/apache/commons/math3/optimization/univariate/SimpleUnivariateValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleUnivariateValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.AbstractConvergenceChecker\u003corg.apache.commons.math3.optimization.univariate.UnivariatePointValuePair\u003e"
      ],
      "begin_line": 36,
      "end_line": 86,
      "comment": "\n * Simple implementation of the\n * {@link org.apache.commons.math3.optimization.ConvergenceChecker} interface\n * that uses only objective function values.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.SimpleUnivariateValueChecker()",
      "begin_line": 42,
      "end_line": 43,
      "comment": "\n     * Build an instance with default thresholds.\n     * @deprecated See {@link AbstractConvergenceChecker#AbstractConvergenceChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.SimpleUnivariateValueChecker(double, double)",
      "begin_line": 54,
      "end_line": 57,
      "comment": " Build an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker.converged(int, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair, org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair)",
      "begin_line": 75,
      "end_line": 85,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm has converged.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 45)",
        "(line 80,col 9)-(line 80,col 44)",
        "(line 81,col 9)-(line 81,col 54)",
        "(line 82,col 9)-(line 82,col 75)",
        "(line 83,col 9)-(line 84,col 49)"
      ]
    }
  ]
}