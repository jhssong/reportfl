{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 42,
      "end_line": 323,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
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
        "starter"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "resetTime"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Time of last detected reset. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, org.apache.commons.math.ode.sampling.MultistepStepInterpolator)",
      "begin_line": 72,
      "end_line": 79,
      "comment": "\n     * Build a multistep integrator with the given number of steps.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param k number of steps of the multistep method\n     * (including the one being computed)\n     * @param prototype prototype of the step interpolator to use\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 75,col 80)",
        "(line 76,col 9)-(line 76,col 34)",
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starter starter integrator\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(int, double, org.apache.commons.math.ode.events.CombinedEventsManager, org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[])",
      "begin_line": 132,
      "end_line": 184,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes the first few steps of the multistep method,\n     * using the underlying starter integrator, ensuring the returned steps\n     * all belong to the same smooth range.\u003c/p\u003e\n     * \u003cp\u003eIn order to ensure smoothness, the start phase is automatically\n     * restarted when a state or derivative reset is triggered by the\n     * registered events handlers before this start phase is completed. As\n     * an example, consider integrating a differential equation from t\u003d0\n     * to t\u003d100 with a 4 steps method and step size equal to 0.2. If an event\n     * resets the state at t\u003d0.5, the start phase will not end at t\u003d0.6 with\n     * steps at [0.0, 0.2, 0.4, 0.6] but instead will end at t\u003d1.1 with steps\n     * at [0.5, 0.7, 0.9, 1.1].\u003c/p\u003e\n     * \u003cp\u003eA side effect of the need for smoothness is that an ODE triggering\n     * short period regular resets will remain in the start phase throughout\n     * the integration range if the step size or the number of steps to store\n     * are too large.\u003c/p\u003e\n     * \u003cp\u003eIf the start phase ends prematurely (because of some triggered event\n     * for example), then the time of latest previous steps will be set to\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * @param n number of steps to store\n     * @param h signed step size to use for the first steps\n     * @param manager discrete events manager to use\n     * @param equations differential equations to integrate\n     * @param t0 initial time\n     * @param y state vector: contains the initial value of the state vector at t0,\n     * will be used to put the state vector at each successful step and hence\n     * contains the final value at the end of the start phase\n     * @return time of the end of the start phase\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 43)",
        "(line 140,col 9)-(line 140,col 37)",
        "(line 143,col 9)-(line 143,col 37)",
        "(line 144,col 9)-(line 148,col 9)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 158,col 67)",
        "(line 159,col 9)-(line 159,col 61)",
        "(line 162,col 9)-(line 162,col 22)",
        "(line 163,col 9)-(line 163,col 37)",
        "(line 164,col 9)-(line 173,col 43)",
        "(line 176,col 9)-(line 176,col 37)",
        "(line 177,col 9)-(line 177,col 36)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.rotatePreviousSteps()",
      "begin_line": 188,
      "end_line": 195,
      "comment": " Rotate the previous steps arrays.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 64)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ResetCheckingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 198,
      "end_line": 235,
      "comment": " Event handler wrapper to check if state or derivatives have been reset. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.ResetCheckingWrapper(org.apache.commons.math.ode.events.EventHandler)",
      "begin_line": 209,
      "end_line": 211,
      "comment": " Build a new instance.\n         * @param handler event handler to wrap\n         ",
      "child_ranges": [
        "(line 210,col 13)-(line 210,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.eventOccurred(double, double[])",
      "begin_line": 214,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 59)",
        "(line 216,col 13)-(line 221,col 13)",
        "(line 222,col 13)-(line 222,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.g(double, double[])",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 13)-(line 227,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.resetState(double, double[])",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FilteringWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 238,
      "end_line": 270,
      "comment": " Step handler wrapper filtering out the isLast indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": " Wrapped step handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.FilteringWrapper(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 249,
      "end_line": 251,
      "comment": " Build a new instance.\n         * @param handler step handler to wrap\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 254,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.requiresDenseOutput()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.reset()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StoringStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 273,
      "end_line": 321,
      "comment": " Specialized step handler storing the first few steps. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 279,
      "end_line": 279,
      "comment": " Number of steps to store. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 282,
      "end_line": 282,
      "comment": " Counter for already stored steps. "
    },
    {
      "type": "field",
      "varNames": [
        "finalState"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": " Final state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.StoringStepHandler(int)",
      "begin_line": 290,
      "end_line": 293,
      "comment": " Build a new instance.\n         * @param n number of steps to store\n         ",
      "child_ranges": [
        "(line 291,col 13)-(line 291,col 23)",
        "(line 292,col 13)-(line 292,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.restart()",
      "begin_line": 297,
      "end_line": 300,
      "comment": " Restart storage.\n         ",
      "child_ranges": [
        "(line 298,col 13)-(line 298,col 22)",
        "(line 299,col 13)-(line 299,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.getFinalState()",
      "begin_line": 305,
      "end_line": 307,
      "comment": " Get the final state.\n         * @return final state\n         ",
      "child_ranges": [
        "(line 306,col 13)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 310,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 13)-(line 318,col 13)"
      ]
    }
  ]
}