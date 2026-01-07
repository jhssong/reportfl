{
  "filepath": "/tmp/Math-71b/src/main/java/org/apache/commons/math/analysis/interpolation/SmoothingBicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SmoothingBicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 36,
      "end_line": 170,
      "comment": "\n * Generates a bicubic interpolation function.\n * Before interpolating, smoothing of the input data is performed using\n * splines.\n * See \u003cb\u003eHandbook on splines for the user\u003c/b\u003e, ISBN 084939404X,\n * chapter 2.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 41,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 48,col 9)-(line 50,col 9)",
        "(line 52,col 9)-(line 52,col 44)",
        "(line 53,col 9)-(line 53,col 44)",
        "(line 55,col 9)-(line 55,col 37)",
        "(line 56,col 9)-(line 56,col 37)",
        "(line 62,col 9)-(line 62,col 53)",
        "(line 63,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 75)",
        "(line 77,col 9)-(line 77,col 87)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 84,col 9)-(line 84,col 55)",
        "(line 85,col 9)-(line 90,col 9)",
        "(line 94,col 9)-(line 94,col 87)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 101,col 9)-(line 101,col 55)",
        "(line 102,col 9)-(line 107,col 9)",
        "(line 110,col 9)-(line 110,col 55)",
        "(line 111,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 128,col 57)",
        "(line 129,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 143,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)",
        "(line 156,col 9)-(line 156,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.SmoothingBicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)",
        "(line 168,col 9)-(line 168,col 38)"
      ]
    }
  ]
}