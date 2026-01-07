{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/leastsquares/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.AbstractOptimizer\u003corg.apache.commons.math3.optim.PointVectorValuePair, OPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithTarget\u003cOPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithWeight\u003cOPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithModelAndJacobian\u003cOPTIM\u003e",
        "org.apache.commons.math3.fitting.leastsquares.WithStartPoint\u003cOPTIM\u003e"
      ],
      "begin_line": 42,
      "end_line": 329,
      "comment": "\n * Base class for implementing least-squares optimizers.\n * It provides methods for error estimation.\n *\n * @param \u003cOPTIM\u003e Concrete optimizer.\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Target values for the model function at optimum. "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Weight matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "model"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Model function. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Jacobian of the model function. "
    },
    {
      "type": "field",
      "varNames": [
        "weightSqrt"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Square-root of the weight matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Initial guess. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer)",
      "begin_line": 71,
      "end_line": 80,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)",
        "(line 74,col 9)-(line 74,col 68)",
        "(line 75,col 9)-(line 75,col 65)",
        "(line 76,col 9)-(line 76,col 67)",
        "(line 77,col 9)-(line 77,col 79)",
        "(line 78,col 9)-(line 78,col 28)",
        "(line 79,col 9)-(line 79,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withTarget(double[])",
      "begin_line": 83,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 40)",
        "(line 85,col 9)-(line 85,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withWeight(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 89,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 32)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withModelAndJacobian(org.apache.commons.math3.analysis.MultivariateVectorFunction, org.apache.commons.math3.analysis.MultivariateMatrixFunction)",
      "begin_line": 96,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 30)",
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withStartPoint(double[])",
      "begin_line": 104,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 38)",
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getTarget()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Gets the target values.\n     *\n     * @return the target values.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getStart()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess values.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getWeightSquareRoot()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Gets the square-root of the weight matrix.\n     *\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getModel()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Gets the model function.\n     *\n     * @return the model function.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getJacobian()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Gets the model function\u0027s Jacobian.\n     *\n     * @return the Jacobian.\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeCovariances(double[], double)",
      "begin_line": 170,
      "end_line": 182,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param params Model parameters.\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 61)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 179,col 9)-(line 180,col 62)",
        "(line 181,col 9)-(line 181,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeSigma(double[], double)",
      "begin_line": 198,
      "end_line": 207,
      "comment": "\n     * Computes an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     *\n     * @param params Model parameters.\n     * @param covarianceSingularityThreshold Singularity threshold (see\n     * {@link #computeCovariances(double[],double) computeCovariances}).\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)",
        "(line 201,col 9)-(line 201,col 44)",
        "(line 202,col 9)-(line 202,col 90)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getWeight()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Gets the weight matrix of the observations.\n     *\n     * @return the weight matrix.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeRMS(double[])",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Computes the normalized cost.\n     * It is the square-root of the sum of squared of the residuals, divided\n     * by the number of measurements.\n     *\n     * @param params Model function parameters.\n     * @return the cost.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 84)",
        "(line 228,col 9)-(line 228,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeObjectiveValue(double[])",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param params Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations (of the model vector function) is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 41)",
        "(line 244,col 9)-(line 244,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeWeightedJacobian(double[])",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Computes the weighted Jacobian matrix.\n     *\n     * @param params Model parameters at which to compute the Jacobian.\n     * @return the weighted Jacobian: W\u003csup\u003e1/2\u003c/sup\u003e J.\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeJacobian(double[])",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Computes the Jacobian matrix.\n     *\n     * @param params Point at which the Jacobian must be evaluated.\n     * @return the Jacobian at the specified point.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeCost(double[])",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Computes the cost.\n     *\n     * @param residuals Residuals.\n     * @return the cost.\n     * @see #computeResiduals(double[])\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 65)",
        "(line 278,col 9)-(line 278,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeResiduals(double[])",
      "begin_line": 296,
      "end_line": 308,
      "comment": "\n     * Computes the residuals.\n     * The residual is the difference between the observed (target)\n     * values and the model (objective function) value.\n     * There is one residual for each element of the vector-valued\n     * function.\n     *\n     * @param objectiveValue Value of the the objective function. This is\n     * the value returned from a call to\n     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}\n     * (whose array argument contains the model parameters).\n     * @return the residuals.\n     * @throws DimensionMismatchException if {@code params} has a wrong\n     * length.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 61)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.squareRoot(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 316,
      "end_line": 328,
      "comment": "\n     * Computes the square-root of the weight matrix.\n     *\n     * @param m Symmetric, positive-definite (weight) matrix.\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 327,col 9)"
      ]
    }
  ]
}