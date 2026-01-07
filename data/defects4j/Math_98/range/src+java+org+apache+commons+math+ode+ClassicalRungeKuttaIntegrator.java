{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/ClassicalRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaIntegrator"
      ],
      "begin_line": 45,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 55,
      "end_line": 57,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 60,
      "end_line": 64,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 67,
      "end_line": 69,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.ClassicalRungeKuttaIntegrator(double)",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Simple constructor.\n   * Build a fourth-order Runge-Kutta integrator with the given\n   * step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.getName()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 22)"
      ]
    }
  ]
}