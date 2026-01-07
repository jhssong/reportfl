{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 36,
      "end_line": 273,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Events handlers manager. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 65,
      "end_line": 73,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 67,col 52)",
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 31)",
        "(line 70,col 9)-(line 70,col 60)",
        "(line 71,col 9)-(line 71,col 30)",
        "(line 72,col 9)-(line 72,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 77,
      "end_line": 79,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 92,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 102,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 107,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 111,
      "end_line": 113,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 116,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput()",
      "begin_line": 123,
      "end_line": 130,
      "comment": " Check if one of the step handlers requires dense output.\n     * @return true if one of the step handlers requires dense output\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 133,
      "end_line": 135,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 138,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 148,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 153,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Reset the number of evaluations to zero.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 167,
      "end_line": 169,
      "comment": " Set the differential equations.\n     * @param equations differential equations to integrate\n     * @see #computeDerivatives(double, double[], double[])\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 178,
      "end_line": 184,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws DerivativeException this exception is propagated to the caller if the\n     * underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 194,
      "end_line": 215,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param ode differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEndTimeChecker(double, double, org.apache.commons.math.ode.events.CombinedEventsManager)",
      "begin_line": 227,
      "end_line": 242,
      "comment": " Add an event handler for end time checking.\n     * \u003cp\u003eThis method can be used to simplify handling of integration end time.\n     * It leverages the nominal stop condition with the exceptional stop\n     * conditions.\u003c/p\u003e\n     * @param startTime integration start time\n     * @param endTime desired end time\n     * @param manager manager containing the user-defined handlers\n     * @return a new manager containing all the user-defined handlers plus a\n     * dedicated manager triggering a stop event at entTime\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 71)",
        "(line 231,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 240,col 40)",
        "(line 241,col 9)-(line 241,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTimeChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 245,
      "end_line": 271,
      "comment": " Specialized event handler to stop integration. "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Desired end time. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.EndTimeChecker(double)",
      "begin_line": 253,
      "end_line": 255,
      "comment": " Build an instance.\n         * @param endTime desired time\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.eventOccurred(double, double[], boolean)",
      "begin_line": 258,
      "end_line": 260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 259,col 13)-(line 259,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.g(double, double[])",
      "begin_line": 263,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.resetState(double, double[])",
      "begin_line": 268,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}