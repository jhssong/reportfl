{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.UnivariateFunction"
      ],
      "begin_line": 39,
      "end_line": 327,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
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
        "x"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Interpolating points (abscissas).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Function values at interpolating points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 72,
      "end_line": 85,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     *\n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws DimensionMismatchException if the array lengths are different.\n     * @throws NumberIsTooSmallException if the number of points is less than 2.\n     * @throws NonMonotonicSequenceException\n     * if two abscissae have the same value.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 37)",
        "(line 80,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 121,col 49)",
        "(line 122,col 9)-(line 122,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 49)",
        "(line 135,col 9)-(line 135,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 148,
      "end_line": 155,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \u003cp\u003e\n     * Note that coefficients computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 55)",
        "(line 153,col 9)-(line 153,col 71)",
        "(line 154,col 9)-(line 154,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 173,
      "end_line": 189,
      "comment": "\n     * Evaluate the Lagrange polynomial using\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(n^2) time.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 51)",
        "(line 181,col 9)-(line 181,col 51)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 50)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 187,col 9)-(line 187,col 51)",
        "(line 188,col 9)-(line 188,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluateInternal(double[], double[], double)",
      "begin_line": 207,
      "end_line": 248,
      "comment": "\n     * Evaluate the Lagrange polynomial using\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(n^2) time.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param z Point at which the function value is to be computed.\n     * @return the function value.\n     * @throws DimensionMismatchException if {@code x} and {@code y} have\n     * different lengths.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is less\n     * than 2.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 24)",
        "(line 209,col 9)-(line 209,col 31)",
        "(line 210,col 9)-(line 210,col 41)",
        "(line 211,col 9)-(line 211,col 41)",
        "(line 212,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 223,col 9)",
        "(line 226,col 9)-(line 226,col 34)",
        "(line 228,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 256,
      "end_line": 296,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(n^2) time.\n     * Note that this computation can be ill-conditioned: Use with caution\n     * and only when it is necessary.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 37)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 264,col 43)",
        "(line 265,col 9)-(line 265,col 19)",
        "(line 266,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[], boolean)",
      "begin_line": 316,
      "end_line": 326,
      "comment": "\n     * Check that the interpolation arrays are valid.\n     * The arrays features checked by this method are that both arrays have the\n     * same length and this length is at least 2.\n     *\n     * @param x Interpolating points array.\n     * @param y Interpolating values array.\n     * @param abort Whether to throw an exception if {@code x} is not sorted.\n     * @throws DimensionMismatchException if the array lengths are different.\n     * @throws NumberIsTooSmallException if the number of points is less than 2.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strictly increasing order and {@code abort}\n     * is {@code true}.\n     * @return {@code false} if the {@code x} is not sorted in increasing order,\n     * {@code true} otherwise.\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 91)"
      ]
    }
  ]
}