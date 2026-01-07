{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/DormandPrince853StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince853StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 412,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator()",
      "begin_line": 46,
      "end_line": 52,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaFehlbergIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 21)",
        "(line 49,col 5)-(line 49,col 21)",
        "(line 50,col 5)-(line 50,col 21)",
        "(line 51,col 5)-(line 51,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.DormandPrince853StepInterpolator(org.apache.commons.math.ode.DormandPrince853StepInterpolator)",
      "begin_line": 59,
      "end_line": 93,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 24)",
        "(line 63,col 5)-(line 88,col 5)",
        "(line 91,col 5)-(line 91,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.clone()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n   * Clone the instance.\n   * the copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 126,
      "end_line": 147,
      "comment": " Reinitialize the instance\n   * Some Runge-Kutta-Fehlberg integrators need fewer functions\n   * evaluations than their counterpart step interpolators. So the\n   * interpolator should perform the last evaluations they need by\n   * themselves. The {@link RungeKuttaFehlbergIntegrator\n   * RungeKuttaFehlbergIntegrator} abstract class calls this method in\n   * order to let the step interpolator perform the evaluations it\n   * needs. These evaluations will be performed during the call to\n   * \u003ccode\u003edoFinalize\u003c/code\u003e if any, i.e. only if the step handler\n   * either calls the {@link AbstractStepInterpolator#finalizeStep\n   * finalizeStep} method or the {@link\n   * AbstractStepInterpolator#getInterpolatedState getInterpolatedState}\n   * method (for an interpolator which needs a finalization) or if it clones\n   * the step interpolator.\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 129,col 5)-(line 129,col 53)",
        "(line 131,col 5)-(line 131,col 40)",
        "(line 133,col 5)-(line 133,col 32)",
        "(line 134,col 5)-(line 136,col 5)",
        "(line 138,col 5)-(line 138,col 33)",
        "(line 140,col 5)-(line 140,col 24)",
        "(line 141,col 5)-(line 143,col 5)",
        "(line 145,col 5)-(line 145,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.storeTime(double)",
      "begin_line": 152,
      "end_line": 155,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 23)",
        "(line 154,col 5)-(line 154,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 167,
      "end_line": 217,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 202,col 5)",
        "(line 204,col 5)-(line 204,col 36)",
        "(line 206,col 5)-(line 215,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.doFinalize()",
      "begin_line": 225,
      "end_line": 259,
      "comment": "\n   * Really finalize the step.\n   * Perform the last 3 functions evaluations (k14, k15, k16)\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 13)",
        "(line 231,col 5)-(line 236,col 5)",
        "(line 237,col 5)-(line 237,col 77)",
        "(line 240,col 5)-(line 246,col 5)",
        "(line 247,col 5)-(line 247,col 77)",
        "(line 250,col 5)-(line 256,col 5)",
        "(line 257,col 5)-(line 257,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 265,
      "end_line": 284,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 268,col 5)-(line 273,col 5)",
        "(line 274,col 5)-(line 274,col 38)",
        "(line 275,col 5)-(line 279,col 5)",
        "(line 282,col 5)-(line 282,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince853StepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 290,
      "end_line": 309,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 32)",
        "(line 295,col 5)-(line 295,col 33)",
        "(line 296,col 5)-(line 296,col 41)",
        "(line 297,col 5)-(line 297,col 41)",
        "(line 298,col 5)-(line 298,col 41)",
        "(line 300,col 5)-(line 304,col 5)",
        "(line 307,col 5)-(line 307,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotKLast"
      ],
      "begin_line": 312,
      "end_line": 312,
      "comment": " Last evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "yTmp"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": " Temporary state vector. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " Vectors for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "b_01"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " note that b_02 through b_05 are null"
    },
    {
      "type": "field",
      "varNames": [
        "b_06"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_07"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_08"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_09"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_10"
      ],
      "begin_line": 330,
      "end_line": 330,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_11"
      ],
      "begin_line": 331,
      "end_line": 331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b_12"
      ],
      "begin_line": 332,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c14"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " k14 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k14_01"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_06"
      ],
      "begin_line": 338,
      "end_line": 338,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_07"
      ],
      "begin_line": 339,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_08"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_09"
      ],
      "begin_line": 341,
      "end_line": 341,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_10"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_11"
      ],
      "begin_line": 343,
      "end_line": 343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_12"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k14_13"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c15"
      ],
      "begin_line": 348,
      "end_line": 348,
      "comment": " k15 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k15_01"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_06"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_07"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_08"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_09"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_10"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_11"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_12"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_13"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k15_14"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c16"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " k16 for interpolation only"
    },
    {
      "type": "field",
      "varNames": [
        "k16_01"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_06"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_07"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_08"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_09"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_10"
      ],
      "begin_line": 369,
      "end_line": 369,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_11"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_12"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_13"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_14"
      ],
      "begin_line": 373,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "k16_15"
      ],
      "begin_line": 374,
      "end_line": 374,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 378,
      "end_line": 408,
      "comment": " (beware that only the non-null values are in the table)"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": ""
    }
  ]
}