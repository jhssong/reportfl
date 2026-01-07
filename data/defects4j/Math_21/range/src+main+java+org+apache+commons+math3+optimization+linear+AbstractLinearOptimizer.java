{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 36,
      "end_line": 159,
      "comment": "\n * Base class for implementing linear optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings and iterations counters.\u003c/p\u003e\n * @version $Id$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Linear objective function.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Linear constraints.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Whether to restrict the variables to non-negative values.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.restrictToNonNegative()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * @return {@code true} if the variables are restricted to non-negative values.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getGoalType()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getFunction()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getConstraints()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 125,
      "end_line": 130,
      "comment": " Increment the iterations counter by 1.\n     * @exception MaxCountExceededException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean)",
      "begin_line": 133,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 142,col 55)",
        "(line 144,col 9)-(line 144,col 24)",
        "(line 147,col 9)-(line 147,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 156,
      "end_line": 157,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception MathIllegalStateException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}