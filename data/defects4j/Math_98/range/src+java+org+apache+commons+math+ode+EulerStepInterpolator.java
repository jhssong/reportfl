{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/EulerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 39,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EulerStepInterpolator.EulerStepInterpolator()",
      "begin_line": 51,
      "end_line": 52,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.EulerStepInterpolator.EulerStepInterpolator(org.apache.commons.math.ode.EulerStepInterpolator)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EulerStepInterpolator.doCopy()",
      "begin_line": 66,
      "end_line": 68,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.EulerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 81,
      "end_line": 89,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 85,col 5)-(line 87,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Serializable version identifier "
    }
  ]
}