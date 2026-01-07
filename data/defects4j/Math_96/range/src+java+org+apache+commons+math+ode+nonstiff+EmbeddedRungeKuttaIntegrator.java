{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 65,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 82,
      "end_line": 104,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 80)",
        "(line 91,col 5)-(line 91,col 26)",
        "(line 92,col 5)-(line 92,col 23)",
        "(line 93,col 5)-(line 93,col 23)",
        "(line 94,col 5)-(line 94,col 23)",
        "(line 95,col 5)-(line 95,col 31)",
        "(line 97,col 5)-(line 97,col 28)",
        "(line 100,col 5)-(line 100,col 19)",
        "(line 101,col 5)-(line 101,col 25)",
        "(line 102,col 5)-(line 102,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 120,
      "end_line": 142,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 78)",
        "(line 129,col 5)-(line 129,col 26)",
        "(line 130,col 5)-(line 130,col 23)",
        "(line 131,col 5)-(line 131,col 23)",
        "(line 132,col 5)-(line 132,col 23)",
        "(line 133,col 5)-(line 133,col 31)",
        "(line 135,col 5)-(line 135,col 28)",
        "(line 138,col 5)-(line 138,col 19)",
        "(line 139,col 5)-(line 139,col 25)",
        "(line 140,col 5)-(line 140,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 147,
      "end_line": 147,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 152,
      "end_line": 154,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 164,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 169,col 5)-(line 169,col 42)",
        "(line 170,col 5)-(line 170,col 37)",
        "(line 173,col 5)-(line 173,col 36)",
        "(line 174,col 5)-(line 176,col 5)",
        "(line 177,col 5)-(line 177,col 50)",
        "(line 178,col 5)-(line 180,col 5)",
        "(line 181,col 5)-(line 181,col 48)",
        "(line 184,col 5)-(line 184,col 42)",
        "(line 185,col 5)-(line 191,col 5)",
        "(line 192,col 5)-(line 192,col 31)",
        "(line 195,col 5)-(line 195,col 27)",
        "(line 196,col 5)-(line 196,col 26)",
        "(line 197,col 5)-(line 197,col 29)",
        "(line 198,col 5)-(line 200,col 5)",
        "(line 201,col 5)-(line 201,col 84)",
        "(line 202,col 5)-(line 202,col 29)",
        "(line 205,col 5)-(line 322,col 5)",
        "(line 324,col 5)-(line 324,col 38)",
        "(line 325,col 5)-(line 325,col 25)",
        "(line 326,col 5)-(line 326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 333,
      "end_line": 335,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 334,col 5)-(line 334,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 340,
      "end_line": 342,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 341,col 5)-(line 341,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 347,
      "end_line": 349,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 348,col 5)-(line 348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 354,
      "end_line": 356,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 355,col 5)-(line 355,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 365,
      "end_line": 367,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " Maximal growth factor for stepsize control. "
    }
  ]
}