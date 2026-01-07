{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/analysis/solvers/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 39,
      "end_line": 371,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\n * ISBN 048641454X, chapter 8.\n * \u003cp\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 47,
      "end_line": 48,
      "comment": " polynomial function to solve.\n     * @deprecated as of 2.0 the function is not stored anymore in the instance\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @throws IllegalArgumentException if function is not polynomial\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 28)",
        "(line 64,col 9)-(line 68,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Returns a copy of the polynomial function.\n     * \n     * @return a fresh copy of the polynomial function\n     * @deprecated as of 2.0 the function is not stored anymore within the instance.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double)",
      "begin_line": 90,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double, double)",
      "begin_line": 97,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 119,
      "end_line": 136,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f function to solve (must be polynomial)\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 48)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 129,col 42)",
        "(line 130,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 157,
      "end_line": 194,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Despite the bracketing condition, the root returned by solve(Complex[],\n     * Complex) may not be a real zero inside [min, max]. For example,\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\n     * another initial value, or, as we did here, call solveAll() to obtain\n     * all roots and pick up the one that we\u0027re looking for.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 48)",
        "(line 169,col 9)-(line 169,col 38)",
        "(line 171,col 9)-(line 171,col 75)",
        "(line 172,col 9)-(line 172,col 55)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 178,col 9)-(line 181,col 9)",
        "(line 184,col 9)-(line 184,col 46)",
        "(line 185,col 9)-(line 190,col 9)",
        "(line 193,col 9)-(line 193,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * Returns true iff the given complex root is actually a real zero\n     * in the given interval, within the solver tolerance level.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param z the complex root\n     * @return true iff z is the sought-after real zero\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 82)",
        "(line 207,col 9)-(line 209,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 225,
      "end_line": 234,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 55)",
        "(line 229,col 9)-(line 229,col 46)",
        "(line 230,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 249,
      "end_line": 283,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 40)",
        "(line 253,col 9)-(line 253,col 31)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 39)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 264,col 9)-(line 264,col 40)",
        "(line 265,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 281,col 9)-(line 281,col 45)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 298,
      "end_line": 370,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 40)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 40)",
        "(line 307,col 9)-(line 307,col 45)",
        "(line 309,col 9)-(line 309,col 18)",
        "(line 310,col 9)-(line 310,col 26)",
        "(line 311,col 9)-(line 311,col 26)",
        "(line 312,col 9)-(line 312,col 27)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 314,col 26)",
        "(line 315,col 9)-(line 315,col 25)",
        "(line 316,col 9)-(line 316,col 29)",
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 28)",
        "(line 319,col 9)-(line 319,col 87)",
        "(line 320,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 72)"
      ]
    }
  ]
}