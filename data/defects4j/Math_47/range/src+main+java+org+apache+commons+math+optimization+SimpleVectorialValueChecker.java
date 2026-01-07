{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/optimization/SimpleVectorialValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleVectorialValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.AbstractConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e"
      ],
      "begin_line": 34,
      "end_line": 90,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only objective function values.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold for all vectors elements.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Build an instance with default thresholds.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.SimpleVectorialValueChecker(double, double)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Build an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.SimpleVectorialValueChecker.converged(int, org.apache.commons.math.optimization.VectorialPointValuePair, org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 72,
      "end_line": 89,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm has converged.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 50)",
        "(line 77,col 9)-(line 77,col 49)",
        "(line 78,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 20)"
      ]
    }
  ]
}