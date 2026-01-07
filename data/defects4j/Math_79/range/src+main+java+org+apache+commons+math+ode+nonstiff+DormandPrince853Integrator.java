{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince853Integrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853Integrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator"
      ],
      "begin_line": 55,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "METHOD_NAME"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Integrator method name. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_C"
      ],
      "begin_line": 61,
      "end_line": 65,
      "comment": " Time steps Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_A"
      ],
      "begin_line": 68,
      "end_line": 132,
      "comment": " Internal weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_B"
      ],
      "begin_line": 135,
      "end_line": 149,
      "comment": " Propagation weights Butcher array. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_01"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " First error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_06"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " First error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_07"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " First error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_08"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " First error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_09"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " First error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_10"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " First error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_11"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " First error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "E1_12"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " First error weights array, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_01"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Second error weights array, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_06"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Second error weights array, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_07"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Second error weights array, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_08"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Second error weights array, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_09"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Second error weights array, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_10"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Second error weights array, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_11"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Second error weights array, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "E2_12"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Second error weights array, element 12. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double, double)",
      "begin_line": 213,
      "end_line": 219,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param scalAbsoluteTolerance allowed absolute error\n   * @param scalRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 216,col 5)-(line 218,col 74)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.DormandPrince853Integrator(double, double, double[], double[])",
      "begin_line": 230,
      "end_line": 236,
      "comment": " Simple constructor.\n   * Build an eighth order Dormand-Prince integrator with the given step bounds\n   * @param minStep minimal step (must be positive even for backward\n   * integration), the last step can be smaller than this\n   * @param maxStep maximal step (must be positive even for backward\n   * integration)\n   * @param vecAbsoluteTolerance allowed absolute error\n   * @param vecRelativeTolerance allowed relative error\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 235,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.getOrder()",
      "begin_line": 239,
      "end_line": 242,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator.estimateError(double[][], double[], double[], double)",
      "begin_line": 245,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 22)",
        "(line 250,col 5)-(line 250,col 22)",
        "(line 252,col 5)-(line 270,col 5)",
        "(line 272,col 5)-(line 272,col 40)",
        "(line 273,col 5)-(line 275,col 5)",
        "(line 277,col 5)-(line 277,col 61)"
      ]
    }
  ]
}