{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 87,
      "end_line": 1019,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 103,
      "end_line": 113,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 74)",
        "(line 107,col 5)-(line 108,col 53)",
        "(line 109,col 5)-(line 109,col 40)",
        "(line 110,col 5)-(line 110,col 39)",
        "(line 111,col 5)-(line 111,col 32)",
        "(line 112,col 5)-(line 112,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 126,
      "end_line": 136,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 72)",
        "(line 130,col 5)-(line 131,col 53)",
        "(line 132,col 5)-(line 132,col 40)",
        "(line 133,col 5)-(line 133,col 39)",
        "(line 134,col 5)-(line 134,col 32)",
        "(line 135,col 5)-(line 135,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 156,
      "end_line": 170,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performTest if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stabilityReduction stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 35)",
        "(line 161,col 5)-(line 161,col 54)",
        "(line 162,col 5)-(line 162,col 56)",
        "(line 164,col 5)-(line 168,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 196,
      "end_line": 223,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param stepControl1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 203,col 5)",
        "(line 205,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 215,col 5)",
        "(line 217,col 5)-(line 221,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 248,
      "end_line": 270,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maxOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param orderControl1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param orderControl2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 251,col 5)-(line 253,col 5)",
        "(line 255,col 5)-(line 259,col 5)",
        "(line 261,col 5)-(line 265,col 5)",
        "(line 268,col 5)-(line 268,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 277,
      "end_line": 286,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 34)",
        "(line 280,col 5)-(line 281,col 53)",
        "(line 284,col 5)-(line 284,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double)",
      "begin_line": 295,
      "end_line": 305,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 72)",
        "(line 299,col 5)-(line 300,col 53)",
        "(line 303,col 5)-(line 303,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 308,
      "end_line": 349,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 310,col 5)-(line 310,col 28)",
        "(line 312,col 5)-(line 319,col 5)",
        "(line 321,col 5)-(line 331,col 5)",
        "(line 335,col 5)-(line 335,col 37)",
        "(line 336,col 5)-(line 338,col 5)",
        "(line 341,col 5)-(line 347,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 361,
      "end_line": 372,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationError if true, interpolation error is used\n   * for stepsize control\n   * @param mudif interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 364,col 5)-(line 364,col 55)",
        "(line 366,col 5)-(line 370,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.getName()",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 386,
      "end_line": 398,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update\n   ",
      "child_ranges": [
        "(line 387,col 5)-(line 397,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.tryStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 418,
      "end_line": 480,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 425,col 5)-(line 425,col 34)",
        "(line 426,col 5)-(line 426,col 31)",
        "(line 427,col 5)-(line 427,col 34)",
        "(line 430,col 5)-(line 430,col 28)",
        "(line 431,col 5)-(line 434,col 5)",
        "(line 435,col 5)-(line 435,col 48)",
        "(line 438,col 5)-(line 471,col 5)",
        "(line 474,col 5)-(line 476,col 5)",
        "(line 478,col 5)-(line 478,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 489,
      "end_line": 505,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 492,col 5)-(line 498,col 5)",
        "(line 501,col 5)-(line 504,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 507,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 512,col 5)-(line 520,col 5)",
        "(line 521,col 5)-(line 526,col 5)",
        "(line 528,col 5)-(line 528,col 31)",
        "(line 531,col 5)-(line 531,col 45)",
        "(line 532,col 5)-(line 532,col 45)",
        "(line 533,col 5)-(line 533,col 45)",
        "(line 534,col 5)-(line 534,col 45)",
        "(line 536,col 5)-(line 536,col 58)",
        "(line 537,col 5)-(line 537,col 56)",
        "(line 538,col 5)-(line 541,col 5)",
        "(line 543,col 5)-(line 543,col 55)",
        "(line 544,col 5)-(line 555,col 5)",
        "(line 557,col 5)-(line 559,col 5)",
        "(line 561,col 5)-(line 561,col 31)",
        "(line 562,col 5)-(line 562,col 31)",
        "(line 563,col 5)-(line 572,col 5)",
        "(line 575,col 5)-(line 575,col 43)",
        "(line 576,col 5)-(line 576,col 25)",
        "(line 579,col 5)-(line 583,col 35)",
        "(line 584,col 5)-(line 586,col 78)",
        "(line 588,col 5)-(line 588,col 49)",
        "(line 589,col 5)-(line 595,col 5)",
        "(line 596,col 5)-(line 596,col 31)",
        "(line 598,col 5)-(line 598,col 34)",
        "(line 599,col 5)-(line 599,col 33)",
        "(line 600,col 5)-(line 600,col 48)",
        "(line 601,col 5)-(line 601,col 37)",
        "(line 602,col 5)-(line 602,col 36)",
        "(line 603,col 5)-(line 603,col 36)",
        "(line 604,col 5)-(line 604,col 37)",
        "(line 605,col 5)-(line 605,col 45)",
        "(line 606,col 5)-(line 606,col 20)",
        "(line 607,col 5)-(line 607,col 27)",
        "(line 608,col 5)-(line 956,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " overall cost of applying step reduction up to iteration k+1,\n   *  in number of calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 984,
      "end_line": 984,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 1005,
      "end_line": 1005,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 1008,
      "end_line": 1008,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "denseOutput"
      ],
      "begin_line": 1011,
      "end_line": 1011,
      "comment": " dense outpute required. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 1014,
      "end_line": 1014,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 1017,
      "end_line": 1017,
      "comment": " interpolation order control parameter. "
    }
  ]
}