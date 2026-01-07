{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/ode/sampling/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 42,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 55,
      "end_line": 57,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(double[], boolean)",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator)",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.doCopy()",
      "begin_line": 80,
      "end_line": 83,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 98,col 7)-(line 98,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 105,
      "end_line": 110,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 109,col 5)-(line 109,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 116,
      "end_line": 130,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 121,col 5)-(line 121,col 42)",
        "(line 123,col 5)-(line 128,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Serializable version identifier "
    }
  ]
}