{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/ClassicalRungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 45,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator()",
      "begin_line": 58,
      "end_line": 59,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link RungeKuttaStepInterpolator#reinitialize} method should be\n   * called before using the instance in order to initialize the\n   * internal arrays. This constructor is used only in order to delay\n   * the initialization in some cases. The {@link RungeKuttaIntegrator}\n   * class uses the prototyping design pattern to create the step\n   * interpolators by cloning an uninitialized model and latter initializing\n   * the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator(org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator.doCopy()",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.ClassicalRungeKuttaStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 87,
      "end_line": 104,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 91,col 5)-(line 91,col 33)",
        "(line 92,col 5)-(line 92,col 44)",
        "(line 93,col 5)-(line 93,col 58)",
        "(line 94,col 5)-(line 94,col 58)",
        "(line 95,col 5)-(line 95,col 58)",
        "(line 97,col 5)-(line 102,col 6)"
      ]
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