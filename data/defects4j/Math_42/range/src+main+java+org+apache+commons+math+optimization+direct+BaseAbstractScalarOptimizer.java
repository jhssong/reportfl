{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/optimization/direct/BaseAbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 41,
      "end_line": 149,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Type of optimization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleScalarValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getMaxEvaluations()",
      "begin_line": 70,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getEvaluations()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getConvergenceChecker()",
      "begin_line": 80,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.computeObjectiveValue(double[])",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.optimize(int, FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 102,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 117,col 33)",
        "(line 120,col 9)-(line 120,col 21)",
        "(line 121,col 9)-(line 121,col 24)",
        "(line 122,col 9)-(line 122,col 35)",
        "(line 125,col 9)-(line 125,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getGoalType()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getStartPoint()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.doOptimize()",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for the\n     * objective function.\n     ",
      "child_ranges": []
    }
  ]
}