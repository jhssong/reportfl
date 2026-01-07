{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/optimization/BaseMultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseMultivariateRealOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 115,
      "comment": "\n * Optimization algorithms find the input point set that either {@link GoalType\n * maximize or minimize} an objective function.\n * This interface is mainly intended to enforce the internal coherence of\n * Commons-Math. Users of the API are advised to base their code on\n * {@link MultivariateRealOptimizer} or on\n * {@link DifferentiableMultivariateRealOptimizer}.\n * @param \u003cT\u003e the type of the objective function to be optimized\n *\n * @see MultivariateRealOptimizer\n * @see DifferentiableMultivariateRealOptimizer\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.setMaxIterations(int)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Set the maximal number of iterations of the algorithm.\n     *\n     * @param maxIterations Maximal number of algorithm iterations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.getMaxIterations()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Get the maximal number of iterations of the algorithm.\n     *\n     * @return the maximal number of iterations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Set the maximal number of functions evaluations.\n     *\n     * @param maxEvaluations Maximal number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Get the maximal number of functions evaluations.\n     *\n     * @return the maximal number of functions evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.getIterations()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Get the number of iterations realized by the algorithm.\n     * The number of iterations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of iterations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.getEvaluations()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Set the convergence checker.\n     *\n     * @param checker Object to use to check for convergence.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Get the convergence checker.\n     *\n     * @return the object used to check for convergence.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.BaseMultivariateRealOptimizer.optimize(T, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 113,
      "end_line": 114,
      "comment": "\n     * Optimize an objective function.\n     *\n     * @param f Objective function.\n     * @param goalType Type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}.\n     * @param startPoint Start point for optimization.\n     * @return the point/value pair giving the optimal value for objective function.\n     * @throws FunctionEvaluationException if the objective function throws one during\n     * the search.\n     * @throws OptimizationException if the algorithm failed to converge.\n     * @throws IllegalArgumentException if the start point dimension is wrong.\n     ",
      "child_ranges": []
    }
  ]
}