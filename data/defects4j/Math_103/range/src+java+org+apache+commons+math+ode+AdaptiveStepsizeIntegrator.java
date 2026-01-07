{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 48,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 60,
      "end_line": 78,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 31)",
        "(line 65,col 5)-(line 65,col 31)",
        "(line 66,col 5)-(line 66,col 28)",
        "(line 68,col 5)-(line 68,col 55)",
        "(line 69,col 5)-(line 69,col 55)",
        "(line 70,col 5)-(line 70,col 38)",
        "(line 71,col 5)-(line 71,col 38)",
        "(line 74,col 5)-(line 74,col 45)",
        "(line 76,col 5)-(line 76,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 89,
      "end_line": 107,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 31)",
        "(line 94,col 5)-(line 94,col 31)",
        "(line 95,col 5)-(line 95,col 28)",
        "(line 97,col 5)-(line 97,col 35)",
        "(line 98,col 5)-(line 98,col 35)",
        "(line 99,col 5)-(line 99,col 54)",
        "(line 100,col 5)-(line 100,col 54)",
        "(line 103,col 5)-(line 103,col 45)",
        "(line 105,col 5)-(line 105,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 120,
      "end_line": 126,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 125,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 133,
      "end_line": 135,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getStepHandler()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double)",
      "begin_line": 151,
      "end_line": 155,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 171,
      "end_line": 234,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 180,col 5)",
        "(line 184,col 5)-(line 184,col 17)",
        "(line 185,col 5)-(line 185,col 25)",
        "(line 186,col 5)-(line 186,col 28)",
        "(line 187,col 5)-(line 192,col 5)",
        "(line 194,col 5)-(line 195,col 62)",
        "(line 196,col 5)-(line 198,col 5)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 204,col 5)-(line 204,col 52)",
        "(line 207,col 5)-(line 207,col 28)",
        "(line 208,col 5)-(line 211,col 5)",
        "(line 212,col 5)-(line 212,col 47)",
        "(line 216,col 5)-(line 216,col 69)",
        "(line 217,col 5)-(line 219,col 46)",
        "(line 220,col 5)-(line 220,col 42)",
        "(line 221,col 5)-(line 221,col 44)",
        "(line 222,col 5)-(line 224,col 5)",
        "(line 225,col 5)-(line 227,col 5)",
        "(line 228,col 5)-(line 230,col 5)",
        "(line 232,col 5)-(line 232,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.filterStep(double, boolean)",
      "begin_line": 244,
      "end_line": 268,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 247,col 5)-(line 258,col 5)",
        "(line 260,col 5)-(line 264,col 5)",
        "(line 266,col 5)-(line 266,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 270,
      "end_line": 273,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 285,
      "end_line": 287,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 286,col 5)-(line 286,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Switching functions handler. "
    }
  ]
}