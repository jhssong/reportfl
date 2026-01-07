{
  "filepath": "/tmp/Math-20b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 38,
      "end_line": 323,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
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
        "x"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Interpolating points (abscissas).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Function values at interpolating points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 71,
      "end_line": 83,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     *\n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws DimensionMismatchException if the array lengths are different.\n     * @throws NumberIsTooSmallException if the number of points is less than 2.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if two abscissae have the same value.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 52)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 78,col 9)-(line 82,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 120,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 130,
      "end_line": 134,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 49)",
        "(line 133,col 9)-(line 133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 146,
      "end_line": 153,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \u003cp\u003e\n     * Note that coefficients computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 55)",
        "(line 151,col 9)-(line 151,col 71)",
        "(line 152,col 9)-(line 152,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Evaluate the Lagrange polynomial using\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(n^2) time.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 177,col 9)-(line 177,col 51)",
        "(line 178,col 9)-(line 178,col 51)",
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 182,col 9)-(line 182,col 43)",
        "(line 184,col 9)-(line 184,col 51)",
        "(line 185,col 9)-(line 185,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluateInternal(double[], double[], double)",
      "begin_line": 204,
      "end_line": 245,
      "comment": "\n     * Evaluate the Lagrange polynomial using\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(n^2) time.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 24)",
        "(line 206,col 9)-(line 206,col 31)",
        "(line 207,col 9)-(line 207,col 41)",
        "(line 208,col 9)-(line 208,col 41)",
        "(line 209,col 9)-(line 209,col 51)",
        "(line 210,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 34)",
        "(line 225,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 253,
      "end_line": 293,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(n^2) time.\n     * Note that this computation can be ill-conditioned: Use with caution\n     * and only when it is necessary.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 37)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 261,col 43)",
        "(line 262,col 9)-(line 262,col 19)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[], boolean)",
      "begin_line": 313,
      "end_line": 322,
      "comment": "\n     * Check that the interpolation arrays are valid.\n     * The arrays features checked by this method are that both arrays have the\n     * same length and this length is at least 2.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param abort Whether to throw an exception if {@code x} is not sorted.\n     * @throws DimensionMismatchException if the array lengths are different.\n     * @throws NumberIsTooSmallException if the number of points is less than 2.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order and {@code abort}\n     * is {@code true}.\n     * @return {@code false} if the {@code x} is not sorted in increasing order,\n     * {@code true} otherwise.\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 91)"
      ]
    }
  ]
}