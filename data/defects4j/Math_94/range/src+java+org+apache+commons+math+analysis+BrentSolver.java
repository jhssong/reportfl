{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/BrentSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BrentSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 31,
      "end_line": 312,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/BrentsMethod.html\"\u003e\n * Brent algorithm\u003c/a\u003e for  finding zeros of real univariate functions.\n * \u003cp\u003e\n * The function should be continuous but not necessarily smooth.\u003c/p\u003e\n *  \n * @version $Revision:670469 $ $Date:2008-06-23 10:01:38 +0200 (lun., 23 juin 2008) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BrentSolver.BrentSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct a solver for the given function.\n     * \n     * @param f function to solve.\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.BrentSolver.BrentSolver()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double)",
      "begin_line": 58,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(double, double, double)",
      "begin_line": 65,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 91,
      "end_line": 135,
      "comment": "\n     * Find a zero in the given interval with an initial guess.\n     * \u003cp\u003eThrows \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the values of the\n     * function at the three points have the same sign (note that it is\n     * allowed to have endpoints with the same sign if the initial point has\n     * opposite sign function-wise).\u003c/p\u003e\n     * \n     * @param f function to solve.\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @param initial the start value to use (must be set to min if no\n     * initial point is known).\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException the maximum iteration count\n     * is exceeded \n     * @throws FunctionEvaluationException if an error occurs evaluating\n     *  the function\n     * @throws IllegalArgumentException if initial is not between min and max\n     * (even if it \u003cem\u003eis\u003c/em\u003e a root)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 99,col 9)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 109,col 35)",
        "(line 110,col 9)-(line 113,col 9)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 121,col 9)-(line 121,col 35)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 133,col 9)-(line 133,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 154,
      "end_line": 197,
      "comment": "\n     * Find a zero in the given interval.\n     * \u003cp\u003e\n     * Requires that the values of the function at the endpoints have opposite\n     * signs. An \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown if this is not\n     * the case.\u003c/p\u003e\n     * \n     * @param f the function to solve\n     * @param min the lower bound for the interval.\n     * @param max the upper bound for the interval.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if min is not less than max or the\n     * signs of the values of the function at the endpoints are not opposites\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 22)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 165,col 9)-(line 165,col 35)",
        "(line 168,col 9)-(line 168,col 34)",
        "(line 169,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.BrentSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double, double, double, double)",
      "begin_line": 216,
      "end_line": 311,
      "comment": "\n     * Find a zero starting search according to the three provided points.\n     * @param f the function to solve\n     * @param x0 old approximation for the root\n     * @param y0 function value at the approximation for the root\n     * @param x1 last calculated approximation for the root\n     * @param y1 function value at the last calculated approximation\n     * for the root\n     * @param x2 bracket point (must be set to x0 if no bracket point is\n     * known, this will force starting with linear interpolation)\n     * @param y2 function value at the bracket point.\n     * @return the value where the function is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count\n     * is exceeded\n     * @throws FunctionEvaluationException if an error occurs evaluating\n     * the function \n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 31)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 225,col 9)-(line 225,col 18)",
        "(line 226,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 72)"
      ]
    }
  ]
}