{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 50,
      "end_line": 55,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 12)",
        "(line 52,col 5)-(line 52,col 21)",
        "(line 53,col 5)-(line 53,col 21)",
        "(line 54,col 5)-(line 54,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator)",
      "begin_line": 62,
      "end_line": 93,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 24)",
        "(line 66,col 5)-(line 91,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 101,
      "end_line": 120,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 5)-(line 104,col 53)",
        "(line 106,col 5)-(line 106,col 46)",
        "(line 108,col 5)-(line 108,col 32)",
        "(line 109,col 5)-(line 111,col 5)",
        "(line 113,col 5)-(line 113,col 24)",
        "(line 114,col 5)-(line 116,col 5)",
        "(line 118,col 5)-(line 118,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 123,
      "end_line": 126,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 5)-(line 124,col 23)",
        "(line 125,col 5)-(line 125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 129,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 5)-(line 174,col 5)",
        "(line 176,col 5)-(line 176,col 38)",
        "(line 177,col 5)-(line 177,col 38)",
        "(line 178,col 5)-(line 178,col 42)",
        "(line 179,col 5)-(line 179,col 37)",
        "(line 180,col 5)-(line 180,col 48)",
        "(line 181,col 5)-(line 181,col 63)",
        "(line 182,col 5)-(line 182,col 63)",
        "(line 183,col 5)-(line 183,col 80)",
        "(line 184,col 5)-(line 184,col 88)",
        "(line 186,col 5)-(line 198,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 203,
      "end_line": 243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 5)-(line 209,col 5)",
        "(line 211,col 5)-(line 211,col 13)",
        "(line 212,col 5)-(line 212,col 58)",
        "(line 215,col 5)-(line 220,col 5)",
        "(line 221,col 5)-(line 221,col 77)",
        "(line 224,col 5)-(line 230,col 5)",
        "(line 231,col 5)-(line 231,col 77)",
        "(line 234,col 5)-(line 240,col 5)",
        "(line 241,col 5)-(line 241,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 246,
      "end_line": 265,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 5)-(line 254,col 5)",
        "(line 255,col 5)-(line 255,col 38)",
        "(line 256,col 5)-(line 260,col 5)",
        "(line 263,col 5)-(line 263,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 268,
      "end_line": 287,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 32)",
        "(line 273,col 5)-(line 273,col 39)",
        "(line 274,col 5)-(line 274,col 41)",
        "(line 275,col 5)-(line 275,col 41)",
        "(line 276,col 5)-(line 276,col 41)",
        "(line 278,col 5)-(line 282,col 5)",
        "(line 285,col 5)-(line 285,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 290,
      "end_line": 290,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 296,
      "end_line": 296,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 411,
      "end_line": 411,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 414,
      "end_line": 414,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 434,
      "end_line": 464,
      "comment": " Interpolation weights.\n   * (beware that only the non-null values are in the table)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": " Serializable version identifier "
    }
  ]
}