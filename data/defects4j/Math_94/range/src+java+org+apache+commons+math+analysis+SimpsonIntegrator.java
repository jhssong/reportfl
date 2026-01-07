{
  "filepath": "/tmp/Math-94b/src/java/org/apache/commons/math/analysis/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 34,
      "end_line": 109,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.SimpsonIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.integrate(double, double)",
      "begin_line": 60,
      "end_line": 93,
      "comment": "\n     * Integrate the function in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 18)",
        "(line 64,col 9)-(line 64,col 32)",
        "(line 66,col 9)-(line 66,col 22)",
        "(line 67,col 9)-(line 67,col 33)",
        "(line 68,col 9)-(line 68,col 31)",
        "(line 70,col 9)-(line 70,col 68)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 17)",
        "(line 78,col 9)-(line 78,col 40)",
        "(line 79,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.verifyIterationCount()",
      "begin_line": 100,
      "end_line": 108,
      "comment": "\n     * Verifies that the iteration limits are valid and within the range.\n     * \n     * @throws IllegalArgumentException if not\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 37)",
        "(line 103,col 9)-(line 107,col 9)"
      ]
    }
  ]
}