{
  "filepath": "/tmp/Math-40b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialsUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialsUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 447,
      "comment": "\n * A collection of static methods that operate on or return polynomials.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHEBYSHEV_COEFFICIENTS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Coefficients for Chebyshev polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "HERMITE_COEFFICIENTS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Coefficients for Hermite polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LAGUERRE_COEFFICIENTS"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Coefficients for Laguerre polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LEGENDRE_COEFFICIENTS"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Coefficients for Legendre polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "JACOBI_COEFFICIENTS"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Coefficients for Jacobi polynomials. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.PolynomialsUtils()",
      "begin_line": 89,
      "end_line": 90,
      "comment": "\n     * Private constructor, to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createChebyshevPolynomial(int)",
      "begin_line": 105,
      "end_line": 114,
      "comment": "\n     * Create a Chebyshev polynomial of the first kind.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ChebyshevPolynomialoftheFirstKind.html\"\u003eChebyshev\n     * polynomials of the first kind\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  T\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  T\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  T\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X T\u003csub\u003ek\u003c/sub\u003e(X) - T\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Chebyshev polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 113,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coeffs"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-80b03d75-779b-4174-b394-6a60fc6d64c9.generate(int)",
      "begin_line": 110,
      "end_line": 112,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 17)-(line 111,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial(int)",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\n     * Create a Hermite polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/HermitePolynomial.html\"\u003eHermite\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  H\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  H\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 2X\n     *  H\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X H\u003csub\u003ek\u003c/sub\u003e(X) - 2k H\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n\n     * @param degree degree of the polynomial\n     * @return Hermite polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 140,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-771e1962-2f41-4a7e-9062-6a93ca3b2385.generate(int)",
      "begin_line": 134,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 135,col 17)-(line 138,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial(int)",
      "begin_line": 156,
      "end_line": 168,
      "comment": "\n     * Create a Laguerre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LaguerrePolynomial.html\"\u003eLaguerre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        L\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        L\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 1 - X\n     *  (k+1) L\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k + 1 - X) L\u003csub\u003ek\u003c/sub\u003e(X) - k L\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Laguerre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 167,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-ba6b461e-1ca0-4113-9308-e9d88c7312cb.generate(int)",
      "begin_line": 160,
      "end_line": 166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 161,col 17)-(line 161,col 38)",
        "(line 162,col 17)-(line 165,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial(int)",
      "begin_line": 183,
      "end_line": 195,
      "comment": "\n     * Create a Legendre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LegendrePolynomial.html\"\u003eLegendre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        P\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        P\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  (k+1) P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k+1) X P\u003csub\u003ek\u003c/sub\u003e(X) - k P\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Legendre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 194,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-fac44656-d9dc-495d-8c4d-ff2fb41a1726.generate(int)",
      "begin_line": 187,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 17)-(line 188,col 38)",
        "(line 189,col 17)-(line 192,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createJacobiPolynomial(int, int, int)",
      "begin_line": 214,
      "end_line": 253,
      "comment": "\n     * Create a Jacobi polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/JacobiPolynomial.html\"\u003eJacobi\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        P\u003csub\u003e0\u003c/sub\u003e\u003csup\u003evw\u003c/sup\u003e(X)   \u003d 1\n     *        P\u003csub\u003e-1\u003c/sub\u003e\u003csup\u003evw\u003c/sup\u003e(X)  \u003d 0\n     *  2k(k + v + w)(2k + v + w - 2) P\u003csub\u003ek\u003c/sub\u003e\u003csup\u003evw\u003c/sup\u003e(X) \u003d\n     *  (2k + v + w - 1)[(2k + v + w)(2k + v + w - 2) X + v\u003csup\u003e2\u003c/sup\u003e - w\u003csup\u003e2\u003c/sup\u003e] P\u003csub\u003ek-1\u003c/sub\u003e\u003csup\u003evw\u003c/sup\u003e(X)\n     *  - 2(k + v - 1)(k + w - 1)(2k + v + w) P\u003csub\u003ek-2\u003c/sub\u003e\u003csup\u003evw\u003c/sup\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @param v first exponent\n     * @param w second exponent\n     * @return Jacobi polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 50)",
        "(line 219,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 251,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-30867a64-d615-4709-b5e8-0fafa3098c64.generate(int)",
      "begin_line": 237,
      "end_line": 250,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 17)-(line 238,col 20)",
        "(line 239,col 17)-(line 239,col 47)",
        "(line 240,col 17)-(line 240,col 45)",
        "(line 241,col 17)-(line 241,col 48)",
        "(line 242,col 17)-(line 242,col 48)",
        "(line 243,col 17)-(line 243,col 61)",
        "(line 245,col 17)-(line 249,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JacobiKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 256,
      "end_line": 296,
      "comment": " Inner class for Jacobi polynomials keys. "
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 259,
      "end_line": 259,
      "comment": " First exponent. "
    },
    {
      "type": "field",
      "varNames": [
        "w"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": " Second exponent. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey.JacobiKey(int, int)",
      "begin_line": 268,
      "end_line": 271,
      "comment": " Simple constructor.\n         * @param v first exponent\n         * @param w second exponent\n         ",
      "child_ranges": [
        "(line 269,col 13)-(line 269,col 23)",
        "(line 270,col 13)-(line 270,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey.hashCode()",
      "begin_line": 276,
      "end_line": 279,
      "comment": " Get hash code.\n         * @return hash code\n         ",
      "child_ranges": [
        "(line 278,col 13)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.JacobiKey.equals(java.lang.Object)",
      "begin_line": 285,
      "end_line": 295,
      "comment": " Check if the instance represent the same key as another instance.\n         * @param key other key\n         * @return true if the instance and the other key refer to the same polynomial\n         ",
      "child_ranges": [
        "(line 288,col 13)-(line 290,col 13)",
        "(line 292,col 13)-(line 292,col 53)",
        "(line 293,col 13)-(line 293,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.shift(double[], double)",
      "begin_line": 322,
      "end_line": 350,
      "comment": "\n     * Compute the coefficients of the polynomial \u003ccode\u003eP\u003csub\u003es\u003c/sub\u003e(x)\u003c/code\u003e\n     * whose values at point {@code x} will be the same as the those from the\n     * original polynomial \u003ccode\u003eP(x)\u003c/code\u003e when computed at {@code x + shift}.\n     * Thus, if \u003ccode\u003eP(x) \u003d \u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e x\u003csup\u003ei\u003c/sup\u003e\u003c/code\u003e,\n     * then\n     * \u003cpre\u003e\n     *  \u003ctable\u003e\n     *   \u003ctr\u003e\n     *    \u003ctd\u003e\u003ccode\u003eP\u003csub\u003es\u003c/sub\u003e(x)\u003c/td\u003e\n     *    \u003ctd\u003e\u003d \u0026Sigma;\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e x\u003csup\u003ei\u003c/sup\u003e\u003c/code\u003e\u003c/td\u003e\n     *   \u003c/tr\u003e\n     *   \u003ctr\u003e\n     *    \u003ctd\u003e\u003c/td\u003e\n     *    \u003ctd\u003e\u003d \u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e (x + shift)\u003csup\u003ei\u003c/sup\u003e\u003c/code\u003e\u003c/td\u003e\n     *   \u003c/tr\u003e\n     *  \u003c/table\u003e\n     * \u003c/pre\u003e\n     *\n     * @param coefficients Coefficients of the original polynomial.\n     * @param shift Shift value.\n     * @return the coefficients \u003ccode\u003eb\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e of the shifted\n     * polynomial.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 44)",
        "(line 325,col 9)-(line 325,col 57)",
        "(line 328,col 9)-(line 328,col 48)",
        "(line 329,col 9)-(line 333,col 9)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 341,col 9)-(line 341,col 30)",
        "(line 342,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(int, java.util.List\u003corg.apache.commons.math.fraction.BigFraction\u003e, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator)",
      "begin_line": 359,
      "end_line": 388,
      "comment": " Get the coefficients array for a given degree.\n     * @param degree degree of the polynomial\n     * @param coefficients list where the computed coefficients are stored\n     * @param generator recurrence coefficients generator\n     * @return coefficients array\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 95)",
        "(line 364,col 9)-(line 368,col 9)",
        "(line 378,col 9)-(line 378,col 52)",
        "(line 380,col 9)-(line 380,col 50)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 386,col 9)-(line 386,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.computeUpToDegree(int, int, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator, java.util.List\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 396,
      "end_line": 434,
      "comment": " Compute polynomial coefficients up to a given degree.\n     * @param degree maximal degree\n     * @param maxDegree current maximal degree\n     * @param generator recurrence coefficients generator\n     * @param coefficients list where the computed coefficients should be appended\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 53)",
        "(line 401,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RecurrenceCoefficientsGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 437,
      "end_line": 445,
      "comment": " Interface for recurrence coefficients generation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator.generate(int)",
      "begin_line": 444,
      "end_line": 444,
      "comment": "\n         * Generate recurrence coefficients.\n         * @param k highest degree of the polynomials used in the recurrence\n         * @return an array of three coefficients such that\n         * P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (a[0] + a[1] X) P\u003csub\u003ek\u003c/sub\u003e(X) - a[2] P\u003csub\u003ek-1\u003c/sub\u003e(X)\n         ",
      "child_ranges": []
    }
  ]
}