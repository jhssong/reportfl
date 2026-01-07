{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/estimation/GaussNewtonEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.AbstractEstimator",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.GaussNewtonEstimator(int, double, double)",
      "begin_line": 74,
      "end_line": 80,
      "comment": " \n     * Simple constructor.\n     *\n     * \u003cp\u003eThis constructor builds an estimator and stores its convergence\n     * characteristics.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn estimator is considered to have converged whenever either\n     * the criterion goes below a physical threshold under which\n     * improvements are considered useless or when the algorithm is\n     * unable to improve it (even if it is still high). The first\n     * condition that is met stops the iterations.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe fact an estimator has converged does not mean that the\n     * model accurately fits the measurements. It only means no better\n     * solution can be found, it does not mean this one is good. Such an\n     * analysis is left to the caller.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf neither conditions are fulfilled before a given number of\n     * iterations, the algorithm is considered to have failed and an\n     * {@link EstimationException} is thrown.\u003c/p\u003e\n     *\n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @param convergence criterion threshold below which we do not need\n     * to improve the criterion anymore\n     * @param steadyStateThreshold steady state detection threshold, the\n     * problem has converged has reached a steady state if\n     * \u003ccode\u003eMath.abs (Jn - Jn-1) \u003c Jn * convergence\u003c/code\u003e, where\n     * \u003ccode\u003eJn\u003c/code\u003e and \u003ccode\u003eJn-1\u003c/code\u003e are the current and\n     * preceding criterion value (square sum of the weighted residuals\n     * of considered measurements).\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 57)",
        "(line 79,col 9)-(line 79,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 105,
      "end_line": 173,
      "comment": " \n     * Solve an estimation problem using a least squares criterion.\n     *\n     * \u003cp\u003eThis method set the unbound parameters of the given problem\n     * starting from their current values through several iterations. At\n     * each step, the unbound parameters are changed in order to\n     * minimize a weighted least square criterion based on the\n     * measurements of the problem.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe iterations are stopped either when the criterion goes\n     * below a physical threshold under which improvement are considered\n     * useless or when the algorithm is unable to improve it (even if it\n     * is still high). The first condition that is met stops the\n     * iterations. If the convergence it nos reached before the maximum\n     * number of iterations, an {@link EstimationException} is\n     * thrown.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     * @see EstimationProblem\n     *\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 36)",
        "(line 111,col 9)-(line 111,col 66)",
        "(line 112,col 9)-(line 112,col 74)",
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 114,col 103)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 118,col 9)-(line 171,col 51)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "steadyStateThreshold"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Threshold for cost steady state detection. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Threshold for cost convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Serializable version identifier "
    }
  ]
}