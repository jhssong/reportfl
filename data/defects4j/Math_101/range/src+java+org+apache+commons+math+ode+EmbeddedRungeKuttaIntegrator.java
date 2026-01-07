{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/EmbeddedRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmbeddedRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AdaptiveStepsizeIntegrator"
      ],
      "begin_line": 57,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.EmbeddedRungeKuttaIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double, double, double, double)",
      "begin_line": 73,
      "end_line": 95,
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
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
      "comment": " Build a Runge-Kutta integrator with the given Butcher array.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
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
      "begin_line": 174,
      "end_line": 333,
      "comment": " Integrate the differential equations up to the given time.\n   * \u003cp\u003eThis method solves an Initial Value Problem (IVP).\u003c/p\u003e\n   * \u003cp\u003eSince this method stores some internal state variables made\n   * available in its public interface during integration ({@link\n   * #getCurrentSignedStepsize()}), it is \u003cem\u003enot\u003c/em\u003e thread-safe.\u003c/p\u003e\n   * @param equations differential equations to integrate\n   * @param t0 initial time\n   * @param y0 initial value of the state vector at t0\n   * @param t target time for the integration\n   * (can be set to a value smaller than \u003ccode\u003et0\u003c/code\u003e for backward integration)\n   * @param y placeholder where to put the state vector at each successful\n   *  step (and hence at the end of integration), can be the same object as y0\n   * @throws IntegratorException if the integrator cannot perform integration\n   * @throws DerivativeException this exception is propagated to the caller if\n   * the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 42)",
        "(line 180,col 5)-(line 180,col 31)",
        "(line 183,col 5)-(line 183,col 30)",
        "(line 184,col 5)-(line 186,col 5)",
        "(line 187,col 5)-(line 187,col 44)",
        "(line 188,col 5)-(line 190,col 5)",
        "(line 191,col 5)-(line 191,col 42)",
        "(line 194,col 5)-(line 194,col 42)",
        "(line 195,col 5)-(line 201,col 5)",
        "(line 202,col 5)-(line 202,col 31)",
        "(line 204,col 5)-(line 204,col 20)",
        "(line 205,col 5)-(line 205,col 26)",
        "(line 206,col 5)-(line 206,col 29)",
        "(line 207,col 5)-(line 207,col 21)",
        "(line 208,col 5)-(line 208,col 20)",
        "(line 209,col 5)-(line 329,col 25)",
        "(line 331,col 5)-(line 331,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getMinReduction()",
      "begin_line": 338,
      "end_line": 340,
      "comment": " Get the minimal reduction factor for stepsize control.\n   * @return minimal reduction factor\n   ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.setMinReduction(double)",
      "begin_line": 345,
      "end_line": 347,
      "comment": " Set the minimal reduction factor for stepsize control.\n   * @param minReduction minimal reduction factor\n   ",
      "child_ranges": [
        "(line 346,col 5)-(line 346,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.getMaxGrowth()",
      "begin_line": 352,
      "end_line": 354,
      "comment": " Get the maximal growth factor for stepsize control.\n   * @return maximal growth factor\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.setMaxGrowth(double)",
      "begin_line": 359,
      "end_line": 361,
      "comment": " Set the maximal growth factor for stepsize control.\n   * @param maxGrowth maximal growth factor\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 370,
      "end_line": 372,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "exp"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Stepsize control exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "safety"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Safety factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "minReduction"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Minimal reduction factor for stepsize control. "
    },
    {
      "type": "field",
      "varNames": [
        "maxGrowth"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " Maximal growth factor for stepsize control. "
    }
  ]
}