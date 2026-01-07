{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/SimpleVectorValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleVectorValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.AbstractConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e"
      ],
      "begin_line": 39,
      "end_line": 135,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only objective function values.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold for all vectors elements.\n * \u003cbr/\u003e\n * The {@link #converged(int,PointVectorValuePair,PointVectorValuePair) converged}\n * method will also return {@code true} if the number of iterations has been set\n * (see {@link #SimpleVectorValueChecker(double,double,int) this constructor}).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ITERATION_CHECK_DISABLED"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * If {@link #maxIterationCount} is set to this value, the number of\n     * iterations will never cause\n     * {@link #converged(int,PointVectorValuePair,PointVectorValuePair)}\n     * to return {@code true}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Number of iterations after which the\n     * {@link #converged(int,PointVectorValuePair,PointVectorValuePair)} method\n     * will return true (unless the check is disabled).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimpleVectorValueChecker.SimpleVectorValueChecker(double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Build an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 52)",
        "(line 68,col 9)-(line 68,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimpleVectorValueChecker.SimpleVectorValueChecker(double, double, int)",
      "begin_line": 86,
      "end_line": 95,
      "comment": "\n     * Builds an instance with specified tolerance thresholds and\n     * iteration count.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold Relative tolerance threshold.\n     * @param absoluteThreshold Absolute tolerance threshold.\n     * @param maxIter Maximum iteration count.\n     * @throws NotStrictlyPositiveException if {@code maxIter \u003c\u003d 0}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 52)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimpleVectorValueChecker.converged(int, org.apache.commons.math3.optim.PointVectorValuePair, org.apache.commons.math3.optim.PointVectorValuePair)",
      "begin_line": 113,
      "end_line": 134,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several times from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the arguments satify the convergence criterion.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 50)",
        "(line 122,col 9)-(line 122,col 49)",
        "(line 123,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    }
  ]
}