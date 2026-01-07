{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/analysis/integration/RombergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RombergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 39,
      "end_line": 102,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RombergIntegration.html\"\u003e\n * Romberg Algorithm\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * Romberg integration employs k successive refinements of the trapezoid\n * rule to remove error terms less than order O(N^(-2k)). Simpson\u0027s rule\n * is a special case of k \u003d 2.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.RombergIntegrator()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 49,
      "end_line": 89,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 48)",
        "(line 53,col 9)-(line 53,col 45)",
        "(line 54,col 9)-(line 54,col 45)",
        "(line 56,col 9)-(line 56,col 22)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 31)",
        "(line 60,col 9)-(line 60,col 62)",
        "(line 61,col 9)-(line 61,col 52)",
        "(line 62,col 9)-(line 62,col 36)",
        "(line 63,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.verifyIterationCount()",
      "begin_line": 92,
      "end_line": 101,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 37)",
        "(line 96,col 9)-(line 100,col 9)"
      ]
    }
  ]
}