{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince853Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 54,
      "end_line": 284,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "staticC"
      ],
      "begin_line": 64,
      "end_line": 68,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticA"
      ],
      "begin_line": 71,
      "end_line": 135,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "staticB"
      ],
      "begin_line": 138,
      "end_line": 152,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_01"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " First error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_06"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " First error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_07"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " First error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_08"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " First error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_09"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " First error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_10"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " First error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_11"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " First error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "e1_12"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " First error weights array, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_01"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Second error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_06"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Second error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_07"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Second error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_08"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Second error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_09"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Second error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_10"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Second error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_11"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Second error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "e2_12"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Second error weights array, element 12. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double, double)",
      "begin_line": 216,
      "end_line": 222,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 221,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 233,
      "end_line": 239,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 238,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.getOrder()",
      "begin_line": 242,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 248,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 5)-(line 252,col 22)",
        "(line 253,col 5)-(line 253,col 22)",
        "(line 255,col 5)-(line 273,col 5)",
        "(line 275,col 5)-(line 275,col 40)",
        "(line 276,col 5)-(line 278,col 5)",
        "(line 280,col 5)-(line 280,col 61)"
      ]
    }
  ]
}