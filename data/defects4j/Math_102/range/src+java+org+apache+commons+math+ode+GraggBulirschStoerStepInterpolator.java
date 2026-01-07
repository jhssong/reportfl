{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/ode/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.AbstractStepInterpolator"
      ],
      "begin_line": 75,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y0Dot"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Slope at the beginning of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " State at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "y1Dot"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Slope at the end of the step. "
    },
    {
      "type": "field",
      "varNames": [
        "yMidDots"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Derivatives at the middle of the step.\n   * element 0 is state at midpoint, element 1 is first derivative ...\n   "
    },
    {
      "type": "field",
      "varNames": [
        "polynoms"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Interpolation polynoms. "
    },
    {
      "type": "field",
      "varNames": [
        "errfac"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Error coefficients for the interpolation. "
    },
    {
      "type": "field",
      "varNames": [
        "currentDegree"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Degree of the interpolation polynoms. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 106,
      "end_line": 146,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynoms up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 108,col 5)-(line 144,col 5)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
      "begin_line": 152,
      "end_line": 158,
      "comment": " Simple constructor.\n   * This constructor should not be used directly, it is only intended\n   * for the serialization process.\n   ",
      "child_ranges": [
        "(line 153,col 5)-(line 153,col 20)",
        "(line 154,col 5)-(line 154,col 20)",
        "(line 155,col 5)-(line 155,col 20)",
        "(line 156,col 5)-(line 156,col 20)",
        "(line 157,col 5)-(line 157,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean)",
      "begin_line": 172,
      "end_line": 185,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at theend of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   ",
      "child_ranges": [
        "(line 177,col 5)-(line 177,col 22)",
        "(line 178,col 5)-(line 178,col 26)",
        "(line 179,col 5)-(line 179,col 23)",
        "(line 180,col 5)-(line 180,col 26)",
        "(line 181,col 5)-(line 181,col 29)",
        "(line 183,col 5)-(line 183,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator)",
      "begin_line": 192,
      "end_line": 220,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 24)",
        "(line 197,col 5)-(line 197,col 40)",
        "(line 201,col 5)-(line 201,col 20)",
        "(line 202,col 5)-(line 202,col 20)",
        "(line 203,col 5)-(line 203,col 20)",
        "(line 204,col 5)-(line 204,col 20)",
        "(line 207,col 5)-(line 218,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " Really copy the finalized instance.\n   ",
      "child_ranges": [
        "(line 225,col 5)-(line 225,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 233,
      "end_line": 287,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynom\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 235,col 5)-(line 237,col 5)",
        "(line 239,col 5)-(line 239,col 27)",
        "(line 241,col 5)-(line 285,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 293,
      "end_line": 303,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 294,col 5)-(line 294,col 21)",
        "(line 295,col 5)-(line 301,col 5)",
        "(line 302,col 5)-(line 302,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.computeInterpolatedState(double, double)",
      "begin_line": 315,
      "end_line": 341,
      "comment": " Compute the state at the interpolated time.\n   * This is the main processing method that should be implemented by\n   * the derived classes to perform the interpolation.\n   * @param theta normalized interpolation abscissa within the step\n   * (theta is zero at the previous time step and one at the current time step)\n   * @param oneMinusThetaH time gap between the interpolated time and\n   * the current time\n   * @throws DerivativeException this exception is propagated to the caller if the\n   * underlying user function triggers one\n   ",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 40)",
        "(line 321,col 5)-(line 321,col 39)",
        "(line 322,col 5)-(line 322,col 39)",
        "(line 323,col 5)-(line 323,col 49)",
        "(line 324,col 5)-(line 324,col 17)",
        "(line 326,col 5)-(line 339,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 347,
      "end_line": 363,
      "comment": " Save the state of the instance.\n   * @param out stream where to save the state\n   * @exception IOException in case of write error\n   ",
      "child_ranges": [
        "(line 350,col 5)-(line 350,col 40)",
        "(line 353,col 5)-(line 353,col 27)",
        "(line 356,col 5)-(line 356,col 32)",
        "(line 357,col 5)-(line 361,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 369,
      "end_line": 394,
      "comment": " Read the state of the instance.\n   * @param in stream where to read the state from\n   * @exception IOException in case of read error\n   ",
      "child_ranges": [
        "(line 373,col 5)-(line 373,col 36)",
        "(line 374,col 5)-(line 374,col 40)",
        "(line 377,col 5)-(line 377,col 30)",
        "(line 378,col 5)-(line 378,col 24)",
        "(line 379,col 5)-(line 379,col 27)",
        "(line 381,col 5)-(line 385,col 5)",
        "(line 387,col 5)-(line 392,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    }
  ]
}