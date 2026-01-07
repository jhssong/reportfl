{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/univariate/UnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseOptimizer\u003corg.apache.commons.math3.optim.univariate.UnivariatePointValuePair\u003e"
      ],
      "begin_line": 32,
      "end_line": 151,
      "comment": "\n * Base class for a univariate scalar function optimizer.\n *\n * @version $Id$\n * @since 3.1\n "
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
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Lower bound. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Upper bound. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.UnivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.univariate.UnivariatePointValuePair\u003e)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link BaseOptimizer#parseOptimizationData(OptimizationData[])\n     * BaseOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     *  \u003cli\u003e{@link SearchInterval}\u003c/li\u003e\n     *  \u003cli\u003e{@link UnivariateObjectiveFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getGoalType()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 92,
      "end_line": 116,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     *  \u003cli\u003e{@link SearchInterval}\u003c/li\u003e\n     *  \u003cli\u003e{@link UnivariateObjectiveFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 45)",
        "(line 99,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getStartValue()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getMin()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getMax()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.computeObjectiveValue(double)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param x Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 33)"
      ]
    }
  ]
}