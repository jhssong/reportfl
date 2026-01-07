{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 79,
      "end_line": 404,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y0Dot"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Derivatives at the middle of the step.\n   * element 0 is state at midpoint, element 1 is first derivative ...\n   "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 110,
      "end_line": 150,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 112,col 5)-(line 148,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 156,
      "end_line": 162,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 157,col 5)-(line 157,col 20)",
        "(line 158,col 5)-(line 158,col 20)",
        "(line 159,col 5)-(line 159,col 20)",
        "(line 160,col 5)-(line 160,col 20)",
        "(line 161,col 5)-(line 161,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 176,
      "end_line": 189,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at theend of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 22)",
        "(line 182,col 5)-(line 182,col 26)",
        "(line 183,col 5)-(line 183,col 23)",
        "(line 184,col 5)-(line 184,col 26)",
        "(line 185,col 5)-(line 185,col 29)",
        "(line 187,col 5)-(line 187,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator)",
      "begin_line": 196,
      "end_line": 224,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 199,col 5)-(line 199,col 24)",
        "(line 201,col 5)-(line 201,col 46)",
        "(line 205,col 5)-(line 205,col 20)",
        "(line 206,col 5)-(line 206,col 20)",
        "(line 207,col 5)-(line 207,col 20)",
        "(line 208,col 5)-(line 208,col 20)",
        "(line 211,col 5)-(line 222,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 227,
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
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 308,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 5)-(line 312,col 46)",
        "(line 314,col 5)-(line 314,col 45)",
        "(line 315,col 5)-(line 315,col 45)",
        "(line 316,col 5)-(line 316,col 55)",
        "(line 317,col 5)-(line 317,col 45)",
        "(line 318,col 5)-(line 318,col 60)",
        "(line 319,col 5)-(line 319,col 41)",
        "(line 320,col 5)-(line 320,col 61)",
        "(line 321,col 5)-(line 321,col 67)",
        "(line 323,col 5)-(line 344,col 5)",
        "(line 346,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 355,
      "end_line": 371,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 358,col 5)-(line 358,col 46)",
        "(line 361,col 5)-(line 361,col 27)",
        "(line 364,col 5)-(line 364,col 32)",
        "(line 365,col 5)-(line 369,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 374,
      "end_line": 399,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 378,col 5)-(line 378,col 42)",
        "(line 379,col 5)-(line 379,col 46)",
        "(line 382,col 5)-(line 382,col 36)",
        "(line 383,col 5)-(line 383,col 24)",
        "(line 384,col 5)-(line 384,col 27)",
        "(line 386,col 5)-(line 390,col 5)",
        "(line 392,col 5)-(line 397,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": " Serializable version identifier "
    }
  ]
}