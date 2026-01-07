{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 35,
      "end_line": 118,
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
      "begin_line": 41,
      "end_line": 41,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "linearConstraints"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}. "
    },
    {
      "type": "field",
      "varNames": [
        "nonNegative"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 84,
      "end_line": 89,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean)",
      "begin_line": 92,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 42)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 103,col 9)-(line 103,col 24)",
        "(line 106,col 9)-(line 106,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 115,
      "end_line": 116,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception OptimizationException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}