{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 39,
      "end_line": 477,
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
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 103,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 107,col 5)-(line 107,col 53)",
        "(line 109,col 5)-(line 109,col 46)",
        "(line 111,col 5)-(line 111,col 32)",
        "(line 112,col 5)-(line 114,col 5)",
        "(line 116,col 5)-(line 116,col 24)",
        "(line 117,col 5)-(line 119,col 5)",
        "(line 121,col 5)-(line 121,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 126,
      "end_line": 130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 23)",
        "(line 129,col 5)-(line 129,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 133,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 138,col 5)-(line 179,col 5)",
        "(line 181,col 5)-(line 181,col 38)",
        "(line 182,col 5)-(line 182,col 38)",
        "(line 183,col 5)-(line 183,col 42)",
        "(line 184,col 5)-(line 184,col 37)",
        "(line 185,col 5)-(line 185,col 48)",
        "(line 186,col 5)-(line 186,col 63)",
        "(line 187,col 5)-(line 187,col 63)",
        "(line 188,col 5)-(line 188,col 80)",
        "(line 189,col 5)-(line 189,col 88)",
        "(line 191,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 208,
      "end_line": 249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 5)-(line 215,col 5)",
        "(line 217,col 5)-(line 217,col 13)",
        "(line 218,col 5)-(line 218,col 58)",
        "(line 221,col 5)-(line 226,col 5)",
        "(line 227,col 5)-(line 227,col 77)",
        "(line 230,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 77)",
        "(line 240,col 5)-(line 246,col 5)",
        "(line 247,col 5)-(line 247,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 252,
      "end_line": 272,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 5)-(line 261,col 5)",
        "(line 262,col 5)-(line 262,col 38)",
        "(line 263,col 5)-(line 267,col 5)",
        "(line 270,col 5)-(line 270,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 275,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 280,col 5)-(line 280,col 32)",
        "(line 281,col 5)-(line 281,col 39)",
        "(line 282,col 5)-(line 282,col 41)",
        "(line 283,col 5)-(line 283,col 41)",
        "(line 284,col 5)-(line 284,col 41)",
        "(line 286,col 5)-(line 290,col 5)",
        "(line 293,col 5)-(line 293,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 298,
      "end_line": 298,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 304,
      "end_line": 304,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 377,
      "end_line": 377,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 380,
      "end_line": 380,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 386,
      "end_line": 386,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 392,
      "end_line": 392,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 416,
      "end_line": 416,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 442,
      "end_line": 472,
      "comment": " Interpolation weights.\n   * (beware that only the non-null values are in the table)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": " Serializable version identifier "
    }
  ]
}