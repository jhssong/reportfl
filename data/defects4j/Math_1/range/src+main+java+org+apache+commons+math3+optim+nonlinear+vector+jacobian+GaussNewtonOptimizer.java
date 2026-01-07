{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/GaussNewtonOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 55,
      "end_line": 184,
      "comment": "\n * Gauss-Newton least-squares solver.\n * \u003cbr/\u003e\n * Constraints are not supported: the call to\n * {@link #optimize(OptimizationData[]) optimize} will throw\n * {@link MathUnsupportedOperationException} if bounds are passed to it.\n *\n * \u003cp\u003e\n * This class solve a least-square problem by solving the normal equations\n * of the linearized problem at each iteration. Either LU decomposition or\n * QR decomposition can be used to solve the normal equations. LU decomposition\n * is faster but QR decomposition is more robust for difficult problems.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 2.0\n * @deprecated All classes and interfaces in this package are deprecated.\n * The optimizers that were provided here were moved to the\n * {@link org.apache.commons.math3.fitting.leastsquares} package\n * (cf. MATH-1008).\n "
    },
    {
      "type": "field",
      "varNames": [
        "useLU"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Indicator for using LU decomposition. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Simple constructor with default settings.\n     * The normal equations will be solved using LU decomposition.\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.GaussNewtonOptimizer(boolean, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * @param useLU If {@code true}, the normal equations will be solved\n     * using LU decomposition, otherwise they will be solved using QR\n     * decomposition.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 23)",
        "(line 79,col 9)-(line 79,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize()",
      "begin_line": 83,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 26)",
        "(line 87,col 9)-(line 88,col 38)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 95,col 50)",
        "(line 96,col 9)-(line 96,col 43)",
        "(line 98,col 9)-(line 98,col 52)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 54)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.checkParameters()",
      "begin_line": 178,
      "end_line": 183,
      "comment": "\n     * @throws MathUnsupportedOperationException if bounds were passed to the\n     * {@link #optimize(OptimizationData[]) optimize} method.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 182,col 9)"
      ]
    }
  ]
}