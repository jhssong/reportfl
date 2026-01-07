{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/interpolation/TricubicSplineInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TricubicSplineInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.TrivariateRealGridInterpolator"
      ],
      "begin_line": 30,
      "end_line": 198,
      "comment": "\n * Generates a tricubic interpolating function.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 35,
      "end_line": 173,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 42,col 9)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 47,col 9)-(line 47,col 35)",
        "(line 48,col 9)-(line 48,col 35)",
        "(line 49,col 9)-(line 49,col 35)",
        "(line 51,col 9)-(line 51,col 37)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 53,col 9)-(line 53,col 37)",
        "(line 58,col 9)-(line 58,col 65)",
        "(line 59,col 9)-(line 59,col 65)",
        "(line 60,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 78)",
        "(line 81,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 88,col 9)-(line 89,col 59)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 95,col 9)-(line 96,col 59)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 63)",
        "(line 103,col 9)-(line 103,col 63)",
        "(line 104,col 9)-(line 104,col 66)",
        "(line 105,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 119,col 63)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 131,col 9)",
        "(line 134,col 9)-(line 134,col 66)",
        "(line 135,col 9)-(line 144,col 9)",
        "(line 147,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 166,col 9)",
        "(line 169,col 9)-(line 172,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.nextIndex(int, int)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Compute the next index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is larger than or equal to 0}.\n     *\n     * @param i Index\n     * @param max Upper limit of the array\n     * @return the next index\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TricubicSplineInterpolator.previousIndex(int)",
      "begin_line": 194,
      "end_line": 197,
      "comment": "\n     * Compute the previous index of an array, clipping if necessary.\n     * It is assumed (but not checked) that {@code i} is smaller than the size of the array.\n     *\n     * @param i Index\n     * @return the previous index\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 32)",
        "(line 196,col 9)-(line 196,col 38)"
      ]
    }
  ]
}