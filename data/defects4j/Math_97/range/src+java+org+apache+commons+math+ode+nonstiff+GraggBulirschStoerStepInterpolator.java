{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 78,
      "end_line": 385,
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
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 5)-(line 227,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 235,
      "end_line": 288,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynom\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 237,col 5)-(line 239,col 5)",
        "(line 241,col 5)-(line 241,col 27)",
        "(line 243,col 5)-(line 286,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 294,
      "end_line": 304,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 295,col 5)-(line 295,col 21)",
        "(line 296,col 5)-(line 302,col 5)",
        "(line 303,col 5)-(line 303,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 307,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 5)-(line 311,col 46)",
        "(line 313,col 5)-(line 313,col 45)",
        "(line 314,col 5)-(line 314,col 45)",
        "(line 315,col 5)-(line 315,col 55)",
        "(line 316,col 5)-(line 316,col 17)",
        "(line 318,col 5)-(line 331,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 336,
      "end_line": 352,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 5)-(line 339,col 46)",
        "(line 342,col 5)-(line 342,col 27)",
        "(line 345,col 5)-(line 345,col 32)",
        "(line 346,col 5)-(line 350,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 355,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 359,col 5)-(line 359,col 42)",
        "(line 360,col 5)-(line 360,col 46)",
        "(line 363,col 5)-(line 363,col 36)",
        "(line 364,col 5)-(line 364,col 24)",
        "(line 365,col 5)-(line 365,col 27)",
        "(line 367,col 5)-(line 371,col 5)",
        "(line 373,col 5)-(line 378,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 383,
      "end_line": 383,
      "comment": " Serializable version identifier "
    }
  ]
}