{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 56,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double, double)",
      "begin_line": 68,
      "end_line": 88,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 31)",
        "(line 73,col 5)-(line 73,col 31)",
        "(line 74,col 5)-(line 74,col 28)",
        "(line 76,col 5)-(line 76,col 55)",
        "(line 77,col 5)-(line 77,col 55)",
        "(line 78,col 5)-(line 78,col 38)",
        "(line 79,col 5)-(line 79,col 38)",
        "(line 82,col 5)-(line 82,col 45)",
        "(line 84,col 5)-(line 84,col 56)",
        "(line 86,col 5)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(double, double, double[], double[])",
      "begin_line": 99,
      "end_line": 119,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 31)",
        "(line 104,col 5)-(line 104,col 31)",
        "(line 105,col 5)-(line 105,col 28)",
        "(line 107,col 5)-(line 107,col 35)",
        "(line 108,col 5)-(line 108,col 35)",
        "(line 109,col 5)-(line 109,col 54)",
        "(line 110,col 5)-(line 110,col 54)",
        "(line 113,col 5)-(line 113,col 45)",
        "(line 115,col 5)-(line 115,col 56)",
        "(line 117,col 5)-(line 117,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 132,
      "end_line": 138,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 137,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.setStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 141,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getStepHandler()",
      "begin_line": 146,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 151,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getEventsHandlers()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 7)-(line 160,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.clearEventsHandlers()",
      "begin_line": 164,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 7)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 176,
      "end_line": 216,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 179,col 7)-(line 186,col 7)",
        "(line 187,col 7)-(line 194,col 7)",
        "(line 195,col 7)-(line 202,col 7)",
        "(line 203,col 7)-(line 210,col 7)",
        "(line 211,col 7)-(line 214,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 232,
      "end_line": 295,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 241,col 5)",
        "(line 245,col 5)-(line 245,col 17)",
        "(line 246,col 5)-(line 246,col 25)",
        "(line 247,col 5)-(line 247,col 28)",
        "(line 248,col 5)-(line 253,col 5)",
        "(line 255,col 5)-(line 256,col 69)",
        "(line 257,col 5)-(line 259,col 5)",
        "(line 262,col 5)-(line 264,col 5)",
        "(line 265,col 5)-(line 265,col 52)",
        "(line 268,col 5)-(line 268,col 28)",
        "(line 269,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 273,col 47)",
        "(line 277,col 5)-(line 277,col 75)",
        "(line 278,col 5)-(line 280,col 60)",
        "(line 281,col 5)-(line 281,col 42)",
        "(line 282,col 5)-(line 282,col 44)",
        "(line 283,col 5)-(line 285,col 5)",
        "(line 286,col 5)-(line 288,col 5)",
        "(line 289,col 5)-(line 291,col 5)",
        "(line 293,col 5)-(line 293,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.filterStep(double, boolean)",
      "begin_line": 305,
      "end_line": 330,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 27)",
        "(line 309,col 7)-(line 320,col 7)",
        "(line 322,col 7)-(line 326,col 7)",
        "(line 328,col 7)-(line 328,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 333,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 339,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getCurrentSignedStepsize()",
      "begin_line": 344,
      "end_line": 346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 349,
      "end_line": 352,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 27)",
        "(line 351,col 5)-(line 351,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 357,
      "end_line": 359,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 364,
      "end_line": 366,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Events handlers manager. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " Current stepsize. "
    }
  ]
}