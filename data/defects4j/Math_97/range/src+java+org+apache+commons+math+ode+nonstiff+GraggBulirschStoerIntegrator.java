{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 96,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Integrator method name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 116,
      "end_line": 125,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 74)",
        "(line 120,col 5)-(line 120,col 89)",
        "(line 121,col 5)-(line 121,col 40)",
        "(line 122,col 5)-(line 122,col 39)",
        "(line 123,col 5)-(line 123,col 32)",
        "(line 124,col 5)-(line 124,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 138,
      "end_line": 147,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 141,col 72)",
        "(line 142,col 5)-(line 142,col 89)",
        "(line 143,col 5)-(line 143,col 40)",
        "(line 144,col 5)-(line 144,col 39)",
        "(line 145,col 5)-(line 145,col 32)",
        "(line 146,col 5)-(line 146,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 167,
      "end_line": 181,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performTest if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stabilityReduction stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 35)",
        "(line 172,col 5)-(line 172,col 54)",
        "(line 173,col 5)-(line 173,col 56)",
        "(line 175,col 5)-(line 179,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 207,
      "end_line": 234,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param stepControl1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 214,col 5)",
        "(line 216,col 5)-(line 220,col 5)",
        "(line 222,col 5)-(line 226,col 5)",
        "(line 228,col 5)-(line 232,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 259,
      "end_line": 281,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maxOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param orderControl1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param orderControl2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 262,col 5)-(line 264,col 5)",
        "(line 266,col 5)-(line 270,col 5)",
        "(line 272,col 5)-(line 276,col 5)",
        "(line 279,col 5)-(line 279,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 288,
      "end_line": 296,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 34)",
        "(line 291,col 5)-(line 291,col 89)",
        "(line 294,col 5)-(line 294,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 299,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 86)",
        "(line 304,col 5)-(line 304,col 89)",
        "(line 307,col 5)-(line 307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 312,
      "end_line": 353,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 314,col 5)-(line 314,col 34)",
        "(line 316,col 5)-(line 323,col 5)",
        "(line 325,col 5)-(line 335,col 5)",
        "(line 339,col 5)-(line 339,col 37)",
        "(line 340,col 5)-(line 342,col 5)",
        "(line 345,col 5)-(line 351,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 365,
      "end_line": 376,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationError if true, interpolation error is used\n   * for stepsize control\n   * @param mudif interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 55)",
        "(line 370,col 5)-(line 374,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.getName()",
      "begin_line": 379,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 5)-(line 380,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 388,
      "end_line": 400,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update\n   ",
      "child_ranges": [
        "(line 389,col 5)-(line 399,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 420,
      "end_line": 482,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 427,col 5)-(line 427,col 40)",
        "(line 428,col 5)-(line 428,col 37)",
        "(line 429,col 5)-(line 429,col 40)",
        "(line 432,col 5)-(line 432,col 28)",
        "(line 433,col 5)-(line 436,col 5)",
        "(line 437,col 5)-(line 437,col 48)",
        "(line 440,col 5)-(line 473,col 5)",
        "(line 476,col 5)-(line 478,col 5)",
        "(line 480,col 5)-(line 480,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 491,
      "end_line": 508,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 501,col 5)",
        "(line 504,col 5)-(line 507,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 511,
      "end_line": 944,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 5)-(line 515,col 42)",
        "(line 516,col 5)-(line 516,col 37)",
        "(line 519,col 5)-(line 519,col 51)",
        "(line 520,col 5)-(line 520,col 51)",
        "(line 521,col 5)-(line 521,col 51)",
        "(line 522,col 5)-(line 522,col 51)",
        "(line 524,col 5)-(line 524,col 64)",
        "(line 525,col 5)-(line 525,col 62)",
        "(line 526,col 5)-(line 529,col 5)",
        "(line 531,col 5)-(line 531,col 61)",
        "(line 532,col 5)-(line 543,col 5)",
        "(line 545,col 5)-(line 547,col 5)",
        "(line 549,col 5)-(line 549,col 31)",
        "(line 550,col 5)-(line 550,col 31)",
        "(line 551,col 5)-(line 560,col 5)",
        "(line 563,col 5)-(line 563,col 49)",
        "(line 564,col 5)-(line 564,col 25)",
        "(line 567,col 5)-(line 568,col 89)",
        "(line 569,col 5)-(line 569,col 76)",
        "(line 570,col 5)-(line 572,col 78)",
        "(line 574,col 5)-(line 574,col 49)",
        "(line 575,col 5)-(line 581,col 5)",
        "(line 582,col 5)-(line 582,col 31)",
        "(line 584,col 5)-(line 584,col 19)",
        "(line 585,col 5)-(line 585,col 33)",
        "(line 586,col 5)-(line 586,col 48)",
        "(line 587,col 5)-(line 587,col 37)",
        "(line 588,col 5)-(line 588,col 36)",
        "(line 589,col 5)-(line 589,col 36)",
        "(line 590,col 5)-(line 590,col 37)",
        "(line 591,col 5)-(line 591,col 45)",
        "(line 592,col 5)-(line 592,col 20)",
        "(line 593,col 5)-(line 593,col 27)",
        "(line 594,col 5)-(line 942,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 947,
      "end_line": 947,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 950,
      "end_line": 950,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 955,
      "end_line": 955,
      "comment": " overall cost of applying step reduction up to iteration k+1,\n   *  in number of calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 967,
      "end_line": 967,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 988,
      "end_line": 988,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 991,
      "end_line": 991,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "denseOutput"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": " dense outpute required. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 1000,
      "end_line": 1000,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 1003,
      "end_line": 1003,
      "comment": " interpolation order control parameter. "
    }
  ]
}