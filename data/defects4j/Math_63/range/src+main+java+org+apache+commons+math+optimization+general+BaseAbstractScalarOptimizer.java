{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/BaseAbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cT\u003e"
      ],
      "begin_line": 48,
      "end_line": 174,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n * This class is mainly intended to enforce the internal coherence of\n * Commons-FastMath.\n * A class that implements an optimization algorithm should inherit from\n * {@link AbstractScalarOptimizer} or from\n * {@link AbstractScalarDifferentiableOptimizer}.\n *\n * @param \u003cT\u003e the type of the objective function to be optimized\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Type of optimization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleScalarValueChecker} and\n     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 64)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e, int)",
      "begin_line": 73,
      "end_line": 77,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)",
        "(line 76,col 9)-(line 76,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.setMaxEvaluations(int)",
      "begin_line": 80,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getMaxEvaluations()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getEvaluations()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e)",
      "begin_line": 95,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getConvergenceChecker()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.computeObjectiveValue(double[])",
      "begin_line": 113,
      "end_line": 121,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws FunctionEvaluationException if the function cannot be evaluated.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.optimize(T, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 124,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 143,col 9)-(line 143,col 21)",
        "(line 144,col 9)-(line 144,col 24)",
        "(line 145,col 9)-(line 145,col 35)",
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getGoalType()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getStartPoint()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.doOptimize()",
      "begin_line": 172,
      "end_line": 173,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for objective function\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search\n     ",
      "child_ranges": []
    }
  ]
}