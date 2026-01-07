{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/ode/nonstiff/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 48,
      "end_line": 125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_MINUS_SQRT_2"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PLUS_SQRT_2"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.GillStepInterpolator()",
      "begin_line": 71,
      "end_line": 72,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.GillStepInterpolator(org.apache.commons.math.ode.nonstiff.GillStepInterpolator)",
      "begin_line": 79,
      "end_line": 81,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 80,col 5)-(line 80,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.doCopy()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 91,
      "end_line": 123,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 39)",
        "(line 97,col 5)-(line 97,col 39)",
        "(line 98,col 5)-(line 98,col 50)",
        "(line 99,col 5)-(line 99,col 39)",
        "(line 100,col 5)-(line 100,col 37)",
        "(line 101,col 5)-(line 101,col 51)",
        "(line 102,col 5)-(line 102,col 52)",
        "(line 103,col 5)-(line 103,col 53)",
        "(line 104,col 5)-(line 104,col 52)",
        "(line 105,col 5)-(line 105,col 63)",
        "(line 106,col 5)-(line 106,col 56)",
        "(line 107,col 5)-(line 107,col 41)",
        "(line 108,col 5)-(line 108,col 56)",
        "(line 109,col 5)-(line 109,col 55)",
        "(line 110,col 5)-(line 110,col 52)",
        "(line 112,col 5)-(line 121,col 6)"
      ]
    }
  ]
}