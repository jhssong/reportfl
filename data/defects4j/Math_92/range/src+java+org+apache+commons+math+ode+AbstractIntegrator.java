{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 34,
      "end_line": 225,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Events handlers manager. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 57,
      "end_line": 63,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 25)",
        "(line 59,col 9)-(line 59,col 52)",
        "(line 60,col 9)-(line 60,col 31)",
        "(line 61,col 9)-(line 61,col 31)",
        "(line 62,col 9)-(line 62,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 86,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 91,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput()",
      "begin_line": 107,
      "end_line": 114,
      "comment": " Check if one of the step handlers requires dense output.\n     * @return true if one of the step handlers requires dense output\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 122,
      "end_line": 124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 134,
      "end_line": 164,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param equations differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEndTimeChecker(double, double, org.apache.commons.math.ode.events.CombinedEventsManager)",
      "begin_line": 176,
      "end_line": 191,
      "comment": " Add an event handler for end time checking.\n     * \u003cp\u003eThis method can be used to simplify handling of integration end time.\n     * It leverages the nominal stop condition with the exceptional stop\n     * conditions.\u003c/p\u003e\n     * @param startTime integration start time\n     * @param endTime desired end time\n     * @param manager manager containing the user-defined handlers\n     * @return a new manager containing all the user-defined handlers plus a\n     * dedicated manager triggering a stop event at entTime\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 71)",
        "(line 180,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 189,col 40)",
        "(line 190,col 9)-(line 190,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTimeChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 194,
      "end_line": 223,
      "comment": " Specialized event handler to stop integration. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " DEsiredt end time. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.EndTimeChecker(double)",
      "begin_line": 205,
      "end_line": 207,
      "comment": " Build an instance.\n         * @param endTime desired time\n         ",
      "child_ranges": [
        "(line 206,col 13)-(line 206,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.eventOccurred(double, double[])",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 13)-(line 211,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.g(double, double[])",
      "begin_line": 215,
      "end_line": 217,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 216,col 13)-(line 216,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.resetState(double, double[])",
      "begin_line": 220,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}