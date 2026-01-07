{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/SwitchState.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchState",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 282,
      "comment": " This class handles the state for one {@link SwitchingFunction\n * switching function} during integration steps.\n *\n * \u003cp\u003eEach time the integrator proposes a step, the switching function\n * should be checked. This class handles the state of one function\n * during one integration step, with references to the state at the\n * end of the preceding step. This information is used to determine if\n * the function should trigger an event or not during the proposed\n * step (and hence the step should be reduced to ensure the event\n * occurs at a bound rather than inside the step).\u003c/p\u003e\n *\n * @version $Id: SwitchState.java 1705 2006-09-17 19:57:39Z luc $\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "function"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Switching function. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCheckInterval"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Maximal time interval between switching function checks. "
    },
    {
      "type": "field",
      "varNames": [
        "convergence"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Convergence threshold for event localisation. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterationCount"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Upper limit in the iteration count for event localisation. "
    },
    {
      "type": "field",
      "varNames": [
        "t0"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Time at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Value of the switching function at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "g0Positive"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Simulated sign of g0 (we cheat when crossing events). "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEvent"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Indicator of event expected during the step. "
    },
    {
      "type": "field",
      "varNames": [
        "pendingEventTime"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Occurrence time of the pending event. "
    },
    {
      "type": "field",
      "varNames": [
        "previousEventTime"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Occurrence time of the previous event. "
    },
    {
      "type": "field",
      "varNames": [
        "increasing"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Variation direction around pending event.\n   *  (this is considered with respect to the integration direction)\n   "
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
      "signature": "org.apache.commons.math.ode.SwitchState.SwitchState(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 94,
      "end_line": 111,
      "comment": " Simple constructor.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 38)",
        "(line 97,col 5)-(line 97,col 46)",
        "(line 98,col 5)-(line 98,col 51)",
        "(line 99,col 5)-(line 99,col 47)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 35)",
        "(line 104,col 5)-(line 104,col 29)",
        "(line 105,col 5)-(line 105,col 30)",
        "(line 106,col 5)-(line 106,col 35)",
        "(line 107,col 5)-(line 107,col 35)",
        "(line 108,col 5)-(line 108,col 29)",
        "(line 109,col 5)-(line 109,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.reinitializeBegin(double, double[])",
      "begin_line": 121,
      "end_line": 126,
      "comment": " Reinitialize the beginning of the step.\n   * @param t0 value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n   * beginning of the step\n   * @param y0 array containing the current value of the state vector\n   * at the beginning of the step\n   * @exception FunctionEvaluationException if the switching function\n   * value cannot be evaluated at the beginning of the step\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 123,col 17)",
        "(line 124,col 5)-(line 124,col 28)",
        "(line 125,col 5)-(line 125,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.evaluateStep(org.apache.commons.math.ode.StepInterpolator)",
      "begin_line": 139,
      "end_line": 214,
      "comment": " Evaluate the impact of the proposed step on the switching function.\n   * @param interpolator step interpolator for the proposed step\n   * @return true if the switching function triggers an event before\n   * the end of the proposed step (this implies the step should be\n   * rejected)\n   * @exception DerivativeException if the interpolator fails to\n   * compute the function somewhere within the step\n   * @exception FunctionEvaluationException if the switching function\n   * cannot be evaluated\n   * @exception ConvergenceException if an event cannot be located\n   ",
      "child_ranges": [
        "(line 142,col 5)-(line 212,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.Anonymous-b0b27150-8469-4955-a935-5412b756e7e3.value(double)",
      "begin_line": 166,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 167,col 19)-(line 172,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.getEventTime()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " Get the occurrence time of the event triggered in the current\n   * step.\n   * @return occurrence time of the event triggered in the current\n   * step.\n   ",
      "child_ranges": [
        "(line 222,col 5)-(line 222,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.stepAccepted(double, double[])",
      "begin_line": 233,
      "end_line": 248,
      "comment": " Acknowledge the fact the step has been accepted by the integrator.\n   * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n   * end of the step\n   * @param y array containing the current value of the state vector\n   * at the end of the step\n   * @exception FunctionEvaluationException if the value of the switching\n   * function cannot be evaluated\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 11)",
        "(line 237,col 5)-(line 237,col 26)",
        "(line 239,col 5)-(line 247,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.stop()",
      "begin_line": 254,
      "end_line": 256,
      "comment": " Check if the integration should be stopped at the end of the\n   * current step.\n   * @return true if the integration should be stopped\n   ",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.SwitchState.reset(double, double[])",
      "begin_line": 265,
      "end_line": 280,
      "comment": " Let the switching function reset the state if it wants.\n   * @param t value of the independent \u003ci\u003etime\u003c/i\u003e variable at the\n   * beginning of the next step\n   * @param y array were to put the desired state vector at the beginning\n   * of the next step\n   * @return true if the integrator should reset the derivatives too\n   ",
      "child_ranges": [
        "(line 267,col 5)-(line 269,col 5)",
        "(line 271,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 30)",
        "(line 275,col 5)-(line 275,col 35)",
        "(line 277,col 5)-(line 278,col 63)"
      ]
    }
  ]
}