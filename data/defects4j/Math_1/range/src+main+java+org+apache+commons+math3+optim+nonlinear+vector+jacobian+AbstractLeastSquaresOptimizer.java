{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer"
      ],
      "begin_line": 46,
      "end_line": 282,
      "comment": "\n * Base class for implementing least-squares optimizers.\n * It provides methods for error estimation.\n *\n * @version $Id$\n * @since 3.1\n * @deprecated All classes and interfaces in this package are deprecated.\n * The optimizers that were provided here were moved to the\n * {@link org.apache.commons.math3.fitting.leastsquares} package\n * (cf. MATH-1008).\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightMatrixSqrt"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Square-root of the weight matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(double[])",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Computes the weighted Jacobian matrix.\n     *\n     * @param params Model parameters at which to compute the Jacobian.\n     * @return the weighted Jacobian: W\u003csup\u003e1/2\u003c/sup\u003e J.\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(double[])",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Computes the cost.\n     *\n     * @param residuals Residuals.\n     * @return the cost.\n     * @see #computeResiduals(double[])\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 65)",
        "(line 82,col 9)-(line 82,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Gets the root-mean-square (RMS) value.\n     *\n     * The RMS the root of the arithmetic mean of the square of all weighted\n     * residuals.\n     * This is related to the criterion that is minimized by the optimizer\n     * as follows: If \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the\n     * number of measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return the RMS value.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot()",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Gets the square-root of the weight matrix.\n     *\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.setCost(double)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Sets the cost.\n     *\n     * @param cost Cost value.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(double[], double)",
      "begin_line": 144,
      "end_line": 156,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param params Model parameters.\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 61)",
        "(line 150,col 9)-(line 150,col 57)",
        "(line 153,col 9)-(line 154,col 62)",
        "(line 155,col 9)-(line 155,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(double[], double)",
      "begin_line": 172,
      "end_line": 181,
      "comment": "\n     * Computes an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     *\n     * @param params Model parameters.\n     * @param covarianceSingularityThreshold Singularity threshold (see\n     * {@link #computeCovariances(double[],double) computeCovariances}).\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 44)",
        "(line 176,col 9)-(line 176,col 90)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 198,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @param optData Optimization data. In addition to those documented in\n     * {@link JacobianMultivariateVectorOptimizer#parseOptimizationData(OptimizationData[])\n     * JacobianMultivariateVectorOptimizer}, this method will register the following data:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link org.apache.commons.math3.optim.nonlinear.vector.Weight}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * @return {@inheritDoc}\n     * @throws TooManyEvaluationsException if the maximal number of\n     * evaluations is exceeded.\n     * @throws DimensionMismatchException if the initial guess, target, and weight\n     * arguments have inconsistent dimensions.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals(double[])",
      "begin_line": 220,
      "end_line": 233,
      "comment": "\n     * Computes the residuals.\n     * The residual is the difference between the observed (target)\n     * values and the model (objective function) value.\n     * There is one residual for each element of the vector-valued\n     * function.\n     *\n     * @param objectiveValue Value of the the objective function. This is\n     * the value returned from a call to\n     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}\n     * (whose array argument contains the model parameters).\n     * @return the residuals.\n     * @throws DimensionMismatchException if {@code params} has a wrong\n     * length.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 44)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 227,col 61)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 232,col 9)-(line 232,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(org.apache.commons.math3.optim.OptimizationData...)",
      "begin_line": 246,
      "end_line": 261,
      "comment": "\n     * Scans the list of (required and optional) optimization data that\n     * characterize the problem.\n     * If the weight matrix is specified, the {@link #weightMatrixSqrt}\n     * field is recomputed.\n     *\n     * @param optData Optimization data. The following data will be looked for:\n     * \u003cul\u003e\n     *  \u003cli\u003e{@link Weight}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 45)",
        "(line 253,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 269,
      "end_line": 281,
      "comment": "\n     * Computes the square-root of the weight matrix.\n     *\n     * @param m Symmetric, positive-definite (weight) matrix.\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 280,col 9)"
      ]
    }
  ]
}