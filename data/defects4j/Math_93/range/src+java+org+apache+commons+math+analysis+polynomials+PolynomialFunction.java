{
  "filepath": "/tmp/Math-93b/src/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 32,
      "end_line": 168,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,  \n     * coefficients[0] is the constant term and coefficients[n] is the \n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 57,
      "end_line": 64,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the length of the array minus 1. \n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     * \n     * @param c polynominal coefficients\n     * @throws NullPointerException if c is null\n     * @throws IllegalArgumentException if c is empty\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 16)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 49)",
        "(line 63,col 9)-(line 63,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     * \n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 78,col 8)-(line 78,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     *  Returns the degree of the polynomial\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     * \n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 55)",
        "(line 101,col 9)-(line 101,col 70)",
        "(line 102,col 9)-(line 102,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 115,
      "end_line": 125,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     * \n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial \n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 36)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 44)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 135,
      "end_line": 148,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     * \n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 36)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 44)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     * \n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     * \n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 38)"
      ]
    }
  ]
}