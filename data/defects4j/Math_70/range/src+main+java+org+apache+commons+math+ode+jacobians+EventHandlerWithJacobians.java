{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/jacobians/EventHandlerWithJacobians.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventHandlerWithJacobians",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "STOP"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Stop indicator.\n     * \u003cp\u003eThis value should be used as the return value of the {@link\n     * #eventOccurred eventOccurred} method when the integration should be\n     * stopped after the event ending the current step.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_STATE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Reset state indicator.\n     * \u003cp\u003eThis value should be used as the return value of the {@link\n     * #eventOccurred eventOccurred} method when the integration should\n     * go on after the event ending the current step, with a new state\n     * vector (which will be retrieved thanks to the {@link #resetState\n     * resetState} method).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "RESET_DERIVATIVES"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Reset derivatives indicator.\n     * \u003cp\u003eThis value should be used as the return value of the {@link\n     * #eventOccurred eventOccurred} method when the integration should\n     * go on after the event ending the current step, with a new derivatives\n     * vector (which will be retrieved thanks to the {@link\n     * org.apache.commons.math.ode.FirstOrderDifferentialEquations#computeDerivatives}\n     * method).\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CONTINUE"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Continue indicator.\n     * \u003cp\u003eThis value should be used as the return value of the {@link\n     * #eventOccurred eventOccurred} method when the integration should go\n     * on after the event ending the current step.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians.g(double, double[], double[][], double[][])",
      "begin_line": 126,
      "end_line": 127,
      "comment": " Compute the value of the switching function.\n\n     * \u003cp\u003eThe discrete events are generated when the sign of this\n     * switching function changes. The integrator will take care to change\n     * the stepsize in such a way these events occur exactly at step boundaries.\n     * The switching function must be continuous in its roots neighborhood\n     * (but not necessarily smooth), as the integrator will need to find its\n     * roots to locate precisely the events.\u003c/p\u003e\n\n     * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param dydy0 array containing the current value of the jacobian of\n     * the state vector with respect to initial state\n     * @param dydp array containing the current value of the jacobian of\n     * the state vector with respect to parameters\n     * @return value of the g switching function\n     * @exception EventException if the switching function cannot be evaluated\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians.eventOccurred(double, double[], double[][], double[][], boolean)",
      "begin_line": 196,
      "end_line": 197,
      "comment": " Handle an event and choose what to do next.\n\n     * \u003cp\u003eThis method is called when the integrator has accepted a step\n     * ending exactly on a sign change of the function, just \u003cem\u003ebefore\u003c/em\u003e\n     * the step handler itself is called (see below for scheduling). It\n     * allows the user to update his internal data to acknowledge the fact\n     * the event has been handled (for example setting a flag in the {@link\n     * org.apache.commons.math.ode.jacobians.ODEWithJacobians\n     * differential equations} to switch the derivatives computation in\n     * case of discontinuity), or to direct the integrator to either stop\n     * or continue integration, possibly with a reset state or derivatives.\u003c/p\u003e\n\n     * \u003cul\u003e\n     *   \u003cli\u003eif {@link #STOP} is returned, the step handler will be called\n     *   with the \u003ccode\u003eisLast\u003c/code\u003e flag of the {@link\n     *   org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians#handleStep(\n     *   StepInterpolatorWithJacobians, boolean) handleStep} method set to true and\n     *   the integration will be stopped,\u003c/li\u003e\n     *   \u003cli\u003eif {@link #RESET_STATE} is returned, the {@link #resetState\n     *   resetState} method will be called once the step handler has\n     *   finished its task, and the integrator will also recompute the\n     *   derivatives,\u003c/li\u003e\n     *   \u003cli\u003eif {@link #RESET_DERIVATIVES} is returned, the integrator\n     *   will recompute the derivatives,\n     *   \u003cli\u003eif {@link #CONTINUE} is returned, no specific action will\n     *   be taken (apart from having called this method) and integration\n     *   will continue.\u003c/li\u003e\n     * \u003c/ul\u003e\n\n     * \u003cp\u003eThe scheduling between this method and the {@link\n     * org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians\n     * StepHandlerWithJacobians} method {@link\n     * org.apache.commons.math.ode.jacobians.StepHandlerWithJacobians#handleStep(\n     * StepInterpolatorWithJacobians, boolean) handleStep(interpolator, isLast)}\n     * is to call this method first and \u003ccode\u003ehandleStep\u003c/code\u003e afterwards. This\n     * scheduling allows the integrator to pass \u003ccode\u003etrue\u003c/code\u003e as the\n     * \u003ccode\u003eisLast\u003c/code\u003e parameter to the step handler to make it aware the step\n     * will be the last one if this method returns {@link #STOP}. As the\n     * interpolator may be used to navigate back throughout the last step (as {@link\n     * org.apache.commons.math.ode.sampling.StepNormalizer StepNormalizer}\n     * does for example), user code called by this method and user\n     * code called by step handlers may experience apparently out of order values\n     * of the independent time variable. As an example, if the same user object\n     * implements both this {@link EventHandlerWithJacobians EventHandler} interface and the\n     * {@link org.apache.commons.math.ode.sampling.FixedStepHandler FixedStepHandler}\n     * interface, a \u003cem\u003eforward\u003c/em\u003e integration may call its\n     * \u003ccode\u003eeventOccurred\u003c/code\u003e method with t \u003d 10 first and call its\n     * \u003ccode\u003ehandleStep\u003c/code\u003e method with t \u003d 9 afterwards. Such out of order\n     * calls are limited to the size of the integration step for {@link\n     * org.apache.commons.math.ode.sampling.StepHandler variable step handlers} and\n     * to the size of the fixed step for {@link\n     * org.apache.commons.math.ode.sampling.FixedStepHandler fixed step handlers}.\u003c/p\u003e\n\n     * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param dydy0 array containing the current value of the jacobian of\n     * the state vector with respect to initial state\n     * @param dydp array containing the current value of the jacobian of\n     * the state vector with respect to parameters\n     * @param increasing if true, the value of the switching function increases\n     * when times increases around event (note that increase is measured with respect\n     * to physical time, not with respect to integration which may go backward in time)\n     * @return indication of what the integrator should do next, this\n     * value must be one of {@link #STOP}, {@link #RESET_STATE},\n     * {@link #RESET_DERIVATIVES} or {@link #CONTINUE}\n     * @exception EventException if the event occurrence triggers an error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.jacobians.EventHandlerWithJacobians.resetState(double, double[], double[][], double[][])",
      "begin_line": 221,
      "end_line": 222,
      "comment": " Reset the state prior to continue the integration.\n\n     * \u003cp\u003eThis method is called after the step handler has returned and\n     * before the next step is started, but only when {@link\n     * #eventOccurred} has itself returned the {@link #RESET_STATE}\n     * indicator. It allows the user to reset the state vector for the\n     * next step, without perturbing the step handler of the finishing\n     * step. If the {@link #eventOccurred} never returns the {@link\n     * #RESET_STATE} indicator, this function will never be called, and it is\n     * safe to leave its body empty.\u003c/p\u003e\n\n     * @param t current value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y array containing the current value of the state vector\n     * the new state should be put in the same array\n     * @param dydy0 array containing the current value of the jacobian of\n     * the state vector with respect to initial state, the new jacobian\n     * should be put in the same array\n     * @param dydp array containing the current value of the jacobian of\n     * the state vector with respect to parameters, the new jacobian\n     * should be put in the same array\n     * @exception EventException if the state cannot be reseted\n     ",
      "child_ranges": []
    }
  ]
}