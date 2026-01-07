{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 371,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Maximal time interval between events handler checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Convergence threshold for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Upper limit in the iteration count for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Value of the events handler at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Variation direction around pending event.\n     *  (this is considered with respect to the integration direction)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextAction"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Next action indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventState.EventState(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 93,
      "end_line": 110,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 96,col 50)",
        "(line 97,col 9)-(line 97,col 59)",
        "(line 98,col 9)-(line 98,col 51)",
        "(line 101,col 9)-(line 101,col 39)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 33)",
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventHandler()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getConvergence()",
      "begin_line": 129,
      "end_line": 131,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 136,
      "end_line": 138,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reinitializeBegin(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 145,
      "end_line": 184,
      "comment": " Reinitialize the beginning of the step.\n     * @param interpolator valid for the current step\n     * @exception EventException if the event handler\n     * value cannot be evaluated at the beginning of the step\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 196,
      "end_line": 301,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step\n     * @exception MathUserException if the interpolator fails to\n     * compute the switching function somewhere within the step\n     * @exception EventException if the switching function\n     * cannot be evaluated\n     * @exception ConvergenceException if an event cannot be located\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.Anonymous-349d8069-eb96-436b-921a-49fe7840fae5.value(double)",
      "begin_line": 229,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 230,col 29)-(line 235,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventTime()",
      "begin_line": 307,
      "end_line": 309,
      "comment": " Get the occurrence time of the event triggered in the current step.\n     * @return occurrence time of the event triggered in the current\n     * step or positive infinity if no events are triggered\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 319,
      "end_line": 334,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     * @exception EventException if the value of the event\n     * handler cannot be evaluated\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 15)",
        "(line 323,col 9)-(line 323,col 29)",
        "(line 325,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stop()",
      "begin_line": 340,
      "end_line": 342,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reset(double, double[])",
      "begin_line": 353,
      "end_line": 369,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     * @exception EventException if the state cannot be reseted by the event\n     * handler\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 34)",
        "(line 364,col 9)-(line 364,col 39)",
        "(line 366,col 9)-(line 367,col 62)"
      ]
    }
  ]
}