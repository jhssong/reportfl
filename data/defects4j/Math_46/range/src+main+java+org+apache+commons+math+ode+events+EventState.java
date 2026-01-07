{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/events/EventState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventState",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 343,
      "comment": " This class handles the state for one {@link EventHandler\n * event handler} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the event handler\n * switching function should be checked. This class handles the state\n * of one handler during one integration step, with references to the\n * state at the end of the preceding step. This information is used to\n * decide if the handler should trigger an event or not during the\n * proposed step.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
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
      "type": "field",
      "varNames": [
        "solver"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Root-finding algorithm to use to detect state events. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.events.EventState.EventState(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 99,
      "end_line": 118,
      "comment": " Simple constructor.\n     * @param handler event handler\n     * @param maxCheckInterval maximal time interval between switching\n     * function checks (this interval prevents missing sign changes in\n     * case the integration steps becomes very large)\n     * @param convergence convergence threshold in the event time search\n     * @param maxIterationCount upper limit of the iteration count in\n     * the event time search\n     * @param solver Root-finding algorithm to use to detect state events\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 50)",
        "(line 104,col 9)-(line 104,col 59)",
        "(line 105,col 9)-(line 105,col 51)",
        "(line 106,col 9)-(line 106,col 40)",
        "(line 109,col 9)-(line 109,col 39)",
        "(line 110,col 9)-(line 110,col 39)",
        "(line 111,col 9)-(line 111,col 33)",
        "(line 112,col 9)-(line 112,col 34)",
        "(line 113,col 9)-(line 113,col 39)",
        "(line 114,col 9)-(line 114,col 39)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventHandler()",
      "begin_line": 123,
      "end_line": 125,
      "comment": " Get the underlying event handler.\n     * @return underlying event handler\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxCheckInterval()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " Get the maximal time interval between events handler checks.\n     * @return maximal time interval between events handler checks\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getConvergence()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Get the convergence threshold for event localization.\n     * @return convergence threshold for event localization\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getMaxIterationCount()",
      "begin_line": 144,
      "end_line": 146,
      "comment": " Get the upper limit in the iteration count for event localization.\n     * @return upper limit in the iteration count for event localization\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.reinitializeBegin(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 151,
      "end_line": 178,
      "comment": " Reinitialize the beginning of the step.\n     * @param interpolator valid for the current step\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 44)",
        "(line 154,col 9)-(line 154,col 45)",
        "(line 155,col 9)-(line 155,col 64)",
        "(line 156,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.evaluateStep(org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 186,
      "end_line": 277,
      "comment": " Evaluate the impact of the proposed step on the event handler.\n     * @param interpolator step interpolator for the proposed step\n     * @return true if the event handler triggers an event before\n     * the end of the proposed step\n     * @exception ConvergenceException if an event cannot be located\n     ",
      "child_ranges": [
        "(line 189,col 13)-(line 189,col 47)",
        "(line 190,col 13)-(line 190,col 60)",
        "(line 191,col 13)-(line 191,col 38)",
        "(line 192,col 13)-(line 195,col 13)",
        "(line 196,col 13)-(line 196,col 103)",
        "(line 197,col 13)-(line 197,col 36)",
        "(line 199,col 13)-(line 204,col 14)",
        "(line 206,col 13)-(line 206,col 27)",
        "(line 207,col 13)-(line 207,col 27)",
        "(line 208,col 13)-(line 270,col 13)",
        "(line 273,col 13)-(line 273,col 37)",
        "(line 274,col 13)-(line 274,col 42)",
        "(line 275,col 13)-(line 275,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.Anonymous-9bf4d118-6b39-4f13-8394-9c65640f1103.value(double)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 201,col 21)-(line 201,col 56)",
        "(line 202,col 21)-(line 202,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.getEventTime()",
      "begin_line": 283,
      "end_line": 287,
      "comment": " Get the occurrence time of the event triggered in the current step.\n     * @return occurrence time of the event triggered in the current\n     * step or infinity if no events are triggered\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.events.EventState.stepAccepted(double, double[])",
      "begin_line": 295,
      "end_line": 309,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * end of the step\n     * @param y array containing the current value of the state vector\n     * at the end of the step\n     ",
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
      "begin_line": 326,
      "end_line": 341,
      "comment": " Let the event handler reset the state if it wants.\n     * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n     * beginning of the next step\n     * @param y array were to put the desired state vector at the beginning\n     * of the next step\n     * @return true if the integrator should reset the derivatives too\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 34)",
        "(line 336,col 9)-(line 336,col 39)",
        "(line 338,col 9)-(line 339,col 62)"
      ]
    }
  ]
}