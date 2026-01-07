{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BivariateGridInterpolator"
      ],
      "begin_line": 31,
      "end_line": 143,
      "comment": "\n * Generates a bicubic interpolating function.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 36,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 41,col 9)",
        "(line 42,col 9)-(line 44,col 9)",
        "(line 46,col 9)-(line 46,col 36)",
        "(line 47,col 9)-(line 47,col 36)",
        "(line 49,col 9)-(line 49,col 37)",
        "(line 50,col 9)-(line 50,col 37)",
        "(line 56,col 9)-(line 56,col 53)",
        "(line 57,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 67,col 75)",
        "(line 71,col 9)-(line 71,col 87)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 78,col 9)-(line 78,col 87)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 84,col 9)-(line 84,col 55)",
        "(line 85,col 9)-(line 90,col 9)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 94,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 58)",
        "(line 103,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 130,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 32)",
        "(line 141,col 9)-(line 141,col 38)"
      ]
    }
  ]
}