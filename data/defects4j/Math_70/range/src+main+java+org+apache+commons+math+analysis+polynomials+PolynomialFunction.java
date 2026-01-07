{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
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
      "end_line": 352,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n *  is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ARRAY_MESSAGE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " Message for empty coefficients array. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Serialization identifier\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 66,
      "end_line": 77,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c polynomial coefficients\n     * @throws NullPointerException if c is null\n     * @throws IllegalArgumentException if c is empty\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 42)",
        "(line 76,col 9)-(line 76,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr\u003e\n     *   \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x the argument for which the function value should be computed\n     * @return the value of the polynomial at the given point\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 91,col 8)-(line 91,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     *  Returns the degree of the polynomial\n     *\n     * @return the degree of the polynomial\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return  a fresh copy of the coefficients array\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 126,
      "end_line": 136,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients  the coefficients of the polynomial to evaluate\n     * @param argument  the input value\n     * @return  the value of the polynomial\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 143,
      "end_line": 162,
      "comment": "\n     * Add a polynomial to the instance.\n     * @param p polynomial to add\n     * @return a new polynomial which is the sum of the instance and p\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 84)",
        "(line 147,col 9)-(line 147,col 84)",
        "(line 150,col 9)-(line 150,col 58)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 158,col 49)",
        "(line 160,col 9)-(line 160,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 169,
      "end_line": 191,
      "comment": "\n     * Subtract a polynomial from the instance.\n     * @param p polynomial to subtract\n     * @return a new polynomial which is the difference the instance minus p\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 78)",
        "(line 173,col 9)-(line 173,col 78)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * Negate the instance.\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 67)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 210,
      "end_line": 225,
      "comment": "\n     * Multiply the instance by a polynomial.\n     * @param p polynomial to multiply by\n     * @return a new polynomial\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 95)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 235,
      "end_line": 248,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients  the coefficients of the polynomial to differentiate\n     * @return the coefficients of the derivative or null if coefficients has length 1.\n     * @throws IllegalArgumentException if coefficients is empty\n     * @throws NullPointerException if coefficients is null\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 36)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns the derivative as a PolynomialRealFunction\n     *\n     * @return  the derivative polynomial\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns the derivative as a UnivariateRealFunction\n     *\n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 283,
      "end_line": 328,
      "comment": " Returns a string representation of the polynomial.\n\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n\n     * @return a string representation of the polynomial\n\n     ",
      "child_ranges": [
        "(line 286,col 8)-(line 286,col 43)",
        "(line 287,col 8)-(line 293,col 8)",
        "(line 295,col 8)-(line 324,col 8)",
        "(line 326,col 8)-(line 326,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 331,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 29)",
        "(line 334,col 9)-(line 334,col 23)",
        "(line 335,col 9)-(line 335,col 64)",
        "(line 336,col 9)-(line 336,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 340,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 342,col 9)-(line 343,col 24)",
        "(line 344,col 9)-(line 345,col 25)",
        "(line 346,col 9)-(line 346,col 60)",
        "(line 347,col 9)-(line 348,col 25)",
        "(line 349,col 9)-(line 349,col 20)"
      ]
    }
  ]
}