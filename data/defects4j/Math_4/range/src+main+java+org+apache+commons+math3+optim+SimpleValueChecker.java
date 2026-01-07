{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/SimpleValueChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleValueChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.AbstractConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e"
      ],
      "begin_line": 39,
      "end_line": 126,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only objective function values.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between the objective function values is smaller than a\n * threshold or if either the absolute difference between the objective\n * function values is smaller than another threshold.\n * \u003cbr/\u003e\n * The {@link #converged(int,PointValuePair,PointValuePair) converged}\n * method will also return {@code true} if the number of iterations has been set\n * (see {@link #SimpleValueChecker(double,double,int) this constructor}).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ITERATION_CHECK_DISABLED"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * If {@link #maxIterationCount} is set to this value, the number of\n     * iterations will never cause\n     * {@link #converged(int,PointValuePair,PointValuePair)}\n     * to return {@code true}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Number of iterations after which the\n     * {@link #converged(int,PointValuePair,PointValuePair)} method\n     * will return true (unless the check is disabled).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimpleValueChecker.SimpleValueChecker(double, double)",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Build an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 67,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimpleValueChecker.SimpleValueChecker(double, double, int)",
      "begin_line": 84,
      "end_line": 93,
      "comment": "\n     * Builds an instance with specified thresholds.\n     *\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     * @param maxIter Maximum iteration count.\n     * @throws NotStrictlyPositiveException if {@code maxIter \u003c\u003d 0}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 52)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimpleValueChecker.converged(int, org.apache.commons.math3.optim.PointValuePair, org.apache.commons.math3.optim.PointValuePair)",
      "begin_line": 111,
      "end_line": 125,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several time from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the algorithm has converged.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 119,col 45)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 54)",
        "(line 122,col 9)-(line 122,col 75)",
        "(line 123,col 9)-(line 124,col 49)"
      ]
    }
  ]
}