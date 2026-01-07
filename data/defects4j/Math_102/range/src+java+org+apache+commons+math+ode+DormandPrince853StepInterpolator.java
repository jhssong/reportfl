{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 405,
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
      "begin_line": 93,
      "end_line": 95,
      "comment": " Really copy the finalized instance.\n   ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 118,
      "end_line": 137,
      "comment": " Reinitialize the instance\n   * Some embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. So the\n   * interpolator should perform the last evaluations they need by\n   * themselves. The {@link EmbeddedRungeKuttaIntegrator\n   * EmbeddedRungeKuttaIntegrator} abstract class calls this method in\n   * order to let the step interpolator perform the evaluations it\n   * needs. These evaluations will be performed during the call to\n   * \u003ccode\u003edoFinalize\u003c/code\u003e if any, i.e. only if the step handler\n   * either calls the {@link AbstractStepInterpolator#finalizeStep\n   * finalizeStep} method or the {@link\n   * AbstractStepInterpolator#getInterpolatedState getInterpolatedState}\n   * method (for an interpolator which needs a finalization) or if it clones\n   * the step interpolator.\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 53)",
        "(line 123,col 5)-(line 123,col 40)",
        "(line 125,col 5)-(line 125,col 32)",
        "(line 126,col 5)-(line 128,col 5)",
        "(line 130,col 5)-(line 130,col 24)",
        "(line 131,col 5)-(line 133,col 5)",
        "(line 135,col 5)-(line 135,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 142,
      "end_line": 145,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 23)",
        "(line 144,col 5)-(line 144,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 157,
      "end_line": 207,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 192,col 5)",
        "(line 194,col 5)-(line 194,col 36)",
        "(line 196,col 5)-(line 205,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 215,
      "end_line": 255,
      "comment": "\n   * Really finalize the step.\n   * Perform the last 3 functions evaluations (k14, k15, k16)\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 218,col 5)-(line 221,col 5)",
        "(line 223,col 5)-(line 223,col 13)",
        "(line 224,col 5)-(line 224,col 52)",
        "(line 227,col 5)-(line 232,col 5)",
        "(line 233,col 5)-(line 233,col 77)",
        "(line 236,col 5)-(line 242,col 5)",
        "(line 243,col 5)-(line 243,col 77)",
        "(line 246,col 5)-(line 252,col 5)",
        "(line 253,col 5)-(line 253,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 261,
      "end_line": 280,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 264,col 5)-(line 269,col 5)",
        "(line 270,col 5)-(line 270,col 38)",
        "(line 271,col 5)-(line 275,col 5)",
        "(line 278,col 5)-(line 278,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 286,
      "end_line": 305,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 32)",
        "(line 291,col 5)-(line 291,col 33)",
        "(line 292,col 5)-(line 292,col 41)",
        "(line 293,col 5)-(line 293,col 41)",
        "(line 294,col 5)-(line 294,col 41)",
        "(line 296,col 5)-(line 300,col 5)",
        "(line 303,col 5)-(line 303,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 311,
      "end_line": 311,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " note that b_02 through b_05 are null"
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 320,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " k14 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 333,
      "end_line": 333,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 334,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": " k15 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 346,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 349,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " k16 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 371,
      "end_line": 401,
      "comment": " (beware that only the non-null values are in the table)"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 403,
      "end_line": 403,
      "comment": ""
    }
  ]
}