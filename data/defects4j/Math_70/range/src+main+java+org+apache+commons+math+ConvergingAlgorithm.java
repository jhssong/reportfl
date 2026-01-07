{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ConvergingAlgorithm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConvergingAlgorithm",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 136,
      "comment": "\n * Interface for algorithms handling convergence settings.\n * \u003cp\u003e\n * This interface only deals with convergence parameters setting, not\n * execution of the algorithms per se.\n * \u003c/p\u003e\n * @see ConvergenceException\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.setMaximalIterationCount(int)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \u003cp\u003e\n     * Usually a high iteration count indicates convergence problems. However,\n     * the \"reasonable value\" varies widely for different algorithms. Users are\n     * advised to use the default value supplied by the algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * A {@link ConvergenceException} will be thrown if this number\n     * is exceeded.\u003c/p\u003e\n     *\n     * @param count maximum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.getMaximalIterationCount()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     *\n     * @return the actual upper limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.resetMaximalIterationCount()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the algorithm implementation.\u003c/p\u003e\n     *\n     * @see #setMaximalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.setAbsoluteAccuracy(double)",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Set the absolute accuracy.\n     * \u003cp\u003e\n     * The default is usually chosen so that results in the interval\n     * -10..-0.1 and +0.1..+10 can be found with a reasonable accuracy. If the\n     * expected absolute value of your results is of much smaller magnitude, set\n     * this to a smaller value.\u003c/p\u003e\n     * \u003cp\u003e\n     * Algorithms are advised to do a plausibility check with the relative\n     * accuracy, but clients should not rely on this.\u003c/p\u003e\n     *\n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.getAbsoluteAccuracy()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Get the actual absolute accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.resetAbsoluteAccuracy()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Reset the absolute accuracy to the default.\n     * \u003cp\u003e\n     * The default value is provided by the algorithm implementation.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.setRelativeAccuracy(double)",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Set the relative accuracy.\n     * \u003cp\u003e\n     * This is used to stop iterations if the absolute accuracy can\u0027t be\n     * achieved due to large values or short mantissa length.\u003c/p\u003e\n     * \u003cp\u003e\n     * If this should be the primary criterion for convergence rather then a\n     * safety measure, set the absolute accuracy to a ridiculously small value,\n     * like {@link org.apache.commons.math.util.MathUtils#SAFE_MIN MathUtils.SAFE_MIN}.\u003c/p\u003e\n     *\n     * @param accuracy the relative accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     *  the algorithm or is otherwise deemed unreasonable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.getRelativeAccuracy()",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.resetRelativeAccuracy()",
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Reset the relative accuracy to the default.\n     * The default value is provided by the algorithm implementation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ConvergingAlgorithm.getIterationCount()",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Get the number of iterations in the last run of the algorithm.\n     * \u003cp\u003e\n     * This is mainly meant for testing purposes. It may occasionally\n     * help track down performance problems: if the iteration count\n     * is notoriously high, check whether the problem is evaluated\n     * properly, and whether another algorithm is more amenable to the\n     * problem.\u003c/p\u003e\n     *\n     * @return the last iteration count.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    }
  ]
}