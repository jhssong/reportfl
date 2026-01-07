{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/analysis/UnivariateRealIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealIntegrator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 156,
      "comment": "\n * Interface for univariate real integration algorithms.\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.setMaximalIterationCount(int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Set the upper limit for the number of iterations.\n     * \u003cp\u003e\n     * Usually a high iteration count indicates convergence problem. However,\n     * the \"reasonable value\" varies widely for different cases.  Users are\n     * advised to use the default value.\u003c/p\u003e\n     * \u003cp\u003e\n     * A \u003ccode\u003eConvergenceException\u003c/code\u003e will be thrown if this number\n     * is exceeded.\u003c/p\u003e\n     *  \n     * @param count maximum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.getMaximalIterationCount()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     * \n     * @return the actual upper limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.resetMaximalIterationCount()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Reset the upper limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the implementation.\u003c/p\u003e\n     * \n     * @see #setMaximalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.setMinimalIterationCount(int)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Set the lower limit for the number of iterations.\n     * \u003cp\u003e\n     * Minimal iteration is needed to avoid false early convergence, e.g.\n     * the sample points happen to be zeroes of the function. Users can\n     * use the default value or choose one that they see as appropriate.\u003c/p\u003e\n     * \u003cp\u003e\n     * A \u003ccode\u003eConvergenceException\u003c/code\u003e will be thrown if this number\n     * is not met.\u003c/p\u003e\n     *\n     * @param count minimum number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.getMinimalIterationCount()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Get the lower limit for the number of iterations.\n     * \n     * @return the actual lower limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.resetMinimalIterationCount()",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Reset the lower limit for the number of iterations to the default.\n     * \u003cp\u003e\n     * The default value is supplied by the implementation.\u003c/p\u003e\n     * \n     * @see #setMinimalIterationCount(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.setRelativeAccuracy(double)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Set the relative accuracy.\n     * \u003cp\u003e\n     * This is used to stop iterations.\u003c/p\u003e\n     * \n     * @param accuracy the relative accuracy\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved\n     * or is otherwise deemed unreasonable\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.getRelativeAccuracy()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Get the actual relative accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.resetRelativeAccuracy()",
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Reset the relative accuracy to the default.\n     * \u003cp\u003e\n     * The default value is provided by the implementation.\u003c/p\u003e\n     *\n     * @see #setRelativeAccuracy(double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.integrate(double, double)",
      "begin_line": 130,
      "end_line": 131,
      "comment": "\n     * Integrate the function in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the integrator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.getResult()",
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Get the result of the last run of the integrator.\n     * \n     * @return the last result\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.UnivariateRealIntegrator.getIterationCount()",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Get the number of iterations in the last run of the integrator.\n     * \u003cp\u003e\n     * This is mainly meant for testing purposes. It may occasionally\n     * help track down performance problems: if the iteration count\n     * is notoriously high, check whether the function is evaluated\n     * properly, and whether another integrator is more amenable to the\n     * problem.\u003c/p\u003e\n     * \n     * @return the last iteration count\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed\n     ",
      "child_ranges": []
    }
  ]
}