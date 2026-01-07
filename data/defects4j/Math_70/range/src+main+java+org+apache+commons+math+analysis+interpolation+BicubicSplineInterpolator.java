{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/interpolation/BicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator"
      ],
      "begin_line": 32,
      "end_line": 145,
      "comment": "\n * Generates a bicubic interpolating function.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 37,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 43,col 9)",
        "(line 44,col 9)-(line 46,col 9)",
        "(line 48,col 9)-(line 48,col 44)",
        "(line 49,col 9)-(line 49,col 44)",
        "(line 51,col 9)-(line 51,col 37)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 58,col 9)-(line 58,col 53)",
        "(line 59,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 75)",
        "(line 73,col 9)-(line 73,col 87)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 80,col 9)-(line 80,col 87)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 86,col 9)-(line 86,col 55)",
        "(line 87,col 9)-(line 92,col 9)",
        "(line 95,col 9)-(line 95,col 55)",
        "(line 96,col 9)-(line 101,col 9)",
        "(line 104,col 9)-(line 104,col 58)",
        "(line 105,col 9)-(line 115,col 9)",
        "(line 118,col 9)-(line 119,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 32)",
        "(line 132,col 9)-(line 132,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 32)",
        "(line 143,col 9)-(line 143,col 38)"
      ]
    }
  ]
}