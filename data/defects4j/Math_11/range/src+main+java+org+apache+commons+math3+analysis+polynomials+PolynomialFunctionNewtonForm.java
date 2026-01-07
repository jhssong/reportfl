{
  "filepath": "/tmp/Math-11b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction"
      ],
      "begin_line": 38,
      "end_line": 243,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Centers of the Newton polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 31)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 38)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 52)",
        "(line 85,col 9)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     ",
      "child_ranges": [
        "(line 95,col 8)-(line 95,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 102,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)",
        "(line 105,col 9)-(line 105,col 31)",
        "(line 106,col 9)-(line 106,col 103)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 49)",
        "(line 134,col 9)-(line 134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 144,
      "end_line": 148,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the centers array.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 44)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 157,
      "end_line": 164,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 55)",
        "(line 162,col 9)-(line 162,col 71)",
        "(line 163,col 9)-(line 163,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 181,
      "end_line": 191,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 31)",
        "(line 184,col 9)-(line 184,col 31)",
        "(line 185,col 9)-(line 185,col 28)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 197,
      "end_line": 214,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 31)",
        "(line 200,col 9)-(line 200,col 39)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 205,col 9)-(line 205,col 31)",
        "(line 206,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 232,
      "end_line": 241,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\u003c/p\u003e\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     * @see org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 240,col 9)"
      ]
    }
  ]
}