{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseOptimizer\u003corg.apache.commons.math3.optimization.PointValuePair\u003e"
      ],
      "begin_line": 36,
      "end_line": 57,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-FastMath. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     ",
      "child_ranges": []
    }
  ]
}