{
  "filepath": "/tmp/Math-37b/src/main/java/org/apache/commons/math/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepInterpolator"
      ],
      "begin_line": 43,
      "end_line": 592,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " current time step "
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " current state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedTime"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " interpolated time "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedState"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " interpolated state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedDerivatives"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " interpolated derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedPrimaryState"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " interpolated primary state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedPrimaryDerivatives"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " interpolated primary derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedSecondaryState"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " interpolated secondary state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedSecondaryDerivatives"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " interpolated secondary derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "globalPreviousTime"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " global previous time "
    },
    {
      "type": "field",
      "varNames": [
        "globalCurrentTime"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " global current time "
    },
    {
      "type": "field",
      "varNames": [
        "softPreviousTime"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " soft previous time "
    },
    {
      "type": "field",
      "varNames": [
        "softCurrentTime"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " soft current time "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyState"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " indicator for dirty state. "
    },
    {
      "type": "field",
      "varNames": [
        "primaryMapper"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Equations mapper for the primary equations set. "
    },
    {
      "type": "field",
      "varNames": [
        "secondaryMappers"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Equations mappers for the secondary equations sets. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 111,
      "end_line": 125,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator}\n   * class uses the prototyping design pattern to create the step\n   * interpolators by cloning an uninitialized model and latter\n   * initializing the copy.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 36)",
        "(line 113,col 5)-(line 113,col 36)",
        "(line 114,col 5)-(line 114,col 36)",
        "(line 115,col 5)-(line 115,col 36)",
        "(line 116,col 5)-(line 116,col 36)",
        "(line 117,col 5)-(line 117,col 36)",
        "(line 118,col 5)-(line 118,col 30)",
        "(line 119,col 5)-(line 119,col 31)",
        "(line 120,col 5)-(line 120,col 30)",
        "(line 121,col 5)-(line 121,col 30)",
        "(line 122,col 5)-(line 122,col 30)",
        "(line 123,col 5)-(line 123,col 30)",
        "(line 124,col 5)-(line 124,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean, org.apache.commons.math.ode.EquationsMapper, org.apache.commons.math.ode.EquationsMapper[])",
      "begin_line": 134,
      "end_line": 152,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   * @param primaryMapper equations mapper for the primary equations set\n   * @param secondaryMappers equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 39)",
        "(line 139,col 5)-(line 139,col 39)",
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 142,col 39)",
        "(line 143,col 5)-(line 143,col 39)",
        "(line 144,col 5)-(line 144,col 30)",
        "(line 145,col 5)-(line 145,col 34)",
        "(line 146,col 5)-(line 146,col 36)",
        "(line 147,col 5)-(line 147,col 33)",
        "(line 148,col 5)-(line 148,col 42)",
        "(line 149,col 5)-(line 149,col 89)",
        "(line 150,col 5)-(line 150,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 171,
      "end_line": 206,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 173,col 5)-(line 173,col 57)",
        "(line 174,col 5)-(line 174,col 56)",
        "(line 175,col 5)-(line 175,col 55)",
        "(line 176,col 5)-(line 176,col 54)",
        "(line 177,col 5)-(line 177,col 40)",
        "(line 178,col 5)-(line 178,col 55)",
        "(line 180,col 5)-(line 197,col 5)",
        "(line 199,col 5)-(line 199,col 46)",
        "(line 200,col 5)-(line 200,col 44)",
        "(line 201,col 5)-(line 201,col 47)",
        "(line 202,col 5)-(line 202,col 50)",
        "(line 203,col 5)-(line 204,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.allocateInterpolatedArrays(int)",
      "begin_line": 211,
      "end_line": 236,
      "comment": " Allocate the various interpolated states arrays.\n   * @param dimension total dimension (negative if arrays should be set to null)\n   ",
      "child_ranges": [
        "(line 212,col 7)-(line 235,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean, org.apache.commons.math.ode.EquationsMapper, org.apache.commons.math.ode.EquationsMapper[])",
      "begin_line": 244,
      "end_line": 262,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at the end of the step\n   * @param isForward integration direction indicator\n   * @param primary equations mapper for the primary equations set\n   * @param secondary equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 39)",
        "(line 249,col 5)-(line 249,col 39)",
        "(line 250,col 5)-(line 250,col 39)",
        "(line 251,col 5)-(line 251,col 39)",
        "(line 252,col 5)-(line 252,col 39)",
        "(line 253,col 5)-(line 253,col 39)",
        "(line 254,col 5)-(line 254,col 30)",
        "(line 255,col 5)-(line 255,col 34)",
        "(line 256,col 5)-(line 256,col 38)",
        "(line 257,col 5)-(line 257,col 33)",
        "(line 258,col 5)-(line 258,col 36)",
        "(line 259,col 5)-(line 259,col 46)",
        "(line 260,col 5)-(line 260,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 265,
      "end_line": 273,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 6)-(line 268,col 20)",
        "(line 271,col 6)-(line 271,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doCopy()",
      "begin_line": 282,
      "end_line": 282,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.shift()",
      "begin_line": 288,
      "end_line": 292,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 289,col 5)-(line 289,col 43)",
        "(line 290,col 5)-(line 290,col 44)",
        "(line 291,col 5)-(line 291,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 297,
      "end_line": 307,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 26)",
        "(line 300,col 5)-(line 300,col 42)",
        "(line 301,col 5)-(line 301,col 63)",
        "(line 302,col 5)-(line 302,col 27)",
        "(line 305,col 5)-(line 305,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setSoftPreviousTime(double)",
      "begin_line": 319,
      "end_line": 321,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getPreviousTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softPreviousTime start of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 320,col 7)-(line 320,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setSoftCurrentTime(double)",
      "begin_line": 333,
      "end_line": 335,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getCurrentTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softCurrentTime end of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 334,col 7)-(line 334,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getGlobalPreviousTime()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n   * Get the previous global grid point time.\n   * @return previous global grid point time\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 342,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getGlobalCurrentTime()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n   * Get the current global grid point time.\n   * @return current global grid point time\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n   * Get the previous soft grid point time.\n   * @return previous soft grid point time\n   * @see #setSoftPreviousTime(double)\n   ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n   * Get the current soft grid point time.\n   * @return current soft grid point time\n   * @see #setSoftCurrentTime(double)\n   ",
      "child_ranges": [
        "(line 368,col 5)-(line 368,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 372,
      "end_line": 374,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 377,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 7)-(line 378,col 30)",
        "(line 379,col 7)-(line 379,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 383,
      "end_line": 385,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 395,
      "end_line": 396,
      "comment": " Compute the state and derivatives at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.evaluateCompleteInterpolatedState()",
      "begin_line": 400,
      "end_line": 408,
      "comment": " Lazy evaluation of complete interpolated state.\n   ",
      "child_ranges": [
        "(line 402,col 7)-(line 407,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 411,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 412,col 7)-(line 412,col 42)",
        "(line 413,col 7)-(line 414,col 66)",
        "(line 415,col 7)-(line 415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 419,
      "end_line": 424,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 7)-(line 420,col 42)",
        "(line 421,col 7)-(line 422,col 72)",
        "(line 423,col 7)-(line 423,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedSecondaryState(int)",
      "begin_line": 427,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 428,col 7)-(line 428,col 42)",
        "(line 429,col 7)-(line 430,col 85)",
        "(line 431,col 7)-(line 431,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedSecondaryDerivatives(int)",
      "begin_line": 435,
      "end_line": 440,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 7)-(line 436,col 42)",
        "(line 437,col 7)-(line 438,col 91)",
        "(line 439,col 7)-(line 439,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 481,
      "end_line": 486,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   ",
      "child_ranges": [
        "(line 482,col 5)-(line 485,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 492,
      "end_line": 493,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 496,
      "end_line": 497,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 500,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 509,
      "end_line": 543,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 512,col 5)-(line 516,col 5)",
        "(line 517,col 5)-(line 517,col 40)",
        "(line 518,col 5)-(line 518,col 39)",
        "(line 519,col 5)-(line 519,col 38)",
        "(line 520,col 5)-(line 520,col 37)",
        "(line 521,col 5)-(line 521,col 23)",
        "(line 522,col 5)-(line 522,col 30)",
        "(line 523,col 5)-(line 523,col 35)",
        "(line 524,col 5)-(line 524,col 39)",
        "(line 525,col 5)-(line 527,col 5)",
        "(line 529,col 5)-(line 533,col 5)",
        "(line 535,col 5)-(line 535,col 38)",
        "(line 541,col 5)-(line 541,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 556,
      "end_line": 590,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time to be set later by the caller\n   * @exception IOException in case of read error\n   * @exception ClassNotFoundException if an equation mapper class\n   * cannot be found\n   ",
      "child_ranges": [
        "(line 559,col 5)-(line 559,col 39)",
        "(line 560,col 5)-(line 560,col 42)",
        "(line 561,col 5)-(line 561,col 42)",
        "(line 562,col 5)-(line 562,col 42)",
        "(line 563,col 5)-(line 563,col 42)",
        "(line 564,col 5)-(line 564,col 42)",
        "(line 565,col 5)-(line 565,col 43)",
        "(line 566,col 5)-(line 566,col 60)",
        "(line 567,col 5)-(line 567,col 57)",
        "(line 568,col 5)-(line 570,col 5)",
        "(line 571,col 5)-(line 571,col 31)",
        "(line 573,col 5)-(line 580,col 5)",
        "(line 583,col 5)-(line 583,col 34)",
        "(line 584,col 5)-(line 584,col 42)",
        "(line 586,col 5)-(line 586,col 21)",
        "(line 588,col 5)-(line 588,col 27)"
      ]
    }
  ]
}