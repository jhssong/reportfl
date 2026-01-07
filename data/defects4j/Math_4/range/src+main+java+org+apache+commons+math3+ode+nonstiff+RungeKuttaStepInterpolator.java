{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/RungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "previousState"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Previous state. "
    },
    {
      "type": "field",
      "varNames": [
        "yDotK"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Slopes at the intermediate points "
    },
    {
      "type": "field",
      "varNames": [
        "integrator"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Reference to the integrator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator()",
      "begin_line": 60,
      "end_line": 64,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator} classes use the prototyping design\n   * pattern to create the step interpolators by cloning an\n   * uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 25)",
        "(line 62,col 5)-(line 62,col 25)",
        "(line 63,col 5)-(line 63,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.RungeKuttaStepInterpolator(org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator)",
      "begin_line": 83,
      "end_line": 105,
      "comment": " Copy constructor.\n\n  * \u003cp\u003eThe copied interpolator should have been finalized before the\n  * copy, otherwise the copy will not be able to perform correctly any\n  * interpolation and will throw a {@link NullPointerException}\n  * later. Since we don\u0027t want this constructor to throw the\n  * exceptions finalization may involve and since we don\u0027t want this\n  * method to modify the state of the copied interpolator,\n  * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n  * remains under user control.\u003c/p\u003e\n\n  * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n  * original arrays of the instance.\u003c/p\u003e\n\n  * @param interpolator interpolator to copy from.\n\n  ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 24)",
        "(line 87,col 5)-(line 99,col 5)",
        "(line 103,col 5)-(line 103,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.reinitialize(org.apache.commons.math3.ode.AbstractIntegrator, double[], double[][], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 130,
      "end_line": 138,
      "comment": " Reinitialize the instance\n   * \u003cp\u003eSome Runge-Kutta integrators need fewer functions evaluations\n   * than their counterpart step interpolators. So the interpolator\n   * should perform the last evaluations they need by themselves. The\n   * {@link RungeKuttaIntegrator RungeKuttaIntegrator} and {@link\n   * EmbeddedRungeKuttaIntegrator EmbeddedRungeKuttaIntegrator}\n   * abstract classes call this method in order to let the step\n   * interpolator perform the evaluations it needs. These evaluations\n   * will be performed during the call to \u003ccode\u003edoFinalize\u003c/code\u003e if\n   * any, i.e. only if the step handler either calls the {@link\n   * AbstractStepInterpolator#finalizeStep finalizeStep} method or the\n   * {@link AbstractStepInterpolator#getInterpolatedState\n   * getInterpolatedState} method (for an interpolator which needs a\n   * finalization) or if it clones the step interpolator.\u003c/p\u003e\n   * @param rkIntegrator integrator being used\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotArray reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   * @param primaryMapper equations mapper for the primary equations set\n   * @param secondaryMappers equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 62)",
        "(line 135,col 5)-(line 135,col 30)",
        "(line 136,col 5)-(line 136,col 27)",
        "(line 137,col 5)-(line 137,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.shift()",
      "begin_line": 141,
      "end_line": 145,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 5)-(line 143,col 41)",
        "(line 144,col 5)-(line 144,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 148,
      "end_line": 171,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 27)",
        "(line 156,col 5)-(line 156,col 68)",
        "(line 157,col 5)-(line 159,col 5)",
        "(line 161,col 5)-(line 161,col 57)",
        "(line 162,col 5)-(line 162,col 23)",
        "(line 163,col 5)-(line 167,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 174,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 42)",
        "(line 182,col 5)-(line 182,col 68)",
        "(line 183,col 5)-(line 190,col 5)",
        "(line 192,col 5)-(line 192,col 34)",
        "(line 193,col 5)-(line 193,col 51)",
        "(line 194,col 5)-(line 199,col 5)",
        "(line 201,col 5)-(line 201,col 22)",
        "(line 203,col 5)-(line 208,col 5)"
      ]
    }
  ]
}