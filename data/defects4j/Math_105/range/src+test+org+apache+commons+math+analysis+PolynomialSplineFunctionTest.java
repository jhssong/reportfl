{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/analysis/PolynomialSplineFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 150,
      "comment": "\n * Tests the PolynomialSplineFunction implementation.\n *\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Error tolerance for tests "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 45,
      "end_line": 49,
      "comment": " \n     * Quadratic polynomials used in tests: \n     * \n     * x^2 + x            [-1, 0)\n     * x^2 + x + 2        [0, 1)\n     * x^2 + x + 4        [1, 2)\n     * \n     * Defined so that evaluation using PolynomialSplineFunction evaluation\n     * algorithm agrees at knot point boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Knot points  "
    },
    {
      "type": "field",
      "varNames": [
        "dp"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": " Derivative of test polynomials -- 2x + 1  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.testConstructor()",
      "begin_line": 59,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 61)",
        "(line 62,col 9)-(line 62,col 60)",
        "(line 63,col 9)-(line 63,col 77)",
        "(line 64,col 9)-(line 64,col 39)",
        "(line 66,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.testValues()",
      "begin_line": 91,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 93,col 61)",
        "(line 94,col 9)-(line 94,col 61)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.findKnot(double[], double)",
      "begin_line": 139,
      "end_line": 149,
      "comment": "\n     *  Do linear search to find largest knot point less than or equal to x.\n     *  Implementation does binary search.\n     ",
      "child_ranges": [
        "(line 140,col 10)-(line 142,col 10)",
        "(line 143,col 10)-(line 147,col 10)",
        "(line 148,col 10)-(line 148,col 65)"
      ]
    }
  ]
}