{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/analysis/TrapezoidIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrapezoidIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 32,
      "end_line": 139,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/TrapezoidalRule.html\"\u003e\n * Trapezoidal Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * The function should be integrable.\n *  \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " intermediate result "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.TrapezoidIntegrator.TrapezoidIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.TrapezoidIntegrator.stage(double, double, int)",
      "begin_line": 65,
      "end_line": 86,
      "comment": "\n     * Compute the n-th stage integral of trapezoid rule. This function\n     * should only be called by API \u003ccode\u003eintegrate()\u003c/code\u003e in the package.\n     * To save time it does not verify arguments - caller does.\n     * \u003cp\u003e\n     * The interval is divided equally into 2^n sections rather than an\n     * arbitrary m sections because this configuration can best utilize the\n     * alrealy computed values.\n     *\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the stage of 1/2 refinement, n \u003d 0 is no refinement\n     * @return the value of n-th stage integral\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 19)",
        "(line 69,col 9)-(line 69,col 35)",
        "(line 71,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.TrapezoidIntegrator.integrate(double, double)",
      "begin_line": 100,
      "end_line": 123,
      "comment": "\n     * Integrate the function in the given interval.\n     * \n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @return the value of integral\n     * @throws MaxIterationsExceededException if the maximum iteration count is exceeded\n     * or the integrator detects convergence problems otherwise\n     * @throws FunctionEvaluationException if an error occurs evaluating the\n     * function\n     * @throws IllegalArgumentException if any parameters are invalid\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 18)",
        "(line 104,col 9)-(line 104,col 23)",
        "(line 106,col 9)-(line 106,col 22)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 31)",
        "(line 110,col 9)-(line 110,col 34)",
        "(line 111,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.TrapezoidIntegrator.verifyIterationCount()",
      "begin_line": 130,
      "end_line": 138,
      "comment": "\n     * Verifies that the iteration limits are valid and within the range.\n     * \n     * @throws IllegalArgumentException if not\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)",
        "(line 133,col 9)-(line 137,col 9)"
      ]
    }
  ]
}