{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 350,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Serialization identifier\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 64,
      "end_line": 75,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c polynomial coefficients\n     * @throws NullPointerException if c is null\n     * @throws NoDataException if c is empty\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 25)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 42)",
        "(line 74,col 9)-(line 74,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 89,col 8)-(line 89,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     *  Returns the degree of the polynomial\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 124,
      "end_line": 134,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial\n     * @throws NoDataException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 36)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 44)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 141,
      "end_line": 160,
      "comment": "\n     * Add a polynomial to the instance.\n     * @param p polynomial to add\n     * @return a new polynomial which is the sum of the instance and p\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 88)",
        "(line 145,col 9)-(line 145,col 88)",
        "(line 148,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 156,col 49)",
        "(line 158,col 9)-(line 158,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 167,
      "end_line": 189,
      "comment": "\n     * Subtract a polynomial from the instance.\n     * @param p polynomial to subtract\n     * @return a new polynomial which is the difference the instance minus p\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 82)",
        "(line 171,col 9)-(line 171,col 82)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\n     * Negate the instance.\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 67)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 200,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 208,
      "end_line": 223,
      "comment": "\n     * Multiply the instance by a polynomial.\n     * @param p polynomial to multiply by\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 95)",
        "(line 212,col 9)-(line 219,col 9)",
        "(line 221,col 9)-(line 221,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 233,
      "end_line": 246,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws NoDataException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 36)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     *\n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     *\n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 281,
      "end_line": 326,
      "comment": " Returns a string representation of the polynomial.\n\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n\n     * @return a string representation of the polynomial\n\n     ",
      "child_ranges": [
        "(line 284,col 8)-(line 284,col 43)",
        "(line 285,col 8)-(line 291,col 8)",
        "(line 293,col 8)-(line 322,col 8)",
        "(line 324,col 8)-(line 324,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 329,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 29)",
        "(line 332,col 9)-(line 332,col 23)",
        "(line 333,col 9)-(line 333,col 64)",
        "(line 334,col 9)-(line 334,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 338,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 341,col 24)",
        "(line 342,col 9)-(line 343,col 25)",
        "(line 344,col 9)-(line 344,col 60)",
        "(line 345,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    }
  ]
}