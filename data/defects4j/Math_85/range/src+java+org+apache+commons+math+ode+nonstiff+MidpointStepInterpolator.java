{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/ode/nonstiff/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 45,
      "end_line": 99,
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
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 77,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 5)-(line 82,col 52)",
        "(line 83,col 5)-(line 83,col 60)",
        "(line 84,col 5)-(line 84,col 39)",
        "(line 85,col 5)-(line 85,col 43)",
        "(line 87,col 5)-(line 92,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Serializable version identifier "
    }
  ]
}