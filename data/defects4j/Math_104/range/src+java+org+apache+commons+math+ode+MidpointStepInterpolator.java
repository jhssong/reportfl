{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 42,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MidpointStepInterpolator.MidpointStepInterpolator()",
      "begin_line": 54,
      "end_line": 55,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.MidpointStepInterpolator.MidpointStepInterpolator(org.apache.commons.math.ode.MidpointStepInterpolator)",
      "begin_line": 62,
      "end_line": 64,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 63,col 5)-(line 63,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MidpointStepInterpolator.clone()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n   * Clone the instance.\n   * the copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.MidpointStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 86,
      "end_line": 98,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 43)",
        "(line 91,col 5)-(line 91,col 51)",
        "(line 93,col 5)-(line 96,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    }
  ]
}