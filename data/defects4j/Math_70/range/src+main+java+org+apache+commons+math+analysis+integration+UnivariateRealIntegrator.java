{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/integration/UnivariateRealIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegrator",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 30,
      "end_line": 107,
      "comment": "\n * Interface for univariate real integration algorithms.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.setMinimalIterationCount(int)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \u003cp\u003e\n     * Minimal iteration is needed to avoid false early convergence, e.g.\n     * the sample points happen to be zeroes of the function. Users can\n     * use the default value or choose one that they see as appropriate.\u003c/p\u003e\n     * \u003cp\u003e\n     * A \u003ccode\u003eConvergenceException\u003c/code\u003e will be thrown if this number\n     * is not met.\u003c/p\u003e\n     *\n     * @param count minimum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getMinimalIterationCount()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     *\n     * @return the actual lower limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.resetMinimalIterationCount()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the implementation.\u003c/p\u003e\n     *\n     * @see #setMinimalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.integrate(double, double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Integrate the function in the given interval.\n     *\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the integrator\n     * @deprecated replaced by {@link #integrate(UnivariateRealFunction, double, double)}\n     * since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 95,
      "end_line": 96,
      "comment": "\n     * Integrate the function in the given interval.\n     *\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.UnivariateRealIntegrator.getResult()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Get the result of the last run of the integrator.\n     *\n     * @return the last result\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed\n     ",
      "child_ranges": []
    }
  ]
}