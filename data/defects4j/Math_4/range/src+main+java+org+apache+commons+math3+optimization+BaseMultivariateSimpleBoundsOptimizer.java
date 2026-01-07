{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateSimpleBoundsOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateSimpleBoundsOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 37,
      "end_line": 66,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-FastMath. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateSimpleBoundsOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[], double[], double[])",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @param lowerBound Lower bound for each of the parameters.\n     * @param upperBound Upper bound for each of the parameters.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the array sizes are wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * {@code f}, {@code goalType} or {@code startPoint} is {@code null}.\n     * @throws org.apache.commons.math3.exception.NumberIsTooSmallException if any\n     * of the initial values is less than its lower bound.\n     * @throws org.apache.commons.math3.exception.NumberIsTooLargeException if any\n     * of the initial values is greater than its upper bound.\n     ",
      "child_ranges": []
    }
  ]
}