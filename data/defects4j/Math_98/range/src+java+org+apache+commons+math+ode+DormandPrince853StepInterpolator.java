{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 46,
      "end_line": 51,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 21)",
        "(line 49,col 5)-(line 49,col 21)",
        "(line 50,col 5)-(line 50,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.DormandPrince853StepInterpolator)",
      "begin_line": 58,
      "end_line": 89,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 24)",
        "(line 62,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.doCopy()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 119,
      "end_line": 138,
      "comment": " Reinitialize the instance\n   * Some embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. So the\n   * interpolator should perform the last evaluations they need by\n   * themselves. The {@link EmbeddedRungeKuttaIntegrator\n   * EmbeddedRungeKuttaIntegrator} abstract class calls this method in\n   * order to let the step interpolator perform the evaluations it\n   * needs. These evaluations will be performed during the call to\n   * \u003ccode\u003edoFinalize\u003c/code\u003e if any, i.e. only if the step handler\n   * either calls the {@link AbstractStepInterpolator#finalizeStep\n   * finalizeStep} method or the {@link\n   * AbstractStepInterpolator#getInterpolatedState getInterpolatedState}\n   * method (for an interpolator which needs a finalization) or if it clones\n   * the step interpolator.\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 53)",
        "(line 124,col 5)-(line 124,col 40)",
        "(line 126,col 5)-(line 126,col 32)",
        "(line 127,col 5)-(line 129,col 5)",
        "(line 131,col 5)-(line 131,col 24)",
        "(line 132,col 5)-(line 134,col 5)",
        "(line 136,col 5)-(line 136,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 143,
      "end_line": 146,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 144,col 5)-(line 144,col 23)",
        "(line 145,col 5)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 158,
      "end_line": 204,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 162,col 5)-(line 193,col 5)",
        "(line 195,col 5)-(line 195,col 36)",
        "(line 197,col 5)-(line 202,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 212,
      "end_line": 252,
      "comment": "\n   * Really finalize the step.\n   * Perform the last 3 functions evaluations (k14, k15, k16)\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 215,col 5)-(line 218,col 5)",
        "(line 220,col 5)-(line 220,col 13)",
        "(line 221,col 5)-(line 221,col 52)",
        "(line 224,col 5)-(line 229,col 5)",
        "(line 230,col 5)-(line 230,col 77)",
        "(line 233,col 5)-(line 239,col 5)",
        "(line 240,col 5)-(line 240,col 77)",
        "(line 243,col 5)-(line 249,col 5)",
        "(line 250,col 5)-(line 250,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 258,
      "end_line": 277,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 261,col 5)-(line 266,col 5)",
        "(line 267,col 5)-(line 267,col 38)",
        "(line 268,col 5)-(line 272,col 5)",
        "(line 275,col 5)-(line 275,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 283,
      "end_line": 302,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 287,col 5)-(line 287,col 32)",
        "(line 288,col 5)-(line 288,col 33)",
        "(line 289,col 5)-(line 289,col 41)",
        "(line 290,col 5)-(line 290,col 41)",
        "(line 291,col 5)-(line 291,col 41)",
        "(line 293,col 5)-(line 297,col 5)",
        "(line 300,col 5)-(line 300,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 305,
      "end_line": 305,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Propagation weights, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " Propagation weights, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Propagation weights, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Propagation weights, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Propagation weights, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": " Propagation weights, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": " Propagation weights, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": " Propagation weights, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": " Time step for stage 14 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": " Internal weights for stage 14, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " Internal weights for stage 14, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " Internal weights for stage 14, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": " Internal weights for stage 14, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": " Internal weights for stage 14, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " Internal weights for stage 14, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": " Internal weights for stage 14, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": " Internal weights for stage 14, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": " Internal weights for stage 14, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": " Time step for stage 15 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Internal weights for stage 15, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 381,
      "end_line": 381,
      "comment": " Internal weights for stage 15, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 384,
      "end_line": 384,
      "comment": " Internal weights for stage 15, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 387,
      "end_line": 387,
      "comment": " Internal weights for stage 15, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": " Internal weights for stage 15, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 393,
      "end_line": 393,
      "comment": " Internal weights for stage 15, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Internal weights for stage 15, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 399,
      "end_line": 399,
      "comment": " Internal weights for stage 15, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " Internal weights for stage 15, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": " Internal weights for stage 15, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 408,
      "end_line": 408,
      "comment": " Time step for stage 16 (interpolation only). "
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 412,
      "end_line": 412,
      "comment": " Internal weights for stage 16, element 1. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": " Internal weights for stage 16, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 420,
      "end_line": 420,
      "comment": " Internal weights for stage 16, element 7. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 423,
      "end_line": 423,
      "comment": " Internal weights for stage 16, element 8. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 426,
      "end_line": 426,
      "comment": " Internal weights for stage 16, element 9. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": " Internal weights for stage 16, element 10. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": " Internal weights for stage 16, element 11. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 435,
      "end_line": 435,
      "comment": " Internal weights for stage 16, element 12. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": " Internal weights for stage 16, element 13. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Internal weights for stage 16, element 14. "
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 444,
      "end_line": 444,
      "comment": " Internal weights for stage 16, element 15. "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 449,
      "end_line": 479,
      "comment": " Interpolation weights.\n   * (beware that only the non-null values are in the table)\n   "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 482,
      "end_line": 482,
      "comment": " Serializable version identifier "
    }
  ]
}