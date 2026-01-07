{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/ThreeEighthesIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaIntegrator"
      ],
      "begin_line": 44,
      "end_line": 85,
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
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegrator.ThreeEighthesIntegrator(double)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Simple constructor.\n   * Build a 3/8 integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesIntegrator.getName()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 22)"
      ]
    }
  ]
}