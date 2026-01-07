{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/ode/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.StepInterpolator"
      ],
      "begin_line": 41,
      "end_line": 438,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousTime"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " previous time "
    },
    {
      "type": "field",
      "varNames": [
        "currentTime"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " current time "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " current time step "
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " current state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedTime"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " interpolated time "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedState"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " interpolated state "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " integration direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 78,
      "end_line": 87,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 79,col 5)-(line 79,col 35)",
        "(line 80,col 5)-(line 80,col 35)",
        "(line 81,col 5)-(line 81,col 35)",
        "(line 82,col 5)-(line 82,col 35)",
        "(line 83,col 5)-(line 83,col 29)",
        "(line 84,col 5)-(line 84,col 29)",
        "(line 85,col 5)-(line 85,col 30)",
        "(line 86,col 5)-(line 86,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean)",
      "begin_line": 94,
      "end_line": 107,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 35)",
        "(line 97,col 5)-(line 97,col 35)",
        "(line 98,col 5)-(line 98,col 35)",
        "(line 99,col 5)-(line 99,col 35)",
        "(line 101,col 5)-(line 101,col 26)",
        "(line 102,col 5)-(line 102,col 45)",
        "(line 104,col 5)-(line 104,col 30)",
        "(line 105,col 5)-(line 105,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.AbstractStepInterpolator)",
      "begin_line": 126,
      "end_line": 144,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 50)",
        "(line 129,col 5)-(line 129,col 49)",
        "(line 130,col 5)-(line 130,col 39)",
        "(line 131,col 5)-(line 131,col 54)",
        "(line 133,col 5)-(line 139,col 5)",
        "(line 141,col 5)-(line 141,col 39)",
        "(line 142,col 5)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 151,
      "end_line": 164,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 35)",
        "(line 154,col 5)-(line 154,col 35)",
        "(line 155,col 5)-(line 155,col 35)",
        "(line 156,col 5)-(line 156,col 35)",
        "(line 158,col 5)-(line 158,col 26)",
        "(line 159,col 5)-(line 159,col 45)",
        "(line 161,col 5)-(line 161,col 30)",
        "(line 162,col 5)-(line 162,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.copy()",
      "begin_line": 175,
      "end_line": 183,
      "comment": " Copy the instance.\n   * \u003cp\u003eThe copied instance is guaranteed to be independent from the\n   * original one. Both can be used with different settings for\n   * interpolated time without any side effect.\u003c/p\u003e\n   * @return a deep copy of the instance, which can be used independently.\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   * @see #setInterpolatedTime(double)\n   ",
      "child_ranges": [
        "(line 178,col 6)-(line 178,col 20)",
        "(line 181,col 6)-(line 181,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.doCopy()",
      "begin_line": 192,
      "end_line": 192,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.shift()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 205,
      "end_line": 216,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 207,col 5)-(line 207,col 25)",
        "(line 208,col 5)-(line 208,col 50)",
        "(line 209,col 5)-(line 209,col 25)",
        "(line 210,col 5)-(line 211,col 42)",
        "(line 214,col 5)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n   * Get the previous grid point time.\n   * @return previous grid point time\n   ",
      "child_ranges": [
        "(line 223,col 5)-(line 223,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n   * Get the current grid point time.\n   * @return current grid point time\n   ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n   * Get the time of the interpolated point.\n   * If {@link #setInterpolatedTime} has not been called, it returns\n   * the current grid point time.\n   * @return interpolation point time\n   ",
      "child_ranges": [
        "(line 241,col 5)-(line 241,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\n   * Set the time of the interpolated point.\n   * \u003cp\u003eSetting the time outside of the current step is now allowed\n   * (it was not allowed up to version 5.4 of Mantissa), but should be\n   * used with care since the accuracy of the interpolator will\n   * probably be very poor far from this step. This allowance has been\n   * added to simplify implementation of search algorithms near the\n   * step endpoints.\u003c/p\u003e\n   * @param time time of the interpolated point\n   * @throws DerivativeException if this call induces an automatic\n   * step finalization that throws one\n   ",
      "child_ranges": [
        "(line 258,col 5)-(line 258,col 28)",
        "(line 259,col 5)-(line 259,col 59)",
        "(line 260,col 5)-(line 260,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.isForward()",
      "begin_line": 271,
      "end_line": 273,
      "comment": " Check if the natural integration direction is forward.\n   * \u003cp\u003eThis method provides the integration direction as specified by the\n   * integrator itself, it avoid some nasty problems in degenerated\n   * cases like null steps due to cancellation at step initialization,\n   * step control or switching function triggering.\u003c/p\u003e\n   * @return true if the integration variable (time) increases during\n   * integration\n   ",
      "child_ranges": [
        "(line 272,col 5)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 285,
      "end_line": 287,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n   * Get the state vector of the interpolated point.\n   * @return state vector at time {@link #getInterpolatedTime}\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 340,
      "end_line": 346,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n\n   ",
      "child_ranges": [
        "(line 342,col 5)-(line 345,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.doFinalize()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 362,
      "end_line": 363,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 369,
      "end_line": 370,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 378,
      "end_line": 403,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 38)",
        "(line 382,col 5)-(line 382,col 34)",
        "(line 383,col 5)-(line 383,col 33)",
        "(line 384,col 5)-(line 384,col 23)",
        "(line 385,col 5)-(line 385,col 30)",
        "(line 387,col 5)-(line 389,col 5)",
        "(line 391,col 5)-(line 391,col 38)",
        "(line 397,col 5)-(line 401,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 414,
      "end_line": 436,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time be set later by the caller\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 417,col 5)-(line 417,col 33)",
        "(line 418,col 5)-(line 418,col 36)",
        "(line 419,col 5)-(line 419,col 36)",
        "(line 420,col 5)-(line 420,col 36)",
        "(line 421,col 5)-(line 421,col 37)",
        "(line 423,col 5)-(line 423,col 42)",
        "(line 424,col 5)-(line 426,col 5)",
        "(line 429,col 5)-(line 429,col 35)",
        "(line 430,col 5)-(line 430,col 46)",
        "(line 432,col 5)-(line 432,col 21)",
        "(line 434,col 5)-(line 434,col 27)"
      ]
    }
  ]
}