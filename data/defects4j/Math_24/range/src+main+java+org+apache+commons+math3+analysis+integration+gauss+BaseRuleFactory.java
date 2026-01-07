{
  "filepath": "/tmp/Math-24b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/BaseRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseRuleFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 135,
      "comment": "\n * Base class for rules that determines the integration nodes and their\n * weights.\n * Subclasses must implement the {@link #computeRule(int) computeRule} method.\n *\n * @param \u003cT\u003e Type of the number used to represent the points and weights of\n * the quadrature rules.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeights"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": " List of points and weights, indexed by the order of the rule. "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeightsDouble"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": " Cache for double-precision rules. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRule(int)",
      "begin_line": 49,
      "end_line": 67,
      "comment": "\n     * Gets a copy of the quadrature rule with given number of integration points.\n     *\n     * @param numberOfPoints Number of integration points.\n     * @return a copy of the integration rule.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 85)",
        "(line 53,col 9)-(line 62,col 9)",
        "(line 65,col 9)-(line 66,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRuleInternal(int)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "\n     * Gets a rule.\n     * Synchronization ensures that rules will be computed and added to the\n     * cache at most once.\n     * The returned rule is a reference into the cache.\n     *\n     * @param numberOfPoints Order of the rule to be retrieved.\n     * @return the points and weights corresponding to the given order.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 73)",
        "(line 80,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.addRule(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Stores a rule.\n     *\n     * @param rule Rule to be stored.\n     * @throws DimensionMismatchException if the elements of the pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.computeRule(int)",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Computes the rule for the given order.\n     *\n     * @param numberOfPoints Order of the rule to be computed.\n     * @return the computed rule.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.convertToDouble(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 120,
      "end_line": 134,
      "comment": "\n     * Converts the from the actual {@code Number} type to {@code double}\n     *\n     * @param \u003cT\u003e Type of the number used to represent the points and\n     * weights of the quadrature rules.\n     * @param rule Points and weights.\n     * @return points and weights as {@code double}s.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 39)",
        "(line 122,col 9)-(line 122,col 40)",
        "(line 124,col 9)-(line 124,col 34)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 128,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 52)"
      ]
    }
  ]
}