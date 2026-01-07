{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/ode/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 45,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.GillStepInterpolator()",
      "begin_line": 57,
      "end_line": 58,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.GillStepInterpolator(org.apache.commons.math.ode.GillStepInterpolator)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.clone()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n   * Clone the instance.\n   * the copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 89,
      "end_line": 108,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 33)",
        "(line 94,col 5)-(line 94,col 44)",
        "(line 95,col 5)-(line 95,col 39)",
        "(line 96,col 5)-(line 96,col 46)",
        "(line 97,col 5)-(line 97,col 46)",
        "(line 98,col 5)-(line 98,col 34)",
        "(line 99,col 5)-(line 99,col 34)",
        "(line 100,col 5)-(line 100,col 57)",
        "(line 102,col 5)-(line 106,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tMq"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "tPq"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    }
  ]
}