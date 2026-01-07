{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/analysis/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 164,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.   \n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,  \n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the length of the array minus 1. \n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     *  the coefficients property.\n     * \n     * @param c polynominal coefficients\n     * @throws NullPointerException if c is null\n     * @throws IllegalArgumentException if c is empty\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 16)",
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 49)",
        "(line 60,col 9)-(line 60,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.value(double)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     *\n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 74,col 8)-(line 74,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.degree()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     *  Returns the degree of the polynomial\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.getCoefficients()",
      "begin_line": 95,
      "end_line": 99,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\n     * \n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 55)",
        "(line 97,col 9)-(line 97,col 70)",
        "(line 98,col 9)-(line 98,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 111,
      "end_line": 121,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     * \n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial \n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 36)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 44)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.differentiate(double[])",
      "begin_line": 131,
      "end_line": 144,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     * \n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 36)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 44)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.polynomialDerivative()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     * \n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialFunction.derivative()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     * \n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 38)"
      ]
    }
  ]
}