{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 65,
      "end_line": 399,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 85,
      "end_line": 107,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 80)",
        "(line 94,col 5)-(line 94,col 26)",
        "(line 95,col 5)-(line 95,col 23)",
        "(line 96,col 5)-(line 96,col 23)",
        "(line 97,col 5)-(line 97,col 23)",
        "(line 98,col 5)-(line 98,col 31)",
        "(line 100,col 5)-(line 100,col 28)",
        "(line 103,col 5)-(line 103,col 19)",
        "(line 104,col 5)-(line 104,col 25)",
        "(line 105,col 5)-(line 105,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 123,
      "end_line": 145,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 78)",
        "(line 132,col 5)-(line 132,col 26)",
        "(line 133,col 5)-(line 133,col 23)",
        "(line 134,col 5)-(line 134,col 23)",
        "(line 135,col 5)-(line 135,col 23)",
        "(line 136,col 5)-(line 136,col 31)",
        "(line 138,col 5)-(line 138,col 28)",
        "(line 141,col 5)-(line 141,col 19)",
        "(line 142,col 5)-(line 142,col 25)",
        "(line 143,col 5)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 150,
      "end_line": 150,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 155,
      "end_line": 157,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 162,
      "end_line": 164,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 167,
      "end_line": 331,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 5)-(line 172,col 42)",
        "(line 173,col 5)-(line 173,col 37)",
        "(line 176,col 5)-(line 176,col 36)",
        "(line 177,col 5)-(line 179,col 5)",
        "(line 180,col 5)-(line 180,col 50)",
        "(line 181,col 5)-(line 183,col 5)",
        "(line 184,col 5)-(line 184,col 48)",
        "(line 187,col 5)-(line 187,col 42)",
        "(line 188,col 5)-(line 194,col 5)",
        "(line 195,col 5)-(line 195,col 31)",
        "(line 198,col 5)-(line 198,col 27)",
        "(line 199,col 5)-(line 199,col 26)",
        "(line 200,col 5)-(line 200,col 29)",
        "(line 201,col 5)-(line 203,col 5)",
        "(line 204,col 5)-(line 204,col 84)",
        "(line 205,col 5)-(line 205,col 29)",
        "(line 208,col 5)-(line 325,col 5)",
        "(line 327,col 5)-(line 327,col 38)",
        "(line 328,col 5)-(line 328,col 25)",
        "(line 329,col 5)-(line 329,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 336,
      "end_line": 338,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 337,col 5)-(line 337,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 343,
      "end_line": 345,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 344,col 5)-(line 344,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 350,
      "end_line": 352,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 357,
      "end_line": 359,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 368,
      "end_line": 370,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " Maximal growth factor for stepsize control. "
    }
  ]
}