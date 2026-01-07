{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/ode/nonstiff/RungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 39,
      "end_line": 180,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator()",
      "begin_line": 52,
      "end_line": 56,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator} classes use the prototyping design\n   * pattern to create the step interpolators by cloning an\n   * uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 53,col 5)-(line 53,col 12)",
        "(line 54,col 5)-(line 54,col 21)",
        "(line 55,col 5)-(line 55,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator(org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator)",
      "begin_line": 75,
      "end_line": 97,
      "comment": " Copy constructor.\n\n  * \u003cp\u003eThe copied interpolator should have been finalized before the\n  * copy, otherwise the copy will not be able to perform correctly any\n  * interpolation and will throw a {@link NullPointerException}\n  * later. Since we don\u0027t want this constructor to throw the\n  * exceptions finalization may involve and since we don\u0027t want this\n  * method to modify the state of the copied interpolator,\n  * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n  * remains under user control.\u003c/p\u003e\n\n  * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n  * original arrays of the instance.\u003c/p\u003e\n\n  * @param interpolator interpolator to copy from.\n\n  ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 24)",
        "(line 79,col 5)-(line 91,col 5)",
        "(line 95,col 5)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 120,
      "end_line": 125,
      "comment": " Reinitialize the instance\n   * \u003cp\u003eSome Runge-Kutta integrators need fewer functions evaluations\n   * than their counterpart step interpolators. So the interpolator\n   * should perform the last evaluations they need by themselves. The\n   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator EmbeddedRungeKuttaIntegrator}\n   * abstract classes call this method in order to let the step\n   * interpolator perform the evaluations it needs. These evaluations\n   * will be performed during the call to \u003ccode\u003edoFinalize\u003c/code\u003e if\n   * any, i.e. only if the step handler either calls the {@link\n   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the\n   * {@link AbstractStepInterpolator#getInterpolatedState\n   * getInterpolatedState} method (for an interpolator which needs a\n   * finalization) or if it clones the step interpolator.\u003c/p\u003e\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 29)",
        "(line 123,col 5)-(line 123,col 23)",
        "(line 124,col 5)-(line 124,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 128,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 5)-(line 132,col 27)",
        "(line 135,col 5)-(line 135,col 31)",
        "(line 136,col 5)-(line 140,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 147,
      "end_line": 172,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 42)",
        "(line 154,col 5)-(line 154,col 34)",
        "(line 155,col 5)-(line 155,col 31)",
        "(line 156,col 5)-(line 161,col 5)",
        "(line 163,col 5)-(line 163,col 21)",
        "(line 165,col 5)-(line 170,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "yDotK"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Slopes at the intermediate points "
    },
    {
      "type": "field",
      "varNames": [
        "equations"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Reference to the differential equations being integrated. "
    }
  ]
}