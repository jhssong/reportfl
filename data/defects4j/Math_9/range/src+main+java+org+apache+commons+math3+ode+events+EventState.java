{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 383,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Event handler. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Maximal time interval between events handler checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Convergence threshold for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Upper limit in the iteration count for event localization. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Value of the events handler at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Variation direction around pending event.\n     *  (this is considered with respect to the integration direction)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nextAction"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Next action indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Root-finding algorithm to use to detect state events. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventState.EventState(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 100,
      "end_line": 119,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @param solver Root-finding algorithm to use to detect state events\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 104,col 50)",
        "(line 105,col 9)-(line 105,col 59)",
        "(line 106,col 9)-(line 106,col 51)",
        "(line 107,col 9)-(line 107,col 40)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 33)",
        "(line 113,col 9)-(line 113,col 34)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 33)",
        "(line 117,col 9)-(line 117,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getEventHandler()",
      "begin_line": 124,
      "end_line": 126,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getConvergence()",
      "begin_line": 138,
      "end_line": 140,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 145,
      "end_line": 147,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.reinitializeBegin(org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 154,
      "end_line": 182,
      "comment": " Reinitialize the beginning of the step.\n     * @param interpolator valid for the current step\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 44)",
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 64)",
        "(line 160,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.evaluateStep(org.apache.commons.math3.ode.sampling.StepInterpolator)",
      "begin_line": 192,
      "end_line": 292,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     * @exception NoBracketingException if the event cannot be bracketed\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.Anonymous-c898727e-3b07-4f6b-a2e3-229f4e172bf2.value(double)",
      "begin_line": 207,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 208,col 21)-(line 213,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.getEventTime()",
      "begin_line": 298,
      "end_line": 302,
      "comment": " Get the occurrence time of the event triggered in the current step.\n     * @return occurrence time of the event triggered in the current\n     * step or infinity if no events are triggered\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 310,
      "end_line": 324,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 15)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 315,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.stop()",
      "begin_line": 330,
      "end_line": 332,
      "comment": " Check if the integration should be stopped at the end of the\n     * current step.\n     * @return true if the integration should be stopped\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.reset(double, double[])",
      "begin_line": 341,
      "end_line": 356,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 34)",
        "(line 351,col 9)-(line 351,col 39)",
        "(line 353,col 9)-(line 354,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalMaxCountExceededException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 359,
      "end_line": 381,
      "comment": " Local wrapper to propagate exceptions. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "wrapped"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Wrapped exception. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.events.EventState.LocalMaxCountExceededException.LocalMaxCountExceededException(org.apache.commons.math3.exception.MaxCountExceededException)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Simple constructor.\n         * @param exception exception to wrap\n         ",
      "child_ranges": [
        "(line 371,col 13)-(line 371,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.events.EventState.LocalMaxCountExceededException.getException()",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Get the wrapped exception.\n         * @return wrapped exception\n         ",
      "child_ranges": [
        "(line 378,col 13)-(line 378,col 27)"
      ]
    }
  ]
}