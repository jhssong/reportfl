{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/GillIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator"
      ],
      "begin_line": 44,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 54,
      "end_line": 56,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 59,
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
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegrator.GillIntegrator(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Simple constructor.\n   * Build a fourth-order Gill integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillIntegrator.getName()",
      "begin_line": 79,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 22)"
      ]
    }
  ]
}