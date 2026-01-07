{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialsUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialsUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 281,
      "comment": "\n * A collection of static methods that operate on or return polynomials.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHEBYSHEV_COEFFICIENTS"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Coefficients for Chebyshev polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "HERMITE_COEFFICIENTS"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Coefficients for Hermite polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LAGUERRE_COEFFICIENTS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Coefficients for Laguerre polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LEGENDRE_COEFFICIENTS"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Coefficients for Legendre polynomials. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.PolynomialsUtils()",
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * Private constructor, to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createChebyshevPolynomial(int)",
      "begin_line": 95,
      "end_line": 104,
      "comment": "\n     * Create a Chebyshev polynomial of the first kind.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ChebyshevPolynomialoftheFirstKind.html\"\u003eChebyshev\n     * polynomials of the first kind\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  T\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  T\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  T\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X T\u003csub\u003ek\u003c/sub\u003e(X) - T\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Chebyshev polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 103,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coeffs"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-96314c3c-f492-4327-b7a5-264ffc084859.generate(int)",
      "begin_line": 100,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 17)-(line 101,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial(int)",
      "begin_line": 120,
      "end_line": 131,
      "comment": "\n     * Create a Hermite polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/HermitePolynomial.html\"\u003eHermite\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  H\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  H\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 2X\n     *  H\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X H\u003csub\u003ek\u003c/sub\u003e(X) - 2k H\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n\n     * @param degree degree of the polynomial\n     * @return Hermite polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 130,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-4b866443-c486-44bb-ac1c-9ef882d5d4e9.generate(int)",
      "begin_line": 124,
      "end_line": 129,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 125,col 17)-(line 128,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial(int)",
      "begin_line": 146,
      "end_line": 158,
      "comment": "\n     * Create a Laguerre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LaguerrePolynomial.html\"\u003eLaguerre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        L\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        L\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 1 - X\n     *  (k+1) L\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k + 1 - X) L\u003csub\u003ek\u003c/sub\u003e(X) - k L\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Laguerre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 157,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-3856828b-7383-43c8-9638-2e8023b54127.generate(int)",
      "begin_line": 150,
      "end_line": 156,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 151,col 17)-(line 151,col 38)",
        "(line 152,col 17)-(line 155,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial(int)",
      "begin_line": 173,
      "end_line": 185,
      "comment": "\n     * Create a Legendre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LegendrePolynomial.html\"\u003eLegendre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        P\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        P\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  (k+1) P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k+1) X P\u003csub\u003ek\u003c/sub\u003e(X) - k P\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Legendre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 184,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-d948449e-3311-48cf-bcee-f45b1f122585.generate(int)",
      "begin_line": 177,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 178,col 17)-(line 178,col 38)",
        "(line 179,col 17)-(line 182,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(int, java.util.ArrayList\u003corg.apache.commons.math.fraction.BigFraction\u003e, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator)",
      "begin_line": 193,
      "end_line": 222,
      "comment": " Get the coefficients array for a given degree.\n     * @param degree degree of the polynomial\n     * @param coefficients list where the computed coefficients are stored\n     * @param generator recurrence coefficients generator\n     * @return coefficients array\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 95)",
        "(line 198,col 9)-(line 202,col 9)",
        "(line 212,col 9)-(line 212,col 52)",
        "(line 214,col 9)-(line 214,col 50)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 220,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.computeUpToDegree(int, int, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator, java.util.ArrayList\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 230,
      "end_line": 268,
      "comment": " Compute polynomial coefficients up to a given degree.\n     * @param degree maximal degree\n     * @param maxDegree current maximal degree\n     * @param generator recurrence coefficients generator\n     * @param coefficients list where the computed coefficients should be appended\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RecurrenceCoefficientsGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 271,
      "end_line": 279,
      "comment": " Interface for recurrence coefficients generation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator.generate(int)",
      "begin_line": 278,
      "end_line": 278,
      "comment": "\n         * Generate recurrence coefficients.\n         * @param k highest degree of the polynomials used in the recurrence\n         * @return an array of three coefficients such that\n         * P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (a[0] + a[1] X) P\u003csub\u003ek\u003c/sub\u003e(X) - a[2] P\u003csub\u003ek-1\u003c/sub\u003e(X)\n         ",
      "child_ranges": []
    }
  ]
}