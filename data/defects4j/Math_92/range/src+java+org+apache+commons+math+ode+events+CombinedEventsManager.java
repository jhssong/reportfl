{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ode/events/CombinedEventsManager.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinedEventsManager",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "states"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Events states. "
    },
    {
      "type": "field",
      "varNames": [
        "first"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " First active event. "
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Initialization indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.CombinedEventsManager()",
      "begin_line": 56,
      "end_line": 60,
      "comment": " Simple constructor.\n     * Create an empty manager\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 50)",
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 73,
      "end_line": 77,
      "comment": " Add an events handler.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between events\n     * checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @see #getEventsHandlers()\n     * @see #clearEventsHandlers()\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.getEventsHandlers()",
      "begin_line": 85,
      "end_line": 91,
      "comment": " Get all the events handlers that have been added to the manager.\n     * @return an unmodifiable collection of the added event handlers\n     * @see #addEventHandler(EventHandler, double, double, int)\n     * @see #clearEventsHandlers()\n     * @see #getEventsStates()\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 70)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.clearEventsHandlers()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " Remove all the events handlers that have been added to the manager.\n     * @see #addEventHandler(EventHandler, double, double, int)\n     * @see #getEventsHandlers()\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.getEventsStates()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " Get all the events state wrapping the handlers that have been added to the manager.\n     * @return a collection of the events states\n     * @see #getEventsHandlers()\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.isEmpty()",
      "begin_line": 112,
      "end_line": 114,
      "comment": " Check if the manager does not manage any event handlers.\n     * @return true if manager is empty\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 126,
      "end_line": 182,
      "comment": " Evaluate the impact of the proposed step on all managed\n     * event handlers.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if at least one event handler triggers an event\n     * before the end of the proposed step (this implies the step should\n     * be rejected)\n     * @exception DerivativeException if the interpolator fails to\n     * compute the function somewhere within the step\n     * @exception IntegratorException if an event cannot be located\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.getEventTime()",
      "begin_line": 190,
      "end_line": 192,
      "comment": " Get the occurrence time of the first event triggered in the\n     * last evaluated step.\n     * @return occurrence time of the first event triggered in the last\n     * evaluated step, or \u003c/code\u003eDouble.NaN\u003c/code\u003e if no event is\n     * triggered\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.stepAccepted(double, double[])",
      "begin_line": 203,
      "end_line": 212,
      "comment": " Inform the event handlers that the step has been accepted\n     * by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     * @exception IntegratorException if the value of one of the\n     * events states cannot be evaluated\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.stop()",
      "begin_line": 218,
      "end_line": 225,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.CombinedEventsManager.reset(double, double[])",
      "begin_line": 236,
      "end_line": 249,
      "comment": " Let the event handlers reset the state if they want.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     * @exception IntegratorException if one of the events states\n     * that should reset the state fails to do it\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 248,col 9)"
      ]
    }
  ]
}