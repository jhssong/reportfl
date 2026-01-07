{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 35,
      "end_line": 276,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Events handlers manager. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 64,
      "end_line": 72,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 25)",
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 67,col 31)",
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 60)",
        "(line 70,col 9)-(line 70,col 30)",
        "(line 71,col 9)-(line 71,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 101,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 106,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput()",
      "begin_line": 122,
      "end_line": 129,
      "comment": " Check if one of the step handlers requires dense output.\n     * @return true if one of the step handlers requires dense output\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 132,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Reset the number of evaluations to zero.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 166,
      "end_line": 168,
      "comment": " Set the differential equations.\n     * @param equations differential equations to integrate\n     * @see #computeDerivatives(double, double[], double[])\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 177,
      "end_line": 183,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws DerivativeException this exception is propagated to the caller if the\n     * underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 193,
      "end_line": 218,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param ode differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEndTimeChecker(double, double, org.apache.commons.math.ode.events.CombinedEventsManager)",
      "begin_line": 230,
      "end_line": 245,
      "comment": " Add an event handler for end time checking.\n     * \u003cp\u003eThis method can be used to simplify handling of integration end time.\n     * It leverages the nominal stop condition with the exceptional stop\n     * conditions.\u003c/p\u003e\n     * @param startTime integration start time\n     * @param endTime desired end time\n     * @param manager manager containing the user-defined handlers\n     * @return a new manager containing all the user-defined handlers plus a\n     * dedicated manager triggering a stop event at entTime\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 71)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 244,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTimeChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 248,
      "end_line": 274,
      "comment": " Specialized event handler to stop integration. "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " Desired end time. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.EndTimeChecker(double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Build an instance.\n         * @param endTime desired time\n         ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.eventOccurred(double, double[], boolean)",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.g(double, double[])",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.resetState(double, double[])",
      "begin_line": 271,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}