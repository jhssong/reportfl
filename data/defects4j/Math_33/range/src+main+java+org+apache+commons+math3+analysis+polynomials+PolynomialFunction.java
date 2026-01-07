{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 389,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n * is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Id$\n "
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
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 65,
      "end_line": 78,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c Polynomial coefficients.\n     * @throws NullArgumentException if {@code c} is {@code null}.\n     * @throws NoDataException if {@code c} is empty.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 42)",
        "(line 77,col 9)-(line 77,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr/\u003e\n     *  \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x Argument for which the function value should be computed.\n     * @return the value of the polynomial at the given point.\n     * @see UnivariateFunction#value(double)\n     ",
      "child_ranges": [
        "(line 92,col 8)-(line 92,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 126,
      "end_line": 138,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients Coefficients of the polynomial to evaluate.\n     * @param argument Input value.\n     * @return the value of the polynomial.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullArgumentException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 45)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 146,
      "end_line": 163,
      "comment": "\n     * Add a polynomial to the instance.\n     *\n     * @param p Polynomial to add.\n     * @return a new polynomial which is the sum of the instance and {@code p}.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 88)",
        "(line 149,col 9)-(line 149,col 88)",
        "(line 152,col 9)-(line 152,col 58)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 160,col 49)",
        "(line 162,col 9)-(line 162,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 171,
      "end_line": 191,
      "comment": "\n     * Subtract a polynomial from the instance.\n     *\n     * @param p Polynomial to subtract.\n     * @return a new polynomial which is the difference the instance minus {@code p}.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 82)",
        "(line 174,col 9)-(line 174,col 82)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 190,col 9)-(line 190,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 198,
      "end_line": 204,
      "comment": "\n     * Negate the instance.\n     *\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 67)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 212,
      "end_line": 225,
      "comment": "\n     * Multiply the instance by a polynomial.\n     *\n     * @param p Polynomial to multiply by.\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 95)",
        "(line 215,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 235,
      "end_line": 250,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients Coefficients of the polynomial to differentiate.\n     * @return the coefficients of the derivative or {@code null} if coefficients has length 1.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullArgumentException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Returns the derivative as a {@link PolynomialFunction}.\n     *\n     * @return the derivative polynomial.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the derivative as a {@link UnivariateFunction}.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 285,
      "end_line": 325,
      "comment": "\n     * Returns a string representation of the polynomial.\n     *\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n     *\n     * @return a string representation of the polynomial.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 46)",
        "(line 288,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString(double)",
      "begin_line": 333,
      "end_line": 340,
      "comment": "\n     * Creates a string representing a coefficient, removing \".0\" endings.\n     *\n     * @param coeff Coefficient.\n     * @return a string representation of {@code coeff}.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 48)",
        "(line 335,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 343,
      "end_line": 349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 29)",
        "(line 346,col 9)-(line 346,col 23)",
        "(line 347,col 9)-(line 347,col 64)",
        "(line 348,col 9)-(line 348,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 352,
      "end_line": 365,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 372,
      "end_line": 388,
      "comment": "\n     * Dedicated parametric polynomial class.\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric.gradient(double, double...)",
      "begin_line": 374,
      "end_line": 382,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 13)-(line 375,col 68)",
        "(line 376,col 13)-(line 376,col 28)",
        "(line 377,col 13)-(line 380,col 13)",
        "(line 381,col 13)-(line 381,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric.value(double, double...)",
      "begin_line": 385,
      "end_line": 387,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 13)-(line 386,col 62)"
      ]
    }
  ]
}