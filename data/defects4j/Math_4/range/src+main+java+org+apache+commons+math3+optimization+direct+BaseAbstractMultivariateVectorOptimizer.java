{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 47,
      "end_line": 370,
      "comment": "\n * Base class for implementing optimizers for multivariate scalar functions.\n * This base class handles the boiler-plate methods associated to thresholds\n * settings, iterations and evaluations counting.\n *\n * @param \u003cFUNC\u003e the type of the objective function to be optimized\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
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
        "target"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Target value for the objective functions at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrix"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Weight matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Weight for the least squares cost computation.\n     * @deprecated\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getMaxEvaluations()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getEvaluations()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getConvergenceChecker()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(double[])",
      "begin_line": 106,
      "end_line": 113,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 121,
      "end_line": 125,
      "comment": " {@inheritDoc}\n     *\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 147,
      "end_line": 153,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(int, FUNC, double[], double[], double[])",
      "begin_line": 178,
      "end_line": 203,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param t Target value for the objective functions at optimum.\n     * @param w Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link #optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 202,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(int, FUNC, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 225,
      "end_line": 242,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 45)",
        "(line 232,col 9)-(line 232,col 33)",
        "(line 233,col 9)-(line 233,col 21)",
        "(line 235,col 9)-(line 235,col 39)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 239,col 9)-(line 239,col 16)",
        "(line 241,col 9)-(line 241,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getStartPoint()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Gets the initial values of the optimized parameters.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Gets the weight matrix of the observations.\n     *\n     * @return the weight matrix.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTarget()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Gets the observed values to be matched by the objective vector\n     * function.\n     *\n     * @return the target values.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getObjectiveFunction()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Gets the objective vector function.\n     * Note that this access bypasses the evaluation counter.\n     *\n     * @return the objective vector function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.doOptimize()",
      "begin_line": 290,
      "end_line": 290,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTargetRef()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeightRef()",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp()",
      "begin_line": 319,
      "end_line": 326,
      "comment": "\n     * Method which a subclass \u003cem\u003emust\u003c/em\u003e override whenever its internal\n     * state depend on the {@link OptimizationData input} parsed by this base\n     * class.\n     * It will be called after the parsing step performed in the\n     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize} method and just before {@link #doOptimize()}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 38)",
        "(line 322,col 9)-(line 322,col 33)",
        "(line 323,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 339,
      "end_line": 356,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 355,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters()",
      "begin_line": 364,
      "end_line": 369,
      "comment": "\n     * Check parameters consistency.\n     *\n     * @throws DimensionMismatchException if {@link #target} and\n     * {@link #weightMatrix} have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 368,col 9)"
      ]
    }
  ]
}