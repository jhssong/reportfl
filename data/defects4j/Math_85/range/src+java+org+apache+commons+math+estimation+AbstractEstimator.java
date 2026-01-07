{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/estimation/AbstractEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 37,
      "end_line": 314,
      "comment": "\n * Base class for implementing estimators.\n * \u003cp\u003eThis base class handles the boilerplates methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_COST_EVALUATIONS"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Default maximal number of cost evaluations allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.AbstractEstimator()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Build an abstract estimator for least squares problems.\n     * \u003cp\u003eThe maximal number of cost evaluations allowed is set\n     * to its default value {@link #DEFAULT_MAX_COST_EVALUATIONS}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval(int)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Set the maximal number of cost evaluations allowed.\n     * \n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @see #estimate\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Get the number of cost evaluations.\n     * \n     * @return number of cost evaluations\n     * ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " \n     * Get the number of jacobian evaluations.\n     * \n     * @return number of jacobian evaluations\n     * ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateJacobian()",
      "begin_line": 83,
      "end_line": 93,
      "comment": " \n     * Update the jacobian matrix.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 46)",
        "(line 85,col 9)-(line 85,col 33)",
        "(line 86,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Increment the jacobian evaluations counter.\n     ",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost()",
      "begin_line": 107,
      "end_line": 124,
      "comment": " \n     * Update the residuals array and cost function value.\n     * @exception EstimationException if the number of cost evaluations\n     * exceeds the maximum allowed\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 113,col 9)",
        "(line 115,col 9)-(line 115,col 17)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 137,
      "end_line": 145,
      "comment": " \n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the estimator as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     * \n     * @param problem estimation problem\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 61)",
        "(line 139,col 9)-(line 139,col 29)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\n     * Get the Chi-Square value.\n     * @param problem estimation problem\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 61)",
        "(line 154,col 9)-(line 154,col 29)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 169,
      "end_line": 200,
      "comment": "\n     * Get the covariance matrix of unbound estimated parameters.\n     * @param problem estimation problem\n     * @return covariance matrix\n     * @exception EstimationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 25)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 63)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 179,col 48)",
        "(line 180,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 211,
      "end_line": 227,
      "comment": "\n     * Guess the errors in unbound estimated parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @param problem estimation problem\n     * @return errors in estimated parameters\n     * @exception EstimationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 49)",
        "(line 214,col 9)-(line 214,col 54)",
        "(line 215,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 76)",
        "(line 221,col 9)-(line 221,col 68)",
        "(line 222,col 9)-(line 222,col 51)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 236,
      "end_line": 254,
      "comment": "\n     * Initialization of the common parts of the estimation.\n     * \u003cp\u003eThis method \u003cem\u003emust\u003c/em\u003e be called at the start\n     * of the {@link #estimate(EstimationProblem) estimate}\n     * method.\u003c/p\u003e\n     * @param problem estimation problem to solve\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 32)",
        "(line 240,col 9)-(line 240,col 32)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 244,col 54)",
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 248,col 38)",
        "(line 249,col 9)-(line 249,col 44)",
        "(line 250,col 9)-(line 250,col 37)",
        "(line 252,col 9)-(line 252,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 270,
      "end_line": 271,
      "comment": " \n     * Solve an estimation problem.\n     *\n     * \u003cp\u003eThe method should set the parameters of the problem to several\n     * trial values until it reaches convergence. If this method returns\n     * normally (i.e. without throwing an exception), then the best\n     * estimate of the parameters can be retrieved from the problem\n     * itself, through the {@link EstimationProblem#getAllParameters\n     * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " \n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Residuals array.\n     * \u003cp\u003eThis array is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxCostEval"
      ],
      "begin_line": 306,
      "end_line": 306,
      "comment": " Maximal allowed number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 309,
      "end_line": 309,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Number of jacobian evaluations. "
    }
  ]
}