{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/sampling/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 40,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 56,
      "end_line": 58,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator} uses\n   * the prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(double[], boolean)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 22)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator)",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.doCopy()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 96,
      "end_line": 100,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 106,
      "end_line": 111,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 117,
      "end_line": 127,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 122,col 5)-(line 122,col 42)",
        "(line 125,col 5)-(line 125,col 27)"
      ]
    }
  ]
}