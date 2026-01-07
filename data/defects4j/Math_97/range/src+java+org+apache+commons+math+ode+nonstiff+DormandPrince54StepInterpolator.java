{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/DormandPrince54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 201,
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
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 5)-(line 86,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 91,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 53)",
        "(line 94,col 5)-(line 94,col 14)",
        "(line 95,col 5)-(line 95,col 14)",
        "(line 96,col 5)-(line 96,col 14)",
        "(line 97,col 5)-(line 97,col 14)",
        "(line 98,col 5)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.storeTime(double)",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 5)-(line 103,col 23)",
        "(line 104,col 5)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 108,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 5)-(line 135,col 5)",
        "(line 138,col 5)-(line 138,col 42)",
        "(line 139,col 5)-(line 142,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v1"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " First vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v2"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Second vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v3"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Third vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v4"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Fourth vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "a70"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Last row of the Butcher-array internal weights, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "a72"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Last row of the Butcher-array internal weights, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "a73"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Last row of the Butcher-array internal weights, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "a74"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Last row of the Butcher-array internal weights, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "a75"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Last row of the Butcher-array internal weights, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d0"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": " Shampine (1986) Dense output, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Shampine (1986) Dense output, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Shampine (1986) Dense output, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Shampine (1986) Dense output, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Shampine (1986) Dense output, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d6"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Shampine (1986) Dense output, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Serializable version identifier "
    }
  ]
}