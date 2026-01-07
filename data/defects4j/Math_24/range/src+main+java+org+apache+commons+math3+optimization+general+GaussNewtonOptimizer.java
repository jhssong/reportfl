{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 47,
      "end_line": 172,
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
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition and the\n     * convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     *\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 101,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 38)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 23)"
      ]
    }
  ]
}