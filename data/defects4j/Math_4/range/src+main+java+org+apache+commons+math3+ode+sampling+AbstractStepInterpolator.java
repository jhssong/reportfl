{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.StepInterpolator"
      ],
      "begin_line": 44,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " current time step "
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " current state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedTime"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " interpolated time "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedState"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " interpolated state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedDerivatives"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " interpolated derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedPrimaryState"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " interpolated primary state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedPrimaryDerivatives"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " interpolated primary derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedSecondaryState"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " interpolated secondary state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedSecondaryDerivatives"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " interpolated secondary derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "globalPreviousTime"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " global previous time "
    },
    {
      "type": "field",
      "varNames": [
        "globalCurrentTime"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " global current time "
    },
    {
      "type": "field",
      "varNames": [
        "softPreviousTime"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " soft previous time "
    },
    {
      "type": "field",
      "varNames": [
        "softCurrentTime"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " soft current time "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyState"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " indicator for dirty state. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryMapper"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Equations mapper for the primary equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryMappers"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Equations mappers for the secondary equations sets. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 112,
      "end_line": 126,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator}\n   * class uses the prototyping design pattern to create the step\n   * interpolators by cloning an uninitialized model and latter\n   * initializing the copy.\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 36)",
        "(line 114,col 5)-(line 114,col 36)",
        "(line 115,col 5)-(line 115,col 36)",
        "(line 116,col 5)-(line 116,col 36)",
        "(line 117,col 5)-(line 117,col 36)",
        "(line 118,col 5)-(line 118,col 36)",
        "(line 119,col 5)-(line 119,col 30)",
        "(line 120,col 5)-(line 120,col 31)",
        "(line 121,col 5)-(line 121,col 30)",
        "(line 122,col 5)-(line 122,col 30)",
        "(line 123,col 5)-(line 123,col 30)",
        "(line 124,col 5)-(line 124,col 30)",
        "(line 125,col 5)-(line 125,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 135,
      "end_line": 153,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   * @param primaryMapper equations mapper for the primary equations set\n   * @param secondaryMappers equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 39)",
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 142,col 39)",
        "(line 143,col 5)-(line 143,col 39)",
        "(line 144,col 5)-(line 144,col 39)",
        "(line 145,col 5)-(line 145,col 30)",
        "(line 146,col 5)-(line 146,col 34)",
        "(line 147,col 5)-(line 147,col 36)",
        "(line 148,col 5)-(line 148,col 33)",
        "(line 149,col 5)-(line 149,col 42)",
        "(line 150,col 5)-(line 150,col 89)",
        "(line 151,col 5)-(line 151,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math3.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 172,
      "end_line": 207,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 174,col 5)-(line 174,col 57)",
        "(line 175,col 5)-(line 175,col 56)",
        "(line 176,col 5)-(line 176,col 55)",
        "(line 177,col 5)-(line 177,col 54)",
        "(line 178,col 5)-(line 178,col 40)",
        "(line 179,col 5)-(line 179,col 55)",
        "(line 181,col 5)-(line 198,col 5)",
        "(line 200,col 5)-(line 200,col 46)",
        "(line 201,col 5)-(line 201,col 44)",
        "(line 202,col 5)-(line 202,col 47)",
        "(line 203,col 5)-(line 203,col 50)",
        "(line 204,col 5)-(line 205,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.allocateInterpolatedArrays(int)",
      "begin_line": 212,
      "end_line": 237,
      "comment": " Allocate the various interpolated states arrays.\n   * @param dimension total dimension (negative if arrays should be set to null)\n   ",
      "child_ranges": [
        "(line 213,col 7)-(line 236,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 245,
      "end_line": 263,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at the end of the step\n   * @param isForward integration direction indicator\n   * @param primary equations mapper for the primary equations set\n   * @param secondary equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 39)",
        "(line 250,col 5)-(line 250,col 39)",
        "(line 251,col 5)-(line 251,col 39)",
        "(line 252,col 5)-(line 252,col 39)",
        "(line 253,col 5)-(line 253,col 39)",
        "(line 254,col 5)-(line 254,col 39)",
        "(line 255,col 5)-(line 255,col 30)",
        "(line 256,col 5)-(line 256,col 34)",
        "(line 257,col 5)-(line 257,col 38)",
        "(line 258,col 5)-(line 258,col 33)",
        "(line 259,col 5)-(line 259,col 36)",
        "(line 260,col 5)-(line 260,col 46)",
        "(line 261,col 5)-(line 261,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 266,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 6)-(line 269,col 20)",
        "(line 272,col 6)-(line 272,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.doCopy()",
      "begin_line": 283,
      "end_line": 283,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.shift()",
      "begin_line": 289,
      "end_line": 293,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 290,col 5)-(line 290,col 43)",
        "(line 291,col 5)-(line 291,col 44)",
        "(line 292,col 5)-(line 292,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 298,
      "end_line": 308,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 300,col 5)-(line 300,col 26)",
        "(line 301,col 5)-(line 301,col 42)",
        "(line 302,col 5)-(line 302,col 63)",
        "(line 303,col 5)-(line 303,col 27)",
        "(line 306,col 5)-(line 306,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.setSoftPreviousTime(double)",
      "begin_line": 320,
      "end_line": 322,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getPreviousTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softPreviousTime start of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 321,col 7)-(line 321,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.setSoftCurrentTime(double)",
      "begin_line": 334,
      "end_line": 336,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getCurrentTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softCurrentTime end of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 335,col 7)-(line 335,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getGlobalPreviousTime()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n   * Get the previous global grid point time.\n   * @return previous global grid point time\n   ",
      "child_ranges": [
        "(line 343,col 5)-(line 343,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getGlobalCurrentTime()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n   * Get the current global grid point time.\n   * @return current global grid point time\n   ",
      "child_ranges": [
        "(line 351,col 5)-(line 351,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n   * Get the previous soft grid point time.\n   * @return previous soft grid point time\n   * @see #setSoftPreviousTime(double)\n   ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n   * Get the current soft grid point time.\n   * @return current soft grid point time\n   * @see #setSoftCurrentTime(double)\n   ",
      "child_ranges": [
        "(line 369,col 5)-(line 369,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 373,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 374,col 5)-(line 374,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 378,
      "end_line": 381,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 379,col 7)-(line 379,col 30)",
        "(line 380,col 7)-(line 380,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 384,
      "end_line": 386,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 385,col 5)-(line 385,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 397,
      "end_line": 399,
      "comment": " Compute the state and derivatives at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState()",
      "begin_line": 404,
      "end_line": 413,
      "comment": " Lazy evaluation of complete interpolated state.\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": [
        "(line 407,col 7)-(line 412,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 416,
      "end_line": 421,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 7)-(line 417,col 42)",
        "(line 418,col 7)-(line 419,col 66)",
        "(line 420,col 7)-(line 420,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 424,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 425,col 7)-(line 425,col 42)",
        "(line 426,col 7)-(line 427,col 72)",
        "(line 428,col 7)-(line 428,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedSecondaryState(int)",
      "begin_line": 432,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 433,col 7)-(line 433,col 42)",
        "(line 434,col 7)-(line 435,col 85)",
        "(line 436,col 7)-(line 436,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.getInterpolatedSecondaryDerivatives(int)",
      "begin_line": 440,
      "end_line": 445,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 441,col 7)-(line 441,col 42)",
        "(line 442,col 7)-(line 443,col 91)",
        "(line 444,col 7)-(line 444,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 488,
      "end_line": 493,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n\n   ",
      "child_ranges": [
        "(line 489,col 5)-(line 492,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 500,
      "end_line": 501,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @exception MaxCountExceededException if the number of functions evaluations is exceeded\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 504,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 508,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 517,
      "end_line": 557,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 520,col 5)-(line 524,col 5)",
        "(line 525,col 5)-(line 525,col 40)",
        "(line 526,col 5)-(line 526,col 39)",
        "(line 527,col 5)-(line 527,col 38)",
        "(line 528,col 5)-(line 528,col 37)",
        "(line 529,col 5)-(line 529,col 23)",
        "(line 530,col 5)-(line 530,col 30)",
        "(line 531,col 5)-(line 531,col 35)",
        "(line 532,col 5)-(line 532,col 39)",
        "(line 533,col 5)-(line 535,col 5)",
        "(line 537,col 5)-(line 541,col 5)",
        "(line 543,col 5)-(line 543,col 38)",
        "(line 548,col 5)-(line 555,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 570,
      "end_line": 604,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time to be set later by the caller\n   * @exception IOException in case of read error\n   * @exception ClassNotFoundException if an equation mapper class\n   * cannot be found\n   ",
      "child_ranges": [
        "(line 573,col 5)-(line 573,col 39)",
        "(line 574,col 5)-(line 574,col 42)",
        "(line 575,col 5)-(line 575,col 42)",
        "(line 576,col 5)-(line 576,col 42)",
        "(line 577,col 5)-(line 577,col 42)",
        "(line 578,col 5)-(line 578,col 42)",
        "(line 579,col 5)-(line 579,col 43)",
        "(line 580,col 5)-(line 580,col 60)",
        "(line 581,col 5)-(line 581,col 57)",
        "(line 582,col 5)-(line 584,col 5)",
        "(line 585,col 5)-(line 585,col 31)",
        "(line 587,col 5)-(line 594,col 5)",
        "(line 597,col 5)-(line 597,col 34)",
        "(line 598,col 5)-(line 598,col 42)",
        "(line 600,col 5)-(line 600,col 21)",
        "(line 602,col 5)-(line 602,col 27)"
      ]
    }
  ]
}