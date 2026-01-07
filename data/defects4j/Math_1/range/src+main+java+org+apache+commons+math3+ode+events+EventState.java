{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 416,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Maximal time interval between events handler checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Convergence threshold for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Upper limit in the iteration count for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "expandable"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Equation being integrated. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Value of the events handler at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Variation direction around pending event.\n     *  (this is considered with respect to the integration direction)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextAction"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Next action indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Root-finding algorithm to use to detect state events. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventState.EventState(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 105,
      "end_line": 125,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @param solver Root-finding algorithm to use to detect state events\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 41)",
        "(line 109,col 9)-(line 109,col 50)",
        "(line 110,col 9)-(line 110,col 59)",
        "(line 111,col 9)-(line 111,col 51)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 33)",
        "(line 123,col 9)-(line 123,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getEventHandler()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.setExpandable(org.apache.commons.math3.ode.ExpandableStatefulODE)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Set the equation.\n     * @param expandable equation being integrated\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getConvergence()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.reinitializeBegin(org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 167,
      "end_line": 195,
      "comment": " Reinitialize the beginning of the step.\n     * @param interpolator valid for the current step\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 44)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 172,col 59)",
        "(line 173,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getCompleteState(org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 201,
      "end_line": 215,
      "comment": " Get the complete state (primary and secondary).\n     * @param interpolator interpolator to use\n     * @return complete state\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 77)",
        "(line 205,col 9)-(line 206,col 67)",
        "(line 207,col 9)-(line 207,col 22)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.evaluateStep(org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 225,
      "end_line": 325,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     * @exception NoBracketingException if the event cannot be bracketed\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.Anonymous-0f2ec5bd-8f79-4c56-80c0-e369fe066100.value(double)",
      "begin_line": 240,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 241,col 21)-(line 246,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getEventTime()",
      "begin_line": 331,
      "end_line": 335,
      "comment": " Get the occurrence time of the event triggered in the current step.\n     * @return occurrence time of the event triggered in the current\n     * step or infinity if no events are triggered\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 343,
      "end_line": 357,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 15)",
        "(line 346,col 9)-(line 346,col 29)",
        "(line 348,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.stop()",
      "begin_line": 363,
      "end_line": 365,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.reset(double, double[])",
      "begin_line": 374,
      "end_line": 389,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 34)",
        "(line 384,col 9)-(line 384,col 39)",
        "(line 386,col 9)-(line 387,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalMaxCountExceededException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 392,
      "end_line": 414,
      "comment": " Local wrapper to propagate exceptions. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "wrapped"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " Wrapped exception. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventState.LocalMaxCountExceededException.LocalMaxCountExceededException(org.apache.commons.math3.exception.MaxCountExceededException)",
      "begin_line": 403,
      "end_line": 405,
      "comment": " Simple constructor.\n         * @param exception exception to wrap\n         ",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.LocalMaxCountExceededException.getException()",
      "begin_line": 410,
      "end_line": 412,
      "comment": " Get the wrapped exception.\n         * @return wrapped exception\n         ",
      "child_ranges": [
        "(line 411,col 13)-(line 411,col 27)"
      ]
    }
  ]
}