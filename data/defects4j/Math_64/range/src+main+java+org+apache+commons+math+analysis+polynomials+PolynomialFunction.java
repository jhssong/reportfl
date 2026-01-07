{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 35,
      "end_line": 349,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Serialization identifier\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 63,
      "end_line": 74,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c polynomial coefficients\n     * @throws NullPointerException if c is null\n     * @throws NoDataException if c is empty\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 25)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 73,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 88,col 8)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     *  Returns the degree of the polynomial\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 123,
      "end_line": 133,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial\n     * @throws NoDataException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 36)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 44)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 140,
      "end_line": 159,
      "comment": "\n     * Add a polynomial to the instance.\n     * @param p polynomial to add\n     * @return a new polynomial which is the sum of the instance and p\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 84)",
        "(line 144,col 9)-(line 144,col 84)",
        "(line 147,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 155,col 49)",
        "(line 157,col 9)-(line 157,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 166,
      "end_line": 188,
      "comment": "\n     * Subtract a polynomial from the instance.\n     * @param p polynomial to subtract\n     * @return a new polynomial which is the difference the instance minus p\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 78)",
        "(line 170,col 9)-(line 170,col 78)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 194,
      "end_line": 200,
      "comment": "\n     * Negate the instance.\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 67)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 207,
      "end_line": 222,
      "comment": "\n     * Multiply the instance by a polynomial.\n     * @param p polynomial to multiply by\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 95)",
        "(line 211,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 232,
      "end_line": 245,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws NoDataException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     *\n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     *\n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 280,
      "end_line": 325,
      "comment": " Returns a string representation of the polynomial.\n\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n\n     * @return a string representation of the polynomial\n\n     ",
      "child_ranges": [
        "(line 283,col 8)-(line 283,col 43)",
        "(line 284,col 8)-(line 290,col 8)",
        "(line 292,col 8)-(line 321,col 8)",
        "(line 323,col 8)-(line 323,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 328,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 29)",
        "(line 331,col 9)-(line 331,col 23)",
        "(line 332,col 9)-(line 332,col 64)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 337,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 339,col 9)-(line 340,col 24)",
        "(line 341,col 9)-(line 342,col 25)",
        "(line 343,col 9)-(line 343,col 60)",
        "(line 344,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    }
  ]
}