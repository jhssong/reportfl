{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/DormandPrince54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator"
      ],
      "begin_line": 34,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "A70"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Last row of the Butcher-array internal weights, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "A72"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Last row of the Butcher-array internal weights, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "A73"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Last row of the Butcher-array internal weights, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "A74"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Last row of the Butcher-array internal weights, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "A75"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Last row of the Butcher-array internal weights, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "D0"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Shampine (1986) Dense output, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "D2"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Shampine (1986) Dense output, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "D3"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Shampine (1986) Dense output, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "D4"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Shampine (1986) Dense output, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "D5"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Shampine (1986) Dense output, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "D6"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Shampine (1986) Dense output, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "v1"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " First vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v2"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Second vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v3"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Third vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v4"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Fourth vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator()",
      "begin_line": 101,
      "end_line": 108,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 102,col 5)-(line 102,col 12)",
        "(line 103,col 5)-(line 103,col 14)",
        "(line 104,col 5)-(line 104,col 14)",
        "(line 105,col 5)-(line 105,col 14)",
        "(line 106,col 5)-(line 106,col 14)",
        "(line 107,col 5)-(line 107,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator(org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator)",
      "begin_line": 115,
      "end_line": 137,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 24)",
        "(line 119,col 5)-(line 135,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.doCopy()",
      "begin_line": 140,
      "end_line": 143,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 142,col 5)-(line 142,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.reinitialize(org.apache.commons.math3.ode.AbstractIntegrator, double[], double[][], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 147,
      "end_line": 158,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 87)",
        "(line 153,col 5)-(line 153,col 14)",
        "(line 154,col 5)-(line 154,col 14)",
        "(line 155,col 5)-(line 155,col 14)",
        "(line 156,col 5)-(line 156,col 14)",
        "(line 157,col 5)-(line 157,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.storeTime(double)",
      "begin_line": 161,
      "end_line": 165,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 163,col 5)-(line 163,col 23)",
        "(line 164,col 5)-(line 164,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 168,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 5)-(line 199,col 5)",
        "(line 202,col 5)-(line 202,col 33)",
        "(line 203,col 5)-(line 203,col 38)",
        "(line 204,col 5)-(line 204,col 37)",
        "(line 205,col 5)-(line 205,col 48)",
        "(line 206,col 5)-(line 206,col 64)",
        "(line 207,col 5)-(line 219,col 5)"
      ]
    }
  ]
}