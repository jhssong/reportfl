{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/ode/nonstiff/HighamHall54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator()",
      "begin_line": 46,
      "end_line": 48,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator(org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator)",
      "begin_line": 55,
      "end_line": 57,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 56,col 5)-(line 56,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.doCopy()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 5)-(line 61,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 66,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 40)",
        "(line 72,col 5)-(line 72,col 116)",
        "(line 73,col 5)-(line 73,col 106)",
        "(line 74,col 5)-(line 74,col 94)",
        "(line 75,col 5)-(line 75,col 108)",
        "(line 76,col 5)-(line 76,col 80)",
        "(line 77,col 5)-(line 77,col 81)",
        "(line 78,col 5)-(line 78,col 89)",
        "(line 79,col 5)-(line 79,col 75)",
        "(line 80,col 5)-(line 80,col 89)",
        "(line 81,col 5)-(line 81,col 59)",
        "(line 83,col 5)-(line 93,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Serializable version identifier "
    }
  ]
}