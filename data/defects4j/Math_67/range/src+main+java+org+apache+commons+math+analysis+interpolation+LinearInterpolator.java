{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/analysis/interpolation/LinearInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.interpolation.UnivariateRealInterpolator"
      ],
      "begin_line": 29,
      "end_line": 73,
      "comment": "\n * Implements a linear function for interpolation of real univariate functions.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.LinearInterpolator.interpolate(double[], double[])",
      "begin_line": 42,
      "end_line": 72,
      "comment": "\n     * Computes a linear interpolating function for the data set.\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if {@code x} and {@code y}\n     * have different sizes.\n     * @throws NonMonotonousSequenceException if {@code x} is not sorted in\n     * strict increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is smaller\n     * than 2.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 45,col 9)",
        "(line 47,col 9)-(line 50,col 9)",
        "(line 53,col 9)-(line 53,col 29)",
        "(line 55,col 9)-(line 55,col 32)",
        "(line 58,col 9)-(line 58,col 41)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 63,col 69)",
        "(line 64,col 9)-(line 64,col 52)",
        "(line 65,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 71,col 60)"
      ]
    }
  ]
}