{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 47,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 53,
      "end_line": 55,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 58,
      "end_line": 65,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 68,
      "end_line": 70,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "E1"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Error array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E3"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Error array, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "E4"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Error array, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "E5"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Error array, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "E6"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Error array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E7"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Error array, element 7. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 101,
      "end_line": 106,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 104,col 5)-(line 105,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 117,
      "end_line": 122,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.getOrder()",
      "begin_line": 125,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 127,col 5)-(line 127,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 131,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 21)",
        "(line 138,col 5)-(line 150,col 5)",
        "(line 152,col 5)-(line 152,col 40)"
      ]
    }
  ]
}