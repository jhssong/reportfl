{
  "filepath": "/tmp/Math-105b/src/test/org/apache/commons/math/analysis/PolynomialFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 164,
      "comment": "\n * Tests the PolynomialFunction implementation of a UnivariateRealFunction.\n *\n * @version $Revision$\n * @author Matt Cliff \u003cmatt@mattcliff.com\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "tolerance"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Error tolerance for tests "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testConstants()",
      "begin_line": 42,
      "end_line": 57,
      "comment": "\n     * tests the value of a constant polynomial.\n     *\n     * \u003cp\u003evalue of this is 2.5 everywhere.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 29)",
        "(line 44,col 9)-(line 44,col 59)",
        "(line 47,col 9)-(line 47,col 55)",
        "(line 48,col 9)-(line 48,col 56)",
        "(line 49,col 9)-(line 49,col 58)",
        "(line 50,col 9)-(line 50,col 55)",
        "(line 51,col 9)-(line 51,col 58)",
        "(line 53,col 9)-(line 53,col 36)",
        "(line 54,col 9)-(line 54,col 60)",
        "(line 56,col 9)-(line 56,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testLinear()",
      "begin_line": 68,
      "end_line": 86,
      "comment": "\n     * tests the value of a linear polynomial.\n     *\n     * \u003cp\u003eThis will test the function f(x) \u003d 3*x - 1.5\u003c/p\u003e\n     * \u003cp\u003eThis will have the values \n     *  \u003ctt\u003ef(0.0) \u003d -1.5, f(-1.0) \u003d -4.5, f(-2.5) \u003d -9.0,\n     *      f(0.5) \u003d 0.0, f(1.5) \u003d 3.0\u003c/tt\u003e and \u003ctt\u003ef(3.0) \u003d 7.5\u003c/tt\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 35)",
        "(line 70,col 9)-(line 70,col 59)",
        "(line 73,col 9)-(line 73,col 55)",
        "(line 76,col 9)-(line 76,col 56)",
        "(line 77,col 9)-(line 77,col 56)",
        "(line 78,col 9)-(line 78,col 54)",
        "(line 79,col 9)-(line 79,col 54)",
        "(line 80,col 9)-(line 80,col 54)",
        "(line 82,col 9)-(line 82,col 36)",
        "(line 84,col 9)-(line 84,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testQuadratic()",
      "begin_line": 94,
      "end_line": 108,
      "comment": "\n     * Tests a second order polynomial.\n     * \u003cp\u003e This will test the function f(x) \u003d 2x^2 - 3x -2 \u003d (2x+1)(x-2)\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 41)",
        "(line 96,col 9)-(line 96,col 59)",
        "(line 99,col 9)-(line 99,col 55)",
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 54)",
        "(line 104,col 9)-(line 104,col 55)",
        "(line 105,col 9)-(line 105,col 55)",
        "(line 106,col 9)-(line 106,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testQuintic()",
      "begin_line": 116,
      "end_line": 132,
      "comment": " \n     * This will test the quintic function \n     *   f(x) \u003d x^2(x-5)(x+3)(x-1) \u003d x^5 - 3x^4 -13x^3 + 15x^2\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 59)",
        "(line 121,col 9)-(line 121,col 55)",
        "(line 124,col 9)-(line 124,col 54)",
        "(line 125,col 9)-(line 125,col 54)",
        "(line 126,col 9)-(line 126,col 55)",
        "(line 127,col 9)-(line 127,col 60)",
        "(line 128,col 9)-(line 128,col 59)",
        "(line 130,col 9)-(line 130,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionTest.testfirstDerivativeComparision()",
      "begin_line": 142,
      "end_line": 162,
      "comment": "\n     * tests the firstDerivative function by comparision\n     *\n     * \u003cp\u003eThis will test the functions \n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 51)",
        "(line 144,col 9)-(line 144,col 46)",
        "(line 145,col 9)-(line 145,col 41)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 65)",
        "(line 152,col 9)-(line 152,col 75)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 79)",
        "(line 155,col 9)-(line 155,col 75)",
        "(line 156,col 9)-(line 156,col 79)"
      ]
    }
  ]
}