{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/ode/nonstiff/HighamHall54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 33,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": [
        "(line 51,col 5)-(line 51,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator(org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator)",
      "begin_line": 59,
      "end_line": 61,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 60,col 5)-(line 60,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.doCopy()",
      "begin_line": 64,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 5)-(line 66,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 71,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 40)",
        "(line 78,col 5)-(line 78,col 116)",
        "(line 79,col 5)-(line 79,col 106)",
        "(line 80,col 5)-(line 80,col 94)",
        "(line 81,col 5)-(line 81,col 108)",
        "(line 82,col 5)-(line 82,col 80)",
        "(line 83,col 5)-(line 83,col 81)",
        "(line 84,col 5)-(line 84,col 89)",
        "(line 85,col 5)-(line 85,col 75)",
        "(line 86,col 5)-(line 86,col 89)",
        "(line 87,col 5)-(line 87,col 59)",
        "(line 89,col 5)-(line 99,col 5)"
      ]
    }
  ]
}