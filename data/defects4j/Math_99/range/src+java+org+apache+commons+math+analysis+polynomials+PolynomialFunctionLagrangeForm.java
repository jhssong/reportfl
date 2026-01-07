{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/analysis/polynomials/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 306,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Interpolating points (abscissas) and the function values at these points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 71,
      "end_line": 80,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 44)",
        "(line 116,col 9)-(line 116,col 49)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 129,col 49)",
        "(line 130,col 9)-(line 130,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 55)",
        "(line 145,col 9)-(line 145,col 71)",
        "(line 146,col 9)-(line 146,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 164,
      "end_line": 215,
      "comment": "\n     * Evaluate the Lagrange polynomial using \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\n     * \u003cp\u003e\n     * This function is made public static so that users can call it directly\n     * without instantiating PolynomialFunctionLagrangeForm object.\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws DuplicateSampleAbscissaException if the sample has duplicate abscissas\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 168,col 67)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 172,col 9)-(line 172,col 21)",
        "(line 173,col 9)-(line 173,col 26)",
        "(line 174,col 9)-(line 174,col 26)",
        "(line 175,col 9)-(line 175,col 44)",
        "(line 176,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 27)",
        "(line 191,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 226,
      "end_line": 280,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(N^2) time.\n     * \u003cp\u003e\n     * Note this computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @throws ArithmeticException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 20)",
        "(line 228,col 9)-(line 228,col 31)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 231,col 37)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 237,col 9)-(line 237,col 28)",
        "(line 238,col 9)-(line 238,col 19)",
        "(line 239,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 27)",
        "(line 248,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 294,
      "end_line": 305,
      "comment": "\n     * Verifies that the interpolation arrays are valid.\n     * \u003cp\u003e\n     * The interpolating points must be distinct. However it is not\n     * verified here, it is checked in evaluate() and computeCoefficients().\u003c/p\u003e\n     * \n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @throws IllegalArgumentException if not valid\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 304,col 9)"
      ]
    }
  ]
}