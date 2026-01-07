{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.AbstractIntegrator"
      ],
      "begin_line": 66,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "mainSetDimension"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Main set dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Maximal step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 105,
      "end_line": 114,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 16)",
        "(line 111,col 5)-(line 111,col 87)",
        "(line 112,col 5)-(line 112,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 128,
      "end_line": 137,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 16)",
        "(line 134,col 5)-(line 134,col 85)",
        "(line 135,col 5)-(line 135,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double, double)",
      "begin_line": 153,
      "end_line": 166,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 157,col 7)-(line 157,col 46)",
        "(line 158,col 7)-(line 158,col 46)",
        "(line 159,col 7)-(line 159,col 23)",
        "(line 161,col 7)-(line 161,col 48)",
        "(line 162,col 7)-(line 162,col 48)",
        "(line 163,col 7)-(line 163,col 35)",
        "(line 164,col 7)-(line 164,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.setStepSizeControl(double, double, double[], double[])",
      "begin_line": 182,
      "end_line": 195,
      "comment": " Set the adaptive step size control parameters.\n   * \u003cp\u003e\n   * A side effect of this method is to also reset the initial\n   * step so it will be automatically computed by the integrator\n   * if {@link #setInitialStepSize(double) setInitialStepSize}\n   * is not called by the user.\n   * \u003c/p\u003e\n   * @param minimalStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maximalStep maximal step (must be positive even for backward\n   * integration)\n   * @param absoluteTolerance allowed absolute error\n   * @param relativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 186,col 7)-(line 186,col 46)",
        "(line 187,col 7)-(line 187,col 46)",
        "(line 188,col 7)-(line 188,col 23)",
        "(line 190,col 7)-(line 190,col 32)",
        "(line 191,col 7)-(line 191,col 32)",
        "(line 192,col 7)-(line 192,col 56)",
        "(line 193,col 7)-(line 193,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 208,
      "end_line": 214,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 213,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 217,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 221,col 7)-(line 221,col 39)",
        "(line 223,col 7)-(line 223,col 69)",
        "(line 225,col 7)-(line 227,col 7)",
        "(line 229,col 7)-(line 231,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 248,
      "end_line": 310,
      "comment": " Initialize the integration step.\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector (can be shorter than state vector)\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 256,col 5)",
        "(line 260,col 5)-(line 260,col 17)",
        "(line 261,col 5)-(line 261,col 25)",
        "(line 262,col 5)-(line 262,col 28)",
        "(line 263,col 5)-(line 268,col 5)",
        "(line 270,col 5)-(line 271,col 73)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 277,col 5)-(line 279,col 5)",
        "(line 280,col 5)-(line 280,col 42)",
        "(line 283,col 5)-(line 283,col 28)",
        "(line 284,col 5)-(line 287,col 5)",
        "(line 288,col 5)-(line 288,col 51)",
        "(line 292,col 5)-(line 292,col 83)",
        "(line 293,col 5)-(line 295,col 64)",
        "(line 296,col 5)-(line 296,col 50)",
        "(line 297,col 5)-(line 297,col 52)",
        "(line 298,col 5)-(line 300,col 5)",
        "(line 301,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 306,col 5)",
        "(line 308,col 5)-(line 308,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 321,
      "end_line": 342,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception NumberIsTooSmallException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 324,col 7)-(line 324,col 27)",
        "(line 325,col 7)-(line 332,col 7)",
        "(line 334,col 7)-(line 338,col 7)",
        "(line 340,col 7)-(line 340,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 345,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 351,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 357,
      "end_line": 360,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 27)",
        "(line 359,col 5)-(line 359,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 365,
      "end_line": 367,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 372,
      "end_line": 374,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 19)"
      ]
    }
  ]
}