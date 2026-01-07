{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/polynomials/PolynomialSplineFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunctionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 152,
      "comment": "\n * Tests the PolynomialSplineFunction implementation.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Error tolerance for tests "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 48,
      "end_line": 52,
      "comment": "\n     * Quadratic polynomials used in tests:\n     *\n     * x^2 + x            [-1, 0)\n     * x^2 + x + 2        [0, 1)\n     * x^2 + x + 4        [1, 2)\n     *\n     * Defined so that evaluation using PolynomialSplineFunction evaluation\n     * algorithm agrees at knot point boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Knot points  "
    },
    {
      "type": "field",
      "varNames": [
        "dp"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": " Derivative of test polynomials -- 2x + 1  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.testConstructor()",
      "begin_line": 62,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 65,col 61)",
        "(line 66,col 9)-(line 66,col 67)",
        "(line 67,col 9)-(line 67,col 84)",
        "(line 68,col 9)-(line 68,col 46)",
        "(line 70,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.testValues()",
      "begin_line": 92,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 104,col 22)",
        "(line 105,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest.findKnot(double[], double)",
      "begin_line": 141,
      "end_line": 151,
      "comment": "\n     *  Do linear search to find largest knot point less than or equal to x.\n     *  Implementation does binary search.\n     ",
      "child_ranges": [
        "(line 142,col 10)-(line 144,col 10)",
        "(line 145,col 10)-(line 149,col 10)",
        "(line 150,col 10)-(line 150,col 47)"
      ]
    }
  ]
}