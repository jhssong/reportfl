{
  "filepath": "/tmp/Math-46b/src/main/java/org/apache/commons/math/analysis/interpolation/TricubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TricubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.TrivariateRealGridInterpolator"
      ],
      "begin_line": 29,
      "end_line": 196,
      "comment": "\n * Generates a tricubic interpolating function.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 34,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 43,col 9)",
        "(line 45,col 9)-(line 45,col 35)",
        "(line 46,col 9)-(line 46,col 35)",
        "(line 47,col 9)-(line 47,col 35)",
        "(line 49,col 9)-(line 49,col 37)",
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 37)",
        "(line 56,col 9)-(line 56,col 65)",
        "(line 57,col 9)-(line 57,col 65)",
        "(line 58,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 78)",
        "(line 79,col 9)-(line 80,col 59)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 86,col 9)-(line 87,col 59)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 93,col 9)-(line 94,col 59)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 100,col 9)-(line 100,col 63)",
        "(line 101,col 9)-(line 101,col 63)",
        "(line 102,col 9)-(line 102,col 66)",
        "(line 103,col 9)-(line 114,col 9)",
        "(line 117,col 9)-(line 117,col 63)",
        "(line 118,col 9)-(line 118,col 66)",
        "(line 119,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 132,col 66)",
        "(line 133,col 9)-(line 142,col 9)",
        "(line 145,col 9)-(line 145,col 68)",
        "(line 146,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 170,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 183,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.previousIndex(int)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)",
        "(line 194,col 9)-(line 194,col 38)"
      ]
    }
  ]
}