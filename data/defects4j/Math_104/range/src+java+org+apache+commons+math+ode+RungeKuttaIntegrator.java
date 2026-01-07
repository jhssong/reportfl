{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderIntegrator"
      ],
      "begin_line": 56,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.RungeKuttaIntegrator(boolean, double[], double[][], double[], org.apache.commons.math.ode.RungeKuttaStepInterpolator, double)",
      "begin_line": 69,
      "end_line": 81,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param fsal indicate that the method is an \u003ci\u003efsal\u003c/i\u003e\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b external weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 27)",
        "(line 74,col 5)-(line 74,col 24)",
        "(line 75,col 5)-(line 75,col 24)",
        "(line 76,col 5)-(line 76,col 24)",
        "(line 77,col 5)-(line 77,col 32)",
        "(line 78,col 5)-(line 78,col 27)",
        "(line 79,col 5)-(line 79,col 53)",
        "(line 80,col 5)-(line 80,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getName()",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.setStepHandler(org.apache.commons.math.ode.StepHandler)",
      "begin_line": 93,
      "end_line": 95,
      "comment": " Set the step handler for this integrator.\n   * The handler will be called by the integrator for each accepted\n   * step.\n   * @param handler handler for the accepted steps\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.getStepHandler()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Get the step handler for this integrator.\n   * @return the step handler for this integrator\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction, double, double)",
      "begin_line": 111,
      "end_line": 115,
      "comment": " Add a switching function to the integrator.\n   * @param function switching function\n   * @param maxCheckInterval maximal time interval between switching\n   * function checks (this interval prevents missing sign changes in\n   * case the integration steps becomes very large)\n   * @param convergence convergence threshold in the event time search\n   ",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 117,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 130,col 5)",
        "(line 131,col 5)-(line 136,col 5)",
        "(line 138,col 5)-(line 138,col 31)",
        "(line 141,col 5)-(line 141,col 30)",
        "(line 142,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 44)",
        "(line 146,col 5)-(line 148,col 5)",
        "(line 149,col 5)-(line 149,col 42)",
        "(line 152,col 5)-(line 152,col 42)",
        "(line 153,col 5)-(line 159,col 5)",
        "(line 160,col 5)-(line 160,col 31)",
        "(line 163,col 5)-(line 163,col 27)",
        "(line 164,col 5)-(line 164,col 76)",
        "(line 165,col 5)-(line 165,col 42)",
        "(line 166,col 5)-(line 166,col 29)",
        "(line 167,col 5)-(line 167,col 30)",
        "(line 168,col 5)-(line 168,col 20)",
        "(line 169,col 5)-(line 250,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "fsal"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": " Indicator for \u003ci\u003efsal\u003c/i\u003e methods. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Integration step. "
    },
    {
      "type": "field",
      "varNames": [
        "handler"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " Step handler. "
    },
    {
      "type": "field",
      "varNames": [
        "switchesHandler"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " Switching functions handler. "
    }
  ]
}