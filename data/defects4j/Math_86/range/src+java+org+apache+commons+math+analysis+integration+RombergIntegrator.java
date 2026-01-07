{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/analysis/integration/RombergIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RombergIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 37,
      "end_line": 119,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/RombergIntegration.html\"\u003e\n * Romberg Algorithm\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * Romberg integration employs k successive refinements of the trapezoid\n * rule to remove error terms less than order O(N^(-2k)). Simpson\u0027s rule\n * is a special case of k \u003d 2.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.RombergIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.RombergIntegrator()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.integrate(double, double)",
      "begin_line": 62,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 69,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 52)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 78,col 9)-(line 78,col 22)",
        "(line 79,col 9)-(line 79,col 33)",
        "(line 80,col 9)-(line 80,col 31)",
        "(line 82,col 9)-(line 82,col 62)",
        "(line 83,col 9)-(line 83,col 46)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.RombergIntegrator.verifyIterationCount()",
      "begin_line": 109,
      "end_line": 118,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 37)",
        "(line 113,col 9)-(line 117,col 9)"
      ]
    }
  ]
}