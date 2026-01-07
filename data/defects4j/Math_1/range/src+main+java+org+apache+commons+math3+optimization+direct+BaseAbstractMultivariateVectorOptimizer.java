{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optimization/direct/BaseAbstractMultivariateVectorOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseAbstractMultivariateVectorOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.BaseMultivariateVectorOptimizer\u003cFUNC\u003e"
      ],
      "begin_line": 47,
      "end_line": 371,
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
      "end_line": 62,
      "comment": " Weight for the least squares cost computation.\n     * @deprecated\n     "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Initial guess. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Objective function. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer()",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link SimpleVectorValueChecker}.\n     * @deprecated See {@link SimpleVectorValueChecker#SimpleVectorValueChecker()}\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.BaseAbstractMultivariateVectorOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getMaxEvaluations()",
      "begin_line": 85,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getEvaluations()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getConvergenceChecker()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(double[])",
      "begin_line": 107,
      "end_line": 114,
      "comment": "\n     * Compute the objective function value.\n     *\n     * @param point Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws TooManyEvaluationsException if the maximal number of evaluations is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimize(int, FUNC, double[], double[], double[])",
      "begin_line": 122,
      "end_line": 126,
      "comment": " {@inheritDoc}\n     *\n     * @deprecated As of 3.1. Please use\n     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimize(int, FUNC, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 148,
      "end_line": 154,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(int, FUNC, double[], double[], double[])",
      "begin_line": 179,
      "end_line": 204,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param t Target value for the objective functions at optimum.\n     * @param w Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link #optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 203,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(int, FUNC, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 226,
      "end_line": 243,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 45)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 21)",
        "(line 236,col 9)-(line 236,col 39)",
        "(line 238,col 9)-(line 238,col 26)",
        "(line 240,col 9)-(line 240,col 16)",
        "(line 242,col 9)-(line 242,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getStartPoint()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Gets the initial values of the optimized parameters.\n     *\n     * @return the initial guess.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Gets the weight matrix of the observations.\n     *\n     * @return the weight matrix.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTarget()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Gets the observed values to be matched by the objective vector\n     * function.\n     *\n     * @return the target values.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getObjectiveFunction()",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Gets the objective vector function.\n     * Note that this access bypasses the evaluation counter.\n     *\n     * @return the objective vector function.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.doOptimize()",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n     * Perform the bulk of the optimization algorithm.\n     *\n     * @return the point/value pair giving the optimal value for the\n     * objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTargetRef()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * @return a reference to the {@link #target array}.\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeightRef()",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * @return a reference to the {@link #weight array}.\n     * @deprecated As of 3.1.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp()",
      "begin_line": 320,
      "end_line": 327,
      "comment": "\n     * Method which a subclass \u003cem\u003emust\u003c/em\u003e override whenever its internal\n     * state depend on the {@link OptimizationData input} parsed by this base\n     * class.\n     * It will be called after the parsing step performed in the\n     * {@link #optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize} method and just before {@link #doOptimize()}.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 38)",
        "(line 323,col 9)-(line 323,col 33)",
        "(line 324,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 340,
      "end_line": 357,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters()",
      "begin_line": 365,
      "end_line": 370,
      "comment": "\n     * Check parameters consistency.\n     *\n     * @throws DimensionMismatchException if {@link #target} and\n     * {@link #weightMatrix} have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 369,col 9)"
      ]
    }
  ]
}