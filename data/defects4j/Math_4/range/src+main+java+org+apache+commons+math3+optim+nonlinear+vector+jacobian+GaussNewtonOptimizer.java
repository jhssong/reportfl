{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 52,
      "end_line": 180,
      "comment": "\n * Gauss-Newton least-squares solver.\n * \u003cbr/\u003e\n * Constraints are not supported: the call to\n * {@link #optimize(OptimizationData[]) optimize} will throw\n * {@link MathUnsupportedOperationException} if bounds are passed to it.\n *\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 23)",
        "(line 75,col 9)-(line 75,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 79,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)",
        "(line 83,col 9)-(line 84,col 38)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 92,col 9)-(line 92,col 43)",
        "(line 94,col 9)-(line 94,col 52)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 54)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.checkParameters()",
      "begin_line": 174,
      "end_line": 179,
      "comment": "\n     * @throws MathUnsupportedOperationException if bounds were passed to the\n     * {@link #optimize(OptimizationData[]) optimize} method.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 178,col 9)"
      ]
    }
  ]
}