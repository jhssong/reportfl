{
  "filepath": "/tmp/Math-34b/src/test/java/org/apache/commons/math3/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 34,
      "end_line": 269,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 39,
      "end_line": 42,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 45,
      "end_line": 48,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 51,
      "end_line": 55,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 53,col 9)-(line 54,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 58,
      "end_line": 61,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 71,
      "end_line": 75,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 73,col 9)-(line 74,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 78,
      "end_line": 81,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 86,
      "end_line": 101,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 80)",
        "(line 89,col 9)-(line 89,col 30)",
        "(line 90,col 9)-(line 90,col 62)",
        "(line 91,col 9)-(line 91,col 67)",
        "(line 92,col 9)-(line 92,col 58)",
        "(line 93,col 9)-(line 93,col 64)",
        "(line 94,col 9)-(line 94,col 66)",
        "(line 95,col 9)-(line 95,col 57)",
        "(line 96,col 9)-(line 96,col 26)",
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 47)",
        "(line 99,col 9)-(line 99,col 60)",
        "(line 100,col 9)-(line 100,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 104,
      "end_line": 119,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 80)",
        "(line 107,col 9)-(line 107,col 30)",
        "(line 108,col 9)-(line 108,col 62)",
        "(line 109,col 9)-(line 109,col 67)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 111,col 9)-(line 111,col 64)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 113,col 9)-(line 113,col 57)",
        "(line 114,col 9)-(line 114,col 26)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 47)",
        "(line 117,col 9)-(line 117,col 60)",
        "(line 118,col 9)-(line 118,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 122,
      "end_line": 137,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 80)",
        "(line 125,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 126,col 62)",
        "(line 127,col 9)-(line 127,col 67)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 64)",
        "(line 130,col 9)-(line 130,col 66)",
        "(line 131,col 9)-(line 131,col 57)",
        "(line 132,col 9)-(line 132,col 26)",
        "(line 133,col 9)-(line 133,col 40)",
        "(line 134,col 9)-(line 134,col 47)",
        "(line 135,col 9)-(line 135,col 60)",
        "(line 136,col 9)-(line 136,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testPreconditions()",
      "begin_line": 139,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testAccessors()",
      "begin_line": 173,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 82)",
        "(line 176,col 9)-(line 176,col 57)",
        "(line 177,col 9)-(line 177,col 60)",
        "(line 178,col 9)-(line 178,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 181,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 34)",
        "(line 184,col 9)-(line 184,col 29)",
        "(line 185,col 9)-(line 185,col 35)",
        "(line 186,col 9)-(line 205,col 10)",
        "(line 207,col 9)-(line 207,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 210,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 119)",
        "(line 212,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 228,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 35)",
        "(line 231,col 9)-(line 231,col 29)",
        "(line 232,col 9)-(line 232,col 34)",
        "(line 233,col 9)-(line 252,col 10)",
        "(line 253,col 9)-(line 253,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoments()",
      "begin_line": 256,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 32)",
        "(line 259,col 9)-(line 259,col 40)",
        "(line 261,col 9)-(line 261,col 61)",
        "(line 262,col 9)-(line 262,col 78)",
        "(line 263,col 9)-(line 263,col 141)",
        "(line 265,col 9)-(line 265,col 61)",
        "(line 266,col 9)-(line 266,col 78)",
        "(line 267,col 9)-(line 267,col 141)"
      ]
    }
  ]
}