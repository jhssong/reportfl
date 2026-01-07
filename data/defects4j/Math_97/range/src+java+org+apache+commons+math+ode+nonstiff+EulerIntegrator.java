{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/EulerIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator"
      ],
      "begin_line": 48,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 66,
      "end_line": 68,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerIntegrator.EulerIntegrator(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Simple constructor.\n   * Build an Euler integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerIntegrator.getName()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 22)"
      ]
    }
  ]
}