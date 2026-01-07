{
  "filepath": "/tmp/Math-14b/src/main/java/org/apache/commons/math3/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer"
      ],
      "begin_line": 61,
      "end_line": 564,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * Jacobian and error estimation.\n * \u003cbr/\u003e\n * This class constructs the Jacobian matrix of the function argument in method\n * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n * optimize} and assumes that the rows of that matrix iterate on the model\n * functions while the columns iterate on the parameters; thus, the numbers\n * of rows is equal to the dimension of the\n * {@link org.apache.commons.math3.optimization.Target Target} while\n * the number of columns is equal to the dimension of the\n * {@link org.apache.commons.math3.optimization.InitialGuess InitialGuess}.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SINGULARITY_THRESHOLD"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": "\n     * Singularity threshold (cf. {@link #getCovariances(double)}).\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 80,
      "end_line": 81,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     * @deprecated As of 3.1. To be removed in 4.0. Please use\n     * {@link #computeWeightedJacobian(double[])} instead.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 85,
      "end_line": 86,
      "comment": " Number of columns of the jacobian matrix.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 90,
      "end_line": 91,
      "comment": " Number of rows of the jacobian matrix.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 95,
      "end_line": 96,
      "comment": " Current point.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 100,
      "end_line": 101,
      "comment": " Current objective function value.\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 105,
      "end_line": 106,
      "comment": " Weighted residuals\n     * @deprecated As of 3.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 111,
      "end_line": 112,
      "comment": " Cost value (square root of the sum of the residuals).\n     * @deprecated As of 3.1. Field to become \"private\" in 4.0.\n     * Please use {@link #setCost(double)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrixSqrt"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Square-root of the weight matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 126,
      "end_line": 127,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math3.optimization.SimpleVectorValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 151,
      "end_line": 155,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @deprecated As of 3.1. Please use {@link #computeWeightedJacobian(double[])}\n     * instead.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(double[])",
      "begin_line": 166,
      "end_line": 190,
      "comment": "\n     * Computes the Jacobian matrix.\n     *\n     * @param params Model parameters at which to compute the Jacobian.\n     * @return the weighted Jacobian: W\u003csup\u003e1/2\u003c/sup\u003e J.\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 30)",
        "(line 169,col 9)-(line 169,col 85)",
        "(line 170,col 9)-(line 170,col 37)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 64)",
        "(line 175,col 9)-(line 175,col 42)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 59)",
        "(line 180,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 202,
      "end_line": 213,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @deprecated As of 3.1. Please use {@link #computeResiduals(double[])},\n     * {@link #computeObjectiveValue(double[])}, {@link #computeCost(double[])}\n     * and {@link #setCost(double)} instead.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 49)",
        "(line 205,col 9)-(line 205,col 57)",
        "(line 208,col 9)-(line 208,col 32)",
        "(line 211,col 9)-(line 211,col 67)",
        "(line 212,col 9)-(line 212,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(double[])",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Computes the cost.\n     *\n     * @param residuals Residuals.\n     * @return the cost.\n     * @see #computeResiduals(double[])\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 65)",
        "(line 225,col 9)-(line 225,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Gets the square-root of the weight matrix.\n     *\n     * @return the square-root of the weight matrix.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setCost(double)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Sets the cost.\n     *\n     * @param cost Cost value.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @see #getCovariances(double)\n     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(double)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @deprecated As of 3.1. Please use {@link #computeCovariances(double[],double)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(double[], double)",
      "begin_line": 326,
      "end_line": 338,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param params Model parameters.\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 61)",
        "(line 332,col 9)-(line 332,col 57)",
        "(line 335,col 9)-(line 336,col 62)",
        "(line 337,col 9)-(line 337,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 369,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of each parameter. The\n     * returned values are the so-called (asymptotic) standard errors on the\n     * parameters, defined as {@code sd(a[i]) \u003d sqrt(S / (n - m) * C[i][i])},\n     * where {@code a[i]} is the optimized value of the {@code i}-th parameter,\n     * {@code S} is the minimized value of the sum of squares objective function\n     * (as returned by {@link #getChiSquare()}), {@code n} is the number of\n     * observations, {@code m} is the number of parameters and {@code C} is the\n     * covariance matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See also\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Least_squares\"\u003eWikipedia\u003c/a\u003e,\n     * or\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/LeastSquaresFitting.html\"\u003eMathWorld\u003c/a\u003e,\n     * equations (34) and (35) for a particular case.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @deprecated as of version 3.1, {@link #computeSigma(double[],double)} should be used\n     * instead. It should be emphasized that {@code guessParametersErrors} and\n     * {@code computeSigma} are \u003cem\u003enot\u003c/em\u003e strictly equivalent.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 43)",
        "(line 376,col 9)-(line 376,col 71)",
        "(line 377,col 9)-(line 377,col 60)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(double[], double)",
      "begin_line": 399,
      "end_line": 408,
      "comment": "\n     * Computes an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     *\n     * @param params Model parameters.\n     * @param covarianceSingularityThreshold Singularity threshold (see\n     * {@link #computeCovariances(double[],double) computeCovariances}).\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 37)",
        "(line 402,col 9)-(line 402,col 44)",
        "(line 403,col 9)-(line 403,col 90)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 407,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction, double[], double[], double[])",
      "begin_line": 416,
      "end_line": 427,
      "comment": " {@inheritDoc}\n     * @deprecated As of 3.1. Please use\n     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 426,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, double[], double[], double[])",
      "begin_line": 453,
      "end_line": 462,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param target Target value for the objective functions at optimum.\n     * @param weights Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @deprecated As of 3.1. Please use\n     * {@link BaseAbstractMultivariateVectorOptimizer#optimize(int,MultivariateVectorFunction,OptimizationData[])\n     * optimize(int,MultivariateDifferentiableVectorFunction,OptimizationData...)}\n     * instead.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 461,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, org.apache.commons.math3.optimization.OptimizationData...)",
      "begin_line": 489,
      "end_line": 496,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param maxEval Allowed number of evaluations of the objective function.\n     * @param f Objective function.\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Target}\u003c/li\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     *  \u003cli\u003e{@link InitialGuess}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return the point/value pair giving the optimal value of the objective\n     * function.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the maximal number of evaluations is exceeded.\n     * @throws DimensionMismatchException if the target, and weight arguments\n     * have inconsistent dimensions.\n     * @see BaseAbstractMultivariateVectorOptimizer#optimizeInternal(int,MultivariateVectorFunction,OptimizationData[])\n     * @since 3.1\n     * @deprecated As of 3.1. Override is necessary only until this class\u0027s generic\n     * argument is changed to {@code MultivariateDifferentiableVectorFunction}.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp()",
      "begin_line": 499,
      "end_line": 521,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 22)",
        "(line 504,col 9)-(line 504,col 32)",
        "(line 507,col 9)-(line 507,col 51)",
        "(line 515,col 9)-(line 515,col 137)",
        "(line 518,col 9)-(line 518,col 32)",
        "(line 519,col 9)-(line 519,col 34)",
        "(line 520,col 9)-(line 520,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals(double[])",
      "begin_line": 539,
      "end_line": 552,
      "comment": "\n     * Computes the residuals.\n     * The residual is the difference between the observed (target)\n     * values and the model (objective function) value.\n     * There is one residual for each element of the vector-valued\n     * function.\n     *\n     * @param objectiveValue Value of the the objective function. This is\n     * the value returned from a call to\n     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}\n     * (whose array argument contains the model parameters).\n     * @return the residuals.\n     * @throws DimensionMismatchException if {@code params} has a wrong\n     * length.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 44)",
        "(line 541,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 546,col 61)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 551,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 560,
      "end_line": 563,
      "comment": "\n     * Computes the square-root of the weight matrix.\n     *\n     * @param m Symmetric, positive-definite (weight) matrix.\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 65)",
        "(line 562,col 9)-(line 562,col 35)"
      ]
    }
  ]
}