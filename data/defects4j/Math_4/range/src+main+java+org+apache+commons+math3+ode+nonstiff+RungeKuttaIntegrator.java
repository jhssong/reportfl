{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.AbstractIntegrator"
      ],
      "begin_line": 54,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 81,
      "end_line": 91,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 16)",
        "(line 86,col 5)-(line 86,col 24)",
        "(line 87,col 5)-(line 87,col 24)",
        "(line 88,col 5)-(line 88,col 24)",
        "(line 89,col 5)-(line 89,col 32)",
        "(line 90,col 5)-(line 90,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 94,
      "end_line": 186,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 31)",
        "(line 100,col 5)-(line 100,col 28)",
        "(line 101,col 5)-(line 101,col 52)",
        "(line 104,col 5)-(line 104,col 58)",
        "(line 105,col 5)-(line 105,col 40)",
        "(line 106,col 5)-(line 106,col 42)",
        "(line 107,col 5)-(line 107,col 50)",
        "(line 108,col 5)-(line 110,col 5)",
        "(line 111,col 5)-(line 111,col 40)",
        "(line 112,col 5)-(line 112,col 51)",
        "(line 115,col 5)-(line 115,col 98)",
        "(line 116,col 5)-(line 117,col 93)",
        "(line 118,col 5)-(line 118,col 48)",
        "(line 121,col 5)-(line 121,col 36)",
        "(line 122,col 5)-(line 122,col 39)",
        "(line 123,col 5)-(line 123,col 48)",
        "(line 126,col 5)-(line 126,col 23)",
        "(line 127,col 5)-(line 177,col 26)",
        "(line 180,col 5)-(line 180,col 33)",
        "(line 181,col 5)-(line 181,col 34)",
        "(line 183,col 5)-(line 183,col 27)",
        "(line 184,col 5)-(line 184,col 27)"
      ]
    }
  ]
}