{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/ode/nonstiff/DormandPrince54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator()",
      "begin_line": 46,
      "end_line": 53,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 47,col 5)-(line 47,col 12)",
        "(line 48,col 5)-(line 48,col 14)",
        "(line 49,col 5)-(line 49,col 14)",
        "(line 50,col 5)-(line 50,col 14)",
        "(line 51,col 5)-(line 51,col 14)",
        "(line 52,col 5)-(line 52,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator(org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator)",
      "begin_line": 60,
      "end_line": 82,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 62,col 5)-(line 62,col 24)",
        "(line 64,col 5)-(line 80,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.doCopy()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.reinitialize(org.apache.commons.math.ode.AbstractIntegrator, double[], double[][], boolean)",
      "begin_line": 92,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 5)-(line 95,col 54)",
        "(line 96,col 5)-(line 96,col 14)",
        "(line 97,col 5)-(line 97,col 14)",
        "(line 98,col 5)-(line 98,col 14)",
        "(line 99,col 5)-(line 99,col 14)",
        "(line 100,col 5)-(line 100,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.storeTime(double)",
      "begin_line": 104,
      "end_line": 108,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 23)",
        "(line 107,col 5)-(line 107,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 111,
      "end_line": 157,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 116,col 5)-(line 143,col 5)",
        "(line 146,col 5)-(line 146,col 33)",
        "(line 147,col 5)-(line 147,col 38)",
        "(line 148,col 5)-(line 148,col 37)",
        "(line 149,col 5)-(line 149,col 48)",
        "(line 150,col 5)-(line 150,col 64)",
        "(line 151,col 5)-(line 155,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v1"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " First vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v2"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Second vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v3"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Third vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v4"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Fourth vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "a70"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Last row of the Butcher-array internal weights, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "a72"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Last row of the Butcher-array internal weights, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "a73"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Last row of the Butcher-array internal weights, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "a74"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Last row of the Butcher-array internal weights, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "a75"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Last row of the Butcher-array internal weights, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d0"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Shampine (1986) Dense output, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Shampine (1986) Dense output, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Shampine (1986) Dense output, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Shampine (1986) Dense output, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Shampine (1986) Dense output, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d6"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Shampine (1986) Dense output, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " Serializable version identifier "
    }
  ]
}