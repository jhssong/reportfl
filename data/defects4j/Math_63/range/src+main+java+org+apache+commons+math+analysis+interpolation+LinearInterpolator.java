{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/analysis/interpolation/LinearInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator"
      ],
      "begin_line": 30,
      "end_line": 74,
      "comment": "\n * Implements a linear function for interpolation of real univariate functions.\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LinearInterpolator.interpolate(double[], double[])",
      "begin_line": 43,
      "end_line": 73,
      "comment": "\n     * Computes a linear interpolating function for the data set.\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if {@code x} and {@code y}\n     * have different sizes.\n     * @throws org.apache.commons.math.exception.NonMonotonousSequenceException\n     * if {@code x} is not sorted in strict increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is smaller\n     * than 2.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 46,col 9)",
        "(line 48,col 9)-(line 51,col 9)",
        "(line 54,col 9)-(line 54,col 29)",
        "(line 56,col 9)-(line 56,col 32)",
        "(line 59,col 9)-(line 59,col 41)",
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 69)",
        "(line 65,col 9)-(line 65,col 52)",
        "(line 66,col 9)-(line 70,col 9)",
        "(line 72,col 9)-(line 72,col 60)"
      ]
    }
  ]
}