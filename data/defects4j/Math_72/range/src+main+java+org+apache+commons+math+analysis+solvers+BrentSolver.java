{
  "filepath": "/tmp/Math-72b/src/main/java/org/apache/commons/math/analysis/solvers/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 33,
      "end_line": 319,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for  finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *\n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_BRACKETING_MESSAGE"
      ],
      "begin_line": 36,
      "end_line": 38,
      "comment": " Error message for non-bracketing interval. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.BrentSolver()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(double, double, double)",
      "begin_line": 72,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 98,
      "end_line": 144,
      "comment": "\n     * Find a zero in the given interval with an initial guess.\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the values of the\n     * function at the three points have the same sign (note that it is\n     * allowed to have endpoints with the same sign if the initial point has\n     * opposite sign function-wise).\u003c/p\u003e\n     *\n     * @param f function to solve.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (must be set to min if no\n     * initial point is known).\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if initial is not between min and max\n     * (even if it \u003cem\u003eis\u003c/em\u003e a root)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 103,col 42)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 107,col 9)-(line 110,col 9)",
        "(line 113,col 9)-(line 113,col 35)",
        "(line 114,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 35)",
        "(line 126,col 9)-(line 129,col 9)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 139,col 9)",
        "(line 142,col 9)-(line 142,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 163,
      "end_line": 204,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Requires that the values of the function at the endpoints have opposite\n     * signs. An \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown if this is not\n     * the case.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 169,col 33)",
        "(line 171,col 9)-(line 171,col 32)",
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 35)",
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)",
      "begin_line": 223,
      "end_line": 318,
      "comment": "\n     * Find a zero starting search according to the three provided points.\n     * @param f the function to solve\n     * @param x0 old approximation for the root\n     * @param y0 function value at the approximation for the root\n     * @param x1 last calculated approximation for the root\n     * @param y1 function value at the last calculated approximation\n     * for the root\n     * @param x2 bracket point (must be set to x0 if no bracket point is\n     * known, this will force starting with linear interpolation)\n     * @param y2 function value at the bracket point.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 31)",
        "(line 230,col 9)-(line 230,col 32)",
        "(line 232,col 9)-(line 232,col 18)",
        "(line 233,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 72)"
      ]
    }
  ]
}