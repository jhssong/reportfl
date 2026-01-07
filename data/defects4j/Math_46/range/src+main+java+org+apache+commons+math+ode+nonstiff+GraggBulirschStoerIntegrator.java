{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 96,
      "end_line": 948,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " overall cost of applying step reduction up to iteration k+1, in number of calls. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " interpolation order control parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 168,
      "end_line": 177,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 172,col 56)",
        "(line 173,col 5)-(line 173,col 40)",
        "(line 174,col 5)-(line 174,col 39)",
        "(line 175,col 5)-(line 175,col 32)",
        "(line 176,col 5)-(line 176,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 190,
      "end_line": 199,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 193,col 5)-(line 194,col 54)",
        "(line 195,col 5)-(line 195,col 40)",
        "(line 196,col 5)-(line 196,col 39)",
        "(line 197,col 5)-(line 197,col 32)",
        "(line 198,col 5)-(line 198,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 219,
      "end_line": 233,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performStabilityCheck if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxNumIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxNumChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stepsizeReductionFactor stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 45)",
        "(line 224,col 5)-(line 224,col 60)",
        "(line 225,col 5)-(line 225,col 62)",
        "(line 227,col 5)-(line 231,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 259,
      "end_line": 286,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param control1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 262,col 5)-(line 266,col 5)",
        "(line 268,col 5)-(line 272,col 5)",
        "(line 274,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 284,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 311,
      "end_line": 333,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maximalOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param control1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 314,col 5)-(line 316,col 5)",
        "(line 318,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 328,col 5)",
        "(line 331,col 5)-(line 331,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 336,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 34)",
        "(line 342,col 5)-(line 342,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int, org.apache.commons.math.analysis.solvers.UnivariateRealSolver)",
      "begin_line": 347,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 353,col 5)-(line 354,col 53)",
        "(line 357,col 5)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 362,
      "end_line": 396,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 34)",
        "(line 366,col 5)-(line 373,col 5)",
        "(line 376,col 5)-(line 378,col 5)",
        "(line 382,col 5)-(line 382,col 37)",
        "(line 383,col 5)-(line 385,col 5)",
        "(line 388,col 5)-(line 394,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 408,
      "end_line": 419,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationErrorForControl if true, interpolation error is used\n   * for stepsize control\n   * @param mudifControlParameter interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 411,col 5)-(line 411,col 65)",
        "(line 413,col 5)-(line 417,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 426,
      "end_line": 438,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update (can be shorter than state)\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 437,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 457,
      "end_line": 518,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array (can be shorter than state)\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws MathUserException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 463,col 5)-(line 463,col 40)",
        "(line 464,col 5)-(line 464,col 37)",
        "(line 465,col 5)-(line 465,col 40)",
        "(line 468,col 5)-(line 468,col 28)",
        "(line 469,col 5)-(line 472,col 5)",
        "(line 473,col 5)-(line 473,col 38)",
        "(line 476,col 5)-(line 509,col 5)",
        "(line 512,col 5)-(line 514,col 5)",
        "(line 516,col 5)-(line 516,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 527,
      "end_line": 544,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 531,col 5)-(line 537,col 5)",
        "(line 540,col 5)-(line 543,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 547,
      "end_line": 946,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 552,col 5)-(line 552,col 42)",
        "(line 553,col 5)-(line 553,col 28)",
        "(line 554,col 5)-(line 554,col 23)",
        "(line 555,col 5)-(line 555,col 35)",
        "(line 558,col 5)-(line 558,col 51)",
        "(line 559,col 5)-(line 559,col 51)",
        "(line 560,col 5)-(line 560,col 51)",
        "(line 561,col 5)-(line 561,col 51)",
        "(line 563,col 5)-(line 563,col 64)",
        "(line 564,col 5)-(line 564,col 62)",
        "(line 565,col 5)-(line 568,col 5)",
        "(line 570,col 5)-(line 570,col 61)",
        "(line 571,col 5)-(line 582,col 5)",
        "(line 584,col 5)-(line 586,col 5)",
        "(line 588,col 5)-(line 588,col 49)",
        "(line 589,col 5)-(line 589,col 79)",
        "(line 592,col 5)-(line 592,col 56)",
        "(line 593,col 5)-(line 593,col 25)",
        "(line 596,col 5)-(line 597,col 89)",
        "(line 598,col 5)-(line 598,col 69)",
        "(line 599,col 5)-(line 601,col 82)",
        "(line 604,col 5)-(line 607,col 70)",
        "(line 608,col 5)-(line 608,col 31)",
        "(line 610,col 5)-(line 610,col 19)",
        "(line 611,col 5)-(line 611,col 33)",
        "(line 612,col 5)-(line 612,col 48)",
        "(line 613,col 5)-(line 613,col 37)",
        "(line 614,col 5)-(line 614,col 36)",
        "(line 615,col 5)-(line 615,col 36)",
        "(line 616,col 5)-(line 616,col 45)",
        "(line 617,col 5)-(line 619,col 5)",
        "(line 620,col 5)-(line 620,col 31)",
        "(line 621,col 5)-(line 621,col 27)",
        "(line 622,col 5)-(line 622,col 23)",
        "(line 623,col 5)-(line 940,col 26)",
        "(line 942,col 5)-(line 942,col 38)",
        "(line 943,col 5)-(line 943,col 25)",
        "(line 944,col 5)-(line 944,col 20)"
      ]
    }
  ]
}