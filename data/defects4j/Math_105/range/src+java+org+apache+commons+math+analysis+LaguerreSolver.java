{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/analysis/LaguerreSolver.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LaguerreSolver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealSolverImpl"
      ],
      "begin_line": 34,
      "end_line": 325,
      "comment": "\r\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/LaguerresMethod.html\"\u003e\r\n * Laguerre\u0027s Method\u003c/a\u003e for root finding of real coefficient polynomials.\r\n * For reference, see \u003cb\u003eA First Course in Numerical Analysis\u003c/b\u003e,\r\n * ISBN 048641454X, chapter 8.\r\n * \u003cp\u003e\r\n * Laguerre\u0027s method is global in the sense that it can start with any initial\r\n * approximation and be able to solve all roots from that point.\r\n *\r\n * @version $Revision$ $Date$\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " polynomial function to solve "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.LaguerreSolver(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 48,
      "end_line": 57,
      "comment": "\r\n     * Construct a solver for the given function.\r\n     *\r\n     * @param f function to solve\r\n     * @throws IllegalArgumentException if function is not polynomial\r\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 28)",
        "(line 52,col 9)-(line 56,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.getPolynomialFunction()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\r\n     * Returns a copy of the polynomial function.\r\n     * \r\n     * @return a fresh copy of the polynomial function\r\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double, double)",
      "begin_line": 83,
      "end_line": 98,
      "comment": "\r\n     * Find a real root in the given interval with initial value.\r\n     * \u003cp\u003e\r\n     * Requires bracketing condition.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function\r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 89,col 56)",
        "(line 91,col 9)-(line 91,col 38)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(double, double)",
      "begin_line": 118,
      "end_line": 149,
      "comment": "\r\n     * Find a real root in the given interval.\r\n     * \u003cp\u003e\r\n     * Despite the bracketing condition, the root returned by solve(Complex[],\r\n     * Complex) may not be a real zero inside [min, max]. For example,\r\n     * p(x) \u003d x^3 + 1, min \u003d -2, max \u003d 2, initial \u003d 0. We can either try\r\n     * another initial value, or, as we did here, call solveAll() to obtain\r\n     * all roots and pick up the one that we\u0027re looking for.\r\n     *\r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 48)",
        "(line 123,col 9)-(line 123,col 48)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 62)",
        "(line 132,col 9)-(line 132,col 38)",
        "(line 133,col 9)-(line 136,col 9)",
        "(line 139,col 9)-(line 139,col 46)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 148,col 9)-(line 148,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.isRootOK(double, double, org.apache.commons.math.complex.Complex)",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\r\n     * Returns true iff the given complex root is actually a real zero\r\n     * in the given interval, within the solver tolerance level.\r\n     * \r\n     * @param min the lower bound for the interval\r\n     * @param max the upper bound for the interval\r\n     * @param z the complex root\r\n     * @return true iff z is the sought-after real zero\r\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 82)",
        "(line 162,col 9)-(line 164,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(double[], double)",
      "begin_line": 180,
      "end_line": 189,
      "comment": "\r\n     * Find all complex roots for the polynomial with the given coefficients,\r\n     * starting from the given initial value.\r\n     * \r\n     * @param coefficients the polynomial coefficients array\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 55)",
        "(line 184,col 9)-(line 184,col 46)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solveAll(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 204,
      "end_line": 238,
      "comment": "\r\n     * Find all complex roots for the polynomial with the given coefficients,\r\n     * starting from the given initial value.\r\n     * \r\n     * @param coefficients the polynomial coefficients array\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 40)",
        "(line 208,col 9)-(line 208,col 31)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 39)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 219,col 9)-(line 219,col 40)",
        "(line 220,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 30)",
        "(line 236,col 9)-(line 236,col 45)",
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.LaguerreSolver.solve(org.apache.commons.math.complex.Complex[], org.apache.commons.math.complex.Complex)",
      "begin_line": 253,
      "end_line": 324,
      "comment": "\r\n     * Find a complex root for the polynomial with the given coefficients,\r\n     * starting from the given initial value.\r\n     * \r\n     * @param coefficients the polynomial coefficients array\r\n     * @param initial the start value to use\r\n     * @return the point at which the function value is zero\r\n     * @throws ConvergenceException if the maximum iteration count is exceeded\r\n     * or the solver detects convergence problems otherwise\r\n     * @throws FunctionEvaluationException if an error occurs evaluating the\r\n     * function \r\n     * @throws IllegalArgumentException if any parameters are invalid\r\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 40)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 48)",
        "(line 262,col 9)-(line 262,col 53)",
        "(line 264,col 9)-(line 264,col 18)",
        "(line 265,col 9)-(line 265,col 26)",
        "(line 266,col 9)-(line 266,col 26)",
        "(line 267,col 9)-(line 267,col 27)",
        "(line 268,col 9)-(line 268,col 25)",
        "(line 269,col 9)-(line 269,col 26)",
        "(line 270,col 9)-(line 270,col 25)",
        "(line 271,col 9)-(line 271,col 29)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 28)",
        "(line 274,col 9)-(line 274,col 87)",
        "(line 275,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 81)"
      ]
    }
  ]
}