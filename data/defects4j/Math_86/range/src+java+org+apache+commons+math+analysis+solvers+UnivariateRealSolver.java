{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/analysis/solvers/UnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnivariateRealSolver",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.ConvergingAlgorithm"
      ],
      "begin_line": 32,
      "end_line": 159,
      "comment": "\n * Interface for (univariate real) rootfinding algorithms.\n * \u003cp\u003e\n * Implementations will search for only one zero in the given interval.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.setFunctionValueAccuracy(double)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Set the function value accuracy.\n     * \u003cp\u003e\n     * This is used to determine when an evaluated function value or some other\n     * value which is used as divisor is zero.\u003c/p\u003e\n     * \u003cp\u003e\n     * This is a safety guard and it shouldn\u0027t be necessary to change this in\n     * general.\u003c/p\u003e\n     * \n     * @param accuracy the accuracy.\n     * @throws IllegalArgumentException if the accuracy can\u0027t be achieved by\n     * the solver or is otherwise deemed unreasonable. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Get the actual function value accuracy.\n     * @return the accuracy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.resetFunctionValueAccuracy()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Reset the actual function accuracy to the default.\n     * The default value is provided by the solver implementation.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.solve(double, double)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the solver\n     * @deprecated replaced by {@link #solve(UnivariateRealFunction, double, double)}\n     * since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param f the function to solve.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the endpoints do not\n     * satisfy the requirements specified by the solver\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.solve(double, double, double)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Solve for a zero in the given interval, start at startValue.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue the start value to use\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the solver\n     * @deprecated replaced by {@link #solve(UnivariateRealFunction, double, double, double)}\n     * since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * Solve for a zero in the given interval, start at startValue.\n     * A solver may require that the interval brackets a single zero root.\n     * \n     * @param f the function to solve.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param startValue the start value to use\n     * @return a value where the function is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise.\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min \u003e max or the arguments do not\n     * satisfy the requirements specified by the solver\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.getResult()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Get the result of the last run of the solver.\n     * \n     * @return the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.UnivariateRealSolver.getFunctionValue()",
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * Get the result of the last run of the solver.\n     * \n     * @return the value of the function at the last result.\n     * @throws IllegalStateException if there is no result available, either\n     * because no result was yet computed or the last attempt failed.\n     ",
      "child_ranges": []
    }
  ]
}