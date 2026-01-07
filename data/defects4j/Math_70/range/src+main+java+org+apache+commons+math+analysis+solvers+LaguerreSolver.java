{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/solvers/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 39,
      "end_line": 383,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\n * ISBN 048641454X, chapter 8.\n * \u003cp\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "NON_POLYNOMIAL_FUNCTION_MESSAGE"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Message for non-polynomial function. "
    },
    {
      "type": "field",
      "varNames": [
        "NON_POSITIVE_DEGREE_MESSAGE"
      ],
      "begin_line": 46,
      "end_line": 47,
      "comment": " Message for non-positive degree. "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 52,
      "end_line": 53,
      "comment": " polynomial function to solve.\n     * @deprecated as of 2.0 the function is not stored anymore in the instance\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 65,
      "end_line": 74,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @throws IllegalArgumentException if function is not polynomial\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 73,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "\n     * Returns a copy of the polynomial function.\n     *\n     * @return a fresh copy of the polynomial function\n     * @deprecated as of 2.0 the function is not stored anymore within the instance.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double)",
      "begin_line": 96,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double, double)",
      "begin_line": 103,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 125,
      "end_line": 148,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     *\n     * @param f function to solve (must be polynomial)\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 38)",
        "(line 141,col 9)-(line 141,col 42)",
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 169,
      "end_line": 206,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Despite the bracketing condition, the root returned by solve(Complex[],\n     * Complex) may not be a real zero inside [min, max]. For example,\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\n     * another initial value, or, as we did here, call solveAll() to obtain\n     * all roots and pick up the one that we\u0027re looking for.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 48)",
        "(line 180,col 9)-(line 180,col 48)",
        "(line 181,col 9)-(line 181,col 38)",
        "(line 183,col 9)-(line 183,col 75)",
        "(line 184,col 9)-(line 184,col 55)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 62)",
        "(line 189,col 9)-(line 189,col 38)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 196,col 9)-(line 196,col 46)",
        "(line 197,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * Returns true iff the given complex root is actually a real zero\n     * in the given interval, within the solver tolerance level.\n     *\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param z the complex root\n     * @return true iff z is the sought-after real zero\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 82)",
        "(line 219,col 9)-(line 221,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 237,
      "end_line": 246,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     *\n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 55)",
        "(line 241,col 9)-(line 241,col 46)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 261,
      "end_line": 295,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     *\n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 40)",
        "(line 265,col 9)-(line 265,col 31)",
        "(line 266,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 30)",
        "(line 293,col 9)-(line 293,col 45)",
        "(line 294,col 9)-(line 294,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 310,
      "end_line": 382,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     *\n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 40)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 45)",
        "(line 319,col 9)-(line 319,col 45)",
        "(line 321,col 9)-(line 321,col 18)",
        "(line 322,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 26)",
        "(line 324,col 9)-(line 324,col 27)",
        "(line 325,col 9)-(line 325,col 25)",
        "(line 326,col 9)-(line 326,col 26)",
        "(line 327,col 9)-(line 327,col 25)",
        "(line 328,col 9)-(line 328,col 29)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 331,col 87)",
        "(line 332,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 72)"
      ]
    }
  ]
}