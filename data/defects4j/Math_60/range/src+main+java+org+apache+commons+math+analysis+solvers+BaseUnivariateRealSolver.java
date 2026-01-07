{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/analysis/solvers/BaseUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseUnivariateRealSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 114,
      "comment": "\n * Interface for (univariate real) rootfinding algorithms.\n * Implementations will search for only one zero in the given interval.\n *\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Revision$ $Date$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.setMaxEvaluations(int)",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Set the maximal number of function evaluations.\n     *\n     * @param maxEvaluations Maximal number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.getMaxEvaluations()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Get the maximal number of function evaluations.\n     *\n     * @return the maximal number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.getEvaluations()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.getAbsoluteAccuracy()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * @return the absolute accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.getRelativeAccuracy()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * @return the relative accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.getFunctionValueAccuracy()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * @return the function value accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(FUNC, double, double)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws IllegalArgumentException if {@code min \u003e max} or the endpoints\n     * do not satisfy the requirements specified by the solver.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(FUNC, double, double, double)",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @throws IllegalArgumentException if {@code min \u003e max} or the arguments\n     * do not satisfy the requirements specified by the solver.\n     * @since 2.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(FUNC, double)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Solve for a zero in the vicinity of {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     *\n     * @param f Function to solve.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @throws IllegalArgumentException if {@code min \u003e max} or the arguments\n     * do not satisfy the requirements specified by the solver.\n     * @since 2.0\n     ",
      "child_ranges": []
    }
  ]
}