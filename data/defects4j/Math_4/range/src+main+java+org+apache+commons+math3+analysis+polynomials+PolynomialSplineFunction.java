{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/polynomials/PolynomialSplineFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
        "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction"
      ],
      "begin_line": 67,
      "end_line": 232,
      "comment": "\n * Represents a polynomial spline function.\n * \u003cp\u003e\n * A \u003cstrong\u003epolynomial spline function\u003c/strong\u003e consists of a set of\n * \u003ci\u003einterpolating polynomials\u003c/i\u003e and an ascending array of domain\n * \u003ci\u003eknot points\u003c/i\u003e, determining the intervals over which the spline function\n * is defined by the constituent polynomials.  The polynomials are assumed to\n * have been computed to match the values of another function at the knot\n * points.  The value consistency constraints are not currently enforced by\n * \u003ccode\u003ePolynomialSplineFunction\u003c/code\u003e itself, but are assumed to hold among\n * the polynomials and knot points passed to the constructor.\u003c/p\u003e\n * \u003cp\u003e\n * N.B.:  The polynomials in the \u003ccode\u003epolynomials\u003c/code\u003e property must be\n * centered on the knot points to compute the spline function values.\n * See below.\u003c/p\u003e\n * \u003cp\u003e\n * The domain of the polynomial spline function is\n * \u003ccode\u003e[smallest knot, largest knot]\u003c/code\u003e.  Attempts to evaluate the\n * function at values outside of this range generate IllegalArgumentExceptions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The value of the polynomial spline function for an argument \u003ccode\u003ex\u003c/code\u003e\n * is computed as follows:\n * \u003col\u003e\n * \u003cli\u003eThe knot array is searched to find the segment to which \u003ccode\u003ex\u003c/code\u003e\n * belongs.  If \u003ccode\u003ex\u003c/code\u003e is less than the smallest knot point or greater\n * than the largest one, an \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * is thrown.\u003c/li\u003e\n * \u003cli\u003e Let \u003ccode\u003ej\u003c/code\u003e be the index of the largest knot point that is less\n * than or equal to \u003ccode\u003ex\u003c/code\u003e.  The value returned is \u003cbr\u003e\n * \u003ccode\u003epolynomials[j](x - knot[j])\u003c/code\u003e\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Spline segment interval delimiters (knots).\n     * Size is n + 1 for n segments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The polynomial functions that make up the spline.  The first element\n     * determines the value of the spline over the first subinterval, the\n     * second over the second, etc.   Spline function values are determined by\n     * evaluating these functions at {@code (x - knot[i])} where i is the\n     * knot segment to which x belongs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Number of spline segments. It is equal to the number of polynomials and\n     * to the number of partition points - 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.PolynomialSplineFunction(double[], org.apache.commons.math3.analysis.polynomials.PolynomialFunction[])",
      "begin_line": 102,
      "end_line": 123,
      "comment": "\n     * Construct a polynomial spline function with the given segment delimiters\n     * and interpolating polynomials.\n     * The constructor copies both arrays and assigns the copies to the knots\n     * and polynomials properties, respectively.\n     *\n     * @param knots Spline segment interval delimiters.\n     * @param polynomials Polynomial functions that make up the spline.\n     * @throws NullArgumentException if either of the input arrays is {@code null}.\n     * @throws NumberIsTooSmallException if knots has length less than 2.\n     * @throws DimensionMismatchException if {@code polynomials.length !\u003d knots.length - 1}.\n     * @throws NonMonotonicSequenceException if the {@code knots} array is not strictly increasing.\n     *\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 37)",
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 119,col 39)",
        "(line 120,col 9)-(line 120,col 57)",
        "(line 121,col 9)-(line 121,col 53)",
        "(line 122,col 9)-(line 122,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.value(double)",
      "begin_line": 136,
      "end_line": 151,
      "comment": "\n     * Compute the value for the function.\n     * See {@link PolynomialSplineFunction} for details on the algorithm for\n     * computing the value of the function.\n     *\n     * @param v Point for which the function value should be computed.\n     * @return the value.\n     * @throws OutOfRangeException if {@code v} is outside of the domain of the\n     * spline function (smaller than the smallest knot point or larger than the\n     * largest knot point).\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 46)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.derivative()",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Get the derivative of the polynomial spline function.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.polynomialSplineDerivative()",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Get the derivative of the polynomial spline function.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 79)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 179,
      "end_line": 195,
      "comment": " {@inheritDoc}\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 39)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 47)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.getN()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * Get the number of spline segments.\n     * It is also the number of polynomials and the number of knot points - 1.\n     *\n     * @return the number of spline segments.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.getPolynomials()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "\n     * Get a copy of the interpolating polynomials array.\n     * It returns a fresh copy of the array. Changes made to the copy will\n     * not affect the polynomials property.\n     *\n     * @return the interpolating polynomials.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 59)",
        "(line 216,col 9)-(line 216,col 50)",
        "(line 217,col 9)-(line 217,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction.getKnots()",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Get an array copy of the knot points.\n     * It returns a fresh copy of the array. Changes made to the copy\n     * will not affect the knots property.\n     *\n     * @return the knot points.\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 41)",
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 230,col 19)"
      ]
    }
  ]
}