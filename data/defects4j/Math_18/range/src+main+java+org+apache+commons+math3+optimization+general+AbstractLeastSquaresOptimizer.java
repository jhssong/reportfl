{
  "filepath": "/tmp/Math-18b/src/main/java/org/apache/commons/math3/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer"
      ],
      "begin_line": 52,
      "end_line": 369,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * jacobian and error estimation.\n * \u003cbr/\u003e\n * This class uses the {@link JacobianFunction Jacobian} of the function argument in method\n * {@link #optimize(int, MultivariateDifferentiableVectorFunction, double[], double[], double[])\n * optimize} and assumes that, in the matrix returned by the\n * {@link JacobianFunction#value(double[]) value} method, the rows\n * iterate on the model functions while the columns iterate on the parameters; thus,\n * the numbers of rows is equal to the length of the {@code target} array while the\n * number of columns is equal to the length of the {@code startPoint} array.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SINGULARITY_THRESHOLD"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Singularity threshold (cf. {@link #getCovariances(double)}). "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Weighted residuals "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 88,
      "end_line": 89,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math3.optimization.SimpleVectorValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 111,
      "end_line": 128,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 30)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 57)",
        "(line 120,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 137,
      "end_line": 153,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 53)",
        "(line 144,col 9)-(line 144,col 57)",
        "(line 146,col 9)-(line 146,col 17)",
        "(line 147,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     *\n     * @see #getCovariances(double)\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(double)",
      "begin_line": 207,
      "end_line": 228,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 25)",
        "(line 212,col 9)-(line 212,col 48)",
        "(line 213,col 9)-(line 222,col 9)",
        "(line 225,col 9)-(line 226,col 92)",
        "(line 227,col 9)-(line 227,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 259,
      "end_line": 272,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of each parameter. The\n     * returned values are the so-called (asymptotic) standard errors on the\n     * parameters, defined as {@code sd(a[i]) \u003d sqrt(S / (n - m) * C[i][i])},\n     * where {@code a[i]} is the optimized value of the {@code i}-th parameter,\n     * {@code S} is the minimized value of the sum of squares objective function\n     * (as returned by {@link #getChiSquare()}), {@code n} is the number of\n     * observations, {@code m} is the number of parameters and {@code C} is the\n     * covariance matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See also\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Least_squares\"\u003eWikipedia\u003c/a\u003e,\n     * or\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/LeastSquaresFitting.html\"\u003eMathWorld\u003c/a\u003e,\n     * equations (34) and (35) for a particular case.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @deprecated as of version 3.1, {@link #getSigma()} should be used\n     * instead. It should be emphasized that {@link #guessParametersErrors()} and\n     * {@link #getSigma()} are \u003cem\u003enot\u003c/em\u003e strictly equivalent.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 43)",
        "(line 266,col 9)-(line 266,col 71)",
        "(line 267,col 9)-(line 267,col 44)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getSigma()",
      "begin_line": 287,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction, double[], double[], double[])",
      "begin_line": 300,
      "end_line": 323,
      "comment": " {@inheritDoc}\n     * @deprecated as of 3.1 replaced by {@link #optimize(int,\n     * MultivariateDifferentiableVectorFunction, double[], double[], double[])}\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 32)",
        "(line 310,col 9)-(line 310,col 26)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 28)",
        "(line 317,col 9)-(line 317,col 58)",
        "(line 318,col 9)-(line 318,col 50)",
        "(line 320,col 9)-(line 320,col 40)",
        "(line 322,col 9)-(line 322,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, double[], double[], double[])",
      "begin_line": 345,
      "end_line": 367,
      "comment": "\n     * Optimize an objective function.\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u003ccode\u003e\u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e - target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e\n     *\n     * @param f Objective function.\n     * @param target Target value for the objective functions at optimum.\n     * @param weight Weights for the least squares cost computation.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective\n     * function.\n     * @param maxEval Maximum number of function evaluations.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the start point dimension is wrong.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 32)",
        "(line 354,col 9)-(line 354,col 37)",
        "(line 357,col 9)-(line 357,col 35)",
        "(line 358,col 9)-(line 358,col 29)",
        "(line 359,col 9)-(line 359,col 28)",
        "(line 361,col 9)-(line 361,col 58)",
        "(line 362,col 9)-(line 362,col 50)",
        "(line 364,col 9)-(line 364,col 40)",
        "(line 366,col 9)-(line 366,col 73)"
      ]
    }
  ]
}