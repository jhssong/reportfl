{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/analysis/PolynomialFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 163,
      "comment": "\n * Tests the PolynomialFunction implementation of a UnivariateRealFunction.\n *\n * @version $Revision$\n * @author Matt Cliff \u003cmatt@mattcliff.com\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Error tolerance for tests "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testConstants()",
      "begin_line": 41,
      "end_line": 56,
      "comment": "\n     * tests the value of a constant polynomial.\n     *\n     * \u003cp\u003evalue of this is 2.5 everywhere.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 29)",
        "(line 43,col 9)-(line 43,col 59)",
        "(line 46,col 9)-(line 46,col 55)",
        "(line 47,col 9)-(line 47,col 56)",
        "(line 48,col 9)-(line 48,col 58)",
        "(line 49,col 9)-(line 49,col 55)",
        "(line 50,col 9)-(line 50,col 58)",
        "(line 52,col 9)-(line 52,col 36)",
        "(line 53,col 9)-(line 53,col 60)",
        "(line 55,col 9)-(line 55,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testLinear()",
      "begin_line": 67,
      "end_line": 85,
      "comment": "\n     * tests the value of a linear polynomial.\n     *\n     * \u003cp\u003eThis will test the function f(x) \u003d 3*x - 1.5\u003c/p\u003e\n     * \u003cp\u003eThis will have the values \n     *  \u003ctt\u003ef(0.0) \u003d -1.5, f(-1.0) \u003d -4.5, f(-2.5) \u003d -9.0,\n     *      f(0.5) \u003d 0.0, f(1.5) \u003d 3.0\u003c/tt\u003e and \u003ctt\u003ef(3.0) \u003d 7.5\u003c/tt\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 35)",
        "(line 69,col 9)-(line 69,col 59)",
        "(line 72,col 9)-(line 72,col 55)",
        "(line 75,col 9)-(line 75,col 56)",
        "(line 76,col 9)-(line 76,col 56)",
        "(line 77,col 9)-(line 77,col 54)",
        "(line 78,col 9)-(line 78,col 54)",
        "(line 79,col 9)-(line 79,col 54)",
        "(line 81,col 9)-(line 81,col 36)",
        "(line 83,col 9)-(line 83,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testQuadratic()",
      "begin_line": 93,
      "end_line": 107,
      "comment": "\n     * Tests a second order polynomial.\n     * \u003cp\u003e This will test the function f(x) \u003d 2x^2 - 3x -2 \u003d (2x+1)(x-2)\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 59)",
        "(line 98,col 9)-(line 98,col 55)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 102,col 54)",
        "(line 103,col 9)-(line 103,col 55)",
        "(line 104,col 9)-(line 104,col 55)",
        "(line 105,col 9)-(line 105,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testQuintic()",
      "begin_line": 115,
      "end_line": 131,
      "comment": " \n     * This will test the quintic function \n     *   f(x) \u003d x^2(x-5)(x+3)(x-1) \u003d x^5 - 3x^4 -13x^3 + 15x^2\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 59)",
        "(line 120,col 9)-(line 120,col 55)",
        "(line 123,col 9)-(line 123,col 54)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 55)",
        "(line 126,col 9)-(line 126,col 60)",
        "(line 127,col 9)-(line 127,col 59)",
        "(line 129,col 9)-(line 129,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testfirstDerivativeComparison()",
      "begin_line": 141,
      "end_line": 161,
      "comment": "\n     * tests the firstDerivative function by comparison\n     *\n     * \u003cp\u003eThis will test the functions \n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 51)",
        "(line 143,col 9)-(line 143,col 46)",
        "(line 144,col 9)-(line 144,col 41)",
        "(line 146,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 151,col 9)-(line 151,col 75)",
        "(line 152,col 9)-(line 152,col 75)",
        "(line 153,col 9)-(line 153,col 79)",
        "(line 154,col 9)-(line 154,col 75)",
        "(line 155,col 9)-(line 155,col 79)",
        "(line 158,col 9)-(line 158,col 83)",
        "(line 159,col 9)-(line 159,col 83)"
      ]
    }
  ]
}