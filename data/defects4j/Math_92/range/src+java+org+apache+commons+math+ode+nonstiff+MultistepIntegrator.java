{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ode/nonstiff/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 47,
      "end_line": 328,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n *\n * @see AdamsBashforthIntegrator\n * @see AdamsMoultonIntegrator\n * @see BDFIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "resetTime"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Time of last detected reset. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator)",
      "begin_line": 77,
      "end_line": 84,
      "comment": "\n     * Build a multistep integrator with the given number of steps.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param k number of steps of the multistep method\n     * (including the one being computed)\n     * @param prototype prototype of the step interpolator to use\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 20)",
        "(line 80,col 9)-(line 80,col 80)",
        "(line 81,col 9)-(line 81,col 34)",
        "(line 82,col 9)-(line 82,col 36)",
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starter starter integrator\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.start(int, double, org.apache.commons.math.ode.events.CombinedEventsManager, org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[])",
      "begin_line": 137,
      "end_line": 189,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes the first few steps of the multistep method,\n     * using the underlying starter integrator, ensuring the returned steps\n     * all belong to the same smooth range.\u003c/p\u003e\n     * \u003cp\u003eIn order to ensure smoothness, the start phase is automatically\n     * restarted when a state or derivative reset is triggered by the\n     * registered events handlers before this start phase is completed. As\n     * an example, consider integrating a differential equation from t\u003d0\n     * to t\u003d100 with a 4 steps method and step size equal to 0.2. If an event\n     * resets the state at t\u003d0.5, the start phase will not end at t\u003d0.7 with\n     * steps at [0.0, 0.2, 0.4, 0.6] but instead will end at t\u003d1.1 with steps\n     * at [0.5, 0.7, 0.9, 1.1].\u003c/p\u003e\n     * \u003cp\u003eA side effect of the need for smoothness is that an ODE triggering\n     * short period regular resets will remain in the start phase throughout\n     * the integration range if the step size or the number of steps to store\n     * are too large.\u003c/p\u003e\n     * \u003cp\u003eIf the start phase ends prematurely (because of some triggered event\n     * for example), then the time of latest previous steps will be set to\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * @param n number of steps to store\n     * @param h signed step size to use for the first steps\n     * @param manager discrete events manager to use\n     * @param equations differential equations to integrate\n     * @param t0 initial time\n     * @param y state vector: contains the initial value of the state vector at t0,\n     * will be used to put the state vector at each successful step and hence\n     * contains the final value at the end of the start phase\n     * @return time of the end of the start phase\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 37)",
        "(line 148,col 9)-(line 148,col 37)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 156,col 9)-(line 156,col 36)",
        "(line 157,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 163,col 67)",
        "(line 164,col 9)-(line 164,col 61)",
        "(line 167,col 9)-(line 167,col 22)",
        "(line 168,col 9)-(line 168,col 37)",
        "(line 169,col 9)-(line 178,col 43)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 182,col 9)-(line 182,col 36)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.rotatePreviousSteps()",
      "begin_line": 193,
      "end_line": 200,
      "comment": " Rotate the previous steps arrays.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 64)",
        "(line 195,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ResetCheckingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 203,
      "end_line": 240,
      "comment": " Event handler wrapper to check if state or derivatives have been reset. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.ResetCheckingWrapper(org.apache.commons.math.ode.events.EventHandler)",
      "begin_line": 214,
      "end_line": 216,
      "comment": " Build a new instance.\n         * @param handler event handler to wrap\n         ",
      "child_ranges": [
        "(line 215,col 13)-(line 215,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.eventOccurred(double, double[])",
      "begin_line": 219,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 13)-(line 220,col 59)",
        "(line 221,col 13)-(line 226,col 13)",
        "(line 227,col 13)-(line 227,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.g(double, double[])",
      "begin_line": 231,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 13)-(line 232,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.resetState(double, double[])",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 13)-(line 237,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FilteringWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 243,
      "end_line": 275,
      "comment": " Step handler wrapper filtering out the isLast indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Wrapped step handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.FilteringWrapper(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " Build a new instance.\n         * @param handler step handler to wrap\n         ",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 259,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.requiresDenseOutput()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.reset()",
      "begin_line": 271,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StoringStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 278,
      "end_line": 326,
      "comment": " Specialized step handler storing the first few steps. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 284,
      "end_line": 284,
      "comment": " Number of steps to store. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 287,
      "end_line": 287,
      "comment": " Counter for already stored steps. "
    },
    {
      "type": "field",
      "varNames": [
        "finalState"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Final state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.StoringStepHandler(int)",
      "begin_line": 295,
      "end_line": 298,
      "comment": " Build a new instance.\n         * @param n number of steps to store\n         ",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 23)",
        "(line 297,col 13)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.restart()",
      "begin_line": 302,
      "end_line": 305,
      "comment": " Restart storage.\n         ",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 22)",
        "(line 304,col 13)-(line 304,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.getFinalState()",
      "begin_line": 310,
      "end_line": 312,
      "comment": " Get the final state.\n         * @return final state\n         ",
      "child_ranges": [
        "(line 311,col 13)-(line 311,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 315,
      "end_line": 324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 317,col 13)-(line 323,col 13)"
      ]
    }
  ]
}