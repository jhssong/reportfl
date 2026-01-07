{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/analysis/SplineInterpolatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 211,
      "comment": "\n * Test the SplineInterpolator.\n *\n * @version $Revision$ $Date$ \n "
    },
    {
      "type": "field",
      "varNames": [
        "knotTolerance"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " error tolerance for spline interpolator value at knot points "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientTolerance"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " error tolerance for interpolating polynomial coefficients "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationTolerance"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " error tolerance for interpolated values -- high value is from sin test "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.SplineInterpolatorTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.suite()",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 70)",
        "(line 48,col 9)-(line 48,col 58)",
        "(line 49,col 9)-(line 49,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinearDegenerateTwoSegment()",
      "begin_line": 52,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 39)",
        "(line 55,col 9)-(line 55,col 39)",
        "(line 56,col 9)-(line 56,col 64)",
        "(line 57,col 9)-(line 57,col 55)",
        "(line 58,col 9)-(line 58,col 37)",
        "(line 59,col 9)-(line 59,col 59)",
        "(line 62,col 9)-(line 62,col 91)",
        "(line 63,col 9)-(line 63,col 45)",
        "(line 64,col 9)-(line 64,col 95)",
        "(line 65,col 9)-(line 65,col 48)",
        "(line 66,col 9)-(line 66,col 95)",
        "(line 69,col 9)-(line 69,col 63)",
        "(line 70,col 9)-(line 70,col 63)",
        "(line 71,col 9)-(line 71,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinearDegenerateThreeSegment()",
      "begin_line": 74,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 44)",
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 64)",
        "(line 79,col 9)-(line 79,col 55)",
        "(line 80,col 9)-(line 80,col 37)",
        "(line 83,col 9)-(line 83,col 91)",
        "(line 84,col 9)-(line 84,col 45)",
        "(line 85,col 9)-(line 85,col 95)",
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 95)",
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 89,col 95)",
        "(line 92,col 9)-(line 92,col 59)",
        "(line 93,col 9)-(line 93,col 63)",
        "(line 94,col 9)-(line 94,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateLinear()",
      "begin_line": 97,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 64)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 102,col 37)",
        "(line 103,col 9)-(line 103,col 59)",
        "(line 106,col 9)-(line 106,col 91)",
        "(line 107,col 9)-(line 107,col 48)",
        "(line 108,col 9)-(line 108,col 95)",
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testInterpolateSin()",
      "begin_line": 113,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 124,col 32)",
        "(line 125,col 9)-(line 125,col 71)",
        "(line 126,col 9)-(line 126,col 64)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 37)",
        "(line 129,col 9)-(line 129,col 59)",
        "(line 140,col 9)-(line 140,col 91)",
        "(line 141,col 9)-(line 141,col 62)",
        "(line 142,col 9)-(line 142,col 95)",
        "(line 143,col 9)-(line 143,col 78)",
        "(line 144,col 9)-(line 144,col 95)",
        "(line 145,col 9)-(line 145,col 76)",
        "(line 146,col 9)-(line 146,col 95)",
        "(line 147,col 9)-(line 147,col 78)",
        "(line 148,col 9)-(line 148,col 95)",
        "(line 149,col 9)-(line 149,col 73)",
        "(line 150,col 9)-(line 150,col 95)",
        "(line 151,col 9)-(line 151,col 77)",
        "(line 152,col 9)-(line 152,col 95)",
        "(line 153,col 9)-(line 153,col 77)",
        "(line 154,col 9)-(line 154,col 95)",
        "(line 155,col 9)-(line 155,col 77)",
        "(line 156,col 9)-(line 156,col 95)",
        "(line 159,col 9)-(line 159,col 84)",
        "(line 160,col 9)-(line 160,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.testIllegalArguments()",
      "begin_line": 164,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 64)",
        "(line 167,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.verifyInterpolation(org.apache.commons.math.analysis.UnivariateRealFunction, double[], double[])",
      "begin_line": 187,
      "end_line": 192,
      "comment": "\n     * verifies that f(x[i]) \u003d y[i] for i \u003d 0..n-1 where n is common length.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SplineInterpolatorTest.verifyConsistency(org.apache.commons.math.analysis.PolynomialSplineFunction, double[])",
      "begin_line": 198,
      "end_line": 209,
      "comment": "\n     * Verifies that interpolating polynomials satisfy consistency requirement:\n     *    adjacent polynomials must agree through two derivatives at knot points\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 208,col 9)"
      ]
    }
  ]
}