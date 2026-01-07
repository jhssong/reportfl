{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/analysis/integration/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 36,
      "end_line": 118,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\u003c/p\u003e\n *  \n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Construct an integrator for the given function.\n     * \n     * @param f function to integrate\n     * @deprecated as of 2.0 the integrand function is passed as an argument\n     * to the {@link #integrate(UnivariateRealFunction, double, double)}method.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.integrate(double, double)",
      "begin_line": 61,
      "end_line": 65,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 68,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 18)",
        "(line 73,col 9)-(line 73,col 32)",
        "(line 75,col 9)-(line 75,col 22)",
        "(line 76,col 9)-(line 76,col 33)",
        "(line 77,col 9)-(line 77,col 31)",
        "(line 79,col 9)-(line 79,col 62)",
        "(line 80,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 17)",
        "(line 87,col 9)-(line 87,col 43)",
        "(line 88,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.verifyIterationCount()",
      "begin_line": 108,
      "end_line": 117,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 37)",
        "(line 112,col 9)-(line 116,col 9)"
      ]
    }
  ]
}