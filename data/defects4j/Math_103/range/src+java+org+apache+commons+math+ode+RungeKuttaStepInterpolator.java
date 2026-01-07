{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/RungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 35,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator()",
      "begin_line": 48,
      "end_line": 52,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} and {@link\n   * RungeKuttaFehlbergIntegrator} classes uses the prototyping design\n   * pattern to create the step interpolators by cloning an\n   * uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 49,col 5)-(line 49,col 12)",
        "(line 50,col 5)-(line 50,col 21)",
        "(line 51,col 5)-(line 51,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator(org.apache.commons.math.ode.RungeKuttaStepInterpolator)",
      "begin_line": 71,
      "end_line": 93,
      "comment": " Copy constructor.\n\n  * \u003cp\u003eThe copied interpolator should have been finalized before the\n  * copy, otherwise the copy will not be able to perform correctly any\n  * interpolation and will throw a {@link NullPointerException}\n  * later. Since we don\u0027t want this constructor to throw the\n  * exceptions finalization may involve and since we don\u0027t want this\n  * method to modify the state of the copied interpolator,\n  * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n  * remains under user control.\u003c/p\u003e\n\n  * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n  * original arrays of the instance.\u003c/p\u003e\n\n  * @param interpolator interpolator to copy from.\n\n  ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 24)",
        "(line 75,col 5)-(line 87,col 5)",
        "(line 91,col 5)-(line 91,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 116,
      "end_line": 121,
      "comment": " Reinitialize the instance\n   * \u003cp\u003eSome Runge-Kutta integrators need fewer functions evaluations\n   * than their counterpart step interpolators. So the interpolator\n   * should perform the last evaluations they need by themselves. The\n   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link\n   * RungeKuttaFehlbergIntegrator RungeKuttaFehlbergIntegrator}\n   * abstract classes call this method in order to let the step\n   * interpolator perform the evaluations it needs. These evaluations\n   * will be performed during the call to \u003ccode\u003edoFinalize\u003c/code\u003e if\n   * any, i.e. only if the step handler either calls the {@link\n   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the\n   * {@link AbstractStepInterpolator#getInterpolatedState\n   * getInterpolatedState} method (for an interpolator which needs a\n   * finalization) or if it clones the step interpolator.\u003c/p\u003e\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 29)",
        "(line 119,col 5)-(line 119,col 23)",
        "(line 120,col 5)-(line 120,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 127,
      "end_line": 143,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 27)",
        "(line 134,col 5)-(line 134,col 31)",
        "(line 135,col 5)-(line 139,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 149,
      "end_line": 174,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 36)",
        "(line 156,col 5)-(line 156,col 28)",
        "(line 157,col 5)-(line 157,col 31)",
        "(line 158,col 5)-(line 163,col 5)",
        "(line 165,col 5)-(line 165,col 21)",
        "(line 167,col 5)-(line 172,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotK"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Slopes at the intermediate points "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Reference to the differential equations beeing integrated. "
    }
  ]
}