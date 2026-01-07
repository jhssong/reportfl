{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer",
        "java.io.Serializable"
      ],
      "begin_line": 47,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to\n     * {@link AbstractLeastSquaresOptimizer#DEFAULT_MAX_ITERATIONS}.\n     * @param useLU if true, the normal equations will be solved using LU\n     * decomposition, otherwise they will be solved using QR decomposition\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 67,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 47)",
        "(line 73,col 9)-(line 132,col 9)",
        "(line 135,col 9)-(line 135,col 23)"
      ]
    }
  ]
}