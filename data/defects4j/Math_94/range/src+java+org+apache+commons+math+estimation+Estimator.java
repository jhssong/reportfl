{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/estimation/Estimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Estimator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.Estimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 54,
      "end_line": 55,
      "comment": " \n   * Solve an estimation problem.\n   *\n   * \u003cp\u003eThe method should set the parameters of the problem to several\n   * trial values until it reaches convergence. If this method returns\n   * normally (i.e. without throwing an exception), then the best\n   * estimate of the parameters can be retrieved from the problem\n   * itself, through the {@link EstimationProblem#getAllParameters\n   * EstimationProblem.getAllParameters} method.\u003c/p\u003e\n   *\n   * @param problem estimation problem to solve\n   * @exception EstimationException if the problem cannot be solved\n   *\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.Estimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 69,
      "end_line": 69,
      "comment": " \n   * Get the Root Mean Square value.\n   * Get the Root Mean Square value, i.e. the root of the arithmetic\n   * mean of the square of all weighted residuals. This is related to the\n   * criterion that is minimized by the estimator as follows: if\n   * \u003cem\u003ec\u003c/em\u003e is the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n   * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n   * @see #guessParametersErrors(EstimationProblem)\n   * \n   * @param problem estimation problem\n   * @return RMS value\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.Estimator.getCovariances(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 78,
      "end_line": 79,
      "comment": "\n   * Get the covariance matrix of estimated parameters.\n   * @param problem estimation problem\n   * @return covariance matrix\n   * @exception EstimationException if the covariance matrix\n   * cannot be computed (singular problem)\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.Estimator.guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 88,
      "end_line": 89,
      "comment": "\n   * Guess the errors in estimated parameters.\n   * @see #getRMS(EstimationProblem)\n   * @param problem estimation problem\n   * @return errors in estimated parameters\n     * @exception EstimationException if the error cannot be guessed\n   ",
      "child_ranges": []
    }
  ]
}