{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/analysis/polynomials/PolynomialSplineFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction"
      ],
      "begin_line": 64,
      "end_line": 206,
      "comment": "\n * Represents a polynomial spline function.\n * \u003cp\u003e\n * A \u003cstrong\u003epolynomial spline function\u003c/strong\u003e consists of a set of\n * \u003ci\u003einterpolating polynomials\u003c/i\u003e and an ascending array of domain\n * \u003ci\u003eknot points\u003c/i\u003e, determining the intervals over which the spline function\n * is defined by the constituent polynomials.  The polynomials are assumed to\n * have been computed to match the values of another function at the knot\n * points.  The value consistency constraints are not currently enforced by\n * \u003ccode\u003ePolynomialSplineFunction\u003c/code\u003e itself, but are assumed to hold among\n * the polynomials and knot points passed to the constructor.\u003c/p\u003e\n * \u003cp\u003e\n * N.B.:  The polynomials in the \u003ccode\u003epolynomials\u003c/code\u003e property must be\n * centered on the knot points to compute the spline function values.\n * See below.\u003c/p\u003e\n * \u003cp\u003e\n * The domain of the polynomial spline function is\n * \u003ccode\u003e[smallest knot, largest knot]\u003c/code\u003e.  Attempts to evaluate the\n * function at values outside of this range generate IllegalArgumentExceptions.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The value of the polynomial spline function for an argument \u003ccode\u003ex\u003c/code\u003e\n * is computed as follows:\n * \u003col\u003e\n * \u003cli\u003eThe knot array is searched to find the segment to which \u003ccode\u003ex\u003c/code\u003e\n * belongs.  If \u003ccode\u003ex\u003c/code\u003e is less than the smallest knot point or greater\n * than the largest one, an \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * is thrown.\u003c/li\u003e\n * \u003cli\u003e Let \u003ccode\u003ej\u003c/code\u003e be the index of the largest knot point that is less\n * than or equal to \u003ccode\u003ex\u003c/code\u003e.  The value returned is \u003cbr\u003e\n * \u003ccode\u003epolynomials[j](x - knot[j])\u003c/code\u003e\u003c/li\u003e\u003c/ol\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Spline segment interval delimiters (knots).\n     * Size is n + 1 for n segments.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * The polynomial functions that make up the spline.  The first element\n     * determines the value of the spline over the first subinterval, the\n     * second over the second, etc.   Spline function values are determined by\n     * evaluating these functions at {@code (x - knot[i])} where i is the\n     * knot segment to which x belongs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Number of spline segments. It is equal to the number of polynomials and\n     * to the number of partition points - 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.PolynomialSplineFunction(double[], org.apache.commons.math.analysis.polynomials.PolynomialFunction[])",
      "begin_line": 100,
      "end_line": 119,
      "comment": "\n     * Construct a polynomial spline function with the given segment delimiters\n     * and interpolating polynomials.\n     * The constructor copies both arrays and assigns the copies to the knots\n     * and polynomials properties, respectively.\n     *\n     * @param knots Spline segment interval delimiters.\n     * @param polynomials Polynomial functions that make up the spline.\n     * @throws NullArgumentException if either of the input arrays is {@code null}.\n     * @throws NumberIsTooSmallException if knots has length less than 2.\n     * @throws DimensionMismatchException if {@code polynomials.length !\u003d knots.length - 1}.\n     * @throws org.apache.commons.math.exception.NonMonotonicSequenceException if\n     * the {@code knots} array is not strictly increasing.\n     *\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 36)",
        "(line 114,col 9)-(line 114,col 33)",
        "(line 115,col 9)-(line 115,col 39)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 118,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.value(double)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Compute the value for the function.\n     * See {@link PolynomialSplineFunction} for details on the algorithm for\n     * computing the value of the function.\n     *\n     * @param v Point for which the function value should be computed.\n     * @return the value.\n     * @throws OutOfRangeException if {@code v} is outside of the domain of the\n     * spline function (smaller than the smallest knot point or larger than the\n     * largest knot point).\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.derivative()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Get the derivative of the polynomial spline function.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.polynomialSplineDerivative()",
      "begin_line": 163,
      "end_line": 169,
      "comment": "\n     * Get the derivative of the polynomial spline function.\n     *\n     * @return the derivative function.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 79)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.getN()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Get the number of spline segments.\n     * It is also the number of polynomials and the number of knot points - 1.\n     *\n     * @return the number of spline segments.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.getPolynomials()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * Get a copy of the interpolating polynomials array.\n     * It returns a fresh copy of the array. Changes made to the copy will\n     * not affect the polynomials property.\n     *\n     * @return the interpolating polynomials.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 59)",
        "(line 190,col 9)-(line 190,col 50)",
        "(line 191,col 9)-(line 191,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction.getKnots()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Get an array copy of the knot points.\n     * It returns a fresh copy of the array. Changes made to the copy\n     * will not affect the knots property.\n     *\n     * @return the knot points.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 41)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 204,col 19)"
      ]
    }
  ]
}