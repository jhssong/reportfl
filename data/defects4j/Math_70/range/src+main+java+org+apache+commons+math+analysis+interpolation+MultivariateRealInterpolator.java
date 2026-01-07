{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/interpolation/MultivariateRealInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateRealInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 46,
      "comment": "\n * Interface representing a univariate real interpolating function.\n *\n * @since 2.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.MultivariateRealInterpolator.interpolate(double[][], double[])",
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param xval the arguments for the interpolation points.\n     * {@code xval[i][0]} is the first component of interpolation point\n     * {@code i}, {@code xval[i][1]} is the second component, and so on\n     * until {@code xval[i][d-1]}, the last component of that interpolation\n     * point (where {@code d} is thus the dimension of the space).\n     * @param yval the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws MathException if arguments violate assumptions made by the\n     *         interpolation algorithm or some dimension mismatch occurs\n     * @throws IllegalArgumentException if there are no data (xval null or zero length)\n     ",
      "child_ranges": []
    }
  ]
}