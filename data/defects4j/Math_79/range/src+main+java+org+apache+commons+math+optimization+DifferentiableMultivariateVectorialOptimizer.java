{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/optimization/DifferentiableMultivariateVectorialOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DifferentiableMultivariateVectorialOptimizer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 114,
      "comment": "\n * This interface represents an optimization algorithm for {@link DifferentiableMultivariateVectorialFunction\n * vectorial differentiable objective functions}.\n * \u003cp\u003eOptimization algorithms find the input point set that either {@link GoalType\n * maximize or minimize} an objective function.\u003c/p\u003e\n * @see MultivariateRealOptimizer\n * @see DifferentiableMultivariateRealOptimizer\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.setMaxIterations(int)",
      "begin_line": 39,
      "end_line": 39,
      "comment": " Set the maximal number of iterations of the algorithm.\n     * @param maxIterations maximal number of function calls\n     * .\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getMaxIterations()",
      "begin_line": 44,
      "end_line": 44,
      "comment": " Get the maximal number of iterations of the algorithm.\n      * @return maximal number of iterations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getIterations()",
      "begin_line": 49,
      "end_line": 49,
      "comment": " Get the number of iterations realized by the algorithm.\n     * @return number of iterations\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.setMaxEvaluations(int)",
      "begin_line": 54,
      "end_line": 54,
      "comment": " Set the maximal number of functions evaluations.\n    * @param maxEvaluations maximal number of function evaluations\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getMaxEvaluations()",
      "begin_line": 59,
      "end_line": 59,
      "comment": " Get the maximal number of functions evaluations.\n    * @return maximal number of functions evaluations\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getEvaluations()",
      "begin_line": 70,
      "end_line": 70,
      "comment": " Get the number of evaluations of the objective function.\n     * \u003cp\u003e\n     * The number of evaluation correspond to the last call to the\n     * {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method. It is 0 if\n     * the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the objective function\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getJacobianEvaluations()",
      "begin_line": 81,
      "end_line": 81,
      "comment": " Get the number of evaluations of the objective function jacobian .\n     * \u003cp\u003e\n     * The number of evaluation correspond to the last call to the\n     * {@link #optimize(DifferentiableMultivariateVectorialFunction,\n     * double[], double[], double[]) optimize} method. It is 0 if\n     * the method has not been called yet.\n     * \u003c/p\u003e\n     * @return number of evaluations of the objective function jacobian\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Set the convergence checker.\n     * @param checker object to use to check for convergence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.getConvergenceChecker()",
      "begin_line": 91,
      "end_line": 91,
      "comment": " Get the convergence checker.\n     * @return object used to check for convergence\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer.optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double[], double[], double[])",
      "begin_line": 109,
      "end_line": 112,
      "comment": " Optimizes an objective function.\n     * \u003cp\u003e\n     * Optimization is considered to be a weighted least-squares minimization.\n     * The cost function to be minimized is\n     * \u0026sum;weight\u003csub\u003ei\u003c/sub\u003e(objective\u003csub\u003ei\u003c/sub\u003e-target\u003csub\u003ei\u003c/sub\u003e)\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/p\u003e\n     * @param f objective function\n     * @param target target value for the objective functions at optimum\n     * @param weights weight for the least squares cost computation\n     * @param startPoint the start point for optimization\n     * @return the point/value pair giving the optimal value for objective function\n     * @exception FunctionEvaluationException if the objective function throws one during\n     * the search\n     * @exception OptimizationException if the algorithm failed to converge\n     * @exception IllegalArgumentException if the start point dimension is wrong\n     ",
      "child_ranges": []
    }
  ]
}