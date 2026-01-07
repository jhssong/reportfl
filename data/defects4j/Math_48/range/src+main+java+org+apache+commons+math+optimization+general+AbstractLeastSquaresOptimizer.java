{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 51,
      "end_line": 261,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * jacobian and error estimation.\n * \u003cbr/\u003e\n * This class uses the {@link DifferentiableMultivariateVectorialFunction#jacobian()}\n * of the function argument in method\n * {@link #optimize(int,DifferentiableMultivariateVectorialFunction,double[],double[],double[])\n * optimize} and assumes that, in the matrix returned by the\n * {@link MultivariateMatrixFunction#value(double[]) value} method, the rows\n * iterate on the model functions while the columns iterate on the parameters; thus,\n * the numbers of rows is equal to the length of the {@code target} array while the\n * number of columns is equal to the length of the {@code startPoint} array.\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Current residuals. "
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
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 109,
      "end_line": 126,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @throws org.apache.commons.math.exception.MathUserException if the jacobian\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)",
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 118,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 135,
      "end_line": 151,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 49)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 141,col 53)",
        "(line 142,col 9)-(line 142,col 57)",
        "(line 144,col 9)-(line 144,col 17)",
        "(line 145,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 186,
      "end_line": 207,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math.linear.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @throws org.apache.commons.math.exception.MathUserException if the\n     * jacobian function throws one.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 25)",
        "(line 191,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 201,col 9)",
        "(line 204,col 9)-(line 205,col 96)",
        "(line 206,col 9)-(line 206,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 222,
      "end_line": 234,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * Guessing is covariance-based: It only gives a rough order of magnitude.\n     *\n     * @return errors in optimized parameters\n     * @throws org.apache.commons.math.linear.SingularMatrixException\n     * if the covariances matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @throws org.apache.commons.math.exception.MathUserException if the jacobian\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 43)",
        "(line 228,col 9)-(line 228,col 71)",
        "(line 229,col 9)-(line 229,col 44)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(int, org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 237,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 32)",
        "(line 246,col 9)-(line 246,col 26)",
        "(line 247,col 9)-(line 247,col 51)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 251,col 9)-(line 251,col 29)",
        "(line 252,col 9)-(line 252,col 28)",
        "(line 254,col 9)-(line 254,col 58)",
        "(line 255,col 9)-(line 255,col 50)",
        "(line 257,col 9)-(line 257,col 40)",
        "(line 259,col 9)-(line 259,col 71)"
      ]
    }
  ]
}