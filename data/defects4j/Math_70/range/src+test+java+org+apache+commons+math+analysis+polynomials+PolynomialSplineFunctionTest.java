{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/analysis/polynomials/PolynomialSplineFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 147,
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
      "comment": "\n     * Quadratic polynomials used in tests:\n     *\n     * x^2 + x            [-1, 0)\n     * x^2 + x + 2        [0, 1)\n     * x^2 + x + 4        [1, 2)\n     *\n     * Defined so that evaluation using PolynomialSplineFunction evaluation\n     * algorithm agrees at knot point boundaries.\n     "
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunctionTest.testConstructor()",
      "begin_line": 59,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 61)",
        "(line 62,col 9)-(line 62,col 60)",
        "(line 63,col 9)-(line 63,col 77)",
        "(line 64,col 9)-(line 64,col 39)",
        "(line 66,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunctionTest.testValues()",
      "begin_line": 88,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 90,col 61)",
        "(line 91,col 9)-(line 91,col 61)",
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 99,col 22)",
        "(line 100,col 9)-(line 107,col 9)",
        "(line 110,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 122,col 9)",
        "(line 124,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunctionTest.findKnot(double[], double)",
      "begin_line": 136,
      "end_line": 146,
      "comment": "\n     *  Do linear search to find largest knot point less than or equal to x.\n     *  Implementation does binary search.\n     ",
      "child_ranges": [
        "(line 137,col 10)-(line 139,col 10)",
        "(line 140,col 10)-(line 144,col 10)",
        "(line 145,col 10)-(line 145,col 65)"
      ]
    }
  ]
}