{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/analysis/polynomials/PolynomialFunctionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 271,
      "comment": "\n * Tests the PolynomialFunction implementation of a UnivariateRealFunction.\n *\n * @version $Revision$\n * @author Matt Cliff \u003cmatt@mattcliff.com\u003e\n "
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
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testConstants()",
      "begin_line": 40,
      "end_line": 55,
      "comment": "\n     * tests the value of a constant polynomial.\n     *\n     * \u003cp\u003evalue of this is 2.5 everywhere.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 29)",
        "(line 42,col 9)-(line 42,col 59)",
        "(line 45,col 9)-(line 45,col 55)",
        "(line 46,col 9)-(line 46,col 56)",
        "(line 47,col 9)-(line 47,col 58)",
        "(line 48,col 9)-(line 48,col 55)",
        "(line 49,col 9)-(line 49,col 58)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 52,col 60)",
        "(line 54,col 9)-(line 54,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testLinear()",
      "begin_line": 66,
      "end_line": 84,
      "comment": "\n     * tests the value of a linear polynomial.\n     *\n     * \u003cp\u003eThis will test the function f(x) \u003d 3*x - 1.5\u003c/p\u003e\n     * \u003cp\u003eThis will have the values\n     *  \u003ctt\u003ef(0.0) \u003d -1.5, f(-1.0) \u003d -4.5, f(-2.5) \u003d -9.0,\n     *      f(0.5) \u003d 0.0, f(1.5) \u003d 3.0\u003c/tt\u003e and \u003ctt\u003ef(3.0) \u003d 7.5\u003c/tt\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 35)",
        "(line 68,col 9)-(line 68,col 59)",
        "(line 71,col 9)-(line 71,col 55)",
        "(line 74,col 9)-(line 74,col 56)",
        "(line 75,col 9)-(line 75,col 56)",
        "(line 76,col 9)-(line 76,col 54)",
        "(line 77,col 9)-(line 77,col 54)",
        "(line 78,col 9)-(line 78,col 54)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 82,col 9)-(line 82,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testQuadratic()",
      "begin_line": 92,
      "end_line": 106,
      "comment": "\n     * Tests a second order polynomial.\n     * \u003cp\u003e This will test the function f(x) \u003d 2x^2 - 3x -2 \u003d (2x+1)(x-2)\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 59)",
        "(line 97,col 9)-(line 97,col 55)",
        "(line 100,col 9)-(line 100,col 55)",
        "(line 101,col 9)-(line 101,col 54)",
        "(line 102,col 9)-(line 102,col 55)",
        "(line 103,col 9)-(line 103,col 55)",
        "(line 104,col 9)-(line 104,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testQuintic()",
      "begin_line": 114,
      "end_line": 130,
      "comment": "\n     * This will test the quintic function\n     *   f(x) \u003d x^2(x-5)(x+3)(x-1) \u003d x^5 - 3x^4 -13x^3 + 15x^2\u003c/p\u003e\n     *\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 59)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 122,col 9)-(line 122,col 54)",
        "(line 123,col 9)-(line 123,col 54)",
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 125,col 60)",
        "(line 126,col 9)-(line 126,col 59)",
        "(line 128,col 9)-(line 128,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testfirstDerivativeComparison()",
      "begin_line": 140,
      "end_line": 160,
      "comment": "\n     * tests the firstDerivative function by comparison\n     *\n     * \u003cp\u003eThis will test the functions\n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 51)",
        "(line 142,col 9)-(line 142,col 46)",
        "(line 143,col 9)-(line 143,col 41)",
        "(line 145,col 9)-(line 145,col 65)",
        "(line 146,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 151,col 9)-(line 151,col 75)",
        "(line 152,col 9)-(line 152,col 79)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 79)",
        "(line 157,col 9)-(line 157,col 91)",
        "(line 158,col 9)-(line 158,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testString()",
      "begin_line": 162,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 87)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 165,col 9)-(line 166,col 44)",
        "(line 167,col 9)-(line 168,col 47)",
        "(line 169,col 9)-(line 170,col 42)",
        "(line 171,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 174,col 38)",
        "(line 175,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testAddition()",
      "begin_line": 179,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 83)",
        "(line 182,col 9)-(line 182,col 88)",
        "(line 183,col 9)-(line 183,col 40)",
        "(line 185,col 9)-(line 185,col 24)",
        "(line 186,col 9)-(line 186,col 44)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 189,col 70)",
        "(line 190,col 9)-(line 190,col 24)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 192,col 9)-(line 192,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testSubtraction()",
      "begin_line": 196,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 83)",
        "(line 199,col 9)-(line 199,col 45)",
        "(line 201,col 9)-(line 201,col 83)",
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 203,col 37)",
        "(line 205,col 9)-(line 205,col 69)",
        "(line 206,col 9)-(line 206,col 69)",
        "(line 207,col 9)-(line 207,col 29)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 209,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testMultiplication()",
      "begin_line": 213,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 83)",
        "(line 216,col 9)-(line 216,col 87)",
        "(line 217,col 9)-(line 217,col 65)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 16)",
        "(line 221,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testSerial()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 87)",
        "(line 230,col 9)-(line 230,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.testMath341()",
      "begin_line": 240,
      "end_line": 259,
      "comment": "\n     * tests the firstDerivative function by comparison\n     *\n     * \u003cp\u003eThis will test the functions\n     * \u003ctt\u003ef(x) \u003d x^3 - 2x^2 + 6x + 3, g(x) \u003d 3x^2 - 4x + 6\u003c/tt\u003e\n     * and \u003ctt\u003eh(x) \u003d 6x - 4\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 51)",
        "(line 242,col 9)-(line 242,col 46)",
        "(line 243,col 9)-(line 243,col 41)",
        "(line 245,col 9)-(line 245,col 65)",
        "(line 246,col 9)-(line 246,col 65)",
        "(line 247,col 9)-(line 247,col 65)",
        "(line 250,col 9)-(line 250,col 75)",
        "(line 251,col 9)-(line 251,col 75)",
        "(line 252,col 9)-(line 252,col 79)",
        "(line 253,col 9)-(line 253,col 75)",
        "(line 254,col 9)-(line 254,col 79)",
        "(line 257,col 9)-(line 257,col 91)",
        "(line 258,col 9)-(line 258,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.checkPolynomial(org.apache.commons.math.analysis.polynomials.PolynomialFunction, java.lang.String)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionTest.checkNullPolynomial(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 268,col 9)"
      ]
    }
  ]
}