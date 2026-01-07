{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/ThreeEighthesStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 47,
      "end_line": 112,
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
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.clone()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n   * Clone the instance.\n   * the copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ThreeEighthesStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 91,
      "end_line": 108,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 42)",
        "(line 96,col 5)-(line 96,col 45)",
        "(line 97,col 5)-(line 97,col 61)",
        "(line 98,col 5)-(line 98,col 57)",
        "(line 99,col 5)-(line 99,col 44)",
        "(line 100,col 5)-(line 100,col 53)",
        "(line 102,col 5)-(line 106,col 6)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    }
  ]
}