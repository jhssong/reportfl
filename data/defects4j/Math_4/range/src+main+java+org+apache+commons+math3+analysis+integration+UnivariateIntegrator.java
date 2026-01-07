{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/UnivariateIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateIntegrator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 93,
      "comment": "\n * Interface for univariate real integration algorithms.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getRelativeAccuracy()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Get the actual relative accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getAbsoluteAccuracy()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Get the actual absolute accuracy.\n     *\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getMinimalIterationCount()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Get the min limit for the number of iterations.\n     *\n     * @return the actual min limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getMaximalIterationCount()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Get the upper limit for the number of iterations.\n     *\n     * @return the actual upper limit\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.integrate(int, org.apache.commons.math3.analysis.UnivariateFunction, double, double)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Integrate the function in the given interval.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f the integrand function\n     * @param min the min bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws TooManyEvaluationsException if the maximum number of function\n     * evaluations is exceeded.\n     * @throws MaxCountExceededException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws MathIllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the integrator\n     * @throws NullArgumentException if {@code f} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getEvaluations()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Get the number of function evaluations of the last run of the integrator.\n     * @return number of function evaluations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.UnivariateIntegrator.getIterations()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Get the number of iterations of the last run of the integrator.\n     * @return number of iterations\n     ",
      "child_ranges": []
    }
  ]
}