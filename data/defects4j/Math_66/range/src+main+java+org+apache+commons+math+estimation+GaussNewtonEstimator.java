{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/estimation/GaussNewtonEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.AbstractEstimator",
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 230,
      "comment": "\n * This class implements a solver for estimation problems.\n *\n * \u003cp\u003eThis class solves estimation problems using a weighted least\n * squares criterion on the measurement residuals. It uses a\n * Gauss-Newton algorithm.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STEADY_STATE_THRESHOLD"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Default threshold for cost steady state detection. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CONVERGENCE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Default threshold for cost convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "steadyStateThreshold"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Threshold for cost steady state detection. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Threshold for cost convergence. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.GaussNewtonEstimator()",
      "begin_line": 69,
      "end_line": 72,
      "comment": " Simple constructor with default settings.\n     * \u003cp\u003e\n     * The estimator is built with default values for all settings.\n     * \u003c/p\u003e\n     * @see #DEFAULT_STEADY_STATE_THRESHOLD\n     * @see #DEFAULT_CONVERGENCE\n     * @see AbstractEstimator#DEFAULT_MAX_COST_EVALUATIONS\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 67)",
        "(line 71,col 9)-(line 71,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.GaussNewtonEstimator(int, double, double)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * Simple constructor.\n     *\n     * \u003cp\u003eThis constructor builds an estimator and stores its convergence\n     * characteristics.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn estimator is considered to have converged whenever either\n     * the criterion goes below a physical threshold under which\n     * improvements are considered useless or when the algorithm is\n     * unable to improve it (even if it is still high). The first\n     * condition that is met stops the iterations.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe fact an estimator has converged does not mean that the\n     * model accurately fits the measurements. It only means no better\n     * solution can be found, it does not mean this one is good. Such an\n     * analysis is left to the caller.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf neither conditions are fulfilled before a given number of\n     * iterations, the algorithm is considered to have failed and an\n     * {@link EstimationException} is thrown.\u003c/p\u003e\n     *\n     * @param maxCostEval maximal number of cost evaluations allowed\n     * @param convergence criterion threshold below which we do not need\n     * to improve the criterion anymore\n     * @param steadyStateThreshold steady state detection threshold, the\n     * problem has converged has reached a steady state if\n     * \u003ccode\u003eMath.abs(J\u003csub\u003en\u003c/sub\u003e - J\u003csub\u003en-1\u003c/sub\u003e) \u0026lt;\n     * J\u003csub\u003en\u003c/sub\u003e \u0026times convergence\u003c/code\u003e, where \u003ccode\u003eJ\u003csub\u003en\u003c/sub\u003e\u003c/code\u003e\n     * and \u003ccode\u003eJ\u003csub\u003en-1\u003c/sub\u003e\u003c/code\u003e are the current and preceding criterion\n     * values (square sum of the weighted residuals of considered measurements).\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 57)",
        "(line 109,col 9)-(line 109,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.setConvergence(double)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Set the convergence criterion threshold.\n     * @param convergence criterion threshold below which we do not need\n     * to improve the criterion anymore\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.setSteadyStateThreshold(double)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Set the steady state detection threshold.\n     * \u003cp\u003e\n     * The problem has converged has reached a steady state if\n     * \u003ccode\u003eMath.abs(J\u003csub\u003en\u003c/sub\u003e - J\u003csub\u003en-1\u003c/sub\u003e) \u0026lt;\n     * J\u003csub\u003en\u003c/sub\u003e \u0026times convergence\u003c/code\u003e, where \u003ccode\u003eJ\u003csub\u003en\u003c/sub\u003e\u003c/code\u003e\n     * and \u003ccode\u003eJ\u003csub\u003en-1\u003c/sub\u003e\u003c/code\u003e are the current and preceding criterion\n     * values (square sum of the weighted residuals of considered measurements).\n     * \u003c/p\u003e\n     * @param steadyStateThreshold steady state detection threshold\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 159,
      "end_line": 228,
      "comment": "\n     * Solve an estimation problem using a least squares criterion.\n     *\n     * \u003cp\u003eThis method set the unbound parameters of the given problem\n     * starting from their current values through several iterations. At\n     * each step, the unbound parameters are changed in order to\n     * minimize a weighted least square criterion based on the\n     * measurements of the problem.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe iterations are stopped either when the criterion goes\n     * below a physical threshold under which improvement are considered\n     * useless or when the algorithm is unable to improve it (even if it\n     * is still high). The first condition that is met stops the\n     * iterations. If the convergence it not reached before the maximum\n     * number of iterations, an {@link EstimationException} is\n     * thrown.\u003c/p\u003e\n     *\n     * @param problem estimation problem to solve\n     * @exception EstimationException if the problem cannot be solved\n     *\n     * @see EstimationProblem\n     *\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 36)",
        "(line 166,col 9)-(line 166,col 66)",
        "(line 167,col 9)-(line 167,col 76)",
        "(line 168,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 169,col 103)",
        "(line 172,col 9)-(line 172,col 51)",
        "(line 173,col 9)-(line 226,col 51)"
      ]
    }
  ]
}