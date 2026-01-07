{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 64,
      "end_line": 381,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Maximal growth factor for stepsize control. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 110,
      "end_line": 132,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 80)",
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(java.lang.String, boolean, double[], double[][], double[], org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 148,
      "end_line": 170,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param name name of the method\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 155,col 5)-(line 155,col 78)",
        "(line 157,col 5)-(line 157,col 26)",
        "(line 158,col 5)-(line 158,col 23)",
        "(line 159,col 5)-(line 159,col 23)",
        "(line 160,col 5)-(line 160,col 23)",
        "(line 161,col 5)-(line 161,col 31)",
        "(line 163,col 5)-(line 163,col 28)",
        "(line 166,col 5)-(line 166,col 19)",
        "(line 167,col 5)-(line 167,col 25)",
        "(line 168,col 5)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getOrder()",
      "begin_line": 175,
      "end_line": 175,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getSafety()",
      "begin_line": 180,
      "end_line": 182,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setSafety(double)",
      "begin_line": 187,
      "end_line": 189,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 192,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 5)-(line 197,col 31)",
        "(line 198,col 5)-(line 198,col 28)",
        "(line 199,col 5)-(line 199,col 52)",
        "(line 202,col 5)-(line 202,col 54)",
        "(line 203,col 5)-(line 203,col 34)",
        "(line 204,col 5)-(line 204,col 36)",
        "(line 205,col 5)-(line 205,col 58)",
        "(line 206,col 5)-(line 206,col 40)",
        "(line 207,col 5)-(line 207,col 50)",
        "(line 210,col 5)-(line 210,col 98)",
        "(line 211,col 5)-(line 212,col 93)",
        "(line 213,col 5)-(line 213,col 48)",
        "(line 216,col 5)-(line 216,col 44)",
        "(line 217,col 5)-(line 217,col 26)",
        "(line 218,col 5)-(line 218,col 29)",
        "(line 219,col 5)-(line 219,col 48)",
        "(line 222,col 5)-(line 222,col 23)",
        "(line 223,col 5)-(line 332,col 26)",
        "(line 335,col 5)-(line 335,col 33)",
        "(line 336,col 5)-(line 336,col 34)",
        "(line 338,col 5)-(line 338,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 352,
      "end_line": 354,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 359,
      "end_line": 361,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 366,
      "end_line": 368,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 367,col 5)-(line 367,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 377,
      "end_line": 379,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    }
  ]
}