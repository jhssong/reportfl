{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 55,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 70,
      "end_line": 80,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 16)",
        "(line 75,col 5)-(line 75,col 24)",
        "(line 76,col 5)-(line 76,col 24)",
        "(line 77,col 5)-(line 77,col 24)",
        "(line 78,col 5)-(line 78,col 32)",
        "(line 79,col 5)-(line 79,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 83,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 42)",
        "(line 89,col 5)-(line 89,col 37)",
        "(line 92,col 5)-(line 92,col 36)",
        "(line 93,col 5)-(line 95,col 5)",
        "(line 96,col 5)-(line 96,col 50)",
        "(line 97,col 5)-(line 99,col 5)",
        "(line 100,col 5)-(line 100,col 48)",
        "(line 103,col 5)-(line 103,col 42)",
        "(line 104,col 5)-(line 110,col 5)",
        "(line 111,col 5)-(line 111,col 31)",
        "(line 114,col 5)-(line 114,col 19)",
        "(line 115,col 5)-(line 115,col 39)",
        "(line 116,col 5)-(line 118,col 5)",
        "(line 119,col 5)-(line 119,col 84)",
        "(line 120,col 5)-(line 120,col 29)",
        "(line 123,col 5)-(line 188,col 5)",
        "(line 190,col 5)-(line 190,col 38)",
        "(line 191,col 5)-(line 191,col 27)",
        "(line 192,col 5)-(line 192,col 27)",
        "(line 193,col 5)-(line 193,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Integration step. "
    }
  ]
}