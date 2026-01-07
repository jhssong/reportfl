{
  "filepath": "/tmp/Math-82b/src/main/java/org/apache/commons/math/analysis/solvers/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl"
      ],
      "begin_line": 39,
      "end_line": 367,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\n * ISBN 048641454X, chapter 8.\n * \u003cp\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": " polynomial function to solve.\n     * @deprecated as of 2.0 the function is not stored anymore in the instance\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 56,
      "end_line": 65,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @throws IllegalArgumentException if function is not polynomial\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 28)",
        "(line 60,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.LaguerreSolver()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Returns a copy of the polynomial function.\n     * \n     * @return a fresh copy of the polynomial function\n     * @deprecated as of 2.0 the function is not stored anymore within the instance.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double)",
      "begin_line": 86,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(double, double, double)",
      "begin_line": 93,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 115,
      "end_line": 132,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f function to solve (must be polynomial)\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 48)",
        "(line 121,col 9)-(line 121,col 48)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 125,col 9)-(line 125,col 42)",
        "(line 126,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 153,
      "end_line": 190,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Despite the bracketing condition, the root returned by solve(Complex[],\n     * Complex) may not be a real zero inside [min, max]. For example,\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\n     * another initial value, or, as we did here, call solveAll() to obtain\n     * all roots and pick up the one that we\u0027re looking for.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 163,col 48)",
        "(line 164,col 9)-(line 164,col 48)",
        "(line 165,col 9)-(line 165,col 38)",
        "(line 167,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 62)",
        "(line 173,col 9)-(line 173,col 38)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 189,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 201,
      "end_line": 206,
      "comment": "\n     * Returns true iff the given complex root is actually a real zero\n     * in the given interval, within the solver tolerance level.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param z the complex root\n     * @return true iff z is the sought-after real zero\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 82)",
        "(line 203,col 9)-(line 205,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 55)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 245,
      "end_line": 279,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 40)",
        "(line 249,col 9)-(line 249,col 31)",
        "(line 250,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 39)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 260,col 9)-(line 260,col 40)",
        "(line 261,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 30)",
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.solvers.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 294,
      "end_line": 366,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 40)",
        "(line 298,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 45)",
        "(line 305,col 9)-(line 305,col 18)",
        "(line 306,col 9)-(line 306,col 26)",
        "(line 307,col 9)-(line 307,col 26)",
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 26)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 28)",
        "(line 315,col 9)-(line 315,col 87)",
        "(line 316,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 72)"
      ]
    }
  ]
}