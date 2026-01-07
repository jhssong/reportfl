{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractIntegrator"
      ],
      "begin_line": 53,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Time steps from Butcher array (without the first zero). "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Internal weights from Butcher array (without the first empty row). "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " External weights for the high order method from Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "prototype"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Prototype of the step interpolator. "
    },
    {
      "type": "field",
      "varNames": [
        "step"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Integration step. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.RungeKuttaIntegrator(java.lang.String, double[], double[][], double[], org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator, double)",
      "begin_line": 80,
      "end_line": 90,
      "comment": " Simple constructor.\n   * Build a Runge-Kutta integrator with the given\n   * step. The default step handler does nothing.\n   * @param name name of the method\n   * @param c time steps from Butcher array (without the first zero)\n   * @param a internal weights from Butcher array (without the first empty row)\n   * @param b propagation weights for the high order method from Butcher array\n   * @param prototype prototype of the step interpolator to use\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 16)",
        "(line 85,col 5)-(line 85,col 24)",
        "(line 86,col 5)-(line 86,col 24)",
        "(line 87,col 5)-(line 87,col 24)",
        "(line 88,col 5)-(line 88,col 32)",
        "(line 89,col 5)-(line 89,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator.integrate(org.apache.commons.math.ode.ExpandableStatefulODE, double)",
      "begin_line": 93,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 31)",
        "(line 97,col 5)-(line 97,col 28)",
        "(line 98,col 5)-(line 98,col 23)",
        "(line 99,col 5)-(line 99,col 52)",
        "(line 102,col 5)-(line 102,col 58)",
        "(line 103,col 5)-(line 103,col 40)",
        "(line 104,col 5)-(line 104,col 42)",
        "(line 105,col 5)-(line 105,col 50)",
        "(line 106,col 5)-(line 108,col 5)",
        "(line 109,col 5)-(line 109,col 51)",
        "(line 110,col 5)-(line 110,col 51)",
        "(line 113,col 5)-(line 113,col 98)",
        "(line 114,col 5)-(line 115,col 93)",
        "(line 116,col 5)-(line 116,col 48)",
        "(line 119,col 5)-(line 119,col 36)",
        "(line 120,col 5)-(line 120,col 39)",
        "(line 121,col 5)-(line 123,col 5)",
        "(line 124,col 5)-(line 124,col 31)",
        "(line 127,col 5)-(line 127,col 23)",
        "(line 128,col 5)-(line 178,col 26)",
        "(line 181,col 5)-(line 181,col 33)",
        "(line 182,col 5)-(line 182,col 34)",
        "(line 184,col 5)-(line 184,col 27)",
        "(line 185,col 5)-(line 185,col 27)"
      ]
    }
  ]
}