{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/analysis/PolynomialSplineFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 146,
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
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 61)",
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 39)",
        "(line 65,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.testValues()",
      "begin_line": 87,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 89,col 61)",
        "(line 90,col 9)-(line 90,col 61)",
        "(line 97,col 9)-(line 97,col 22)",
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunctionTest.findKnot(double[], double)",
      "begin_line": 135,
      "end_line": 145,
      "comment": "\n     *  Do linear search to find largest knot point less than or equal to x.\n     *  Implementation does binary search.\n     ",
      "child_ranges": [
        "(line 136,col 10)-(line 138,col 10)",
        "(line 139,col 10)-(line 143,col 10)",
        "(line 144,col 10)-(line 144,col 65)"
      ]
    }
  ]
}