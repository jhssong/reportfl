{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 46,
      "end_line": 157,
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
        "METHOD_NAME"
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
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 104,
      "end_line": 109,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 108,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 120,
      "end_line": 125,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 123,col 5)-(line 124,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator.getOrder()",
      "begin_line": 128,
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
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 137,col 5)-(line 137,col 21)",
        "(line 139,col 5)-(line 151,col 5)",
        "(line 153,col 5)-(line 153,col 40)"
      ]
    }
  ]
}