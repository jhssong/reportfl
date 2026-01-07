{
  "filepath": "/tmp/Math-43b/src/test/java/org/apache/commons/math/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 34,
      "end_line": 260,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 39,
      "end_line": 42,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 45,
      "end_line": 48,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 51,
      "end_line": 55,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 53,col 9)-(line 54,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 58,
      "end_line": 61,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 86,
      "end_line": 98,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 63)",
        "(line 89,col 9)-(line 89,col 62)",
        "(line 90,col 9)-(line 90,col 67)",
        "(line 91,col 9)-(line 91,col 58)",
        "(line 92,col 9)-(line 92,col 64)",
        "(line 93,col 9)-(line 93,col 66)",
        "(line 94,col 9)-(line 94,col 57)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 96,col 40)",
        "(line 97,col 9)-(line 97,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 101,
      "end_line": 113,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 63)",
        "(line 104,col 9)-(line 104,col 62)",
        "(line 105,col 9)-(line 105,col 67)",
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 107,col 64)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 109,col 59)",
        "(line 110,col 9)-(line 110,col 26)",
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 112,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 116,
      "end_line": 128,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 63)",
        "(line 119,col 9)-(line 119,col 62)",
        "(line 120,col 9)-(line 120,col 67)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 64)",
        "(line 123,col 9)-(line 123,col 66)",
        "(line 124,col 9)-(line 124,col 57)",
        "(line 125,col 9)-(line 125,col 26)",
        "(line 126,col 9)-(line 126,col 40)",
        "(line 127,col 9)-(line 127,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testPreconditions()",
      "begin_line": 130,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testAccessors()",
      "begin_line": 164,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 82)",
        "(line 167,col 9)-(line 167,col 57)",
        "(line 168,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 169,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 172,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 175,col 29)",
        "(line 176,col 9)-(line 176,col 35)",
        "(line 177,col 9)-(line 196,col 10)",
        "(line 198,col 9)-(line 198,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 201,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 119)",
        "(line 203,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 219,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 35)",
        "(line 222,col 9)-(line 222,col 29)",
        "(line 223,col 9)-(line 223,col 34)",
        "(line 224,col 9)-(line 243,col 10)",
        "(line 244,col 9)-(line 244,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoments()",
      "begin_line": 247,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 250,col 40)",
        "(line 252,col 9)-(line 252,col 61)",
        "(line 253,col 9)-(line 253,col 78)",
        "(line 254,col 9)-(line 254,col 141)",
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 257,col 78)",
        "(line 258,col 9)-(line 258,col 141)"
      ]
    }
  ]
}