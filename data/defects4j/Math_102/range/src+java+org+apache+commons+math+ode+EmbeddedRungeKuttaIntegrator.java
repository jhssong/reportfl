{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 57,
      "end_line": 385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 73,
      "end_line": 95,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 74)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 83,col 23)",
        "(line 84,col 5)-(line 84,col 23)",
        "(line 85,col 5)-(line 85,col 23)",
        "(line 86,col 5)-(line 86,col 31)",
        "(line 88,col 5)-(line 88,col 28)",
        "(line 91,col 5)-(line 91,col 19)",
        "(line 92,col 5)-(line 92,col 25)",
        "(line 93,col 5)-(line 93,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 110,
      "end_line": 132,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 72)",
        "(line 119,col 5)-(line 119,col 26)",
        "(line 120,col 5)-(line 120,col 23)",
        "(line 121,col 5)-(line 121,col 23)",
        "(line 122,col 5)-(line 122,col 23)",
        "(line 123,col 5)-(line 123,col 31)",
        "(line 125,col 5)-(line 125,col 28)",
        "(line 128,col 5)-(line 128,col 19)",
        "(line 129,col 5)-(line 129,col 25)",
        "(line 130,col 5)-(line 130,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getName()",
      "begin_line": 137,
      "end_line": 137,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 142,
      "end_line": 142,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 154,
      "end_line": 156,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 158,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 42)",
        "(line 164,col 5)-(line 164,col 31)",
        "(line 167,col 5)-(line 167,col 30)",
        "(line 168,col 5)-(line 170,col 5)",
        "(line 171,col 5)-(line 171,col 44)",
        "(line 172,col 5)-(line 174,col 5)",
        "(line 175,col 5)-(line 175,col 42)",
        "(line 178,col 5)-(line 178,col 42)",
        "(line 179,col 5)-(line 185,col 5)",
        "(line 186,col 5)-(line 186,col 31)",
        "(line 188,col 5)-(line 188,col 20)",
        "(line 189,col 5)-(line 189,col 26)",
        "(line 190,col 5)-(line 190,col 29)",
        "(line 191,col 5)-(line 191,col 21)",
        "(line 192,col 5)-(line 192,col 20)",
        "(line 193,col 5)-(line 313,col 25)",
        "(line 315,col 5)-(line 315,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 322,
      "end_line": 324,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 323,col 5)-(line 323,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 329,
      "end_line": 331,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 330,col 5)-(line 330,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 336,
      "end_line": 338,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 343,
      "end_line": 345,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 344,col 5)-(line 344,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 354,
      "end_line": 356,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Maximal growth factor for stepsize control. "
    }
  ]
}