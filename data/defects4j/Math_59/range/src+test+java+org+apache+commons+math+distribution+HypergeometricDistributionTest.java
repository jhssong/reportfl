{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 32,
      "end_line": 258,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.HypergeometricDistributionTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructor for ChiSquareDistributionTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 45,
      "end_line": 48,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 51,
      "end_line": 54,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 64,
      "end_line": 67,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 70,
      "end_line": 74,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 72,col 9)-(line 73,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 77,
      "end_line": 81,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 79,col 9)-(line 80,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 92,
      "end_line": 103,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 67)",
        "(line 94,col 9)-(line 94,col 62)",
        "(line 95,col 9)-(line 95,col 67)",
        "(line 96,col 9)-(line 96,col 58)",
        "(line 97,col 9)-(line 97,col 64)",
        "(line 98,col 9)-(line 98,col 66)",
        "(line 99,col 9)-(line 99,col 57)",
        "(line 100,col 9)-(line 100,col 26)",
        "(line 101,col 9)-(line 101,col 40)",
        "(line 102,col 9)-(line 102,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 106,
      "end_line": 117,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 67)",
        "(line 108,col 9)-(line 108,col 62)",
        "(line 109,col 9)-(line 109,col 67)",
        "(line 110,col 9)-(line 110,col 58)",
        "(line 111,col 9)-(line 111,col 64)",
        "(line 112,col 9)-(line 112,col 66)",
        "(line 113,col 9)-(line 113,col 59)",
        "(line 114,col 9)-(line 114,col 26)",
        "(line 115,col 9)-(line 115,col 40)",
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 120,
      "end_line": 131,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 67)",
        "(line 122,col 9)-(line 122,col 62)",
        "(line 123,col 9)-(line 123,col 67)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 64)",
        "(line 126,col 9)-(line 126,col 66)",
        "(line 127,col 9)-(line 127,col 57)",
        "(line 128,col 9)-(line 128,col 26)",
        "(line 129,col 9)-(line 129,col 40)",
        "(line 130,col 9)-(line 130,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testPreconditions()",
      "begin_line": 133,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testAccessors()",
      "begin_line": 166,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 86)",
        "(line 168,col 9)-(line 168,col 50)",
        "(line 169,col 9)-(line 169,col 53)",
        "(line 170,col 9)-(line 170,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 173,
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
        "(line 202,col 9)-(line 202,col 127)",
        "(line 203,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 219,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 29)",
        "(line 222,col 9)-(line 222,col 34)",
        "(line 223,col 9)-(line 242,col 10)",
        "(line 243,col 9)-(line 243,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMomonts()",
      "begin_line": 246,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 32)",
        "(line 248,col 9)-(line 248,col 40)",
        "(line 250,col 9)-(line 250,col 65)",
        "(line 251,col 9)-(line 251,col 71)",
        "(line 252,col 9)-(line 252,col 134)",
        "(line 254,col 9)-(line 254,col 65)",
        "(line 255,col 9)-(line 255,col 71)",
        "(line 256,col 9)-(line 256,col 134)"
      ]
    }
  ]
}