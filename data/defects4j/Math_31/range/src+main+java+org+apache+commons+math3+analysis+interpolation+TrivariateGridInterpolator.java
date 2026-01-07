{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/analysis/interpolation/TrivariateGridInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrivariateGridInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 48,
      "comment": "\n * Interface representing a trivariate real interpolating function where the\n * sample points must be specified on a regular grid.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.TrivariateGridInterpolator.interpolate(double[], double[], double[], double[][][])",
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Compute an interpolating function for the dataset.\n     *\n     * @param xval All the x-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param yval All the y-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param zval All the z-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param fval the values of the interpolation points on all the grid knots:\n     * {@code fval[i][j][k] \u003d f(xval[i], yval[j], zval[k])}.\n     * @return a function that interpolates the data set.\n     * @throws org.apache.commons.math3.exception.NoDataException if any of\n     * the arrays has zero length.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the array lengths are inconsistent.\n     ",
      "child_ranges": []
    }
  ]
}