{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/optimization/MultivariateRealOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateRealOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 101,
      "comment": "\n * This interface represents an optimization algorithm for {@link MultivariateRealFunction\n * scalar objective functions}.\n * \u003cp\u003eOptimization algorithms find the input point set that either {@link GoalType\n * maximize or minimize} an objective function.\u003c/p\u003e\n * @see DifferentiableMultivariateRealOptimizer\n * @see DifferentiableMultivariateVectorialOptimizer\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.setMaxIterations(int)",
      "begin_line": 38,
      "end_line": 38,
      "comment": " Set the maximal number of iterations of the algorithm.\n     * @param maxIterations maximal number of algorithm iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.getMaxIterations()",
      "begin_line": 43,
      "end_line": 43,
      "comment": " Get the maximal number of iterations of the algorithm.\n     * @return maximal number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.setMaxEvaluations(int)",
      "begin_line": 48,
      "end_line": 48,
      "comment": " Set the maximal number of functions evaluations.\n     * @param maxEvaluations maximal number of function evaluations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.getMaxEvaluations()",
      "begin_line": 53,
      "end_line": 53,
      "comment": " Get the maximal number of functions evaluations.\n     * @return maximal number of functions evaluations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.getIterations()",
      "begin_line": 63,
      "end_line": 63,
      "comment": " Get the number of iterations realized by the algorithm.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * {@link #optimize(MultivariateRealFunction, GoalType, double[]) optimize}\n     * method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.getEvaluations()",
      "begin_line": 73,
      "end_line": 73,
      "comment": " Get the number of evaluations of the objective function.\n     * \u003cp\u003e\n     * The number of evaluations corresponds to the last call to the\n     * {@link #optimize(MultivariateRealFunction, GoalType, double[]) optimize}\n     * method. It is 0 if the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the objective function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.RealConvergenceChecker)",
      "begin_line": 78,
      "end_line": 78,
      "comment": " Set the convergence checker.\n     * @param checker object to use to check for convergence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.getConvergenceChecker()",
      "begin_line": 83,
      "end_line": 83,
      "comment": " Get the convergence checker.\n     * @return object used to check for convergence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.MultivariateRealOptimizer.optimize(org.apache.commons.math.analysis.MultivariateRealFunction, org.apache.commons.math.optimization.GoalType, double[])",
      "begin_line": 96,
      "end_line": 99,
      "comment": " Optimizes an objective function.\n     * @param f objective function\n     * @param goalType type of optimization goal: either {@link GoalType#MAXIMIZE}\n     * or {@link GoalType#MINIMIZE}\n     * @param startPoint the start point for optimization\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}