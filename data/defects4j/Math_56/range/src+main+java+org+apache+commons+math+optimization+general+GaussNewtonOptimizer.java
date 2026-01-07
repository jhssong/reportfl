{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 46,
      "end_line": 136,
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
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 68,col 38)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 72,col 9)-(line 72,col 21)",
        "(line 73,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 23)"
      ]
    }
  ]
}