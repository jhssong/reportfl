{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/analysis/integration/RombergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RombergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 37,
      "end_line": 120,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RombergIntegration.html\"\u003e\n * Romberg Algorithm\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * Romberg integration employs k successive refinements of the trapezoid\n * rule to remove error terms less than order O(N^(-2k)). Simpson\u0027s rule\n * is a special case of k \u003d 2.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.RombergIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Construct an integrator for the given function.\n     *\n     * @param f function to integrate\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.RombergIntegrator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.integrate(double, double)",
      "begin_line": 59,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 66,
      "end_line": 107,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)",
        "(line 71,col 9)-(line 71,col 45)",
        "(line 72,col 9)-(line 72,col 45)",
        "(line 74,col 9)-(line 74,col 22)",
        "(line 75,col 9)-(line 75,col 33)",
        "(line 76,col 9)-(line 76,col 31)",
        "(line 78,col 9)-(line 78,col 62)",
        "(line 79,col 9)-(line 79,col 52)",
        "(line 80,col 9)-(line 80,col 36)",
        "(line 81,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.verifyIterationCount()",
      "begin_line": 110,
      "end_line": 119,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 37)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    }
  ]
}