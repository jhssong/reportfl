{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 47,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.RungeKuttaIntegrator(double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double)",
      "begin_line": 59,
      "end_line": 70,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 24)",
        "(line 63,col 5)-(line 63,col 24)",
        "(line 64,col 5)-(line 64,col 24)",
        "(line 65,col 5)-(line 65,col 32)",
        "(line 66,col 5)-(line 66,col 27)",
        "(line 67,col 5)-(line 67,col 53)",
        "(line 68,col 5)-(line 68,col 54)",
        "(line 69,col 5)-(line 69,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getName()",
      "begin_line": 75,
      "end_line": 75,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 82,
      "end_line": 84,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getStepHandler()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 104,
      "end_line": 109,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   * @see #getSwitchingFunctions()\n   * @see #clearSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getSwitchingFunctions()",
      "begin_line": 116,
      "end_line": 118,
      "comment": " Get all the switching functions that have been added to the integrator.\n   * @return an unmodifiable collection of the added switching functions\n   * @see #addSwitchingFunction(SwitchingFunction, double, double, int)\n   * @see #clearSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 117,col 7)-(line 117,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.clearSwitchingFunctions()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " Remove all the switching functions that have been added to the integrator.\n   * @see #addSwitchingFunction(SwitchingFunction, double, double, int)\n   * @see #getSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 125,col 7)-(line 125,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 136,
      "end_line": 159,
      "comment": " Perform some sanity checks on the integration parameters.\n   * @param equations differential equations set\n   * @param t0 start time\n   * @param y0 state vector at t0\n   * @param t target time for the integration\n   * @param y placeholder where to put the state vector\n   * @exception IntegratorException if some inconsistency is detected\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 146,col 5)",
        "(line 147,col 5)-(line 154,col 7)",
        "(line 155,col 5)-(line 158,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 177,
      "end_line": 291,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 42)",
        "(line 183,col 5)-(line 183,col 31)",
        "(line 186,col 5)-(line 186,col 30)",
        "(line 187,col 5)-(line 189,col 5)",
        "(line 190,col 5)-(line 190,col 44)",
        "(line 191,col 5)-(line 193,col 5)",
        "(line 194,col 5)-(line 194,col 42)",
        "(line 197,col 5)-(line 197,col 42)",
        "(line 198,col 5)-(line 204,col 5)",
        "(line 205,col 5)-(line 205,col 31)",
        "(line 208,col 5)-(line 208,col 76)",
        "(line 209,col 5)-(line 209,col 30)",
        "(line 210,col 5)-(line 210,col 19)",
        "(line 211,col 5)-(line 211,col 34)",
        "(line 212,col 5)-(line 212,col 20)",
        "(line 213,col 5)-(line 287,col 5)",
        "(line 289,col 5)-(line 289,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getCurrentStepStart()",
      "begin_line": 302,
      "end_line": 304,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the value of the current step that\n   * is attempted is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getCurrentSignedStepsize()",
      "begin_line": 315,
      "end_line": 317,
      "comment": " Get the current signed value of the integration stepsize.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the signed value of the current stepsize\n   * that is tried is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current signed value of the stepsize\n   ",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.resetInternalState()",
      "begin_line": 320,
      "end_line": 323,
      "comment": " Reset internal state to dummy values. ",
      "child_ranges": [
        "(line 321,col 5)-(line 321,col 27)",
        "(line 322,col 5)-(line 322,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": " Integration step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Switching functions handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Current stepsize. "
    }
  ]
}