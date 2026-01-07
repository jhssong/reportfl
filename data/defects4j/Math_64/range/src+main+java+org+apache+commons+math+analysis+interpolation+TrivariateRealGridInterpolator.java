{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/interpolation/TrivariateRealGridInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrivariateRealGridInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 49,
      "comment": "\n * Interface representing a trivariate real interpolating function where the\n * sample points must be specified on a regular grid.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.interpolation.TrivariateRealGridInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 47,
      "end_line": 48,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param xval All the x-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param yval All the y-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param zval All the z-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param fval the values of the interpolation points on all the grid knots:\n     * {@code fval[i][j][k] \u003d f(xval[i], yval[j], zval[k])}.\n     * @return a function that interpolates the data set.\n     * @throws org.apache.commons.math.exception.NoDataException if any of the arrays has zero length.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException if the array lengths are inconsistent.\n     * @throws MathException if arguments violate assumptions made by the\n     *         interpolation algorithm.\n     ",
      "child_ranges": []
    }
  ]
}