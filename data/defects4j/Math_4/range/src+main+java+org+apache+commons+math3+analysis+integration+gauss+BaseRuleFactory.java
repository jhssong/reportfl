{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/analysis/integration/gauss/BaseRuleFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseRuleFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 154,
      "comment": "\n * Base class for rules that determines the integration nodes and their\n * weights.\n * Subclasses must implement the {@link #computeRule(int) computeRule} method.\n *\n * @param \u003cT\u003e Type of the number used to represent the points and weights of\n * the quadrature rules.\n *\n * @since 3.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeights"
      ],
      "begin_line": 39,
      "end_line": 40,
      "comment": " List of points and weights, indexed by the order of the rule. "
    },
    {
      "type": "field",
      "varNames": [
        "pointsAndWeightsDouble"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": " Cache for double-precision rules. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRule(int)",
      "begin_line": 55,
      "end_line": 80,
      "comment": "\n     * Gets a copy of the quadrature rule with the given number of integration\n     * points.\n     *\n     * @param numberOfPoints Number of integration points.\n     * @return a copy of the integration rule.\n     * @throws NotStrictlyPositiveException if {@code numberOfPoints \u003c 1}.\n     * @throws DimensionMismatchException if the elements of the rule pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 61,col 9)",
        "(line 64,col 9)-(line 64,col 85)",
        "(line 66,col 9)-(line 75,col 9)",
        "(line 78,col 9)-(line 79,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.getRuleInternal(int)",
      "begin_line": 93,
      "end_line": 102,
      "comment": "\n     * Gets a rule.\n     * Synchronization ensures that rules will be computed and added to the\n     * cache at most once.\n     * The returned rule is a reference into the cache.\n     *\n     * @param numberOfPoints Order of the rule to be retrieved.\n     * @return the points and weights corresponding to the given order.\n     * @throws DimensionMismatchException if the elements of the rule pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 73)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.addRule(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 111,
      "end_line": 118,
      "comment": "\n     * Stores a rule.\n     *\n     * @param rule Rule to be stored.\n     * @throws DimensionMismatchException if the elements of the pair do not\n     * have the same length.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.computeRule(int)",
      "begin_line": 128,
      "end_line": 129,
      "comment": "\n     * Computes the rule for the given order.\n     *\n     * @param numberOfPoints Order of the rule to be computed.\n     * @return the computed rule.\n     * @throws DimensionMismatchException if the elements of the pair do not\n     * have the same length.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory.convertToDouble(org.apache.commons.math3.util.Pair\u003cT[], T[]\u003e)",
      "begin_line": 139,
      "end_line": 153,
      "comment": "\n     * Converts the from the actual {@code Number} type to {@code double}\n     *\n     * @param \u003cT\u003e Type of the number used to represent the points and\n     * weights of the quadrature rules.\n     * @param rule Points and weights.\n     * @return points and weights as {@code double}s.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 39)",
        "(line 141,col 9)-(line 141,col 40)",
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 144,col 44)",
        "(line 145,col 9)-(line 145,col 44)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 52)"
      ]
    }
  ]
}