{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 47,
      "end_line": 319,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds,\n * evaluations counting, initial guess and simple bounds settings.\n *\n * @param \u003cFUNC\u003e Type of the objective function to be optimized.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 2.2\n "
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
        "lowerBound"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Upper bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.BaseAbstractMultivariateOptimizer()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleValueChecker}.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.BaseAbstractMultivariateOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getMaxEvaluations()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getEvaluations()",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getConvergenceChecker()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(double[])",
      "begin_line": 104,
      "end_line": 111,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimizeInternal(int, FUNC, org.apache.commons.math3.optimization.GoalType, double[])",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either\n     * {@link GoalType#MAXIMIZE} or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @param maxEval Maximum number of function evaluations.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateFunction,GoalType,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.optimizeInternal(int, FUNC, org.apache.commons.math3.optimization.GoalType, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 191,
      "end_line": 207,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param goalType Optimization type.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 45)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 21)",
        "(line 200,col 9)-(line 200,col 24)",
        "(line 202,col 9)-(line 202,col 39)",
        "(line 204,col 9)-(line 204,col 26)",
        "(line 206,col 9)-(line 206,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 219,
      "end_line": 234,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     *  \u003cli\u003e{@link SimpleBounds}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getGoalType()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * @return the optimization type.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getStartPoint()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getLowerBound()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * @return the lower bounds.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getUpperBound()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * @return the upper bounds.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.doOptimize()",
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value of the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.checkParameters()",
      "begin_line": 275,
      "end_line": 318,
      "comment": "\n     * Check parameters consistency.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 317,col 9)"
      ]
    }
  ]
}