{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/fitting/leastsquares/AbstractLeastSquaresOptimizer.java",
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
      "end_line": 327,
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
      "end_line": 78,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other Instance to copy.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 68)",
        "(line 73,col 9)-(line 73,col 65)",
        "(line 74,col 9)-(line 74,col 67)",
        "(line 75,col 9)-(line 75,col 79)",
        "(line 76,col 9)-(line 76,col 28)",
        "(line 77,col 9)-(line 77,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withTarget(double[])",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withWeight(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 87,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 29)",
        "(line 89,col 9)-(line 89,col 40)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withModelAndJacobian(org.apache.commons.math3.analysis.MultivariateVectorFunction, org.apache.commons.math3.analysis.MultivariateMatrixFunction)",
      "begin_line": 94,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 27)",
        "(line 97,col 9)-(line 97,col 33)",
        "(line 98,col 9)-(line 98,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.withStartPoint(double[])",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 35)",
        "(line 104,col 9)-(line 104,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getTarget()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Gets the target values.\n     *\n     * @return the target values.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getStart()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Gets the initial guess.\n     *\n     * @return the initial guess values.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getWeightSquareRoot()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Gets the square-root of the weight matrix.\n     *\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getModel()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Gets the model function.\n     *\n     * @return the model function.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getJacobian()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Gets the model function\u0027s Jacobian.\n     *\n     * @return the Jacobian.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeCovariances(double[], double)",
      "begin_line": 168,
      "end_line": 180,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     * \u003cbr/\u003e\n     * Note that this operation involves the inversion of the\n     * \u003ccode\u003eJ\u003csup\u003eT\u003c/sup\u003eJ\u003c/code\u003e matrix, where {@code J} is the\n     * Jacobian matrix.\n     * The {@code threshold} parameter is a way for the caller to specify\n     * that the result of this computation should be considered meaningless,\n     * and thus trigger an exception.\n     *\n     * @param params Model parameters.\n     * @param threshold Singularity threshold.\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 61)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 177,col 9)-(line 178,col 62)",
        "(line 179,col 9)-(line 179,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeSigma(double[], double)",
      "begin_line": 196,
      "end_line": 205,
      "comment": "\n     * Computes an estimate of the standard deviation of the parameters. The\n     * returned values are the square root of the diagonal coefficients of the\n     * covariance matrix, {@code sd(a[i]) ~\u003d sqrt(C[i][i])}, where {@code a[i]}\n     * is the optimized value of the {@code i}-th parameter, and {@code C} is\n     * the covariance matrix.\n     *\n     * @param params Model parameters.\n     * @param covarianceSingularityThreshold Singularity threshold (see\n     * {@link #computeCovariances(double[],double) computeCovariances}).\n     * @return an estimate of the standard deviation of the optimized parameters\n     * @throws org.apache.commons.math3.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 37)",
        "(line 199,col 9)-(line 199,col 44)",
        "(line 200,col 9)-(line 200,col 90)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.getWeight()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Gets the weight matrix of the observations.\n     *\n     * @return the weight matrix.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeRMS(double[])",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * Computes the normalized cost.\n     * It is the square-root of the sum of squared of the residuals, divided\n     * by the number of measurements.\n     *\n     * @param params Model function parameters.\n     * @return the cost.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 84)",
        "(line 226,col 9)-(line 226,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeObjectiveValue(double[])",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Computes the objective function value.\n     * This method \u003cem\u003emust\u003c/em\u003e be called by subclasses to enforce the\n     * evaluation counter limit.\n     *\n     * @param params Point at which the objective function must be evaluated.\n     * @return the objective function value at the specified point.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations (of the model vector function) is\n     * exceeded.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 41)",
        "(line 242,col 9)-(line 242,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeWeightedJacobian(double[])",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Computes the weighted Jacobian matrix.\n     *\n     * @param params Model parameters at which to compute the Jacobian.\n     * @return the weighted Jacobian: W\u003csup\u003e1/2\u003c/sup\u003e J.\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeJacobian(double[])",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Computes the Jacobian matrix.\n     *\n     * @param params Point at which the Jacobian must be evaluated.\n     * @return the Jacobian at the specified point.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeCost(double[])",
      "begin_line": 274,
      "end_line": 277,
      "comment": "\n     * Computes the cost.\n     *\n     * @param residuals Residuals.\n     * @return the cost.\n     * @see #computeResiduals(double[])\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 65)",
        "(line 276,col 9)-(line 276,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.computeResiduals(double[])",
      "begin_line": 294,
      "end_line": 306,
      "comment": "\n     * Computes the residuals.\n     * The residual is the difference between the observed (target)\n     * values and the model (objective function) value.\n     * There is one residual for each element of the vector-valued\n     * function.\n     *\n     * @param objectiveValue Value of the the objective function. This is\n     * the value returned from a call to\n     * {@link #computeObjectiveValue(double[]) computeObjectiveValue}\n     * (whose array argument contains the model parameters).\n     * @return the residuals.\n     * @throws DimensionMismatchException if {@code params} has a wrong\n     * length.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 61)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer.squareRoot(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 314,
      "end_line": 326,
      "comment": "\n     * Computes the square-root of the weight matrix.\n     *\n     * @param m Symmetric, positive-definite (weight) matrix.\n     * @return the square-root of the weight matrix.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 325,col 9)"
      ]
    }
  ]
}