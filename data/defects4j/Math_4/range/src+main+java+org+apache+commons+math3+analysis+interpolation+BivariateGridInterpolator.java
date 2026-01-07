{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/interpolation/BivariateGridInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BivariateGridInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 52,
      "comment": "\n * Interface representing a bivariate real interpolating function where the\n * sample points must be specified on a regular grid.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.BivariateGridInterpolator.interpolate(double[], double[], double[][])",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Compute an interpolating function for the dataset.\n     *\n     * @param xval All the x-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param yval All the y-coordinates of the interpolation points, sorted\n     * in increasing order.\n     * @param fval The values of the interpolation points on all the grid knots:\n     * {@code fval[i][j] \u003d f(xval[i], yval[j])}.\n     * @return a function which interpolates the dataset.\n     * @throws NoDataException if any of the arrays has zero length.\n     * @throws DimensionMismatchException if the array lengths are inconsistent.\n     * @throws NonMonotonicSequenceException if the array is not sorted.\n     * @throws NumberIsTooSmallException if the number of points is too small for\n     * the order of the interpolation\n     ",
      "child_ranges": []
    }
  ]
}