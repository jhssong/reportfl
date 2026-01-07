{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/ModelFunctionJacobian.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ModelFunctionJacobian",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.OptimizationData"
      ],
      "begin_line": 32,
      "end_line": 52,
      "comment": "\n * Jacobian of the model (vector) function to be optimized.\n *\n * @version $Id$\n * @since 3.1\n * @deprecated All classes and interfaces in this package are deprecated.\n * The optimizers that were provided here were moved to the\n * {@link org.apache.commons.math3.fitting.leastsquares} package\n * (cf. MATH-1008).\n "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Function to be optimized. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian.ModelFunctionJacobian(org.apache.commons.math3.analysis.MultivariateMatrixFunction)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * @param j Jacobian of the model function to be optimized.\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian.getModelFunctionJacobian()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Gets the Jacobian of the model function to be optimized.\n     *\n     * @return the model function Jacobian.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 24)"
      ]
    }
  ]
}