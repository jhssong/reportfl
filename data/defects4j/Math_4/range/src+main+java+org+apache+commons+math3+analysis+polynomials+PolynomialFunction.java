{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 413,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n * is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Serialization identifier\n     "
    },
    {
      "type": "field",
      "varNames": [
        "coefficients"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 67,
      "end_line": 80,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c Polynomial coefficients.\n     * @throws NullArgumentException if {@code c} is {@code null}.\n     * @throws NoDataException if {@code c} is empty.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 42)",
        "(line 79,col 9)-(line 79,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.value(double)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr/\u003e\n     *  \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x Argument for which the function value should be computed.\n     * @return the value of the polynomial at the given point.\n     * @see UnivariateFunction#value(double)\n     ",
      "child_ranges": [
        "(line 94,col 8)-(line 94,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 128,
      "end_line": 140,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients Coefficients of the polynomial to evaluate.\n     * @param argument Input value.\n     * @return the value of the polynomial.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullArgumentException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 36)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 44)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 148,
      "end_line": 161,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullArgumentException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 45)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 156,col 98)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.add(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 169,
      "end_line": 186,
      "comment": "\n     * Add a polynomial to the instance.\n     *\n     * @param p Polynomial to add.\n     * @return a new polynomial which is the sum of the instance and {@code p}.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 88)",
        "(line 172,col 9)-(line 172,col 88)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 183,col 49)",
        "(line 185,col 9)-(line 185,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.subtract(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 194,
      "end_line": 214,
      "comment": "\n     * Subtract a polynomial from the instance.\n     *\n     * @param p Polynomial to subtract.\n     * @return a new polynomial which is the difference the instance minus {@code p}.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 82)",
        "(line 197,col 9)-(line 197,col 82)",
        "(line 200,col 9)-(line 200,col 58)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * Negate the instance.\n     *\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 67)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math3.analysis.polynomials.PolynomialFunction)",
      "begin_line": 235,
      "end_line": 248,
      "comment": "\n     * Multiply the instance by a polynomial.\n     *\n     * @param p Polynomial to multiply by.\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 95)",
        "(line 238,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 258,
      "end_line": 273,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients Coefficients of the polynomial to differentiate.\n     * @return the coefficients of the derivative or {@code null} if coefficients has length 1.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullArgumentException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 45)",
        "(line 261,col 9)-(line 261,col 36)",
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 44)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Returns the derivative as a {@link PolynomialFunction}.\n     *\n     * @return the derivative polynomial.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the derivative as a {@link UnivariateFunction}.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 308,
      "end_line": 348,
      "comment": "\n     * Returns a string representation of the polynomial.\n     *\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n     *\n     * @return a string representation of the polynomial.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 46)",
        "(line 311,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.toString(double)",
      "begin_line": 356,
      "end_line": 363,
      "comment": "\n     * Creates a string representing a coefficient, removing \".0\" endings.\n     *\n     * @param coeff Coefficient.\n     * @return a string representation of {@code coeff}.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 48)",
        "(line 358,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 366,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 29)",
        "(line 369,col 9)-(line 369,col 23)",
        "(line 370,col 9)-(line 370,col 64)",
        "(line 371,col 9)-(line 371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 375,
      "end_line": 388,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 60)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.ParametricUnivariateFunction"
      ],
      "begin_line": 395,
      "end_line": 412,
      "comment": "\n     * Dedicated parametric polynomial class.\n     *\n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric.gradient(double, double...)",
      "begin_line": 397,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 398,col 13)-(line 398,col 68)",
        "(line 399,col 13)-(line 399,col 28)",
        "(line 400,col 13)-(line 403,col 13)",
        "(line 404,col 13)-(line 404,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialFunction.Parametric.value(double, double...)",
      "begin_line": 408,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 410,col 13)-(line 410,col 62)"
      ]
    }
  ]
}