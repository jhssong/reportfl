{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/ode/nonstiff/AdaptiveStepsizeIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AdaptiveStepsizeIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 54,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double, double)",
      "begin_line": 70,
      "end_line": 88,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 16)",
        "(line 77,col 5)-(line 77,col 41)",
        "(line 78,col 5)-(line 78,col 41)",
        "(line 79,col 5)-(line 79,col 28)",
        "(line 81,col 5)-(line 81,col 55)",
        "(line 82,col 5)-(line 82,col 55)",
        "(line 83,col 5)-(line 83,col 38)",
        "(line 84,col 5)-(line 84,col 38)",
        "(line 86,col 5)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.AdaptiveStepsizeIntegrator(java.lang.String, double, double, double[], double[])",
      "begin_line": 100,
      "end_line": 118,
      "comment": " Build an integrator with the given stepsize bounds.\n   * The default step handler does nothing.\n   * @param name name of the method\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 16)",
        "(line 107,col 5)-(line 107,col 31)",
        "(line 108,col 5)-(line 108,col 31)",
        "(line 109,col 5)-(line 109,col 28)",
        "(line 111,col 5)-(line 111,col 35)",
        "(line 112,col 5)-(line 112,col 35)",
        "(line 113,col 5)-(line 113,col 54)",
        "(line 114,col 5)-(line 114,col 54)",
        "(line 116,col 5)-(line 116,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.setInitialStepSize(double)",
      "begin_line": 131,
      "end_line": 137,
      "comment": " Set the initial step size.\n   * \u003cp\u003eThis method allows the user to specify an initial positive\n   * step size instead of letting the integrator guess it by\n   * itself. If this method is not called before integration is\n   * started, the initial step size will be estimated by the\n   * integrator.\u003c/p\u003e\n   * @param initialStepSize initial step size to use (must be positive even\n   * for backward integration ; providing a negative value or a value\n   * outside of the min/max step interval will lead the integrator to\n   * ignore the value and compute the initial step size by itself)\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 136,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 147,
      "end_line": 169,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 153,col 7)-(line 153,col 50)",
        "(line 155,col 7)-(line 160,col 7)",
        "(line 162,col 7)-(line 167,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.initializeStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, boolean, int, double[], double, double[], double[], double[], double[])",
      "begin_line": 185,
      "end_line": 248,
      "comment": " Initialize the integration step.\n   * @param equations differential equations set\n   * @param forward forward integration indicator\n   * @param order order of the method\n   * @param scale scaling vector for the state vector\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param yDot0 first time derivative of y0\n   * @param y1 work array for a state vector\n   * @param yDot1 work array for the first time derivative of y1\n   * @return first integration step\n   * @exception DerivativeException this exception is propagated to\n   * the caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 194,col 5)",
        "(line 198,col 5)-(line 198,col 17)",
        "(line 199,col 5)-(line 199,col 25)",
        "(line 200,col 5)-(line 200,col 28)",
        "(line 201,col 5)-(line 206,col 5)",
        "(line 208,col 5)-(line 209,col 69)",
        "(line 210,col 5)-(line 212,col 5)",
        "(line 215,col 5)-(line 217,col 5)",
        "(line 218,col 5)-(line 218,col 52)",
        "(line 221,col 5)-(line 221,col 28)",
        "(line 222,col 5)-(line 225,col 5)",
        "(line 226,col 5)-(line 226,col 47)",
        "(line 230,col 5)-(line 230,col 75)",
        "(line 231,col 5)-(line 233,col 60)",
        "(line 234,col 5)-(line 234,col 42)",
        "(line 235,col 5)-(line 235,col 44)",
        "(line 236,col 5)-(line 238,col 5)",
        "(line 239,col 5)-(line 241,col 5)",
        "(line 242,col 5)-(line 244,col 5)",
        "(line 246,col 5)-(line 246,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.filterStep(double, boolean, boolean)",
      "begin_line": 259,
      "end_line": 281,
      "comment": " Filter the integration step.\n   * @param h signed step\n   * @param forward forward integration indicator\n   * @param acceptSmall if true, steps smaller than the minimal value\n   * are silently increased up to this value, if false such small\n   * steps generate an exception\n   * @return a bounded integration step (h if no bound is reach, or a bounded value)\n   * @exception IntegratorException if the step is too small and acceptSmall is false\n   ",
      "child_ranges": [
        "(line 262,col 7)-(line 262,col 27)",
        "(line 263,col 7)-(line 271,col 7)",
        "(line 273,col 7)-(line 277,col 7)",
        "(line 279,col 7)-(line 279,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 284,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getCurrentStepStart()",
      "begin_line": 290,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 5)-(line 292,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.resetInternalState()",
      "begin_line": 296,
      "end_line": 299,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 297,col 5)-(line 297,col 27)",
        "(line 298,col 5)-(line 298,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMinStep()",
      "begin_line": 304,
      "end_line": 306,
      "comment": " Get the minimal step.\n   * @return minimal step\n   ",
      "child_ranges": [
        "(line 305,col 5)-(line 305,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator.getMaxStep()",
      "begin_line": 311,
      "end_line": 313,
      "comment": " Get the maximal step.\n   * @return maximal step\n   ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 19)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "minStep"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Minimal step. "
    },
    {
      "type": "field",
      "varNames": [
        "maxStep"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Maximal step. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStep"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " User supplied initial step. "
    },
    {
      "type": "field",
      "varNames": [
        "scalAbsoluteTolerance"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Allowed absolute scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "scalRelativeTolerance"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Allowed relative scalar error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecAbsoluteTolerance"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Allowed absolute vectorial error. "
    },
    {
      "type": "field",
      "varNames": [
        "vecRelativeTolerance"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Allowed relative vectorial error. "
    }
  ]
}