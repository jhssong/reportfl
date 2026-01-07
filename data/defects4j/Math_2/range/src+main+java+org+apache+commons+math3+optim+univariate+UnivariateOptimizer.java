{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/optim/univariate/UnivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseOptimizer\u003corg.apache.commons.math3.optim.univariate.UnivariatePointValuePair\u003e"
      ],
      "begin_line": 32,
      "end_line": 152,
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
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link BaseOptimizer#parseOptimizationData(OptimizationData[])\n     * BaseOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     *  \u003cli\u003e{@link SearchInterval}\u003c/li\u003e\n     *  \u003cli\u003e{@link UnivariateObjectiveFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getGoalType()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 93,
      "end_line": 117,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link GoalType}\u003c/li\u003e\n     *  \u003cli\u003e{@link SearchInterval}\u003c/li\u003e\n     *  \u003cli\u003e{@link UnivariateObjectiveFunction}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 45)",
        "(line 100,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getStartValue()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getMin()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.getMax()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.univariate.UnivariateOptimizer.computeObjectiveValue(double)",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param x Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 33)"
      ]
    }
  ]
}