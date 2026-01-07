{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/optimization/direct/BaseAbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 42,
      "end_line": 168,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Type of optimization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleScalarValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e, int)",
      "begin_line": 67,
      "end_line": 71,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 31)",
        "(line 70,col 9)-(line 70,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.setMaxEvaluations(int)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getMaxEvaluations()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getEvaluations()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getConvergenceChecker()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.computeObjectiveValue(double[])",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws FunctionEvaluationException if the function cannot be evaluated.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.optimize(FUNC, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 118,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 33)",
        "(line 137,col 9)-(line 137,col 21)",
        "(line 138,col 9)-(line 138,col 24)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 142,col 9)-(line 142,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getGoalType()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.getStartPoint()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer.doOptimize()",
      "begin_line": 166,
      "end_line": 167,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for objective function\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search\n     ",
      "child_ranges": []
    }
  ]
}