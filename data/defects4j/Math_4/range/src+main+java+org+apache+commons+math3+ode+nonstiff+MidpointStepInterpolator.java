{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 114,
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
      "signature": "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator()",
      "begin_line": 65,
      "end_line": 66,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator(org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator)",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator.doCopy()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 85,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 5)-(line 89,col 39)",
        "(line 90,col 5)-(line 90,col 43)",
        "(line 92,col 5)-(line 110,col 5)"
      ]
    }
  ]
}