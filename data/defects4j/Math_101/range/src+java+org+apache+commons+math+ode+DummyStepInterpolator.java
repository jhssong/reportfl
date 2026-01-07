{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 51,
      "end_line": 53,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized\n   * model and latter initializing the copy.\n   ",
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
      "begin_line": 69,
      "end_line": 71,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.doCopy()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 77,col 5)-(line 77,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 90,
      "end_line": 93,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 92,col 7)-(line 92,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 99,
      "end_line": 103,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 109,
      "end_line": 122,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 113,col 5)-(line 113,col 36)",
        "(line 115,col 5)-(line 120,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Serializable version identifier "
    }
  ]
}