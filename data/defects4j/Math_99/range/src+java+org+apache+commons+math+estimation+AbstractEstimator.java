{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/estimation/AbstractEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 35,
      "end_line": 311,
      "comment": "\n * Base class for implementing estimators.\n * \u003cp\u003eThis base class handles the boilerplates methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_COST_EVALUATIONS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Default maximal number of cost evaluations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.AbstractEstimator()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Build an abstract estimator for least squares problems.\n     * \u003cp\u003eThe maximal number of cost evaluations allowed is set\n     * to its default value {@link #DEFAULT_MAX_COST_EVALUATIONS}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval(int)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Set the maximal number of cost evaluations allowed.\n     * \n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @see #estimate\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Get the number of cost evaluations.\n     * \n     * @return number of cost evaluations\n     * ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " \n     * Get the number of jacobian evaluations.\n     * \n     * @return number of jacobian evaluations\n     * ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateJacobian()",
      "begin_line": 80,
      "end_line": 90,
      "comment": " \n     * Update the jacobian matrix.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 46)",
        "(line 82,col 9)-(line 82,col 33)",
        "(line 83,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter()",
      "begin_line": 95,
      "end_line": 97,
      "comment": "\n     * Increment the jacobian evaluations counter.\n     ",
      "child_ranges": [
        "(line 96,col 7)-(line 96,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost()",
      "begin_line": 104,
      "end_line": 121,
      "comment": " \n     * Update the residuals array and cost function value.\n     * @exception EstimationException if the number of cost evaluations\n     * exceeds the maximum allowed\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 17)",
        "(line 113,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 134,
      "end_line": 142,
      "comment": " \n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the estimator as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     * \n     * @param problem estimation problem\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 61)",
        "(line 136,col 9)-(line 136,col 29)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Get the Chi-Square value.\n     * @param problem estimation problem\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 61)",
        "(line 151,col 9)-(line 151,col 29)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 166,
      "end_line": 198,
      "comment": "\n     * Get the covariance matrix of unbound estimated parameters.\n     * @param problem estimation problem\n     * @return covariance matrix\n     * @exception EstimationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 25)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 63)",
        "(line 175,col 9)-(line 175,col 37)",
        "(line 176,col 9)-(line 176,col 48)",
        "(line 177,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 196,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 209,
      "end_line": 224,
      "comment": "\n     * Guess the errors in unbound estimated parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @param problem estimation problem\n     * @return errors in estimated parameters\n     * @exception EstimationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 49)",
        "(line 212,col 9)-(line 212,col 54)",
        "(line 213,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 76)",
        "(line 218,col 9)-(line 218,col 68)",
        "(line 219,col 9)-(line 219,col 51)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 233,
      "end_line": 251,
      "comment": "\n     * Initialization of the common parts of the estimation.\n     * \u003cp\u003eThis method \u003cem\u003emust\u003c/em\u003e be called at the start\n     * of the {@link #estimate(EstimationProblem) estimate}\n     * method.\u003c/p\u003e\n     * @param problem estimation problem to solve\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 32)",
        "(line 237,col 9)-(line 237,col 32)",
        "(line 240,col 9)-(line 240,col 49)",
        "(line 241,col 9)-(line 241,col 54)",
        "(line 244,col 9)-(line 244,col 40)",
        "(line 245,col 9)-(line 245,col 38)",
        "(line 246,col 9)-(line 246,col 44)",
        "(line 247,col 9)-(line 247,col 37)",
        "(line 249,col 9)-(line 249,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 267,
      "end_line": 268,
      "comment": " \n     * Solve an estimation problem.\n     *\n     * \u003cp\u003eThe method should set the parameters of the problem to several\n     * trial values until it reaches convergence. If this method returns\n     * normally (i.e. without throwing an exception), then the best\n     * estimate of the parameters can be retrieved from the problem\n     * itself, through the {@link EstimationProblem#getAllParameters\n     * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " \n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " Residuals array.\n     * \u003cp\u003eThis array is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxCostEval"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Maximal allowed number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Number of jacobian evaluations. "
    }
  ]
}