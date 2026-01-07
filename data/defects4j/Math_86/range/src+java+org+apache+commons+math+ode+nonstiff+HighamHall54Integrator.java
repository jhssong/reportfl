{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/ode/nonstiff/HighamHall54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 34,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 44,
      "end_line": 46,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 49,
      "end_line": 56,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 59,
      "end_line": 61,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticE"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": " Error weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double, double)",
      "begin_line": 77,
      "end_line": 82,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 81,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.HighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 93,
      "end_line": 98,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 97,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.getOrder()",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 107,
      "end_line": 131,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 21)",
        "(line 114,col 5)-(line 127,col 5)",
        "(line 129,col 5)-(line 129,col 40)"
      ]
    }
  ]
}