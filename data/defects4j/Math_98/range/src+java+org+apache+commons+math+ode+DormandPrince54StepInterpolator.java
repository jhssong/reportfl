{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/ode/DormandPrince54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 30,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator()",
      "begin_line": 42,
      "end_line": 49,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link EmbeddedRungeKuttaIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
      "child_ranges": [
        "(line 43,col 5)-(line 43,col 12)",
        "(line 44,col 5)-(line 44,col 14)",
        "(line 45,col 5)-(line 45,col 14)",
        "(line 46,col 5)-(line 46,col 14)",
        "(line 47,col 5)-(line 47,col 14)",
        "(line 48,col 5)-(line 48,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator(org.apache.commons.math.ode.DormandPrince54StepInterpolator)",
      "begin_line": 56,
      "end_line": 78,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 58,col 5)-(line 58,col 24)",
        "(line 60,col 5)-(line 76,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.doCopy()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 84,col 5)-(line 84,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 96,
      "end_line": 104,
      "comment": " Reinitialize the instance\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 53)",
        "(line 99,col 5)-(line 99,col 14)",
        "(line 100,col 5)-(line 100,col 14)",
        "(line 101,col 5)-(line 101,col 14)",
        "(line 102,col 5)-(line 102,col 14)",
        "(line 103,col 5)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.storeTime(double)",
      "begin_line": 109,
      "end_line": 112,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 110,col 5)-(line 110,col 23)",
        "(line 111,col 5)-(line 111,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 122,
      "end_line": 158,
      "comment": " Compute the state at the interpolated time.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 126,col 5)-(line 149,col 5)",
        "(line 152,col 5)-(line 152,col 36)",
        "(line 153,col 5)-(line 156,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v1"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " First vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v2"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Second vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v3"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Third vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v4"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Fourth vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "a70"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Last row of the Butcher-array internal weights, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "a72"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " Last row of the Butcher-array internal weights, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "a73"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Last row of the Butcher-array internal weights, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "a74"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Last row of the Butcher-array internal weights, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "a75"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Last row of the Butcher-array internal weights, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d0"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Shampine (1986) Dense output, element 0. "
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Shampine (1986) Dense output, element 2. "
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": " Shampine (1986) Dense output, element 3. "
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Shampine (1986) Dense output, element 4. "
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Shampine (1986) Dense output, element 5. "
    },
    {
      "type": "field",
      "varNames": [
        "d6"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Shampine (1986) Dense output, element 6. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Serializable version identifier "
    }
  ]
}