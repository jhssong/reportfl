{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/solvers/BracketedUnivariateSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BracketedUnivariateSolver",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver\u003cFUNC\u003e"
      ],
      "begin_line": 47,
      "end_line": 93,
      "comment": " Interface for {@link UnivariateSolver (univariate real) root-finding\n * algorithms} that maintain a bracketed solution. There are several advantages\n * to having such root-finding algorithms:\n * \u003cul\u003e\n *  \u003cli\u003eThe bracketed solution guarantees that the root is kept within the\n *      interval. As such, these algorithms generally also guarantee\n *      convergence.\u003c/li\u003e\n *  \u003cli\u003eThe bracketed solution means that we have the opportunity to only\n *      return roots that are greater than or equal to the actual root, or\n *      are less than or equal to the actual root. That is, we can control\n *      whether under-approximations and over-approximations are\n *      {@link AllowedSolution allowed solutions}. Other root-finding\n *      algorithms can usually only guarantee that the solution (the root that\n *      was found) is around the actual root.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eFor backwards compatibility, all root-finding algorithms must have\n * {@link AllowedSolution#ANY_SIDE ANY_SIDE} as default for the allowed\n * solutions.\u003c/p\u003e\n * @param \u003cFUNC\u003e Type of function to solve.\n *\n * @see AllowedSolution\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver.solve(int, FUNC, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 68,
      "end_line": 69,
      "comment": "\n     * Solve for a zero in the given interval.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return A value where the function is zero.\n     * @throws org.apache.commons.math3.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver.solve(int, FUNC, double, double, double, org.apache.commons.math3.analysis.solvers.AllowedSolution)",
      "begin_line": 90,
      "end_line": 91,
      "comment": "\n     * Solve for a zero in the given interval, start at {@code startValue}.\n     * A solver may require that the interval brackets a single zero root.\n     * Solvers that do require bracketing should be able to handle the case\n     * where one of the endpoints is itself a root.\n     *\n     * @param maxEval Maximum number of evaluations.\n     * @param f Function to solve.\n     * @param min Lower bound for the interval.\n     * @param max Upper bound for the interval.\n     * @param startValue Start value to use.\n     * @param allowedSolution The kind of solutions that the root-finding algorithm may\n     * accept as solutions.\n     * @return A value where the function is zero.\n     * @throws org.apache.commons.math3.exception.MathIllegalArgumentException\n     * if the arguments do not satisfy the requirements specified by the solver.\n     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException if\n     * the allowed number of evaluations is exceeded.\n     ",
      "child_ranges": []
    }
  ]
}