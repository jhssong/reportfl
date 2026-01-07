{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 44,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}\n     * and the maximal number of evaluation is set to\n     * {@link AbstractLeastSquaresOptimizer#DEFAULT_MAX_ITERATIONS}.\n     * @param useLU if true, the normal equations will be solved using LU\n     * decomposition, otherwise they will be solved using QR decomposition\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 62,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 47)",
        "(line 68,col 9)-(line 127,col 9)",
        "(line 130,col 9)-(line 130,col 23)"
      ]
    }
  ]
}