{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 59,
      "end_line": 404,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y(k)\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n * \u003cp\u003eRather than storing several previous steps separately, this implementation uses\n * the Nordsieck vector with higher degrees scaled derivatives all taken at the same\n * step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity)\u003c/p\u003e\n * \u003cp\u003e\n * Multistep integrators with Nordsieck representation are highly sensitive to\n * large step changes because when the step is multiplied by a factor a, the\n * k\u003csup\u003eth\u003c/sup\u003e component of the Nordsieck vector is multiplied by a\u003csup\u003ek\u003c/sup\u003e\n * and the last components are the least accurate ones. The default max growth\n * factor is therefore set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n * \u003c/p\u003e\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " First scaled derivative (h y\u0027). "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Nordsieck matrix of the higher scaled derivatives.\n     * \u003cp\u003e(h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ..., h\u003csup\u003ek\u003c/sup\u003e/k! y(k))\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "nSteps"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Number of steps of the multistep method (excluding the one being computed). "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 106,
      "end_line": 132,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 84)",
        "(line 114,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 122,col 72)",
        "(line 123,col 9)-(line 123,col 29)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 128,col 9)-(line 128,col 23)",
        "(line 129,col 9)-(line 129,col 29)",
        "(line 130,col 9)-(line 130,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 153,
      "end_line": 171,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 82)",
        "(line 159,col 9)-(line 161,col 71)",
        "(line 162,col 9)-(line 162,col 29)",
        "(line 164,col 9)-(line 164,col 27)",
        "(line 167,col 9)-(line 167,col 23)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 169,col 9)-(line 169,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starterIntegrator starter integrator\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(double, double[], double)",
      "begin_line": 209,
      "end_line": 235,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes one step using the underlying starter integrator,\n     * and initializes the Nordsieck vector at step start. The starter integrator\n     * purpose is only to establish initial conditions, it does not really change\n     * time by itself. The top level multistep integrator remains in charge of\n     * handling time propagation and events handling as it will starts its own\n     * computation right from the beginning. In a sense, the starter integrator\n     * can be seen as a dummy one and so it will never trigger any user event nor\n     * call any user step handler.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @throws IntegratorException if the integrator cannot perform integration\n     * @throws DerivativeException this exception is propagated to the caller if\n     * the underlying user function triggers one\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 219,col 9)-(line 219,col 68)",
        "(line 222,col 9)-(line 230,col 9)",
        "(line 233,col 9)-(line 233,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.initializeHighOrderDerivatives(double[], double[][])",
      "begin_line": 243,
      "end_line": 244,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param first first scaled derivative at step start\n     * @param multistep scaled derivatives after step start (hy\u00271, ..., hy\u0027k-1)\n     * will be modified\n     * @return high order scaled derivatives at step start\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMinReduction()",
      "begin_line": 249,
      "end_line": 251,
      "comment": " Get the minimal reduction factor for stepsize control.\n     * @return minimal reduction factor\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMinReduction(double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": " Set the minimal reduction factor for stepsize control.\n     * @param minReduction minimal reduction factor\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMaxGrowth()",
      "begin_line": 263,
      "end_line": 265,
      "comment": " Get the maximal growth factor for stepsize control.\n     * @return maximal growth factor\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMaxGrowth(double)",
      "begin_line": 270,
      "end_line": 272,
      "comment": " Set the maximal growth factor for stepsize control.\n     * @param maxGrowth maximal growth factor\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getSafety()",
      "begin_line": 277,
      "end_line": 279,
      "comment": " Get the safety factor for stepsize control.\n     * @return safety factor\n     ",
      "child_ranges": [
        "(line 278,col 7)-(line 278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setSafety(double)",
      "begin_line": 284,
      "end_line": 286,
      "comment": " Set the safety factor for stepsize control.\n     * @param safety safety factor\n     ",
      "child_ranges": [
        "(line 285,col 7)-(line 285,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.computeStepGrowShrinkFactor(double)",
      "begin_line": 292,
      "end_line": 294,
      "comment": " Compute step grow/shrink factor according to normalized error.\n     * @param error normalized error of the current step\n     * @return grow/shrink factor for next step\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 90)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 297,
      "end_line": 305,
      "comment": " Transformer used to convert the first step to Nordsieck representation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckTransformer.initializeHighOrderDerivatives(double[], double[][])",
      "begin_line": 304,
      "end_line": 304,
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
      "begin_line": 308,
      "end_line": 363,
      "comment": " Specialized step handler storing the first step. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Problem dimension. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.NordsieckInitializer(int)",
      "begin_line": 316,
      "end_line": 318,
      "comment": " Simple constructor.\n         * @param n problem dimension\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 317,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 321,
      "end_line": 351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 324,col 13)-(line 324,col 63)",
        "(line 325,col 13)-(line 325,col 62)",
        "(line 326,col 13)-(line 326,col 29)",
        "(line 327,col 13)-(line 327,col 53)",
        "(line 330,col 13)-(line 330,col 51)",
        "(line 331,col 13)-(line 331,col 71)",
        "(line 332,col 13)-(line 334,col 13)",
        "(line 337,col 13)-(line 337,col 62)",
        "(line 338,col 13)-(line 345,col 13)",
        "(line 346,col 13)-(line 346,col 74)",
        "(line 349,col 13)-(line 349,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.requiresDenseOutput()",
      "begin_line": 354,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.reset()",
      "begin_line": 359,
      "end_line": 361,
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
      "begin_line": 366,
      "end_line": 377,
      "comment": " Marker exception used ONLY to stop the starter integrator after first step. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException.InitializationCompletedMarkerException()",
      "begin_line": 373,
      "end_line": 375,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 374,col 13)-(line 374,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingDifferentialEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 380,
      "end_line": 402,
      "comment": " Wrapper for differential equations, ensuring start evaluations are counted. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.CountingDifferentialEquations(int)",
      "begin_line": 388,
      "end_line": 390,
      "comment": " Simple constructor.\n         * @param dimension dimension of the problem\n         ",
      "child_ranges": [
        "(line 389,col 13)-(line 389,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 393,
      "end_line": 396,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 395,col 13)-(line 395,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.getDimension()",
      "begin_line": 399,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 29)"
      ]
    }
  ]
}