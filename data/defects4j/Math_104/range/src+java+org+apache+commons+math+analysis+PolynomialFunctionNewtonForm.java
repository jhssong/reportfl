{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/analysis/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 215,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.\n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a",
        "c"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Members of c[] are called centers of the Newton polynomial.\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
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
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 70,
      "end_line": 79,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\n     * \n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 31)",
        "(line 74,col 9)-(line 74,col 38)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 90,col 8)-(line 90,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 44)",
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of the centers array\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 124,col 49)",
        "(line 125,col 9)-(line 125,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 135,
      "end_line": 142,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 55)",
        "(line 140,col 9)-(line 140,col 71)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 156,
      "end_line": 168,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 31)",
        "(line 161,col 9)-(line 161,col 25)",
        "(line 162,col 9)-(line 162,col 28)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 174,
      "end_line": 191,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 31)",
        "(line 177,col 9)-(line 177,col 39)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 203,
      "end_line": 214,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\n     * \n     * @throws IllegalArgumentException if not valid\n     * @see DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 213,col 9)"
      ]
    }
  ]
}