{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 265,
      "comment": "\n * Tests the PolynomialFunction implementation of a UnivariateFunction.\n *\n * @version $Id$\n "
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
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testConstants()",
      "begin_line": 39,
      "end_line": 55,
      "comment": "\n     * tests the value of a constant polynomial.\n     *\n     * \u003cp\u003evalue of this is 2.5 everywhere.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 29)",
        "(line 42,col 9)-(line 42,col 57)",
        "(line 45,col 9)-(line 45,col 57)",
        "(line 46,col 9)-(line 46,col 58)",
        "(line 47,col 9)-(line 47,col 62)",
        "(line 48,col 9)-(line 48,col 57)",
        "(line 49,col 9)-(line 49,col 62)",
        "(line 51,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 52,col 67)",
        "(line 54,col 9)-(line 54,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testLinear()",
      "begin_line": 66,
      "end_line": 84,
      "comment": "\n     * tests the value of a linear polynomial.\n     *\n     * \u003cp\u003eThis will test the function f(x) \u003d 3*x - 1.5\u003c/p\u003e\n     * \u003cp\u003eThis will have the values\n     *  \u003ctt\u003ef(0) \u003d -1.5, f(-1) \u003d -4.5, f(-2.5) \u003d -9,\n     *      f(0.5) \u003d 0, f(1.5) \u003d 3\u003c/tt\u003e and \u003ctt\u003ef(3) \u003d 7.5\u003c/tt\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 57)",
        "(line 72,col 9)-(line 72,col 57)",
        "(line 75,col 9)-(line 75,col 58)",
        "(line 76,col 9)-(line 76,col 58)",
        "(line 77,col 9)-(line 77,col 56)",
        "(line 78,col 9)-(line 78,col 56)",
        "(line 79,col 9)-(line 79,col 56)",
        "(line 81,col 9)-(line 81,col 43)",
        "(line 83,col 9)-(line 83,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testQuadratic()",
      "begin_line": 90,
      "end_line": 104,
      "comment": "\n     * Tests a second order polynomial.\n     * \u003cp\u003e This will test the function f(x) \u003d 2x^2 - 3x -2 \u003d (2x+1)(x-2)\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)",
        "(line 93,col 9)-(line 93,col 57)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 100,col 54)",
        "(line 101,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 102,col 57)",
        "(line 103,col 9)-(line 103,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testQuintic()",
      "begin_line": 110,
      "end_line": 126,
      "comment": "\n     * This will test the quintic function\n     *   f(x) \u003d x^2(x-5)(x+3)(x-1) \u003d x^5 - 3x^4 -13x^3 + 15x^2\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 46)",
        "(line 113,col 9)-(line 113,col 57)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 119,col 9)-(line 119,col 54)",
        "(line 120,col 9)-(line 120,col 54)",
        "(line 121,col 9)-(line 121,col 55)",
        "(line 122,col 9)-(line 122,col 64)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testfirstDerivativeComparison()",
      "begin_line": 135,
      "end_line": 155,
      "comment": "\n     * tests the firstDerivative function by comparison\n     *\n     * \u003cp\u003eThis will test the functions\n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 138,col 40)",
        "(line 139,col 9)-(line 139,col 37)",
        "(line 141,col 9)-(line 141,col 63)",
        "(line 142,col 9)-(line 142,col 63)",
        "(line 143,col 9)-(line 143,col 63)",
        "(line 146,col 9)-(line 146,col 76)",
        "(line 147,col 9)-(line 147,col 76)",
        "(line 148,col 9)-(line 148,col 80)",
        "(line 149,col 9)-(line 149,col 80)",
        "(line 150,col 9)-(line 150,col 84)",
        "(line 153,col 9)-(line 153,col 96)",
        "(line 154,col 9)-(line 154,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testString()",
      "begin_line": 157,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 81)",
        "(line 160,col 9)-(line 160,col 45)",
        "(line 161,col 9)-(line 162,col 40)",
        "(line 163,col 9)-(line 164,col 41)",
        "(line 165,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 168,col 40)",
        "(line 169,col 9)-(line 170,col 34)",
        "(line 171,col 9)-(line 172,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testAddition()",
      "begin_line": 175,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 79)",
        "(line 178,col 9)-(line 178,col 82)",
        "(line 179,col 9)-(line 179,col 40)",
        "(line 181,col 9)-(line 181,col 24)",
        "(line 182,col 9)-(line 182,col 40)",
        "(line 184,col 9)-(line 184,col 63)",
        "(line 185,col 9)-(line 185,col 64)",
        "(line 186,col 9)-(line 186,col 24)",
        "(line 187,col 9)-(line 187,col 44)",
        "(line 188,col 9)-(line 188,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testSubtraction()",
      "begin_line": 191,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 79)",
        "(line 194,col 9)-(line 194,col 45)",
        "(line 196,col 9)-(line 196,col 79)",
        "(line 197,col 9)-(line 197,col 29)",
        "(line 198,col 9)-(line 198,col 35)",
        "(line 200,col 9)-(line 200,col 63)",
        "(line 201,col 9)-(line 201,col 63)",
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 203,col 44)",
        "(line 204,col 9)-(line 204,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testMultiplication()",
      "begin_line": 207,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 79)",
        "(line 210,col 9)-(line 210,col 81)",
        "(line 211,col 9)-(line 211,col 61)",
        "(line 213,col 9)-(line 213,col 59)",
        "(line 214,col 9)-(line 214,col 16)",
        "(line 215,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testSerial()",
      "begin_line": 221,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 81)",
        "(line 224,col 9)-(line 224,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.testMath341()",
      "begin_line": 234,
      "end_line": 254,
      "comment": "\n     * tests the firstDerivative function by comparison\n     *\n     * \u003cp\u003eThis will test the functions\n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 43)",
        "(line 237,col 9)-(line 237,col 40)",
        "(line 238,col 9)-(line 238,col 37)",
        "(line 240,col 9)-(line 240,col 63)",
        "(line 241,col 9)-(line 241,col 63)",
        "(line 242,col 9)-(line 242,col 63)",
        "(line 245,col 9)-(line 245,col 76)",
        "(line 246,col 9)-(line 246,col 76)",
        "(line 247,col 9)-(line 247,col 80)",
        "(line 248,col 9)-(line 248,col 80)",
        "(line 249,col 9)-(line 249,col 84)",
        "(line 252,col 9)-(line 252,col 96)",
        "(line 253,col 9)-(line 253,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.checkPolynomial(org.apache.commons.math3.analysis.polynomials.PolynomialFunction, java.lang.String)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest.checkNullPolynomial(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 260,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)"
      ]
    }
  ]
}