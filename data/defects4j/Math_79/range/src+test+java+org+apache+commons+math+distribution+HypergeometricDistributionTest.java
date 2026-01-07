{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 214,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.HypergeometricDistributionTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Constructor for ChiSquareDistributionTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDistribution()",
      "begin_line": 42,
      "end_line": 45,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 48,
      "end_line": 51,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 54,
      "end_line": 58,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 61,
      "end_line": 64,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 67,
      "end_line": 71,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 69,col 9)-(line 70,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 74,
      "end_line": 78,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 76,col 9)-(line 77,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 89,
      "end_line": 100,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 67)",
        "(line 91,col 9)-(line 91,col 62)",
        "(line 92,col 9)-(line 92,col 67)",
        "(line 93,col 9)-(line 93,col 58)",
        "(line 94,col 9)-(line 94,col 64)",
        "(line 95,col 9)-(line 95,col 66)",
        "(line 96,col 9)-(line 96,col 57)",
        "(line 97,col 9)-(line 97,col 26)",
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 103,
      "end_line": 114,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 67)",
        "(line 105,col 9)-(line 105,col 62)",
        "(line 106,col 9)-(line 106,col 67)",
        "(line 107,col 9)-(line 107,col 58)",
        "(line 108,col 9)-(line 108,col 64)",
        "(line 109,col 9)-(line 109,col 66)",
        "(line 110,col 9)-(line 110,col 59)",
        "(line 111,col 9)-(line 111,col 26)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 113,col 9)-(line 113,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 117,
      "end_line": 128,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 67)",
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
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testPopulationSize()",
      "begin_line": 130,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 84)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 142,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 34)",
        "(line 144,col 9)-(line 144,col 29)",
        "(line 145,col 9)-(line 145,col 35)",
        "(line 146,col 9)-(line 165,col 10)",
        "(line 167,col 9)-(line 167,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 170,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 127)",
        "(line 172,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 188,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 190,col 29)",
        "(line 191,col 9)-(line 191,col 34)",
        "(line 192,col 9)-(line 211,col 10)",
        "(line 212,col 9)-(line 212,col 104)"
      ]
    }
  ]
}