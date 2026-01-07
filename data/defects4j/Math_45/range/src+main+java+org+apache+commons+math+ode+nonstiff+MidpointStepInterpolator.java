{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/ode/nonstiff/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 43,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator()",
      "begin_line": 60,
      "end_line": 61,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator(org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator)",
      "begin_line": 68,
      "end_line": 70,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 69,col 5)-(line 69,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.doCopy()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 5)-(line 75,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 80,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 52)",
        "(line 85,col 5)-(line 85,col 60)",
        "(line 86,col 5)-(line 86,col 39)",
        "(line 87,col 5)-(line 87,col 43)",
        "(line 89,col 5)-(line 94,col 5)"
      ]
    }
  ]
}