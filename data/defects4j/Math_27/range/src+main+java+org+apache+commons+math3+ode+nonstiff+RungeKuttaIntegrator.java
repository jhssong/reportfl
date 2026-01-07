{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.AbstractIntegrator"
      ],
      "begin_line": 52,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 79,
      "end_line": 89,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 16)",
        "(line 84,col 5)-(line 84,col 24)",
        "(line 85,col 5)-(line 85,col 24)",
        "(line 86,col 5)-(line 86,col 24)",
        "(line 87,col 5)-(line 87,col 32)",
        "(line 88,col 5)-(line 88,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math3.ode.ExpandableStatefulODE, double)",
      "begin_line": 92,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 31)",
        "(line 97,col 5)-(line 97,col 28)",
        "(line 98,col 5)-(line 98,col 52)",
        "(line 101,col 5)-(line 101,col 58)",
        "(line 102,col 5)-(line 102,col 40)",
        "(line 103,col 5)-(line 103,col 42)",
        "(line 104,col 5)-(line 104,col 50)",
        "(line 105,col 5)-(line 107,col 5)",
        "(line 108,col 5)-(line 108,col 40)",
        "(line 109,col 5)-(line 109,col 51)",
        "(line 112,col 5)-(line 112,col 98)",
        "(line 113,col 5)-(line 114,col 93)",
        "(line 115,col 5)-(line 115,col 48)",
        "(line 118,col 5)-(line 118,col 36)",
        "(line 119,col 5)-(line 119,col 39)",
        "(line 120,col 5)-(line 120,col 48)",
        "(line 123,col 5)-(line 123,col 23)",
        "(line 124,col 5)-(line 174,col 26)",
        "(line 177,col 5)-(line 177,col 33)",
        "(line 178,col 5)-(line 178,col 34)",
        "(line 180,col 5)-(line 180,col 27)",
        "(line 181,col 5)-(line 181,col 27)"
      ]
    }
  ]
}