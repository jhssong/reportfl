{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optimization/BaseOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 62,
      "comment": "\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * the following interfaces:\n * \u003cul\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateDifferentiableOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.MultivariateDifferentiableVectorOptimizer}\u003c/li\u003e\n *  \u003cli\u003e{@link org.apache.commons.math3.optimization.univariate.UnivariateOptimizer}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cPAIR\u003e Type of the point/objective pair.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseOptimizer.getMaxEvaluations()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Get the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseOptimizer.getEvaluations()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.BaseOptimizer.getConvergenceChecker()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Get the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": []
    }
  ]
}