{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/general/BaseAbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer\u003cT\u003e"
      ],
      "begin_line": 45,
      "end_line": 204,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n * This class is mainly intended to enforce the internal coherence of\n * Commons-Math.\n * A class that implements an optimization algorithm should inherit from\n * {@link AbstractScalarOptimizer} or from\n * {@link AbstractScalarDifferentiableOptimizer}.\n * @param \u003cT\u003e the type of the objective function to be optimized\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Default maximal number of iterations allowed ({@value}). "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_EVALUATIONS"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default maximal number of iterations allowed ({@value}). "
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
        "maxIterations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleScalarValueChecker},\n     * the allowed number of iterations and evaluations are set to their\n     * default values.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.BaseAbstractScalarOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker, int, int)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxIterations Maximum number of iterations.\n     * @param maxEvaluations Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 31)",
        "(line 89,col 9)-(line 89,col 43)",
        "(line 90,col 9)-(line 90,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.setMaxIterations(int)",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getMaxIterations()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getIterations()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.setMaxEvaluations(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getMaxEvaluations()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getEvaluations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 124,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getConvergenceChecker()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.incrementIterationsCounter()",
      "begin_line": 138,
      "end_line": 143,
      "comment": "\n     * Increment the iterations counter by 1.\n     * @throws OptimizationException if the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.computeObjectiveValue(double[])",
      "begin_line": 153,
      "end_line": 160,
      "comment": "\n     * Compute the objective function value.\n     * @param evaluationPoint point at which the objective function must be evaluated\n     * @return objective function value at specified point\n     * @throws FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or the maximal number\n     * of iterations is exceeded\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.optimize(T, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 163,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 23)",
        "(line 170,col 9)-(line 170,col 24)",
        "(line 173,col 9)-(line 173,col 21)",
        "(line 174,col 9)-(line 174,col 24)",
        "(line 175,col 9)-(line 175,col 35)",
        "(line 177,col 9)-(line 177,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getGoalType()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.getStartPoint()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer.doOptimize()",
      "begin_line": 202,
      "end_line": 203,
      "comment": "\n     * Perform the bulk of optimization algorithm.\n     * @return the point/value pair giving the optimal value for objective function\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @throws OptimizationException if the algorithm failed to converge\n     * @throws IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}