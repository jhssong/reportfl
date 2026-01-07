{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BaseUnivariateSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseUnivariateSolver",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 143,
      "comment": "\n * Interface for (univariate real) rootfinding algorithms.\n * Implementations will search for only one zero in the given interval.\n *\n * This class is not intended for use outside of the Apache Commons Math\n * library, regular user should rely on more specific interfaces like\n * {@link UnivariateSolver}, {@link PolynomialSolver} or {@link\n * DifferentiableUnivariateSolver}.\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @since 3.0\n * @version $Id$\n * @see UnivariateSolver\n * @see PolynomialSolver\n * @see DifferentiableUnivariateSolver\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.getMaxEvaluations()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Get the maximum number of function evaluations.\n     *\n     * @return the maximum number of function evaluations.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.getEvaluations()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Get the number of evaluations of the objective function.\n     * The number of evaluations corresponds to the last call to the\n     * {@code optimize} method. It is 0 if the method has not been\n     * called yet.\n     *\n     * @return the number of evaluations of the objective function.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.getAbsoluteAccuracy()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Get the absolute accuracy of the solver.  Solutions returned by the\n     * solver should be accurate to this tolerance, i.e., if \u0026epsilon; is the\n     * absolute accuracy of the solver and {@code v} is a value returned by\n     * one of the {@code solve} methods, then a root of the function should\n     * exist somewhere in the interval ({@code v} - \u0026epsilon;, {@code v} + \u0026epsilon;).\n     *\n     * @return the absolute accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.getRelativeAccuracy()",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Get the relative accuracy of the solver.  The contract for relative\n     * accuracy is the same as {@link #getAbsoluteAccuracy()}, but using\n     * relative, rather than absolute error.  If \u0026rho; is the relative accuracy\n     * configured for a solver and {@code v} is a value returned, then a root\n     * of the function should exist somewhere in the interval\n     * ({@code v} - \u0026rho; {@code v}, {@code v} + \u0026rho; {@code v}).\n     *\n     * @return the relative accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.getFunctionValueAccuracy()",
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Get the function value accuracy of the solver.  If {@code v} is\n     * a value returned by the solver for a function {@code f},\n     * then by contract, {@code |f(v)|} should be less than or equal to\n     * the function value accuracy configured for the solver.\n     *\n     * @return the function value accuracy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.solve(int, FUNC, double, double)",
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * Solve for a zero root in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @return a value where the function is zero.\n     * @throws MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.solve(int, FUNC, double, double, double)",
      "begin_line": 127,
      "end_line": 128,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @throws MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver.solve(int, FUNC, double)",
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Solve for a zero in the vicinity of {@code startValue}.\n     *\n     * @param f Function to solve.\n     * @param startValue Start value to use.\n     * @return a value where the function is zero.\n     * @param maxEval Maximum number of evaluations.\n     * @throws org.apache.commons.math3.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    }
  ]
}