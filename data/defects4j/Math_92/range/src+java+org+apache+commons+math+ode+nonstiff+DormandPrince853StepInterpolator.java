{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 39,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 51,
      "end_line": 56,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 12)",
        "(line 53,col 5)-(line 53,col 21)",
        "(line 54,col 5)-(line 54,col 21)",
        "(line 55,col 5)-(line 55,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator)",
      "begin_line": 63,
      "end_line": 94,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 24)",
        "(line 67,col 5)-(line 92,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 97,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 102,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 53)",
        "(line 107,col 5)-(line 107,col 46)",
        "(line 109,col 5)-(line 109,col 32)",
        "(line 110,col 5)-(line 112,col 5)",
        "(line 114,col 5)-(line 114,col 24)",
        "(line 115,col 5)-(line 117,col 5)",
        "(line 119,col 5)-(line 119,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 124,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 5)-(line 125,col 23)",
        "(line 126,col 5)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 130,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 134,col 5)-(line 175,col 5)",
        "(line 177,col 5)-(line 177,col 38)",
        "(line 178,col 5)-(line 178,col 38)",
        "(line 179,col 5)-(line 179,col 42)",
        "(line 180,col 5)-(line 180,col 37)",
        "(line 181,col 5)-(line 181,col 48)",
        "(line 182,col 5)-(line 182,col 63)",
        "(line 183,col 5)-(line 183,col 63)",
        "(line 184,col 5)-(line 184,col 80)",
        "(line 185,col 5)-(line 185,col 88)",
        "(line 187,col 5)-(line 199,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 204,
      "end_line": 244,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 5)-(line 210,col 5)",
        "(line 212,col 5)-(line 212,col 13)",
        "(line 213,col 5)-(line 213,col 58)",
        "(line 216,col 5)-(line 221,col 5)",
        "(line 222,col 5)-(line 222,col 77)",
        "(line 225,col 5)-(line 231,col 5)",
        "(line 232,col 5)-(line 232,col 77)",
        "(line 235,col 5)-(line 241,col 5)",
        "(line 242,col 5)-(line 242,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 247,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 250,col 5)-(line 255,col 5)",
        "(line 256,col 5)-(line 256,col 38)",
        "(line 257,col 5)-(line 261,col 5)",
        "(line 264,col 5)-(line 264,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 269,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 32)",
        "(line 274,col 5)-(line 274,col 39)",
        "(line 275,col 5)-(line 275,col 41)",
        "(line 276,col 5)-(line 276,col 41)",
        "(line 277,col 5)-(line 277,col 41)",
        "(line 279,col 5)-(line 283,col 5)",
        "(line 286,col 5)-(line 286,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 291,
      "end_line": 291,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 294,
      "end_line": 294,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 297,
      "end_line": 297,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 300,
      "end_line": 300,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 317,
      "end_line": 317,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 391,
      "end_line": 391,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 394,
      "end_line": 394,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 409,
      "end_line": 409,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 415,
      "end_line": 415,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 427,
      "end_line": 427,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 435,
      "end_line": 465,
      "comment": " Interpolation weights.\n   * (beware that only the non-null values are in the table)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " Serializable version identifier "
    }
  ]
}