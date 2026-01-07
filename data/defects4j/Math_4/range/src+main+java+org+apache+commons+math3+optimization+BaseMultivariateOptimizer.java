{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseOptimizer\u003corg.apache.commons.math3.optimization.PointValuePair\u003e"
      ],
      "begin_line": 37,
      "end_line": 62,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-FastMath. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. In 4.0, it will be replaced by the declaration\n     * corresponding to this {@link org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer#optimize(int,MultivariateFunction,GoalType,OptimizationData[]) method}.\n     ",
      "child_ranges": []
    }
  ]
}