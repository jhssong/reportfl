{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 48,
      "end_line": 395,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 60,
      "end_line": 80,
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
        "(line 76,col 5)-(line 76,col 54)",
        "(line 78,col 5)-(line 78,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 91,
      "end_line": 111,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 31)",
        "(line 96,col 5)-(line 96,col 31)",
        "(line 97,col 5)-(line 97,col 28)",
        "(line 99,col 5)-(line 99,col 35)",
        "(line 100,col 5)-(line 100,col 35)",
        "(line 101,col 5)-(line 101,col 54)",
        "(line 102,col 5)-(line 102,col 54)",
        "(line 105,col 5)-(line 105,col 45)",
        "(line 107,col 5)-(line 107,col 54)",
        "(line 109,col 5)-(line 109,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 124,
      "end_line": 130,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 125,col 5)-(line 129,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getStepHandler()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 157,
      "end_line": 162,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 172,
      "end_line": 214,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 175,col 7)-(line 182,col 7)",
        "(line 183,col 7)-(line 190,col 7)",
        "(line 191,col 7)-(line 198,col 7)",
        "(line 199,col 7)-(line 206,col 7)",
        "(line 207,col 7)-(line 212,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 230,
      "end_line": 293,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 239,col 5)",
        "(line 243,col 5)-(line 243,col 17)",
        "(line 244,col 5)-(line 244,col 25)",
        "(line 245,col 5)-(line 245,col 28)",
        "(line 246,col 5)-(line 251,col 5)",
        "(line 253,col 5)-(line 254,col 62)",
        "(line 255,col 5)-(line 257,col 5)",
        "(line 260,col 5)-(line 262,col 5)",
        "(line 263,col 5)-(line 263,col 52)",
        "(line 266,col 5)-(line 266,col 28)",
        "(line 267,col 5)-(line 270,col 5)",
        "(line 271,col 5)-(line 271,col 47)",
        "(line 275,col 5)-(line 275,col 69)",
        "(line 276,col 5)-(line 278,col 46)",
        "(line 279,col 5)-(line 279,col 42)",
        "(line 280,col 5)-(line 280,col 44)",
        "(line 281,col 5)-(line 283,col 5)",
        "(line 284,col 5)-(line 286,col 5)",
        "(line 287,col 5)-(line 289,col 5)",
        "(line 291,col 5)-(line 291,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.filterStep(double, boolean)",
      "begin_line": 303,
      "end_line": 327,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 306,col 5)-(line 317,col 5)",
        "(line 319,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 325,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 329,
      "end_line": 332,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 335,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentSignedStepsize()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 343,
      "end_line": 346,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 344,col 5)-(line 344,col 27)",
        "(line 345,col 5)-(line 345,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 351,
      "end_line": 353,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Switching functions handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Current stepsize. "
    }
  ]
}