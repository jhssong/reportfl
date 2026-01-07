{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/analysis/RombergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RombergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 33,
      "end_line": 108,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RombergIntegration.html\"\u003e\n * Romberg Algorithm\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * Romberg integration employs k successvie refinements of the trapezoid\n * rule to remove error terms less than order O(N^(-2k)). Simpson\u0027s rule\n * is a special case of k \u003d 2.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " serializable version identifier "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.RombergIntegrator.RombergIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RombergIntegrator.integrate(double, double)",
      "begin_line": 59,
      "end_line": 92,
      "comment": "\n     * Integrate the function in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws ConvergenceException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 52)",
        "(line 65,col 9)-(line 65,col 52)",
        "(line 67,col 9)-(line 67,col 22)",
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 31)",
        "(line 71,col 9)-(line 71,col 68)",
        "(line 72,col 9)-(line 72,col 43)",
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.RombergIntegrator.verifyIterationCount()",
      "begin_line": 99,
      "end_line": 107,
      "comment": "\n     * Verifies that the iteration limits are valid and within the range.\n     * \n     * @throws IllegalArgumentException if not\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 37)",
        "(line 102,col 9)-(line 106,col 9)"
      ]
    }
  ]
}