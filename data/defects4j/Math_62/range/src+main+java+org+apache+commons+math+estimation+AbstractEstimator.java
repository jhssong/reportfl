{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/estimation/AbstractEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 39,
      "end_line": 318,
      "comment": "\n * Base class for implementing estimators.\n * \u003cp\u003eThis base class handles the boilerplates methods associated to thresholds\n * settings, jacobian and error estimation.\u003c/p\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_COST_EVALUATIONS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Default maximal number of cost evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Residuals array.\n     * \u003cp\u003eThis array is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
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
        "maxCostEval"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Maximal allowed number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.AbstractEstimator()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Build an abstract estimator for least squares problems.\n     * \u003cp\u003eThe maximal number of cost evaluations allowed is set\n     * to its default value {@link #DEFAULT_MAX_COST_EVALUATIONS}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval(int)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Set the maximal number of cost evaluations allowed.\n     *\n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @see #estimate\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Get the number of cost evaluations.\n     *\n     * @return number of cost evaluations\n     * ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Get the number of jacobian evaluations.\n     *\n     * @return number of jacobian evaluations\n     * ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateJacobian()",
      "begin_line": 126,
      "end_line": 137,
      "comment": "\n     * Update the jacobian matrix.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 129,col 22)",
        "(line 130,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Increment the jacobian evaluations counter.\n     ",
      "child_ranges": [
        "(line 143,col 7)-(line 143,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost()",
      "begin_line": 151,
      "end_line": 169,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception EstimationException if the number of cost evaluations\n     * exceeds the maximum allowed\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 17)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 182,
      "end_line": 190,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the estimator as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @param problem estimation problem\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 61)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 197,
      "end_line": 205,
      "comment": "\n     * Get the Chi-Square value.\n     * @param problem estimation problem\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 61)",
        "(line 199,col 9)-(line 199,col 29)",
        "(line 200,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 214,
      "end_line": 245,
      "comment": "\n     * Get the covariance matrix of unbound estimated parameters.\n     * @param problem estimation problem\n     * @return covariance matrix\n     * @exception EstimationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 25)",
        "(line 221,col 9)-(line 221,col 55)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 223,col 31)",
        "(line 224,col 9)-(line 224,col 42)",
        "(line 225,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 256,
      "end_line": 272,
      "comment": "\n     * Guess the errors in unbound estimated parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @param problem estimation problem\n     * @return errors in estimated parameters\n     * @exception EstimationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 49)",
        "(line 259,col 9)-(line 259,col 54)",
        "(line 260,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 76)",
        "(line 266,col 9)-(line 266,col 72)",
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 281,
      "end_line": 299,
      "comment": "\n     * Initialization of the common parts of the estimation.\n     * \u003cp\u003eThis method \u003cem\u003emust\u003c/em\u003e be called at the start\n     * of the {@link #estimate(EstimationProblem) estimate}\n     * method.\u003c/p\u003e\n     * @param problem estimation problem to solve\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 285,col 32)",
        "(line 288,col 9)-(line 288,col 49)",
        "(line 289,col 9)-(line 289,col 54)",
        "(line 292,col 9)-(line 292,col 40)",
        "(line 293,col 9)-(line 293,col 38)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 37)",
        "(line 297,col 9)-(line 297,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 315,
      "end_line": 316,
      "comment": "\n     * Solve an estimation problem.\n     *\n     * \u003cp\u003eThe method should set the parameters of the problem to several\n     * trial values until it reaches convergence. If this method returns\n     * normally (i.e. without throwing an exception), then the best\n     * estimate of the parameters can be retrieved from the problem\n     * itself, through the {@link EstimationProblem#getAllParameters\n     * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     ",
      "child_ranges": []
    }
  ]
}