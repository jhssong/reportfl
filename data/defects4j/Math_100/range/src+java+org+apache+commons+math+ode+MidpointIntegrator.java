{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/ode/MidpointIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaIntegrator"
      ],
      "begin_line": 42,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 49,
      "end_line": 51,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 54,
      "end_line": 56,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 59,
      "end_line": 61,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MidpointIntegrator.MidpointIntegrator(double)",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Simple constructor.\n   * Build a midpoint integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MidpointIntegrator.getName()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 22)"
      ]
    }
  ]
}