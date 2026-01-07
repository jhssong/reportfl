{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/SwitchingFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchingFunction",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STOP"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Stop indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should be\n   * stopped after the event ending the current step.\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_STATE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Reset state indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should\n   * go on after the event ending the current step, with a new state\n   * vector (which will be retrieved thanks to the {@link #resetState\n   * resetState} method).\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_DERIVATIVES"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Reset derivatives indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should\n   * go on after the event ending the current step, with a new derivatives\n   * vector (which will be retrieved thanks to the {@link\n   * FirstOrderDifferentialEquations#computeDerivatives} method).\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "CONTINUE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Continue indicator.\n   * \u003cp\u003eThis value should be used as the return value of the {@link\n   * #eventOccurred eventOccurred} method when the integration should go\n   * on after the event ending the current step.\u003c/p\u003e\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunction.g(double, double[])",
      "begin_line": 95,
      "end_line": 95,
      "comment": " Compute the value of the switching function.\n\n   * \u003cp\u003eDiscrete events are generated when the sign of this function\n   * changes, the integrator will take care to change the stepsize in\n   * such a way these events occur exactly at step boundaries. This\n   * function must be continuous (at least in its roots neighborhood),\n   * as the integrator will need to find its roots to locate the events.\u003c/p\u003e\n\n   * @param t current value of the independant \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * @return value of the g function\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunction.eventOccurred(double, double[])",
      "begin_line": 131,
      "end_line": 131,
      "comment": " Handle an event and choose what to do next.\n\n   * \u003cp\u003eThis method is called when the integrator has accepted a step\n   * ending exactly on a sign change of the function, just before the\n   * step handler itself is called. It allows the user to update his\n   * internal data to acknowledge the fact the event has been handled\n   * (for example setting a flag in the {@link\n   * FirstOrderDifferentialEquations differential equations} to switch\n   * the derivatives computation in case of discontinuity), or to\n   * direct the integrator to either stop or continue integration,\n   * possibly with a reset state or derivatives.\u003c/p\u003e\n\n   * \u003cul\u003e\n   *   \u003cli\u003eif {@link #STOP} is returned, the step handler will be called\n   *   with the \u003ccode\u003eisLast\u003c/code\u003e flag of the {@link\n   *   StepHandler#handleStep handleStep} method set to true and the\n   *   integration will be stopped,\u003c/li\u003e\n   *   \u003cli\u003eif {@link #RESET_STATE} is returned, the {@link #resetState\n   *   resetState} method will be called once the step handler has\n   *   finished its task, and the integrator will also recompute the\n   *   derivatives,\u003c/li\u003e\n   *   \u003cli\u003eif {@link #RESET_DERIVATIVES} is returned, the integrator\n   *   will recompute the derivatives,\n   *   \u003cli\u003eif {@link #CONTINUE} is returned, no specific action will\n   *   be taken (apart from having called this method) and integration\n   *   will continue.\u003c/li\u003e\n   * \u003c/ul\u003e\n\n   * @param t current value of the independant \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * @return indication of what the integrator should do next, this\n   * value must be one of {@link #STOP}, {@link #RESET_STATE},\n   * {@link #RESET_DERIVATIVES} or {@link #CONTINUE}\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunction.resetState(double, double[])",
      "begin_line": 148,
      "end_line": 148,
      "comment": " Reset the state prior to continue the integration.\n\n   * \u003cp\u003eThis method is called after the step handler has returned and\n   * before the next step is started, but only when {@link\n   * #eventOccurred} has itself returned the {@link #RESET_STATE}\n   * indicator. It allows the user to reset the state vector for the\n   * next step, without perturbing the step handler of the finishing\n   * step. If the {@link #eventOccurred} never returns the {@link\n   * #RESET_STATE} indicator, this function will never be called, and it is\n   * safe to leave its body empty.\u003c/p\u003e\n\n   * @param t current value of the independant \u003ci\u003etime\u003c/i\u003e variable\n   * @param y array containing the current value of the state vector\n   * the new state should be put in the same array\n   ",
      "child_ranges": []
    }
  ]
}