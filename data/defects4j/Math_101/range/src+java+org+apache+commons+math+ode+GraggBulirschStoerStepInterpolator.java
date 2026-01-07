{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/ode/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 74,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y0Dot"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Derivatives at the middle of the step.\n   * element 0 is state at midpoint, element 1 is first derivative ...\n   "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 105,
      "end_line": 145,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 107,col 5)-(line 143,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 151,
      "end_line": 157,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 152,col 5)-(line 152,col 20)",
        "(line 153,col 5)-(line 153,col 20)",
        "(line 154,col 5)-(line 154,col 20)",
        "(line 155,col 5)-(line 155,col 20)",
        "(line 156,col 5)-(line 156,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 171,
      "end_line": 184,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at theend of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 176,col 5)-(line 176,col 22)",
        "(line 177,col 5)-(line 177,col 26)",
        "(line 178,col 5)-(line 178,col 23)",
        "(line 179,col 5)-(line 179,col 26)",
        "(line 180,col 5)-(line 180,col 29)",
        "(line 182,col 5)-(line 182,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator)",
      "begin_line": 191,
      "end_line": 219,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 194,col 5)-(line 194,col 24)",
        "(line 196,col 5)-(line 196,col 40)",
        "(line 200,col 5)-(line 200,col 20)",
        "(line 201,col 5)-(line 201,col 20)",
        "(line 202,col 5)-(line 202,col 20)",
        "(line 203,col 5)-(line 203,col 20)",
        "(line 206,col 5)-(line 217,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " Really copy the finalized instance.\n   * @return a copy of the finalized instance\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 233,
      "end_line": 286,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynom\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 237,col 5)",
        "(line 239,col 5)-(line 239,col 27)",
        "(line 241,col 5)-(line 284,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 292,
      "end_line": 302,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 293,col 5)-(line 293,col 21)",
        "(line 294,col 5)-(line 300,col 5)",
        "(line 301,col 5)-(line 301,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 314,
      "end_line": 340,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 318,col 5)-(line 318,col 40)",
        "(line 320,col 5)-(line 320,col 39)",
        "(line 321,col 5)-(line 321,col 39)",
        "(line 322,col 5)-(line 322,col 49)",
        "(line 323,col 5)-(line 323,col 17)",
        "(line 325,col 5)-(line 338,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 346,
      "end_line": 362,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 349,col 5)-(line 349,col 40)",
        "(line 352,col 5)-(line 352,col 27)",
        "(line 355,col 5)-(line 355,col 32)",
        "(line 356,col 5)-(line 360,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 368,
      "end_line": 393,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 372,col 5)-(line 372,col 36)",
        "(line 373,col 5)-(line 373,col 40)",
        "(line 376,col 5)-(line 376,col 30)",
        "(line 377,col 5)-(line 377,col 24)",
        "(line 378,col 5)-(line 378,col 27)",
        "(line 380,col 5)-(line 384,col 5)",
        "(line 386,col 5)-(line 391,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": " Serializable version identifier "
    }
  ]
}