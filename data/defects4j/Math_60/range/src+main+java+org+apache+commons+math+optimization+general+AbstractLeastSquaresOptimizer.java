{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 43,
      "end_line": 256,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * jacobian and error estimation.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Weighted residuals "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e, int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 103,
      "end_line": 120,
      "comment": "\n     * Update the jacobian matrix.\n     *\n     * @throws DimensionMismatchException if the Jacobian dimension does not\n     * match problem dimension.\n     * @throws org.apache.commons.math.exception.MathUserException if the jacobian\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 57)",
        "(line 112,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 129,
      "end_line": 147,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @throws DimensionMismatchException if the dimension does not match the\n     * problem dimension.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException\n     * if the maximal number of evaluations is exceeded.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 49)",
        "(line 131,col 9)-(line 133,col 9)",
        "(line 135,col 9)-(line 135,col 53)",
        "(line 136,col 9)-(line 136,col 57)",
        "(line 138,col 9)-(line 138,col 17)",
        "(line 139,col 9)-(line 139,col 22)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 182,
      "end_line": 203,
      "comment": "\n     * Get the covariance matrix of the optimized parameters.\n     *\n     * @return the covariance matrix.\n     * @throws org.apache.commons.math.exception.SingularMatrixException\n     * if the covariance matrix cannot be computed (singular problem).\n     * @throws org.apache.commons.math.exception.MathUserException if the jacobian\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)",
        "(line 187,col 9)-(line 187,col 48)",
        "(line 188,col 9)-(line 197,col 9)",
        "(line 200,col 9)-(line 201,col 96)",
        "(line 202,col 9)-(line 202,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 218,
      "end_line": 230,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * Guessing is covariance-based: It only gives a rough order of magnitude.\n     *\n     * @return errors in optimized parameters\n     * @throws org.apache.commons.math.exception.SingularMatrixException if\n     * the covariances matrix cannot be computed.\n     * @throws NumberIsTooSmallException if the number of degrees of freedom is not\n     * positive, i.e. the number of measurements is less or equal to the number of\n     * parameters.\n     * @throws org.apache.commons.math.exception.MathUserException if the jacobian\n     * function throws one.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 225,col 44)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 233,
      "end_line": 255,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 32)",
        "(line 241,col 9)-(line 241,col 26)",
        "(line 242,col 9)-(line 242,col 51)",
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 246,col 29)",
        "(line 247,col 9)-(line 247,col 28)",
        "(line 249,col 9)-(line 249,col 58)",
        "(line 250,col 9)-(line 250,col 50)",
        "(line 252,col 9)-(line 252,col 40)",
        "(line 254,col 9)-(line 254,col 62)"
      ]
    }
  ]
}