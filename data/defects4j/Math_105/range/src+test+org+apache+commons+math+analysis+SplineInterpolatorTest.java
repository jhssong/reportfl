{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/analysis/SplineInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 212,
      "comment": "\n * Test the SplineInterpolator.\n *\n * @version $Revision$ $Date$ \n "
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
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.SplineInterpolatorTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.suite()",
      "begin_line": 47,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 70)",
        "(line 49,col 9)-(line 49,col 58)",
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment()",
      "begin_line": 53,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 39)",
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 57,col 64)",
        "(line 58,col 9)-(line 58,col 55)",
        "(line 59,col 9)-(line 59,col 37)",
        "(line 60,col 9)-(line 60,col 59)",
        "(line 63,col 9)-(line 63,col 91)",
        "(line 64,col 9)-(line 64,col 45)",
        "(line 65,col 9)-(line 65,col 95)",
        "(line 66,col 9)-(line 66,col 48)",
        "(line 67,col 9)-(line 67,col 95)",
        "(line 70,col 9)-(line 70,col 63)",
        "(line 71,col 9)-(line 71,col 63)",
        "(line 72,col 9)-(line 72,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment()",
      "begin_line": 75,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 44)",
        "(line 79,col 9)-(line 79,col 64)",
        "(line 80,col 9)-(line 80,col 55)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 84,col 9)-(line 84,col 91)",
        "(line 85,col 9)-(line 85,col 45)",
        "(line 86,col 9)-(line 86,col 95)",
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 88,col 95)",
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 95)",
        "(line 93,col 9)-(line 93,col 59)",
        "(line 94,col 9)-(line 94,col 63)",
        "(line 95,col 9)-(line 95,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinear()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 64)",
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 37)",
        "(line 104,col 9)-(line 104,col 59)",
        "(line 107,col 9)-(line 107,col 91)",
        "(line 108,col 9)-(line 108,col 48)",
        "(line 109,col 9)-(line 109,col 95)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateSin()",
      "begin_line": 114,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 125,col 32)",
        "(line 126,col 9)-(line 126,col 71)",
        "(line 127,col 9)-(line 127,col 64)",
        "(line 128,col 9)-(line 128,col 55)",
        "(line 129,col 9)-(line 129,col 37)",
        "(line 130,col 9)-(line 130,col 59)",
        "(line 141,col 9)-(line 141,col 91)",
        "(line 142,col 9)-(line 142,col 62)",
        "(line 143,col 9)-(line 143,col 95)",
        "(line 144,col 9)-(line 144,col 78)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 146,col 76)",
        "(line 147,col 9)-(line 147,col 95)",
        "(line 148,col 9)-(line 148,col 78)",
        "(line 149,col 9)-(line 149,col 95)",
        "(line 150,col 9)-(line 150,col 73)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 152,col 9)-(line 152,col 77)",
        "(line 153,col 9)-(line 153,col 95)",
        "(line 154,col 9)-(line 154,col 77)",
        "(line 155,col 9)-(line 155,col 95)",
        "(line 156,col 9)-(line 156,col 77)",
        "(line 157,col 9)-(line 157,col 95)",
        "(line 160,col 9)-(line 160,col 84)",
        "(line 161,col 9)-(line 161,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testIllegalArguments()",
      "begin_line": 165,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 64)",
        "(line 168,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.verifyInterpolation(org.apache.commons.math.analysis.UnivariateRealFunction, double[], double[])",
      "begin_line": 188,
      "end_line": 193,
      "comment": "\n     * verifies that f(x[i]) \u003d y[i] for i \u003d 0..n-1 where n is common length.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.verifyConsistency(org.apache.commons.math.analysis.PolynomialSplineFunction, double[])",
      "begin_line": 199,
      "end_line": 210,
      "comment": "\n     * Verifies that interpolating polynomials satisfy consistency requirement:\n     *    adjacent polynomials must agree through two derivatives at knot points\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 62)",
        "(line 202,col 9)-(line 209,col 9)"
      ]
    }
  ]
}