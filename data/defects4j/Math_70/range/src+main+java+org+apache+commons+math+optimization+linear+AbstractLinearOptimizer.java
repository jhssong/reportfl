{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 35,
      "end_line": 130,
      "comment": "\n * Base class for implementing linear optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings and iterations counters.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Linear objective function.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Linear constraints.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Whether to restrict the variables to non-negative values.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 96,
      "end_line": 101,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean)",
      "begin_line": 104,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 35)",
        "(line 111,col 9)-(line 111,col 45)",
        "(line 112,col 9)-(line 112,col 42)",
        "(line 113,col 9)-(line 113,col 55)",
        "(line 115,col 9)-(line 115,col 24)",
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 127,
      "end_line": 128,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception OptimizationException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}