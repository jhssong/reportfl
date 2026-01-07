{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/analysis/PolynomialSplineFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 149,
      "comment": "\n * Tests the PolynomialSplineFunction implementation.\n *\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Error tolerance for tests "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 44,
      "end_line": 48,
      "comment": " \n     * Quadratic polynomials used in tests: \n     * \n     * x^2 + x            [-1, 0)\n     * x^2 + x + 2        [0, 1)\n     * x^2 + x + 4        [1, 2)\n     * \n     * Defined so that evaluation using PolynomialSplineFunction evaluation\n     * algorithm agrees at knot point boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Knot points  "
    },
    {
      "type": "field",
      "varNames": [
        "dp"
      ],
      "begin_line": 54,
      "end_line": 55,
      "comment": " Derivative of test polynomials -- 2x + 1  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.testConstructor()",
      "begin_line": 58,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 61)",
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 39)",
        "(line 65,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.testValues()",
      "begin_line": 90,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 93,col 61)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 102,col 9)-(line 109,col 9)",
        "(line 112,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.findKnot(double[], double)",
      "begin_line": 138,
      "end_line": 148,
      "comment": "\n     *  Do linear search to find largest knot point less than or equal to x.\n     *  Implementation does binary search.\n     ",
      "child_ranges": [
        "(line 139,col 10)-(line 141,col 10)",
        "(line 142,col 10)-(line 146,col 10)",
        "(line 147,col 10)-(line 147,col 65)"
      ]
    }
  ]
}