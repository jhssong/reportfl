{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/optimization/general/AbstractLeastSquaresOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractLeastSquaresOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer\u003corg.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction\u003e",
        "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer"
      ],
      "begin_line": 44,
      "end_line": 258,
      "comment": "\n * Base class for implementing least squares optimizers.\n * It handles the boilerplate methods associated to thresholds settings,\n * jacobian and error estimation.\n *\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidualJacobian"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Jacobian matrix of the weighted residuals.\n     * This matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtOptimizer\n     * Levenberg-Marquardt optimizer} does this).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "point"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Current point. "
    },
    {
      "type": "field",
      "varNames": [
        "objective"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Current objective function value. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Current residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResiduals"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Weighted residuals "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "jF"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Objective function derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Number of evaluations of the Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link\n     * org.apache.commons.math.optimization.SimpleVectorialValueChecker}.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.AbstractLeastSquaresOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e, int)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximal number of function evaluations.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * @return the number of evaluations of the Jacobian function.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian()",
      "begin_line": 101,
      "end_line": 119,
      "comment": "\n     * Update the jacobian matrix.\n     * @exception FunctionEvaluationException if the function jacobian\n     * cannot be evaluated or its dimension doesn\u0027t match problem dimension\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 30)",
        "(line 103,col 9)-(line 103,col 51)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 57)",
        "(line 111,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost()",
      "begin_line": 127,
      "end_line": 146,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception FunctionEvaluationException if the function cannot be evaluated\n     * or its dimension doesn\u0027t match problem dimension or maximal number of\n     * of evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 53)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 137,col 9)-(line 137,col 17)",
        "(line 138,col 9)-(line 138,col 22)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the optimizer as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Get a Chi-Square-like value assuming the N residuals follow N\n     * distinct normal distributions centered on 0 and whose variances are\n     * the reciprocal of the weights.\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances()",
      "begin_line": 180,
      "end_line": 208,
      "comment": "\n     * Get the covariance matrix of optimized parameters.\n     * @return covariance matrix\n     * @exception FunctionEvaluationException if the function jacobian cannot\n     * be evaluated\n     * @exception ConvergenceException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 25)",
        "(line 187,col 9)-(line 187,col 48)",
        "(line 188,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors()",
      "begin_line": 219,
      "end_line": 232,
      "comment": "\n     * Guess the errors in optimized parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @return errors in optimized parameters\n     * @exception FunctionEvaluationException if the function jacobian cannot b evaluated\n     * @exception ConvergenceException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 43)",
        "(line 226,col 9)-(line 226,col 71)",
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 235,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 32)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 51)",
        "(line 247,col 9)-(line 247,col 35)",
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 28)",
        "(line 251,col 9)-(line 251,col 58)",
        "(line 252,col 9)-(line 252,col 50)",
        "(line 254,col 9)-(line 254,col 40)",
        "(line 256,col 9)-(line 256,col 62)"
      ]
    }
  ]
}