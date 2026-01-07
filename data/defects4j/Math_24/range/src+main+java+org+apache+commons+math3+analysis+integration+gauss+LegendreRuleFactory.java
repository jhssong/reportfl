{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/LegendreRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreRuleFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 34,
      "end_line": 149,
      "comment": "\n * Factory that creates Gauss-type quadrature rule using Legendre polynomials.\n * In this implementation, the lower and upper bounds of the natural interval\n * of integration are -1 and 1, respectively.\n * The Legendre polynomials are evaluated using the recurrence relation\n * presented in \u003ca href\u003d\"http://en.wikipedia.org/wiki/Abramowitz_and_Stegun\"\n * Abramowitz and Stegun, 1964\u003c/a\u003e.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreRuleFactory.computeRule(int)",
      "begin_line": 40,
      "end_line": 148,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws NotStrictlyPositiveException if {@code numberOfPoints \u003c 1}.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 45,col 9)",
        "(line 47,col 9)-(line 51,col 9)",
        "(line 56,col 9)-(line 56,col 87)",
        "(line 59,col 9)-(line 59,col 59)",
        "(line 60,col 9)-(line 60,col 60)",
        "(line 63,col 9)-(line 63,col 44)",
        "(line 64,col 9)-(line 130,col 9)",
        "(line 135,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 61)"
      ]
    }
  ]
}