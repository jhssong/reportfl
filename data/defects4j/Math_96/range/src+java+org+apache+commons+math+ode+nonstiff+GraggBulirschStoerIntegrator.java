{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 95,
      "end_line": 1001,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Integrator method name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 115,
      "end_line": 125,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 119,col 56)",
        "(line 120,col 5)-(line 120,col 79)",
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
      "end_line": 148,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 141,col 5)-(line 142,col 54)",
        "(line 143,col 5)-(line 143,col 79)",
        "(line 144,col 5)-(line 144,col 40)",
        "(line 145,col 5)-(line 145,col 39)",
        "(line 146,col 5)-(line 146,col 32)",
        "(line 147,col 5)-(line 147,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 168,
      "end_line": 182,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performTest if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stabilityReduction stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 35)",
        "(line 173,col 5)-(line 173,col 54)",
        "(line 174,col 5)-(line 174,col 56)",
        "(line 176,col 5)-(line 180,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 208,
      "end_line": 235,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param stepControl1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 215,col 5)",
        "(line 217,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 227,col 5)",
        "(line 229,col 5)-(line 233,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 260,
      "end_line": 282,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maxOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param orderControl1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param orderControl2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 263,col 5)-(line 265,col 5)",
        "(line 267,col 5)-(line 271,col 5)",
        "(line 273,col 5)-(line 277,col 5)",
        "(line 280,col 5)-(line 280,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addStepHandler(org.apache.commons.math.ode.sampling.StepHandler)",
      "begin_line": 285,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 34)",
        "(line 288,col 5)-(line 288,col 79)",
        "(line 291,col 5)-(line 291,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.addEventHandler(org.apache.commons.math.ode.events.EventHandler, double, double, int)",
      "begin_line": 296,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 86)",
        "(line 301,col 5)-(line 301,col 79)",
        "(line 304,col 5)-(line 304,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 309,
      "end_line": 350,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 34)",
        "(line 313,col 5)-(line 320,col 5)",
        "(line 322,col 5)-(line 332,col 5)",
        "(line 336,col 5)-(line 336,col 37)",
        "(line 337,col 5)-(line 339,col 5)",
        "(line 342,col 5)-(line 348,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 362,
      "end_line": 373,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationError if true, interpolation error is used\n   * for stepsize control\n   * @param mudif interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 365,col 5)-(line 365,col 55)",
        "(line 367,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 380,
      "end_line": 392,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 391,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.tryStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 412,
      "end_line": 474,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 419,col 5)-(line 419,col 40)",
        "(line 420,col 5)-(line 420,col 37)",
        "(line 421,col 5)-(line 421,col 40)",
        "(line 424,col 5)-(line 424,col 28)",
        "(line 425,col 5)-(line 428,col 5)",
        "(line 429,col 5)-(line 429,col 48)",
        "(line 432,col 5)-(line 465,col 5)",
        "(line 468,col 5)-(line 470,col 5)",
        "(line 472,col 5)-(line 472,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 483,
      "end_line": 500,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 487,col 5)-(line 493,col 5)",
        "(line 496,col 5)-(line 499,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 503,
      "end_line": 940,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 507,col 5)-(line 507,col 42)",
        "(line 508,col 5)-(line 508,col 37)",
        "(line 511,col 5)-(line 511,col 51)",
        "(line 512,col 5)-(line 512,col 51)",
        "(line 513,col 5)-(line 513,col 51)",
        "(line 514,col 5)-(line 514,col 51)",
        "(line 516,col 5)-(line 516,col 64)",
        "(line 517,col 5)-(line 517,col 62)",
        "(line 518,col 5)-(line 521,col 5)",
        "(line 523,col 5)-(line 523,col 61)",
        "(line 524,col 5)-(line 535,col 5)",
        "(line 537,col 5)-(line 539,col 5)",
        "(line 541,col 5)-(line 541,col 31)",
        "(line 542,col 5)-(line 542,col 31)",
        "(line 543,col 5)-(line 552,col 5)",
        "(line 555,col 5)-(line 555,col 49)",
        "(line 556,col 5)-(line 556,col 25)",
        "(line 559,col 5)-(line 560,col 89)",
        "(line 561,col 5)-(line 561,col 76)",
        "(line 562,col 5)-(line 564,col 78)",
        "(line 566,col 5)-(line 566,col 49)",
        "(line 567,col 5)-(line 573,col 5)",
        "(line 574,col 5)-(line 574,col 31)",
        "(line 576,col 5)-(line 576,col 19)",
        "(line 577,col 5)-(line 577,col 33)",
        "(line 578,col 5)-(line 578,col 48)",
        "(line 579,col 5)-(line 579,col 37)",
        "(line 580,col 5)-(line 580,col 36)",
        "(line 581,col 5)-(line 581,col 36)",
        "(line 582,col 5)-(line 582,col 37)",
        "(line 583,col 5)-(line 583,col 45)",
        "(line 584,col 5)-(line 586,col 5)",
        "(line 587,col 5)-(line 587,col 27)",
        "(line 588,col 5)-(line 936,col 5)",
        "(line 938,col 5)-(line 938,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 943,
      "end_line": 943,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 951,
      "end_line": 951,
      "comment": " overall cost of applying step reduction up to iteration k+1,\n   *  in number of calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 954,
      "end_line": 954,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 984,
      "end_line": 984,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "denseOutput"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": " dense outpute required. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": " interpolation order control parameter. "
    }
  ]
}