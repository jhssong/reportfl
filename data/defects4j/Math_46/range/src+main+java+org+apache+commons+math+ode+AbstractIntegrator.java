{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 49,
      "end_line": 366,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "isLastStep"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Indicator for last step. "
    },
    {
      "type": "field",
      "varNames": [
        "resetOccurred"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Indicator that a state or derivative reset was triggered by some event. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsStates"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Events states. "
    },
    {
      "type": "field",
      "varNames": [
        "statesInitialized"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Initialization indicator of events states. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 87,
      "end_line": 96,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 25)",
        "(line 89,col 9)-(line 89,col 52)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 31)",
        "(line 92,col 9)-(line 92,col 51)",
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 94,col 30)",
        "(line 95,col 9)-(line 95,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 115,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 125,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 135,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 140,col 9)-(line 141,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 145,
      "end_line": 151,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 70)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 154,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 164,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 169,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 174,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 179,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations()",
      "begin_line": 185,
      "end_line": 187,
      "comment": " Reset the number of evaluations to zero.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Set the differential equations.\n     * @param equations differential equations to integrate\n     * @see #computeDerivatives(double, double[], double[])\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 204,
      "end_line": 210,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws MathUserException this user-defined exception should be used if an error is\n     * is triggered by user code\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setStateInitialized(boolean)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " Set the stateInitialized flag.\n     * \u003cp\u003eThis method must be called by integrators with the value\n     * {@code false} before they start integration, so a proper lazy\n     * initialization is done automatically on the first step.\u003c/p\u003e\n     * @param stateInitialized new value for the flag\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator, double[], double[], double)",
      "begin_line": 233,
      "end_line": 333,
      "comment": " Accept a step, triggering events and step handlers.\n     * @param interpolator step interpolator\n     * @param y state vector at step end time, must be reset if an event\n     * asks for resetting or if an events stops integration during the step\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @param tEnd final integration time\n     * @return time at end of step\n     * @exception MathIllegalStateException if the value of one event state cannot be evaluated\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 68)",
        "(line 238,col 13)-(line 238,col 72)",
        "(line 239,col 13)-(line 239,col 34)",
        "(line 242,col 13)-(line 247,col 13)",
        "(line 250,col 13)-(line 250,col 72)",
        "(line 251,col 13)-(line 258,col 15)",
        "(line 260,col 13)-(line 265,col 13)",
        "(line 267,col 13)-(line 316,col 13)",
        "(line 318,col 13)-(line 318,col 55)",
        "(line 319,col 13)-(line 319,col 74)",
        "(line 320,col 13)-(line 323,col 13)",
        "(line 324,col 13)-(line 324,col 75)",
        "(line 327,col 13)-(line 329,col 13)",
        "(line 331,col 13)-(line 331,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.Anonymous-ce885fbc-0d36-4268-bd3b-98a59d47d7fc.compare(org.apache.commons.math.ode.events.EventState, org.apache.commons.math.ode.events.EventState)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 21)-(line 255,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 344,
      "end_line": 364,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param ode differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception DimensionMismatchException if some inconsistency is detected\n     * @exception NumberIsTooSmallException if integration span is too small\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 362,col 9)"
      ]
    }
  ]
}