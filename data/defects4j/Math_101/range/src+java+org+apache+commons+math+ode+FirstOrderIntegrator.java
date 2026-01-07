{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/FirstOrderIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegrator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getName()",
      "begin_line": 40,
      "end_line": 40,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 47,
      "end_line": 47,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getStepHandler()",
      "begin_line": 52,
      "end_line": 52,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 63,
      "end_line": 66,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 84,
      "end_line": 87,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getCurrentStepStart()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the value of the current step that\n   * is attempted is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getCurrentSignedStepsize()",
      "begin_line": 109,
      "end_line": 109,
      "comment": " Get the current signed value of the integration stepsize.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the signed value of the current stepsize\n   * that is tried is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current signed value of the stepsize\n   ",
      "child_ranges": []
    }
  ]
}