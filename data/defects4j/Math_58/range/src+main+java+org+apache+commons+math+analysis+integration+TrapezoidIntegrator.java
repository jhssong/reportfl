{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/analysis/integration/TrapezoidIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TrapezoidIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 37,
      "end_line": 141,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/TrapezoidalRule.html\"\u003e\n * Trapezoidal Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * The function should be integrable.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Intermediate result. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TrapezoidIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Construct an integrator for the given function.\n     *\n     * @param f function to integrate\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.TrapezoidIntegrator()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.stage(org.apache.commons.math.analysis.UnivariateRealFunction, double, double, int)",
      "begin_line": 77,
      "end_line": 97,
      "comment": "\n     * Compute the n-th stage integral of trapezoid rule. This function\n     * should only be called by API \u003ccode\u003eintegrate()\u003c/code\u003e in the package.\n     * To save time it does not verify arguments - caller does.\n     * \u003cp\u003e\n     * The interval is divided equally into 2^n sections rather than an\n     * arbitrary m sections because this configuration can best utilize the\n     * alrealy computed values.\u003c/p\u003e\n     *\n     * @param f the integrand function\n     * @param min the lower bound for the interval\n     * @param max the upper bound for the interval\n     * @param n the stage of 1/2 refinement, n \u003d 0 is no refinement\n     * @return the value of n-th stage integral\n     * @throws MathUserException if an error occurs evaluating the function\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.integrate(double, double)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 106,
      "end_line": 128,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 33)",
        "(line 111,col 9)-(line 111,col 31)",
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.TrapezoidIntegrator.verifyIterationCount()",
      "begin_line": 131,
      "end_line": 140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 37)",
        "(line 135,col 9)-(line 139,col 9)"
      ]
    }
  ]
}