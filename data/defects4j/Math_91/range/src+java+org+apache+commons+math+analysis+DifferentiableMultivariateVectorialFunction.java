{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/analysis/DifferentiableMultivariateVectorialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DifferentiableMultivariateVectorialFunction",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.analysis.MultivariateVectorialFunction"
      ],
      "begin_line": 27,
      "end_line": 74,
      "comment": " \n * Extension of {@link MultivariateVectorialFunction} representing a differentiable\n * multivariate vectorial function.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.partialDerivative(int)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returns the partial derivative of the function with respect to point\n     * coordinate x\u003csub\u003ej\u003c/sub\u003e.\n     * \u003cp\u003e\n     * The partial derivative basically represents column j of the jacobian\n     * matrix. If the partial derivatives with respect to all coordinates are\n     * needed, it may be more efficient to use the {@link #jacobian()} method\n     * which will compute the complete matrix at once.\n     * \u003c/p\u003e\n     * @param j index of the coordinate with respect to which the partial\n     * derivative is computed\n     * @return the partial derivative function with respect to point coordinate\n     * x\u003csub\u003ei\u003c/sub\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.gradient(int)",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Returns the gradient function of the i\u003csup\u003eth\u003c/sup\u003e component of\n     * the vectorial function.\n     * \n     * \u003cp\u003e\n     * The i\u003csup\u003eth\u003c/sup\u003e gradient basically represents row i of the jacobian\n     * matrix. If all gradients are needed, it may be more efficient to use the\n     * {@link #jacobian()} method which will compute the complete matrix at once.\n     * \u003c/p\u003e\n     * @param i index of the function component for which the gradient is requested\n     * @return the gradient function of the i\u003csup\u003eth\u003c/sup\u003e component of\n     * the vectorial function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.jacobian()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns the jacobian function.\n     * \u003cp\u003e\n     * If only one column of the jacobian is needed, it may be more efficient to\n     * use the {@link #partialDerivative(int)} method which will compute only the\n     * specified column. If only one row of the jacobian is needed, it may be more\n     * efficient to use the {@link #gradient(int)} method which will compute only the\n     * specified row.\n     * \u003c/p\u003e\n     * @return the jacobian function\n     ",
      "child_ranges": []
    }
  ]
}