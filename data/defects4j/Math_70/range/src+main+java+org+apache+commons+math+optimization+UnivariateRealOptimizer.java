{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/UnivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 31,
      "end_line": 116,
      "comment": "\n * Interface for (univariate real) optimization algorithms.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 36,
      "end_line": 36,
      "comment": " Set the maximal number of functions evaluations.\n     * @param maxEvaluations maximal number of function evaluations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 41,
      "end_line": 41,
      "comment": " Get the maximal number of functions evaluations.\n     * @return maximal number of functions evaluations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.getEvaluations()",
      "begin_line": 51,
      "end_line": 51,
      "comment": " Get the number of evaluations of the objective function.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * {@link #optimize(UnivariateRealFunction, GoalType, double, double) optimize}\n     * method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the objective function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Find an optimum in the given interval.\n     * \u003cp\u003e\n     * An optimizer may require that the interval brackets a single optimum.\n     * \u003c/p\u003e\n     * @param f the function to optimize.\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return a value where the function is optimum\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the optimizer detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the optimizer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.optimize(org.apache.commons.math.analysis.UnivariateRealFunction, org.apache.commons.math.optimization.GoalType, double, double, double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Find an optimum in the given interval, start at startValue.\n     * \u003cp\u003e\n     * An optimizer may require that the interval brackets a single optimum.\n     * \u003c/p\u003e\n     * @param f the function to optimize.\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue the start value to use\n     * @return a value where the function is optimum\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the optimizer detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the optimizer\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.getResult()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Get the result of the last run of the optimizer.\n     *\n     * @return the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.UnivariateRealOptimizer.getFunctionValue()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Get the result of the last run of the optimizer.\n     *\n     * @return the value of the function at the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    }
  ]
}