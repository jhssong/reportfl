{
  "filepath": "/tmp/Math-13b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 46,
      "end_line": 162,
      "comment": "\n * Gauss-Newton least-squares solver.\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id: GaussNewtonOptimizer.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n *\n "
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
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 23)",
        "(line 69,col 9)-(line 69,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 73,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 38)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 84,col 9)-(line 84,col 43)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 54)",
        "(line 94,col 9)-(line 94,col 43)",
        "(line 97,col 9)-(line 97,col 44)",
        "(line 98,col 9)-(line 98,col 21)",
        "(line 99,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 38)"
      ]
    }
  ]
}