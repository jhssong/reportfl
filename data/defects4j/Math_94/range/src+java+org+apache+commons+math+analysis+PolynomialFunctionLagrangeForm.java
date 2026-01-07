{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 305,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Interpolating points (abscissas) and the function values at these points.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Whether the polynomial coefficients are available.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 70,
      "end_line": 79,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 113,
      "end_line": 117,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 44)",
        "(line 115,col 9)-(line 115,col 49)",
        "(line 116,col 9)-(line 116,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 49)",
        "(line 129,col 9)-(line 129,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 139,
      "end_line": 146,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 71)",
        "(line 145,col 9)-(line 145,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 163,
      "end_line": 214,
      "comment": "\n     * Evaluate the Lagrange polynomial using \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\n     * \u003cp\u003e\n     * This function is made public static so that users can call it directly\n     * without instantiating PolynomialFunctionLagrangeForm object.\u003c/p\u003e\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws DuplicateSampleAbscissaException if the sample has duplicate abscissas\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 33)",
        "(line 167,col 9)-(line 167,col 67)",
        "(line 169,col 9)-(line 169,col 39)",
        "(line 171,col 9)-(line 171,col 21)",
        "(line 172,col 9)-(line 172,col 26)",
        "(line 173,col 9)-(line 173,col 26)",
        "(line 174,col 9)-(line 174,col 44)",
        "(line 175,col 9)-(line 185,col 9)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 190,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 225,
      "end_line": 279,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(N^2) time.\n     * \u003cp\u003e\n     * Note this computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\u003c/p\u003e\n     *\n     * @throws ArithmeticException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 31)",
        "(line 229,col 9)-(line 229,col 25)",
        "(line 230,col 9)-(line 230,col 37)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 237,col 19)",
        "(line 238,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 27)",
        "(line 247,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 293,
      "end_line": 304,
      "comment": "\n     * Verifies that the interpolation arrays are valid.\n     * \u003cp\u003e\n     * The interpolating points must be distinct. However it is not\n     * verified here, it is checked in evaluate() and computeCoefficients().\u003c/p\u003e\n     * \n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @throws IllegalArgumentException if not valid\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 303,col 9)"
      ]
    }
  ]
}