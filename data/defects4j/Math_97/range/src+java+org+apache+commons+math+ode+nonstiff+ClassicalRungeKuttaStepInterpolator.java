{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/ClassicalRungeKuttaStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassicalRungeKuttaStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator()",
      "begin_line": 64,
      "end_line": 65,
      "comment": " Simple constructor.\n     * This constructor builds an instance that is not usable yet, the\n     * {@link RungeKuttaStepInterpolator#reinitialize} method should be\n     * called before using the instance in order to initialize the\n     * internal arrays. This constructor is used only in order to delay\n     * the initialization in some cases. The {@link RungeKuttaIntegrator}\n     * class uses the prototyping design pattern to create the step\n     * interpolators by cloning an uninitialized model and latter initializing\n     * the copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.ClassicalRungeKuttaStepInterpolator(org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator)",
      "begin_line": 72,
      "end_line": 74,
      "comment": " Copy constructor.\n     * @param interpolator interpolator to copy from. The copy is a deep\n     * copy: its arrays are separated from the original arrays of the\n     * instance\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.doCopy()",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 82,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 43)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 68)",
        "(line 89,col 9)-(line 89,col 68)",
        "(line 90,col 9)-(line 90,col 68)",
        "(line 92,col 9)-(line 97,col 9)"
      ]
    }
  ]
}