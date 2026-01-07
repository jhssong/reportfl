{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer\u003corg.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction\u003e",
        "org.apache.commons.math3.optimization.DifferentiableMultivariateVectorOptimizer"
      ],
      "begin_line": 51,
      "end_line": 319,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * jacobian and error estimation.\n * \u003cbr/\u003e\n * This class uses the {@link DifferentiableMultivariateVectorFunction#jacobian()}\n * of the function argument in method\n * {@link #optimize(int,DifferentiableMultivariateVectorFunction,double[],double[],double[])\n * optimize} and assumes that, in the matrix returned by the\n * {@link MultivariateMatrixFunction#value(double[]) value} method, the rows\n * iterate on the model functions while the columns iterate on the parameters; thus,\n * the numbers of rows is equal to the length of the {@code target} array while the\n * number of columns is equal to the length of the {@code startPoint} array.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SINGULARITY_THRESHOLD"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Singularity threshold (cf. {@link #getCovariances(double)}). "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Weighted residuals "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 87,
      "end_line": 88,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math3.optimization.SimpleVectorValueChecker}.\n     * @deprecated See {@link org.apache.commons.math3.optimization.SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointVectorValuePair\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 110,
      "end_line": 127,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 112,col 51)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 119,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 136,
      "end_line": 152,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 142,col 53)",
        "(line 143,col 9)-(line 143,col 57)",
        "(line 145,col 9)-(line 145,col 17)",
        "(line 146,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     *\n     * @see #getCovariances(double)\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(double)",
      "begin_line": 206,
      "end_line": 227,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 25)",
        "(line 211,col 9)-(line 211,col 48)",
        "(line 212,col 9)-(line 221,col 9)",
        "(line 224,col 9)-(line 225,col 92)",
        "(line 226,col 9)-(line 226,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 258,
      "end_line": 271,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of each parameter. The\n     * returned values are the so-called (asymptotic) standard errors on the\n     * parameters, defined as {@code sd(a[i]) \u003d sqrt(S / (n - m) * C[i][i])},\n     * where {@code a[i]} is the optimized value of the {@code i}-th parameter,\n     * {@code S} is the minimized value of the sum of squares objective function\n     * (as returned by {@link #getChiSquare()}), {@code n} is the number of\n     * observations, {@code m} is the number of parameters and {@code C} is the\n     * covariance matrix.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * See also\n     * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Least_squares\"\u003eWikipedia\u003c/a\u003e,\n     * or\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/LeastSquaresFitting.html\"\u003eMathWorld\u003c/a\u003e,\n     * equations (34) and (35) for a particular case.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @deprecated as of version 3.1, {@link #getSigma()} should be used\n     * instead. It should be emphasized that {@link #guessParametersErrors()} and\n     * {@link #getSigma()} are \u003cem\u003enot\u003c/em\u003e strictly equivalent.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 71)",
        "(line 266,col 9)-(line 266,col 44)",
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getSigma()",
      "begin_line": 286,
      "end_line": 293,
      "comment": "\n     * \u003cp\u003e\n     * Returns an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     * \u003c/p\u003e\n     *\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 288,col 48)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction, double[], double[], double[])",
      "begin_line": 296,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 32)",
        "(line 305,col 9)-(line 305,col 26)",
        "(line 308,col 9)-(line 308,col 35)",
        "(line 309,col 9)-(line 309,col 29)",
        "(line 310,col 9)-(line 310,col 28)",
        "(line 312,col 9)-(line 312,col 58)",
        "(line 313,col 9)-(line 313,col 50)",
        "(line 315,col 9)-(line 315,col 40)",
        "(line 317,col 9)-(line 317,col 71)"
      ]
    }
  ]
}