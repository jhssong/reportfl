{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/SplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator"
      ],
      "begin_line": 53,
      "end_line": 128,
      "comment": "\n * Computes a natural (also known as \"free\", \"unclamped\") cubic spline interpolation for the data set.\n * \u003cp\u003e\n * The {@link #interpolate(double[], double[])} method returns a {@link PolynomialSplineFunction}\n * consisting of n cubic polynomials, defined over the subintervals determined by the x values,\n * x[0] \u003c x[i] ... \u003c x[n].  The x values are referred to as \"knot points.\"\u003c/p\u003e\n * \u003cp\u003e\n * The value of the PolynomialSplineFunction at a point x that is greater than or equal to the smallest\n * knot point and strictly less than the largest knot point is computed by finding the subinterval to which\n * x belongs and computing the value of the corresponding polynomial at \u003ccode\u003ex - x[i] \u003c/code\u003e where\n * \u003ccode\u003ei\u003c/code\u003e is the index of the subinterval.  See {@link PolynomialSplineFunction} for more details.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The interpolating polynomials satisfy: \u003col\u003e\n * \u003cli\u003eThe value of the PolynomialSplineFunction at each of the input x values equals the\n *  corresponding y value.\u003c/li\u003e\n * \u003cli\u003eAdjacent polynomials are equal through two derivatives at the knot points (i.e., adjacent polynomials\n *  \"match up\" at the knot points, as do their first and second derivatives).\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The cubic spline interpolation algorithm implemented is as described in R.L. Burden, J.D. Faires,\n * \u003cu\u003eNumerical Analysis\u003c/u\u003e, 4th Ed., 1989, PWS-Kent, ISBN 0-53491-585-X, pp 126-131.\n * \u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.SplineInterpolator.interpolate(double[], double[])",
      "begin_line": 66,
      "end_line": 127,
      "comment": "\n     * Computes an interpolating function for the data set.\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if {@code x} and {@code y}\n     * have different sizes.\n     * @throws NonMonotonicSequenceException if {@code x} is not sorted in\n     * strict increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is smaller\n     * than 3.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 80,col 9)-(line 80,col 35)",
        "(line 82,col 9)-(line 82,col 33)",
        "(line 85,col 9)-(line 85,col 41)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 42)",
        "(line 91,col 9)-(line 91,col 45)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 93,col 9)-(line 93,col 18)",
        "(line 94,col 9)-(line 94,col 21)",
        "(line 95,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 104,col 45)",
        "(line 105,col 9)-(line 105,col 41)",
        "(line 107,col 9)-(line 107,col 18)",
        "(line 108,col 9)-(line 108,col 18)",
        "(line 110,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 75)",
        "(line 117,col 9)-(line 117,col 52)",
        "(line 118,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 60)"
      ]
    }
  ]
}