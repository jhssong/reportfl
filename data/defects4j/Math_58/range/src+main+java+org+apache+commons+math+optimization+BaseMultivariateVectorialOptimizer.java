{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/optimization/BaseMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateVectorialOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseOptimizer\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e"
      ],
      "begin_line": 35,
      "end_line": 61,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param target Target value for the objective functions at optimum.\n     * @param weight Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * function throws one during search.\n     ",
      "child_ranges": []
    }
  ]
}