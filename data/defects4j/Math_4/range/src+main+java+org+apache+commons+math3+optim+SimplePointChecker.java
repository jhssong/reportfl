{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/SimplePointChecker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimplePointChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.AbstractConvergenceChecker\u003cPAIR\u003e"
      ],
      "begin_line": 42,
      "end_line": 134,
      "comment": "\n * Simple implementation of the {@link ConvergenceChecker} interface using\n * only point coordinates.\n *\n * Convergence is considered to have been reached if either the relative\n * difference between each point coordinate are smaller than a threshold\n * or if either the absolute difference between the point coordinates are\n * smaller than another threshold.\n * \u003cbr/\u003e\n * The {@link #converged(int,Pair,Pair) converged} method will also return\n * {@code true} if the number of iterations has been set (see\n * {@link #SimplePointChecker(double,double,int) this constructor}).\n *\n * @param \u003cPAIR\u003e Type of the (point, value) pair.\n * The type of the \"value\" part of the pair (not used by this class).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ITERATION_CHECK_DISABLED"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * If {@link #maxIterationCount} is set to this value, the number of\n     * iterations will never cause {@link #converged(int, Pair, Pair)}\n     * to return {@code true}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Number of iterations after which the\n     * {@link #converged(int, Pair, Pair)} method\n     * will return true (unless the check is disabled).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimplePointChecker.SimplePointChecker(double, double)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Build an instance with specified thresholds.\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold relative tolerance threshold\n     * @param absoluteThreshold absolute tolerance threshold\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 52)",
        "(line 69,col 9)-(line 69,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.SimplePointChecker.SimplePointChecker(double, double, int)",
      "begin_line": 85,
      "end_line": 94,
      "comment": "\n     * Builds an instance with specified thresholds.\n     * In order to perform only relative checks, the absolute tolerance\n     * must be set to a negative value. In order to perform only absolute\n     * checks, the relative tolerance must be set to a negative value.\n     *\n     * @param relativeThreshold Relative tolerance threshold.\n     * @param absoluteThreshold Absolute tolerance threshold.\n     * @param maxIter Maximum iteration count.\n     * @throws NotStrictlyPositiveException if {@code maxIter \u003c\u003d 0}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 52)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.SimplePointChecker.converged(int, PAIR, PAIR)",
      "begin_line": 112,
      "end_line": 133,
      "comment": "\n     * Check if the optimization algorithm has converged considering the\n     * last two points.\n     * This method may be called several times from the same algorithm\n     * iteration with different points. This can be detected by checking the\n     * iteration number at each call if needed. Each time this method is\n     * called, the previous and current point correspond to points with the\n     * same role at each iteration, so they can be compared. As an example,\n     * simplex-based algorithms call this method for all points of the simplex,\n     * not only for the best or worst ones.\n     *\n     * @param iteration Index of current iteration\n     * @param previous Best point in the previous iteration.\n     * @param current Best point in the current iteration.\n     * @return {@code true} if the arguments satify the convergence criterion.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 45)",
        "(line 121,col 9)-(line 121,col 44)",
        "(line 122,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    }
  ]
}