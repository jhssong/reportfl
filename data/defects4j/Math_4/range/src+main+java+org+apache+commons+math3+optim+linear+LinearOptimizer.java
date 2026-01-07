{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/linear/LinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 32,
      "end_line": 132,
      "comment": "\n * Base class for implementing linear optimizers.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Linear objective function.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Linear constraints.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Whether to restrict the variables to non-negative values.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.LinearOptimizer()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Simple constructor with default settings.\n     *\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.isRestrictedToNonNegative()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * @return {@code true} if the variables are restricted to non-negative values.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.getFunction()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.getConstraints()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link MultivariateOptimizer#parseOptimizationData(OptimizationData[])\n     * MultivariateOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link LinearObjectiveFunction}\u003c/li\u003e\n     *  \u003cli\u003e{@link LinearConstraintSet}\u003c/li\u003e\n     *  \u003cli\u003e{@link NonNegativeConstraint}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyIterationsException if the maximal number of\n     * iterations is exceeded.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.linear.LinearOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 110,
      "end_line": 131,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data.\n     * The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link LinearObjectiveFunction}\u003c/li\u003e\n     *  \u003cli\u003e{@link LinearConstraintSet}\u003c/li\u003e\n     *  \u003cli\u003e{@link NonNegativeConstraint}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 45)",
        "(line 117,col 9)-(line 130,col 9)"
      ]
    }
  ]
}