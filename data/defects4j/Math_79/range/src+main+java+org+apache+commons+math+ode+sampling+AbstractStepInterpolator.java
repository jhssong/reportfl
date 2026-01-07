{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepInterpolator"
      ],
      "begin_line": 44,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousTime"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " previous time "
    },
    {
      "type": "field",
      "varNames": [
        "currentTime"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " current time "
    },
    {
      "type": "field",
      "varNames": [
        "h"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " current time step "
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " current state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedTime"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " interpolated time "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedState"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " interpolated state "
    },
    {
      "type": "field",
      "varNames": [
        "interpolatedDerivatives"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " interpolated derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " integration direction. "
    },
    {
      "type": "field",
      "varNames": [
        "dirtyState"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " indicator for dirty state. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 89,
      "end_line": 100,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator}\n   * class uses the prototyping design pattern to create the step\n   * interpolators by cloning an uninitialized model and latter\n   * initializing the copy.\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 41)",
        "(line 91,col 5)-(line 91,col 41)",
        "(line 92,col 5)-(line 92,col 41)",
        "(line 93,col 5)-(line 93,col 41)",
        "(line 94,col 5)-(line 94,col 35)",
        "(line 95,col 5)-(line 95,col 35)",
        "(line 96,col 5)-(line 96,col 35)",
        "(line 97,col 5)-(line 97,col 36)",
        "(line 98,col 5)-(line 98,col 35)",
        "(line 99,col 5)-(line 99,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean)",
      "begin_line": 107,
      "end_line": 122,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 35)",
        "(line 110,col 5)-(line 110,col 35)",
        "(line 111,col 5)-(line 111,col 35)",
        "(line 112,col 5)-(line 112,col 35)",
        "(line 114,col 5)-(line 114,col 32)",
        "(line 115,col 5)-(line 115,col 51)",
        "(line 116,col 5)-(line 116,col 51)",
        "(line 118,col 5)-(line 118,col 30)",
        "(line 119,col 5)-(line 119,col 32)",
        "(line 120,col 5)-(line 120,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 141,
      "end_line": 162,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 50)",
        "(line 144,col 5)-(line 144,col 49)",
        "(line 145,col 5)-(line 145,col 39)",
        "(line 146,col 5)-(line 146,col 54)",
        "(line 148,col 5)-(line 156,col 5)",
        "(line 158,col 5)-(line 158,col 40)",
        "(line 159,col 5)-(line 159,col 38)",
        "(line 160,col 5)-(line 160,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 169,
      "end_line": 184,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param isForward integration direction indicator\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 35)",
        "(line 172,col 5)-(line 172,col 35)",
        "(line 173,col 5)-(line 173,col 35)",
        "(line 174,col 5)-(line 174,col 35)",
        "(line 176,col 5)-(line 176,col 32)",
        "(line 177,col 5)-(line 177,col 51)",
        "(line 178,col 5)-(line 178,col 51)",
        "(line 180,col 5)-(line 180,col 30)",
        "(line 181,col 5)-(line 181,col 34)",
        "(line 182,col 5)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 187,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 190,col 6)-(line 190,col 20)",
        "(line 193,col 6)-(line 193,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doCopy()",
      "begin_line": 204,
      "end_line": 204,
      "comment": " Really copy the finalized instance.\n    * \u003cp\u003eThis method is called by {@link #copy()} after the\n    * step has been finalized. It must perform a deep copy\n    * to have an new instance completely independent for the\n    * original instance.\n    * @return a copy of the finalized instance\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.shift()",
      "begin_line": 210,
      "end_line": 212,
      "comment": " Shift one step forward.\n   * Copy the current time into the previous time, hence preparing the\n   * interpolator for future calls to {@link #storeTime storeTime}\n   ",
      "child_ranges": [
        "(line 211,col 5)-(line 211,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.storeTime(double)",
      "begin_line": 217,
      "end_line": 226,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 219,col 5)-(line 219,col 20)",
        "(line 220,col 5)-(line 220,col 45)",
        "(line 221,col 5)-(line 221,col 27)",
        "(line 224,col 5)-(line 224,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getPreviousTime()",
      "begin_line": 229,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 234,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 239,
      "end_line": 241,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 5)-(line 240,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 244,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 7)-(line 245,col 30)",
        "(line 246,col 7)-(line 246,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 250,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 251,col 5)-(line 251,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 264,
      "end_line": 266,
      "comment": " Compute the state and derivatives at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 269,
      "end_line": 281,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 7)-(line 277,col 7)",
        "(line 279,col 7)-(line 279,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 284,
      "end_line": 296,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 7)-(line 292,col 7)",
        "(line 294,col 7)-(line 294,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 341,col 5)-(line 344,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 358,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 362,
      "end_line": 363,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 371,
      "end_line": 402,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 374,col 5)-(line 378,col 5)",
        "(line 379,col 5)-(line 379,col 34)",
        "(line 380,col 5)-(line 380,col 33)",
        "(line 381,col 5)-(line 381,col 23)",
        "(line 382,col 5)-(line 382,col 30)",
        "(line 384,col 5)-(line 388,col 5)",
        "(line 390,col 5)-(line 390,col 38)",
        "(line 396,col 5)-(line 400,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 413,
      "end_line": 441,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time be set later by the caller\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 416,col 5)-(line 416,col 39)",
        "(line 417,col 5)-(line 417,col 36)",
        "(line 418,col 5)-(line 418,col 36)",
        "(line 419,col 5)-(line 419,col 36)",
        "(line 420,col 5)-(line 420,col 37)",
        "(line 421,col 5)-(line 421,col 25)",
        "(line 423,col 5)-(line 430,col 5)",
        "(line 433,col 5)-(line 433,col 41)",
        "(line 434,col 5)-(line 434,col 77)",
        "(line 435,col 5)-(line 435,col 77)",
        "(line 437,col 5)-(line 437,col 21)",
        "(line 439,col 5)-(line 439,col 27)"
      ]
    }
  ]
}