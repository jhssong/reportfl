{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/HighamHall54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 34,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 39,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 43,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 52,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticE"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.HighamHall54Integrator(double, double, double, double)",
      "begin_line": 69,
      "end_line": 74,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 73,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.HighamHall54Integrator(double, double, double[], double[])",
      "begin_line": 85,
      "end_line": 90,
      "comment": " Simple constructor.\n   * Build a fifth order Higham and Hall integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 89,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.getName()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.getOrder()",
      "begin_line": 102,
      "end_line": 104,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 113,
      "end_line": 136,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 21)",
        "(line 119,col 5)-(line 132,col 5)",
        "(line 134,col 5)-(line 134,col 40)"
      ]
    }
  ]
}