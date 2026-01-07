{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/interpolation/TrivariateRealGridInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrivariateRealGridInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 46,
      "comment": "\n * Interface representing a trivariate real interpolating function where the\n * sample points must be specified on a regular grid.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TrivariateRealGridInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 44,
      "end_line": 45,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param xval All the x-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param yval All the y-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param zval All the z-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param fval the values of the interpolation points on all the grid knots:\n     * {@code fval[i][j][k] \u003d f(xval[i], yval[j], zval[k])}.\n     * @return a function which interpolates the data set.\n     * @throws MathException if arguments violate assumptions made by the\n     *         interpolation algorithm.\n     ",
      "child_ranges": []
    }
  ]
}