{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/ode/nonstiff/ThreeEighthesStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 50,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator()",
      "begin_line": 62,
      "end_line": 63,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator(org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator)",
      "begin_line": 70,
      "end_line": 72,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 71,col 5)-(line 71,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.doCopy()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 81,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 7)-(line 85,col 50)",
        "(line 86,col 7)-(line 86,col 53)",
        "(line 87,col 7)-(line 87,col 69)",
        "(line 88,col 7)-(line 88,col 65)",
        "(line 89,col 7)-(line 89,col 52)",
        "(line 90,col 7)-(line 90,col 61)",
        "(line 91,col 7)-(line 91,col 45)",
        "(line 92,col 7)-(line 92,col 64)",
        "(line 93,col 7)-(line 93,col 60)",
        "(line 94,col 7)-(line 94,col 60)",
        "(line 96,col 7)-(line 106,col 7)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Serializable version identifier "
    }
  ]
}