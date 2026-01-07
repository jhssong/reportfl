{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/MultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003corg.apache.commons.math3.optim.PointValuePair\u003e"
      ],
      "begin_line": 32,
      "end_line": 118,
      "comment": "\n * Base class for a multivariate scalar function optimizer.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Type of optimization. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.MultivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointValuePair\u003e)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 60,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link BaseMultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * BaseMultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ObjectiveFunction}\u003c/li\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 78,
      "end_line": 95,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link ObjectiveFunction}\u003c/li\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)",
        "(line 85,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.getGoalType()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.computeObjectiveValue(double[])",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param params Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 38)"
      ]
    }
  ]
}