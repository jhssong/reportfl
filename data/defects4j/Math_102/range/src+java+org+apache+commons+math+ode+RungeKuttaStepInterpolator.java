{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/RungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 181,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator()",
      "begin_line": 47,
      "end_line": 51,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator} classes uses the prototyping design\n   * pattern to create the step interpolators by cloning an\n   * uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 48,col 5)-(line 48,col 12)",
        "(line 49,col 5)-(line 49,col 21)",
        "(line 50,col 5)-(line 50,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator(org.apache.commons.math.ode.RungeKuttaStepInterpolator)",
      "begin_line": 70,
      "end_line": 92,
      "comment": " Copy constructor.\n\n  * \u003cp\u003eThe copied interpolator should have been finalized before the\n  * copy, otherwise the copy will not be able to perform correctly any\n  * interpolation and will throw a {@link NullPointerException}\n  * later. Since we don\u0027t want this constructor to throw the\n  * exceptions finalization may involve and since we don\u0027t want this\n  * method to modify the state of the copied interpolator,\n  * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n  * remains under user control.\u003c/p\u003e\n\n  * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n  * original arrays of the instance.\u003c/p\u003e\n\n  * @param interpolator interpolator to copy from.\n\n  ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 24)",
        "(line 74,col 5)-(line 86,col 5)",
        "(line 90,col 5)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 115,
      "end_line": 120,
      "comment": " Reinitialize the instance\n   * \u003cp\u003eSome Runge-Kutta integrators need fewer functions evaluations\n   * than their counterpart step interpolators. So the interpolator\n   * should perform the last evaluations they need by themselves. The\n   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator EmbeddedRungeKuttaIntegrator}\n   * abstract classes call this method in order to let the step\n   * interpolator perform the evaluations it needs. These evaluations\n   * will be performed during the call to \u003ccode\u003edoFinalize\u003c/code\u003e if\n   * any, i.e. only if the step handler either calls the {@link\n   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the\n   * {@link AbstractStepInterpolator#getInterpolatedState\n   * getInterpolatedState} method (for an interpolator which needs a\n   * finalization) or if it clones the step interpolator.\u003c/p\u003e\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 29)",
        "(line 118,col 5)-(line 118,col 23)",
        "(line 119,col 5)-(line 119,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 126,
      "end_line": 142,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 130,col 5)-(line 130,col 27)",
        "(line 133,col 5)-(line 133,col 31)",
        "(line 134,col 5)-(line 138,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.RungeKuttaStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 148,
      "end_line": 173,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 36)",
        "(line 155,col 5)-(line 155,col 28)",
        "(line 156,col 5)-(line 156,col 31)",
        "(line 157,col 5)-(line 162,col 5)",
        "(line 164,col 5)-(line 164,col 21)",
        "(line 166,col 5)-(line 171,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotK"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Slopes at the intermediate points "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Reference to the differential equations beeing integrated. "
    }
  ]
}