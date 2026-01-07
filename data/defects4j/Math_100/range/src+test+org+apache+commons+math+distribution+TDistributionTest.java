{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/distribution/TDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 26,
      "end_line": 106,
      "comment": "\n * Test cases for TDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.TDistributionTest(java.lang.String)",
      "begin_line": 32,
      "end_line": 34,
      "comment": "\n     * Constructor for TDistributionTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 33,col 9)-(line 33,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeDistribution()",
      "begin_line": 39,
      "end_line": 41,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 44,
      "end_line": 49,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestValues()",
      "begin_line": 52,
      "end_line": 55,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 53,col 9)-(line 54,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.setUp()",
      "begin_line": 58,
      "end_line": 61,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)",
        "(line 60,col 9)-(line 60,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testCumulativeProbabilityAgaintStackOverflow()",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * @see \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d27243\"\u003e\n     *      Bug report that prompted this unit test.\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 57)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 71,col 9)-(line 71,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testSmallDf()",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 51)",
        "(line 76,col 9)-(line 76,col 27)",
        "(line 78,col 9)-(line 80,col 33)",
        "(line 81,col 9)-(line 81,col 66)",
        "(line 82,col 9)-(line 82,col 40)",
        "(line 83,col 9)-(line 83,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 89,col 83)",
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testDfAccessors()",
      "begin_line": 93,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 71)",
        "(line 95,col 9)-(line 95,col 79)",
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 79)",
        "(line 98,col 9)-(line 103,col 9)"
      ]
    }
  ]
}