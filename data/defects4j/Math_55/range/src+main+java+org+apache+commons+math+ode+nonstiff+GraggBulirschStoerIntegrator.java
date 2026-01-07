{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 95,
      "end_line": 964,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " overall cost of applying step reduction up to iteration k+1, in number of calls. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " interpolation order control parameter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 165,
      "end_line": 174,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 168,col 5)-(line 169,col 56)",
        "(line 170,col 5)-(line 170,col 40)",
        "(line 171,col 5)-(line 171,col 39)",
        "(line 172,col 5)-(line 172,col 32)",
        "(line 173,col 5)-(line 173,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 187,
      "end_line": 196,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 190,col 5)-(line 191,col 54)",
        "(line 192,col 5)-(line 192,col 40)",
        "(line 193,col 5)-(line 193,col 39)",
        "(line 194,col 5)-(line 194,col 32)",
        "(line 195,col 5)-(line 195,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 216,
      "end_line": 230,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performStabilityCheck if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxNumIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxNumChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stepsizeReductionFactor stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 220,col 45)",
        "(line 221,col 5)-(line 221,col 60)",
        "(line 222,col 5)-(line 222,col 62)",
        "(line 224,col 5)-(line 228,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 256,
      "end_line": 283,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param control1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 263,col 5)",
        "(line 265,col 5)-(line 269,col 5)",
        "(line 271,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 281,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 308,
      "end_line": 330,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maximalOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param control1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param control2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 311,col 5)-(line 313,col 5)",
        "(line 315,col 5)-(line 319,col 5)",
        "(line 321,col 5)-(line 325,col 5)",
        "(line 328,col 5)-(line 328,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 333,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 336,col 5)-(line 336,col 34)",
        "(line 339,col 5)-(line 339,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 344,
      "end_line": 354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 86)",
        "(line 352,col 5)-(line 352,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 357,
      "end_line": 398,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 34)",
        "(line 361,col 5)-(line 368,col 5)",
        "(line 370,col 5)-(line 380,col 5)",
        "(line 384,col 5)-(line 384,col 37)",
        "(line 385,col 5)-(line 387,col 5)",
        "(line 390,col 5)-(line 396,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 410,
      "end_line": 421,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationErrorForControl if true, interpolation error is used\n   * for stepsize control\n   * @param mudifControlParameter interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 413,col 5)-(line 413,col 65)",
        "(line 415,col 5)-(line 419,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 428,
      "end_line": 440,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update (can be shorter than state)\n   ",
      "child_ranges": [
        "(line 429,col 5)-(line 439,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 459,
      "end_line": 520,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array (can be shorter than state)\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws MathUserException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 465,col 5)-(line 465,col 40)",
        "(line 466,col 5)-(line 466,col 37)",
        "(line 467,col 5)-(line 467,col 40)",
        "(line 470,col 5)-(line 470,col 28)",
        "(line 471,col 5)-(line 474,col 5)",
        "(line 475,col 5)-(line 475,col 38)",
        "(line 478,col 5)-(line 511,col 5)",
        "(line 514,col 5)-(line 516,col 5)",
        "(line 518,col 5)-(line 518,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 529,
      "end_line": 546,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 533,col 5)-(line 539,col 5)",
        "(line 542,col 5)-(line 545,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 549,
      "end_line": 962,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 554,col 5)-(line 554,col 42)",
        "(line 555,col 5)-(line 555,col 28)",
        "(line 556,col 5)-(line 556,col 23)",
        "(line 557,col 5)-(line 557,col 35)",
        "(line 560,col 5)-(line 560,col 51)",
        "(line 561,col 5)-(line 561,col 51)",
        "(line 562,col 5)-(line 562,col 51)",
        "(line 563,col 5)-(line 563,col 51)",
        "(line 565,col 5)-(line 565,col 64)",
        "(line 566,col 5)-(line 566,col 62)",
        "(line 567,col 5)-(line 570,col 5)",
        "(line 572,col 5)-(line 572,col 61)",
        "(line 573,col 5)-(line 584,col 5)",
        "(line 586,col 5)-(line 588,col 5)",
        "(line 590,col 5)-(line 590,col 48)",
        "(line 591,col 5)-(line 591,col 31)",
        "(line 592,col 5)-(line 592,col 54)",
        "(line 593,col 5)-(line 601,col 5)",
        "(line 604,col 5)-(line 604,col 56)",
        "(line 605,col 5)-(line 605,col 25)",
        "(line 608,col 5)-(line 609,col 89)",
        "(line 610,col 5)-(line 610,col 69)",
        "(line 611,col 5)-(line 613,col 82)",
        "(line 616,col 5)-(line 616,col 49)",
        "(line 617,col 5)-(line 623,col 5)",
        "(line 624,col 5)-(line 624,col 31)",
        "(line 626,col 5)-(line 626,col 19)",
        "(line 627,col 5)-(line 627,col 33)",
        "(line 628,col 5)-(line 628,col 48)",
        "(line 629,col 5)-(line 629,col 37)",
        "(line 630,col 5)-(line 630,col 36)",
        "(line 631,col 5)-(line 631,col 36)",
        "(line 632,col 5)-(line 632,col 45)",
        "(line 633,col 5)-(line 635,col 5)",
        "(line 636,col 5)-(line 636,col 31)",
        "(line 637,col 5)-(line 637,col 27)",
        "(line 638,col 5)-(line 638,col 23)",
        "(line 639,col 5)-(line 956,col 26)",
        "(line 958,col 5)-(line 958,col 38)",
        "(line 959,col 5)-(line 959,col 25)",
        "(line 960,col 5)-(line 960,col 20)"
      ]
    }
  ]
}