{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/estimation/AbstractEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 37,
      "end_line": 316,
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
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Jacobian matrix.\n     * \u003cp\u003eThis matrix is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Residuals array.\n     * \u003cp\u003eThis array is in canonical form just after the calls to\n     * {@link #updateJacobian()}, but may be modified by the solver\n     * in the derived class (the {@link LevenbergMarquardtEstimator\n     * Levenberg-Marquardt estimator} does this).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "maxCostEval"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Maximal allowed number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.AbstractEstimator()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Build an abstract estimator for least squares problems.\n     * \u003cp\u003eThe maximal number of cost evaluations allowed is set\n     * to its default value {@link #DEFAULT_MAX_COST_EVALUATIONS}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Set the maximal number of cost evaluations allowed.\n     *\n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @see #estimate\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Get the number of cost evaluations.\n     *\n     * @return number of cost evaluations\n     * ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Get the number of jacobian evaluations.\n     *\n     * @return number of jacobian evaluations\n     * ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateJacobian()",
      "begin_line": 124,
      "end_line": 135,
      "comment": "\n     * Update the jacobian matrix.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 46)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 22)",
        "(line 128,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Increment the jacobian evaluations counter.\n     ",
      "child_ranges": [
        "(line 141,col 7)-(line 141,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost()",
      "begin_line": 149,
      "end_line": 167,
      "comment": "\n     * Update the residuals array and cost function value.\n     * @exception EstimationException if the number of cost evaluations\n     * exceeds the maximum allowed\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 17)",
        "(line 158,col 9)-(line 158,col 22)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 180,
      "end_line": 188,
      "comment": "\n     * Get the Root Mean Square value.\n     * Get the Root Mean Square value, i.e. the root of the arithmetic\n     * mean of the square of all weighted residuals. This is related to the\n     * criterion that is minimized by the estimator as follows: if\n     * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n     * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n     *\n     * @param problem estimation problem\n     * @return RMS value\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 182,col 29)",
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\n     * Get the Chi-Square value.\n     * @param problem estimation problem\n     * @return chi-square value\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 61)",
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 212,
      "end_line": 243,
      "comment": "\n     * Get the covariance matrix of unbound estimated parameters.\n     * @param problem estimation problem\n     * @return covariance matrix\n     * @exception EstimationException if the covariance matrix\n     * cannot be computed (singular problem)\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 25)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 221,col 31)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 254,
      "end_line": 270,
      "comment": "\n     * Guess the errors in unbound estimated parameters.\n     * \u003cp\u003eGuessing is covariance-based, it only gives rough order of magnitude.\u003c/p\u003e\n     * @param problem estimation problem\n     * @return errors in estimated parameters\n     * @exception EstimationException if the covariances matrix cannot be computed\n     * or the number of degrees of freedom is not positive (number of measurements\n     * lesser or equal to number of parameters)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 49)",
        "(line 257,col 9)-(line 257,col 54)",
        "(line 258,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 76)",
        "(line 264,col 9)-(line 264,col 68)",
        "(line 265,col 9)-(line 265,col 51)",
        "(line 266,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 279,
      "end_line": 297,
      "comment": "\n     * Initialization of the common parts of the estimation.\n     * \u003cp\u003eThis method \u003cem\u003emust\u003c/em\u003e be called at the start\n     * of the {@link #estimate(EstimationProblem) estimate}\n     * method.\u003c/p\u003e\n     * @param problem estimation problem to solve\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 287,col 9)-(line 287,col 54)",
        "(line 290,col 9)-(line 290,col 40)",
        "(line 291,col 9)-(line 291,col 38)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 295,col 9)-(line 295,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.AbstractEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 313,
      "end_line": 314,
      "comment": "\n     * Solve an estimation problem.\n     *\n     * \u003cp\u003eThe method should set the parameters of the problem to several\n     * trial values until it reaches convergence. If this method returns\n     * normally (i.e. without throwing an exception), then the best\n     * estimate of the parameters can be retrieved from the problem\n     * itself, through the {@link EstimationProblem#getAllParameters\n     * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     ",
      "child_ranges": []
    }
  ]
}