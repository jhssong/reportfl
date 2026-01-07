{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegrator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 150,
      "comment": "\n * Interface for univariate real integration algorithms.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.setMaximalIterationCount(int)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \u003cp\u003e\n     * Usually a high iteration count indicates convergence problems. However,\n     * the \"reasonable value\" varies widely for different algorithms. Users are\n     * advised to use the default value supplied by the algorithm.\u003c/p\u003e\n     * \u003cp\u003e\n     * A {@link ConvergenceException} will be thrown if this number\n     * is exceeded.\u003c/p\u003e\n     *\n     * @param count maximum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getMaximalIterationCount()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     *\n     * @return the actual upper limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.setAbsoluteAccuracy(double)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Set the absolute accuracy.\n     * \u003cp\u003e\n     * The default is usually chosen so that results in the interval\n     * -10..-0.1 and +0.1..+10 can be found with a reasonable accuracy. If the\n     * expected absolute value of your results is of much smaller magnitude, set\n     * this to a smaller value.\u003c/p\u003e\n     * \u003cp\u003e\n     * Algorithms are advised to do a plausibility check with the relative\n     * accuracy, but clients should not rely on this.\u003c/p\u003e\n     *\n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getAbsoluteAccuracy()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Get the actual absolute accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.setRelativeAccuracy(double)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Set the relative accuracy.\n     * \u003cp\u003e\n     * This is used to stop iterations if the absolute accuracy can\u0027t be\n     * achieved due to large values or short mantissa length.\u003c/p\u003e\n     * \u003cp\u003e\n     * If this should be the primary criterion for convergence rather then a\n     * safety measure, set the absolute accuracy to a ridiculously small value,\n     * like {@link org.apache.commons.math.util.MathUtils#SAFE_MIN MathUtils.SAFE_MIN}.\u003c/p\u003e\n     *\n     * @param accuracy the relative accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getRelativeAccuracy()",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.setMinimalIterationCount(int)",
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \u003cp\u003e\n     * Minimal iteration is needed to avoid false early convergence, e.g.\n     * the sample points happen to be zeroes of the function. Users can\n     * use the default value or choose one that they see as appropriate.\u003c/p\u003e\n     * \u003cp\u003e\n     * A \u003ccode\u003eConvergenceException\u003c/code\u003e will be thrown if this number\n     * is not met.\u003c/p\u003e\n     *\n     * @param count minimum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getMinimalIterationCount()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     *\n     * @return the actual lower limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.resetMinimalIterationCount()",
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the implementation.\u003c/p\u003e\n     *\n     * @see #setMinimalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * Integrate the function in the given interval.\n     *\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws MathUserException if an error occurs evaluating the function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getResult()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Get the result of the last run of the integrator.\n     *\n     * @return the last result\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed\n     ",
      "child_ranges": []
    }
  ]
}