{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/ode/MultistepIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultistepIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 61,
      "end_line": 430,
      "comment": "\n * This class is the base class for multistep integrators for Ordinary\n * Differential Equations.\n * \u003cp\u003eWe define scaled derivatives s\u003csub\u003ei\u003c/sub\u003e(n) at step n as:\n * \u003cpre\u003e\n * s\u003csub\u003e1\u003c/sub\u003e(n) \u003d h y\u0027\u003csub\u003en\u003c/sub\u003e for first derivative\n * s\u003csub\u003e2\u003c/sub\u003e(n) \u003d h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e for second derivative\n * s\u003csub\u003e3\u003c/sub\u003e(n) \u003d h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e for third derivative\n * ...\n * s\u003csub\u003ek\u003c/sub\u003e(n) \u003d h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e for k\u003csup\u003eth\u003c/sup\u003e derivative\n * \u003c/pre\u003e\u003c/p\u003e\n * \u003cp\u003eRather than storing several previous steps separately, this implementation uses\n * the Nordsieck vector with higher degrees scaled derivatives all taken at the same\n * step (y\u003csub\u003en\u003c/sub\u003e, s\u003csub\u003e1\u003c/sub\u003e(n) and r\u003csub\u003en\u003c/sub\u003e) where r\u003csub\u003en\u003c/sub\u003e is defined as:\n * \u003cpre\u003e\n * r\u003csub\u003en\u003c/sub\u003e \u003d [ s\u003csub\u003e2\u003c/sub\u003e(n), s\u003csub\u003e3\u003c/sub\u003e(n) ... s\u003csub\u003ek\u003c/sub\u003e(n) ]\u003csup\u003eT\u003c/sup\u003e\n * \u003c/pre\u003e\n * (we omit the k index in the notation for clarity)\u003c/p\u003e\n * \u003cp\u003e\n * Multistep integrators with Nordsieck representation are highly sensitive to\n * large step changes because when the step is multiplied by factor a, the\n * k\u003csup\u003eth\u003c/sup\u003e component of the Nordsieck vector is multiplied by a\u003csup\u003ek\u003c/sup\u003e\n * and the last components are the least accurate ones. The default max growth\n * factor is therefore set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n * \u003c/p\u003e\n *\n * @see org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator\n * @see org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "scaled"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " First scaled derivative (h y\u0027). "
    },
    {
      "type": "field",
      "varNames": [
        "nordsieck"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Nordsieck matrix of the higher scaled derivatives.\n     * \u003cp\u003e(h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027, h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027 ..., h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e)\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "starter"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Starter integrator. "
    },
    {
      "type": "field",
      "varNames": [
        "nSteps"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Number of steps of the multistep method (excluding the one being computed). "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double, double)",
      "begin_line": 108,
      "end_line": 134,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param scalAbsoluteTolerance allowed absolute error\n     * @param scalRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 84)",
        "(line 116,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 124,col 72)",
        "(line 125,col 9)-(line 125,col 29)",
        "(line 127,col 9)-(line 127,col 27)",
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 131,col 29)",
        "(line 132,col 9)-(line 132,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.MultistepIntegrator(java.lang.String, int, int, double, double, double[], double[])",
      "begin_line": 155,
      "end_line": 173,
      "comment": "\n     * Build a multistep integrator with the given stepsize bounds.\n     * \u003cp\u003eThe default starter integrator is set to the {@link\n     * DormandPrince853Integrator Dormand-Prince 8(5,3)} integrator with\n     * some defaults settings.\u003c/p\u003e\n     * \u003cp\u003e\n     * The default max growth factor is set to a quite low value: 2\u003csup\u003e1/order\u003c/sup\u003e.\n     * \u003c/p\u003e\n     * @param name name of the method\n     * @param nSteps number of steps of the multistep method\n     * (excluding the one being computed)\n     * @param order order of the method\n     * @param minStep minimal step (must be positive even for backward\n     * integration), the last step can be smaller than this\n     * @param maxStep maximal step (must be positive even for backward\n     * integration)\n     * @param vecAbsoluteTolerance allowed absolute error\n     * @param vecRelativeTolerance allowed relative error\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 82)",
        "(line 161,col 9)-(line 163,col 71)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 166,col 9)-(line 166,col 27)",
        "(line 169,col 9)-(line 169,col 23)",
        "(line 170,col 9)-(line 170,col 29)",
        "(line 171,col 9)-(line 171,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.getStarterIntegrator()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Get the starter integrator.\n     * @return starter integrator\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.setStarterIntegrator(org.apache.commons.math.ode.FirstOrderIntegrator)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Set the starter integrator.\n     * \u003cp\u003eThe various step and event handlers for this starter integrator\n     * will be managed automatically by the multi-step integrator. Any\n     * user configuration for these elements will be cleared before use.\u003c/p\u003e\n     * @param starterIntegrator starter integrator\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.start(double, double[], double)",
      "begin_line": 209,
      "end_line": 232,
      "comment": " Start the integration.\n     * \u003cp\u003eThis method computes one step using the underlying starter integrator,\n     * and initializes the Nordsieck vector at step start. The starter integrator\n     * purpose is only to establish initial conditions, it does not really change\n     * time by itself. The top level multistep integrator remains in charge of\n     * handling time propagation and events handling as it will starts its own\n     * computation right from the beginning. In a sense, the starter integrator\n     * can be seen as a dummy one and so it will never trigger any user event nor\n     * call any user step handler.\u003c/p\u003e\n     * @param t0 initial time\n     * @param y0 initial value of the state vector at t0\n     * @param t target time for the integration\n     * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n     * @throws MathIllegalStateException if the integrator cannot perform integration\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 36)",
        "(line 219,col 9)-(line 219,col 76)",
        "(line 222,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 242,
      "end_line": 244,
      "comment": " Initialize the high order scaled derivatives at step start.\n     * @param h step size to use for scaling\n     * @param t first steps times\n     * @param y first steps states\n     * @param yDot first steps derivatives\n     * @return Nordieck vector at first step (h\u003csup\u003e2\u003c/sup\u003e/2 y\u0027\u0027\u003csub\u003en\u003c/sub\u003e,\n     * h\u003csup\u003e3\u003c/sup\u003e/6 y\u0027\u0027\u0027\u003csub\u003en\u003c/sub\u003e ... h\u003csup\u003ek\u003c/sup\u003e/k! y\u003csup\u003e(k)\u003c/sup\u003e\u003csub\u003en\u003c/sub\u003e)\n     ",
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
        "(line 293,col 9)-(line 293,col 102)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NordsieckTransformer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 297,
      "end_line": 309,
      "comment": " Transformer used to convert the first step to Nordsieck representation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckTransformer.initializeHighOrderDerivatives(double, double[], double[][], double[][])",
      "begin_line": 306,
      "end_line": 308,
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
      "begin_line": 312,
      "end_line": 389,
      "comment": " Specialized step handler storing the first step. "
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Steps counter. "
    },
    {
      "type": "field",
      "varNames": [
        "t"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " First steps times. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " First steps states. "
    },
    {
      "type": "field",
      "varNames": [
        "yDot"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " First steps derivatives. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.NordsieckInitializer(int, int)",
      "begin_line": 330,
      "end_line": 335,
      "comment": " Simple constructor.\n         * @param nSteps number of steps of the multistep method (excluding the one being computed)\n         * @param n problem dimension\n         ",
      "child_ranges": [
        "(line 331,col 13)-(line 331,col 27)",
        "(line 332,col 13)-(line 332,col 44)",
        "(line 333,col 13)-(line 333,col 47)",
        "(line 334,col 13)-(line 334,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.handleStep(org.apache.commons.math.ode.sampling.StepInterpolator, boolean)",
      "begin_line": 338,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 13)-(line 340,col 63)",
        "(line 341,col 13)-(line 341,col 62)",
        "(line 343,col 13)-(line 351,col 13)",
        "(line 354,col 13)-(line 354,col 20)",
        "(line 355,col 13)-(line 355,col 51)",
        "(line 356,col 13)-(line 356,col 28)",
        "(line 357,col 13)-(line 358,col 62)",
        "(line 359,col 13)-(line 360,col 65)",
        "(line 362,col 13)-(line 380,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.NordsieckInitializer.init(double, double[], double)",
      "begin_line": 385,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "InitializationCompletedMarkerException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 392,
      "end_line": 403,
      "comment": " Marker exception used ONLY to stop the starter integrator after first step. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.InitializationCompletedMarkerException.InitializationCompletedMarkerException()",
      "begin_line": 399,
      "end_line": 401,
      "comment": " Simple constructor. ",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingDifferentialEquations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations"
      ],
      "begin_line": 406,
      "end_line": 428,
      "comment": " Wrapper for differential equations, ensuring start evaluations are counted. "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " Dimension of the problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.CountingDifferentialEquations(int)",
      "begin_line": 414,
      "end_line": 416,
      "comment": " Simple constructor.\n         * @param dimension dimension of the problem\n         ",
      "child_ranges": [
        "(line 415,col 13)-(line 415,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.computeDerivatives(double, double[], double[])",
      "begin_line": 419,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MultistepIntegrator.CountingDifferentialEquations.getDimension()",
      "begin_line": 424,
      "end_line": 426,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 13)-(line 425,col 29)"
      ]
    }
  ]
}