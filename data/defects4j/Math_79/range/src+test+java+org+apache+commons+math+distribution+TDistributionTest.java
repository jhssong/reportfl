{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/distribution/TDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 26,
      "end_line": 110,
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
      "end_line": 42,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 45,
      "end_line": 51,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestValues()",
      "begin_line": 54,
      "end_line": 58,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.setUp()",
      "begin_line": 61,
      "end_line": 65,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)",
        "(line 64,col 9)-(line 64,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testCumulativeProbabilityAgaintStackOverflow()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * @see \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d27243\"\u003e\n     *      Bug report that prompted this unit test.\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 57)",
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testSmallDf()",
      "begin_line": 78,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 51)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 82,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 66)",
        "(line 86,col 9)-(line 86,col 40)",
        "(line 87,col 9)-(line 87,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 90,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 60)",
        "(line 92,col 9)-(line 93,col 83)",
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testDfAccessors()",
      "begin_line": 97,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 79)",
        "(line 100,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 101,col 79)",
        "(line 102,col 9)-(line 107,col 9)"
      ]
    }
  ]
}