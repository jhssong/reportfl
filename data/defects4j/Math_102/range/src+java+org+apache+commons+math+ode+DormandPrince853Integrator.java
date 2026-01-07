{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/DormandPrince853Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 54,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt6"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 61,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 67,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 133,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_01"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_06"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_07"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_08"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_09"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_10"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_11"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e1_12"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_01"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_06"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_07"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_08"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_09"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_10"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_11"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "e2_12"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double, double)",
      "begin_line": 176,
      "end_line": 182,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 179,col 5)-(line 181,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 193,
      "end_line": 199,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 196,col 5)-(line 198,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853Integrator.getName()",
      "begin_line": 204,
      "end_line": 206,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 205,col 5)-(line 205,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853Integrator.getOrder()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 222,
      "end_line": 255,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 22)",
        "(line 226,col 5)-(line 226,col 22)",
        "(line 228,col 5)-(line 246,col 5)",
        "(line 248,col 5)-(line 248,col 40)",
        "(line 249,col 5)-(line 251,col 5)",
        "(line 253,col 5)-(line 253,col 61)"
      ]
    }
  ]
}