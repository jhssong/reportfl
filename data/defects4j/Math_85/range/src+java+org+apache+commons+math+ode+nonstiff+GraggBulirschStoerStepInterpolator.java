{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
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
        "y0Dot"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Derivatives at the middle of the step.\n   * element 0 is state at midpoint, element 1 is first derivative ...\n   "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 109,
      "end_line": 149,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 147,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 155,
      "end_line": 161,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 156,col 5)-(line 156,col 20)",
        "(line 157,col 5)-(line 157,col 20)",
        "(line 158,col 5)-(line 158,col 20)",
        "(line 159,col 5)-(line 159,col 20)",
        "(line 160,col 5)-(line 160,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 175,
      "end_line": 188,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at theend of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 180,col 5)-(line 180,col 22)",
        "(line 181,col 5)-(line 181,col 26)",
        "(line 182,col 5)-(line 182,col 23)",
        "(line 183,col 5)-(line 183,col 26)",
        "(line 184,col 5)-(line 184,col 29)",
        "(line 186,col 5)-(line 186,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator)",
      "begin_line": 195,
      "end_line": 223,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 198,col 5)-(line 198,col 24)",
        "(line 200,col 5)-(line 200,col 46)",
        "(line 204,col 5)-(line 204,col 20)",
        "(line 205,col 5)-(line 205,col 20)",
        "(line 206,col 5)-(line 206,col 20)",
        "(line 207,col 5)-(line 207,col 20)",
        "(line 210,col 5)-(line 221,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 226,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 5)-(line 228,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 236,
      "end_line": 289,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynomial\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 238,col 5)-(line 240,col 5)",
        "(line 242,col 5)-(line 242,col 27)",
        "(line 244,col 5)-(line 287,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 295,
      "end_line": 305,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 296,col 5)-(line 296,col 21)",
        "(line 297,col 5)-(line 303,col 5)",
        "(line 304,col 5)-(line 304,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 308,
      "end_line": 353,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 313,col 5)-(line 313,col 46)",
        "(line 315,col 5)-(line 315,col 45)",
        "(line 316,col 5)-(line 316,col 45)",
        "(line 317,col 5)-(line 317,col 55)",
        "(line 318,col 5)-(line 318,col 45)",
        "(line 319,col 5)-(line 319,col 60)",
        "(line 320,col 5)-(line 320,col 41)",
        "(line 321,col 5)-(line 321,col 61)",
        "(line 322,col 5)-(line 322,col 67)",
        "(line 324,col 5)-(line 345,col 5)",
        "(line 347,col 5)-(line 351,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 356,
      "end_line": 373,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 360,col 5)-(line 360,col 76)",
        "(line 363,col 5)-(line 363,col 27)",
        "(line 366,col 5)-(line 366,col 32)",
        "(line 367,col 5)-(line 371,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 376,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 381,col 5)-(line 381,col 42)",
        "(line 382,col 5)-(line 382,col 76)",
        "(line 385,col 5)-(line 385,col 36)",
        "(line 386,col 5)-(line 386,col 24)",
        "(line 387,col 5)-(line 387,col 27)",
        "(line 389,col 5)-(line 393,col 5)",
        "(line 396,col 5)-(line 396,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " Serializable version identifier "
    }
  ]
}