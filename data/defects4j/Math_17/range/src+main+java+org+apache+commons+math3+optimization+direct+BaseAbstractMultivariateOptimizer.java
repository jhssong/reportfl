{
  "filepath": "/tmp/Math-17b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 46,
      "end_line": 312,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds,\n * evaluations counting, initial guess and simple bounds settings.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Evaluations counter. "
    },
    {
      "type": "field",
      "varNames": [
        "checker"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Convergence checker. "
    },
    {
      "type": "field",
      "varNames": [
        "goal"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Type of optimization. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Upper bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.BaseAbstractMultivariateOptimizer()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleValueChecker}.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.BaseAbstractMultivariateOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getMaxEvaluations()",
      "begin_line": 80,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getEvaluations()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getConvergenceChecker()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(double[])",
      "begin_line": 102,
      "end_line": 109,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 137,
      "end_line": 142,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.MultivariateFunction, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 186,
      "end_line": 202,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 45)",
        "(line 193,col 9)-(line 193,col 33)",
        "(line 194,col 9)-(line 194,col 21)",
        "(line 195,col 9)-(line 195,col 24)",
        "(line 197,col 9)-(line 197,col 39)",
        "(line 199,col 9)-(line 199,col 26)",
        "(line 201,col 9)-(line 201,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 214,
      "end_line": 229,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getGoalType()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getStartPoint()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getLowerBound()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * @return the lower bounds.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getUpperBound()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * @return the upper bounds.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.doOptimize()",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.checkParameters()",
      "begin_line": 268,
      "end_line": 311,
      "comment": "\n     * Check parameters consistency.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 310,col 9)"
      ]
    }
  ]
}