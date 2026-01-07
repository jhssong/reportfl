{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 56,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 83,
      "end_line": 93,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 16)",
        "(line 88,col 5)-(line 88,col 24)",
        "(line 89,col 5)-(line 89,col 24)",
        "(line 90,col 5)-(line 90,col 24)",
        "(line 91,col 5)-(line 91,col 32)",
        "(line 92,col 5)-(line 92,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 96,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 42)",
        "(line 102,col 5)-(line 102,col 28)",
        "(line 103,col 5)-(line 103,col 23)",
        "(line 104,col 5)-(line 104,col 35)",
        "(line 107,col 5)-(line 107,col 36)",
        "(line 108,col 5)-(line 110,col 5)",
        "(line 111,col 5)-(line 111,col 50)",
        "(line 112,col 5)-(line 114,col 5)",
        "(line 115,col 5)-(line 115,col 48)",
        "(line 118,col 5)-(line 118,col 42)",
        "(line 119,col 5)-(line 125,col 5)",
        "(line 126,col 5)-(line 126,col 31)",
        "(line 129,col 5)-(line 129,col 19)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 134,col 5)-(line 134,col 84)",
        "(line 135,col 5)-(line 135,col 29)",
        "(line 138,col 5)-(line 217,col 5)",
        "(line 219,col 5)-(line 219,col 38)",
        "(line 220,col 5)-(line 220,col 27)",
        "(line 221,col 5)-(line 221,col 27)",
        "(line 222,col 5)-(line 222,col 20)"
      ]
    }
  ]
}