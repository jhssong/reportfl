{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 38,
      "end_line": 163,
      "comment": "\n * Base class for implementing linear optimizers.\n * \u003cp\u003e\n * This base class handles the boilerplate methods associated to thresholds\n * settings and iterations counters.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Linear objective function.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Linear constraints.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Whether to restrict the variables to non-negative values.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.restrictToNonNegative()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * @return {@code true} if the variables are restricted to non-negative values.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getGoalType()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getFunction()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getConstraints()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 116,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 121,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * Increment the iterations counter by 1.\n     * @exception MaxCountExceededException if the maximal number of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math3.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math3.optimization.linear.LinearConstraint\u003e, org.apache.commons.math3.optimization.GoalType, boolean)",
      "begin_line": 137,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 45)",
        "(line 145,col 9)-(line 145,col 42)",
        "(line 146,col 9)-(line 146,col 55)",
        "(line 148,col 9)-(line 148,col 24)",
        "(line 151,col 9)-(line 151,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception MathIllegalStateException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}