{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 54,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Maximal step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 88,
      "end_line": 106,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 16)",
        "(line 95,col 5)-(line 95,col 41)",
        "(line 96,col 5)-(line 96,col 41)",
        "(line 97,col 5)-(line 97,col 28)",
        "(line 99,col 5)-(line 99,col 55)",
        "(line 100,col 5)-(line 100,col 55)",
        "(line 101,col 5)-(line 101,col 38)",
        "(line 102,col 5)-(line 102,col 38)",
        "(line 104,col 5)-(line 104,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 118,
      "end_line": 136,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 16)",
        "(line 125,col 5)-(line 125,col 31)",
        "(line 126,col 5)-(line 126,col 31)",
        "(line 127,col 5)-(line 127,col 28)",
        "(line 129,col 5)-(line 129,col 35)",
        "(line 130,col 5)-(line 130,col 35)",
        "(line 131,col 5)-(line 131,col 62)",
        "(line 132,col 5)-(line 132,col 62)",
        "(line 134,col 5)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 149,
      "end_line": 155,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 154,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 165,
      "end_line": 187,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 171,col 7)-(line 171,col 50)",
        "(line 173,col 7)-(line 178,col 7)",
        "(line 180,col 7)-(line 185,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 203,
      "end_line": 266,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 209,col 5)-(line 212,col 5)",
        "(line 216,col 5)-(line 216,col 17)",
        "(line 217,col 5)-(line 217,col 25)",
        "(line 218,col 5)-(line 218,col 28)",
        "(line 219,col 5)-(line 224,col 5)",
        "(line 226,col 5)-(line 227,col 69)",
        "(line 228,col 5)-(line 230,col 5)",
        "(line 233,col 5)-(line 235,col 5)",
        "(line 236,col 5)-(line 236,col 42)",
        "(line 239,col 5)-(line 239,col 28)",
        "(line 240,col 5)-(line 243,col 5)",
        "(line 244,col 5)-(line 244,col 47)",
        "(line 248,col 5)-(line 248,col 75)",
        "(line 249,col 5)-(line 251,col 60)",
        "(line 252,col 5)-(line 252,col 42)",
        "(line 253,col 5)-(line 253,col 44)",
        "(line 254,col 5)-(line 256,col 5)",
        "(line 257,col 5)-(line 259,col 5)",
        "(line 260,col 5)-(line 262,col 5)",
        "(line 264,col 5)-(line 264,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 277,
      "end_line": 299,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 280,col 7)-(line 280,col 27)",
        "(line 281,col 7)-(line 289,col 7)",
        "(line 291,col 7)-(line 295,col 7)",
        "(line 297,col 7)-(line 297,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 302,
      "end_line": 305,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 308,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 314,
      "end_line": 317,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 27)",
        "(line 316,col 5)-(line 316,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 322,
      "end_line": 324,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 329,
      "end_line": 331,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 19)"
      ]
    }
  ]
}