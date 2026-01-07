{
  "filepath": "/tmp/Math-69b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialsUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialsUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 280,
      "comment": "\n * A collection of static methods that operate on or return polynomials.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHEBYSHEV_COEFFICIENTS"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Coefficients for Chebyshev polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "HERMITE_COEFFICIENTS"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Coefficients for Hermite polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LAGUERRE_COEFFICIENTS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Coefficients for Laguerre polynomials. "
    },
    {
      "type": "field",
      "varNames": [
        "LEGENDRE_COEFFICIENTS"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Coefficients for Legendre polynomials. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.PolynomialsUtils()",
      "begin_line": 78,
      "end_line": 79,
      "comment": "\n     * Private constructor, to prevent instantiation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createChebyshevPolynomial(int)",
      "begin_line": 94,
      "end_line": 103,
      "comment": "\n     * Create a Chebyshev polynomial of the first kind.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ChebyshevPolynomialoftheFirstKind.html\"\u003eChebyshev\n     * polynomials of the first kind\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  T\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  T\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  T\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X T\u003csub\u003ek\u003c/sub\u003e(X) - T\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Chebyshev polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 102,col 11)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "coeffs"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-4df31410-2fa2-4f16-8baa-a4c8387011ba.generate(int)",
      "begin_line": 99,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 17)-(line 100,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createHermitePolynomial(int)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "\n     * Create a Hermite polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/HermitePolynomial.html\"\u003eHermite\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *  H\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *  H\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 2X\n     *  H\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d 2X H\u003csub\u003ek\u003c/sub\u003e(X) - 2k H\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n\n     * @param degree degree of the polynomial\n     * @return Hermite polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 129,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-80b8e7d9-d315-4efa-ba70-0123d47d05b3.generate(int)",
      "begin_line": 123,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 124,col 17)-(line 127,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLaguerrePolynomial(int)",
      "begin_line": 145,
      "end_line": 157,
      "comment": "\n     * Create a Laguerre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LaguerrePolynomial.html\"\u003eLaguerre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        L\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        L\u003csub\u003e1\u003c/sub\u003e(X)   \u003d 1 - X\n     *  (k+1) L\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k + 1 - X) L\u003csub\u003ek\u003c/sub\u003e(X) - k L\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Laguerre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 156,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-219e509f-dd27-4dc0-84f3-1861696bc566.generate(int)",
      "begin_line": 149,
      "end_line": 155,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 150,col 17)-(line 150,col 38)",
        "(line 151,col 17)-(line 154,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.createLegendrePolynomial(int)",
      "begin_line": 172,
      "end_line": 184,
      "comment": "\n     * Create a Legendre polynomial.\n     * \u003cp\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/LegendrePolynomial.html\"\u003eLegendre\n     * polynomials\u003c/a\u003e are orthogonal polynomials.\n     * They can be defined by the following recurrence relations:\n     * \u003cpre\u003e\n     *        P\u003csub\u003e0\u003c/sub\u003e(X)   \u003d 1\n     *        P\u003csub\u003e1\u003c/sub\u003e(X)   \u003d X\n     *  (k+1) P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (2k+1) X P\u003csub\u003ek\u003c/sub\u003e(X) - k P\u003csub\u003ek-1\u003c/sub\u003e(X)\n     * \u003c/pre\u003e\u003c/p\u003e\n     * @param degree degree of the polynomial\n     * @return Legendre polynomial of specified degree\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 183,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.Anonymous-15917982-7ae6-4b07-85a6-f8a9e58159eb.generate(int)",
      "begin_line": 176,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 177,col 17)-(line 177,col 38)",
        "(line 178,col 17)-(line 181,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.buildPolynomial(int, java.util.ArrayList\u003corg.apache.commons.math.fraction.BigFraction\u003e, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator)",
      "begin_line": 192,
      "end_line": 221,
      "comment": " Get the coefficients array for a given degree.\n     * @param degree degree of the polynomial\n     * @param coefficients list where the computed coefficients are stored\n     * @param generator recurrence coefficients generator\n     * @return coefficients array\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 87)",
        "(line 197,col 9)-(line 201,col 9)",
        "(line 211,col 9)-(line 211,col 52)",
        "(line 213,col 9)-(line 213,col 50)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 219,col 9)-(line 219,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.computeUpToDegree(int, int, org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator, java.util.ArrayList\u003corg.apache.commons.math.fraction.BigFraction\u003e)",
      "begin_line": 229,
      "end_line": 267,
      "comment": " Compute polynomial coefficients up to a given degree.\n     * @param degree maximal degree\n     * @param maxDegree current maximal degree\n     * @param generator recurrence coefficients generator\n     * @param coefficients list where the computed coefficients should be appended\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 53)",
        "(line 234,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RecurrenceCoefficientsGenerator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 270,
      "end_line": 278,
      "comment": " Interface for recurrence coefficients generation. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialsUtils.RecurrenceCoefficientsGenerator.generate(int)",
      "begin_line": 277,
      "end_line": 277,
      "comment": "\n         * Generate recurrence coefficients.\n         * @param k highest degree of the polynomials used in the recurrence\n         * @return an array of three coefficients such that\n         * P\u003csub\u003ek+1\u003c/sub\u003e(X) \u003d (a[0] + a[1] X) P\u003csub\u003ek\u003c/sub\u003e(X) - a[2] P\u003csub\u003ek-1\u003c/sub\u003e(X)\n         ",
      "child_ranges": []
    }
  ]
}