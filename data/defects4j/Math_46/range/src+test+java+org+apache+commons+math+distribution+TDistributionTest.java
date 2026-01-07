{
  "filepath": "/tmp/Math-46b/src/test/java/org/apache/commons/math/distribution/TDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 31,
      "end_line": 167,
      "comment": "\n * Test cases for TDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeDistribution()",
      "begin_line": 36,
      "end_line": 39,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 42,
      "end_line": 47,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 45,col 9)-(line 46,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeCumulativeTestValues()",
      "begin_line": 50,
      "end_line": 54,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeDensityTestValues()",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.setUp()",
      "begin_line": 64,
      "end_line": 68,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 22)",
        "(line 67,col 9)-(line 67,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testCumulativeProbabilityAgaintStackOverflow()",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * @see \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d27243\"\u003e\n     *      Bug report that prompted this unit test.\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 57)",
        "(line 78,col 9)-(line 78,col 37)",
        "(line 79,col 9)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testSmallDf()",
      "begin_line": 82,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 51)",
        "(line 86,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 91,col 70)",
        "(line 92,col 9)-(line 92,col 66)",
        "(line 93,col 9)-(line 93,col 40)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 98,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 102,col 83)",
        "(line 103,col 9)-(line 103,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testDfAccessors()",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 109,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testPreconditions()",
      "begin_line": 112,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.testMomonts()",
      "begin_line": 122,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 32)",
        "(line 125,col 9)-(line 125,col 27)",
        "(line 127,col 9)-(line 127,col 40)",
        "(line 128,col 9)-(line 128,col 65)",
        "(line 129,col 9)-(line 129,col 69)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 61)",
        "(line 133,col 9)-(line 133,col 74)",
        "(line 135,col 9)-(line 135,col 40)",
        "(line 136,col 9)-(line 136,col 61)",
        "(line 137,col 9)-(line 137,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.nistData()",
      "begin_line": 146,
      "end_line": 158,
      "comment": "\n     * Adding this test to benchmark against tables published by NIST\n     * http://itl.nist.gov/div898/handbook/eda/section3/eda3672.htm\n     * Have chosen tabulated results for degrees of freedom 2,10,30,100\n     * Have chosen problevels from 0.10 to 0.001\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 72)",
        "(line 149,col 9)-(line 149,col 76)",
        "(line 150,col 9)-(line 150,col 76)",
        "(line 151,col 9)-(line 151,col 76)",
        "(line 152,col 9)-(line 152,col 76)",
        "(line 153,col 9)-(line 153,col 72)",
        "(line 154,col 9)-(line 154,col 74)",
        "(line 155,col 9)-(line 155,col 74)",
        "(line 156,col 9)-(line 156,col 76)",
        "(line 157,col 9)-(line 157,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.TDistributionTest.makeNistResults(double[], int)",
      "begin_line": 159,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 54)",
        "(line 161,col 9)-(line 161,col 50)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    }
  ]
}