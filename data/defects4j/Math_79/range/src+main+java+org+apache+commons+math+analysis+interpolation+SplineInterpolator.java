{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/analysis/interpolation/SplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator"
      ],
      "begin_line": 50,
      "end_line": 125,
      "comment": "\n * Computes a natural (also known as \"free\", \"unclamped\") cubic spline interpolation for the data set.\n * \u003cp\u003e\n * The {@link #interpolate(double[], double[])} method returns a {@link PolynomialSplineFunction}\n * consisting of n cubic polynomials, defined over the subintervals determined by the x values,\n * x[0] \u003c x[i] ... \u003c x[n].  The x values are referred to as \"knot points.\"\u003c/p\u003e\n * \u003cp\u003e\n * The value of the PolynomialSplineFunction at a point x that is greater than or equal to the smallest\n * knot point and strictly less than the largest knot point is computed by finding the subinterval to which\n * x belongs and computing the value of the corresponding polynomial at \u003ccode\u003ex - x[i] \u003c/code\u003e where\n * \u003ccode\u003ei\u003c/code\u003e is the index of the subinterval.  See {@link PolynomialSplineFunction} for more details.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The interpolating polynomials satisfy: \u003col\u003e\n * \u003cli\u003eThe value of the PolynomialSplineFunction at each of the input x values equals the\n *  corresponding y value.\u003c/li\u003e\n * \u003cli\u003eAdjacent polynomials are equal through two derivatives at the knot points (i.e., adjacent polynomials\n *  \"match up\" at the knot points, as do their first and second derivatives).\u003c/li\u003e\n * \u003c/ol\u003e\u003c/p\u003e\n * \u003cp\u003e\n * The cubic spline interpolation algorithm implemented is as described in R.L. Burden, J.D. Faires,\n * \u003cu\u003eNumerical Analysis\u003c/u\u003e, 4th Ed., 1989, PWS-Kent, ISBN 0-53491-585-X, pp 126-131.\n * \u003c/p\u003e\n *\n * @version $Revision$ $Date$\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SplineInterpolator.interpolate(double[], double[])",
      "begin_line": 58,
      "end_line": 123,
      "comment": "\n     * Computes an interpolating function for the data set.\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 67,col 9)",
        "(line 70,col 9)-(line 70,col 29)",
        "(line 72,col 9)-(line 78,col 9)",
        "(line 81,col 9)-(line 81,col 35)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 36)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 19)",
        "(line 89,col 9)-(line 89,col 18)",
        "(line 90,col 9)-(line 90,col 21)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 35)",
        "(line 103,col 9)-(line 103,col 18)",
        "(line 104,col 9)-(line 104,col 18)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 112,col 69)",
        "(line 113,col 9)-(line 113,col 46)",
        "(line 114,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 60)"
      ]
    }
  ]
}