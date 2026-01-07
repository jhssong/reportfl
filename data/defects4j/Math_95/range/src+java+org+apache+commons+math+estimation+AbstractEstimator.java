{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/estimation/AbstractEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 33,
      "end_line": 301,
      "comment": "\n * Base class for implementing estimators.\n * \u003cp\u003eThis base class handles the boilerplates methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n *\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.AbstractEstimator()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * Build an abstract estimator for least squares problems.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval(int)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Set the maximal number of cost evaluations allowed.\n     * \n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @see #estimate\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the number of cost evaluations.\n     * \n     * @return number of cost evaluations\n     * ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " \n     * Get the number of jacobian evaluations.\n     * \n     * @return number of jacobian evaluations\n     * ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateJacobian()",
      "begin_line": 72,
      "end_line": 82,
      "comment": " \n     * Update the jacobian matrix.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 46)",
        "(line 74,col 9)-(line 74,col 33)",
        "(line 75,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Increment the jacobian evaluations counter.\n     ",
      "child_ranges": [
        "(line 88,col 7)-(line 88,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost()",
      "begin_line": 96,
      "end_line": 113,
      "comment": " \n     * Update the residuals array and cost function value.\n     * @exception EstimationException if the number of cost evaluations\n     * exceeds the maximum allowed\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 17)",
        "(line 105,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 126,
      "end_line": 134,
      "comment": " \n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the estimator as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     * \n     * @param problem estimation problem\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 61)",
        "(line 128,col 9)-(line 128,col 29)",
        "(line 129,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 141,
      "end_line": 149,
      "comment": "\n     * Get the Chi-Square value.\n     * @param problem estimation problem\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 61)",
        "(line 143,col 9)-(line 143,col 29)",
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 158,
      "end_line": 188,
      "comment": "\n     * Get the covariance matrix of unbound estimated parameters.\n     * @param problem estimation problem\n     * @return covariance matrix\n     * @exception EstimationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 25)",
        "(line 165,col 9)-(line 165,col 58)",
        "(line 166,col 9)-(line 166,col 63)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 199,
      "end_line": 214,
      "comment": "\n     * Guess the errors in unbound estimated parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @param problem estimation problem\n     * @return errors in estimated parameters\n     * @exception EstimationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 49)",
        "(line 202,col 9)-(line 202,col 54)",
        "(line 203,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 76)",
        "(line 208,col 9)-(line 208,col 68)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 223,
      "end_line": 241,
      "comment": "\n     * Initialization of the common parts of the estimation.\n     * \u003cp\u003eThis method \u003cem\u003emust\u003c/em\u003e be called at the start\n     * of the {@link #estimate(EstimationProblem) estimate}\n     * method.\u003c/p\u003e\n     * @param problem estimation problem to solve\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 32)",
        "(line 230,col 9)-(line 230,col 49)",
        "(line 231,col 9)-(line 231,col 54)",
        "(line 234,col 9)-(line 234,col 40)",
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 236,col 44)",
        "(line 237,col 9)-(line 237,col 37)",
        "(line 239,col 9)-(line 239,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 257,
      "end_line": 258,
      "comment": " \n     * Solve an estimation problem.\n     *\n     * \u003cp\u003eThe method should set the parameters of the problem to several\n     * trial values until it reaches convergence. If this method returns\n     * normally (i.e. without throwing an exception), then the best\n     * estimate of the parameters can be retrieved from the problem\n     * itself, through the {@link EstimationProblem#getAllParameters\n     * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " \n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " Residuals array.\n     * \u003cp\u003eThis array is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxCostEval"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Maximal allowed number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " Number of jacobian evaluations. "
    }
  ]
}