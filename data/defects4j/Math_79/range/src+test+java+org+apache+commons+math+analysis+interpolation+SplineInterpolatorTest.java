{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/analysis/interpolation/SplineInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 214,
      "comment": "\n * Test the SplineInterpolator.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "knotTolerance"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " error tolerance for spline interpolator value at knot points "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientTolerance"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " error tolerance for interpolating polynomial coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationTolerance"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " error tolerance for interpolated values -- high value is from sin test "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.SplineInterpolatorTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.suite()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 70)",
        "(line 51,col 9)-(line 51,col 58)",
        "(line 52,col 9)-(line 52,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment()",
      "begin_line": 55,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 39)",
        "(line 58,col 9)-(line 58,col 39)",
        "(line 59,col 9)-(line 59,col 64)",
        "(line 60,col 9)-(line 60,col 55)",
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 62,col 59)",
        "(line 65,col 9)-(line 65,col 91)",
        "(line 66,col 9)-(line 66,col 37)",
        "(line 67,col 9)-(line 67,col 95)",
        "(line 68,col 9)-(line 68,col 40)",
        "(line 69,col 9)-(line 69,col 95)",
        "(line 72,col 9)-(line 72,col 63)",
        "(line 73,col 9)-(line 73,col 63)",
        "(line 74,col 9)-(line 74,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment()",
      "begin_line": 77,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 44)",
        "(line 80,col 9)-(line 80,col 44)",
        "(line 81,col 9)-(line 81,col 64)",
        "(line 82,col 9)-(line 82,col 55)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 86,col 9)-(line 86,col 91)",
        "(line 87,col 9)-(line 87,col 37)",
        "(line 88,col 9)-(line 88,col 95)",
        "(line 89,col 9)-(line 89,col 40)",
        "(line 90,col 9)-(line 90,col 95)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 92,col 95)",
        "(line 95,col 9)-(line 95,col 59)",
        "(line 96,col 9)-(line 96,col 63)",
        "(line 97,col 9)-(line 97,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateLinear()",
      "begin_line": 100,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 39)",
        "(line 102,col 9)-(line 102,col 39)",
        "(line 103,col 9)-(line 103,col 64)",
        "(line 104,col 9)-(line 104,col 55)",
        "(line 105,col 9)-(line 105,col 37)",
        "(line 106,col 9)-(line 106,col 59)",
        "(line 109,col 9)-(line 109,col 91)",
        "(line 110,col 9)-(line 110,col 48)",
        "(line 111,col 9)-(line 111,col 95)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testInterpolateSin()",
      "begin_line": 116,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 127,col 32)",
        "(line 128,col 9)-(line 128,col 71)",
        "(line 129,col 9)-(line 129,col 64)",
        "(line 130,col 9)-(line 130,col 55)",
        "(line 131,col 9)-(line 131,col 37)",
        "(line 132,col 9)-(line 132,col 59)",
        "(line 143,col 9)-(line 143,col 91)",
        "(line 144,col 9)-(line 144,col 62)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 146,col 78)",
        "(line 147,col 9)-(line 147,col 95)",
        "(line 148,col 9)-(line 148,col 76)",
        "(line 149,col 9)-(line 149,col 95)",
        "(line 150,col 9)-(line 150,col 78)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 152,col 9)-(line 152,col 73)",
        "(line 153,col 9)-(line 153,col 95)",
        "(line 154,col 9)-(line 154,col 77)",
        "(line 155,col 9)-(line 155,col 95)",
        "(line 156,col 9)-(line 156,col 77)",
        "(line 157,col 9)-(line 157,col 95)",
        "(line 158,col 9)-(line 158,col 77)",
        "(line 159,col 9)-(line 159,col 95)",
        "(line 162,col 9)-(line 162,col 84)",
        "(line 163,col 9)-(line 163,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.testIllegalArguments()",
      "begin_line": 167,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 64)",
        "(line 170,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyInterpolation(org.apache.commons.math.analysis.UnivariateRealFunction, double[], double[])",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\n     * verifies that f(x[i]) \u003d y[i] for i \u003d 0..n-1 where n is common length.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolatorTest.verifyConsistency(org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction, double[])",
      "begin_line": 201,
      "end_line": 212,
      "comment": "\n     * Verifies that interpolating polynomials satisfy consistency requirement:\n     *    adjacent polynomials must agree through two derivatives at knot points\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 62)",
        "(line 204,col 9)-(line 211,col 9)"
      ]
    }
  ]
}