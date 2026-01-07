{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 37,
      "end_line": 376,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "nSteps"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Number of steps of the multistep method (excluding the one being computed). "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " First scaled derivative (h y\u0027). "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Nordsieck matrix of the higher scaled derivatives.\n     * \u003cp\u003e(h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ..., h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 81,
      "end_line": 107,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 84)",
        "(line 89,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 97,col 72)",
        "(line 98,col 9)-(line 98,col 29)",
        "(line 100,col 9)-(line 100,col 27)",
        "(line 103,col 9)-(line 103,col 23)",
        "(line 104,col 9)-(line 104,col 29)",
        "(line 105,col 9)-(line 105,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 125,
      "end_line": 143,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 82)",
        "(line 131,col 9)-(line 133,col 71)",
        "(line 134,col 9)-(line 134,col 29)",
        "(line 136,col 9)-(line 136,col 27)",
        "(line 139,col 9)-(line 139,col 23)",
        "(line 140,col 9)-(line 140,col 29)",
        "(line 141,col 9)-(line 141,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starter starter integrator\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(double, double[], double)",
      "begin_line": 181,
      "end_line": 207,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes one step using the underlying starter integrator,\n     * and initializes the Nordsieck vector at step start. The starter integrator\n     * purpose is only to establish initial conditions, it does not really change\n     * time by itself. The top level multistep integrator remains in charge of\n     * handling time propagation and events handling as it will starts its own\n     * computation right from the beginning. In a sense, the starter integrator\n     * can be seen as a dummy one and so it will never trigger any user event nor\n     * call any user step handler.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 188,col 36)",
        "(line 191,col 9)-(line 191,col 68)",
        "(line 194,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.initializeHighOrderDerivatives(double[], double[][])",
      "begin_line": 215,
      "end_line": 216,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param first first scaled derivative at step start\n     * @param multistep scaled derivatives after step start (hy\u00271, ..., hy\u0027k-1)\n     * will be modified\n     * @return high order scaled derivatives at step start\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMinReduction()",
      "begin_line": 221,
      "end_line": 223,
      "comment": " Get the minimal reduction factor for stepsize control.\n     * @return minimal reduction factor\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMinReduction(double)",
      "begin_line": 228,
      "end_line": 230,
      "comment": " Set the minimal reduction factor for stepsize control.\n     * @param minReduction minimal reduction factor\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMaxGrowth()",
      "begin_line": 235,
      "end_line": 237,
      "comment": " Get the maximal growth factor for stepsize control.\n     * @return maximal growth factor\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMaxGrowth(double)",
      "begin_line": 242,
      "end_line": 244,
      "comment": " Set the maximal growth factor for stepsize control.\n     * @param maxGrowth maximal growth factor\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getSafety()",
      "begin_line": 249,
      "end_line": 251,
      "comment": " Get the safety factor for stepsize control.\n     * @return safety factor\n     ",
      "child_ranges": [
        "(line 250,col 7)-(line 250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setSafety(double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Set the safety factor for stepsize control.\n     * @param safety safety factor\n     ",
      "child_ranges": [
        "(line 257,col 7)-(line 257,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.computeStepGrowShrinkFactor(double)",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Compute step grow/shrink factor according to normalized error.\n     * @param error normalized error of the current step\n     * @return grow/shrink factor for next step\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 90)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 269,
      "end_line": 277,
      "comment": " Transformer used to convert the first step to Nordsieck representation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckTransformer.initializeHighOrderDerivatives(double[], double[][])",
      "begin_line": 276,
      "end_line": 276,
      "comment": " Initialize the high order scaled derivatives at step start.\n         * @param first first scaled derivative at step start\n         * @param multistep scaled derivatives after step start (hy\u00271, ..., hy\u0027k-1)\n         * will be modified\n         * @return high order derivatives at step start\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NordsieckInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 280,
      "end_line": 335,
      "comment": " Specialized step handler storing the first step. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": " Problem dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.NordsieckInitializer(int)",
      "begin_line": 288,
      "end_line": 290,
      "comment": " Simple constructor.\n         * @param n problem dimension\n         ",
      "child_ranges": [
        "(line 289,col 13)-(line 289,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 293,
      "end_line": 323,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 296,col 13)-(line 296,col 63)",
        "(line 297,col 13)-(line 297,col 62)",
        "(line 298,col 13)-(line 298,col 29)",
        "(line 299,col 13)-(line 299,col 53)",
        "(line 302,col 13)-(line 302,col 51)",
        "(line 303,col 13)-(line 303,col 71)",
        "(line 304,col 13)-(line 306,col 13)",
        "(line 309,col 13)-(line 309,col 62)",
        "(line 310,col 13)-(line 317,col 13)",
        "(line 318,col 13)-(line 318,col 74)",
        "(line 321,col 13)-(line 321,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.requiresDenseOutput()",
      "begin_line": 326,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 327,col 13)-(line 327,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.reset()",
      "begin_line": 331,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "InitializationCompletedMarkerException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.DerivativeException"
      ],
      "begin_line": 338,
      "end_line": 349,
      "comment": " Marker exception used ONLY to stop the starter integrator after first step. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException.InitializationCompletedMarkerException()",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 346,col 13)-(line 346,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingDifferentialEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 352,
      "end_line": 374,
      "comment": " Wrapper for differential equations, ensuring start evaluations are counted. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.CountingDifferentialEquations(int)",
      "begin_line": 360,
      "end_line": 362,
      "comment": " Simple constructor.\n         * @param dimension dimension of the problem\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 365,
      "end_line": 368,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 367,col 13)-(line 367,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.getDimension()",
      "begin_line": 371,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 372,col 13)-(line 372,col 29)"
      ]
    }
  ]
}