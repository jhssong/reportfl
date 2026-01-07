{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/ode/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 46,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 53,
      "end_line": 55,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 58,
      "end_line": 65,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 68,
      "end_line": 70,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "e1"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Error array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "e3"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Error array, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "e4"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Error array, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "e5"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Error array, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "e6"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Error array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "e7"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Error array, element 7. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 101,
      "end_line": 106,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 117,
      "end_line": 122,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getName()",
      "begin_line": 127,
      "end_line": 129,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getOrder()",
      "begin_line": 134,
      "end_line": 136,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 145,
      "end_line": 167,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 21)",
        "(line 151,col 5)-(line 163,col 5)",
        "(line 165,col 5)-(line 165,col 40)"
      ]
    }
  ]
}