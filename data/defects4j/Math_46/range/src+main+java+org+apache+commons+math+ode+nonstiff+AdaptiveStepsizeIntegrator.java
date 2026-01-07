{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 68,
      "end_line": 394,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "mainSetDimension"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Main set dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Maximal step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 107,
      "end_line": 116,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 16)",
        "(line 113,col 5)-(line 113,col 87)",
        "(line 114,col 5)-(line 114,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 130,
      "end_line": 139,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 16)",
        "(line 136,col 5)-(line 136,col 85)",
        "(line 137,col 5)-(line 137,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double, double)",
      "begin_line": 155,
      "end_line": 168,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 159,col 7)-(line 159,col 46)",
        "(line 160,col 7)-(line 160,col 46)",
        "(line 161,col 7)-(line 161,col 23)",
        "(line 163,col 7)-(line 163,col 48)",
        "(line 164,col 7)-(line 164,col 48)",
        "(line 165,col 7)-(line 165,col 35)",
        "(line 166,col 7)-(line 166,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double[], double[])",
      "begin_line": 184,
      "end_line": 197,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 188,col 7)-(line 188,col 46)",
        "(line 189,col 7)-(line 189,col 46)",
        "(line 190,col 7)-(line 190,col 23)",
        "(line 192,col 7)-(line 192,col 32)",
        "(line 193,col 7)-(line 193,col 32)",
        "(line 194,col 7)-(line 194,col 56)",
        "(line 195,col 7)-(line 195,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 210,
      "end_line": 216,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 215,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 227,
      "end_line": 249,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception DimensionMismatchException if some inconsistency is detected\n   * @exception NumberIsTooSmallException if integration span is too small\n   ",
      "child_ranges": [
        "(line 233,col 7)-(line 233,col 50)",
        "(line 235,col 7)-(line 239,col 7)",
        "(line 241,col 7)-(line 243,col 7)",
        "(line 245,col 7)-(line 247,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 265,
      "end_line": 328,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector (can be shorter than state vector)\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception MathUserException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 271,col 5)-(line 274,col 5)",
        "(line 278,col 5)-(line 278,col 17)",
        "(line 279,col 5)-(line 279,col 25)",
        "(line 280,col 5)-(line 280,col 28)",
        "(line 281,col 5)-(line 286,col 5)",
        "(line 288,col 5)-(line 289,col 73)",
        "(line 290,col 5)-(line 292,col 5)",
        "(line 295,col 5)-(line 297,col 5)",
        "(line 298,col 5)-(line 298,col 42)",
        "(line 301,col 5)-(line 301,col 28)",
        "(line 302,col 5)-(line 305,col 5)",
        "(line 306,col 5)-(line 306,col 51)",
        "(line 310,col 5)-(line 310,col 83)",
        "(line 311,col 5)-(line 313,col 64)",
        "(line 314,col 5)-(line 314,col 50)",
        "(line 315,col 5)-(line 315,col 52)",
        "(line 316,col 5)-(line 318,col 5)",
        "(line 319,col 5)-(line 321,col 5)",
        "(line 322,col 5)-(line 324,col 5)",
        "(line 326,col 5)-(line 326,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 339,
      "end_line": 360,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception NumberIsTooSmallException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 342,col 7)-(line 342,col 27)",
        "(line 343,col 7)-(line 350,col 7)",
        "(line 352,col 7)-(line 356,col 7)",
        "(line 358,col 7)-(line 358,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 363,
      "end_line": 366,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 369,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 371,col 5)-(line 371,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 375,
      "end_line": 378,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 376,col 5)-(line 376,col 27)",
        "(line 377,col 5)-(line 377,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 383,
      "end_line": 385,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 390,
      "end_line": 392,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 391,col 5)-(line 391,col 19)"
      ]
    }
  ]
}