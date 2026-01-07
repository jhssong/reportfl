{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 65,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 111,
      "end_line": 133,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
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
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 42)",
        "(line 200,col 5)-(line 200,col 28)",
        "(line 201,col 5)-(line 201,col 23)",
        "(line 202,col 5)-(line 202,col 35)",
        "(line 205,col 5)-(line 205,col 36)",
        "(line 206,col 5)-(line 208,col 5)",
        "(line 209,col 5)-(line 209,col 59)",
        "(line 210,col 5)-(line 210,col 51)",
        "(line 211,col 5)-(line 211,col 51)",
        "(line 214,col 5)-(line 214,col 42)",
        "(line 215,col 5)-(line 221,col 5)",
        "(line 222,col 5)-(line 222,col 31)",
        "(line 225,col 5)-(line 225,col 27)",
        "(line 226,col 5)-(line 226,col 26)",
        "(line 227,col 5)-(line 227,col 29)",
        "(line 228,col 5)-(line 230,col 5)",
        "(line 231,col 5)-(line 231,col 31)",
        "(line 234,col 5)-(line 234,col 23)",
        "(line 235,col 5)-(line 334,col 26)",
        "(line 336,col 5)-(line 336,col 38)",
        "(line 337,col 5)-(line 337,col 25)",
        "(line 338,col 5)-(line 338,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 352,
      "end_line": 354,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 359,
      "end_line": 361,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 366,
      "end_line": 368,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    }
  ]
}