{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer"
      ],
      "begin_line": 62,
      "end_line": 574,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * Jacobian and error estimation.\n * \u003cbr/\u003e\n * This class constructs the Jacobian matrix of the function argument in method\n * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n * optimize} and assumes that the rows of that matrix iterate on the model\n * functions while the columns iterate on the parameters; thus, the numbers\n * of rows is equal to the dimension of the\n * {@link org.apache.commons.math3.optimization.Target Target} while\n * the number of columns is equal to the dimension of the\n * {@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SINGULARITY_THRESHOLD"
      ],
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * Singularity threshold (cf. {@link #getCovariances(double)}).\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 81,
      "end_line": 82,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     * @deprecated As of 3.1. To be removed in 4.0. Please use\n     * {@link #computeWeightedJacobian(double[])} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": " Number of columns of the jacobian matrix.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": " Number of rows of the jacobian matrix.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": " Current point.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": " Current objective function value.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 106,
      "end_line": 107,
      "comment": " Weighted residuals\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 112,
      "end_line": 113,
      "comment": " Cost value (square root of the sum of the residuals).\n     * @deprecated As of 3.1. Field to become \"private\" in 4.0.\n     * Please use {@link #setCost(double)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrixSqrt"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Square-root of the weight matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 127,
      "end_line": 128,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math3.optimization.SimpleVectorValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @deprecated As of 3.1. Please use {@link #computeWeightedJacobian(double[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 75)",
        "(line 155,col 9)-(line 155,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(double[])",
      "begin_line": 167,
      "end_line": 191,
      "comment": "\n     * Computes the Jacobian matrix.\n     *\n     * @param params Model parameters at which to compute the Jacobian.\n     * @return the weighted Jacobian: W\u003csup\u003e1/2\u003c/sup\u003e J.\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 30)",
        "(line 170,col 9)-(line 170,col 85)",
        "(line 171,col 9)-(line 171,col 37)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 64)",
        "(line 176,col 9)-(line 176,col 42)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 59)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 203,
      "end_line": 214,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @deprecated As of 3.1. Please use {@link #computeResiduals(double[])},\n     * {@link #computeObjectiveValue(double[])}, {@link #computeCost(double[])}\n     * and {@link #setCost(double)} instead.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 209,col 9)-(line 209,col 32)",
        "(line 212,col 9)-(line 212,col 67)",
        "(line 213,col 9)-(line 213,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(double[])",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Computes the cost.\n     *\n     * @param residuals Residuals.\n     * @return the cost.\n     * @see #computeResiduals(double[])\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 65)",
        "(line 226,col 9)-(line 226,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Gets the square-root of the weight matrix.\n     *\n     * @return the square-root of the weight matrix.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setCost(double)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Sets the cost.\n     *\n     * @param cost Cost value.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @see #getCovariances(double)\n     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(double)",
      "begin_line": 305,
      "end_line": 308,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(double[], double)",
      "begin_line": 327,
      "end_line": 339,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param params Model parameters.\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 61)",
        "(line 333,col 9)-(line 333,col 57)",
        "(line 336,col 9)-(line 337,col 62)",
        "(line 338,col 9)-(line 338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 370,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of each parameter. The\n     * returned values are the so-called (asymptotic) standard errors on the\n     * parameters, defined as {@code sd(a[i]) \u003d sqrt(S / (n - m) * C[i][i])},\n     * where {@code a[i]} is the optimized value of the {@code i}-th parameter,\n     * {@code S} is the minimized value of the sum of squares objective function\n     * (as returned by {@link #getChiSquare()}), {@code n} is the number of\n     * observations, {@code m} is the number of parameters and {@code C} is the\n     * covariance matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See also\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Least_squares\"\u003eWikipedia\u003c/a\u003e,\n     * or\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/LeastSquaresFitting.html\"\u003eMathWorld\u003c/a\u003e,\n     * equations (34) and (35) for a particular case.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @deprecated as of version 3.1, {@link #computeSigma(double[],double)} should be used\n     * instead. It should be emphasized that {@code guessParametersErrors} and\n     * {@code computeSigma} are \u003cem\u003enot\u003c/em\u003e strictly equivalent.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 43)",
        "(line 377,col 9)-(line 377,col 71)",
        "(line 378,col 9)-(line 378,col 60)",
        "(line 379,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(double[], double)",
      "begin_line": 400,
      "end_line": 409,
      "comment": "\n     * Computes an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     *\n     * @param params Model parameters.\n     * @param covarianceSingularityThreshold Singularity threshold (see\n     * {@link #computeCovariances(double[],double) computeCovariances}).\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 37)",
        "(line 403,col 9)-(line 403,col 44)",
        "(line 404,col 9)-(line 404,col 90)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction, double[], double[], double[])",
      "begin_line": 417,
      "end_line": 428,
      "comment": " {@inheritDoc}\n     * @deprecated As of 3.1. Please use\n     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 427,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, double[], double[], double[])",
      "begin_line": 454,
      "end_line": 463,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param target Target value for the objective functions at optimum.\n     * @param weights Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 462,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 490,
      "end_line": 497,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the maximal number of evaluations is exceeded.\n     * @throws DimensionMismatchException if the target, and weight arguments\n     * have inconsistent dimensions.\n     * @see BaseAbstractMultivariateVectorOptimizer#optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])\n     * @since 3.1\n     * @deprecated As of 3.1. Override is necessary only until this class\u0027s generic\n     * argument is changed to {@code MultivariateDifferentiableVectorFunction}.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp()",
      "begin_line": 500,
      "end_line": 522,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 22)",
        "(line 505,col 9)-(line 505,col 32)",
        "(line 508,col 9)-(line 508,col 51)",
        "(line 516,col 9)-(line 516,col 137)",
        "(line 519,col 9)-(line 519,col 32)",
        "(line 520,col 9)-(line 520,col 34)",
        "(line 521,col 9)-(line 521,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals(double[])",
      "begin_line": 540,
      "end_line": 553,
      "comment": "\n     * Computes the residuals.\n     * The residual is the difference between the observed (target)\n     * values and the model (objective function) value.\n     * There is one residual for each element of the vector-valued\n     * function.\n     *\n     * @param objectiveValue Value of the the objective function. This is\n     * the value returned from a call to\n     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}\n     * (whose array argument contains the model parameters).\n     * @return the residuals.\n     * @throws DimensionMismatchException if {@code params} has a wrong\n     * length.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 44)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 547,col 61)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 561,
      "end_line": 573,
      "comment": "\n     * Computes the square-root of the weight matrix.\n     *\n     * @param m Symmetric, positive-definite (weight) matrix.\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 572,col 9)"
      ]
    }
  ]
}