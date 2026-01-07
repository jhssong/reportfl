{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/ode/nonstiff/EulerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 41,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator()",
      "begin_line": 58,
      "end_line": 59,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator(org.apache.commons.math.ode.nonstiff.EulerStepInterpolator)",
      "begin_line": 66,
      "end_line": 68,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 67,col 5)-(line 67,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.doCopy()",
      "begin_line": 71,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 5)-(line 73,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 78,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 5)-(line 84,col 5)",
        "(line 85,col 5)-(line 85,col 94)"
      ]
    }
  ]
}