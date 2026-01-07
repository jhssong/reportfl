{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 42,
      "end_line": 175,
      "comment": "\n * Generates a bicubic interpolation function.\n * Before interpolating, smoothing of the input data is performed using\n * splines.\n * See \u003cb\u003eHandbook on splines for the user\u003c/b\u003e, ISBN 084939404X,\n * chapter 2.\n *\n * @version $Revision$ $Date$\n * @since 2.1\n * @deprecated This class does not perform smoothing; the name is thus misleading.\n * Please use {@link org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator}\n * instead. If smoothing is desired, a tentative implementation is provided in class\n * {@link org.apache.commons.math.analysis.interpolation.SmoothingPolynomialBicubicSplineInterpolator}.\n * This class will be removed in math 3.0.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 47,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 58,col 9)-(line 58,col 44)",
        "(line 59,col 9)-(line 59,col 44)",
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 62,col 37)",
        "(line 68,col 9)-(line 68,col 53)",
        "(line 69,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 75)",
        "(line 83,col 9)-(line 83,col 87)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 100,col 9)-(line 100,col 87)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 107,col 9)-(line 107,col 55)",
        "(line 108,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 116,col 55)",
        "(line 117,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 55)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 57)",
        "(line 135,col 9)-(line 145,col 9)",
        "(line 148,col 9)-(line 149,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 32)",
        "(line 162,col 9)-(line 162,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 32)",
        "(line 173,col 9)-(line 173,col 38)"
      ]
    }
  ]
}