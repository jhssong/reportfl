{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/optimization/general/AbstractScalarOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractScalarOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 31,
      "end_line": 51,
      "comment": "\n * Base class for implementing optimizers for multivariate (not necessarily\n * differentiable) scalar functions.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarOptimizer.AbstractScalarOptimizer()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Simple constructor with default settings.\n     * The convergence check is set to a {@link org.apache.commons.math.optimization.SimpleScalarValueChecker},\n     * the allowed number of iterations and evaluations are set to their\n     * default values.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.AbstractScalarOptimizer.AbstractScalarOptimizer(org.apache.commons.math.optimization.RealConvergenceChecker, int, int)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * @param checker Convergence checker.\n     * @param maxIterations Maximum number of iterations.\n     * @param maxEvaluations Maximum number of evaluations.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 54)"
      ]
    }
  ]
}