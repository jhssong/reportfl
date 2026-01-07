{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/SwitchingFunctionsHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchingFunctionsHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.SwitchingFunctionsHandler()",
      "begin_line": 40,
      "end_line": 44,
      "comment": " Simple constructor.\n   * Create an empty handler\n   ",
      "child_ranges": [
        "(line 41,col 5)-(line 41,col 47)",
        "(line 42,col 5)-(line 42,col 23)",
        "(line 43,col 5)-(line 43,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Add a switching function.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   * @see #getSwitchingFunctions()\n   * @see #clearSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 60,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.getSwitchingFunctions()",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Get all the switching functions that have been added to the handler.\n   * @return an unmodifiable collection of the added switching functions\n   * @see #addSwitchingFunction(SwitchingFunction, double, double, int)\n   * @see #clearSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.clearSwitchingFunctions()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Remove all the switching functions that have been added to the handler.\n   * @see #addSwitchingFunction(SwitchingFunction, double, double, int)\n   * @see #getSwitchingFunctions()\n   ",
      "child_ranges": [
        "(line 77,col 7)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.isEmpty()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Check if the handler does not have any condition.\n   * @return true if handler is empty\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(org.apache.commons.math.ode.StepInterpolator)",
      "begin_line": 97,
      "end_line": 153,
      "comment": " Evaluate the impact of the proposed step on all handled\n   * switching functions.\n   * @param interpolator step interpolator for the proposed step\n   * @return true if at least one switching function triggers an event\n   * before the end of the proposed step (this implies the step should\n   * be rejected)\n   * @exception DerivativeException if the interpolator fails to\n   * compute the function somewhere within the step\n   * @exception IntegratorException if an event cannot be located\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 151,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.getEventTime()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " Get the occurrence time of the first event triggered in the\n   * last evaluated step.\n   * @return occurrence time of the first event triggered in the last\n   * evaluated step, or \u003c/code\u003eDouble.NaN\u003c/code\u003e if no event is\n   * triggered\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.stepAccepted(double, double[])",
      "begin_line": 174,
      "end_line": 183,
      "comment": " Inform the switching functions that the step has been accepted\n   * by the integrator.\n   * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n   * end of the step\n   * @param y array containing the current value of the state vector\n   * at the end of the step\n   * @exception IntegratorException if the value of one of the\n   * switching functions cannot be evaluated\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 182,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.stop()",
      "begin_line": 189,
      "end_line": 196,
      "comment": " Check if the integration should be stopped at the end of the\n   * current step.\n   * @return true if the integration should be stopped\n   ",
      "child_ranges": [
        "(line 190,col 5)-(line 194,col 5)",
        "(line 195,col 5)-(line 195,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.reset(double, double[])",
      "begin_line": 207,
      "end_line": 219,
      "comment": " Let the switching functions reset the state if they want.\n   * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n   * beginning of the next step\n   * @param y array were to put the desired state vector at the beginning\n   * of the next step\n   * @return true if the integrator should reset the derivatives too\n   * @exception IntegratorException if one of the switching functions\n   * that should reset the state fails to do it\n   ",
      "child_ranges": [
        "(line 208,col 7)-(line 218,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " Switching functions. "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " First active switching function. "
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " Initialization indicator. "
    }
  ]
}