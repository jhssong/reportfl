{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 491,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "B_01"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "B_06"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "B_07"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "B_08"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "B_09"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "B_10"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "B_11"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "B_12"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "C14"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K14_01"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_06"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_07"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_08"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_09"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_10"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_11"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_12"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_13"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "C15"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K15_01"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_06"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_07"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_08"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_09"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_10"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_11"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_12"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_13"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_14"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "C16"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K16_01"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_06"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_07"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_08"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_09"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_10"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_11"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_12"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_13"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_14"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_15"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 180,
      "end_line": 210,
      "comment": " Interpolation weights.\n     * (beware that only the non-null values are in the table)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 230,
      "end_line": 235,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 12)",
        "(line 232,col 5)-(line 232,col 21)",
        "(line 233,col 5)-(line 233,col 21)",
        "(line 234,col 5)-(line 234,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator)",
      "begin_line": 242,
      "end_line": 273,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 244,col 5)-(line 244,col 24)",
        "(line 246,col 5)-(line 271,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 276,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 5)-(line 278,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.AbstractIntegrator, double[], double[][], boolean, org.apache.commons.math.ode.EquationsMapper, org.apache.commons.math.ode.EquationsMapper[])",
      "begin_line": 282,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 5)-(line 288,col 87)",
        "(line 290,col 5)-(line 290,col 46)",
        "(line 292,col 5)-(line 292,col 32)",
        "(line 293,col 5)-(line 295,col 5)",
        "(line 297,col 5)-(line 297,col 24)",
        "(line 298,col 5)-(line 300,col 5)",
        "(line 302,col 5)-(line 302,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 307,
      "end_line": 311,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 5)-(line 309,col 23)",
        "(line 310,col 5)-(line 310,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 314,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 318,col 5)-(line 359,col 5)",
        "(line 361,col 5)-(line 361,col 38)",
        "(line 362,col 5)-(line 362,col 38)",
        "(line 363,col 5)-(line 363,col 42)",
        "(line 364,col 5)-(line 364,col 37)",
        "(line 365,col 5)-(line 365,col 48)",
        "(line 366,col 5)-(line 366,col 63)",
        "(line 367,col 5)-(line 367,col 63)",
        "(line 368,col 5)-(line 368,col 80)",
        "(line 369,col 5)-(line 369,col 88)",
        "(line 371,col 5)-(line 399,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 404,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 407,col 5)-(line 410,col 5)",
        "(line 412,col 5)-(line 412,col 13)",
        "(line 413,col 5)-(line 413,col 58)",
        "(line 414,col 5)-(line 414,col 46)",
        "(line 417,col 5)-(line 422,col 5)",
        "(line 423,col 5)-(line 423,col 68)",
        "(line 426,col 5)-(line 432,col 5)",
        "(line 433,col 5)-(line 433,col 68)",
        "(line 436,col 5)-(line 442,col 5)",
        "(line 443,col 5)-(line 443,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 448,
      "end_line": 466,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 453,col 5)-(line 453,col 19)",
        "(line 455,col 5)-(line 455,col 76)",
        "(line 456,col 5)-(line 456,col 28)",
        "(line 457,col 5)-(line 461,col 5)",
        "(line 464,col 5)-(line 464,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 469,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 5)-(line 474,col 32)",
        "(line 475,col 5)-(line 475,col 39)",
        "(line 476,col 5)-(line 476,col 66)",
        "(line 477,col 5)-(line 477,col 66)",
        "(line 478,col 5)-(line 478,col 66)",
        "(line 480,col 5)-(line 484,col 5)",
        "(line 487,col 5)-(line 487,col 27)"
      ]
    }
  ]
}