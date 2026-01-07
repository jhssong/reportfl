{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/ode/nonstiff/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 123,
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
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 80,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 5)-(line 85,col 39)",
        "(line 86,col 5)-(line 86,col 39)",
        "(line 87,col 5)-(line 87,col 50)",
        "(line 88,col 5)-(line 88,col 39)",
        "(line 89,col 5)-(line 89,col 37)",
        "(line 90,col 5)-(line 90,col 51)",
        "(line 91,col 5)-(line 91,col 52)",
        "(line 92,col 5)-(line 92,col 40)",
        "(line 93,col 5)-(line 93,col 40)",
        "(line 94,col 5)-(line 94,col 63)",
        "(line 95,col 5)-(line 95,col 56)",
        "(line 96,col 5)-(line 96,col 41)",
        "(line 97,col 5)-(line 97,col 43)",
        "(line 98,col 5)-(line 98,col 43)",
        "(line 99,col 5)-(line 99,col 52)",
        "(line 101,col 5)-(line 110,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tMq"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "tPq"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Serializable version identifier "
    }
  ]
}