{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/DifferentiableMultivariateFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DifferentiableMultivariateFunction",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 27,
      "end_line": 53,
      "comment": "\n * Extension of {@link MultivariateFunction} representing a differentiable\n * multivariate real function.\n * @version $Id$\n * @since 2.0\n * @deprecated as of 3.1 replaced by {@link org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction}\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction.partialDerivative(int)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Returns the partial derivative of the function with respect to a point coordinate.\n     * \u003cp\u003e\n     * The partial derivative is defined with respect to point coordinate\n     * x\u003csub\u003ek\u003c/sub\u003e. If the partial derivatives with respect to all coordinates are\n     * needed, it may be more efficient to use the {@link #gradient()} method which will\n     * compute them all at once.\n     * \u003c/p\u003e\n     * @param k index of the coordinate with respect to which the partial\n     * derivative is computed\n     * @return the partial derivative function with respect to k\u003csup\u003eth\u003c/sup\u003e point coordinate\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.DifferentiableMultivariateFunction.gradient()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns the gradient function.\n     * \u003cp\u003eIf only one partial derivative with respect to a specific coordinate is\n     * needed, it may be more efficient to use the {@link #partialDerivative(int)} method\n     * which will compute only the specified component.\u003c/p\u003e\n     * @return the gradient function\n     ",
      "child_ranges": []
    }
  ]
}