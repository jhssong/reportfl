{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 32,
      "end_line": 49,
      "comment": "\n * Base class for implementing optimizers for multivariate (not necessarily\n * differentiable) scalar functions.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarOptimizer.AbstractScalarOptimizer()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a\n     * {@link org.apache.commons.math.optimization.SimpleScalarValueChecker}.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarOptimizer.AbstractScalarOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.RealPointValuePair\u003e, int)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxEvaluations Maximum number of function evaluations.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 39)"
      ]
    }
  ]
}