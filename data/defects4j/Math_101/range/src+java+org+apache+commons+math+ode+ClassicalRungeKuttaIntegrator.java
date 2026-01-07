{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/ClassicalRungeKuttaIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaIntegrator"
      ],
      "begin_line": 45,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 52,
      "end_line": 54,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 57,
      "end_line": 61,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.ClassicalRungeKuttaIntegrator(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Simple constructor.\n   * Build a fourth-order Runge-Kutta integrator with the given\n   * step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator.getName()",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 22)"
      ]
    }
  ]
}