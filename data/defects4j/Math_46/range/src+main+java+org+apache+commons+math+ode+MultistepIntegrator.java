{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 62,
      "end_line": 436,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n * \u003cp\u003eRather than storing several previous steps separately, this implementation uses\n * the Nordsieck vector with higher degrees scaled derivatives all taken at the same\n * step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity)\u003c/p\u003e\n * \u003cp\u003e\n * Multistep integrators with Nordsieck representation are highly sensitive to\n * large step changes because when the step is multiplied by factor a, the\n * k\u003csup\u003eth\u003c/sup\u003e component of the Nordsieck vector is multiplied by a\u003csup\u003ek\u003c/sup\u003e\n * and the last components are the least accurate ones. The default max growth\n * factor is therefore set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n * \u003c/p\u003e\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " First scaled derivative (h y\u0027). "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Nordsieck matrix of the higher scaled derivatives.\n     * \u003cp\u003e(h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ..., h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e)\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "nSteps"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Number of steps of the multistep method (excluding the one being computed). "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 109,
      "end_line": 135,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 84)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 125,col 72)",
        "(line 126,col 9)-(line 126,col 29)",
        "(line 128,col 9)-(line 128,col 27)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 132,col 29)",
        "(line 133,col 9)-(line 133,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 156,
      "end_line": 174,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 82)",
        "(line 162,col 9)-(line 164,col 71)",
        "(line 165,col 9)-(line 165,col 29)",
        "(line 167,col 9)-(line 167,col 27)",
        "(line 170,col 9)-(line 170,col 23)",
        "(line 171,col 9)-(line 171,col 29)",
        "(line 172,col 9)-(line 172,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starterIntegrator starter integrator\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(double, double[], double)",
      "begin_line": 210,
      "end_line": 233,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes one step using the underlying starter integrator,\n     * and initializes the Nordsieck vector at step start. The starter integrator\n     * purpose is only to establish initial conditions, it does not really change\n     * time by itself. The top level multistep integrator remains in charge of\n     * handling time propagation and events handling as it will starts its own\n     * computation right from the beginning. In a sense, the starter integrator\n     * can be seen as a dummy one and so it will never trigger any user event nor\n     * call any user step handler.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @throws MathIllegalStateException if the integrator cannot perform integration\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 37)",
        "(line 217,col 9)-(line 217,col 36)",
        "(line 220,col 9)-(line 220,col 76)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 243,
      "end_line": 245,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param h step size to use for scaling\n     * @param t first steps times\n     * @param y first steps states\n     * @param yDot first steps derivatives\n     * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n     * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMinReduction()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " Get the minimal reduction factor for stepsize control.\n     * @return minimal reduction factor\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMinReduction(double)",
      "begin_line": 257,
      "end_line": 259,
      "comment": " Set the minimal reduction factor for stepsize control.\n     * @param minReduction minimal reduction factor\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getMaxGrowth()",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Get the maximal growth factor for stepsize control.\n     * @return maximal growth factor\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setMaxGrowth(double)",
      "begin_line": 271,
      "end_line": 273,
      "comment": " Set the maximal growth factor for stepsize control.\n     * @param maxGrowth maximal growth factor\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getSafety()",
      "begin_line": 278,
      "end_line": 280,
      "comment": " Get the safety factor for stepsize control.\n     * @return safety factor\n     ",
      "child_ranges": [
        "(line 279,col 7)-(line 279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setSafety(double)",
      "begin_line": 285,
      "end_line": 287,
      "comment": " Set the safety factor for stepsize control.\n     * @param safety safety factor\n     ",
      "child_ranges": [
        "(line 286,col 7)-(line 286,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.computeStepGrowShrinkFactor(double)",
      "begin_line": 293,
      "end_line": 295,
      "comment": " Compute step grow/shrink factor according to normalized error.\n     * @param error normalized error of the current step\n     * @return grow/shrink factor for next step\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 298,
      "end_line": 310,
      "comment": " Transformer used to convert the first step to Nordsieck representation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckTransformer.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 307,
      "end_line": 309,
      "comment": " Initialize the high order scaled derivatives at step start.\n         * @param h step size to use for scaling\n         * @param t first steps times\n         * @param y first steps states\n         * @param yDot first steps derivatives\n         * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n         * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n         ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "NordsieckInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepHandler"
      ],
      "begin_line": 313,
      "end_line": 390,
      "comment": " Specialized step handler storing the first step. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Steps counter. "
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " First steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " First steps states. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " First steps derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.NordsieckInitializer(int, int)",
      "begin_line": 331,
      "end_line": 336,
      "comment": " Simple constructor.\n         * @param nSteps number of steps of the multistep method (excluding the one being computed)\n         * @param n problem dimension\n         ",
      "child_ranges": [
        "(line 332,col 13)-(line 332,col 27)",
        "(line 333,col 13)-(line 333,col 44)",
        "(line 334,col 13)-(line 334,col 47)",
        "(line 335,col 13)-(line 335,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 339,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 63)",
        "(line 342,col 13)-(line 342,col 62)",
        "(line 344,col 13)-(line 352,col 13)",
        "(line 355,col 13)-(line 355,col 20)",
        "(line 356,col 13)-(line 356,col 51)",
        "(line 357,col 13)-(line 357,col 28)",
        "(line 358,col 13)-(line 359,col 62)",
        "(line 360,col 13)-(line 361,col 65)",
        "(line 363,col 13)-(line 381,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.reset()",
      "begin_line": 386,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "InitializationCompletedMarkerException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.MathRuntimeException"
      ],
      "begin_line": 393,
      "end_line": 404,
      "comment": " Marker exception used ONLY to stop the starter integrator after first step. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException.InitializationCompletedMarkerException()",
      "begin_line": 400,
      "end_line": 402,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 401,col 13)-(line 401,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingDifferentialEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.ExtendedFirstOrderDifferentialEquations"
      ],
      "begin_line": 407,
      "end_line": 434,
      "comment": " Wrapper for differential equations, ensuring start evaluations are counted. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.CountingDifferentialEquations(int)",
      "begin_line": 415,
      "end_line": 417,
      "comment": " Simple constructor.\n         * @param dimension dimension of the problem\n         ",
      "child_ranges": [
        "(line 416,col 13)-(line 416,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 420,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 13)-(line 422,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.getDimension()",
      "begin_line": 426,
      "end_line": 428,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 13)-(line 427,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.getMainSetDimension()",
      "begin_line": 431,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 36)"
      ]
    }
  ]
}