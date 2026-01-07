{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/differentiation/MultivariateDifferentiableFunction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateDifferentiableFunction",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.analysis.MultivariateFunction"
      ],
      "begin_line": 29,
      "end_line": 43,
      "comment": "\n * Extension of {@link MultivariateFunction} representing a\n * multivariate differentiable real function.\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * Compute the value for the function at the given point.\n     *\n     * @param point Point at which the function must be evaluated.\n     * @return the function value for the given point.\n     * @exception MathIllegalArgumentException if {@code point} does not\n     * satisfy the function\u0027s constraints (wrong dimension, argument out of bound,\n     * or unsupported derivative order for example)\n     ",
      "child_ranges": []
    }
  ]
}