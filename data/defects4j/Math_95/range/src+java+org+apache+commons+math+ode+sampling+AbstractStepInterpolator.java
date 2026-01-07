{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/ode/sampling/AbstractStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.StepInterpolator"
      ],
      "begin_line": 46,
      "end_line": 411,
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
        "interpolatedDerivatives"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " interpolated derivatives "
    },
    {
      "type": "field",
      "varNames": [
        "finalized"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " indicate if the step has been finalized or not. "
    },
    {
      "type": "field",
      "varNames": [
        "forward"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " integration direction. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator()",
      "begin_line": 86,
      "end_line": 96,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 41)",
        "(line 88,col 5)-(line 88,col 41)",
        "(line 89,col 5)-(line 89,col 41)",
        "(line 90,col 5)-(line 90,col 41)",
        "(line 91,col 5)-(line 91,col 35)",
        "(line 92,col 5)-(line 92,col 35)",
        "(line 93,col 5)-(line 93,col 35)",
        "(line 94,col 5)-(line 94,col 36)",
        "(line 95,col 5)-(line 95,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(double[], boolean)",
      "begin_line": 103,
      "end_line": 117,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 105,col 5)-(line 105,col 35)",
        "(line 106,col 5)-(line 106,col 35)",
        "(line 107,col 5)-(line 107,col 35)",
        "(line 108,col 5)-(line 108,col 35)",
        "(line 110,col 5)-(line 110,col 32)",
        "(line 111,col 5)-(line 111,col 51)",
        "(line 112,col 5)-(line 112,col 51)",
        "(line 114,col 5)-(line 114,col 30)",
        "(line 115,col 5)-(line 115,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.AbstractStepInterpolator(org.apache.commons.math.ode.sampling.AbstractStepInterpolator)",
      "begin_line": 136,
      "end_line": 156,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any derivative computation and will throw a {@link\n   * NullPointerException} later. Since we don\u0027t want this constructor\n   * to throw the exceptions finalization may involve and since we\n   * don\u0027t want this method to modify the state of the copied\n   * interpolator, finalization is \u003cstrong\u003enot\u003c/strong\u003e done\n   * automatically, it remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 50)",
        "(line 139,col 5)-(line 139,col 49)",
        "(line 140,col 5)-(line 140,col 39)",
        "(line 141,col 5)-(line 141,col 54)",
        "(line 143,col 5)-(line 151,col 5)",
        "(line 153,col 5)-(line 153,col 39)",
        "(line 154,col 5)-(line 154,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.reinitialize(double[], boolean)",
      "begin_line": 163,
      "end_line": 177,
      "comment": " Reinitialize the instance\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 165,col 5)-(line 165,col 35)",
        "(line 166,col 5)-(line 166,col 35)",
        "(line 167,col 5)-(line 167,col 35)",
        "(line 168,col 5)-(line 168,col 35)",
        "(line 170,col 5)-(line 170,col 32)",
        "(line 171,col 5)-(line 171,col 51)",
        "(line 172,col 5)-(line 172,col 51)",
        "(line 174,col 5)-(line 174,col 30)",
        "(line 175,col 5)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.copy()",
      "begin_line": 180,
      "end_line": 188,
      "comment": " {@inheritDoc} ",
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
      "begin_line": 224,
      "end_line": 226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getCurrentTime()",
      "begin_line": 229,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedTime()",
      "begin_line": 234,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.setInterpolatedTime(double)",
      "begin_line": 239,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 241,col 7)-(line 241,col 30)",
        "(line 242,col 7)-(line 242,col 67)",
        "(line 243,col 7)-(line 243,col 67)",
        "(line 244,col 7)-(line 244,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.isForward()",
      "begin_line": 248,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 249,col 5)-(line 249,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 262,
      "end_line": 264,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedState()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 5)-(line 268,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.getInterpolatedDerivatives()",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 5)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.finalizeStep()",
      "begin_line": 318,
      "end_line": 324,
      "comment": "\n   * Finalize the step.\n\n   * \u003cp\u003eSome embedded Runge-Kutta integrators need fewer functions\n   * evaluations than their counterpart step interpolators. These\n   * interpolators should perform the last evaluations they need by\n   * themselves only if they need them. This method triggers these\n   * extra evaluations. It can be called directly by the user step\n   * handler and it is called automatically if {@link\n   * #setInterpolatedTime} is called.\u003c/p\u003e\n\n   * \u003cp\u003eOnce this method has been called, \u003cstrong\u003eno\u003c/strong\u003e other\n   * evaluation will be performed on this step. If there is a need to\n   * have some side effects between the step handler and the\n   * differential equations (for example update some data in the\n   * equations once the step has been done), it is advised to call\n   * this method explicitly from the step handler before these side\n   * effects are set up. If the step handler induces no side effect,\n   * then this method can safely be ignored, it will be called\n   * transparently as needed.\u003c/p\u003e\n\n   * \u003cp\u003e\u003cstrong\u003eWarning\u003c/strong\u003e: since the step interpolator provided\n   * to the step handler as a parameter of the {@link\n   * StepHandler#handleStep handleStep} is valid only for the duration\n   * of the {@link StepHandler#handleStep handleStep} call, one cannot\n   * simply store a reference and reuse it later. One should first\n   * finalize the instance, then copy this finalized instance into a\n   * new object that can be kept.\u003c/p\u003e\n\n   * \u003cp\u003eThis method calls the protected \u003ccode\u003edoFinalize\u003c/code\u003e method\n   * if it has never been called during this step and set a flag\n   * indicating that it has been called once. It is the \u003ccode\u003e\n   * doFinalize\u003c/code\u003e method which should perform the evaluations.\n   * This wrapping prevents from calling \u003ccode\u003edoFinalize\u003c/code\u003e several\n   * times and hence evaluating the differential equations too often.\n   * Therefore, subclasses are not allowed not reimplement it, they\n   * should rather reimplement \u003ccode\u003edoFinalize\u003c/code\u003e.\u003c/p\u003e\n\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n\n   ",
      "child_ranges": [
        "(line 320,col 5)-(line 323,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.doFinalize()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n   * Really finalize the step.\n   * The default implementation of this method does nothing.\n   * @throws DerivativeException this exception is propagated to the\n   * caller if the underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 337,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 341,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.writeBaseExternal(java.io.ObjectOutput)",
      "begin_line": 350,
      "end_line": 375,
      "comment": " Save the base state of the instance.\n   * This method performs step finalization if it has not been done\n   * before.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 353,col 5)-(line 353,col 38)",
        "(line 354,col 5)-(line 354,col 34)",
        "(line 355,col 5)-(line 355,col 33)",
        "(line 356,col 5)-(line 356,col 23)",
        "(line 357,col 5)-(line 357,col 30)",
        "(line 359,col 5)-(line 361,col 5)",
        "(line 363,col 5)-(line 363,col 38)",
        "(line 369,col 5)-(line 373,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.AbstractStepInterpolator.readBaseExternal(java.io.ObjectInput)",
      "begin_line": 386,
      "end_line": 409,
      "comment": " Read the base state of the instance.\n   * This method does \u003cstrong\u003eneither\u003c/strong\u003e set the interpolated\n   * time nor state. It is up to the derived class to reset it\n   * properly calling the {@link #setInterpolatedTime} method later,\n   * once all rest of the object state has been set up properly.\n   * @param in stream where to read the state from\n   * @return interpolated time be set later by the caller\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 389,col 5)-(line 389,col 39)",
        "(line 390,col 5)-(line 390,col 36)",
        "(line 391,col 5)-(line 391,col 36)",
        "(line 392,col 5)-(line 392,col 36)",
        "(line 393,col 5)-(line 393,col 37)",
        "(line 395,col 5)-(line 395,col 42)",
        "(line 396,col 5)-(line 398,col 5)",
        "(line 401,col 5)-(line 401,col 41)",
        "(line 402,col 5)-(line 402,col 52)",
        "(line 403,col 5)-(line 403,col 52)",
        "(line 405,col 5)-(line 405,col 21)",
        "(line 407,col 5)-(line 407,col 27)"
      ]
    }
  ]
}