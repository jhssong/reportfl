{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/analysis/integration/gauss/BaseRuleFactoryTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BaseRuleFactoryTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 67,
      "comment": "\n * Test for {@link BaseRuleFactory}.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactoryTest.testConcurrentCreation()",
      "begin_line": 42,
      "end_line": 66,
      "comment": "\n     * Tests that a given rule rule will be computed and added once to the cache\n     * whatever the number of times this rule is called concurrently.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 32)",
        "(line 48,col 9)-(line 50,col 74)",
        "(line 52,col 9)-(line 53,col 64)",
        "(line 54,col 9)-(line 56,col 9)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 81)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RuleBuilder",
      "is_interface": false,
      "parent_types": [
        "java.util.concurrent.Callable\u003corg.apache.commons.math3.util.Pair\u003cdouble[], double[]\u003e\u003e"
      ],
      "begin_line": 69,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.RuleBuilder.call()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)",
        "(line 74,col 9)-(line 74,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.RuleBuilder.getNumberOfCalls()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 42)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyRuleFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.analysis.integration.gauss.BaseRuleFactory\u003cjava.lang.Double\u003e"
      ],
      "begin_line": 82,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nCalls"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Rule computations counter. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.DummyRuleFactory.computeRule(int)",
      "begin_line": 86,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)",
        "(line 91,col 9)-(line 96,col 9)",
        "(line 99,col 9)-(line 99,col 45)",
        "(line 100,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.integration.gauss.DummyRuleFactory.getNumberOfCalls()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 28)"
      ]
    }
  ]
}