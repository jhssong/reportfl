{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/ode/nonstiff/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 46,
      "end_line": 327,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n *\n * @see AdamsBashforthIntegrator\n * @see AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "previousT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Previous steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "previousF"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Previous steps derivatives. "
    },
    {
      "type": "field",
      "varNames": [
        "resetTime"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Time of last detected reset. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, org.apache.commons.math.ode.nonstiff.MultistepStepInterpolator)",
      "begin_line": 76,
      "end_line": 83,
      "comment": "\n     * Build a multistep integrator with the given number of steps.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param k number of steps of the multistep method\n     * (including the one being computed)\n     * @param prototype prototype of the step interpolator to use\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 20)",
        "(line 79,col 9)-(line 79,col 80)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starter starter integrator\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.start(int, double, org.apache.commons.math.ode.events.CombinedEventsManager, org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[])",
      "begin_line": 136,
      "end_line": 188,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes the first few steps of the multistep method,\n     * using the underlying starter integrator, ensuring the returned steps\n     * all belong to the same smooth range.\u003c/p\u003e\n     * \u003cp\u003eIn order to ensure smoothness, the start phase is automatically\n     * restarted when a state or derivative reset is triggered by the\n     * registered events handlers before this start phase is completed. As\n     * an example, consider integrating a differential equation from t\u003d0\n     * to t\u003d100 with a 4 steps method and step size equal to 0.2. If an event\n     * resets the state at t\u003d0.5, the start phase will not end at t\u003d0.7 with\n     * steps at [0.0, 0.2, 0.4, 0.6] but instead will end at t\u003d1.1 with steps\n     * at [0.5, 0.7, 0.9, 1.1].\u003c/p\u003e\n     * \u003cp\u003eA side effect of the need for smoothness is that an ODE triggering\n     * short period regular resets will remain in the start phase throughout\n     * the integration range if the step size or the number of steps to store\n     * are too large.\u003c/p\u003e\n     * \u003cp\u003eIf the start phase ends prematurely (because of some triggered event\n     * for example), then the time of latest previous steps will be set to\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * @param n number of steps to store\n     * @param h signed step size to use for the first steps\n     * @param manager discrete events manager to use\n     * @param equations differential equations to integrate\n     * @param t0 initial time\n     * @param y state vector: contains the initial value of the state vector at t0,\n     * will be used to put the state vector at each successful step and hence\n     * contains the final value at the end of the start phase\n     * @return time of the end of the start phase\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 37)",
        "(line 147,col 9)-(line 147,col 37)",
        "(line 148,col 9)-(line 152,col 9)",
        "(line 155,col 9)-(line 155,col 36)",
        "(line 156,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 67)",
        "(line 163,col 9)-(line 163,col 61)",
        "(line 166,col 9)-(line 166,col 22)",
        "(line 167,col 9)-(line 167,col 37)",
        "(line 168,col 9)-(line 177,col 43)",
        "(line 180,col 9)-(line 180,col 37)",
        "(line 181,col 9)-(line 181,col 36)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.rotatePreviousSteps()",
      "begin_line": 192,
      "end_line": 199,
      "comment": " Rotate the previous steps arrays.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 64)",
        "(line 194,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ResetCheckingWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.events.EventHandler"
      ],
      "begin_line": 202,
      "end_line": 239,
      "comment": " Event handler wrapper to check if state or derivatives have been reset. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Wrapped event handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.ResetCheckingWrapper(org.apache.commons.math.ode.events.EventHandler)",
      "begin_line": 213,
      "end_line": 215,
      "comment": " Build a new instance.\n         * @param handler event handler to wrap\n         ",
      "child_ranges": [
        "(line 214,col 13)-(line 214,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.eventOccurred(double, double[])",
      "begin_line": 218,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 13)-(line 219,col 59)",
        "(line 220,col 13)-(line 225,col 13)",
        "(line 226,col 13)-(line 226,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.g(double, double[])",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 13)-(line 231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.ResetCheckingWrapper.resetState(double, double[])",
      "begin_line": 235,
      "end_line": 237,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 236,col 13)-(line 236,col 37)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FilteringWrapper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 242,
      "end_line": 274,
      "comment": " Step handler wrapper filtering out the isLast indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": " Wrapped step handler. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.FilteringWrapper(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 253,
      "end_line": 255,
      "comment": " Build a new instance.\n         * @param handler step handler to wrap\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 258,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.requiresDenseOutput()",
      "begin_line": 265,
      "end_line": 267,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 266,col 13)-(line 266,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.FilteringWrapper.reset()",
      "begin_line": 270,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 271,col 13)-(line 271,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StoringStepHandler",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 277,
      "end_line": 325,
      "comment": " Specialized step handler storing the first few steps. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Number of steps to store. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 286,
      "end_line": 286,
      "comment": " Counter for already stored steps. "
    },
    {
      "type": "field",
      "varNames": [
        "finalState"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " Final state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.StoringStepHandler(int)",
      "begin_line": 294,
      "end_line": 297,
      "comment": " Build a new instance.\n         * @param n number of steps to store\n         ",
      "child_ranges": [
        "(line 295,col 13)-(line 295,col 23)",
        "(line 296,col 13)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.restart()",
      "begin_line": 301,
      "end_line": 304,
      "comment": " Restart storage.\n         ",
      "child_ranges": [
        "(line 302,col 13)-(line 302,col 22)",
        "(line 303,col 13)-(line 303,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.getFinalState()",
      "begin_line": 309,
      "end_line": 311,
      "comment": " Get the final state.\n         * @return final state\n         ",
      "child_ranges": [
        "(line 310,col 13)-(line 310,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MultistepIntegrator.StoringStepHandler.handleStep(double, double[], double[], boolean)",
      "begin_line": 314,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 13)-(line 322,col 13)"
      ]
    }
  ]
}