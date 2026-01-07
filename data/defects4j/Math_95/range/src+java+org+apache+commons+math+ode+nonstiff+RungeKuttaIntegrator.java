{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 55,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 67,
      "end_line": 77,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 16)",
        "(line 72,col 5)-(line 72,col 24)",
        "(line 73,col 5)-(line 73,col 24)",
        "(line 74,col 5)-(line 74,col 24)",
        "(line 75,col 5)-(line 75,col 32)",
        "(line 76,col 5)-(line 76,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double, double[], double, double[])",
      "begin_line": 80,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 42)",
        "(line 86,col 5)-(line 86,col 37)",
        "(line 89,col 5)-(line 89,col 36)",
        "(line 90,col 5)-(line 92,col 5)",
        "(line 93,col 5)-(line 93,col 50)",
        "(line 94,col 5)-(line 96,col 5)",
        "(line 97,col 5)-(line 97,col 48)",
        "(line 100,col 5)-(line 100,col 42)",
        "(line 101,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 31)",
        "(line 111,col 5)-(line 111,col 19)",
        "(line 112,col 5)-(line 112,col 39)",
        "(line 113,col 5)-(line 115,col 5)",
        "(line 116,col 5)-(line 116,col 84)",
        "(line 117,col 5)-(line 117,col 29)",
        "(line 120,col 5)-(line 185,col 5)",
        "(line 187,col 5)-(line 187,col 38)",
        "(line 188,col 5)-(line 188,col 27)",
        "(line 189,col 5)-(line 189,col 27)",
        "(line 190,col 5)-(line 190,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Integration step. "
    }
  ]
}