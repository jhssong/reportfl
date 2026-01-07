{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 47,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition and the\n     * convergence check is set to a {@link SimpleVectorialValueChecker}\n     * with default tolerances.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorialValueChecker}\n     * with default tolerances.\n     *\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 90,
      "end_line": 94,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 97,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 38)",
        "(line 104,col 9)-(line 104,col 47)",
        "(line 105,col 9)-(line 105,col 21)",
        "(line 106,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    }
  ]
}