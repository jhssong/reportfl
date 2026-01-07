{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/ode/nonstiff/RungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 37,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator()",
      "begin_line": 50,
      "end_line": 54,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator} classes use the prototyping design\n   * pattern to create the step interpolators by cloning an\n   * uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 12)",
        "(line 52,col 5)-(line 52,col 22)",
        "(line 53,col 5)-(line 53,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator(org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator)",
      "begin_line": 73,
      "end_line": 95,
      "comment": " Copy constructor.\n\n  * \u003cp\u003eThe copied interpolator should have been finalized before the\n  * copy, otherwise the copy will not be able to perform correctly any\n  * interpolation and will throw a {@link NullPointerException}\n  * later. Since we don\u0027t want this constructor to throw the\n  * exceptions finalization may involve and since we don\u0027t want this\n  * method to modify the state of the copied interpolator,\n  * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n  * remains under user control.\u003c/p\u003e\n\n  * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n  * original arrays of the instance.\u003c/p\u003e\n\n  * @param interpolator interpolator to copy from.\n\n  ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 24)",
        "(line 77,col 5)-(line 89,col 5)",
        "(line 93,col 5)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.reinitialize(org.apache.commons.math.ode.AbstractIntegrator, double[], double[][], boolean)",
      "begin_line": 118,
      "end_line": 123,
      "comment": " Reinitialize the instance\n   * \u003cp\u003eSome Runge-Kutta integrators need fewer functions evaluations\n   * than their counterpart step interpolators. So the interpolator\n   * should perform the last evaluations they need by themselves. The\n   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator EmbeddedRungeKuttaIntegrator}\n   * abstract classes call this method in order to let the step\n   * interpolator perform the evaluations it needs. These evaluations\n   * will be performed during the call to \u003ccode\u003edoFinalize\u003c/code\u003e if\n   * any, i.e. only if the step handler either calls the {@link\n   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the\n   * {@link AbstractStepInterpolator#getInterpolatedState\n   * getInterpolatedState} method (for an interpolator which needs a\n   * finalization) or if it clones the step interpolator.\u003c/p\u003e\n   * @param integrator integrator being used\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 29)",
        "(line 121,col 5)-(line 121,col 23)",
        "(line 122,col 5)-(line 122,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 126,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 5)-(line 131,col 27)",
        "(line 134,col 5)-(line 134,col 68)",
        "(line 135,col 5)-(line 135,col 57)",
        "(line 136,col 5)-(line 136,col 23)",
        "(line 137,col 5)-(line 141,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 148,
      "end_line": 175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 42)",
        "(line 156,col 5)-(line 156,col 68)",
        "(line 157,col 5)-(line 157,col 34)",
        "(line 158,col 5)-(line 158,col 51)",
        "(line 159,col 5)-(line 164,col 5)",
        "(line 166,col 5)-(line 166,col 22)",
        "(line 168,col 5)-(line 173,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotK"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Slopes at the intermediate points "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Reference to the integrator. "
    }
  ]
}