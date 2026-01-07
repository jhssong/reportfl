{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/MultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseMultivariateOptimizer\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e"
      ],
      "begin_line": 35,
      "end_line": 166,
      "comment": "\n * Base class for a multivariate vector function optimizer.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Target values for the model function at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrix"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Weight matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "model"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Model function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.MultivariateVectorOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(double[])",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param params Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations\n     * (of the model vector function) is exceeded.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 41)",
        "(line 63,col 9)-(line 63,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link BaseMultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * BaseMultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link ModelFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Gets the weight matrix of the observations.\n     *\n     * @return the weight matrix.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getTarget()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Gets the observed values to be matched by the objective vector\n     * function.\n     *\n     * @return the target values.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getTargetSize()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Gets the number of observed values.\n     *\n     * @return the length of the target vector.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 128,
      "end_line": 152,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link ModelFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 45)",
        "(line 135,col 9)-(line 148,col 9)",
        "(line 151,col 9)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters()",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\n     * Check parameters consistency.\n     *\n     * @throws DimensionMismatchException if {@link #target} and\n     * {@link #weightMatrix} have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 164,col 9)"
      ]
    }
  ]
}