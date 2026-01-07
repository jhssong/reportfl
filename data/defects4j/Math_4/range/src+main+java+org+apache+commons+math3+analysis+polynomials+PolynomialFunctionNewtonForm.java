{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction"
      ],
      "begin_line": 40,
      "end_line": 246,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Centers of the Newton polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 79,
      "end_line": 88,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @throws NullArgumentException if any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 31)",
        "(line 83,col 9)-(line 83,col 38)",
        "(line 84,col 9)-(line 84,col 38)",
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 86,col 52)",
        "(line 87,col 9)-(line 87,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     ",
      "child_ranges": [
        "(line 97,col 8)-(line 97,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 104,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)",
        "(line 107,col 9)-(line 107,col 31)",
        "(line 108,col 9)-(line 108,col 103)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 44)",
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the centers array.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 44)",
        "(line 148,col 9)-(line 148,col 49)",
        "(line 149,col 9)-(line 149,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 159,
      "end_line": 166,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 55)",
        "(line 164,col 9)-(line 164,col 71)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 182,
      "end_line": 193,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws NullArgumentException if any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)",
        "(line 186,col 9)-(line 186,col 31)",
        "(line 187,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 199,
      "end_line": 216,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 31)",
        "(line 202,col 9)-(line 202,col 39)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 31)",
        "(line 208,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 233,
      "end_line": 244,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\u003c/p\u003e\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws NullArgumentException if any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     * @see org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 34)",
        "(line 236,col 9)-(line 236,col 34)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 243,col 9)"
      ]
    }
  ]
}