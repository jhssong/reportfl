{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/EulerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 43,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator()",
      "begin_line": 55,
      "end_line": 56,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator(org.apache.commons.math.ode.nonstiff.EulerStepInterpolator)",
      "begin_line": 63,
      "end_line": 65,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 64,col 5)-(line 64,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.doCopy()",
      "begin_line": 68,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 74,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier "
    }
  ]
}