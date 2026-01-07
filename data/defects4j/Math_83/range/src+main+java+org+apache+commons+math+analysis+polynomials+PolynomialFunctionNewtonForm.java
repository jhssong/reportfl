{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction"
      ],
      "begin_line": 37,
      "end_line": 217,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a",
        "c"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Members of c[] are called centers of the Newton polynomial.\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 69,
      "end_line": 78,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 89,col 8)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 108,
      "end_line": 112,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 49)",
        "(line 111,col 9)-(line 111,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the centers array\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 49)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.getCoefficients()",
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 155,
      "end_line": 167,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 173,
      "end_line": 190,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
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
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 204,
      "end_line": 216,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\u003c/p\u003e\n     * \n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws IllegalArgumentException if not valid\n     * @see DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 215,col 9)"
      ]
    }
  ]
}