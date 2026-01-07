{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 345,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step (and hence the step should be reduced to ensure the\n * event occurs at a bound rather than inside the step).\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Maximal time interval between events handler checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Convergence threshold for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Upper limit in the iteration count for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Value of the events handler at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Variation direction around pending event.\n     *  (this is considered with respect to the integration direction)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextAction"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Next action indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventState.EventState(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 94,
      "end_line": 111,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 41)",
        "(line 97,col 9)-(line 97,col 50)",
        "(line 98,col 9)-(line 98,col 55)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 33)",
        "(line 105,col 9)-(line 105,col 34)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 33)",
        "(line 109,col 9)-(line 109,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventHandler()",
      "begin_line": 116,
      "end_line": 118,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getConvergence()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reinitializeBegin(double, double[])",
      "begin_line": 149,
      "end_line": 154,
      "comment": " Reinitialize the beginning of the step.\n     * @param tStart value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the step\n     * @param yStart array containing the current value of the state vector\n     * at the beginning of the step\n     * @exception EventException if the event handler\n     * value cannot be evaluated at the beginning of the step\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 152,col 39)",
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 167,
      "end_line": 274,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step (this implies the step should be\n     * rejected)\n     * @exception DerivativeException if the interpolator fails to\n     * compute the switching function somewhere within the step\n     * @exception EventException if the switching function\n     * cannot be evaluated\n     * @exception ConvergenceException if an event cannot be located\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.Anonymous-132f2e34-76b9-49e1-9c7b-fb3167a567b4.value(double)",
      "begin_line": 215,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 216,col 29)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventTime()",
      "begin_line": 281,
      "end_line": 283,
      "comment": " Get the occurrence time of the event triggered in the current\n     * step.\n     * @return occurrence time of the event triggered in the current\n     * step.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 293,
      "end_line": 308,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     * @exception EventException if the value of the event\n     * handler cannot be evaluated\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 15)",
        "(line 297,col 9)-(line 297,col 29)",
        "(line 299,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stop()",
      "begin_line": 314,
      "end_line": 316,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reset(double, double[])",
      "begin_line": 327,
      "end_line": 343,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     * @exception EventException if the state cannot be reseted by the event\n     * handler\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 34)",
        "(line 338,col 9)-(line 338,col 39)",
        "(line 340,col 9)-(line 341,col 62)"
      ]
    }
  ]
}