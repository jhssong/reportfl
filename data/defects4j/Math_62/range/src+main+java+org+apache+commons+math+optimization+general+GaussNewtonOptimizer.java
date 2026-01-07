{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 46,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     *\n     * @param useLU if {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 64,
      "end_line": 136,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 69,col 38)",
        "(line 72,col 9)-(line 72,col 47)",
        "(line 73,col 9)-(line 73,col 21)",
        "(line 74,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 23)"
      ]
    }
  ]
}