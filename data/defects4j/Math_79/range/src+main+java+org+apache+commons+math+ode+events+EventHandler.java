{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/events/EventHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventHandler",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STOP"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Stop indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should be\n   * stopped after the event ending the current step.\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_STATE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Reset state indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should\n   * go on after the event ending the current step, with a new state\n   * vector (which will be retrieved thanks to the {@link #resetState\n   * resetState} method).\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_DERIVATIVES"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Reset derivatives indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should\n   * go on after the event ending the current step, with a new derivatives\n   * vector (which will be retrieved thanks to the {@link\n   * org.apache.commons.math.ode.FirstOrderDifferentialEquations#computeDerivatives}\n   * method).\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "CONTINUE"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Continue indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should go\n   * on after the event ending the current step.\u003c/p\u003e\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventHandler.g(double, double[])",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Compute the value of the switching function.\n\n   * \u003cp\u003eThe discrete events are generated when the sign of this\n   * switching function changes. The integrator will take care to change\n   * the stepsize in such a way these events occur exactly at step boundaries.\n   * The switching function must be continuous in its roots neighborhood\n   * (but not necessarily smooth), as the integrator will need to find its\n   * roots to locate precisely the events.\u003c/p\u003e\n\n   * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * @return value of the g switching function\n   * @exception EventException if the switching function cannot be evaluated\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventHandler.eventOccurred(double, double[], boolean)",
      "begin_line": 139,
      "end_line": 139,
      "comment": " Handle an event and choose what to do next.\n\n   * \u003cp\u003eThis method is called when the integrator has accepted a step\n   * ending exactly on a sign change of the function, just before the\n   * step handler itself is called. It allows the user to update his\n   * internal data to acknowledge the fact the event has been handled\n   * (for example setting a flag in the {@link\n   * org.apache.commons.math.ode.FirstOrderDifferentialEquations\n   * differential equations} to switch the derivatives computation in\n   * case of discontinuity), or to direct the integrator to either stop\n   * or continue integration, possibly with a reset state or derivatives.\u003c/p\u003e\n\n   * \u003cul\u003e\n   *   \u003cli\u003eif {@link #STOP} is returned, the step handler will be called\n   *   with the \u003ccode\u003eisLast\u003c/code\u003e flag of the {@link\n   *   org.apache.commons.math.ode.sampling.StepHandler#handleStep handleStep}\n   *   method set to true and the integration will be stopped,\u003c/li\u003e\n   *   \u003cli\u003eif {@link #RESET_STATE} is returned, the {@link #resetState\n   *   resetState} method will be called once the step handler has\n   *   finished its task, and the integrator will also recompute the\n   *   derivatives,\u003c/li\u003e\n   *   \u003cli\u003eif {@link #RESET_DERIVATIVES} is returned, the integrator\n   *   will recompute the derivatives,\n   *   \u003cli\u003eif {@link #CONTINUE} is returned, no specific action will\n   *   be taken (apart from having called this method) and integration\n   *   will continue.\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * @param increasing if true, the value of the switching function increases\n   * when times increases around event (note that increase is measured with respect\n   * to physical time, not with respect to integration which may go backward in time)\n   * @return indication of what the integrator should do next, this\n   * value must be one of {@link #STOP}, {@link #RESET_STATE},\n   * {@link #RESET_DERIVATIVES} or {@link #CONTINUE}\n   * @exception EventException if the event occurrence triggers an error\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventHandler.resetState(double, double[])",
      "begin_line": 157,
      "end_line": 157,
      "comment": " Reset the state prior to continue the integration.\n\n   * \u003cp\u003eThis method is called after the step handler has returned and\n   * before the next step is started, but only when {@link\n   * #eventOccurred} has itself returned the {@link #RESET_STATE}\n   * indicator. It allows the user to reset the state vector for the\n   * next step, without perturbing the step handler of the finishing\n   * step. If the {@link #eventOccurred} never returns the {@link\n   * #RESET_STATE} indicator, this function will never be called, and it is\n   * safe to leave its body empty.\u003c/p\u003e\n\n   * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * the new state should be put in the same array\n   * @exception EventException if the state cannot be reseted\n   ",
      "child_ranges": []
    }
  ]
}