{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/analysis/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 298,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Interpolating points (abscissas) and the function values at these points.\n     "
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
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 69,
      "end_line": 78,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 112,
      "end_line": 116,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 44)",
        "(line 127,col 9)-(line 127,col 49)",
        "(line 128,col 9)-(line 128,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 55)",
        "(line 143,col 9)-(line 143,col 71)",
        "(line 144,col 9)-(line 144,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 162,
      "end_line": 213,
      "comment": "\n     * Evaluate the Lagrange polynomial using \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\n     * \u003cp\u003e\n     * This function is made public static so that users can call it directly\n     * without instantiating PolynomialFunctionLagrangeForm object.\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws DuplicateSampleAbscissaException if the sample has duplicate abscissas\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 33)",
        "(line 166,col 9)-(line 166,col 67)",
        "(line 168,col 9)-(line 168,col 39)",
        "(line 170,col 9)-(line 170,col 21)",
        "(line 171,col 9)-(line 171,col 26)",
        "(line 172,col 9)-(line 172,col 26)",
        "(line 173,col 9)-(line 173,col 44)",
        "(line 174,col 9)-(line 184,col 9)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 189,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 224,
      "end_line": 272,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(N^2) time.\n     * \u003cp\u003e\n     * Note this computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @throws ArithmeticException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 20)",
        "(line 226,col 9)-(line 226,col 31)",
        "(line 228,col 9)-(line 228,col 25)",
        "(line 229,col 9)-(line 229,col 37)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 19)",
        "(line 237,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 27)",
        "(line 246,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 286,
      "end_line": 297,
      "comment": "\n     * Verifies that the interpolation arrays are valid.\n     * \u003cp\u003e\n     * The interpolating points must be distinct. However it is not\n     * verified here, it is checked in evaluate() and computeCoefficients().\u003c/p\u003e\n     * \n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @throws IllegalArgumentException if not valid\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 296,col 9)"
      ]
    }
  ]
}