{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/LinearInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LinearInterpolator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.interpolation.UnivariateInterpolator"
      ],
      "begin_line": 32,
      "end_line": 80,
      "comment": "\n * Implements a linear function for interpolation of real univariate functions.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.LinearInterpolator.interpolate(double[], double[])",
      "begin_line": 46,
      "end_line": 79,
      "comment": "\n     * Computes a linear interpolating function for the data set.\n     *\n     * @param x the arguments for the interpolation points\n     * @param y the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws DimensionMismatchException if {@code x} and {@code y}\n     * have different sizes.\n     * @throws NonMonotonicSequenceException if {@code x} is not sorted in\n     * strict increasing order.\n     * @throws NumberIsTooSmallException if the size of {@code x} is smaller\n     * than 2.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 9)",
        "(line 54,col 9)-(line 57,col 9)",
        "(line 60,col 9)-(line 60,col 29)",
        "(line 62,col 9)-(line 62,col 33)",
        "(line 65,col 9)-(line 65,col 41)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 75)",
        "(line 71,col 9)-(line 71,col 52)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 60)"
      ]
    }
  ]
}