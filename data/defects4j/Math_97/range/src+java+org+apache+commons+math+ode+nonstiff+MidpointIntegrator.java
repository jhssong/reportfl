{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/MidpointIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator"
      ],
      "begin_line": 42,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier. "
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
      "end_line": 59,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 62,
      "end_line": 64,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointIntegrator.MidpointIntegrator(double)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Simple constructor.\n   * Build a midpoint integrator with the given step.\n   * @param step integration step\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointIntegrator.getName()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 22)"
      ]
    }
  ]
}