{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/optimization/general/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 48,
      "end_line": 191,
      "comment": "\n * Gauss-Newton least-squares solver.\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition and the\n     * convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}\n     * with default tolerances.\n     *\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 102,
      "end_line": 190,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 105,col 38)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 50)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 54)",
        "(line 123,col 9)-(line 123,col 43)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 127,col 9)-(line 127,col 21)",
        "(line 128,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 38)"
      ]
    }
  ]
}