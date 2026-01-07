{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/TricubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TricubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.TrivariateGridInterpolator"
      ],
      "begin_line": 31,
      "end_line": 200,
      "comment": "\n * Generates a tricubic interpolating function.\n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 36,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 49,col 36)",
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 54,col 9)-(line 54,col 37)",
        "(line 55,col 9)-(line 55,col 37)",
        "(line 60,col 9)-(line 60,col 65)",
        "(line 61,col 9)-(line 61,col 65)",
        "(line 62,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 78)",
        "(line 83,col 9)-(line 84,col 59)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 90,col 9)-(line 91,col 59)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 98,col 59)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 104,col 9)-(line 104,col 63)",
        "(line 105,col 9)-(line 105,col 63)",
        "(line 106,col 9)-(line 106,col 66)",
        "(line 107,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 121,col 63)",
        "(line 122,col 9)-(line 122,col 66)",
        "(line 123,col 9)-(line 133,col 9)",
        "(line 136,col 9)-(line 136,col 66)",
        "(line 137,col 9)-(line 146,col 9)",
        "(line 149,col 9)-(line 149,col 68)",
        "(line 150,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 174,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolator.previousIndex(int)",
      "begin_line": 196,
      "end_line": 199,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 198,col 38)"
      ]
    }
  ]
}