{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/ode/sampling/DummyStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DummyStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 38,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDerivative"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Current derivative. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator()",
      "begin_line": 57,
      "end_line": 60,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * \u003ccode\u003eAbstractStepInterpolator.reinitialize\u003c/code\u003e protected method\n   * should be called before using the instance in order to initialize\n   * the internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. As an example, the {@link\n   * org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator} uses\n   * the prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 12)",
        "(line 59,col 5)-(line 59,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(double[], double[], boolean)",
      "begin_line": 69,
      "end_line": 72,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDot reference to the integrator array holding the state\n   * derivative at some arbitrary point within the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 22)",
        "(line 71,col 5)-(line 71,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.DummyStepInterpolator(org.apache.commons.math.ode.sampling.DummyStepInterpolator)",
      "begin_line": 79,
      "end_line": 82,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 24)",
        "(line 81,col 5)-(line 81,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.doCopy()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 100,
      "end_line": 104,
      "comment": " Compute the state at the interpolated time.\n   * In this class, this method does nothing: the interpolated state\n   * is always the state at the end of the current step.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   ",
      "child_ranges": [
        "(line 102,col 7)-(line 102,col 94)",
        "(line 103,col 7)-(line 103,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 110,
      "end_line": 123,
      "comment": " Write the instance to an output channel.\n   * @param out output channel\n   * @exception IOException if the instance cannot be written\n   ",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 27)",
        "(line 117,col 5)-(line 121,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.DummyStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 129,
      "end_line": 148,
      "comment": " Read the instance from an input channel.\n   * @param in input channel\n   * @exception IOException if the instance cannot be read\n   ",
      "child_ranges": [
        "(line 134,col 5)-(line 134,col 42)",
        "(line 136,col 5)-(line 143,col 5)",
        "(line 146,col 5)-(line 146,col 27)"
      ]
    }
  ]
}