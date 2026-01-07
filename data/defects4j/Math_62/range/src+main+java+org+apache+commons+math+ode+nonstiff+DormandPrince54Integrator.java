{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 49,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 55,
      "end_line": 57,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 60,
      "end_line": 67,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 70,
      "end_line": 72,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "E1"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Error array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E3"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Error array, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "E4"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Error array, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "E5"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Error array, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "E6"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Error array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E7"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Error array, element 7. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 103,
      "end_line": 108,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 107,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 119,
      "end_line": 124,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 123,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.getOrder()",
      "begin_line": 127,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 133,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 21)",
        "(line 140,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 154,col 51)"
      ]
    }
  ]
}