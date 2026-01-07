{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/ode/DormandPrince54StepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DormandPrince54StepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.RungeKuttaStepInterpolator"
      ],
      "begin_line": 30,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.DormandPrince54StepInterpolator()",
      "begin_line": 42,
      "end_line": 49,
      "comment": " Simple constructor.\n   * This constructor builds an instance that is not usable yet, the\n   * {@link #reinitialize} method should be called before using the\n   * instance in order to initialize the internal arrays. This\n   * constructor is used only in order to delay the initialization in\n   * some cases. The {@link RungeKuttaFehlbergIntegrator} uses the\n   * prototyping design pattern to create the step interpolators by\n   * cloning an uninitialized model and latter initializing the copy.\n   ",
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
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.clone()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n   * Clone the instance.\n   * the copy is a deep copy: its arrays are separated from the\n   * original arrays of the instance\n   * @return a copy of the instance\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.reinitialize(org.apache.commons.math.ode.FirstOrderDifferentialEquations, double[], double[][], boolean)",
      "begin_line": 98,
      "end_line": 106,
      "comment": " Reinitialize the instance\n   * @param equations set of differential equations being integrated\n   * @param y reference to the integrator array holding the state at\n   * the end of the step\n   * @param yDotK reference to the integrator array holding all the\n   * intermediate slopes\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 100,col 5)-(line 100,col 53)",
        "(line 101,col 5)-(line 101,col 14)",
        "(line 102,col 5)-(line 102,col 14)",
        "(line 103,col 5)-(line 103,col 14)",
        "(line 104,col 5)-(line 104,col 14)",
        "(line 105,col 5)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.storeTime(double)",
      "begin_line": 111,
      "end_line": 114,
      "comment": " Store the current step time.\n   * @param t current time\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 23)",
        "(line 113,col 5)-(line 113,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.DormandPrince54StepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 124,
      "end_line": 163,
      "comment": " Compute the state at the interpolated time.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 151,col 5)",
        "(line 154,col 5)-(line 154,col 36)",
        "(line 155,col 5)-(line 161,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v1"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " First vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v2"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Second vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v3"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Third vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "v4"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Fourth vector for interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "vectorsInitialized"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Initialization indicator for the interpolation vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "a70"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": " last row of the Butcher-array internal weights, note that a71 is null"
    },
    {
      "type": "field",
      "varNames": [
        "a72"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a73"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a74"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a75"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d0"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " dense output of Shampine (1986), note that d1 is null"
    },
    {
      "type": "field",
      "varNames": [
        "d2"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d3"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d4"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d5"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d6"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": ""
    }
  ]
}