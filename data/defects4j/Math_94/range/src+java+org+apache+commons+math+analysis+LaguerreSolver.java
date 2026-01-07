{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 37,
      "end_line": 369,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\n * ISBN 048641454X, chapter 8.\n * \u003cp\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 45,
      "end_line": 46,
      "comment": " polynomial function to solve.\n     * @deprecated as of 2.0 the function is not stored anymore in the instance\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 58,
      "end_line": 67,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @throws IllegalArgumentException if function is not polynomial\n     * @deprecated as of 2.0 the function to solve is passed as an argument\n     * to the {@link #solve(UnivariateRealFunction, double, double)} or\n     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}\n     * method.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 28)",
        "(line 62,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.LaguerreSolver()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Construct a solver.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Returns a copy of the polynomial function.\n     * \n     * @return a fresh copy of the polynomial function\n     * @deprecated as of 2.0 the function is not stored anymore within the instance.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double)",
      "begin_line": 88,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double, double)",
      "begin_line": 95,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, double)",
      "begin_line": 117,
      "end_line": 134,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\u003c/p\u003e\n     * \n     * @param f function to solve (must be polynomial)\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 48)",
        "(line 123,col 9)-(line 123,col 48)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 155,
      "end_line": 192,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Despite the bracketing condition, the root returned by solve(Complex[],\n     * Complex) may not be a real zero inside [min, max]. For example,\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\n     * another initial value, or, as we did here, call solveAll() to obtain\n     * all roots and pick up the one that we\u0027re looking for.\u003c/p\u003e\n     *\n     * @param f the function to solve\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 48)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 169,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 170,col 55)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 62)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 188,col 9)",
        "(line 191,col 9)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Returns true iff the given complex root is actually a real zero\n     * in the given interval, within the solver tolerance level.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param z the complex root\n     * @return true iff z is the sought-after real zero\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 82)",
        "(line 205,col 9)-(line 207,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 223,
      "end_line": 232,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 227,col 46)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 247,
      "end_line": 281,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 40)",
        "(line 251,col 9)-(line 251,col 31)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 30)",
        "(line 279,col 9)-(line 279,col 45)",
        "(line 280,col 9)-(line 280,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 296,
      "end_line": 368,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 40)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 48)",
        "(line 305,col 9)-(line 305,col 53)",
        "(line 307,col 9)-(line 307,col 18)",
        "(line 308,col 9)-(line 308,col 26)",
        "(line 309,col 9)-(line 309,col 26)",
        "(line 310,col 9)-(line 310,col 27)",
        "(line 311,col 9)-(line 311,col 25)",
        "(line 312,col 9)-(line 312,col 26)",
        "(line 313,col 9)-(line 313,col 25)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 35)",
        "(line 316,col 9)-(line 316,col 28)",
        "(line 317,col 9)-(line 317,col 87)",
        "(line 318,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 72)"
      ]
    }
  ]
}