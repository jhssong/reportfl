{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/analysis/interpolation/SplineInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolatorTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 221,
      "comment": "\n * Test the SplineInterpolator.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "knotTolerance"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " error tolerance for spline interpolator value at knot points "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientTolerance"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " error tolerance for interpolating polynomial coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationTolerance"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " error tolerance for interpolated values -- high value is from sin test "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment()",
      "begin_line": 47,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 51,col 39)",
        "(line 52,col 9)-(line 52,col 64)",
        "(line 53,col 9)-(line 53,col 55)",
        "(line 54,col 9)-(line 54,col 37)",
        "(line 55,col 9)-(line 55,col 59)",
        "(line 58,col 9)-(line 58,col 91)",
        "(line 59,col 9)-(line 59,col 37)",
        "(line 60,col 9)-(line 60,col 95)",
        "(line 61,col 9)-(line 61,col 40)",
        "(line 62,col 9)-(line 62,col 95)",
        "(line 65,col 9)-(line 65,col 70)",
        "(line 66,col 9)-(line 66,col 70)",
        "(line 67,col 9)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment()",
      "begin_line": 70,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 44)",
        "(line 74,col 9)-(line 74,col 44)",
        "(line 75,col 9)-(line 75,col 64)",
        "(line 76,col 9)-(line 76,col 55)",
        "(line 77,col 9)-(line 77,col 37)",
        "(line 80,col 9)-(line 80,col 91)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 95)",
        "(line 83,col 9)-(line 83,col 40)",
        "(line 84,col 9)-(line 84,col 95)",
        "(line 85,col 9)-(line 85,col 40)",
        "(line 86,col 9)-(line 86,col 95)",
        "(line 89,col 9)-(line 89,col 66)",
        "(line 90,col 9)-(line 90,col 70)",
        "(line 91,col 9)-(line 91,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinear()",
      "begin_line": 94,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 39)",
        "(line 98,col 9)-(line 98,col 64)",
        "(line 99,col 9)-(line 99,col 55)",
        "(line 100,col 9)-(line 100,col 37)",
        "(line 101,col 9)-(line 101,col 59)",
        "(line 104,col 9)-(line 104,col 91)",
        "(line 105,col 9)-(line 105,col 48)",
        "(line 106,col 9)-(line 106,col 95)",
        "(line 107,col 9)-(line 107,col 49)",
        "(line 108,col 9)-(line 108,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateSin()",
      "begin_line": 111,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 124,col 71)",
        "(line 125,col 9)-(line 125,col 64)",
        "(line 126,col 9)-(line 126,col 55)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 59)",
        "(line 139,col 9)-(line 139,col 91)",
        "(line 140,col 9)-(line 140,col 62)",
        "(line 141,col 9)-(line 141,col 95)",
        "(line 142,col 9)-(line 142,col 78)",
        "(line 143,col 9)-(line 143,col 95)",
        "(line 144,col 9)-(line 144,col 76)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 146,col 78)",
        "(line 147,col 9)-(line 147,col 95)",
        "(line 148,col 9)-(line 148,col 73)",
        "(line 149,col 9)-(line 149,col 95)",
        "(line 150,col 9)-(line 150,col 77)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 152,col 9)-(line 152,col 77)",
        "(line 153,col 9)-(line 153,col 95)",
        "(line 154,col 9)-(line 154,col 77)",
        "(line 155,col 9)-(line 155,col 95)",
        "(line 158,col 9)-(line 158,col 99)",
        "(line 159,col 9)-(line 159,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testIllegalArguments()",
      "begin_line": 162,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 64)",
        "(line 166,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyInterpolation(org.apache.commons.math.analysis.UnivariateRealFunction, double[], double[])",
      "begin_line": 197,
      "end_line": 202,
      "comment": "\n     * verifies that f(x[i]) \u003d y[i] for i \u003d 0..n-1 where n is common length.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyConsistency(org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction, double[])",
      "begin_line": 208,
      "end_line": 219,
      "comment": "\n     * Verifies that interpolating polynomials satisfy consistency requirement:\n     *    adjacent polynomials must agree through two derivatives at knot points\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 62)",
        "(line 211,col 9)-(line 218,col 9)"
      ]
    }
  ]
}