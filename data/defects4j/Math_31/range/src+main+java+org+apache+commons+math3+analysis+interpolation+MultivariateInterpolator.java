{
  "filepath": "/tmp/Math-31b/src/main/java/org/apache/commons/math3/analysis/interpolation/MultivariateInterpolator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateInterpolator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 50,
      "comment": "\n * Interface representing a univariate real interpolating function.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.interpolation.MultivariateInterpolator.interpolate(double[][], double[])",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Computes an interpolating function for the data set.\n     *\n     * @param xval the arguments for the interpolation points.\n     * {@code xval[i][0]} is the first component of interpolation point\n     * {@code i}, {@code xval[i][1]} is the second component, and so on\n     * until {@code xval[i][d-1]}, the last component of that interpolation\n     * point (where {@code d} is thus the dimension of the space).\n     * @param yval the values for the interpolation points\n     * @return a function which interpolates the data set\n     * @throws org.apache.commons.math3.exception.MathIllegalArgumentException\n     * if the arguments violate assumptions made by the interpolation\n     * algorithm.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * when the array dimensions are not consistent.\n     * @throws org.apache.commons.math3.exception.NoDataException if an\n     * array has zero-length.\n     * @throws org.apache.commons.math3.exception.NullArgumentException if\n     * the arguments are {@code null}.\n     ",
      "child_ranges": []
    }
  ]
}