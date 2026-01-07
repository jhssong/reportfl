{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/analysis/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 36,
      "end_line": 327,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\n * ISBN 048641454X, chapter 8.\n * \u003cp\u003e\n * Laguerre\u0027s method is global in the sense that it can start with any initial\n * approximation and be able to solve all roots from that point.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " polynomial function to solve "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     * Construct a solver for the given function.\n     *\n     * @param f function to solve\n     * @throws IllegalArgumentException if function is not polynomial\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 28)",
        "(line 54,col 9)-(line 58,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Returns a copy of the polynomial function.\n     * \n     * @return a fresh copy of the polynomial function\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double, double)",
      "begin_line": 85,
      "end_line": 100,
      "comment": "\n     * Find a real root in the given interval with initial value.\n     * \u003cp\u003e\n     * Requires bracketing condition.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 48)",
        "(line 90,col 9)-(line 90,col 48)",
        "(line 91,col 9)-(line 91,col 56)",
        "(line 93,col 9)-(line 93,col 38)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double)",
      "begin_line": 120,
      "end_line": 151,
      "comment": "\n     * Find a real root in the given interval.\n     * \u003cp\u003e\n     * Despite the bracketing condition, the root returned by solve(Complex[],\n     * Complex) may not be a real zero inside [min, max]. For example,\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\n     * another initial value, or, as we did here, call solveAll() to obtain\n     * all roots and pick up the one that we\u0027re looking for.\n     *\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 48)",
        "(line 125,col 9)-(line 125,col 48)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 55)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 62)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 138,col 9)",
        "(line 141,col 9)-(line 141,col 46)",
        "(line 142,col 9)-(line 147,col 9)",
        "(line 150,col 9)-(line 150,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 162,
      "end_line": 167,
      "comment": "\n     * Returns true iff the given complex root is actually a real zero\n     * in the given interval, within the solver tolerance level.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param z the complex root\n     * @return true iff z is the sought-after real zero\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 82)",
        "(line 164,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 182,
      "end_line": 191,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 55)",
        "(line 186,col 9)-(line 186,col 46)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 206,
      "end_line": 240,
      "comment": "\n     * Find all complex roots for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 40)",
        "(line 210,col 9)-(line 210,col 31)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 39)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 40)",
        "(line 222,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 30)",
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 255,
      "end_line": 326,
      "comment": "\n     * Find a complex root for the polynomial with the given coefficients,\n     * starting from the given initial value.\n     * \n     * @param coefficients the polynomial coefficients array\n     * @param initial the start value to use\n     * @return the point at which the function value is zero\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the solver detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function \n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 40)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 48)",
        "(line 264,col 9)-(line 264,col 53)",
        "(line 266,col 9)-(line 266,col 18)",
        "(line 267,col 9)-(line 267,col 26)",
        "(line 268,col 9)-(line 268,col 26)",
        "(line 269,col 9)-(line 269,col 27)",
        "(line 270,col 9)-(line 270,col 25)",
        "(line 271,col 9)-(line 271,col 26)",
        "(line 272,col 9)-(line 272,col 25)",
        "(line 273,col 9)-(line 273,col 29)",
        "(line 274,col 9)-(line 274,col 35)",
        "(line 275,col 9)-(line 275,col 28)",
        "(line 276,col 9)-(line 276,col 87)",
        "(line 277,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 72)"
      ]
    }
  ]
}