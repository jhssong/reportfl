{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/distribution/NormalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 198,
      "comment": "\n * Test cases for NormalDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.NormalDistributionTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Constructor for NormalDistributionTest.\n     * @param arg0\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeDistribution()",
      "begin_line": 42,
      "end_line": 45,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 48,
      "end_line": 53,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 56,
      "end_line": 60,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeDensityTestValues()",
      "begin_line": 63,
      "end_line": 67,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 65,col 9)-(line 66,col 101)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "defaultTolerance"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " --------------------- Override tolerance  --------------"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.setUp()",
      "begin_line": 71,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 22)",
        "(line 74,col 9)-(line 74,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.verifyQuantiles()",
      "begin_line": 79,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 81)",
        "(line 81,col 9)-(line 81,col 43)",
        "(line 82,col 9)-(line 82,col 59)",
        "(line 83,col 9)-(line 85,col 33)",
        "(line 87,col 9)-(line 88,col 93)",
        "(line 89,col 9)-(line 89,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testQuantiles()",
      "begin_line": 92,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 95,col 26)",
        "(line 96,col 9)-(line 96,col 26)",
        "(line 98,col 9)-(line 98,col 58)",
        "(line 99,col 9)-(line 100,col 73)",
        "(line 101,col 9)-(line 101,col 26)",
        "(line 102,col 9)-(line 102,col 26)",
        "(line 104,col 9)-(line 104,col 60)",
        "(line 105,col 9)-(line 106,col 87)",
        "(line 107,col 9)-(line 107,col 26)",
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 60)",
        "(line 113,col 9)-(line 114,col 83)",
        "(line 115,col 9)-(line 115,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetMean()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 81)",
        "(line 120,col 9)-(line 120,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetMean()",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 34)",
        "(line 125,col 9)-(line 125,col 81)",
        "(line 126,col 9)-(line 126,col 33)",
        "(line 127,col 9)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetStandardDeviation()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 81)",
        "(line 132,col 9)-(line 132,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetStandardDeviation()",
      "begin_line": 135,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 44)",
        "(line 137,col 9)-(line 137,col 81)",
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 139,col 68)",
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testDensity()",
      "begin_line": 149,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 52)",
        "(line 152,col 9)-(line 152,col 119)",
        "(line 154,col 9)-(line 154,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.checkDensity(double, double, double[], double[])",
      "begin_line": 157,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 68)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testExtremeValues()",
      "begin_line": 168,
      "end_line": 184,
      "comment": "\n     * Check to make sure top-coding of extreme values works correctly.\n     * Verifies fix for JIRA MATH-167\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 81)",
        "(line 170,col 9)-(line 170,col 32)",
        "(line 171,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testMath280()",
      "begin_line": 186,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 68)",
        "(line 188,col 9)-(line 188,col 80)",
        "(line 189,col 9)-(line 189,col 52)",
        "(line 190,col 9)-(line 190,col 72)",
        "(line 191,col 9)-(line 191,col 52)",
        "(line 192,col 9)-(line 192,col 73)",
        "(line 193,col 9)-(line 193,col 52)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 52)"
      ]
    }
  ]
}