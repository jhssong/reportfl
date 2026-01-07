{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 39,
      "end_line": 478,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "B_01"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "B_06"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "B_07"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "B_08"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "B_09"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "B_10"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "B_11"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "B_12"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "C14"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K14_01"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_06"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_07"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_08"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_09"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_10"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_11"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_12"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K14_13"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "C15"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K15_01"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_06"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_07"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_08"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_09"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_10"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_11"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_12"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_13"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K15_14"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "C16"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "K16_01"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_06"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_07"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_08"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_09"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_10"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_11"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_12"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_13"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_14"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "K16_15"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 181,
      "end_line": 211,
      "comment": " Interpolation weights.\n     * (beware that only the non-null values are in the table)\n     "
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 231,
      "end_line": 236,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 232,col 5)-(line 232,col 12)",
        "(line 233,col 5)-(line 233,col 21)",
        "(line 234,col 5)-(line 234,col 21)",
        "(line 235,col 5)-(line 235,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator)",
      "begin_line": 243,
      "end_line": 274,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 245,col 24)",
        "(line 247,col 5)-(line 272,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 277,
      "end_line": 280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 5)-(line 279,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.AbstractIntegrator, double[], double[][], boolean)",
      "begin_line": 283,
      "end_line": 303,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 54)",
        "(line 289,col 5)-(line 289,col 46)",
        "(line 291,col 5)-(line 291,col 32)",
        "(line 292,col 5)-(line 294,col 5)",
        "(line 296,col 5)-(line 296,col 24)",
        "(line 297,col 5)-(line 299,col 5)",
        "(line 301,col 5)-(line 301,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 306,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 23)",
        "(line 309,col 5)-(line 309,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 313,
      "end_line": 385,
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
        "(line 371,col 5)-(line 383,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 388,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 392,col 5)-(line 395,col 5)",
        "(line 397,col 5)-(line 397,col 13)",
        "(line 398,col 5)-(line 398,col 58)",
        "(line 401,col 5)-(line 406,col 5)",
        "(line 407,col 5)-(line 407,col 78)",
        "(line 410,col 5)-(line 416,col 5)",
        "(line 417,col 5)-(line 417,col 78)",
        "(line 420,col 5)-(line 426,col 5)",
        "(line 427,col 5)-(line 427,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 432,
      "end_line": 453,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 5)-(line 441,col 5)",
        "(line 442,col 5)-(line 442,col 76)",
        "(line 443,col 5)-(line 443,col 28)",
        "(line 444,col 5)-(line 448,col 5)",
        "(line 451,col 5)-(line 451,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 456,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 461,col 5)-(line 461,col 32)",
        "(line 462,col 5)-(line 462,col 39)",
        "(line 463,col 5)-(line 463,col 66)",
        "(line 464,col 5)-(line 464,col 66)",
        "(line 465,col 5)-(line 465,col 66)",
        "(line 467,col 5)-(line 471,col 5)",
        "(line 474,col 5)-(line 474,col 27)"
      ]
    }
  ]
}