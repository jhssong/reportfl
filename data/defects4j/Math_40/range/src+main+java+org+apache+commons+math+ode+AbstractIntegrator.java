{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 50,
      "end_line": 414,
      "comment": "\n * Base class managing common boilerplate for all integrators.\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "stepHandlers"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "stepStart"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Current step start time. "
    },
    {
      "type": "field",
      "varNames": [
        "stepSize"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Current stepsize. "
    },
    {
      "type": "field",
      "varNames": [
        "isLastStep"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Indicator for last step. "
    },
    {
      "type": "field",
      "varNames": [
        "resetOccurred"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Indicator that a state or derivative reset was triggered by some event. "
    },
    {
      "type": "field",
      "varNames": [
        "eventsStates"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Events states. "
    },
    {
      "type": "field",
      "varNames": [
        "statesInitialized"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Initialization indicator of events states. "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Name of the method. "
    },
    {
      "type": "field",
      "varNames": [
        "evaluations"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Counter for number of evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "expandable"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 85,
      "end_line": 95,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 87,col 52)",
        "(line 88,col 9)-(line 88,col 31)",
        "(line 89,col 9)-(line 89,col 31)",
        "(line 90,col 9)-(line 90,col 51)",
        "(line 91,col 9)-(line 91,col 34)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 33)"
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
        "(line 169,col 9)-(line 169,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.initIntegration(double, double[], double)",
      "begin_line": 187,
      "end_line": 201,
      "comment": " Prepare the start of an integration.\n     * @param t0 start value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y0 array containing the start value of the state vector\n     * @param t target time for the integration\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 33)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setEquations(org.apache.commons.math.ode.ExpandableStatefulODE)",
      "begin_line": 206,
      "end_line": 208,
      "comment": " Set the equations.\n     * @param equations equations to set\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 211,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 89)",
        "(line 224,col 9)-(line 224,col 34)",
        "(line 225,col 9)-(line 225,col 42)",
        "(line 228,col 9)-(line 228,col 36)",
        "(line 231,col 9)-(line 231,col 77)",
        "(line 232,col 9)-(line 232,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)",
      "begin_line": 253,
      "end_line": 254,
      "comment": " Integrate a set of differential equations up to the given time.\n     * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n     * \u003cp\u003eThe set of differential equations is composed of a main set, which\n     * can be extended by some sets of secondary equations. The set of\n     * equations must be already set up with initial time and partial states.\n     * At integration completion, the final time and partial states will be\n     * available in the same object.\u003c/p\u003e\n     * \u003cp\u003eSince this method stores some internal state variables made\n     * available in its public interface during integration ({@link\n     * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n     * @param equations complete set of differential equations to integrate\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @throws MathIllegalStateException if the integrator cannot perform integration\n     * @throws MathIllegalArgumentException if integration parameters are wrong (typically\n     * too small integration span)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 262,
      "end_line": 266,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 37)",
        "(line 265,col 9)-(line 265,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.setStateInitialized(boolean)",
      "begin_line": 275,
      "end_line": 277,
      "comment": " Set the stateInitialized flag.\n     * \u003cp\u003eThis method must be called by integrators with the value\n     * {@code false} before they start integration, so a proper lazy\n     * initialization is done automatically on the first step.\u003c/p\u003e\n     * @param stateInitialized new value for the flag\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.acceptStep(org.apache.commons.math.ode.sampling.AbstractStepInterpolator, double[], double[], double)",
      "begin_line": 289,
      "end_line": 394,
      "comment": " Accept a step, triggering events and step handlers.\n     * @param interpolator step interpolator\n     * @param y state vector at step end time, must be reset if an event\n     * asks for resetting or if an events stops integration during the step\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @param tEnd final integration time\n     * @return time at end of step\n     * @exception MathIllegalStateException if the value of one event state cannot be evaluated\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 68)",
        "(line 294,col 13)-(line 294,col 72)",
        "(line 297,col 13)-(line 302,col 13)",
        "(line 305,col 13)-(line 305,col 72)",
        "(line 306,col 13)-(line 313,col 15)",
        "(line 315,col 13)-(line 320,col 13)",
        "(line 322,col 13)-(line 377,col 13)",
        "(line 379,col 13)-(line 379,col 55)",
        "(line 380,col 13)-(line 380,col 74)",
        "(line 381,col 13)-(line 384,col 13)",
        "(line 385,col 13)-(line 385,col 75)",
        "(line 388,col 13)-(line 390,col 13)",
        "(line 392,col 13)-(line 392,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.Anonymous-38f2d78f-1118-4e5d-8c67-ea78fea9b6a2.compare(org.apache.commons.math.ode.events.EventState, org.apache.commons.math.ode.events.EventState)",
      "begin_line": 309,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 310,col 21)-(line 310,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math.ode.ExpandableStatefulODE, double)",
      "begin_line": 401,
      "end_line": 412,
      "comment": " Check the integration span.\n     * @param equations set of differential equations\n     * @param t target time for the integration\n     * @exception NumberIsTooSmallException if integration span is too small\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 405,col 84)",
        "(line 406,col 9)-(line 406,col 64)",
        "(line 407,col 9)-(line 410,col 9)"
      ]
    }
  ]
}