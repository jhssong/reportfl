{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 34,
      "end_line": 350,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Serializtion identifier\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 62,
      "end_line": 73,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c polynomial coefficients\n     * @throws NullPointerException if c is null\n     * @throws IllegalArgumentException if c is empty\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 16)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 25)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 72,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 87,col 8)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     *  Returns the degree of the polynomial\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 36)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 139,
      "end_line": 158,
      "comment": "\n     * Add a polynomial to the instance.\n     * @param p polynomial to add\n     * @return a new polynomial which is the sum of the instance and p\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 84)",
        "(line 143,col 9)-(line 143,col 84)",
        "(line 146,col 9)-(line 146,col 58)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 154,col 49)",
        "(line 156,col 9)-(line 156,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 165,
      "end_line": 187,
      "comment": "\n     * Subtract a polynomial from the instance.\n     * @param p polynomial to subtract\n     * @return a new polynomial which is the difference the instance minus p\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 78)",
        "(line 169,col 9)-(line 169,col 78)",
        "(line 172,col 9)-(line 172,col 58)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 193,
      "end_line": 199,
      "comment": "\n     * Negate the instance.\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 67)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 206,
      "end_line": 221,
      "comment": "\n     * Multiply the instance by a polynomial.\n     * @param p polynomial to multiply by\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 95)",
        "(line 210,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 231,
      "end_line": 244,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 36)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     *\n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     *\n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 279,
      "end_line": 324,
      "comment": " Returns a string representation of the polynomial.\n\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n\n     * @return a string representation of the polynomial\n\n     ",
      "child_ranges": [
        "(line 282,col 8)-(line 282,col 43)",
        "(line 283,col 8)-(line 289,col 8)",
        "(line 291,col 8)-(line 320,col 8)",
        "(line 322,col 8)-(line 322,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 327,
      "end_line": 333,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 29)",
        "(line 330,col 9)-(line 330,col 23)",
        "(line 331,col 9)-(line 331,col 64)",
        "(line 332,col 9)-(line 332,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 336,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 341,col 25)",
        "(line 342,col 9)-(line 343,col 25)",
        "(line 344,col 9)-(line 344,col 60)",
        "(line 345,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    }
  ]
}