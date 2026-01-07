{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/SwitchingFunctionsHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchingFunctionsHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.SwitchingFunctionsHandler()",
      "begin_line": 39,
      "end_line": 43,
      "comment": " Simple constructor.\n   * Create an empty handler\n   ",
      "child_ranges": [
        "(line 40,col 5)-(line 40,col 34)",
        "(line 41,col 5)-(line 41,col 23)",
        "(line 42,col 5)-(line 42,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.add(org.apache.commons.math.ode.SwitchingFunction, double, double)",
      "begin_line": 52,
      "end_line": 55,
      "comment": " Add a switching function.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   ",
      "child_ranges": [
        "(line 54,col 5)-(line 54,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.isEmpty()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Check if the handler does not have any condition.\n   * @return true if handler is empty\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.evaluateStep(org.apache.commons.math.ode.StepInterpolator)",
      "begin_line": 71,
      "end_line": 125,
      "comment": " Evaluate the impact of the proposed step on all handled\n   * switching functions.\n   * @param interpolator step interpolator for the proposed step\n   * @return true if at least one switching function triggers an event\n   * before the end of the proposed step (this implies the step should\n   * be rejected)\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 123,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.getEventTime()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " Get the occurrence time of the first event triggered in the\n   * last evaluated step.\n   * @return occurrence time of the first event triggered in the last\n   * evaluated step, or \u003c/code\u003eDouble.NaN\u003c/code\u003e if no event is\n   * triggered\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.stepAccepted(double, double[])",
      "begin_line": 144,
      "end_line": 148,
      "comment": " Inform the switching functions that the step has been accepted\n   * by the integrator.\n   * @param t value of the independant \u003ci\u003etime\u003c/i\u003e variable at the\n   * end of the step\n   * @param y array containing the current value of the state vector\n   * at the end of the step\n   ",
      "child_ranges": [
        "(line 145,col 5)-(line 147,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.stop()",
      "begin_line": 154,
      "end_line": 161,
      "comment": " Check if the integration should be stopped at the end of the\n   * current step.\n   * @return true if the integration should be stopped\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchingFunctionsHandler.reset(double, double[])",
      "begin_line": 170,
      "end_line": 178,
      "comment": " Let the switching functions reset the state if they want.\n   * @param t value of the independant \u003ci\u003etime\u003c/i\u003e variable at the\n   * beginning of the next step\n   * @param y array were to put the desired state vector at the beginning\n   * of the next step\n   * @return true if the integrator should reset the derivatives too\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 37)",
        "(line 172,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 177,col 28)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "functions"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Switching functions. "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " First active switching function. "
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Initialization indicator. "
    }
  ]
}