{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/ode/nonstiff/GraggBulirschStoerStepInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GraggBulirschStoerStepInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator"
      ],
      "begin_line": 78,
      "end_line": 406,
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
        "polynomials"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Interpolation polynomials. "
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
      "comment": " Degree of the interpolation polynomials. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator()",
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
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(double[], double[], double[], double[], double[][], boolean, org.apache.commons.math3.ode.EquationsMapper, org.apache.commons.math3.ode.EquationsMapper[])",
      "begin_line": 133,
      "end_line": 148,
      "comment": " Simple constructor.\n   * @param y reference to the integrator array holding the current state\n   * @param y0Dot reference to the integrator array holding the slope\n   * at the beginning of the step\n   * @param y1 reference to the integrator array holding the state at\n   * the end of the step\n   * @param y1Dot reference to the integrator array holding the slope\n   * at the end of the step\n   * @param yMidDots reference to the integrator array holding the\n   * derivatives at the middle point of the step\n   * @param forward integration direction indicator\n   * @param primaryMapper equations mapper for the primary equations set\n   * @param secondaryMappers equations mappers for the secondary equations sets\n   ",
      "child_ranges": [
        "(line 140,col 5)-(line 140,col 55)",
        "(line 141,col 5)-(line 141,col 26)",
        "(line 142,col 5)-(line 142,col 23)",
        "(line 143,col 5)-(line 143,col 26)",
        "(line 144,col 5)-(line 144,col 29)",
        "(line 146,col 5)-(line 146,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.GraggBulirschStoerStepInterpolator(org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator)",
      "begin_line": 155,
      "end_line": 183,
      "comment": " Copy constructor.\n   * @param interpolator interpolator to copy from. The copy is a deep\n   * copy: its arrays are separated from the original arrays of the\n   * instance\n   ",
      "child_ranges": [
        "(line 158,col 5)-(line 158,col 24)",
        "(line 160,col 5)-(line 160,col 46)",
        "(line 164,col 5)-(line 164,col 20)",
        "(line 165,col 5)-(line 165,col 20)",
        "(line 166,col 5)-(line 166,col 20)",
        "(line 167,col 5)-(line 167,col 20)",
        "(line 170,col 5)-(line 181,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.resetTables(int)",
      "begin_line": 190,
      "end_line": 230,
      "comment": " Reallocate the internal tables.\n   * Reallocate the internal tables in order to be able to handle\n   * interpolation polynomials up to the given degree\n   * @param maxDegree maximal degree to handle\n   ",
      "child_ranges": [
        "(line 192,col 5)-(line 228,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.doCopy()",
      "begin_line": 233,
      "end_line": 236,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 235,col 5)-(line 235,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeCoefficients(int, double)",
      "begin_line": 243,
      "end_line": 296,
      "comment": " Compute the interpolation coefficients for dense output.\n   * @param mu degree of the interpolation polynomial\n   * @param h current step\n   ",
      "child_ranges": [
        "(line 245,col 5)-(line 247,col 5)",
        "(line 249,col 5)-(line 249,col 27)",
        "(line 251,col 5)-(line 294,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.estimateError(double[])",
      "begin_line": 302,
      "end_line": 312,
      "comment": " Estimate interpolation error.\n   * @param scale scaling array\n   * @return estimate of the interpolation error\n   ",
      "child_ranges": [
        "(line 303,col 5)-(line 303,col 21)",
        "(line 304,col 5)-(line 310,col 5)",
        "(line 311,col 5)-(line 311,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.computeInterpolatedStateAndDerivatives(double, double)",
      "begin_line": 315,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 319,col 5)-(line 319,col 46)",
        "(line 321,col 5)-(line 321,col 45)",
        "(line 322,col 5)-(line 322,col 45)",
        "(line 323,col 5)-(line 323,col 55)",
        "(line 324,col 5)-(line 324,col 45)",
        "(line 325,col 5)-(line 325,col 60)",
        "(line 326,col 5)-(line 326,col 41)",
        "(line 327,col 5)-(line 327,col 61)",
        "(line 328,col 5)-(line 328,col 67)",
        "(line 330,col 5)-(line 351,col 5)",
        "(line 353,col 5)-(line 357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.writeExternal(java.io.ObjectOutput)",
      "begin_line": 362,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 5)-(line 366,col 76)",
        "(line 369,col 5)-(line 369,col 27)",
        "(line 372,col 5)-(line 372,col 32)",
        "(line 373,col 5)-(line 377,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator.readExternal(java.io.ObjectInput)",
      "begin_line": 382,
      "end_line": 404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 5)-(line 387,col 42)",
        "(line 388,col 5)-(line 388,col 76)",
        "(line 391,col 5)-(line 391,col 36)",
        "(line 392,col 5)-(line 392,col 24)",
        "(line 393,col 5)-(line 393,col 27)",
        "(line 395,col 5)-(line 399,col 5)",
        "(line 402,col 5)-(line 402,col 27)"
      ]
    }
  ]
}