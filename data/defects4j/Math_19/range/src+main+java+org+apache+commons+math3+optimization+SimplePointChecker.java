{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/optimization/SimplePointChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePointChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.AbstractConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 38,
      "end_line": 95,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only point coordinates.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between each point coordinate are smaller than a threshold\n * or if either the absolute difference between the point coordinates are\n * smaller than another threshold.\n *\n * @param \u003cPAIR\u003e Type of the (point, value) pair.\n * The type of the \"value\" part of the pair (not used by this class).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.SimplePointChecker.SimplePointChecker()",
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Build an instance with default threshold.\n     * @deprecated See {@link AbstractConvergenceChecker#AbstractConvergenceChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.SimplePointChecker.SimplePointChecker(double, double)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Build an instance with specified thresholds.\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.SimplePointChecker.converged(int, PAIR, PAIR)",
      "begin_line": 77,
      "end_line": 94,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm has converged.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)",
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 20)"
      ]
    }
  ]
}