{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 46,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 56,
      "end_line": 58,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 61,
      "end_line": 68,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 71,
      "end_line": 73,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "e1"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Error array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "e3"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Error array, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "e4"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Error array, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "e5"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Error array, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "e6"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Error array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "e7"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Error array, element 7. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 104,
      "end_line": 109,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 108,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 120,
      "end_line": 125,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 124,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getName()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " Get the name of the method.\n   * @return name of the method\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.getOrder()",
      "begin_line": 137,
      "end_line": 139,
      "comment": " Get the order of the method.\n   * @return order of the method\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 148,
      "end_line": 170,
      "comment": " Compute the error ratio.\n   * @param yDotK derivatives computed during the first stages\n   * @param y0 estimate of the step at the start of the step\n   * @param y1 estimate of the step at the end of the step\n   * @param h  current step\n   * @return error ratio, greater than 1 if step should be rejected\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 21)",
        "(line 154,col 5)-(line 166,col 5)",
        "(line 168,col 5)-(line 168,col 40)"
      ]
    }
  ]
}