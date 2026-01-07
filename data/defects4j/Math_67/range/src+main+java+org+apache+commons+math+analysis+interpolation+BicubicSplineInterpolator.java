{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 33,
      "end_line": 146,
      "comment": "\n * Generates a bicubic interpolating function.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 38,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 49,col 35)",
        "(line 50,col 9)-(line 50,col 35)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 59,col 9)-(line 59,col 53)",
        "(line 60,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 75)",
        "(line 74,col 9)-(line 74,col 87)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 81,col 9)-(line 81,col 87)",
        "(line 82,col 9)-(line 84,col 9)",
        "(line 87,col 9)-(line 87,col 55)",
        "(line 88,col 9)-(line 93,col 9)",
        "(line 96,col 9)-(line 96,col 55)",
        "(line 97,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 105,col 58)",
        "(line 106,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 120,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 32)",
        "(line 133,col 9)-(line 133,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 32)",
        "(line 144,col 9)-(line 144,col 38)"
      ]
    }
  ]
}