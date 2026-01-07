{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 41,
      "end_line": 174,
      "comment": "\n * Generates a bicubic interpolation function.\n * Before interpolating, smoothing of the input data is performed using\n * splines.\n * See \u003cb\u003eHandbook on splines for the user\u003c/b\u003e, ISBN 084939404X,\n * chapter 2.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n * @deprecated This class does not perform smoothing; the name is thus misleading.\n * Please use {@link org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator}\n * instead. If smoothing is desired, a tentative implementation is provided in class\n * {@link org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator}.\n * This class will be removed in math 3.0.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 46,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 44)",
        "(line 58,col 9)-(line 58,col 44)",
        "(line 60,col 9)-(line 60,col 37)",
        "(line 61,col 9)-(line 61,col 37)",
        "(line 67,col 9)-(line 67,col 53)",
        "(line 68,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 75)",
        "(line 82,col 9)-(line 82,col 87)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 89,col 9)-(line 89,col 55)",
        "(line 90,col 9)-(line 95,col 9)",
        "(line 99,col 9)-(line 99,col 87)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 106,col 9)-(line 106,col 55)",
        "(line 107,col 9)-(line 112,col 9)",
        "(line 115,col 9)-(line 115,col 55)",
        "(line 116,col 9)-(line 121,col 9)",
        "(line 124,col 9)-(line 124,col 55)",
        "(line 125,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 57)",
        "(line 134,col 9)-(line 144,col 9)",
        "(line 147,col 9)-(line 148,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 32)",
        "(line 161,col 9)-(line 161,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 32)",
        "(line 172,col 9)-(line 172,col 38)"
      ]
    }
  ]
}