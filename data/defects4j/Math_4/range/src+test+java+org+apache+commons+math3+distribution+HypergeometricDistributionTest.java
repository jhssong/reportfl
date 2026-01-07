{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 35,
      "end_line": 287,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 40,
      "end_line": 43,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 46,
      "end_line": 49,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 52,
      "end_line": 56,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 54,col 9)-(line 55,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 59,
      "end_line": 62,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 65,
      "end_line": 69,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 67,col 9)-(line 68,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 72,
      "end_line": 76,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 74,col 9)-(line 75,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 87,
      "end_line": 102,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 80)",
        "(line 90,col 9)-(line 90,col 30)",
        "(line 91,col 9)-(line 91,col 62)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 93,col 58)",
        "(line 94,col 9)-(line 94,col 64)",
        "(line 95,col 9)-(line 95,col 66)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 97,col 26)",
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 47)",
        "(line 100,col 9)-(line 100,col 60)",
        "(line 101,col 9)-(line 101,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 105,
      "end_line": 120,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 80)",
        "(line 108,col 9)-(line 108,col 30)",
        "(line 109,col 9)-(line 109,col 62)",
        "(line 110,col 9)-(line 110,col 67)",
        "(line 111,col 9)-(line 111,col 58)",
        "(line 112,col 9)-(line 112,col 64)",
        "(line 113,col 9)-(line 113,col 66)",
        "(line 114,col 9)-(line 114,col 57)",
        "(line 115,col 9)-(line 115,col 26)",
        "(line 116,col 9)-(line 116,col 40)",
        "(line 117,col 9)-(line 117,col 47)",
        "(line 118,col 9)-(line 118,col 60)",
        "(line 119,col 9)-(line 119,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 123,
      "end_line": 138,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 80)",
        "(line 126,col 9)-(line 126,col 30)",
        "(line 127,col 9)-(line 127,col 62)",
        "(line 128,col 9)-(line 128,col 67)",
        "(line 129,col 9)-(line 129,col 58)",
        "(line 130,col 9)-(line 130,col 64)",
        "(line 131,col 9)-(line 131,col 66)",
        "(line 132,col 9)-(line 132,col 57)",
        "(line 133,col 9)-(line 133,col 26)",
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 135,col 47)",
        "(line 136,col 9)-(line 136,col 60)",
        "(line 137,col 9)-(line 137,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testPreconditions()",
      "begin_line": 140,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testAccessors()",
      "begin_line": 174,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 82)",
        "(line 177,col 9)-(line 177,col 57)",
        "(line 178,col 9)-(line 178,col 60)",
        "(line 179,col 9)-(line 179,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 182,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 34)",
        "(line 185,col 9)-(line 185,col 29)",
        "(line 186,col 9)-(line 186,col 35)",
        "(line 187,col 9)-(line 206,col 10)",
        "(line 208,col 9)-(line 208,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 211,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 119)",
        "(line 213,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 229,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 35)",
        "(line 232,col 9)-(line 232,col 29)",
        "(line 233,col 9)-(line 233,col 34)",
        "(line 234,col 9)-(line 253,col 10)",
        "(line 254,col 9)-(line 254,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMoments()",
      "begin_line": 257,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 260,col 40)",
        "(line 262,col 9)-(line 262,col 61)",
        "(line 263,col 9)-(line 263,col 78)",
        "(line 264,col 9)-(line 264,col 141)",
        "(line 266,col 9)-(line 266,col 61)",
        "(line 267,col 9)-(line 267,col 78)",
        "(line 268,col 9)-(line 268,col 141)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.HypergeometricDistributionTest.testMath644()",
      "begin_line": 271,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 25)",
        "(line 274,col 9)-(line 274,col 21)",
        "(line 275,col 9)-(line 275,col 21)",
        "(line 277,col 9)-(line 277,col 18)",
        "(line 278,col 9)-(line 278,col 88)",
        "(line 280,col 9)-(line 280,col 96)",
        "(line 281,col 9)-(line 281,col 90)",
        "(line 284,col 9)-(line 284,col 81)",
        "(line 285,col 9)-(line 285,col 67)"
      ]
    }
  ]
}