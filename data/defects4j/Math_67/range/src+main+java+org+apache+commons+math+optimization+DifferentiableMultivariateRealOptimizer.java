{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/optimization/DifferentiableMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DifferentiableMultivariateRealOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateRealFunction\u003e"
      ],
      "begin_line": 33,
      "end_line": 44,
      "comment": "\n * This interface represents an optimization algorithm for {@link DifferentiableMultivariateRealFunction\n * scalar differentiable objective functions}.\n * \u003cp\u003eOptimization algorithms find the input point set that either {@link GoalType\n * maximize or minimize} an objective function.\u003c/p\u003e\n * @see MultivariateRealOptimizer\n * @see DifferentiableMultivariateVectorialOptimizer\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer.getGradientEvaluations()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Get the number of evaluations of the objective function gradient.\n     * The number of evaluations corresponds to the last call to the\n     * {@link #optimize(DifferentiableMultivariateRealFunction, GoalType, double[]) optimize}\n     * method. It is 0 if the method has not been called yet.\n     *\n     * @return the number of evaluations of the objective function gradient.\n     ",
      "child_ranges": []
    }
  ]
}