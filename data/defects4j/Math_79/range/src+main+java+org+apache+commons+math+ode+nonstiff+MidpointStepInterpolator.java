{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/MidpointStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MidpointStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 44,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator()",
      "begin_line": 61,
      "end_line": 62,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.MidpointStepInterpolator(org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator)",
      "begin_line": 69,
      "end_line": 71,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 70,col 5)-(line 70,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.doCopy()",
      "begin_line": 74,
      "end_line": 77,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.MidpointStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 81,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 52)",
        "(line 87,col 5)-(line 87,col 60)",
        "(line 88,col 5)-(line 88,col 39)",
        "(line 89,col 5)-(line 89,col 43)",
        "(line 91,col 5)-(line 96,col 5)"
      ]
    }
  ]
}