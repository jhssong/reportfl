{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 95,
      "end_line": 1004,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 111,
      "end_line": 121,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 115,col 56)",
        "(line 116,col 5)-(line 116,col 79)",
        "(line 117,col 5)-(line 117,col 40)",
        "(line 118,col 5)-(line 118,col 39)",
        "(line 119,col 5)-(line 119,col 32)",
        "(line 120,col 5)-(line 120,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 134,
      "end_line": 144,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 137,col 5)-(line 138,col 54)",
        "(line 139,col 5)-(line 139,col 79)",
        "(line 140,col 5)-(line 140,col 40)",
        "(line 141,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 142,col 32)",
        "(line 143,col 5)-(line 143,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 164,
      "end_line": 178,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performTest if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stabilityReduction stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 168,col 5)-(line 168,col 35)",
        "(line 169,col 5)-(line 169,col 54)",
        "(line 170,col 5)-(line 170,col 56)",
        "(line 172,col 5)-(line 176,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 204,
      "end_line": 231,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param stepControl1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 211,col 5)",
        "(line 213,col 5)-(line 217,col 5)",
        "(line 219,col 5)-(line 223,col 5)",
        "(line 225,col 5)-(line 229,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 256,
      "end_line": 278,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maxOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param orderControl1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param orderControl2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 259,col 5)-(line 261,col 5)",
        "(line 263,col 5)-(line 267,col 5)",
        "(line 269,col 5)-(line 273,col 5)",
        "(line 276,col 5)-(line 276,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 281,
      "end_line": 290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 284,col 5)-(line 284,col 34)",
        "(line 285,col 5)-(line 285,col 79)",
        "(line 288,col 5)-(line 288,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 293,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 86)",
        "(line 299,col 5)-(line 299,col 79)",
        "(line 302,col 5)-(line 302,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 307,
      "end_line": 348,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 34)",
        "(line 311,col 5)-(line 318,col 5)",
        "(line 320,col 5)-(line 330,col 5)",
        "(line 334,col 5)-(line 334,col 37)",
        "(line 335,col 5)-(line 337,col 5)",
        "(line 340,col 5)-(line 346,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 360,
      "end_line": 371,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationError if true, interpolation error is used\n   * for stepsize control\n   * @param mudif interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 55)",
        "(line 365,col 5)-(line 369,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 378,
      "end_line": 390,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update\n   ",
      "child_ranges": [
        "(line 379,col 5)-(line 389,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 409,
      "end_line": 470,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 415,col 5)-(line 415,col 40)",
        "(line 416,col 5)-(line 416,col 37)",
        "(line 417,col 5)-(line 417,col 40)",
        "(line 420,col 5)-(line 420,col 28)",
        "(line 421,col 5)-(line 424,col 5)",
        "(line 425,col 5)-(line 425,col 38)",
        "(line 428,col 5)-(line 461,col 5)",
        "(line 464,col 5)-(line 466,col 5)",
        "(line 468,col 5)-(line 468,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 479,
      "end_line": 496,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 483,col 5)-(line 489,col 5)",
        "(line 492,col 5)-(line 495,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 499,
      "end_line": 943,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 504,col 5)-(line 504,col 42)",
        "(line 505,col 5)-(line 505,col 28)",
        "(line 506,col 5)-(line 506,col 23)",
        "(line 507,col 5)-(line 507,col 37)",
        "(line 510,col 5)-(line 510,col 51)",
        "(line 511,col 5)-(line 511,col 51)",
        "(line 512,col 5)-(line 512,col 51)",
        "(line 513,col 5)-(line 513,col 51)",
        "(line 515,col 5)-(line 515,col 64)",
        "(line 516,col 5)-(line 516,col 62)",
        "(line 517,col 5)-(line 520,col 5)",
        "(line 522,col 5)-(line 522,col 61)",
        "(line 523,col 5)-(line 534,col 5)",
        "(line 536,col 5)-(line 538,col 5)",
        "(line 540,col 5)-(line 540,col 31)",
        "(line 541,col 5)-(line 541,col 31)",
        "(line 542,col 5)-(line 551,col 5)",
        "(line 554,col 5)-(line 554,col 49)",
        "(line 555,col 5)-(line 555,col 25)",
        "(line 558,col 5)-(line 559,col 89)",
        "(line 560,col 5)-(line 560,col 76)",
        "(line 561,col 5)-(line 563,col 78)",
        "(line 565,col 5)-(line 565,col 49)",
        "(line 566,col 5)-(line 572,col 5)",
        "(line 573,col 5)-(line 573,col 31)",
        "(line 575,col 5)-(line 575,col 19)",
        "(line 576,col 5)-(line 576,col 33)",
        "(line 577,col 5)-(line 577,col 48)",
        "(line 578,col 5)-(line 578,col 37)",
        "(line 579,col 5)-(line 579,col 36)",
        "(line 580,col 5)-(line 580,col 36)",
        "(line 581,col 5)-(line 581,col 37)",
        "(line 582,col 5)-(line 582,col 45)",
        "(line 583,col 5)-(line 585,col 5)",
        "(line 586,col 5)-(line 586,col 27)",
        "(line 587,col 5)-(line 939,col 5)",
        "(line 941,col 5)-(line 941,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 949,
      "end_line": 949,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 954,
      "end_line": 954,
      "comment": " overall cost of applying step reduction up to iteration k+1,\n   *  in number of calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 984,
      "end_line": 984,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "denseOutput"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": " dense outpute required. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": " interpolation order control parameter. "
    }
  ]
}