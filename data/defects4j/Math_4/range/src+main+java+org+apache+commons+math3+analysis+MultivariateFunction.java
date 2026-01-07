{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/MultivariateFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateFunction",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 43,
      "comment": "\n * An interface representing a multivariate real function.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.MultivariateFunction.value(double[])",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Compute the value for the function at the given point.\n     *\n     * @param point Point at which the function must be evaluated.\n     * @return the function value for the given point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the parameter\u0027s dimension is wrong for the function being evaluated.\n     * @throws  org.apache.commons.math3.exception.MathIllegalArgumentException\n     * when the activated method itself can ascertain that preconditions,\n     * specified in the API expressed at the level of the activated method,\n     * have been violated.  In the vast majority of cases where Commons Math\n     * throws this exception, it is the result of argument checking of actual\n     * parameters immediately passed to a method.\n     ",
      "child_ranges": []
    }
  ]
}