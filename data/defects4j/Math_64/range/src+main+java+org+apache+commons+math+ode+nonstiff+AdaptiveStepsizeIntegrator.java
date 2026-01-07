{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 64,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Allowed relative vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "mainSetDimension"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Main set dimension. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Maximal step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 101,
      "end_line": 119,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 16)",
        "(line 108,col 5)-(line 108,col 41)",
        "(line 109,col 5)-(line 109,col 41)",
        "(line 110,col 5)-(line 110,col 28)",
        "(line 112,col 5)-(line 112,col 55)",
        "(line 113,col 5)-(line 113,col 55)",
        "(line 114,col 5)-(line 114,col 38)",
        "(line 115,col 5)-(line 115,col 38)",
        "(line 117,col 5)-(line 117,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 131,
      "end_line": 149,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 16)",
        "(line 138,col 5)-(line 138,col 31)",
        "(line 139,col 5)-(line 139,col 31)",
        "(line 140,col 5)-(line 140,col 28)",
        "(line 142,col 5)-(line 142,col 35)",
        "(line 143,col 5)-(line 143,col 35)",
        "(line 144,col 5)-(line 144,col 62)",
        "(line 145,col 5)-(line 145,col 62)",
        "(line 147,col 5)-(line 147,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 162,
      "end_line": 168,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 167,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 178,
      "end_line": 202,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 184,col 7)-(line 184,col 50)",
        "(line 186,col 7)-(line 190,col 7)",
        "(line 192,col 7)-(line 195,col 7)",
        "(line 197,col 7)-(line 200,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 218,
      "end_line": 281,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector (can be shorter than state vector)\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 227,col 5)",
        "(line 231,col 5)-(line 231,col 17)",
        "(line 232,col 5)-(line 232,col 25)",
        "(line 233,col 5)-(line 233,col 28)",
        "(line 234,col 5)-(line 239,col 5)",
        "(line 241,col 5)-(line 242,col 69)",
        "(line 243,col 5)-(line 245,col 5)",
        "(line 248,col 5)-(line 250,col 5)",
        "(line 251,col 5)-(line 251,col 42)",
        "(line 254,col 5)-(line 254,col 28)",
        "(line 255,col 5)-(line 258,col 5)",
        "(line 259,col 5)-(line 259,col 47)",
        "(line 263,col 5)-(line 263,col 75)",
        "(line 264,col 5)-(line 266,col 60)",
        "(line 267,col 5)-(line 267,col 42)",
        "(line 268,col 5)-(line 268,col 44)",
        "(line 269,col 5)-(line 271,col 5)",
        "(line 272,col 5)-(line 274,col 5)",
        "(line 275,col 5)-(line 277,col 5)",
        "(line 279,col 5)-(line 279,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 292,
      "end_line": 314,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 295,col 7)-(line 295,col 27)",
        "(line 296,col 7)-(line 304,col 7)",
        "(line 306,col 7)-(line 310,col 7)",
        "(line 312,col 7)-(line 312,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 317,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 323,
      "end_line": 326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 325,col 5)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 329,
      "end_line": 332,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 27)",
        "(line 331,col 5)-(line 331,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 337,
      "end_line": 339,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 344,
      "end_line": 346,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 19)"
      ]
    }
  ]
}