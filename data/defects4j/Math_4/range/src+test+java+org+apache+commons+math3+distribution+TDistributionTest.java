{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/TDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 30,
      "end_line": 161,
      "comment": "\n * Test cases for TDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.makeDistribution()",
      "begin_line": 35,
      "end_line": 38,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 41,
      "end_line": 46,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 44,col 9)-(line 45,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.makeCumulativeTestValues()",
      "begin_line": 49,
      "end_line": 53,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.makeDensityTestValues()",
      "begin_line": 56,
      "end_line": 60,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.setUp()",
      "begin_line": 63,
      "end_line": 67,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)",
        "(line 66,col 9)-(line 66,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testCumulativeProbabilityAgainstStackOverflow()",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * @see \u003ca href\u003d\"http://issues.apache.org/bugzilla/show_bug.cgi?id\u003d27243\"\u003e\n     *      Bug report that prompted this unit test.\u003c/a\u003e\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 49)",
        "(line 77,col 9)-(line 77,col 37)",
        "(line 78,col 9)-(line 78,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testSmallDf()",
      "begin_line": 81,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)",
        "(line 85,col 9)-(line 87,col 48)",
        "(line 88,col 9)-(line 90,col 70)",
        "(line 91,col 9)-(line 91,col 66)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 47)",
        "(line 94,col 9)-(line 94,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 97,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 60)",
        "(line 100,col 9)-(line 101,col 83)",
        "(line 102,col 9)-(line 102,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testDfAccessors()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 63)",
        "(line 108,col 9)-(line 108,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testPreconditions()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.testMoments()",
      "begin_line": 116,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 32)",
        "(line 119,col 9)-(line 119,col 27)",
        "(line 121,col 9)-(line 121,col 36)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 69)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 61)",
        "(line 127,col 9)-(line 127,col 74)",
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 61)",
        "(line 131,col 9)-(line 131,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.nistData()",
      "begin_line": 140,
      "end_line": 152,
      "comment": "\n     * Adding this test to benchmark against tables published by NIST\n     * http://itl.nist.gov/div898/handbook/eda/section3/eda3672.htm\n     * Have chosen tabulated results for degrees of freedom 2,10,30,100\n     * Have chosen problevels from 0.10 to 0.001\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 72)",
        "(line 143,col 9)-(line 143,col 76)",
        "(line 144,col 9)-(line 144,col 76)",
        "(line 145,col 9)-(line 145,col 76)",
        "(line 146,col 9)-(line 146,col 76)",
        "(line 147,col 9)-(line 147,col 72)",
        "(line 148,col 9)-(line 148,col 74)",
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 76)",
        "(line 151,col 9)-(line 151,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.TDistributionTest.makeNistResults(double[], int)",
      "begin_line": 153,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 50)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 19)"
      ]
    }
  ]
}