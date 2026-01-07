{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 49,
      "end_line": 195,
      "comment": "\n * Gauss-Newton least-squares solver.\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition and the\n     * convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     *\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 23)",
        "(line 100,col 9)-(line 100,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 104,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 38)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 50)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 119,col 9)-(line 119,col 57)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 43)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 38)"
      ]
    }
  ]
}