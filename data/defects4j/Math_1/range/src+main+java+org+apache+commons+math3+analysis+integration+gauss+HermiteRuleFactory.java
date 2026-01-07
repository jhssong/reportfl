{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/HermiteRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HermiteRuleFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 53,
      "end_line": 179,
      "comment": "\n * Factory that creates a\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Gauss-Hermite_quadrature\"\u003e\n *  Gauss-type quadrature rule using Hermite polynomials\u003c/a\u003e\n * of the first kind.\n * Such a quadrature rule allows the calculation of improper integrals\n * of a function\n * \u003ccode\u003e\n *  f(x) e\u003csup\u003e-x\u003csup\u003e2\u003c/sup\u003e\u003c/sup\u003e\n * \u003c/code\u003e\n * \u003cbr/\u003e\n * Recurrence relation and weights computation follow\n * \u003ca href\u003d\"http://en.wikipedia.org/wiki/Abramowitz_and_Stegun\"\n * Abramowitz and Stegun, 1964\u003c/a\u003e.\n * \u003cbr/\u003e\n * The coefficients of the standard Hermite polynomials grow very rapidly;\n * in order to avoid overflows, each Hermite polynomial is normalized with\n * respect to the underlying scalar product.\n * The initial interval for the application of the bisection method is\n * based on the roots of the previous Hermite polynomial (interlacing).\n * Upper and lower bounds of these roots are provided by\n * \u003cquote\u003e\n *  I. Krasikov,\n *  \u003cem\u003eNonnegative quadratic forms and bounds on orthogonal polynomials\u003c/em\u003e,\n *  Journal of Approximation theory \u003cb\u003e111\u003c/b\u003e, 31-49\n * \u003c/quote\u003e\n *\n * @since 3.3\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT_PI"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " \u0026pi;\u003csup\u003e1/2\u003c/sup\u003e "
    },
    {
      "type": "field",
      "varNames": [
        "H0"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " \u0026pi;\u003csup\u003e-1/4\u003c/sup\u003e "
    },
    {
      "type": "field",
      "varNames": [
        "H1"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " \u0026pi;\u003csup\u003e-1/4\u003c/sup\u003e \u0026radic;2 "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.HermiteRuleFactory.computeRule(int)",
      "begin_line": 62,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 9)",
        "(line 75,col 9)-(line 75,col 53)",
        "(line 76,col 9)-(line 76,col 82)",
        "(line 79,col 9)-(line 79,col 59)",
        "(line 80,col 9)-(line 80,col 60)",
        "(line 82,col 9)-(line 82,col 82)",
        "(line 83,col 9)-(line 83,col 79)",
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 158,col 9)",
        "(line 164,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 61)"
      ]
    }
  ]
}