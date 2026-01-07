{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/GillStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GillStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 56,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_MINUS_INV_SQRT_2"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " First Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_PLUS_INV_SQRT_2"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Second Gill coefficient. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator.GillStepInterpolator()",
      "begin_line": 79,
      "end_line": 80,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link\n   * org.apache.commons.math3.ode.sampling.AbstractStepInterpolator#reinitialize}\n   * method should be called before using the instance in order to\n   * initialize the internal arrays. This constructor is used only\n   * in order to delay the initialization in some cases. The {@link\n   * RungeKuttaIntegrator} class uses the prototyping design pattern\n   * to create the step interpolators by cloning an uninitialized model\n   * and later initializing the copy.\n   ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator.GillStepInterpolator(org.apache.commons.math3.ode.nonstiff.GillStepInterpolator)",
      "begin_line": 87,
      "end_line": 89,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 88,col 5)-(line 88,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator.doCopy()",
      "begin_line": 92,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 99,
      "end_line": 147,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 40)",
        "(line 104,col 5)-(line 104,col 50)",
        "(line 105,col 5)-(line 105,col 57)",
        "(line 106,col 5)-(line 106,col 53)",
        "(line 107,col 5)-(line 107,col 61)",
        "(line 108,col 5)-(line 108,col 60)",
        "(line 109,col 5)-(line 109,col 53)",
        "(line 111,col 5)-(line 145,col 5)"
      ]
    }
  ]
}