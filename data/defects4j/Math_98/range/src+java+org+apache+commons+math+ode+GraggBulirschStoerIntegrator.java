{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/GraggBulirschStoerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 87,
      "end_line": 1020,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Integrator method name. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double, double)",
      "begin_line": 107,
      "end_line": 116,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 74)",
        "(line 111,col 5)-(line 111,col 83)",
        "(line 112,col 5)-(line 112,col 40)",
        "(line 113,col 5)-(line 113,col 39)",
        "(line 114,col 5)-(line 114,col 32)",
        "(line 115,col 5)-(line 115,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.GraggBulirschStoerIntegrator(double, double, double[], double[])",
      "begin_line": 129,
      "end_line": 138,
      "comment": " Simple constructor.\n   * Build a Gragg-Bulirsch-Stoer integrator with the given step\n   * bounds. All tuning parameters are set to their default\n   * values. The default step handler does nothing.\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 72)",
        "(line 133,col 5)-(line 133,col 83)",
        "(line 134,col 5)-(line 134,col 40)",
        "(line 135,col 5)-(line 135,col 39)",
        "(line 136,col 5)-(line 136,col 32)",
        "(line 137,col 5)-(line 137,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStabilityCheck(boolean, int, int, double)",
      "begin_line": 158,
      "end_line": 172,
      "comment": " Set the stability check controls.\n   * \u003cp\u003eThe stability check is performed on the first few iterations of\n   * the extrapolation scheme. If this test fails, the step is rejected\n   * and the stepsize is reduced.\u003c/p\u003e\n   * \u003cp\u003eBy default, the test is performed, at most during two\n   * iterations at each step, and at most once for each of these\n   * iterations. The default stepsize reduction factor is 0.5.\u003c/p\u003e\n   * @param performTest if true, stability check will be performed,\n     if false, the check will be skipped\n   * @param maxIter maximal number of iterations for which checks are\n   * performed (the number of iterations is reset to default if negative\n   * or null)\n   * @param maxChecks maximal number of checks for each iteration\n   * (the number of checks is reset to default if negative or null)\n   * @param stabilityReduction stepsize reduction factor in case of\n   * failure (the factor is reset to default if lower than 0.0001 or\n   * greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 162,col 35)",
        "(line 163,col 5)-(line 163,col 54)",
        "(line 164,col 5)-(line 164,col 56)",
        "(line 166,col 5)-(line 170,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStepsizeControl(double, double, double, double)",
      "begin_line": 198,
      "end_line": 225,
      "comment": " Set the step size control factors.\n\n   * \u003cp\u003eThe new step size hNew is computed from the old one h by:\n   * \u003cpre\u003e\n   * hNew \u003d h * stepControl2 / (err/stepControl1)^(1/(2k+1))\n   * \u003c/pre\u003e\n   * where err is the scaled error and k the iteration number of the\n   * extrapolation scheme (counting from 0). The default values are\n   * 0.65 for stepControl1 and 0.94 for stepControl2.\u003c/p\u003e\n   * \u003cp\u003eThe step size is subject to the restriction:\n   * \u003cpre\u003e\n   * stepControl3^(1/(2k+1))/stepControl4 \u003c\u003d hNew/h \u003c\u003d 1/stepControl3^(1/(2k+1))\n   * \u003c/pre\u003e\n   * The default values are 0.02 for stepControl3 and 4.0 for\n   * stepControl4.\u003c/p\u003e\n   * @param stepControl1 first stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl2 second stepsize control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl3 third stepsize control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param stepControl4 fourth stepsize control factor (the factor\n   * is reset to default if lower than 1.0001 or greater than 999.9)\n   ",
      "child_ranges": [
        "(line 201,col 5)-(line 205,col 5)",
        "(line 207,col 5)-(line 211,col 5)",
        "(line 213,col 5)-(line 217,col 5)",
        "(line 219,col 5)-(line 223,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setOrderControl(int, double, double)",
      "begin_line": 250,
      "end_line": 272,
      "comment": " Set the order control parameters.\n   * \u003cp\u003eThe Gragg-Bulirsch-Stoer method changes both the step size and\n   * the order during integration, in order to minimize computation\n   * cost. Each extrapolation step increases the order by 2, so the\n   * maximal order that will be used is always even, it is twice the\n   * maximal number of columns in the extrapolation table.\u003c/p\u003e\n   * \u003cpre\u003e\n   * order is decreased if w(k-1) \u003c\u003d w(k)   * orderControl1\n   * order is increased if w(k)   \u003c\u003d w(k-1) * orderControl2\n   * \u003c/pre\u003e\n   * \u003cp\u003ewhere w is the table of work per unit step for each order\n   * (number of function calls divided by the step length), and k is\n   * the current order.\u003c/p\u003e\n   * \u003cp\u003eThe default maximal order after construction is 18 (i.e. the\n   * maximal number of columns is 9). The default values are 0.8 for\n   * orderControl1 and 0.9 for orderControl2.\u003c/p\u003e\n   * @param maxOrder maximal order in the extrapolation table (the\n   * maximal order is reset to default if order \u003c\u003d 6 or odd)\n   * @param orderControl1 first order control factor (the factor is\n   * reset to default if lower than 0.0001 or greater than 0.9999)\n   * @param orderControl2 second order control factor (the factor\n   * is reset to default if lower than 0.0001 or greater than 0.9999)\n   ",
      "child_ranges": [
        "(line 253,col 5)-(line 255,col 5)",
        "(line 257,col 5)-(line 261,col 5)",
        "(line 263,col 5)-(line 267,col 5)",
        "(line 270,col 5)-(line 270,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 279,
      "end_line": 287,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 34)",
        "(line 282,col 5)-(line 282,col 83)",
        "(line 285,col 5)-(line 285,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double, int)",
      "begin_line": 298,
      "end_line": 308,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   * @param maxIterationCount upper limit of the iteration count in\n   * the event time search\n   ",
      "child_ranges": [
        "(line 302,col 5)-(line 302,col 91)",
        "(line 303,col 5)-(line 303,col 83)",
        "(line 306,col 5)-(line 306,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.initializeArrays()",
      "begin_line": 311,
      "end_line": 352,
      "comment": " Initialize the integrator internal arrays. ",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 28)",
        "(line 315,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 334,col 5)",
        "(line 338,col 5)-(line 338,col 37)",
        "(line 339,col 5)-(line 341,col 5)",
        "(line 344,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.setInterpolationControl(boolean, int)",
      "begin_line": 364,
      "end_line": 375,
      "comment": " Set the interpolation order control parameter.\n   * The interpolation order for dense output is 2k - mudif + 1. The\n   * default value for mudif is 4 and the interpolation error is used\n   * in stepsize control by default.\n\n   * @param useInterpolationError if true, interpolation error is used\n   * for stepsize control\n   * @param mudif interpolation order control parameter (the parameter\n   * is reset to default if \u003c\u003d 0 or \u003e\u003d 7)\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 55)",
        "(line 369,col 5)-(line 373,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.getName()",
      "begin_line": 380,
      "end_line": 382,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.rescale(double[], double[], double[])",
      "begin_line": 389,
      "end_line": 401,
      "comment": " Update scaling array.\n   * @param y1 first state vector to use for scaling\n   * @param y2 second state vector to use for scaling\n   * @param scale scaling array to update\n   ",
      "child_ranges": [
        "(line 390,col 5)-(line 400,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.tryStep(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, int, double[], double[][], double[], double[], double[])",
      "begin_line": 421,
      "end_line": 483,
      "comment": " Perform integration over one step using substeps of a modified\n   * midpoint method.\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param step global step\n   * @param k iteration number (from 0 to sequence.length - 1)\n   * @param scale scaling array\n   * @param f placeholder where to put the state vector derivatives at each substep\n   *          (element 0 already contains initial derivative)\n   * @param yMiddle placeholder where to put the state vector at the middle of the step\n   * @param yEnd placeholder where to put the state vector at the end\n   * @param yTmp placeholder for one state vector\n   * @return true if computation was done properly,\n   *         false if stability check failed before end of computation\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 428,col 5)-(line 428,col 34)",
        "(line 429,col 5)-(line 429,col 31)",
        "(line 430,col 5)-(line 430,col 34)",
        "(line 433,col 5)-(line 433,col 28)",
        "(line 434,col 5)-(line 437,col 5)",
        "(line 438,col 5)-(line 438,col 48)",
        "(line 441,col 5)-(line 474,col 5)",
        "(line 477,col 5)-(line 479,col 5)",
        "(line 481,col 5)-(line 481,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.extrapolate(int, int, double[][], double[])",
      "begin_line": 492,
      "end_line": 508,
      "comment": " Extrapolate a vector.\n   * @param offset offset to use in the coefficients table\n   * @param k index of the last updated point\n   * @param diag working diagonal of the Aitken-Neville\u0027s\n   * triangle, without the last element\n   * @param last last element\n   ",
      "child_ranges": [
        "(line 495,col 5)-(line 501,col 5)",
        "(line 504,col 5)-(line 507,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 526,
      "end_line": 959,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 530,col 5)-(line 530,col 42)",
        "(line 531,col 5)-(line 531,col 31)",
        "(line 534,col 5)-(line 534,col 45)",
        "(line 535,col 5)-(line 535,col 45)",
        "(line 536,col 5)-(line 536,col 45)",
        "(line 537,col 5)-(line 537,col 45)",
        "(line 539,col 5)-(line 539,col 58)",
        "(line 540,col 5)-(line 540,col 56)",
        "(line 541,col 5)-(line 544,col 5)",
        "(line 546,col 5)-(line 546,col 55)",
        "(line 547,col 5)-(line 558,col 5)",
        "(line 560,col 5)-(line 562,col 5)",
        "(line 564,col 5)-(line 564,col 31)",
        "(line 565,col 5)-(line 565,col 31)",
        "(line 566,col 5)-(line 575,col 5)",
        "(line 578,col 5)-(line 578,col 43)",
        "(line 579,col 5)-(line 579,col 25)",
        "(line 582,col 5)-(line 583,col 89)",
        "(line 584,col 5)-(line 584,col 70)",
        "(line 585,col 5)-(line 587,col 78)",
        "(line 589,col 5)-(line 589,col 49)",
        "(line 590,col 5)-(line 596,col 5)",
        "(line 597,col 5)-(line 597,col 31)",
        "(line 599,col 5)-(line 599,col 19)",
        "(line 600,col 5)-(line 600,col 33)",
        "(line 601,col 5)-(line 601,col 48)",
        "(line 602,col 5)-(line 602,col 37)",
        "(line 603,col 5)-(line 603,col 36)",
        "(line 604,col 5)-(line 604,col 36)",
        "(line 605,col 5)-(line 605,col 37)",
        "(line 606,col 5)-(line 606,col 45)",
        "(line 607,col 5)-(line 607,col 20)",
        "(line 608,col 5)-(line 608,col 27)",
        "(line 609,col 5)-(line 957,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "maxOrder"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": " maximal order. "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": " step size sequence. "
    },
    {
      "type": "field",
      "varNames": [
        "costPerStep"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": " overall cost of applying step reduction up to iteration k+1,\n   *  in number of calls.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "costPerTimeUnit"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": " cost per unit step. "
    },
    {
      "type": "field",
      "varNames": [
        "optimalStep"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " optimal steps for each order. "
    },
    {
      "type": "field",
      "varNames": [
        "coeff"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": " extrapolation coefficients. "
    },
    {
      "type": "field",
      "varNames": [
        "performTest"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " stability check enabling parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxChecks"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": " maximal number of checks for each iteration. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIter"
      ],
      "begin_line": 988,
      "end_line": 988,
      "comment": " maximal number of iterations for which checks are performed. "
    },
    {
      "type": "field",
      "varNames": [
        "stabilityReduction"
      ],
      "begin_line": 991,
      "end_line": 991,
      "comment": " stepsize reduction factor in case of stability check failure. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl1"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": " first stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl2"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": " second stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl3"
      ],
      "begin_line": 1000,
      "end_line": 1000,
      "comment": " third stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "stepControl4"
      ],
      "begin_line": 1003,
      "end_line": 1003,
      "comment": " fourth stepsize control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl1"
      ],
      "begin_line": 1006,
      "end_line": 1006,
      "comment": " first order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "orderControl2"
      ],
      "begin_line": 1009,
      "end_line": 1009,
      "comment": " second order control factor. "
    },
    {
      "type": "field",
      "varNames": [
        "denseOutput"
      ],
      "begin_line": 1012,
      "end_line": 1012,
      "comment": " dense outpute required. "
    },
    {
      "type": "field",
      "varNames": [
        "useInterpolationError"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": " use interpolation error in stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "mudif"
      ],
      "begin_line": 1018,
      "end_line": 1018,
      "comment": " interpolation order control parameter. "
    }
  ]
}