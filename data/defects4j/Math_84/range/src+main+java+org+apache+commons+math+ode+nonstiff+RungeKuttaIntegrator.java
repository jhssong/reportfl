{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
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
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 42)",
        "(line 86,col 5)-(line 86,col 28)",
        "(line 87,col 5)-(line 87,col 23)",
        "(line 88,col 5)-(line 88,col 37)",
        "(line 91,col 5)-(line 91,col 36)",
        "(line 92,col 5)-(line 94,col 5)",
        "(line 95,col 5)-(line 95,col 50)",
        "(line 96,col 5)-(line 98,col 5)",
        "(line 99,col 5)-(line 99,col 48)",
        "(line 102,col 5)-(line 102,col 42)",
        "(line 103,col 5)-(line 109,col 5)",
        "(line 110,col 5)-(line 110,col 31)",
        "(line 113,col 5)-(line 113,col 19)",
        "(line 114,col 5)-(line 114,col 39)",
        "(line 115,col 5)-(line 117,col 5)",
        "(line 118,col 5)-(line 118,col 84)",
        "(line 119,col 5)-(line 119,col 29)",
        "(line 122,col 5)-(line 194,col 5)",
        "(line 196,col 5)-(line 196,col 38)",
        "(line 197,col 5)-(line 197,col 27)",
        "(line 198,col 5)-(line 198,col 27)",
        "(line 199,col 5)-(line 199,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " Integration step. "
    }
  ]
}