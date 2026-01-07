{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 54,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 68,
      "end_line": 86,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 16)",
        "(line 75,col 5)-(line 75,col 41)",
        "(line 76,col 5)-(line 76,col 41)",
        "(line 77,col 5)-(line 77,col 28)",
        "(line 79,col 5)-(line 79,col 55)",
        "(line 80,col 5)-(line 80,col 55)",
        "(line 81,col 5)-(line 81,col 38)",
        "(line 82,col 5)-(line 82,col 38)",
        "(line 84,col 5)-(line 84,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 98,
      "end_line": 116,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 16)",
        "(line 105,col 5)-(line 105,col 31)",
        "(line 106,col 5)-(line 106,col 31)",
        "(line 107,col 5)-(line 107,col 28)",
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 35)",
        "(line 111,col 5)-(line 111,col 62)",
        "(line 112,col 5)-(line 112,col 62)",
        "(line 114,col 5)-(line 114,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 129,
      "end_line": 135,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 134,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 145,
      "end_line": 167,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 151,col 7)-(line 151,col 50)",
        "(line 153,col 7)-(line 158,col 7)",
        "(line 160,col 7)-(line 165,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 183,
      "end_line": 246,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 192,col 5)",
        "(line 196,col 5)-(line 196,col 17)",
        "(line 197,col 5)-(line 197,col 25)",
        "(line 198,col 5)-(line 198,col 28)",
        "(line 199,col 5)-(line 204,col 5)",
        "(line 206,col 5)-(line 207,col 69)",
        "(line 208,col 5)-(line 210,col 5)",
        "(line 213,col 5)-(line 215,col 5)",
        "(line 216,col 5)-(line 216,col 42)",
        "(line 219,col 5)-(line 219,col 28)",
        "(line 220,col 5)-(line 223,col 5)",
        "(line 224,col 5)-(line 224,col 47)",
        "(line 228,col 5)-(line 228,col 75)",
        "(line 229,col 5)-(line 231,col 60)",
        "(line 232,col 5)-(line 232,col 42)",
        "(line 233,col 5)-(line 233,col 44)",
        "(line 234,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 239,col 5)",
        "(line 240,col 5)-(line 242,col 5)",
        "(line 244,col 5)-(line 244,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 257,
      "end_line": 279,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 260,col 7)-(line 260,col 27)",
        "(line 261,col 7)-(line 269,col 7)",
        "(line 271,col 7)-(line 275,col 7)",
        "(line 277,col 7)-(line 277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 282,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 288,
      "end_line": 291,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 294,
      "end_line": 297,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 27)",
        "(line 296,col 5)-(line 296,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 302,
      "end_line": 304,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " Allowed relative vectorial error. "
    }
  ]
}