{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BivariateGridInterpolator"
      ],
      "begin_line": 33,
      "end_line": 149,
      "comment": "\n * Generates a bicubic interpolating function.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 38,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 49,col 9)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 52,col 36)",
        "(line 54,col 9)-(line 54,col 37)",
        "(line 55,col 9)-(line 55,col 37)",
        "(line 61,col 9)-(line 61,col 53)",
        "(line 62,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 75)",
        "(line 76,col 9)-(line 76,col 87)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 83,col 9)-(line 83,col 87)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 89,col 9)-(line 89,col 55)",
        "(line 90,col 9)-(line 95,col 9)",
        "(line 98,col 9)-(line 98,col 55)",
        "(line 99,col 9)-(line 104,col 9)",
        "(line 107,col 9)-(line 107,col 58)",
        "(line 108,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 122,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Computes the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i \u003e\u003d 0}.\n     *\n     * @param i Index.\n     * @param max Upper limit of the array.\n     * @return the next index.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)",
        "(line 135,col 9)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Computes the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size\n     * of the array.\n     *\n     * @param i Index.\n     * @return the previous index.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 147,col 38)"
      ]
    }
  ]
}