{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/ode/sampling/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 41,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(double[], boolean)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator)",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.doCopy()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 81,col 5)-(line 81,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 97,col 7)-(line 97,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 104,
      "end_line": 109,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 108,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 115,
      "end_line": 125,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 42)",
        "(line 123,col 5)-(line 123,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Serializable version identifier "
    }
  ]
}