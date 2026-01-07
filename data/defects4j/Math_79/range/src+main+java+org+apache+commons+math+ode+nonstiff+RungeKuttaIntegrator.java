{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 55,
      "end_line": 218,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 82,
      "end_line": 92,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 16)",
        "(line 87,col 5)-(line 87,col 24)",
        "(line 88,col 5)-(line 88,col 24)",
        "(line 89,col 5)-(line 89,col 24)",
        "(line 90,col 5)-(line 90,col 32)",
        "(line 91,col 5)-(line 91,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 95,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 42)",
        "(line 101,col 5)-(line 101,col 28)",
        "(line 102,col 5)-(line 102,col 23)",
        "(line 103,col 5)-(line 103,col 35)",
        "(line 106,col 5)-(line 106,col 36)",
        "(line 107,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 50)",
        "(line 111,col 5)-(line 113,col 5)",
        "(line 114,col 5)-(line 114,col 48)",
        "(line 117,col 5)-(line 117,col 42)",
        "(line 118,col 5)-(line 124,col 5)",
        "(line 125,col 5)-(line 125,col 31)",
        "(line 128,col 5)-(line 128,col 19)",
        "(line 129,col 5)-(line 129,col 39)",
        "(line 130,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 133,col 84)",
        "(line 134,col 5)-(line 134,col 29)",
        "(line 137,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 211,col 38)",
        "(line 212,col 5)-(line 212,col 27)",
        "(line 213,col 5)-(line 213,col 27)",
        "(line 214,col 5)-(line 214,col 20)"
      ]
    }
  ]
}