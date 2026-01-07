{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaFehlbergIntegrator"
      ],
      "begin_line": 46,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 51,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 55,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e3"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e4"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e5"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e6"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e7"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 84,
      "end_line": 89,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 88,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 100,
      "end_line": 105,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 103,col 5)-(line 104,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getName()",
      "begin_line": 110,
      "end_line": 112,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getOrder()",
      "begin_line": 117,
      "end_line": 119,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 128,
      "end_line": 150,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 21)",
        "(line 134,col 5)-(line 146,col 5)",
        "(line 148,col 5)-(line 148,col 40)"
      ]
    }
  ]
}