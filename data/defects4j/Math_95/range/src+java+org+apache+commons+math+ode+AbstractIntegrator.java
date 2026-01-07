{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 34,
      "end_line": 222,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Events handlers manager. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 54,
      "end_line": 60,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 56,col 52)",
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 31)",
        "(line 59,col 9)-(line 59,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 63,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 83,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 88,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput()",
      "begin_line": 104,
      "end_line": 111,
      "comment": " Check if one of the step handlers requires dense output.\n     * @return true if one of the step handlers requires dense output\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 131,
      "end_line": 161,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param equations differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEndTimeChecker(double, double, org.apache.commons.math.ode.events.CombinedEventsManager)",
      "begin_line": 173,
      "end_line": 188,
      "comment": " Add an event handler for end time checking.\n     * \u003cp\u003eThis method can be used to simplify handling of integration end time.\n     * It leverages the nominal stop condition with the exceptional stop\n     * conditions.\u003c/p\u003e\n     * @param startTime integration start time\n     * @param endTime desired end time\n     * @param manager manager containing the user-defined handlers\n     * @return a new manager containing all the user-defined handlers plus a\n     * dedicated manager triggering a stop event at entTime\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 71)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 186,col 40)",
        "(line 187,col 9)-(line 187,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTimeChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 191,
      "end_line": 220,
      "comment": " Specialized event handler to stop integration. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " DEsiredt end time. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.EndTimeChecker(double)",
      "begin_line": 202,
      "end_line": 204,
      "comment": " Build an instance.\n         * @param endTime desired time\n         ",
      "child_ranges": [
        "(line 203,col 13)-(line 203,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.eventOccurred(double, double[])",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.g(double, double[])",
      "begin_line": 212,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 13)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.resetState(double, double[])",
      "begin_line": 217,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}