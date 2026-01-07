{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/BicubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BicubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.BivariateGridInterpolator"
      ],
      "begin_line": 33,
      "end_line": 148,
      "comment": "\n * Generates a bicubic interpolating function.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 38,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 54,col 9)-(line 54,col 37)",
        "(line 60,col 9)-(line 60,col 53)",
        "(line 61,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 75)",
        "(line 75,col 9)-(line 75,col 87)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 82,col 9)-(line 82,col 87)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 88,col 9)-(line 88,col 55)",
        "(line 89,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 97,col 55)",
        "(line 98,col 9)-(line 103,col 9)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Computes the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i \u003e\u003d 0}.\n     *\n     * @param i Index.\n     * @param max Upper limit of the array.\n     * @return the next index.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 32)",
        "(line 134,col 9)-(line 134,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolator.previousIndex(int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Computes the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size\n     * of the array.\n     *\n     * @param i Index.\n     * @return the previous index.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 32)",
        "(line 146,col 9)-(line 146,col 38)"
      ]
    }
  ]
}