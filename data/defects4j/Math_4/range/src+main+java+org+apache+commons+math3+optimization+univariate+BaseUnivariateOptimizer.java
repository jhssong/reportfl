{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/univariate/BaseUnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseUnivariateOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseOptimizer\u003corg.apache.commons.math3.optimization.univariate.UnivariatePointValuePair\u003e"
      ],
      "begin_line": 38,
      "end_line": 87,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.univariate.UnivariateOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double, double)",
      "begin_line": 60,
      "end_line": 61,
      "comment": "\n     * Find an optimum in the given interval.\n     *\n     * An optimizer may require that the interval brackets a single optimum.\n     *\n     * @param f Function to optimize.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param maxEval Maximum number of function evaluations.\n     * @return a (point, value) pair where the function is optimum.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum evaluation count is exceeded.\n     * @throws org.apache.commons.math3.exception.ConvergenceException\n     * if the optimizer detects a convergence problem.\n     * @throws IllegalArgumentException if {@code min \u003e max} or the endpoints\n     * do not satisfy the requirements specified by the optimizer.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.univariate.BaseUnivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double, double, double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Find an optimum in the given interval, start at startValue.\n     * An optimizer may require that the interval brackets a single optimum.\n     *\n     * @param f Function to optimize.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param maxEval Maximum number of function evaluations.\n     * @return a (point, value) pair where the function is optimum.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximum evaluation count is exceeded.\n     * @throws org.apache.commons.math3.exception.ConvergenceException if the\n     * optimizer detects a convergence problem.\n     * @throws IllegalArgumentException if {@code min \u003e max} or the endpoints\n     * do not satisfy the requirements specified by the optimizer.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if any\n     * argument is {@code null}.\n     ",
      "child_ranges": []
    }
  ]
}