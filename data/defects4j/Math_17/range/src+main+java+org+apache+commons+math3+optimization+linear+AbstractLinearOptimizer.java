{
  "filepath": "/tmp/Math-17b/src/main/java/org/apache/commons/math3/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 37,
      "end_line": 161,
      "comment": "\n * Base class for implementing linear optimizers.\n * \u003cp\u003e\n * This base class handles the boilerplate methods associated to thresholds\n * settings and iterations counters.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Linear objective function.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Linear constraints.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Whether to restrict the variables to non-negative values.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.restrictToNonNegative()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @return {@code true} if the variables are restricted to non-negative values.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getGoalType()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getFunction()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getConstraints()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Increment the iterations counter by 1.\n     * @exception MaxCountExceededException if the maximal number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean)",
      "begin_line": 135,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 142,col 45)",
        "(line 143,col 9)-(line 143,col 42)",
        "(line 144,col 9)-(line 144,col 55)",
        "(line 146,col 9)-(line 146,col 24)",
        "(line 149,col 9)-(line 149,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception MathIllegalStateException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}