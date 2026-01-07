{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/SimpleRealPointChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRealPointChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.AbstractConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e"
      ],
      "begin_line": 36,
      "end_line": 97,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only point coordinates.\n * \n * Convergence is considered to have been reached if either the relative\n * difference between each point coordinate are smaller than a threshold\n * or if either the absolute difference between the point coordinates are\n * smaller than another threshold.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleRealPointChecker.SimpleRealPointChecker()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Build an instance with default threshold.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleRealPointChecker.SimpleRealPointChecker(double, double)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Build an instance with specified thresholds.\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.SimpleRealPointChecker.converged(int, org.apache.commons.math.optimization.RealPointValuePair...)",
      "begin_line": 79,
      "end_line": 96,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param points Points used for checking convergence. The list must\n     * contain two elements:\n     * \u003cul\u003e\n     *  \u003cli\u003ethe previous best point,\u003c/li\u003e\n     *  \u003cli\u003ethe current best point.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@code true} if the algorithm has converged.\n     * @throws DimensionMismatchException if the length of the {@code points}\n     * list is not equal to 2.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 48)",
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    }
  ]
}