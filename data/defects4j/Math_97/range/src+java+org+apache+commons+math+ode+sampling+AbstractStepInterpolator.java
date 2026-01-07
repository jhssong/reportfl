{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepInterpolator"
      ],
      "begin_line": 46,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousTime"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " previous time "
    },
    {
      "type": "field",
      "varNames": [
        "currentTime"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " current time "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " current time step "
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " current state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedTime"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " interpolated time "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedState"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " interpolated state "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " integration direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 83,
      "end_line": 92,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 35)",
        "(line 85,col 5)-(line 85,col 35)",
        "(line 86,col 5)-(line 86,col 35)",
        "(line 87,col 5)-(line 87,col 35)",
        "(line 88,col 5)-(line 88,col 29)",
        "(line 89,col 5)-(line 89,col 29)",
        "(line 90,col 5)-(line 90,col 30)",
        "(line 91,col 5)-(line 91,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean)",
      "begin_line": 99,
      "end_line": 112,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 101,col 5)-(line 101,col 35)",
        "(line 102,col 5)-(line 102,col 35)",
        "(line 103,col 5)-(line 103,col 35)",
        "(line 104,col 5)-(line 104,col 35)",
        "(line 106,col 5)-(line 106,col 26)",
        "(line 107,col 5)-(line 107,col 45)",
        "(line 109,col 5)-(line 109,col 30)",
        "(line 110,col 5)-(line 110,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 131,
      "end_line": 149,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 133,col 5)-(line 133,col 50)",
        "(line 134,col 5)-(line 134,col 49)",
        "(line 135,col 5)-(line 135,col 39)",
        "(line 136,col 5)-(line 136,col 54)",
        "(line 138,col 5)-(line 144,col 5)",
        "(line 146,col 5)-(line 146,col 39)",
        "(line 147,col 5)-(line 147,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 156,
      "end_line": 169,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 35)",
        "(line 159,col 5)-(line 159,col 35)",
        "(line 160,col 5)-(line 160,col 35)",
        "(line 161,col 5)-(line 161,col 35)",
        "(line 163,col 5)-(line 163,col 26)",
        "(line 164,col 5)-(line 164,col 45)",
        "(line 166,col 5)-(line 166,col 30)",
        "(line 167,col 5)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 180,
      "end_line": 188,
      "comment": " Copy the instance.\n   * \u003cp\u003eThe copied instance is guaranteed to be independent from the\n   * original one. Both can be used with different settings for\n   * interpolated time without any side effect.\u003c/p\u003e\n   * @return a deep copy of the instance, which can be used independently.\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   * @see #setInterpolatedTime(double)\n   ",
      "child_ranges": [
        "(line 183,col 6)-(line 183,col 20)",
        "(line 186,col 6)-(line 186,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doCopy()",
      "begin_line": 197,
      "end_line": 197,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.shift()",
      "begin_line": 203,
      "end_line": 205,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 204,col 5)-(line 204,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 210,
      "end_line": 221,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 212,col 5)-(line 212,col 25)",
        "(line 213,col 5)-(line 213,col 50)",
        "(line 214,col 5)-(line 214,col 25)",
        "(line 215,col 5)-(line 216,col 42)",
        "(line 219,col 5)-(line 219,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n   * Get the previous grid point time.\n   * @return previous grid point time\n   ",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n   * Get the current grid point time.\n   * @return current grid point time\n   ",
      "child_ranges": [
        "(line 236,col 5)-(line 236,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the current grid point time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 246,col 5)-(line 246,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n   * Set the time of the interpolated point.\n   * \u003cp\u003eSetting the time outside of the current step is now allowed\n   * (it was not allowed up to version 5.4 of Mantissa), but should be\n   * used with care since the accuracy of the interpolator will\n   * probably be very poor far from this step. This allowance has been\n   * added to simplify implementation of search algorithms near the\n   * step endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": [
        "(line 263,col 7)-(line 263,col 30)",
        "(line 264,col 7)-(line 264,col 67)",
        "(line 265,col 7)-(line 265,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 276,
      "end_line": 278,
      "comment": " Check if the natural integration direction is forward.\n   * \u003cp\u003eThis method provides the integration direction as specified by the\n   * integrator itself, it avoid some nasty problems in degenerated\n   * cases like null steps due to cancellation at step initialization,\n   * step control or discrete events triggering.\u003c/p\u003e\n   * @return true if the integration variable (time) increases during\n   * integration\n   ",
      "child_ranges": [
        "(line 277,col 5)-(line 277,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 290,
      "end_line": 292,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n\n   ",
      "child_ranges": [
        "(line 347,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 367,
      "end_line": 368,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 374,
      "end_line": 375,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 383,
      "end_line": 408,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 386,col 5)-(line 386,col 38)",
        "(line 387,col 5)-(line 387,col 34)",
        "(line 388,col 5)-(line 388,col 33)",
        "(line 389,col 5)-(line 389,col 23)",
        "(line 390,col 5)-(line 390,col 30)",
        "(line 392,col 5)-(line 394,col 5)",
        "(line 396,col 5)-(line 396,col 38)",
        "(line 402,col 5)-(line 406,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 419,
      "end_line": 441,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time be set later by the caller\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 422,col 5)-(line 422,col 39)",
        "(line 423,col 5)-(line 423,col 36)",
        "(line 424,col 5)-(line 424,col 36)",
        "(line 425,col 5)-(line 425,col 36)",
        "(line 426,col 5)-(line 426,col 37)",
        "(line 428,col 5)-(line 428,col 42)",
        "(line 429,col 5)-(line 431,col 5)",
        "(line 434,col 5)-(line 434,col 35)",
        "(line 435,col 5)-(line 435,col 46)",
        "(line 437,col 5)-(line 437,col 21)",
        "(line 439,col 5)-(line 439,col 27)"
      ]
    }
  ]
}