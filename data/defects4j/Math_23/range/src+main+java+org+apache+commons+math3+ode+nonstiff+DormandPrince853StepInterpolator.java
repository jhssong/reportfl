{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 41,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "B_01"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "B_06"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "B_07"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "B_08"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "B_09"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "B_10"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "B_11"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "B_12"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "C14"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K14_01"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_06"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_07"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_08"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_09"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_10"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_11"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_12"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_13"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "C15"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K15_01"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_06"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_07"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_08"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_09"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_10"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_11"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_12"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_13"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_14"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "C16"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K16_01"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_06"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_07"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_08"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_09"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_10"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_11"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_12"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_13"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_14"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_15"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 183,
      "end_line": 213,
      "comment": " Interpolation weights.\n     * (beware that only the non-null values are in the table)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 233,
      "end_line": 238,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 12)",
        "(line 235,col 5)-(line 235,col 21)",
        "(line 236,col 5)-(line 236,col 21)",
        "(line 237,col 5)-(line 237,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator)",
      "begin_line": 245,
      "end_line": 276,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 247,col 5)-(line 247,col 24)",
        "(line 249,col 5)-(line 274,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 279,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 281,col 5)-(line 281,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math3.ode.AbstractIntegrator, double[], double[][], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 285,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 291,col 5)-(line 291,col 87)",
        "(line 293,col 5)-(line 293,col 46)",
        "(line 295,col 5)-(line 295,col 32)",
        "(line 296,col 5)-(line 298,col 5)",
        "(line 300,col 5)-(line 300,col 24)",
        "(line 301,col 5)-(line 303,col 5)",
        "(line 305,col 5)-(line 305,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 310,
      "end_line": 314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 23)",
        "(line 313,col 5)-(line 313,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 317,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 322,col 5)-(line 363,col 5)",
        "(line 365,col 5)-(line 365,col 38)",
        "(line 366,col 5)-(line 366,col 38)",
        "(line 367,col 5)-(line 367,col 42)",
        "(line 368,col 5)-(line 368,col 37)",
        "(line 369,col 5)-(line 369,col 48)",
        "(line 370,col 5)-(line 370,col 63)",
        "(line 371,col 5)-(line 371,col 63)",
        "(line 372,col 5)-(line 372,col 80)",
        "(line 373,col 5)-(line 373,col 88)",
        "(line 375,col 5)-(line 403,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 408,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 7)-(line 451,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 456,
      "end_line": 480,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 460,col 5)-(line 467,col 5)",
        "(line 469,col 5)-(line 469,col 76)",
        "(line 470,col 5)-(line 470,col 28)",
        "(line 471,col 5)-(line 475,col 5)",
        "(line 478,col 5)-(line 478,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 483,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 32)",
        "(line 489,col 5)-(line 489,col 39)",
        "(line 490,col 5)-(line 490,col 66)",
        "(line 491,col 5)-(line 491,col 66)",
        "(line 492,col 5)-(line 492,col 66)",
        "(line 494,col 5)-(line 498,col 5)",
        "(line 501,col 5)-(line 501,col 27)"
      ]
    }
  ]
}