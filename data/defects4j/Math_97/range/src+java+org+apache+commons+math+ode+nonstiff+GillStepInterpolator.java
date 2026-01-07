{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.GillStepInterpolator()",
      "begin_line": 60,
      "end_line": 61,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.GillStepInterpolator(org.apache.commons.math.ode.nonstiff.GillStepInterpolator)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.doCopy()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 79,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 5)-(line 83,col 39)",
        "(line 84,col 5)-(line 84,col 50)",
        "(line 85,col 5)-(line 85,col 45)",
        "(line 86,col 5)-(line 86,col 52)",
        "(line 87,col 5)-(line 87,col 52)",
        "(line 88,col 5)-(line 88,col 40)",
        "(line 89,col 5)-(line 89,col 40)",
        "(line 90,col 5)-(line 90,col 63)",
        "(line 92,col 5)-(line 96,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tMq"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "tPq"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Serializable version identifier "
    }
  ]
}