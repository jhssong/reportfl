{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/ClassicalRungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 56,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator()",
      "begin_line": 72,
      "end_line": 73,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link RungeKuttaStepInterpolator#reinitialize} method should be\n     * called before using the instance in order to initialize the\n     * internal arrays. This constructor is used only in order to delay\n     * the initialization in some cases. The {@link RungeKuttaIntegrator}\n     * class uses the prototyping design pattern to create the step\n     * interpolators by cloning an uninitialized model and latter initializing\n     * the copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator(org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator)",
      "begin_line": 80,
      "end_line": 82,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.doCopy()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 91,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 48)",
        "(line 96,col 9)-(line 96,col 52)",
        "(line 97,col 9)-(line 97,col 68)",
        "(line 98,col 9)-(line 98,col 63)",
        "(line 99,col 9)-(line 99,col 61)",
        "(line 100,col 9)-(line 130,col 9)"
      ]
    }
  ]
}