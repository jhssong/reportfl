{
  "filepath": "/tmp/Math-43b/src/main/java/org/apache/commons/math/optimization/BaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 60,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.MultivariateRealOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.DifferentiableMultivariateRealOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/objective pair.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseOptimizer.getMaxEvaluations()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Get the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseOptimizer.getEvaluations()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseOptimizer.getConvergenceChecker()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Get the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": []
    }
  ]
}