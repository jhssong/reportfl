{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/differentiation/JacobianFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobianFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateMatrixFunction"
      ],
      "begin_line": 31,
      "end_line": 70,
      "comment": " Class representing the Jacobian of a multivariate vector function.\n * \u003cp\u003e\n * The rows iterate on the model functions while the columns iterate on the parameters; thus,\n * the numbers of rows is equal to the dimension of the underlying function vector\n * value and the number of columns is equal to the number of free parameters of\n * the underlying function.\n * \u003c/p\u003e\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Underlying vector-valued function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.JacobianFunction.JacobianFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Simple constructor.\n     * @param f underlying vector-valued function\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(double[])",
      "begin_line": 44,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 80)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 53,col 9)-(line 53,col 55)",
        "(line 56,col 9)-(line 56,col 66)",
        "(line 57,col 9)-(line 57,col 51)",
        "(line 58,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 66,col 17)"
      ]
    }
  ]
}