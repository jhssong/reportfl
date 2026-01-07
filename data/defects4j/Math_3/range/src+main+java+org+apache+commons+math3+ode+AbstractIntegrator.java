{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/ode/AbstractIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderIntegrator"
      ],
      "begin_line": 49,
      "end_line": 458,
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
        "evaluations"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Counter for number of evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "expandable"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Differential equations to integrate. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.AbstractIntegrator(java.lang.String)",
      "begin_line": 84,
      "end_line": 94,
      "comment": " Build an instance.\n     * @param name name of the method\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 25)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 31)",
        "(line 88,col 9)-(line 88,col 31)",
        "(line 89,col 9)-(line 89,col 51)",
        "(line 90,col 9)-(line 90,col 34)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 92,col 30)",
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.AbstractIntegrator()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " Build an instance with a null name.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getName()",
      "begin_line": 103,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)",
      "begin_line": 108,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getStepHandlers()",
      "begin_line": 113,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.clearStepHandlers()",
      "begin_line": 118,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int)",
      "begin_line": 123,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 133,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 9)-(line 139,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getEventHandlers()",
      "begin_line": 143,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 70)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.clearEventHandlers()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getCurrentStepStart()",
      "begin_line": 157,
      "end_line": 159,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getCurrentSignedStepsize()",
      "begin_line": 162,
      "end_line": 164,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.setMaxEvaluations(int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getMaxEvaluations()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getEvaluations()",
      "begin_line": 177,
      "end_line": 179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.initIntegration(double, double[], double)",
      "begin_line": 186,
      "end_line": 201,
      "comment": " Prepare the start of an integration.\n     * @param t0 start value of the independent \u003ci\u003etime\u003c/i\u003e variable\n     * @param y0 array containing the start value of the state vector\n     * @param t target time for the integration\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 33)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.setEquations(org.apache.commons.math3.ode.ExpandableStatefulODE)",
      "begin_line": 206,
      "end_line": 208,
      "comment": " Set the equations.\n     * @param equations equations to set\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getExpandable()",
      "begin_line": 214,
      "end_line": 216,
      "comment": " Get the differential equations to integrate.\n     * @return differential equations to integrate\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.getEvaluationsCounter()",
      "begin_line": 222,
      "end_line": 224,
      "comment": " Get the evaluations counter.\n     * @return evaluations counter\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.integrate(org.apache.commons.math3.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 227,
      "end_line": 251,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 240,col 9)-(line 240,col 89)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 42)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 248,col 9)-(line 248,col 77)",
        "(line 249,col 9)-(line 249,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " Integrate a set of differential equations up to the given time.\n     * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n     * \u003cp\u003eThe set of differential equations is composed of a main set, which\n     * can be extended by some sets of secondary equations. The set of\n     * equations must be already set up with initial time and partial states.\n     * At integration completion, the final time and partial states will be\n     * available in the same object.\u003c/p\u003e\n     * \u003cp\u003eSince this method stores some internal state variables made\n     * available in its public interface during integration ({@link\n     * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n     * @param equations complete set of differential equations to integrate\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @exception NumberIsTooSmallException if integration step is too small\n     * @throws DimensionMismatchException if the dimension of the complete state does not\n     * match the complete equations sets dimension\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception NoBracketingException if the location of an event cannot be bracketed\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.computeDerivatives(double, double[], double[])",
      "begin_line": 283,
      "end_line": 287,
      "comment": " Compute the derivatives and check the number of evaluations.\n     * @param t current value of the independent \u003cI\u003etime\u003c/I\u003e variable\n     * @param y array containing the current value of the state vector\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n     * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 37)",
        "(line 286,col 9)-(line 286,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.setStateInitialized(boolean)",
      "begin_line": 296,
      "end_line": 298,
      "comment": " Set the stateInitialized flag.\n     * \u003cp\u003eThis method must be called by integrators with the value\n     * {@code false} before they start integration, so a proper lazy\n     * initialization is done automatically on the first step.\u003c/p\u003e\n     * @param stateInitialized new value for the flag\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.acceptStep(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator, double[], double[], double)",
      "begin_line": 313,
      "end_line": 436,
      "comment": " Accept a step, triggering events and step handlers.\n     * @param interpolator step interpolator\n     * @param y state vector at step end time, must be reset if an event\n     * asks for resetting or if an events stops integration during the step\n     * @param yDot placeholder array where to put the time derivative of the state vector\n     * @param tEnd final integration time\n     * @return time at end of step\n     * @exception MaxCountExceededException if the interpolator throws one because\n     * the number of functions evaluations is exceeded\n     * @exception NoBracketingException if the location of an event cannot be bracketed\n     * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 68)",
        "(line 318,col 13)-(line 318,col 72)",
        "(line 321,col 13)-(line 326,col 13)",
        "(line 329,col 13)-(line 329,col 72)",
        "(line 330,col 13)-(line 337,col 15)",
        "(line 339,col 13)-(line 344,col 13)",
        "(line 346,col 13)-(line 411,col 13)",
        "(line 414,col 13)-(line 414,col 55)",
        "(line 415,col 13)-(line 415,col 59)",
        "(line 416,col 13)-(line 417,col 71)",
        "(line 418,col 13)-(line 418,col 26)",
        "(line 419,col 13)-(line 422,col 13)",
        "(line 423,col 13)-(line 426,col 13)",
        "(line 427,col 13)-(line 427,col 75)",
        "(line 430,col 13)-(line 432,col 13)",
        "(line 434,col 13)-(line 434,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.Anonymous-a1cb23e5-adfa-4693-89b9-6c6fb9ffe3af.compare(org.apache.commons.math3.ode.events.EventState, org.apache.commons.math3.ode.events.EventState)",
      "begin_line": 333,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 334,col 21)-(line 334,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.AbstractIntegrator.sanityChecks(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 445,
      "end_line": 456,
      "comment": " Check the integration span.\n     * @param equations set of differential equations\n     * @param t target time for the integration\n     * @exception NumberIsTooSmallException if integration span is too small\n     * @exception DimensionMismatchException if adaptive step size integrators\n     * tolerance arrays dimensions are not compatible with equations settings\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 449,col 84)",
        "(line 450,col 9)-(line 450,col 64)",
        "(line 451,col 9)-(line 454,col 9)"
      ]
    }
  ]
}