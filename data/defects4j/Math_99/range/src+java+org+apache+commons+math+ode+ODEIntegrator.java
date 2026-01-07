{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/ode/ODEIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ODEIntegrator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 117,
      "comment": "\n * This interface defines the common parts shared by integrators\n * for first and second order differential equations.\n * @see FirstOrderIntegrator\n * @see SecondOrderIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.getName()",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Get the name of the method.\n     * @return name of the method\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 49,
      "end_line": 49,
      "comment": " Add a step handler to this integrator.\n     * \u003cp\u003eThe handler will be called by the integrator for each accepted\n     * step.\u003c/p\u003e\n     * @param handler handler for the accepted steps\n     * @see #getStepHandlers()\n     * @see #clearStepHandlers()\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.getStepHandlers()",
      "begin_line": 57,
      "end_line": 57,
      "comment": " Get all the step handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addStepHandler(StepHandler)\n     * @see #clearStepHandlers()\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.clearStepHandlers()",
      "begin_line": 64,
      "end_line": 64,
      "comment": " Remove all the step handlers that have been added to the integrator.\n     * @see #addStepHandler(StepHandler)\n     * @see #getStepHandlers()\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 77,
      "end_line": 80,
      "comment": " Add an event handler to the integrator.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @see #getEventHandlers()\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.getEventHandlers()",
      "begin_line": 87,
      "end_line": 87,
      "comment": " Get all the event handlers that have been added to the integrator.\n     * @return an unmodifiable collection of the added events handlers\n     * @see #addEventHandler(EventHandler, double, double, int)\n     * @see #clearEventHandlers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.clearEventHandlers()",
      "begin_line": 93,
      "end_line": 93,
      "comment": " Remove all the event handlers that have been added to the integrator.\n     * @see #addEventHandler(EventHandler, double, double, int)\n     * @see #getEventHandlers()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.getCurrentStepStart()",
      "begin_line": 104,
      "end_line": 104,
      "comment": " Get the current value of the step start time t\u003csub\u003ei\u003c/sub\u003e.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the value of the current step that\n     * is attempted is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current value of the step start time t\u003csub\u003ei\u003c/sub\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ODEIntegrator.getCurrentSignedStepsize()",
      "begin_line": 115,
      "end_line": 115,
      "comment": " Get the current signed value of the integration stepsize.\n     * \u003cp\u003eThis method can be called during integration (typically by\n     * the object implementing the {@link FirstOrderDifferentialEquations\n     * differential equations} problem) if the signed value of the current stepsize\n     * that is tried is needed.\u003c/p\u003e\n     * \u003cp\u003eThe result is undefined if the method is called outside of\n     * calls to \u003ccode\u003eintegrate\u003c/code\u003e.\u003c/p\u003e\n     * @return current signed value of the stepsize\n     ",
      "child_ranges": []
    }
  ]
}