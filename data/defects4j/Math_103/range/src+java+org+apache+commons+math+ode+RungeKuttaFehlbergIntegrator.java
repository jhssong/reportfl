{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/RungeKuttaFehlbergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaFehlbergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 57,
      "end_line": 400,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.RungeKuttaFehlbergIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 73,
      "end_line": 96,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 74)",
        "(line 82,col 5)-(line 82,col 26)",
        "(line 83,col 5)-(line 83,col 23)",
        "(line 84,col 5)-(line 84,col 23)",
        "(line 85,col 5)-(line 85,col 23)",
        "(line 86,col 5)-(line 86,col 31)",
        "(line 88,col 5)-(line 88,col 28)",
        "(line 90,col 5)-(line 90,col 22)",
        "(line 93,col 5)-(line 93,col 25)",
        "(line 94,col 5)-(line 94,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.RungeKuttaFehlbergIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double, double, double[], double[])",
      "begin_line": 111,
      "end_line": 134,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 72)",
        "(line 120,col 5)-(line 120,col 26)",
        "(line 121,col 5)-(line 121,col 23)",
        "(line 122,col 5)-(line 122,col 23)",
        "(line 123,col 5)-(line 123,col 23)",
        "(line 124,col 5)-(line 124,col 31)",
        "(line 126,col 5)-(line 126,col 28)",
        "(line 128,col 5)-(line 128,col 22)",
        "(line 131,col 5)-(line 131,col 25)",
        "(line 132,col 5)-(line 132,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.getName()",
      "begin_line": 139,
      "end_line": 139,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.getOrder()",
      "begin_line": 144,
      "end_line": 144,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.getSafety()",
      "begin_line": 149,
      "end_line": 151,
      "comment": " Get the safety factor for stepsize control.\n   * @return safety factor\n   ",
      "child_ranges": [
        "(line 150,col 5)-(line 150,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.setSafety(double)",
      "begin_line": 156,
      "end_line": 158,
      "comment": " Set the safety factor for stepsize control.\n   * @param safety safety factor\n   ",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 160,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 166,col 5)-(line 173,col 5)",
        "(line 174,col 5)-(line 179,col 5)",
        "(line 181,col 5)-(line 181,col 31)",
        "(line 184,col 5)-(line 184,col 30)",
        "(line 185,col 5)-(line 187,col 5)",
        "(line 188,col 5)-(line 188,col 44)",
        "(line 189,col 5)-(line 191,col 5)",
        "(line 192,col 5)-(line 192,col 42)",
        "(line 195,col 5)-(line 195,col 42)",
        "(line 196,col 5)-(line 202,col 5)",
        "(line 203,col 5)-(line 203,col 31)",
        "(line 205,col 5)-(line 205,col 27)",
        "(line 206,col 5)-(line 206,col 26)",
        "(line 207,col 5)-(line 207,col 29)",
        "(line 208,col 5)-(line 208,col 21)",
        "(line 209,col 5)-(line 209,col 20)",
        "(line 210,col 5)-(line 330,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.getMinReduction()",
      "begin_line": 337,
      "end_line": 339,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 338,col 5)-(line 338,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.setMinReduction(double)",
      "begin_line": 344,
      "end_line": 346,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 345,col 5)-(line 345,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.getMaxGrowth()",
      "begin_line": 351,
      "end_line": 353,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 352,col 5)-(line 352,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.setMaxGrowth(double)",
      "begin_line": 358,
      "end_line": 360,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 369,
      "end_line": 371,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " Maximal growth factor for stepsize control. "
    }
  ]
}