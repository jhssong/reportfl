{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/ode/nonstiff/ThreeEighthesStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ThreeEighthesStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
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
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator()",
      "begin_line": 65,
      "end_line": 66,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.ThreeEighthesStepInterpolator(org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator)",
      "begin_line": 73,
      "end_line": 75,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 74,col 5)-(line 74,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.doCopy()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.ThreeEighthesStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 85,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 7)-(line 89,col 50)",
        "(line 90,col 7)-(line 90,col 53)",
        "(line 91,col 7)-(line 91,col 69)",
        "(line 92,col 7)-(line 92,col 65)",
        "(line 93,col 7)-(line 93,col 52)",
        "(line 94,col 7)-(line 94,col 61)",
        "(line 95,col 7)-(line 95,col 45)",
        "(line 96,col 7)-(line 96,col 64)",
        "(line 97,col 7)-(line 97,col 60)",
        "(line 98,col 7)-(line 98,col 60)",
        "(line 100,col 7)-(line 110,col 7)"
      ]
    }
  ]
}