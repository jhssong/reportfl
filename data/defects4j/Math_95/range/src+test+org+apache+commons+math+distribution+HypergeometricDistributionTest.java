{
  "filepath": "/tmp/Math-95b/src/test/org/apache/commons/math/distribution/HypergeometricDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HypergeometricDistributionTest",
      "is_interface": false,
      "parent_types": [
        "IntegerDistributionAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 207,
      "comment": "\n * Test cases for HyperGeometriclDistribution.\n * Extends IntegerDistributionAbstractTest.  See class javadoc for\n * IntegerDistributionAbstractTest for details.\n * \n * @version $Revision$ $Date$\n "
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
      "end_line": 44,
      "comment": " Creates the default discrete distribution instance to use in tests. ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestPoints()",
      "begin_line": 47,
      "end_line": 49,
      "comment": " Creates the default probability density test input values ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeDensityTestValues()",
      "begin_line": 52,
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
      "end_line": 60,
      "comment": " Creates the default cumulative probability density test input values ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeCumulativeTestValues()",
      "begin_line": 63,
      "end_line": 66,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 64,col 9)-(line 65,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestPoints()",
      "begin_line": 69,
      "end_line": 72,
      "comment": " Creates the default inverse cumulative probability test input values ",
      "child_ranges": [
        "(line 70,col 9)-(line 71,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.makeInverseCumulativeTestValues()",
      "begin_line": 75,
      "end_line": 77,
      "comment": " Creates the default inverse cumulative probability density test expected values ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoFailures()",
      "begin_line": 82,
      "end_line": 93,
      "comment": " Verify that if there are no failures, mass is concentrated on sampleSize ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 67)",
        "(line 84,col 9)-(line 84,col 62)",
        "(line 85,col 9)-(line 85,col 67)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 87,col 64)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 89,col 57)",
        "(line 90,col 9)-(line 90,col 26)",
        "(line 91,col 9)-(line 91,col 40)",
        "(line 92,col 9)-(line 92,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateNoSuccesses()",
      "begin_line": 96,
      "end_line": 107,
      "comment": " Verify that if there are no successes, mass is concentrated on 0 ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 67)",
        "(line 98,col 9)-(line 98,col 62)",
        "(line 99,col 9)-(line 99,col 67)",
        "(line 100,col 9)-(line 100,col 58)",
        "(line 101,col 9)-(line 101,col 64)",
        "(line 102,col 9)-(line 102,col 66)",
        "(line 103,col 9)-(line 103,col 59)",
        "(line 104,col 9)-(line 104,col 26)",
        "(line 105,col 9)-(line 105,col 40)",
        "(line 106,col 9)-(line 106,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testDegenerateFullSample()",
      "begin_line": 110,
      "end_line": 121,
      "comment": " Verify that if sampleSize \u003d populationSize, mass is concentrated on numberOfSuccesses ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 67)",
        "(line 112,col 9)-(line 112,col 62)",
        "(line 113,col 9)-(line 113,col 67)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 64)",
        "(line 116,col 9)-(line 116,col 66)",
        "(line 117,col 9)-(line 117,col 57)",
        "(line 118,col 9)-(line 118,col 26)",
        "(line 119,col 9)-(line 119,col 40)",
        "(line 120,col 9)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testPopulationSize()",
      "begin_line": 123,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 84)",
        "(line 125,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 35)",
        "(line 132,col 9)-(line 132,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testLargeValues()",
      "begin_line": 135,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)",
        "(line 137,col 9)-(line 137,col 29)",
        "(line 138,col 9)-(line 138,col 35)",
        "(line 139,col 9)-(line 158,col 10)",
        "(line 160,col 9)-(line 160,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testHypergeometricDistributionProbabilities(int, int, int, double[][])",
      "begin_line": 163,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 127)",
        "(line 165,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.HypergeometricDistributionTest.testMoreLargeValues()",
      "begin_line": 181,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 35)",
        "(line 183,col 9)-(line 183,col 29)",
        "(line 184,col 9)-(line 184,col 34)",
        "(line 185,col 9)-(line 204,col 10)",
        "(line 205,col 9)-(line 205,col 104)"
      ]
    }
  ]
}