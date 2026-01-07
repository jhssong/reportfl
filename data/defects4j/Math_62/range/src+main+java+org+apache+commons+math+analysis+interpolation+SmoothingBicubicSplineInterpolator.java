{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 43,
      "end_line": 176,
      "comment": "\n * Generates a bicubic interpolation function.\n * Before interpolating, smoothing of the input data is performed using\n * splines.\n * See \u003cb\u003eHandbook on splines for the user\u003c/b\u003e, ISBN 084939404X,\n * chapter 2.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n * @deprecated This class does not perform smoothing; the name is thus misleading.\n * Please use {@link org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator}\n * instead. If smoothing is desired, a tentative implementation is provided in class\n * {@link org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator}.\n * This class will be removed in math 3.0.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 48,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 57,col 9)",
        "(line 59,col 9)-(line 59,col 68)",
        "(line 60,col 9)-(line 60,col 68)",
        "(line 62,col 9)-(line 62,col 37)",
        "(line 63,col 9)-(line 63,col 37)",
        "(line 69,col 9)-(line 69,col 53)",
        "(line 70,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 75)",
        "(line 84,col 9)-(line 84,col 87)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 97,col 9)",
        "(line 101,col 9)-(line 101,col 87)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 108,col 9)-(line 108,col 55)",
        "(line 109,col 9)-(line 114,col 9)",
        "(line 117,col 9)-(line 117,col 55)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 126,col 9)-(line 126,col 55)",
        "(line 127,col 9)-(line 132,col 9)",
        "(line 135,col 9)-(line 135,col 57)",
        "(line 136,col 9)-(line 146,col 9)",
        "(line 149,col 9)-(line 150,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 32)",
        "(line 163,col 9)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 32)",
        "(line 174,col 9)-(line 174,col 38)"
      ]
    }
  ]
}