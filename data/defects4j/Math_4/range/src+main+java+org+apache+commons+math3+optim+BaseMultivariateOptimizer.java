{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/BaseMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.BaseOptimizer\u003cPAIR\u003e"
      ],
      "begin_line": 35,
      "end_line": 156,
      "comment": "\n * Base class for implementing optimizers for multivariate functions.\n * It contains the boiler-plate code for initial guess and bounds\n * specifications.\n * \u003cem\u003eIt is not a \"user\" class.\u003c/em\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/value pair returned by the optimization\n * algorithm.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Upper bounds. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.BaseMultivariateOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003cPAIR\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 63,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link BaseOptimizer#parseOptimizationData(OptimizationData[]) BaseOptimizer},\n     * this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 79,
      "end_line": 101,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 45)",
        "(line 86,col 9)-(line 97,col 9)",
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.getStartPoint()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess, or {@code null} if not set.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.getLowerBound()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * @return the lower bounds, or {@code null} if not set.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.getUpperBound()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * @return the upper bounds, or {@code null} if not set.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.BaseMultivariateOptimizer.checkParameters()",
      "begin_line": 127,
      "end_line": 155,
      "comment": "\n     * Check parameters consistency.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 154,col 9)"
      ]
    }
  ]
}