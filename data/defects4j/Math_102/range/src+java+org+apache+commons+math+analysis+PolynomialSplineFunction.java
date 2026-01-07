{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/analysis/PolynomialSplineFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PolynomialSplineFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 224,
      "comment": "\n * Represents a polynomial spline function.\n * \u003cp\u003e\n * A \u003cstrong\u003epolynomial spline function\u003c/strong\u003e consists of a set of \n * \u003ci\u003einterpolating polynomials\u003c/i\u003e and an ascending array of domain \n * \u003ci\u003eknot points\u003c/i\u003e, determining the intervals over which the spline function\n * is defined by the constituent polynomials.  The polynomials are assumed to\n * have been computed to match the values of another function at the knot\n * points.  The value consistency constraints are not currently enforced by \n * \u003ccode\u003ePolynomialSplineFunction\u003c/code\u003e itself, but are assumed to hold among\n * the polynomials and knot points passed to the constructor.\n * \u003cp\u003e\n * N.B.:  The polynomials in the \u003ccode\u003epolynomials\u003c/code\u003e property must be\n * centered on the knot points to compute the spline function values.  See below.\n * \u003cp\u003e\n * The domain of the polynomial spline function is \n * \u003ccode\u003e[smallest knot, largest knot]\u003c/code\u003e.  Attempts to evaluate the\n * function at values outside of this range generate IllegalArgumentExceptions.\n * \u003cp\u003e\n * The value of the polynomial spline function for an argument \u003ccode\u003ex\u003c/code\u003e\n * is computed as follows:\n * \u003col\u003e\n * \u003cli\u003eThe knot array is searched to find the segment to which \u003ccode\u003ex\u003c/code\u003e\n * belongs.  If \u003ccode\u003ex\u003c/code\u003e is less than the smallest knot point or greater\n * than the largest one, an \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n * is thrown.\u003c/li\u003e\n * \u003cli\u003e Let \u003ccode\u003ej\u003c/code\u003e be the index of the largest knot point that is less\n * than or equal to \u003ccode\u003ex\u003c/code\u003e.  The value returned is \u003cbr\u003e\n * \u003ccode\u003epolynomials[j](x - knot[j])\u003c/code\u003e\u003c/li\u003e\u003c/ol\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "knots"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Spline segment interval delimiters (knots).   Size is n+1 for n segments. "
    },
    {
      "type": "field",
      "varNames": [
        "polynomials"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * The polynomial functions that make up the spline.  The first element\n     * determines the value of the spline over the first subinterval, the\n     * second over the second, etc.   Spline function values are determined by\n     * evaluating these functions at \u003ccode\u003e(x - knot[i])\u003c/code\u003e where i is the\n     * knot segment to which x belongs.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " \n     * Number of spline segments \u003d number of polynomials\n     *  \u003d number of partition points - 1 \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.PolynomialSplineFunction(double[], org.apache.commons.math.analysis.PolynomialFunction[])",
      "begin_line": 96,
      "end_line": 115,
      "comment": "\n     * Construct a polynomial spline function with the given segment delimiters\n     * and interpolating polynomials.\n     * \u003cp\u003e\n     * The constructor copies both arrays and assigns the copies to the knots\n     * and polynomials properties, respectively.\n     * \n     * @param knots spline segment interval delimiters\n     * @param polynomials polynomial functions that make up the spline\n     * @throws NullPointerException if either of the input arrays is null\n     * @throws IllegalArgumentException if knots has length less than 2,  \n     * \u003ccode\u003epolynomials.length !\u003d knots.length - 1 \u003c/code\u003e, or the knots array\n     * is not strictly increasing.\n     * \n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 39)",
        "(line 112,col 9)-(line 112,col 57)",
        "(line 113,col 9)-(line 113,col 53)",
        "(line 114,col 9)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.value(double)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Compute the value for the function.\n     * \u003cp\u003e\n     * Throws FunctionEvaluationException if v is outside of the domain of the\n     * function.  The domain is [smallest knot, largest knot].\n     * \u003cp\u003e\n     * See {@link PolynomialSplineFunction} for details on the algorithm for\n     * computing the value of the function.\n     * \n     * @param v the point for which the function value should be computed\n     * @return the value\n     * @throws ArgumentOutsideDomainException if v is outside of the domain of\n     * of the spline function (less than the smallest knot point or greater\n     * than the largest knot point)\n     ",
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
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.derivative()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the derivative of the polynomial spline function as a UnivariateRealFunction\n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.polynomialSplineDerivative()",
      "begin_line": 162,
      "end_line": 168,
      "comment": "\n     * Returns the derivative of the polynomial spline function as a PolynomialSplineFunction\n     * \n     * @return  the derivative function\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 79)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.getN()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the number of spline segments \u003d the number of polynomials \n     * \u003d the number of knot points - 1.\n     * \n     * @return the number of spline segments\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.getPolynomials()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "\n     * Returns a copy of the interpolating polynomials array.\n     * \u003cp\u003e\n     * Returns a fresh copy of the array. Changes made to the copy will\n     * not affect the polynomials property.\n     * \n     * @return the interpolating polynomials\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 59)",
        "(line 190,col 9)-(line 190,col 50)",
        "(line 191,col 9)-(line 191,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.getKnots()",
      "begin_line": 202,
      "end_line": 206,
      "comment": "\n     * Returns an array copy of the knot points.\n     * \u003cp\u003e\n     * Returns a fresh copy of the array. Changes made to the copy\n     * will not affect the knots property.\n     * \n     * @return the knot points\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 41)",
        "(line 204,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 205,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.PolynomialSplineFunction.isStrictlyIncreasing(double[])",
      "begin_line": 216,
      "end_line": 223,
      "comment": "\n     * Determines if the given array is ordered in a strictly increasing\n     * fashion.\n     * \n     * @param x the array to examine.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the elements in \u003ccode\u003ex\u003c/code\u003e are ordered\n     * in a stricly increasing manner.  \u003ccode\u003efalse\u003c/code\u003e, otherwise.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 20)"
      ]
    }
  ]
}