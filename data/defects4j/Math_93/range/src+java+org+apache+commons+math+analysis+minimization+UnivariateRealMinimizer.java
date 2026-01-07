{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/analysis/minimization/UnivariateRealMinimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealMinimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 31,
      "end_line": 91,
      "comment": "\n * Interface for (univariate real) minimization algorithms.\n *  \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer.minimize(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Find a minimum in the given interval.\n     * \u003cp\u003e\n     * A minimizer may require that the interval brackets a single minimum.\n     * \u003c/p\u003e\n     * @param f the function to minimize.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return a value where the function is minimum\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the minimizer detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the minimizer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer.minimize(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * Find a minimum in the given interval, start at startValue.\n     * \u003cp\u003e\n     * A minimizer may require that the interval brackets a single minimum.\n     * \u003c/p\u003e\n     * @param f the function to minimize.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue the start value to use\n     * @return a value where the function is minimum\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the minimizer detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the minimizer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer.getResult()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Get the result of the last run of the minimizer.\n     * \n     * @return the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.minimization.UnivariateRealMinimizer.getFunctionValue()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Get the result of the last run of the minimizer.\n     * \n     * @return the value of the function at the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    }
  ]
}