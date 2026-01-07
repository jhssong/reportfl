{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/HighamHall54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 34,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 41,
      "end_line": 43,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 46,
      "end_line": 53,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticE"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": " Error weights Butcher array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.HighamHall54Integrator(double, double, double, double)",
      "begin_line": 74,
      "end_line": 79,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 78,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.HighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 90,
      "end_line": 95,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 94,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.getName()",
      "begin_line": 100,
      "end_line": 102,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.getOrder()",
      "begin_line": 107,
      "end_line": 109,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 118,
      "end_line": 141,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 21)",
        "(line 124,col 5)-(line 137,col 5)",
        "(line 139,col 5)-(line 139,col 40)"
      ]
    }
  ]
}