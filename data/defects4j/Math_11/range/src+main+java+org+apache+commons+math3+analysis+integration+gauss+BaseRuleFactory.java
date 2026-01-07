{
  "filepath": "/tmp/Math-11b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/BaseRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseRuleFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 141,
      "comment": "\n * Base class for rules that determines the integration nodes and their\n * weights.\n * Subclasses must implement the {@link #computeRule(int) computeRule} method.\n *\n * @param \u003cT\u003e Type of the number used to represent the points and weights of\n * the quadrature rules.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeights"
      ],
      "begin_line": 38,
      "end_line": 39,
      "comment": " List of points and weights, indexed by the order of the rule. "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeightsDouble"
      ],
      "begin_line": 41,
      "end_line": 42,
      "comment": " Cache for double-precision rules. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRule(int)",
      "begin_line": 52,
      "end_line": 71,
      "comment": "\n     * Gets a copy of the quadrature rule with the given number of integration\n     * points.\n     *\n     * @param numberOfPoints Number of integration points.\n     * @return a copy of the integration rule.\n     * @throws NotStrictlyPositiveException if {@code numberOfPoints \u003c 1}.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 85)",
        "(line 57,col 9)-(line 66,col 9)",
        "(line 69,col 9)-(line 70,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRuleInternal(int)",
      "begin_line": 83,
      "end_line": 92,
      "comment": "\n     * Gets a rule.\n     * Synchronization ensures that rules will be computed and added to the\n     * cache at most once.\n     * The returned rule is a reference into the cache.\n     *\n     * @param numberOfPoints Order of the rule to be retrieved.\n     * @return the points and weights corresponding to the given order.\n     * @throws NotStrictlyPositiveException if {@code numberOfPoints \u003c 1}.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 73)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.addRule(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "\n     * Stores a rule.\n     *\n     * @param rule Rule to be stored.\n     * @throws DimensionMismatchException if the elements of the pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.computeRule(int)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Computes the rule for the given order.\n     *\n     * @param numberOfPoints Order of the rule to be computed.\n     * @return the computed rule.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.convertToDouble(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 126,
      "end_line": 140,
      "comment": "\n     * Converts the from the actual {@code Number} type to {@code double}\n     *\n     * @param \u003cT\u003e Type of the number used to represent the points and\n     * weights of the quadrature rules.\n     * @param rule Points and weights.\n     * @return points and weights as {@code double}s.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 39)",
        "(line 128,col 9)-(line 128,col 40)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 134,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 52)"
      ]
    }
  ]
}