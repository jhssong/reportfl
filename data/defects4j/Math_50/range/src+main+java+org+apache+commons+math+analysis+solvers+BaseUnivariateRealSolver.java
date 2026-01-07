{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/analysis/solvers/BaseUnivariateRealSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseUnivariateRealSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 119,
      "comment": "\n * Interface for (univariate real) rootfinding algorithms.\n * Implementations will search for only one zero in the given interval.\n *\n * This class is not intended for use outside of the Apache Commons Math\n * library, regular user should rely on more specific interfaces like\n * {@link UnivariateRealSolver}, {link PolynomialSolver} or {@link\n * DifferentiableUnivariateRealSolver}.\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @version $Id$\n * @since 3.0\n * @see UnivariateRealSolver\n * @see PolynomialSolver\n * @see DifferentiableUnivariateRealSolver\n "
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
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(int, FUNC, double, double)",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws org.apache.commons.math.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(int, FUNC, double, double, double)",
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @throws org.apache.commons.math.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver.solve(int, FUNC, double)",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Solve for a zero in the vicinity of {@code startValue}.\n     *\n     * @param f Function to solve.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @param maxEval Maximum number of evaluations.\n     * @throws org.apache.commons.math.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    }
  ]
}