{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 97,
      "end_line": 950,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " overall cost of applying step reduction up to iteration k+1, in number of calls. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " interpolation order control parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 169,
      "end_line": 178,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 173,col 56)",
        "(line 174,col 5)-(line 174,col 40)",
        "(line 175,col 5)-(line 175,col 38)",
        "(line 176,col 5)-(line 176,col 32)",
        "(line 177,col 5)-(line 177,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 191,
      "end_line": 200,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 195,col 54)",
        "(line 196,col 5)-(line 196,col 40)",
        "(line 197,col 5)-(line 197,col 38)",
        "(line 198,col 5)-(line 198,col 32)",
        "(line 199,col 5)-(line 199,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 220,
      "end_line": 234,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performStabilityCheck if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxNumIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxNumChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stepsizeReductionFactor stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 45)",
        "(line 225,col 5)-(line 225,col 60)",
        "(line 226,col 5)-(line 226,col 62)",
        "(line 228,col 5)-(line 232,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.setControlFactors(double, double, double, double)",
      "begin_line": 260,
      "end_line": 287,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param control1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 263,col 5)-(line 267,col 5)",
        "(line 269,col 5)-(line 273,col 5)",
        "(line 275,col 5)-(line 279,col 5)",
        "(line 281,col 5)-(line 285,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 312,
      "end_line": 334,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maximalOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param control1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 315,col 5)-(line 317,col 5)",
        "(line 319,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 329,col 5)",
        "(line 332,col 5)-(line 332,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addStepHandler(org.apache.commons.math3.ode.sampling.StepHandler)",
      "begin_line": 337,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 5)-(line 340,col 34)",
        "(line 343,col 5)-(line 343,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math3.ode.events.EventHandler, double, double, int, org.apache.commons.math3.analysis.solvers.UnivariateSolver)",
      "begin_line": 348,
      "end_line": 360,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 5)-(line 355,col 53)",
        "(line 358,col 5)-(line 358,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 363,
      "end_line": 397,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 34)",
        "(line 367,col 5)-(line 374,col 5)",
        "(line 377,col 5)-(line 379,col 5)",
        "(line 383,col 5)-(line 383,col 37)",
        "(line 384,col 5)-(line 386,col 5)",
        "(line 389,col 5)-(line 395,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 409,
      "end_line": 420,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationErrorForControl if true, interpolation error is used\n   * for stepsize control\n   * @param mudifControlParameter interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 412,col 5)-(line 412,col 65)",
        "(line 414,col 5)-(line 418,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 427,
      "end_line": 439,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update (can be shorter than state)\n   ",
      "child_ranges": [
        "(line 428,col 5)-(line 438,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 458,
      "end_line": 519,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array (can be shorter than state)\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   * @exception DimensionMismatchException if arrays dimensions do not match equations settings\n   ",
      "child_ranges": [
        "(line 464,col 5)-(line 464,col 40)",
        "(line 465,col 5)-(line 465,col 37)",
        "(line 466,col 5)-(line 466,col 40)",
        "(line 469,col 5)-(line 469,col 28)",
        "(line 470,col 5)-(line 473,col 5)",
        "(line 474,col 5)-(line 474,col 38)",
        "(line 477,col 5)-(line 510,col 5)",
        "(line 513,col 5)-(line 515,col 5)",
        "(line 517,col 5)-(line 517,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 528,
      "end_line": 545,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 532,col 5)-(line 538,col 5)",
        "(line 541,col 5)-(line 544,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 548,
      "end_line": 948,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 5)-(line 553,col 31)",
        "(line 554,col 5)-(line 554,col 28)",
        "(line 555,col 5)-(line 555,col 52)",
        "(line 558,col 5)-(line 558,col 58)",
        "(line 559,col 5)-(line 559,col 40)",
        "(line 560,col 5)-(line 560,col 50)",
        "(line 561,col 5)-(line 561,col 50)",
        "(line 562,col 5)-(line 562,col 50)",
        "(line 563,col 5)-(line 563,col 50)",
        "(line 565,col 5)-(line 565,col 64)",
        "(line 566,col 5)-(line 566,col 62)",
        "(line 567,col 5)-(line 570,col 5)",
        "(line 572,col 5)-(line 572,col 61)",
        "(line 573,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 588,col 5)",
        "(line 590,col 5)-(line 590,col 49)",
        "(line 591,col 5)-(line 591,col 79)",
        "(line 594,col 5)-(line 594,col 56)",
        "(line 595,col 5)-(line 595,col 25)",
        "(line 598,col 5)-(line 599,col 89)",
        "(line 600,col 5)-(line 600,col 69)",
        "(line 601,col 5)-(line 603,col 82)",
        "(line 606,col 5)-(line 611,col 84)",
        "(line 612,col 5)-(line 612,col 48)",
        "(line 614,col 5)-(line 614,col 36)",
        "(line 615,col 5)-(line 615,col 33)",
        "(line 616,col 5)-(line 616,col 48)",
        "(line 617,col 5)-(line 617,col 37)",
        "(line 618,col 5)-(line 618,col 36)",
        "(line 619,col 5)-(line 619,col 36)",
        "(line 620,col 5)-(line 620,col 45)",
        "(line 621,col 5)-(line 621,col 48)",
        "(line 622,col 5)-(line 622,col 27)",
        "(line 623,col 5)-(line 623,col 23)",
        "(line 624,col 5)-(line 940,col 26)",
        "(line 943,col 5)-(line 943,col 33)",
        "(line 944,col 5)-(line 944,col 34)",
        "(line 946,col 5)-(line 946,col 25)"
      ]
    }
  ]
}