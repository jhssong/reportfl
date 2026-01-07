{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/EulerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EulerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 46,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator()",
      "begin_line": 63,
      "end_line": 64,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.EulerStepInterpolator(org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator)",
      "begin_line": 71,
      "end_line": 73,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 72,col 5)-(line 72,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.doCopy()",
      "begin_line": 76,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 5)-(line 78,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 83,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 7)-(line 96,col 7)"
      ]
    }
  ]
}