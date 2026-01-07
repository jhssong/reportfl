{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 346,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step (and hence the step should be reduced to ensure the\n * event occurs at a bound rather than inside the step).\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Maximal time interval between events handler checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Convergence threshold for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Upper limit in the iteration count for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Value of the events handler at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Variation direction around pending event.\n     *  (this is considered with respect to the integration direction)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextAction"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Next action indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventState.EventState(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 95,
      "end_line": 112,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 41)",
        "(line 98,col 9)-(line 98,col 50)",
        "(line 99,col 9)-(line 99,col 59)",
        "(line 100,col 9)-(line 100,col 51)",
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 33)",
        "(line 106,col 9)-(line 106,col 34)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 33)",
        "(line 110,col 9)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventHandler()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getConvergence()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 138,
      "end_line": 140,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reinitializeBegin(double, double[])",
      "begin_line": 150,
      "end_line": 155,
      "comment": " Reinitialize the beginning of the step.\n     * @param tStart value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the step\n     * @param yStart array containing the current value of the state vector\n     * at the beginning of the step\n     * @exception EventException if the event handler\n     * value cannot be evaluated at the beginning of the step\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 20)",
        "(line 153,col 9)-(line 153,col 39)",
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 168,
      "end_line": 275,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step (this implies the step should be\n     * rejected)\n     * @exception DerivativeException if the interpolator fails to\n     * compute the switching function somewhere within the step\n     * @exception EventException if the switching function\n     * cannot be evaluated\n     * @exception ConvergenceException if an event cannot be located\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 273,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.Anonymous-d2aeaf63-f04f-4ae5-8d9b-43e2c780a785.value(double)",
      "begin_line": 216,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 217,col 29)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventTime()",
      "begin_line": 282,
      "end_line": 284,
      "comment": " Get the occurrence time of the event triggered in the current\n     * step.\n     * @return occurrence time of the event triggered in the current\n     * step.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 294,
      "end_line": 309,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     * @exception EventException if the value of the event\n     * handler cannot be evaluated\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 15)",
        "(line 298,col 9)-(line 298,col 29)",
        "(line 300,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stop()",
      "begin_line": 315,
      "end_line": 317,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reset(double, double[])",
      "begin_line": 328,
      "end_line": 344,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     * @exception EventException if the state cannot be reseted by the event\n     * handler\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 34)",
        "(line 339,col 9)-(line 339,col 39)",
        "(line 341,col 9)-(line 342,col 62)"
      ]
    }
  ]
}