{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 65,
      "end_line": 349,
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
      "begin_line": 102,
      "end_line": 120,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 16)",
        "(line 109,col 5)-(line 109,col 45)",
        "(line 110,col 5)-(line 110,col 45)",
        "(line 111,col 5)-(line 111,col 28)",
        "(line 113,col 5)-(line 113,col 55)",
        "(line 114,col 5)-(line 114,col 55)",
        "(line 115,col 5)-(line 115,col 38)",
        "(line 116,col 5)-(line 116,col 38)",
        "(line 118,col 5)-(line 118,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 132,
      "end_line": 150,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 16)",
        "(line 139,col 5)-(line 139,col 31)",
        "(line 140,col 5)-(line 140,col 31)",
        "(line 141,col 5)-(line 141,col 28)",
        "(line 143,col 5)-(line 143,col 35)",
        "(line 144,col 5)-(line 144,col 35)",
        "(line 145,col 5)-(line 145,col 62)",
        "(line 146,col 5)-(line 146,col 62)",
        "(line 148,col 5)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 163,
      "end_line": 169,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 164,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 179,
      "end_line": 203,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 185,col 7)-(line 185,col 50)",
        "(line 187,col 7)-(line 191,col 7)",
        "(line 193,col 7)-(line 196,col 7)",
        "(line 198,col 7)-(line 201,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 219,
      "end_line": 282,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector (can be shorter than state vector)\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 228,col 5)",
        "(line 232,col 5)-(line 232,col 17)",
        "(line 233,col 5)-(line 233,col 25)",
        "(line 234,col 5)-(line 234,col 28)",
        "(line 235,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 243,col 73)",
        "(line 244,col 5)-(line 246,col 5)",
        "(line 249,col 5)-(line 251,col 5)",
        "(line 252,col 5)-(line 252,col 42)",
        "(line 255,col 5)-(line 255,col 28)",
        "(line 256,col 5)-(line 259,col 5)",
        "(line 260,col 5)-(line 260,col 51)",
        "(line 264,col 5)-(line 264,col 83)",
        "(line 265,col 5)-(line 267,col 64)",
        "(line 268,col 5)-(line 268,col 50)",
        "(line 269,col 5)-(line 269,col 52)",
        "(line 270,col 5)-(line 272,col 5)",
        "(line 273,col 5)-(line 275,col 5)",
        "(line 276,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 280,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 293,
      "end_line": 315,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 296,col 7)-(line 296,col 27)",
        "(line 297,col 7)-(line 305,col 7)",
        "(line 307,col 7)-(line 311,col 7)",
        "(line 313,col 7)-(line 313,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 318,
      "end_line": 321,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 324,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 326,col 5)-(line 326,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 330,
      "end_line": 333,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 331,col 5)-(line 331,col 27)",
        "(line 332,col 5)-(line 332,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 338,
      "end_line": 340,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 19)"
      ]
    }
  ]
}