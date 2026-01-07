{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
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
      "end_line": 321,
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
      "begin_line": 58,
      "end_line": 69,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null. \n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     * \n     * @param c polynomial coefficients\n     * @throws NullPointerException if c is null\n     * @throws IllegalArgumentException if c is empty\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 63,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 42)",
        "(line 68,col 9)-(line 68,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     * \n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 83,col 8)-(line 83,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     *  Returns the degree of the polynomial\n     * \n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     * \n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 118,
      "end_line": 128,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     * \n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial \n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 36)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 44)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 135,
      "end_line": 154,
      "comment": "\n     * Add a polynomial to the instance.\n     * @param p polynomial to add\n     * @return a new polynomial which is the sum of the instance and p\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 84)",
        "(line 139,col 9)-(line 139,col 84)",
        "(line 142,col 9)-(line 142,col 58)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 150,col 49)",
        "(line 152,col 9)-(line 152,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 161,
      "end_line": 183,
      "comment": "\n     * Subtract a polynomial from the instance.\n     * @param p polynomial to subtract\n     * @return a new polynomial which is the difference the instance minus p\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 78)",
        "(line 165,col 9)-(line 165,col 78)",
        "(line 168,col 9)-(line 168,col 58)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Negate the instance.\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 67)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 202,
      "end_line": 217,
      "comment": "\n     * Multiply the instance by a polynomial.\n     * @param p polynomial to multiply by\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 95)",
        "(line 206,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 227,
      "end_line": 240,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     * \n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 36)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     * \n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     * \n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 275,
      "end_line": 319,
      "comment": " Returns a string representation of the polynomial.\n\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n\n     * @return a string representation of the polynomial\n\n     ",
      "child_ranges": [
        "(line 277,col 8)-(line 277,col 43)",
        "(line 278,col 8)-(line 284,col 8)",
        "(line 286,col 8)-(line 315,col 8)",
        "(line 317,col 8)-(line 317,col 27)"
      ]
    }
  ]
}