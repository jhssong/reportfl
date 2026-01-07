{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/DormandPrince853Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 57,
      "end_line": 287,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 63,
      "end_line": 67,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 70,
      "end_line": 134,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 137,
      "end_line": 151,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_01"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " First error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_06"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " First error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_07"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " First error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_08"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " First error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_09"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " First error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_10"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " First error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_11"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " First error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_12"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " First error weights array, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_01"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Second error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_06"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Second error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_07"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Second error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_08"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Second error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_09"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Second error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_10"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Second error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_11"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Second error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_12"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Second error weights array, element 12. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double, double)",
      "begin_line": 217,
      "end_line": 223,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 220,col 5)-(line 222,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 236,
      "end_line": 242,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param maxStep maximal step (sign is irrelevant, regardless of\n   * integration direction, forward or backward), the last step can\n   * be smaller than this\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 239,col 5)-(line 241,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator.getOrder()",
      "begin_line": 245,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 251,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 5)-(line 255,col 22)",
        "(line 256,col 5)-(line 256,col 22)",
        "(line 258,col 5)-(line 276,col 5)",
        "(line 278,col 5)-(line 278,col 40)",
        "(line 279,col 5)-(line 281,col 5)",
        "(line 283,col 5)-(line 283,col 76)"
      ]
    }
  ]
}