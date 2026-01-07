{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/analysis/PolynomialFunctionLagrangeForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionLagrangeForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 295,
      "comment": "\n * Implements the representation of a real polynomial function in\n * \u003ca href\u003d\"http://mathworld.wolfram.com/LagrangeInterpolatingPolynomial.html\"\u003e\n * Lagrange Form\u003c/a\u003e. For reference, see \u003cb\u003eIntroduction to Numerical\n * Analysis\u003c/b\u003e, ISBN 038795452X, chapter 2.\n * \u003cp\u003e\n * The approximated function should be smooth enough for Lagrange polynomial\n * to work well. Otherwise, consider using splines instead.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "x",
        "y"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Interpolating points (abscissas) and the function values at these points.\n     "
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
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.PolynomialFunctionLagrangeForm(double[], double[])",
      "begin_line": 68,
      "end_line": 77,
      "comment": "\n     * Construct a Lagrange polynomial with the given abscissas and function\n     * values. The order of interpolating points are not important.\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\n     * \n     * @param x interpolating points\n     * @param y function values at interpolating points\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 39)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 52)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.value(double)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.degree()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingPoints()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Returns a copy of the interpolating points array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of the interpolating points array\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getInterpolatingValues()",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Returns a copy of the interpolating values array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of the interpolating values array\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 49)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.getCoefficients()",
      "begin_line": 137,
      "end_line": 144,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 55)",
        "(line 142,col 9)-(line 142,col 71)",
        "(line 143,col 9)-(line 143,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.evaluate(double[], double[], double)",
      "begin_line": 161,
      "end_line": 212,
      "comment": "\n     * Evaluate the Lagrange polynomial using \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NevillesAlgorithm.html\"\u003e\n     * Neville\u0027s Algorithm\u003c/a\u003e. It takes O(N^2) time.\n     * \u003cp\u003e\n     * This function is made public static so that users can call it directly\n     * without instantiating PolynomialFunctionLagrangeForm object.\n     *\n     * @param x the interpolating points array\n     * @param y the interpolating values array\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws DuplicateSampleAbscissaException if the sample has duplicate abscissas\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 165,col 67)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 169,col 9)-(line 169,col 21)",
        "(line 170,col 9)-(line 170,col 26)",
        "(line 171,col 9)-(line 171,col 26)",
        "(line 172,col 9)-(line 172,col 44)",
        "(line 173,col 9)-(line 183,col 9)",
        "(line 186,col 9)-(line 186,col 27)",
        "(line 188,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.computeCoefficients()",
      "begin_line": 223,
      "end_line": 271,
      "comment": "\n     * Calculate the coefficients of Lagrange polynomial from the\n     * interpolation data. It takes O(N^2) time.\n     * \u003cp\u003e\n     * Note this computation can be ill-conditioned. Use with caution\n     * and only when it is necessary.\n     *\n     * @throws ArithmeticException if any abscissas coincide\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 20)",
        "(line 225,col 9)-(line 225,col 31)",
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 234,col 28)",
        "(line 235,col 9)-(line 235,col 19)",
        "(line 236,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 27)",
        "(line 245,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 270,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm.verifyInterpolationArray(double[], double[])",
      "begin_line": 283,
      "end_line": 294,
      "comment": "\n     * Verifies that the interpolation arrays are valid.\n     * \u003cp\u003e\n     * The interpolating points must be distinct. However it is not\n     * verified here, it is checked in evaluate() and computeCoefficients().\n     * \n     * @throws IllegalArgumentException if not valid\n     * @see #evaluate(double[], double[], double)\n     * @see #computeCoefficients()\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 293,col 9)"
      ]
    }
  ]
}