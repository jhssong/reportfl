{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 78,
      "end_line": 403,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "y0Dot"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Derivatives at the middle of the step.\n     * element 0 is state at midpoint, element 1 is first derivative ...\n     "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 111,
      "end_line": 117,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 112,col 20)",
        "(line 113,col 5)-(line 113,col 20)",
        "(line 114,col 5)-(line 114,col 20)",
        "(line 115,col 5)-(line 115,col 20)",
        "(line 116,col 5)-(line 116,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 131,
      "end_line": 144,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at the end of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 136,col 5)-(line 136,col 22)",
        "(line 137,col 5)-(line 137,col 26)",
        "(line 138,col 5)-(line 138,col 23)",
        "(line 139,col 5)-(line 139,col 26)",
        "(line 140,col 5)-(line 140,col 29)",
        "(line 142,col 5)-(line 142,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator)",
      "begin_line": 151,
      "end_line": 179,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 154,col 5)-(line 154,col 24)",
        "(line 156,col 5)-(line 156,col 46)",
        "(line 160,col 5)-(line 160,col 20)",
        "(line 161,col 5)-(line 161,col 20)",
        "(line 162,col 5)-(line 162,col 20)",
        "(line 163,col 5)-(line 163,col 20)",
        "(line 166,col 5)-(line 177,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 186,
      "end_line": 226,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 188,col 5)-(line 224,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 229,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 5)-(line 231,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 239,
      "end_line": 292,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynomial\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 241,col 5)-(line 243,col 5)",
        "(line 245,col 5)-(line 245,col 27)",
        "(line 247,col 5)-(line 290,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 298,
      "end_line": 308,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 299,col 5)-(line 299,col 21)",
        "(line 300,col 5)-(line 306,col 5)",
        "(line 307,col 5)-(line 307,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 311,
      "end_line": 356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 316,col 5)-(line 316,col 46)",
        "(line 318,col 5)-(line 318,col 45)",
        "(line 319,col 5)-(line 319,col 45)",
        "(line 320,col 5)-(line 320,col 55)",
        "(line 321,col 5)-(line 321,col 45)",
        "(line 322,col 5)-(line 322,col 60)",
        "(line 323,col 5)-(line 323,col 41)",
        "(line 324,col 5)-(line 324,col 61)",
        "(line 325,col 5)-(line 325,col 67)",
        "(line 327,col 5)-(line 348,col 5)",
        "(line 350,col 5)-(line 354,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 359,
      "end_line": 376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 5)-(line 363,col 76)",
        "(line 366,col 5)-(line 366,col 27)",
        "(line 369,col 5)-(line 369,col 32)",
        "(line 370,col 5)-(line 374,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 379,
      "end_line": 401,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 5)-(line 384,col 42)",
        "(line 385,col 5)-(line 385,col 76)",
        "(line 388,col 5)-(line 388,col 36)",
        "(line 389,col 5)-(line 389,col 24)",
        "(line 390,col 5)-(line 390,col 27)",
        "(line 392,col 5)-(line 396,col 5)",
        "(line 399,col 5)-(line 399,col 27)"
      ]
    }
  ]
}