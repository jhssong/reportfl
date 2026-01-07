{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 290,
      "comment": "\r\n * Implements the representation of a real polynomial function in\r\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\r\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\r\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\r\n * \u003cp\u003e\r\n * The approximated function should be smooth enough for Lagrange polynomial\r\n * to work well. Otherwise, consider using splines instead.\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\r\n     * The coefficients of the polynomial, ordered by degree -- i.e.\r\n     * coefficients[0] is the constant term and coefficients[n] is the \r\n     * coefficient of x^n where n is the degree of the polynomial.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\r\n     * Interpolating points (abscissas) and the function values at these points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\r\n     * Whether the polynomial coefficients are available.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 65,
      "end_line": 74,
      "comment": "\r\n     * Construct a Lagrange polynomial with the given abscissas and function\r\n     * values. The order of interpolating points are not important.\r\n     * \u003cp\u003e\r\n     * The constructor makes copy of the input arrays and assigns them.\r\n     * \r\n     * @param x interpolating points\r\n     * @param y function values at interpolating points\r\n     * @throws IllegalArgumentException if input arrays are not valid\r\n     ",
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
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\r\n     * Calculate the function value at the given point.\r\n     *\r\n     * @param z the point at which the function value is to be computed\r\n     * @return the function value\r\n     * @throws FunctionEvaluationException if a runtime error occurs\r\n     * @see UnivariateRealFunction#value(double)\r\n     ",
      "child_ranges": [
        "(line 85,col 8)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\r\n     * Returns the degree of the polynomial.\r\n     * \r\n     * @return the degree of the polynomial\r\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\r\n     * Returns a copy of the interpolating points array.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of the interpolating points array\r\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 49)",
        "(line 107,col 9)-(line 107,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\r\n     * Returns a copy of the interpolating values array.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of the interpolating values array\r\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 44)",
        "(line 119,col 9)-(line 119,col 49)",
        "(line 120,col 9)-(line 120,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 130,
      "end_line": 137,
      "comment": "\r\n     * Returns a copy of the coefficients array.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of the coefficients array\r\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 55)",
        "(line 135,col 9)-(line 135,col 71)",
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 154,
      "end_line": 207,
      "comment": "\r\n     * Evaluate the Lagrange polynomial using \r\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\r\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\r\n     * \u003cp\u003e\r\n     * This function is made public static so that users can call it directly\r\n     * without instantiating PolynomialFunctionLagrangeForm object.\r\n     *\r\n     * @param x the interpolating points array\r\n     * @param y the interpolating values array\r\n     * @param z the point at which the function value is to be computed\r\n     * @return the function value\r\n     * @throws FunctionEvaluationException if a runtime error occurs\r\n     * @throws IllegalArgumentException if inputs are not valid\r\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 67)",
        "(line 160,col 9)-(line 160,col 39)",
        "(line 162,col 9)-(line 162,col 21)",
        "(line 163,col 9)-(line 163,col 26)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 27)",
        "(line 181,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 218,
      "end_line": 266,
      "comment": "\r\n     * Calculate the coefficients of Lagrange polynomial from the\r\n     * interpolation data. It takes O(N^2) time.\r\n     * \u003cp\u003e\r\n     * Note this computation can be ill-conditioned. Use with caution\r\n     * and only when it is necessary.\r\n     *\r\n     * @throws ArithmeticException if any abscissas coincide\r\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 20)",
        "(line 220,col 9)-(line 220,col 31)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 229,col 9)-(line 229,col 28)",
        "(line 230,col 9)-(line 230,col 19)",
        "(line 231,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 27)",
        "(line 240,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 278,
      "end_line": 289,
      "comment": "\r\n     * Verifies that the interpolation arrays are valid.\r\n     * \u003cp\u003e\r\n     * The interpolating points must be distinct. However it is not\r\n     * verified here, it is checked in evaluate() and computeCoefficients().\r\n     * \r\n     * @throws IllegalArgumentException if not valid\r\n     * @see #evaluate(double[], double[], double)\r\n     * @see #computeCoefficients()\r\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 288,col 9)"
      ]
    }
  ]
}