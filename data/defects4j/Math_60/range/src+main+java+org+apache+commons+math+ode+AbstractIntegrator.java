{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 38,
      "end_line": 275,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsHandlersManager"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Events handlers manager. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 67,
      "end_line": 75,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 25)",
        "(line 69,col 9)-(line 69,col 52)",
        "(line 70,col 9)-(line 70,col 31)",
        "(line 71,col 9)-(line 71,col 31)",
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 104,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 113,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.requiresDenseOutput()",
      "begin_line": 125,
      "end_line": 132,
      "comment": " Check if one of the step handlers requires dense output.\n     * @return true if one of the step handlers requires dense output\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 135,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 145,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations()",
      "begin_line": 161,
      "end_line": 163,
      "comment": " Reset the number of evaluations to zero.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 169,
      "end_line": 171,
      "comment": " Set the differential equations.\n     * @param equations differential equations to integrate\n     * @see #computeDerivatives(double, double[], double[])\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 180,
      "end_line": 186,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws MathUserException this user-defined exception should be used if an error is\n     * is triggered by user code\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 196,
      "end_line": 217,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param ode differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEndTimeChecker(double, double, org.apache.commons.math.ode.events.CombinedEventsManager)",
      "begin_line": 229,
      "end_line": 244,
      "comment": " Add an event handler for end time checking.\n     * \u003cp\u003eThis method can be used to simplify handling of integration end time.\n     * It leverages the nominal stop condition with the exceptional stop\n     * conditions.\u003c/p\u003e\n     * @param startTime integration start time\n     * @param endTime desired end time\n     * @param manager manager containing the user-defined handlers\n     * @return a new manager containing all the user-defined handlers plus a\n     * dedicated manager triggering a stop event at entTime\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 71)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 243,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EndTimeChecker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 247,
      "end_line": 273,
      "comment": " Specialized event handler to stop integration. "
    },
    {
      "type": "field",
      "varNames": [
        "endTime"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": " Desired end time. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.EndTimeChecker(double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": " Build an instance.\n         * @param endTime desired time\n         ",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.eventOccurred(double, double[], boolean)",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.g(double, double[])",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.EndTimeChecker.resetState(double, double[])",
      "begin_line": 270,
      "end_line": 271,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    }
  ]
}