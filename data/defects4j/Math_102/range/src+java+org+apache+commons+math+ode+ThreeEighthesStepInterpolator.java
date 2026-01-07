{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/ThreeEighthesStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 47,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator()",
      "begin_line": 59,
      "end_line": 60,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link AbstractStepInterpolator#reinitialize} method should be called\n   * before using the instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaIntegrator} class uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator(org.apache.commons.math.ode.ThreeEighthesStepInterpolator)",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.doCopy()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Really copy the finalized instance.\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 88,
      "end_line": 105,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 42)",
        "(line 93,col 5)-(line 93,col 45)",
        "(line 94,col 5)-(line 94,col 61)",
        "(line 95,col 5)-(line 95,col 57)",
        "(line 96,col 5)-(line 96,col 44)",
        "(line 97,col 5)-(line 97,col 53)",
        "(line 99,col 5)-(line 103,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    }
  ]
}