{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/EulerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 42,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator()",
      "begin_line": 59,
      "end_line": 60,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator(org.apache.commons.math.ode.nonstiff.EulerStepInterpolator)",
      "begin_line": 67,
      "end_line": 69,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 68,col 5)-(line 68,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.doCopy()",
      "begin_line": 72,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 79,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 5)-(line 86,col 5)",
        "(line 87,col 5)-(line 87,col 94)"
      ]
    }
  ]
}