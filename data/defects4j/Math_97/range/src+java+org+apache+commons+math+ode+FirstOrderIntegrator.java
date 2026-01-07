{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/FirstOrderIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FirstOrderIntegrator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getName()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.setStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getStepHandler()",
      "begin_line": 58,
      "end_line": 58,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 71,
      "end_line": 72,
      "comment": " Add an event handler to the integrator.\n   * @param handler event handler\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   * @see #getEventsHandlers()\n   * @see #clearEventsHandlers()\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getEventsHandlers()",
      "begin_line": 79,
      "end_line": 79,
      "comment": " Get all the events handlers that have been added to the integrator.\n   * @return an unmodifiable collection of the added events handlers\n   * @see #addEventHandler(EventHandler, double, double, int)\n   * @see #clearEventsHandlers()\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.clearEventsHandlers()",
      "begin_line": 85,
      "end_line": 85,
      "comment": " Remove all the events handlers that have been added to the integrator.\n   * @see #addEventHandler(EventHandler, double, double, int)\n   * @see #getEventsHandlers()\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 103,
      "end_line": 106,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getCurrentStepStart()",
      "begin_line": 117,
      "end_line": 117,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the value of the current step that\n   * is attempted is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.FirstOrderIntegrator.getCurrentSignedStepsize()",
      "begin_line": 128,
      "end_line": 128,
      "comment": " Get the current signed value of the integration stepsize.\n   * \u003cp\u003eThis method can be called during integration (typically by\n   * the object implementing the {@link FirstOrderDifferentialEquations\n   * differential equations} problem) if the signed value of the current stepsize\n   * that is tried is needed.\u003c/p\u003e\n   * \u003cp\u003eThe result is undefined if the method is called outside of\n   * calls to {@link #integrate}\u003c/p\u003e\n   * @return current signed value of the stepsize\n   ",
      "child_ranges": []
    }
  ]
}