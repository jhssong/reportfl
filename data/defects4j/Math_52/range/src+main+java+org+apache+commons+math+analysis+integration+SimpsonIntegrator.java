{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/analysis/integration/SimpsonIntegrator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpsonIntegrator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.integration.UnivariateRealIntegratorImpl"
      ],
      "begin_line": 38,
      "end_line": 93,
      "comment": "\n * Implements the \u003ca href\u003d\"http://mathworld.wolfram.com/SimpsonsRule.html\"\u003e\n * Simpson\u0027s Rule\u003c/a\u003e for integration of real univariate functions. For\n * reference, see \u003cb\u003eIntroduction to Numerical Analysis\u003c/b\u003e, ISBN 038795452X,\n * chapter 3.\n * \u003cp\u003e\n * This implementation employs basic trapezoid rule as building blocks to\n * calculate the Simpson\u0027s rule of alternating 2/3 and 4/3.\u003c/p\u003e\n *\n * @version $Id$\n * @since 1.2\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.SimpsonIntegrator()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct an integrator.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.integrate(org.apache.commons.math.analysis.UnivariateRealFunction, double, double)",
      "begin_line": 48,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 22)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 31)",
        "(line 55,col 9)-(line 55,col 62)",
        "(line 56,col 9)-(line 60,col 9)",
        "(line 62,col 9)-(line 62,col 24)",
        "(line 63,col 9)-(line 63,col 50)",
        "(line 64,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.analysis.integration.SimpsonIntegrator.verifyIterationCount()",
      "begin_line": 83,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 37)",
        "(line 87,col 9)-(line 91,col 9)"
      ]
    }
  ]
}