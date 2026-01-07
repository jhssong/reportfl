{
  "filepath": "/tmp/Math-97b/src/java/org/apache/commons/math/analysis/PolynomialFunctionNewtonForm.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunctionNewtonForm",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 218,
      "comment": "\n * Implements the representation of a real polynomial function in\n * Newton Form. For reference, see \u003cb\u003eElementary Numerical Analysis\u003c/b\u003e,\n * ISBN 0070124477, chapter 2.\n * \u003cp\u003e\n * The formula of polynomial in Newton form is\n *     p(x) \u003d a[0] + a[1](x-c[0]) + a[2](x-c[0])(x-c[1]) + ... +\n *            a[n](x-c[0])(x-c[1])...(x-c[n-1])\n * Note that the length of a[] is one more than the length of c[]\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
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
        "a",
        "c"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Members of c[] are called centers of the Newton polynomial.\n     * When all c[i] \u003d 0, a[] becomes normal polynomial coefficients,\n     * i.e. a[i] \u003d coefficients[i].\n     "
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
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.PolynomialFunctionNewtonForm(double[], double[])",
      "begin_line": 71,
      "end_line": 80,
      "comment": "\n     * Construct a Newton polynomial with the given a[] and c[]. The order of\n     * centers are important in that if c[] shuffle, then values of a[] would\n     * completely change, not just a permutation of old a[].\n     * \u003cp\u003e\n     * The constructor makes copy of the input arrays and assigns them.\u003c/p\u003e\n     * \n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws IllegalArgumentException if input arrays are not valid\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 31)",
        "(line 75,col 9)-(line 75,col 38)",
        "(line 76,col 9)-(line 76,col 38)",
        "(line 77,col 9)-(line 77,col 52)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.value(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Calculate the function value at the given point.\n     *\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 91,col 8)-(line 91,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.degree()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Returns the degree of the polynomial.\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getNewtonCoefficients()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Returns a copy of coefficients in Newton form formula.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of coefficients in Newton form formula\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 49)",
        "(line 113,col 9)-(line 113,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCenters()",
      "begin_line": 123,
      "end_line": 127,
      "comment": "\n     * Returns a copy of the centers array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the centers array\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 49)",
        "(line 126,col 9)-(line 126,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.getCoefficients()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the polynomial.\u003c/p\u003e\n     * \n     * @return a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 55)",
        "(line 141,col 9)-(line 141,col 71)",
        "(line 142,col 9)-(line 142,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.evaluate(double[], double[], double)",
      "begin_line": 157,
      "end_line": 169,
      "comment": "\n     * Evaluate the Newton polynomial using nested multiplication. It is\n     * also called \u003ca href\u003d\"http://mathworld.wolfram.com/HornersRule.html\"\u003e\n     * Horner\u0027s Rule\u003c/a\u003e and takes O(N) time.\n     *\n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @param z the point at which the function value is to be computed\n     * @return the function value\n     * @throws FunctionEvaluationException if a runtime error occurs\n     * @throws IllegalArgumentException if inputs are not valid\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 31)",
        "(line 162,col 9)-(line 162,col 25)",
        "(line 163,col 9)-(line 163,col 28)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.computeCoefficients()",
      "begin_line": 175,
      "end_line": 192,
      "comment": "\n     * Calculate the normal polynomial coefficients given the Newton form.\n     * It also uses nested multiplication but takes O(N^2) time.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 31)",
        "(line 178,col 9)-(line 178,col 39)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm.verifyInputArray(double[], double[])",
      "begin_line": 206,
      "end_line": 217,
      "comment": "\n     * Verifies that the input arrays are valid.\n     * \u003cp\u003e\n     * The centers must be distinct for interpolation purposes, but not\n     * for general use. Thus it is not verified here.\u003c/p\u003e\n     * \n     * @param a the coefficients in Newton form formula\n     * @param c the centers\n     * @throws IllegalArgumentException if not valid\n     * @see DividedDifferenceInterpolator#computeDividedDifference(double[],\n     * double[])\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 216,col 9)"
      ]
    }
  ]
}