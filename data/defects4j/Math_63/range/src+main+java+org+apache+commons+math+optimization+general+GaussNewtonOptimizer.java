{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 45,
      "end_line": 131,
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
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     *\n     * @param useLU if {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 63,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 21)",
        "(line 70,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 23)"
      ]
    }
  ]
}