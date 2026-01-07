{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * RungeKuttaFehlbergIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.DummyStepInterpolator(double[], boolean)",
      "begin_line": 60,
      "end_line": 62,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.DummyStepInterpolator)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Copy constructor.\n\n   * \u003cp\u003eThe copied interpolator should have been finalized before the\n   * copy, otherwise the copy will not be able to perform correctly\n   * any interpolation and will throw a {@link NullPointerException}\n   * later. Since we don\u0027t want this constructor to throw the\n   * exceptions finalization may involve and since we don\u0027t want this\n   * method to modify the state of the copied interpolator,\n   * finalization is \u003cstrong\u003enot\u003c/strong\u003e done automatically, it\n   * remains under user control.\u003c/p\u003e\n\n   * \u003cp\u003eThe copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance.\u003c/p\u003e\n\n   * @param interpolator interpolator to copy from.\n\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 95,
      "end_line": 97,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 105,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 36)",
        "(line 111,col 5)-(line 116,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    }
  ]
}