{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/ode/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 49,
      "end_line": 428,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 61,
      "end_line": 81,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 31)",
        "(line 66,col 5)-(line 66,col 31)",
        "(line 67,col 5)-(line 67,col 28)",
        "(line 69,col 5)-(line 69,col 55)",
        "(line 70,col 5)-(line 70,col 55)",
        "(line 71,col 5)-(line 71,col 38)",
        "(line 72,col 5)-(line 72,col 38)",
        "(line 75,col 5)-(line 75,col 45)",
        "(line 77,col 5)-(line 77,col 54)",
        "(line 79,col 5)-(line 79,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 92,
      "end_line": 112,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 31)",
        "(line 97,col 5)-(line 97,col 31)",
        "(line 98,col 5)-(line 98,col 28)",
        "(line 100,col 5)-(line 100,col 35)",
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 54)",
        "(line 103,col 5)-(line 103,col 54)",
        "(line 106,col 5)-(line 106,col 45)",
        "(line 108,col 5)-(line 108,col 54)",
        "(line 110,col 5)-(line 110,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 125,
      "end_line": 131,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 130,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 138,
      "end_line": 140,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getStepHandler()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 146,col 5)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 158,
      "end_line": 163,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 173,
      "end_line": 213,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 176,col 7)-(line 183,col 7)",
        "(line 184,col 7)-(line 191,col 7)",
        "(line 192,col 7)-(line 199,col 7)",
        "(line 200,col 7)-(line 207,col 7)",
        "(line 208,col 7)-(line 211,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 229,
      "end_line": 292,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 238,col 5)",
        "(line 242,col 5)-(line 242,col 17)",
        "(line 243,col 5)-(line 243,col 25)",
        "(line 244,col 5)-(line 244,col 28)",
        "(line 245,col 5)-(line 250,col 5)",
        "(line 252,col 5)-(line 253,col 69)",
        "(line 254,col 5)-(line 256,col 5)",
        "(line 259,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 52)",
        "(line 265,col 5)-(line 265,col 28)",
        "(line 266,col 5)-(line 269,col 5)",
        "(line 270,col 5)-(line 270,col 47)",
        "(line 274,col 5)-(line 274,col 69)",
        "(line 275,col 5)-(line 277,col 54)",
        "(line 278,col 5)-(line 278,col 42)",
        "(line 279,col 5)-(line 279,col 44)",
        "(line 280,col 5)-(line 282,col 5)",
        "(line 283,col 5)-(line 285,col 5)",
        "(line 286,col 5)-(line 288,col 5)",
        "(line 290,col 5)-(line 290,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.filterStep(double, boolean)",
      "begin_line": 302,
      "end_line": 326,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 305,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 324,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 344,
      "end_line": 347,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the value of the current step that\n   * is attempted is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentSignedStepsize()",
      "begin_line": 371,
      "end_line": 373,
      "comment": " Get the current signed value of the integration stepsize.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the signed value of the current stepsize\n   * that is tried is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current signed value of the stepsize\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 376,
      "end_line": 379,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 377,col 5)-(line 377,col 27)",
        "(line 378,col 5)-(line 378,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 384,
      "end_line": 386,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 391,
      "end_line": 393,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 392,col 5)-(line 392,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " Switching functions handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Current stepsize. "
    }
  ]
}