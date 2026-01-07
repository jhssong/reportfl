{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 40,
      "end_line": 322,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "resetTime"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Time of last detected reset. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, org.apache.commons.math.ode.sampling.StepInterpolator)",
      "begin_line": 70,
      "end_line": 77,
      "comment": "\n     * Build a multistep integrator with the given number of steps.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param k number of steps of the multistep method\n     * (including the one being computed)\n     * @param prototype prototype of the step interpolator to use\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 20)",
        "(line 73,col 9)-(line 73,col 80)",
        "(line 74,col 9)-(line 74,col 34)",
        "(line 75,col 9)-(line 75,col 36)",
        "(line 76,col 9)-(line 76,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starter starter integrator\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(int, double, org.apache.commons.math.ode.events.CombinedEventsManager, org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[])",
      "begin_line": 130,
      "end_line": 182,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes the first few steps of the multistep method,\n     * using the underlying starter integrator, ensuring the returned steps\n     * all belong to the same smooth range.\u003c/p\u003e\n     * \u003cp\u003eIn order to ensure smoothness, the start phase is automatically\n     * restarted when a state or derivative reset is triggered by the\n     * registered events handlers before this start phase is completed. As\n     * an example, consider integrating a differential equation from t\u003d0\n     * to t\u003d100 with a 4 steps method and step size equal to 0.2. If an event\n     * resets the state at t\u003d0.5, the start phase will not end at t\u003d0.6 with\n     * steps at [0.0, 0.2, 0.4, 0.6] but instead will end at t\u003d1.1 with steps\n     * at [0.5, 0.7, 0.9, 1.1].\u003c/p\u003e\n     * \u003cp\u003eA side effect of the need for smoothness is that an ODE triggering\n     * short period regular resets will remain in the start phase throughout\n     * the integration range if the step size or the number of steps to store\n     * are too large.\u003c/p\u003e\n     * \u003cp\u003eIf the start phase ends prematurely (because of some triggered event\n     * for example), then the time of latest previous steps will be set to\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * @param n number of steps to store\n     * @param h signed step size to use for the first steps\n     * @param manager discrete events manager to use\n     * @param equations differential equations to integrate\n     * @param t0 initial time\n     * @param y state vector: contains the initial value of the state vector at t0,\n     * will be used to put the state vector at each successful step and hence\n     * contains the final value at the end of the start phase\n     * @return time of the end of the start phase\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 138,col 37)",
        "(line 141,col 9)-(line 141,col 37)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 149,col 9)-(line 149,col 36)",
        "(line 150,col 9)-(line 153,col 9)",
        "(line 156,col 9)-(line 156,col 67)",
        "(line 157,col 9)-(line 157,col 61)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 37)",
        "(line 162,col 9)-(line 171,col 43)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 175,col 9)-(line 175,col 36)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.rotatePreviousSteps()",
      "begin_line": 186,
      "end_line": 193,
      "comment": " Rotate the previous steps arrays.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 64)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ResetCheckingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 196,
      "end_line": 234,
      "comment": " Event handler wrapper to check if state or derivatives have been reset. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.ResetCheckingWrapper(org.apache.commons.math.ode.events.EventHandler)",
      "begin_line": 207,
      "end_line": 209,
      "comment": " Build a new instance.\n         * @param handler event handler to wrap\n         ",
      "child_ranges": [
        "(line 208,col 13)-(line 208,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.eventOccurred(double, double[], boolean)",
      "begin_line": 212,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 71)",
        "(line 215,col 13)-(line 220,col 13)",
        "(line 221,col 13)-(line 221,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.g(double, double[])",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 13)-(line 226,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.ResetCheckingWrapper.resetState(double, double[])",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FilteringWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 237,
      "end_line": 269,
      "comment": " Step handler wrapper filtering out the isLast indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Wrapped step handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.FilteringWrapper(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 248,
      "end_line": 250,
      "comment": " Build a new instance.\n         * @param handler step handler to wrap\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 253,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.requiresDenseOutput()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.FilteringWrapper.reset()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StoringStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 272,
      "end_line": 320,
      "comment": " Specialized step handler storing the first few steps. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 275,
      "end_line": 275,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 278,
      "end_line": 278,
      "comment": " Number of steps to store. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Counter for already stored steps. "
    },
    {
      "type": "field",
      "varNames": [
        "finalState"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Final state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.StoringStepHandler(int)",
      "begin_line": 289,
      "end_line": 292,
      "comment": " Build a new instance.\n         * @param n number of steps to store\n         ",
      "child_ranges": [
        "(line 290,col 13)-(line 290,col 23)",
        "(line 291,col 13)-(line 291,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.restart()",
      "begin_line": 296,
      "end_line": 299,
      "comment": " Restart storage.\n         ",
      "child_ranges": [
        "(line 297,col 13)-(line 297,col 22)",
        "(line 298,col 13)-(line 298,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.getFinalState()",
      "begin_line": 304,
      "end_line": 306,
      "comment": " Get the final state.\n         * @return final state\n         ",
      "child_ranges": [
        "(line 305,col 13)-(line 305,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.StoringStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 309,
      "end_line": 318,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 13)-(line 317,col 13)"
      ]
    }
  ]
}