{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/interpolation/BivariateRealGridInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BivariateRealGridInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 44,
      "comment": "\n * Interface representing a bivariate real interpolating function where the\n * sample points must be specified on a regular grid.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.BivariateRealGridInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 42,
      "end_line": 43,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param xval All the x-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param yval All the y-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param fval The values of the interpolation points on all the grid knots:\n     * {@code fval[i][j] \u003d f(xval[i], yval[j])}.\n     * @return a function which interpolates the data set.\n     * @throws MathException if arguments violate assumptions made by the\n     *         interpolation algorithm.\n     ",
      "child_ranges": []
    }
  ]
}