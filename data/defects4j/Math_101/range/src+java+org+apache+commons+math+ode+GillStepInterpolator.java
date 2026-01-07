{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 44,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.GillStepInterpolator()",
      "begin_line": 56,
      "end_line": 57,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.GillStepInterpolator(org.apache.commons.math.ode.GillStepInterpolator)",
      "begin_line": 64,
      "end_line": 66,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.doCopy()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GillStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 86,
      "end_line": 105,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 33)",
        "(line 91,col 5)-(line 91,col 44)",
        "(line 92,col 5)-(line 92,col 39)",
        "(line 93,col 5)-(line 93,col 46)",
        "(line 94,col 5)-(line 94,col 46)",
        "(line 95,col 5)-(line 95,col 34)",
        "(line 96,col 5)-(line 96,col 34)",
        "(line 97,col 5)-(line 97,col 57)",
        "(line 99,col 5)-(line 103,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tMq"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "tPq"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Serializable version identifier "
    }
  ]
}