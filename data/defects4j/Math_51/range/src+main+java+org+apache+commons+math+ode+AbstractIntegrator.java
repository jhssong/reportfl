{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 48,
      "end_line": 375,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "isLastStep"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Indicator for last step. "
    },
    {
      "type": "field",
      "varNames": [
        "resetOccurred"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Indicator that a state or derivative reset was triggered by some event. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsStates"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Events states. "
    },
    {
      "type": "field",
      "varNames": [
        "statesInitialized"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Initialization indicator of events states. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "maxEvaluations"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Maximal number of evaluations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Number of evaluations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 86,
      "end_line": 95,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 25)",
        "(line 88,col 9)-(line 88,col 52)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 31)",
        "(line 91,col 9)-(line 91,col 51)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 99,
      "end_line": 101,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getName()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 109,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 119,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 124,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 134,
      "end_line": 141,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 139,col 9)-(line 140,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 144,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 70)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 153,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 163,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 168,
      "end_line": 170,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.resetEvaluations()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Reset the number of evaluations to zero.\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.FirstOrderDifferentialEquations)",
      "begin_line": 192,
      "end_line": 194,
      "comment": " Set the differential equations.\n     * @param equations differential equations to integrate\n     * @see #computeDerivatives(double, double[], double[])\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 203,
      "end_line": 209,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @throws MathUserException this user-defined exception should be used if an error is\n     * is triggered by user code\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setStateInitialized(boolean)",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Set the stateInitialized flag.\n     * \u003cp\u003eThis method must be called by integrators with the value\n     * {@code false} before they start integration, so a proper lazy\n     * initialization is done automatically on the first step.\u003c/p\u003e\n     * @param stateInitialized new value for the flag\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator, double[], double[], double)",
      "begin_line": 232,
      "end_line": 342,
      "comment": " Accept a step, triggering events and step handlers.\n     * @param interpolator step interpolator\n     * @param y state vector at step end time, must be reset if an event\n     * asks for resetting or if an events stops integration during the step\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @param tEnd final integration time\n     * @return time at end of step\n     * @exception IntegratorException if the value of one event state cannot be evaluated\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.Anonymous-18324373-096d-48ac-9da6-7f1956232369.compare(org.apache.commons.math.ode.events.EventState, org.apache.commons.math.ode.events.EventState)",
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
      "begin_line": 352,
      "end_line": 373,
      "comment": " Perform some sanity checks on the integration parameters.\n     * @param ode differential equations set\n     * @param t0 start time\n     * @param y0 state vector at t0\n     * @param t target time for the integration\n     * @param y placeholder where to put the state vector\n     * @exception IntegratorException if some inconsistency is detected\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 371,col 9)"
      ]
    }
  ]
}