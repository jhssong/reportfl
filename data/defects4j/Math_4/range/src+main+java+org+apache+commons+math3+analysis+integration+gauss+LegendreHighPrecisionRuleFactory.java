{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/LegendreHighPrecisionRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LegendreHighPrecisionRuleFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003cjava.math.BigDecimal\u003e"
      ],
      "begin_line": 36,
      "end_line": 216,
      "comment": "\n * Factory that creates Gauss-type quadrature rule using Legendre polynomials.\n * In this implementation, the lower and upper bounds of the natural interval\n * of integration are -1 and 1, respectively.\n * The Legendre polynomials are evaluated using the recurrence relation\n * presented in \u003ca href\u003d\"http://en.wikipedia.org/wiki/Abramowitz_and_Stegun\"\n * Abramowitz and Stegun, 1964\u003c/a\u003e.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "mContext"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Settings for enhanced precision computations. "
    },
    {
      "type": "field",
      "varNames": [
        "two"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The number {@code 2}. "
    },
    {
      "type": "field",
      "varNames": [
        "minusOne"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The number {@code -1}. "
    },
    {
      "type": "field",
      "varNames": [
        "oneHalf"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The number {@code 0.5}. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.LegendreHighPrecisionRuleFactory()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Default precision is {@link MathContext#DECIMAL128 DECIMAL128}.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.LegendreHighPrecisionRuleFactory(java.math.MathContext)",
      "begin_line": 56,
      "end_line": 61,
      "comment": "\n     * @param mContext Precision setting for computing the quadrature rules.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 44)",
        "(line 59,col 9)-(line 59,col 50)",
        "(line 60,col 9)-(line 60,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.LegendreHighPrecisionRuleFactory.computeRule(int)",
      "begin_line": 64,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 72,col 9)",
        "(line 77,col 9)-(line 77,col 91)",
        "(line 80,col 9)-(line 80,col 67)",
        "(line 81,col 9)-(line 81,col 68)",
        "(line 84,col 9)-(line 84,col 44)",
        "(line 85,col 9)-(line 187,col 9)",
        "(line 192,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 69)"
      ]
    }
  ]
}