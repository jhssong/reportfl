{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/HighamHall54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 32,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator()",
      "begin_line": 49,
      "end_line": 51,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * EmbeddedRungeKuttaIntegrator} uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator.HighamHall54StepInterpolator(org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator)",
      "begin_line": 58,
      "end_line": 60,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 59,col 5)-(line 59,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator.doCopy()",
      "begin_line": 63,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 70,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 81)",
        "(line 75,col 5)-(line 75,col 89)",
        "(line 76,col 5)-(line 76,col 75)",
        "(line 77,col 5)-(line 77,col 89)",
        "(line 78,col 5)-(line 78,col 59)",
        "(line 80,col 5)-(line 116,col 5)"
      ]
    }
  ]
}