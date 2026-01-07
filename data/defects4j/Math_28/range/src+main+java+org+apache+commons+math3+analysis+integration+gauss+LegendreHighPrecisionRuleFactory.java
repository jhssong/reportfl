{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/LegendreHighPrecisionRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreHighPrecisionRuleFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003cjava.math.BigDecimal\u003e"
      ],
      "begin_line": 34,
      "end_line": 211,
      "comment": "\n * Factory that creates Gauss-type quadrature rule using Legendre polynomials.\n * In this implementation, the lower and upper bounds of the natural interval\n * of integration are -1 and 1, respectively.\n * The Legendre polynomials are evaluated using the recurrence relation\n * presented in \u003ca href\u003d\"http://en.wikipedia.org/wiki/Abramowitz_and_Stegun\"\n * Abramowitz and Stegun, 1964\u003c/a\u003e.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "mContext"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Settings for enhanced precision computations. "
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The number {@code 2}. "
    },
    {
      "type": "field",
      "varNames": [
        "minusOne"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The number {@code -1}. "
    },
    {
      "type": "field",
      "varNames": [
        "oneHalf"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The number {@code 0.5}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.LegendreHighPrecisionRuleFactory()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Default precision is {@link MathContext#DECIMAL128 DECIMAL128}.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.LegendreHighPrecisionRuleFactory(java.math.MathContext)",
      "begin_line": 54,
      "end_line": 59,
      "comment": "\n     * @param mContext Precision setting for computing the quadrature rules.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 57,col 50)",
        "(line 58,col 9)-(line 58,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.computeRule(int)",
      "begin_line": 64,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 70,col 9)",
        "(line 75,col 9)-(line 75,col 91)",
        "(line 78,col 9)-(line 78,col 67)",
        "(line 79,col 9)-(line 79,col 68)",
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 207,col 9)",
        "(line 209,col 9)-(line 209,col 69)"
      ]
    }
  ]
}