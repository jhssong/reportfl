{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepInterpolator"
      ],
      "begin_line": 43,
      "end_line": 517,
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
        "globalPreviousTime"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " global previous time "
    },
    {
      "type": "field",
      "varNames": [
        "globalCurrentTime"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " global current time "
    },
    {
      "type": "field",
      "varNames": [
        "softPreviousTime"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " soft previous time "
    },
    {
      "type": "field",
      "varNames": [
        "softCurrentTime"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " soft current time "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyState"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " indicator for dirty state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 94,
      "end_line": 107,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator}\n   * class uses the prototyping design pattern to create the step\n   * interpolators by cloning an uninitialized model and latter\n   * initializing the copy.\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 41)",
        "(line 96,col 5)-(line 96,col 41)",
        "(line 97,col 5)-(line 97,col 41)",
        "(line 98,col 5)-(line 98,col 41)",
        "(line 99,col 5)-(line 99,col 41)",
        "(line 100,col 5)-(line 100,col 41)",
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 35)",
        "(line 104,col 5)-(line 104,col 36)",
        "(line 105,col 5)-(line 105,col 35)",
        "(line 106,col 5)-(line 106,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean)",
      "begin_line": 114,
      "end_line": 131,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 36)",
        "(line 117,col 5)-(line 117,col 36)",
        "(line 118,col 5)-(line 118,col 36)",
        "(line 119,col 5)-(line 119,col 36)",
        "(line 120,col 5)-(line 120,col 36)",
        "(line 121,col 5)-(line 121,col 36)",
        "(line 123,col 5)-(line 123,col 32)",
        "(line 124,col 5)-(line 124,col 51)",
        "(line 125,col 5)-(line 125,col 51)",
        "(line 127,col 5)-(line 127,col 30)",
        "(line 128,col 5)-(line 128,col 32)",
        "(line 129,col 5)-(line 129,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 150,
      "end_line": 173,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 57)",
        "(line 153,col 5)-(line 153,col 56)",
        "(line 154,col 5)-(line 154,col 55)",
        "(line 155,col 5)-(line 155,col 54)",
        "(line 156,col 5)-(line 156,col 40)",
        "(line 157,col 5)-(line 157,col 55)",
        "(line 159,col 5)-(line 167,col 5)",
        "(line 169,col 5)-(line 169,col 40)",
        "(line 170,col 5)-(line 170,col 38)",
        "(line 171,col 5)-(line 171,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 180,
      "end_line": 197,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param isForward integration direction indicator\n   ",
      "child_ranges": [
        "(line 182,col 5)-(line 182,col 36)",
        "(line 183,col 5)-(line 183,col 36)",
        "(line 184,col 5)-(line 184,col 36)",
        "(line 185,col 5)-(line 185,col 36)",
        "(line 186,col 5)-(line 186,col 36)",
        "(line 187,col 5)-(line 187,col 36)",
        "(line 189,col 5)-(line 189,col 32)",
        "(line 190,col 5)-(line 190,col 51)",
        "(line 191,col 5)-(line 191,col 51)",
        "(line 193,col 5)-(line 193,col 30)",
        "(line 194,col 5)-(line 194,col 34)",
        "(line 195,col 5)-(line 195,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 200,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 6)-(line 203,col 20)",
        "(line 206,col 6)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doCopy()",
      "begin_line": 217,
      "end_line": 217,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.shift()",
      "begin_line": 223,
      "end_line": 227,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 224,col 5)-(line 224,col 43)",
        "(line 225,col 5)-(line 225,col 44)",
        "(line 226,col 5)-(line 226,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 232,
      "end_line": 242,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 234,col 5)-(line 234,col 26)",
        "(line 235,col 5)-(line 235,col 42)",
        "(line 236,col 5)-(line 236,col 63)",
        "(line 237,col 5)-(line 237,col 27)",
        "(line 240,col 5)-(line 240,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setSoftPreviousTime(double)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getPreviousTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softPreviousTime start of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 255,col 7)-(line 255,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setSoftCurrentTime(double)",
      "begin_line": 268,
      "end_line": 270,
      "comment": " Restrict step range to a limited part of the global step.\n   * \u003cp\u003e\n   * This method can be used to restrict a step and make it appear\n   * as if the original step was smaller. Calling this method\n   * \u003cem\u003eonly\u003c/em\u003e changes the value returned by {@link #getCurrentTime()},\n   * it does not change any other property\n   * \u003c/p\u003e\n   * @param softCurrentTime end of the restricted step\n   * @since 2.2\n   ",
      "child_ranges": [
        "(line 269,col 7)-(line 269,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getGlobalPreviousTime()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n   * Get the previous global grid point time.\n   * @return previous global grid point time\n   ",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getGlobalCurrentTime()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n   * Get the current global grid point time.\n   * @return current global grid point time\n   ",
      "child_ranges": [
        "(line 285,col 5)-(line 285,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n   * Get the previous soft grid point time.\n   * @return previous soft grid point time\n   * @see #setSoftPreviousTime(double)\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n   * Get the current soft grid point time.\n   * @return current soft grid point time\n   * @see #setSoftCurrentTime(double)\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 307,
      "end_line": 309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 308,col 5)-(line 308,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 312,
      "end_line": 315,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 7)-(line 313,col 30)",
        "(line 314,col 7)-(line 314,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 318,
      "end_line": 320,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 332,
      "end_line": 334,
      "comment": " Compute the state and derivatives at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws MathUserException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 337,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 7)-(line 345,col 7)",
        "(line 347,col 7)-(line 347,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 352,
      "end_line": 364,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 355,col 7)-(line 360,col 7)",
        "(line 362,col 7)-(line 362,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 407,
      "end_line": 413,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @throws MathUserException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 409,col 5)-(line 412,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @throws MathUserException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 426,
      "end_line": 427,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 430,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 439,
      "end_line": 474,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 442,col 5)-(line 446,col 5)",
        "(line 447,col 5)-(line 447,col 40)",
        "(line 448,col 5)-(line 448,col 39)",
        "(line 449,col 5)-(line 449,col 38)",
        "(line 450,col 5)-(line 450,col 37)",
        "(line 451,col 5)-(line 451,col 23)",
        "(line 452,col 5)-(line 452,col 30)",
        "(line 454,col 5)-(line 458,col 5)",
        "(line 460,col 5)-(line 460,col 38)",
        "(line 466,col 5)-(line 472,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 485,
      "end_line": 515,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time be set later by the caller\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 488,col 5)-(line 488,col 39)",
        "(line 489,col 5)-(line 489,col 42)",
        "(line 490,col 5)-(line 490,col 42)",
        "(line 491,col 5)-(line 491,col 42)",
        "(line 492,col 5)-(line 492,col 42)",
        "(line 493,col 5)-(line 493,col 42)",
        "(line 494,col 5)-(line 494,col 43)",
        "(line 495,col 5)-(line 495,col 31)",
        "(line 497,col 5)-(line 504,col 5)",
        "(line 507,col 5)-(line 507,col 41)",
        "(line 508,col 5)-(line 508,col 77)",
        "(line 509,col 5)-(line 509,col 77)",
        "(line 511,col 5)-(line 511,col 21)",
        "(line 513,col 5)-(line 513,col 27)"
      ]
    }
  ]
}