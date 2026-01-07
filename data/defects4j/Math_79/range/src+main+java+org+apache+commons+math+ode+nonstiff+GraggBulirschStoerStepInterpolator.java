{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 77,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "y0Dot"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Derivatives at the middle of the step.\n     * element 0 is state at midpoint, element 1 is first derivative ...\n     "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 110,
      "end_line": 116,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 20)",
        "(line 112,col 5)-(line 112,col 20)",
        "(line 113,col 5)-(line 113,col 20)",
        "(line 114,col 5)-(line 114,col 20)",
        "(line 115,col 5)-(line 115,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 130,
      "end_line": 143,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at theend of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 135,col 5)-(line 135,col 22)",
        "(line 136,col 5)-(line 136,col 26)",
        "(line 137,col 5)-(line 137,col 23)",
        "(line 138,col 5)-(line 138,col 26)",
        "(line 139,col 5)-(line 139,col 29)",
        "(line 141,col 5)-(line 141,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator)",
      "begin_line": 150,
      "end_line": 178,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 24)",
        "(line 155,col 5)-(line 155,col 46)",
        "(line 159,col 5)-(line 159,col 20)",
        "(line 160,col 5)-(line 160,col 20)",
        "(line 161,col 5)-(line 161,col 20)",
        "(line 162,col 5)-(line 162,col 20)",
        "(line 165,col 5)-(line 176,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 185,
      "end_line": 225,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 187,col 5)-(line 223,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 228,
      "end_line": 231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 230,col 5)-(line 230,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 238,
      "end_line": 291,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynomial\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 240,col 5)-(line 242,col 5)",
        "(line 244,col 5)-(line 244,col 27)",
        "(line 246,col 5)-(line 289,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 297,
      "end_line": 307,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 298,col 5)-(line 298,col 21)",
        "(line 299,col 5)-(line 305,col 5)",
        "(line 306,col 5)-(line 306,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 310,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 5)-(line 315,col 46)",
        "(line 317,col 5)-(line 317,col 45)",
        "(line 318,col 5)-(line 318,col 45)",
        "(line 319,col 5)-(line 319,col 55)",
        "(line 320,col 5)-(line 320,col 45)",
        "(line 321,col 5)-(line 321,col 60)",
        "(line 322,col 5)-(line 322,col 41)",
        "(line 323,col 5)-(line 323,col 61)",
        "(line 324,col 5)-(line 324,col 67)",
        "(line 326,col 5)-(line 347,col 5)",
        "(line 349,col 5)-(line 353,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 358,
      "end_line": 375,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 5)-(line 362,col 76)",
        "(line 365,col 5)-(line 365,col 27)",
        "(line 368,col 5)-(line 368,col 32)",
        "(line 369,col 5)-(line 373,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 378,
      "end_line": 400,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 5)-(line 383,col 42)",
        "(line 384,col 5)-(line 384,col 76)",
        "(line 387,col 5)-(line 387,col 36)",
        "(line 388,col 5)-(line 388,col 24)",
        "(line 389,col 5)-(line 389,col 27)",
        "(line 391,col 5)-(line 395,col 5)",
        "(line 398,col 5)-(line 398,col 27)"
      ]
    }
  ]
}