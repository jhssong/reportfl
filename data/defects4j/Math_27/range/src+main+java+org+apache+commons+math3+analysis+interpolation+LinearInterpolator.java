{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/analysis/interpolation/LinearInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator"
      ],
      "begin_line": 31,
      "end_line": 75,
      "comment": "\n * Implements a linear function for interpolation of real univariate functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LinearInterpolator.interpolate(double[], double[])",
      "begin_line": 44,
      "end_line": 74,
      "comment": "\n     * Computes a linear interpolating function for the data set.\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if {@code x} and {@code y}\n     * have different sizes.\n     * @throws org.apache.commons.math3.exception.NonMonotonicSequenceException\n     * if {@code x} is not sorted in strict increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is smaller\n     * than 2.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 47,col 9)",
        "(line 49,col 9)-(line 52,col 9)",
        "(line 55,col 9)-(line 55,col 29)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 60,col 9)-(line 60,col 41)",
        "(line 61,col 9)-(line 63,col 9)",
        "(line 65,col 9)-(line 65,col 69)",
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 73,col 60)"
      ]
    }
  ]
}