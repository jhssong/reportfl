{
  "filepath": "/tmp/Math-85b/src/java/org/apache/commons/math/analysis/polynomials/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 36,
      "end_line": 299,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Interpolating points (abscissas) and the function values at these points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 65,
      "end_line": 74,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 39)",
        "(line 69,col 9)-(line 69,col 38)",
        "(line 70,col 9)-(line 70,col 38)",
        "(line 71,col 9)-(line 71,col 52)",
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 89,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 139,col 71)",
        "(line 140,col 9)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 158,
      "end_line": 209,
      "comment": "\n     * Evaluate the Lagrange polynomial using \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\n     * \u003cp\u003e\n     * This function is made public static so that users can call it directly\n     * without instantiating PolynomialFunctionLagrangeForm object.\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws DuplicateSampleAbscissaException if the sample has duplicate abscissas\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 33)",
        "(line 162,col 9)-(line 162,col 67)",
        "(line 164,col 9)-(line 164,col 39)",
        "(line 166,col 9)-(line 166,col 21)",
        "(line 167,col 9)-(line 167,col 26)",
        "(line 168,col 9)-(line 168,col 26)",
        "(line 169,col 9)-(line 169,col 44)",
        "(line 170,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 183,col 27)",
        "(line 185,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 220,
      "end_line": 272,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(N^2) time.\n     * \u003cp\u003e\n     * Note this computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @throws ArithmeticException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 20)",
        "(line 222,col 9)-(line 222,col 31)",
        "(line 224,col 9)-(line 224,col 25)",
        "(line 225,col 9)-(line 225,col 37)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 231,col 9)-(line 231,col 28)",
        "(line 232,col 9)-(line 232,col 19)",
        "(line 233,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 27)",
        "(line 242,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 286,
      "end_line": 298,
      "comment": "\n     * Verifies that the interpolation arrays are valid.\n     * \u003cp\u003e\n     * The interpolating points must be distinct. However it is not\n     * verified here, it is checked in evaluate() and computeCoefficients().\u003c/p\u003e\n     * \n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @throws IllegalArgumentException if not valid\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 297,col 9)"
      ]
    }
  ]
}