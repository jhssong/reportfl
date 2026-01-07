{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/GradientMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GradientMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 33,
      "end_line": 103,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar\n * differentiable functions.\n * It contains boiler-plate code for dealing with gradient evaluation.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "gradient"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Gradient of the objective function.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.GradientMultivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.computeObjectiveGradient(double[])",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Compute the gradient vector.\n     *\n     * @param params Point at which the gradient must be evaluated.\n     * @return the gradient at the specified point.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link MultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * MultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ObjectiveFunctionGradient}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations (of the objective function) is exceeded.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 87,
      "end_line": 102,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ObjectiveFunctionGradient}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 45)",
        "(line 94,col 9)-(line 101,col 9)"
      ]
    }
  ]
}