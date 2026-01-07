{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/analysis/differentiation/MultivariateDifferentiableFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateDifferentiableFunction",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 30,
      "end_line": 49,
      "comment": "\n * Extension of {@link MultivariateFunction} representing a\n * multivariate differentiable real function.\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 46,
      "end_line": 47,
      "comment": "\n     * Compute the value for the function at the given point.\n     *\n     * @param point Point at which the function must be evaluated.\n     * @return the function value for the given point.\n     * @throws org.apache.commons.math3.exception.DimensionMismatchException\n     * if the parameter\u0027s dimension is wrong for the function being evaluated.\n     * @throws  org.apache.commons.math3.exception.MathIllegalArgumentException\n     * when the activated method itself can ascertain that preconditions,\n     * specified in the API expressed at the level of the activated method,\n     * have been violated.  In the vast majority of cases where Commons Math\n     * throws this exception, it is the result of argument checking of actual\n     * parameters immediately passed to a method.\n     ",
      "child_ranges": []
    }
  ]
}