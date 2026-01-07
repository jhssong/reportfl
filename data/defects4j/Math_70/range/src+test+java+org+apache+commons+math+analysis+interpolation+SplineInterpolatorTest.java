{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/analysis/interpolation/SplineInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 206,
      "comment": "\n * Test the SplineInterpolator.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "knotTolerance"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " error tolerance for spline interpolator value at knot points "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientTolerance"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " error tolerance for interpolating polynomial coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationTolerance"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " error tolerance for interpolated values -- high value is from sin test "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.SplineInterpolatorTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment()",
      "begin_line": 47,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 39)",
        "(line 50,col 9)-(line 50,col 39)",
        "(line 51,col 9)-(line 51,col 64)",
        "(line 52,col 9)-(line 52,col 55)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 54,col 9)-(line 54,col 59)",
        "(line 57,col 9)-(line 57,col 91)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 95)",
        "(line 60,col 9)-(line 60,col 40)",
        "(line 61,col 9)-(line 61,col 95)",
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment()",
      "begin_line": 69,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 44)",
        "(line 72,col 9)-(line 72,col 44)",
        "(line 73,col 9)-(line 73,col 64)",
        "(line 74,col 9)-(line 74,col 55)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 78,col 9)-(line 78,col 91)",
        "(line 79,col 9)-(line 79,col 37)",
        "(line 80,col 9)-(line 80,col 95)",
        "(line 81,col 9)-(line 81,col 40)",
        "(line 82,col 9)-(line 82,col 95)",
        "(line 83,col 9)-(line 83,col 40)",
        "(line 84,col 9)-(line 84,col 95)",
        "(line 87,col 9)-(line 87,col 59)",
        "(line 88,col 9)-(line 88,col 63)",
        "(line 89,col 9)-(line 89,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinear()",
      "begin_line": 92,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 39)",
        "(line 95,col 9)-(line 95,col 64)",
        "(line 96,col 9)-(line 96,col 55)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 98,col 59)",
        "(line 101,col 9)-(line 101,col 91)",
        "(line 102,col 9)-(line 102,col 48)",
        "(line 103,col 9)-(line 103,col 95)",
        "(line 104,col 9)-(line 104,col 49)",
        "(line 105,col 9)-(line 105,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateSin()",
      "begin_line": 108,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 119,col 32)",
        "(line 120,col 9)-(line 120,col 71)",
        "(line 121,col 9)-(line 121,col 64)",
        "(line 122,col 9)-(line 122,col 55)",
        "(line 123,col 9)-(line 123,col 37)",
        "(line 124,col 9)-(line 124,col 59)",
        "(line 135,col 9)-(line 135,col 91)",
        "(line 136,col 9)-(line 136,col 62)",
        "(line 137,col 9)-(line 137,col 95)",
        "(line 138,col 9)-(line 138,col 78)",
        "(line 139,col 9)-(line 139,col 95)",
        "(line 140,col 9)-(line 140,col 76)",
        "(line 141,col 9)-(line 141,col 95)",
        "(line 142,col 9)-(line 142,col 78)",
        "(line 143,col 9)-(line 143,col 95)",
        "(line 144,col 9)-(line 144,col 73)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 146,col 77)",
        "(line 147,col 9)-(line 147,col 95)",
        "(line 148,col 9)-(line 148,col 77)",
        "(line 149,col 9)-(line 149,col 95)",
        "(line 150,col 9)-(line 150,col 77)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 154,col 9)-(line 154,col 84)",
        "(line 155,col 9)-(line 155,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testIllegalArguments()",
      "begin_line": 159,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 64)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyInterpolation(org.apache.commons.math.analysis.UnivariateRealFunction, double[], double[])",
      "begin_line": 182,
      "end_line": 187,
      "comment": "\n     * verifies that f(x[i]) \u003d y[i] for i \u003d 0..n-1 where n is common length.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyConsistency(org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction, double[])",
      "begin_line": 193,
      "end_line": 204,
      "comment": "\n     * Verifies that interpolating polynomials satisfy consistency requirement:\n     *    adjacent polynomials must agree through two derivatives at knot points\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 62)",
        "(line 196,col 9)-(line 203,col 9)"
      ]
    }
  ]
}