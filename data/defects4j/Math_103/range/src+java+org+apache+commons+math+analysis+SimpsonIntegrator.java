{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/analysis/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 33,
      "end_line": 108,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\n *  \n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.SimpsonIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.integrate(double, double)",
      "begin_line": 59,
      "end_line": 92,
      "comment": "\n     * Integrate the function in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 18)",
        "(line 63,col 9)-(line 63,col 32)",
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 31)",
        "(line 69,col 9)-(line 69,col 68)",
        "(line 70,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 17)",
        "(line 77,col 9)-(line 77,col 40)",
        "(line 78,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.SimpsonIntegrator.verifyIterationCount()",
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