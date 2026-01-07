{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/EulerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaIntegrator"
      ],
      "begin_line": 48,
      "end_line": 82,
      "comment": ""
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
      "end_line": 56,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EulerIntegrator.EulerIntegrator(double)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Simple constructor.\n   * Build an Euler integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EulerIntegrator.getName()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 22)"
      ]
    }
  ]
}