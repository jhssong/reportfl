{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/DormandPrince54Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 49,
      "end_line": 162,
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
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double, double)",
      "begin_line": 105,
      "end_line": 110,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 109,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator.DormandPrince54Integrator(double, double, double[], double[])",
      "begin_line": 123,
      "end_line": 128,
      "comment": " Simple constructor.\n   * Build a fifth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 127,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator.getOrder()",
      "begin_line": 131,
      "end_line": 134,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 137,
      "end_line": 160,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 21)",
        "(line 144,col 5)-(line 156,col 5)",
        "(line 158,col 5)-(line 158,col 51)"
      ]
    }
  ]
}