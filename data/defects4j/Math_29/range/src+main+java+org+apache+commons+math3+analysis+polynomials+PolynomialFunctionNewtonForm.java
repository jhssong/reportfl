{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 37,
      "end_line": 224,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Centers of the Newton polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 77,
      "end_line": 85,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 31)",
        "(line 80,col 9)-(line 80,col 38)",
        "(line 81,col 9)-(line 81,col 38)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     ",
      "child_ranges": [
        "(line 94,col 8)-(line 94,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 44)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the centers array.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 71)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 163,
      "end_line": 173,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a Coefficients in Newton form formula.\n     * @param c Centers.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 31)",
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 28)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 179,
      "end_line": 196,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 31)",
        "(line 182,col 9)-(line 182,col 39)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\u003c/p\u003e\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * any argument is {@code null}.\n     * @throws NoDataException if any array has zero length.\n     * @throws DimensionMismatchException if the size difference between\n     * {@code a} and {@code c} is not equal to 1.\n     * @see org.apache.commons.math3.analysis.interpolation.DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 222,col 9)"
      ]
    }
  ]
}