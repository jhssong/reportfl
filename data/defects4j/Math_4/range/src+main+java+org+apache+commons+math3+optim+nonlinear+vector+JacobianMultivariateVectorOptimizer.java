{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/JacobianMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobianMultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer"
      ],
      "begin_line": 39,
      "end_line": 112,
      "comment": "\n * Base class for implementing optimizers for multivariate vector\n * differentiable functions.\n * It contains boiler-plate code for dealing with Jacobian evaluation.\n * It assumes that the rows of the Jacobian matrix iterate on the model\n * functions while the columns iterate on the parameters; thus, the numbers\n * of rows is equal to the dimension of the {@link Target} while the\n * number of columns is equal to the dimension of the\n * {@link org.apache.commons.math3.optim.InitialGuess InitialGuess}.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Jacobian of the model function.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.JacobianMultivariateVectorOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(double[])",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Computes the Jacobian matrix.\n     *\n     * @param params Point at which the Jacobian must be evaluated.\n     * @return the Jacobian at the specified point.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 78,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link MultivariateVectorOptimizer#optimize(OptimizationData...)}\n     * MultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ModelFunctionJacobian}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 96,
      "end_line": 111,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ModelFunctionJacobian}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 45)",
        "(line 103,col 9)-(line 110,col 9)"
      ]
    }
  ]
}