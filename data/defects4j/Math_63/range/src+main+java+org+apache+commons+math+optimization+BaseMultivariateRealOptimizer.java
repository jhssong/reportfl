{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/BaseMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateRealOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseOptimizer\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e"
      ],
      "begin_line": 37,
      "end_line": 57,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-FastMath. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.MultivariateRealOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws FunctionEvaluationException if the objective function throws one\n     * during the search.\n     * @throws DimensionMismatchException if the start point dimension is wrong.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     * @throws NullArgumentException if any argument is {@code null}.\n     ",
      "child_ranges": []
    }
  ]
}