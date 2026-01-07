{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 379,
      "comment": "\n * Immutable representation of a real polynomial function with real coefficients.\n * \u003cp\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/HornersMethod.html\"\u003eHorner\u0027s Method\u003c/a\u003e\n * is used to evaluate the function.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * The coefficients of the polynomial, ordered by degree -- i.e.,\n     * coefficients[0] is the constant term and coefficients[n] is the\n     * coefficient of x^n where n is the degree of the polynomial.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.PolynomialFunction(double[])",
      "begin_line": 63,
      "end_line": 74,
      "comment": "\n     * Construct a polynomial with the given coefficients.  The first element\n     * of the coefficients array is the constant term.  Higher degree\n     * coefficients follow in sequence.  The degree of the resulting polynomial\n     * is the index of the last non-null element of the array, or 0 if all elements\n     * are null.\n     * \u003cp\u003e\n     * The constructor makes a copy of the input array and assigns the copy to\n     * the coefficients property.\u003c/p\u003e\n     *\n     * @param c Polynomial coefficients.\n     * @throws NullPointerException if {@code c} is {@code null}.\n     * @throws NoDataException if {@code c} is empty.\n     ",
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
      "comment": "\n     * Compute the value of the function for the given argument.\n     * \u003cp\u003e\n     *  The value returned is \u003cbr/\u003e\n     *  \u003ccode\u003ecoefficients[n] * x^n + ... + coefficients[1] * x  + coefficients[0]\u003c/code\u003e\n     * \u003c/p\u003e\n     *\n     * @param x Argument for which the function value should be computed.\n     * @return the value of the polynomial at the given point.\n     * @see UnivariateRealFunction#value(double)\n     ",
      "child_ranges": [
        "(line 88,col 8)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.degree()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Returns the degree of the polynomial.\n     *\n     * @return the degree of the polynomial.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.getCoefficients()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Returns a copy of the coefficients array.\n     * \u003cp\u003e\n     * Changes made to the returned copy will not affect the coefficients of\n     * the polynomial.\u003c/p\u003e\n     *\n     * @return a fresh copy of the coefficients array.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.evaluate(double[], double)",
      "begin_line": 122,
      "end_line": 132,
      "comment": "\n     * Uses Horner\u0027s Method to evaluate the polynomial with the given coefficients at\n     * the argument.\n     *\n     * @param coefficients Coefficients of the polynomial to evaluate.\n     * @param argument Input value.\n     * @return the value of the polynomial.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullPointerException if {@code coefficients} is {@code null}.\n     ",
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
      "begin_line": 140,
      "end_line": 157,
      "comment": "\n     * Add a polynomial to the instance.\n     *\n     * @param p Polynomial to add.\n     * @return a new polynomial which is the sum of the instance and {@code p}.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 88)",
        "(line 143,col 9)-(line 143,col 88)",
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
      "end_line": 185,
      "comment": "\n     * Subtract a polynomial from the instance.\n     *\n     * @param p Polynomial to subtract.\n     * @return a new polynomial which is the difference the instance minus {@code p}.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 82)",
        "(line 168,col 9)-(line 168,col 82)",
        "(line 171,col 9)-(line 171,col 58)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.negate()",
      "begin_line": 192,
      "end_line": 198,
      "comment": "\n     * Negate the instance.\n     *\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 67)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.multiply(org.apache.commons.math.analysis.polynomials.PolynomialFunction)",
      "begin_line": 206,
      "end_line": 219,
      "comment": "\n     * Multiply the instance by a polynomial.\n     *\n     * @param p Polynomial to multiply by.\n     * @return a new polynomial.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 95)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.differentiate(double[])",
      "begin_line": 229,
      "end_line": 242,
      "comment": "\n     * Returns the coefficients of the derivative of the polynomial with the given coefficients.\n     *\n     * @param coefficients Coefficients of the polynomial to differentiate.\n     * @return the coefficients of the derivative or {@code null} if coefficients has length 1.\n     * @throws NoDataException if {@code coefficients} is empty.\n     * @throws NullPointerException if {@code coefficients} is {@code null}.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 44)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.polynomialDerivative()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the derivative as a {@link PolynomialFunction}.\n     *\n     * @return the derivative polynomial.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.derivative()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Returns the derivative as a {@link UnivariateRealFunction}.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString()",
      "begin_line": 277,
      "end_line": 317,
      "comment": "\n     * Returns a string representation of the polynomial.\n     *\n     * \u003cp\u003eThe representation is user oriented. Terms are displayed lowest\n     * degrees first. The multiplications signs, coefficients equals to\n     * one and null terms are not displayed (except if the polynomial is 0,\n     * in which case the 0 constant term is displayed). Addition of terms\n     * with negative coefficients are replaced by subtraction of terms\n     * with positive coefficients except for the first displayed term\n     * (i.e. we display \u003ccode\u003e-3\u003c/code\u003e for a constant negative polynomial,\n     * but \u003ccode\u003e1 - 3 x + x^2\u003c/code\u003e if the negative coefficient is not\n     * the first one displayed).\u003c/p\u003e\n     *\n     * @return a string representation of the polynomial.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 46)",
        "(line 280,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.toString(double)",
      "begin_line": 325,
      "end_line": 332,
      "comment": "\n     * Creates a string representing a coefficient, removing \".0\" endings.\n     *\n     * @param coeff Coefficient.\n     * @return a string representation of {@code coeff}.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 48)",
        "(line 327,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.hashCode()",
      "begin_line": 335,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 29)",
        "(line 338,col 9)-(line 338,col 23)",
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.equals(java.lang.Object)",
      "begin_line": 344,
      "end_line": 357,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 60)",
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Parametric",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.ParametricUnivariateRealFunction"
      ],
      "begin_line": 362,
      "end_line": 378,
      "comment": "\n     * Dedicated parametric polynomial class.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.Parametric.gradient(double, double[])",
      "begin_line": 364,
      "end_line": 372,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 68)",
        "(line 366,col 13)-(line 366,col 28)",
        "(line 367,col 13)-(line 370,col 13)",
        "(line 371,col 13)-(line 371,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialFunction.Parametric.value(double, double[])",
      "begin_line": 375,
      "end_line": 377,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 376,col 13)-(line 376,col 62)"
      ]
    }
  ]
}