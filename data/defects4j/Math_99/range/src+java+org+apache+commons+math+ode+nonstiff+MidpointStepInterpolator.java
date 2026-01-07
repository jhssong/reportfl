{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/ode/nonstiff/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 45,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator()",
      "begin_line": 57,
      "end_line": 58,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator(org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator)",
      "begin_line": 65,
      "end_line": 67,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.doCopy()",
      "begin_line": 70,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 76,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 52)",
        "(line 81,col 5)-(line 81,col 60)",
        "(line 82,col 5)-(line 82,col 39)",
        "(line 83,col 5)-(line 83,col 43)",
        "(line 85,col 5)-(line 90,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Serializable version identifier "
    }
  ]
}