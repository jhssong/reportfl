{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 214,
      "comment": "\r\n * Implements the representation of a real polynomial function in\r\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\r\n * ISBN 0070124477, chapter 2.\r\n * \u003cp\u003e\r\n * The formula of polynomial in Newton form is\r\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\r\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\r\n * Note that the length of a[] is one more than the length of c[]\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\r\n     * The coefficients of the polynomial, ordered by degree -- i.e.\r\n     * coefficients[0] is the constant term and coefficients[n] is the \r\n     * coefficient of x^n where n is the degree of the polynomial.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a",
        "c"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\r\n     * Members of c[] are called centers of the Newton polynomial.\r\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\r\n     * i.e. a[i] \u003d coefficients[i].\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficientsComputed"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\r\n     * Whether the polynomial coefficients are available.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 69,
      "end_line": 78,
      "comment": "\r\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\r\n     * centers are important in that if c[] shuffle, then values of a[] would\r\n     * completely change, not just a permutation of old a[].\r\n     * \u003cp\u003e\r\n     * The constructor makes copy of the input arrays and assigns them.\r\n     * \r\n     * @param a the coefficients in Newton form formula\r\n     * @param c the centers\r\n     * @throws IllegalArgumentException if input arrays are not valid\r\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 31)",
        "(line 73,col 9)-(line 73,col 38)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 52)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\r\n     * Calculate the function value at the given point.\r\n     *\r\n     * @param z the point at which the function value is to be computed\r\n     * @return the function value\r\n     * @throws FunctionEvaluationException if a runtime error occurs\r\n     * @see UnivariateRealFunction#value(double)\r\n     ",
      "child_ranges": [
        "(line 89,col 8)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\r\n     * Returns the degree of the polynomial.\r\n     * \r\n     * @return the degree of the polynomial\r\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\r\n     * Returns a copy of coefficients in Newton form formula.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of coefficients in Newton form formula\r\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\r\n     * Returns a copy of the centers array.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of the centers array\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 134,
      "end_line": 141,
      "comment": "\r\n     * Returns a copy of the coefficients array.\r\n     * \u003cp\u003e\r\n     * Changes made to the returned copy will not affect the polynomial.\r\n     * \r\n     * @return a fresh copy of the coefficients array\r\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 55)",
        "(line 139,col 9)-(line 139,col 71)",
        "(line 140,col 9)-(line 140,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "\r\n     * Evaluate the Newton polynomial using nested multiplication. It is\r\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\r\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\r\n     *\r\n     * @param a the coefficients in Newton form formula\r\n     * @param c the centers\r\n     * @param z the point at which the function value is to be computed\r\n     * @return the function value\r\n     * @throws FunctionEvaluationException if a runtime error occurs\r\n     * @throws IllegalArgumentException if inputs are not valid\r\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 31)",
        "(line 160,col 9)-(line 160,col 25)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 173,
      "end_line": 190,
      "comment": "\r\n     * Calculate the normal polynomial coefficients given the Newton form.\r\n     * It also uses nested multiplication but takes O(N^2) time.\r\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 31)",
        "(line 176,col 9)-(line 176,col 39)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 31)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 202,
      "end_line": 213,
      "comment": "\r\n     * Verifies that the input arrays are valid.\r\n     * \u003cp\u003e\r\n     * The centers must be distinct for interpolation purposes, but not\r\n     * for general use. Thus it is not verified here.\r\n     * \r\n     * @throws IllegalArgumentException if not valid\r\n     * @see DividedDifferenceInterpolator#computeDividedDifference(double[],\r\n     * double[])\r\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 212,col 9)"
      ]
    }
  ]
}