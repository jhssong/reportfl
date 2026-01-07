{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/sampling/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 40,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDerivative"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Current derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 59,
      "end_line": 62,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator} uses\n   * the prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 12)",
        "(line 61,col 5)-(line 61,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(double[], double[], boolean)",
      "begin_line": 71,
      "end_line": 74,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDot reference to the integrator array holding the state\n   * derivative at some arbitrary point within the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 22)",
        "(line 73,col 5)-(line 73,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator)",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 24)",
        "(line 83,col 5)-(line 83,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.doCopy()",
      "begin_line": 89,
      "end_line": 92,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 104,
      "end_line": 109,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 107,col 7)-(line 107,col 94)",
        "(line 108,col 7)-(line 108,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 115,
      "end_line": 128,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 27)",
        "(line 122,col 5)-(line 126,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 134,
      "end_line": 153,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 42)",
        "(line 141,col 5)-(line 148,col 5)",
        "(line 151,col 5)-(line 151,col 27)"
      ]
    }
  ]
}