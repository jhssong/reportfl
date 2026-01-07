{
  "filepath": "/tmp/Math-87b/src/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 45,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to\n     * {@link AbstractLeastSquaresOptimizer#DEFAULT_MAX_ITERATIONS}.\n     * @param useLU if true, the normal equations will be solved using LU\n     * decomposition, otherwise they will be solved using QR decomposition\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 65,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 47)",
        "(line 71,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 23)"
      ]
    }
  ]
}