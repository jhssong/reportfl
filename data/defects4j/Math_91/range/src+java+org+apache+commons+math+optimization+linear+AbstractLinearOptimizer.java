{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/optimization/linear/AbstractLinearOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLinearOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.linear.LinearOptimizer"
      ],
      "begin_line": 35,
      "end_line": 123,
      "comment": "\n * Base class for implementing linear optimizers.\n * \u003cp\u003eThis base class handles the boilerplate methods associated to thresholds\n * settings and iterations counters.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Linear objective function. "
    },
    {
      "type": "field",
      "varNames": [
        "constraints"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Linear constraints. "
    },
    {
      "type": "field",
      "varNames": [
        "goalType"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Type of optimization goal: either {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}. "
    },
    {
      "type": "field",
      "varNames": [
        "restrictToNonNegative"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Whether to restrict the variables to non-negative values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.AbstractLinearOptimizer()",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003eThe maximal number of evaluation is set to its default value.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.setMaxIterations(int)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getMaxIterations()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.getIterations()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.incrementIterationsCounter()",
      "begin_line": 87,
      "end_line": 94,
      "comment": " Increment the iterations counter by 1.\n     * @exception OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.optimize(org.apache.commons.math.optimization.linear.LinearObjectiveFunction, java.util.Collection\u003corg.apache.commons.math.optimization.linear.LinearConstraint\u003e, org.apache.commons.math.optimization.GoalType, boolean)",
      "begin_line": 97,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 49)",
        "(line 105,col 9)-(line 105,col 46)",
        "(line 106,col 9)-(line 106,col 59)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 111,col 9)-(line 111,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.doOptimize()",
      "begin_line": 120,
      "end_line": 121,
      "comment": " Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception OptimizationException if no solution fulfilling the constraints\n     * can be found in the allowed number of iterations\n     ",
      "child_ranges": []
    }
  ]
}