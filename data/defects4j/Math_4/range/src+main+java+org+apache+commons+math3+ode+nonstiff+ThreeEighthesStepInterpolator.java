{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/ThreeEighthesStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 58,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator()",
      "begin_line": 75,
      "end_line": 76,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator(org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator)",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.doCopy()",
      "begin_line": 88,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 5)-(line 90,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 95,
      "end_line": 142,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 7)-(line 99,col 45)",
        "(line 100,col 7)-(line 100,col 64)",
        "(line 101,col 7)-(line 101,col 60)",
        "(line 102,col 7)-(line 102,col 60)",
        "(line 104,col 7)-(line 140,col 7)"
      ]
    }
  ]
}