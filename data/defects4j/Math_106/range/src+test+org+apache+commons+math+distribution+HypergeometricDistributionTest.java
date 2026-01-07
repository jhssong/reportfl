{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 28,
      "end_line": 206,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.HypergeometricDistributionTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * Constructor for ChiSquareDistributionTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 41,
      "end_line": 43,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 46,
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
      "end_line": 54,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 62,
      "end_line": 65,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 63,col 9)-(line 64,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 69,col 9)-(line 70,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 74,
      "end_line": 76,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 81,
      "end_line": 92,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 99)",
        "(line 83,col 9)-(line 83,col 62)",
        "(line 84,col 9)-(line 84,col 67)",
        "(line 85,col 9)-(line 85,col 58)",
        "(line 86,col 9)-(line 86,col 64)",
        "(line 87,col 9)-(line 87,col 66)",
        "(line 88,col 9)-(line 88,col 57)",
        "(line 89,col 9)-(line 89,col 26)",
        "(line 90,col 9)-(line 90,col 40)",
        "(line 91,col 9)-(line 91,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 95,
      "end_line": 106,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 99)",
        "(line 97,col 9)-(line 97,col 62)",
        "(line 98,col 9)-(line 98,col 67)",
        "(line 99,col 9)-(line 99,col 58)",
        "(line 100,col 9)-(line 100,col 64)",
        "(line 101,col 9)-(line 101,col 66)",
        "(line 102,col 9)-(line 102,col 59)",
        "(line 103,col 9)-(line 103,col 26)",
        "(line 104,col 9)-(line 104,col 40)",
        "(line 105,col 9)-(line 105,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 109,
      "end_line": 120,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 99)",
        "(line 111,col 9)-(line 111,col 62)",
        "(line 112,col 9)-(line 112,col 67)",
        "(line 113,col 9)-(line 113,col 58)",
        "(line 114,col 9)-(line 114,col 64)",
        "(line 115,col 9)-(line 115,col 66)",
        "(line 116,col 9)-(line 116,col 57)",
        "(line 117,col 9)-(line 117,col 26)",
        "(line 118,col 9)-(line 118,col 40)",
        "(line 119,col 9)-(line 119,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testPopulationSize()",
      "begin_line": 122,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 116)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 134,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 34)",
        "(line 136,col 9)-(line 136,col 29)",
        "(line 137,col 9)-(line 137,col 35)",
        "(line 138,col 9)-(line 157,col 10)",
        "(line 159,col 9)-(line 159,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 162,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 127)",
        "(line 164,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 180,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 29)",
        "(line 183,col 9)-(line 183,col 34)",
        "(line 184,col 9)-(line 203,col 10)",
        "(line 204,col 9)-(line 204,col 104)"
      ]
    }
  ]
}