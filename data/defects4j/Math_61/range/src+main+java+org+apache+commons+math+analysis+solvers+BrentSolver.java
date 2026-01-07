{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 35,
      "end_line": 347,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for  finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ABSOLUTE_ACCURACY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Default absolute accuracy\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXIMUM_ITERATIONS"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Default maximum number of iterations\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 72)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Construct a solver with default properties.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(double)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Construct a solver with the given absolute accuracy.\n     *\n     * @param absoluteAccuracy lower bound for absolute accuracy of solutions returned by the solver\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(int, double)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Contstruct a solver with the given maximum iterations and absolute accuracy.\n     *\n     * @param maximumIterations maximum number of iterations\n     * @param absoluteAccuracy lower bound for absolute accuracy of solutions returned by the solver\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(double, double)",
      "begin_line": 94,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(double, double, double)",
      "begin_line": 101,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 127,
      "end_line": 172,
      "comment": "\n     * Find a zero in the given interval with an initial guess.\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the values of the\n     * function at the three points have the same sign (note that it is\n     * allowed to have endpoints with the same sign if the initial point has\n     * opposite sign function-wise).\u003c/p\u003e\n     *\n     * @param f function to solve.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (must be set to min if no\n     * initial point is known).\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if initial is not between min and max\n     * (even if it \u003cem\u003eis\u003c/em\u003e a root)\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 22)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 43)",
        "(line 140,col 9)-(line 143,col 9)",
        "(line 146,col 9)-(line 146,col 35)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 158,col 35)",
        "(line 159,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 170,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 191,
      "end_line": 232,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Requires that the values of the function at the endpoints have opposite\n     * signs. An \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown if this is not\n     * the case.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 197,col 33)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 35)",
        "(line 205,col 9)-(line 205,col 34)",
        "(line 206,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 231,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)",
      "begin_line": 251,
      "end_line": 346,
      "comment": "\n     * Find a zero starting search according to the three provided points.\n     * @param f the function to solve\n     * @param x0 old approximation for the root\n     * @param y0 function value at the approximation for the root\n     * @param x1 last calculated approximation for the root\n     * @param y1 function value at the last calculated approximation\n     * for the root\n     * @param x2 bracket point (must be set to x0 if no bracket point is\n     * known, this will force starting with linear interpolation)\n     * @param y2 function value at the bracket point.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 258,col 32)",
        "(line 260,col 9)-(line 260,col 18)",
        "(line 261,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 72)"
      ]
    }
  ]
}