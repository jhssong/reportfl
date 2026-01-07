{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 67,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 111,
      "end_line": 133,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 80)",
        "(line 120,col 5)-(line 120,col 26)",
        "(line 121,col 5)-(line 121,col 23)",
        "(line 122,col 5)-(line 122,col 23)",
        "(line 123,col 5)-(line 123,col 23)",
        "(line 124,col 5)-(line 124,col 31)",
        "(line 126,col 5)-(line 126,col 28)",
        "(line 129,col 5)-(line 129,col 19)",
        "(line 130,col 5)-(line 130,col 25)",
        "(line 131,col 5)-(line 131,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 149,
      "end_line": 171,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 78)",
        "(line 158,col 5)-(line 158,col 26)",
        "(line 159,col 5)-(line 159,col 23)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 161,col 23)",
        "(line 162,col 5)-(line 162,col 31)",
        "(line 164,col 5)-(line 164,col 28)",
        "(line 167,col 5)-(line 167,col 19)",
        "(line 168,col 5)-(line 168,col 25)",
        "(line 169,col 5)-(line 169,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 176,
      "end_line": 176,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 188,
      "end_line": 190,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 189,col 5)-(line 189,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 193,
      "end_line": 361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 42)",
        "(line 200,col 5)-(line 200,col 28)",
        "(line 201,col 5)-(line 201,col 23)",
        "(line 202,col 5)-(line 202,col 35)",
        "(line 205,col 5)-(line 205,col 36)",
        "(line 206,col 5)-(line 208,col 5)",
        "(line 209,col 5)-(line 209,col 59)",
        "(line 210,col 5)-(line 210,col 48)",
        "(line 213,col 5)-(line 213,col 42)",
        "(line 214,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 31)",
        "(line 224,col 5)-(line 224,col 27)",
        "(line 225,col 5)-(line 225,col 26)",
        "(line 226,col 5)-(line 226,col 29)",
        "(line 227,col 5)-(line 229,col 5)",
        "(line 230,col 5)-(line 230,col 84)",
        "(line 231,col 5)-(line 231,col 29)",
        "(line 234,col 5)-(line 355,col 5)",
        "(line 357,col 5)-(line 357,col 38)",
        "(line 358,col 5)-(line 358,col 25)",
        "(line 359,col 5)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 366,
      "end_line": 368,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 373,
      "end_line": 375,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 380,
      "end_line": 382,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 387,
      "end_line": 389,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 388,col 5)-(line 388,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 398,
      "end_line": 400,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    }
  ]
}