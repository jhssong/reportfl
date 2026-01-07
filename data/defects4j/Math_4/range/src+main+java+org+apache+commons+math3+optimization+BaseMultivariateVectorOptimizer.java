{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/BaseMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateVectorOptimizer",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseOptimizer\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e"
      ],
      "begin_line": 36,
      "end_line": 64,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param target Target value for the objective functions at optimum.\n     * @param weight Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. In 4.0, this will be replaced by the declaration\n     * corresponding to this {@link org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[]) method}.\n     ",
      "child_ranges": []
    }
  ]
}