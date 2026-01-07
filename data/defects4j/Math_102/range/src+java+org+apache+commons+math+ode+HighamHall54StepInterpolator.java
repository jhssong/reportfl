{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/HighamHall54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HighamHall54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 30,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54StepInterpolator.HighamHall54StepInterpolator()",
      "begin_line": 42,
      "end_line": 44,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 12)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.HighamHall54StepInterpolator.HighamHall54StepInterpolator(org.apache.commons.math.ode.HighamHall54StepInterpolator)",
      "begin_line": 51,
      "end_line": 53,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 52,col 5)-(line 52,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54StepInterpolator.doCopy()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Really copy the finalized instance.\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.HighamHall54StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 70,
      "end_line": 88,
      "comment": " Compute the state at the interpolated time.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 34)",
        "(line 76,col 5)-(line 76,col 110)",
        "(line 77,col 5)-(line 77,col 100)",
        "(line 78,col 5)-(line 78,col 88)",
        "(line 79,col 5)-(line 79,col 102)",
        "(line 80,col 5)-(line 80,col 74)",
        "(line 82,col 5)-(line 86,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    }
  ]
}