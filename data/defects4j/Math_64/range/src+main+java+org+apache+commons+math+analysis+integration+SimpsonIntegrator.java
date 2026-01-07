{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/analysis/integration/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 37,
      "end_line": 112,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Construct an integrator for the given function.\n     *\n     * @param f function to integrate\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.integrate(double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 66,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 22)",
        "(line 71,col 9)-(line 71,col 33)",
        "(line 72,col 9)-(line 72,col 31)",
        "(line 74,col 9)-(line 74,col 62)",
        "(line 75,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 24)",
        "(line 82,col 9)-(line 82,col 50)",
        "(line 83,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.verifyIterationCount()",
      "begin_line": 102,
      "end_line": 111,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 37)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    }
  ]
}