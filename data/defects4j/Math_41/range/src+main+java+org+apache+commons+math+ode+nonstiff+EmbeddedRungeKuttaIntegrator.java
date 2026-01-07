{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 62,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 108,
      "end_line": 130,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 80)",
        "(line 117,col 5)-(line 117,col 26)",
        "(line 118,col 5)-(line 118,col 23)",
        "(line 119,col 5)-(line 119,col 23)",
        "(line 120,col 5)-(line 120,col 23)",
        "(line 121,col 5)-(line 121,col 31)",
        "(line 123,col 5)-(line 123,col 28)",
        "(line 126,col 5)-(line 126,col 19)",
        "(line 127,col 5)-(line 127,col 25)",
        "(line 128,col 5)-(line 128,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 146,
      "end_line": 168,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 78)",
        "(line 155,col 5)-(line 155,col 26)",
        "(line 156,col 5)-(line 156,col 23)",
        "(line 157,col 5)-(line 157,col 23)",
        "(line 158,col 5)-(line 158,col 23)",
        "(line 159,col 5)-(line 159,col 31)",
        "(line 161,col 5)-(line 161,col 28)",
        "(line 164,col 5)-(line 164,col 19)",
        "(line 165,col 5)-(line 165,col 25)",
        "(line 166,col 5)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 173,
      "end_line": 173,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 185,
      "end_line": 187,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 186,col 5)-(line 186,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)",
      "begin_line": 190,
      "end_line": 328,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 31)",
        "(line 195,col 5)-(line 195,col 28)",
        "(line 196,col 5)-(line 196,col 52)",
        "(line 199,col 5)-(line 199,col 54)",
        "(line 200,col 5)-(line 200,col 34)",
        "(line 201,col 5)-(line 201,col 36)",
        "(line 202,col 5)-(line 202,col 58)",
        "(line 203,col 5)-(line 203,col 40)",
        "(line 204,col 5)-(line 204,col 50)",
        "(line 207,col 5)-(line 207,col 98)",
        "(line 208,col 5)-(line 209,col 93)",
        "(line 210,col 5)-(line 210,col 48)",
        "(line 213,col 5)-(line 213,col 44)",
        "(line 214,col 5)-(line 214,col 26)",
        "(line 215,col 5)-(line 215,col 29)",
        "(line 216,col 5)-(line 216,col 48)",
        "(line 219,col 5)-(line 219,col 23)",
        "(line 220,col 5)-(line 320,col 26)",
        "(line 323,col 5)-(line 323,col 33)",
        "(line 324,col 5)-(line 324,col 34)",
        "(line 326,col 5)-(line 326,col 25)"
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
    }
  ]
}