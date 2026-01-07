{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 65,
      "end_line": 393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "mainSetDimension"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Main set dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Maximal step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 104,
      "end_line": 113,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 16)",
        "(line 110,col 5)-(line 110,col 87)",
        "(line 111,col 5)-(line 111,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 127,
      "end_line": 136,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 16)",
        "(line 133,col 5)-(line 133,col 85)",
        "(line 134,col 5)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double, double)",
      "begin_line": 152,
      "end_line": 165,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 156,col 7)-(line 156,col 46)",
        "(line 157,col 7)-(line 157,col 46)",
        "(line 158,col 7)-(line 158,col 23)",
        "(line 160,col 7)-(line 160,col 48)",
        "(line 161,col 7)-(line 161,col 48)",
        "(line 162,col 7)-(line 162,col 35)",
        "(line 163,col 7)-(line 163,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double[], double[])",
      "begin_line": 181,
      "end_line": 194,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 46)",
        "(line 186,col 7)-(line 186,col 46)",
        "(line 187,col 7)-(line 187,col 23)",
        "(line 189,col 7)-(line 189,col 32)",
        "(line 190,col 7)-(line 190,col 32)",
        "(line 191,col 7)-(line 191,col 56)",
        "(line 192,col 7)-(line 192,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 207,
      "end_line": 213,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 208,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 223,
      "end_line": 247,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 229,col 7)-(line 229,col 50)",
        "(line 231,col 7)-(line 235,col 7)",
        "(line 237,col 7)-(line 240,col 7)",
        "(line 242,col 7)-(line 245,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 263,
      "end_line": 326,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector (can be shorter than state vector)\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception MathUserException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 269,col 5)-(line 272,col 5)",
        "(line 276,col 5)-(line 276,col 17)",
        "(line 277,col 5)-(line 277,col 25)",
        "(line 278,col 5)-(line 278,col 28)",
        "(line 279,col 5)-(line 284,col 5)",
        "(line 286,col 5)-(line 287,col 73)",
        "(line 288,col 5)-(line 290,col 5)",
        "(line 293,col 5)-(line 295,col 5)",
        "(line 296,col 5)-(line 296,col 42)",
        "(line 299,col 5)-(line 299,col 28)",
        "(line 300,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 304,col 51)",
        "(line 308,col 5)-(line 308,col 83)",
        "(line 309,col 5)-(line 311,col 64)",
        "(line 312,col 5)-(line 312,col 50)",
        "(line 313,col 5)-(line 313,col 52)",
        "(line 314,col 5)-(line 316,col 5)",
        "(line 317,col 5)-(line 319,col 5)",
        "(line 320,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 324,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 337,
      "end_line": 359,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 340,col 7)-(line 340,col 27)",
        "(line 341,col 7)-(line 349,col 7)",
        "(line 351,col 7)-(line 355,col 7)",
        "(line 357,col 7)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 362,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 368,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 370,col 5)-(line 370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 374,
      "end_line": 377,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 375,col 5)-(line 375,col 27)",
        "(line 376,col 5)-(line 376,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 382,
      "end_line": 384,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 389,
      "end_line": 391,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 390,col 5)-(line 390,col 19)"
      ]
    }
  ]
}