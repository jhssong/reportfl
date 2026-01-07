{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/distribution/NormalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 30,
      "end_line": 199,
      "comment": "\n * Test cases for NormalDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.NormalDistributionTest(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Constructor for NormalDistributionTest.\n     * @param arg0\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeDistribution()",
      "begin_line": 43,
      "end_line": 46,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 49,
      "end_line": 54,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 52,col 9)-(line 53,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 57,
      "end_line": 61,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 59,col 9)-(line 60,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeDensityTestValues()",
      "begin_line": 64,
      "end_line": 68,
      "comment": " Creates the default probability density test expected values ",
      "child_ranges": [
        "(line 66,col 9)-(line 67,col 101)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "defaultTolerance"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " --------------------- Override tolerance  --------------"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.setUp()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 22)",
        "(line 75,col 9)-(line 75,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.verifyQuantiles()",
      "begin_line": 80,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 81)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 83,col 9)-(line 83,col 59)",
        "(line 84,col 9)-(line 86,col 33)",
        "(line 88,col 9)-(line 89,col 93)",
        "(line 90,col 9)-(line 90,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testQuantiles()",
      "begin_line": 93,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 95,col 73)",
        "(line 96,col 9)-(line 96,col 26)",
        "(line 97,col 9)-(line 97,col 26)",
        "(line 99,col 9)-(line 99,col 58)",
        "(line 100,col 9)-(line 101,col 73)",
        "(line 102,col 9)-(line 102,col 26)",
        "(line 103,col 9)-(line 103,col 26)",
        "(line 105,col 9)-(line 105,col 60)",
        "(line 106,col 9)-(line 107,col 87)",
        "(line 108,col 9)-(line 108,col 26)",
        "(line 109,col 9)-(line 109,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 112,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 60)",
        "(line 114,col 9)-(line 115,col 83)",
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetMean()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 81)",
        "(line 121,col 9)-(line 121,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetMean()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 81)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetStandardDeviation()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 81)",
        "(line 133,col 9)-(line 133,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetStandardDeviation()",
      "begin_line": 136,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 81)",
        "(line 139,col 9)-(line 139,col 49)",
        "(line 140,col 9)-(line 140,col 68)",
        "(line 141,col 9)-(line 141,col 26)",
        "(line 142,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testDensity()",
      "begin_line": 150,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 52)",
        "(line 153,col 9)-(line 153,col 119)",
        "(line 155,col 9)-(line 155,col 122)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.checkDensity(double, double, double[], double[])",
      "begin_line": 158,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 68)",
        "(line 160,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testExtremeValues()",
      "begin_line": 169,
      "end_line": 185,
      "comment": "\n     * Check to make sure top-coding of extreme values works correctly.\n     * Verifies fix for JIRA MATH-167\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 81)",
        "(line 171,col 9)-(line 171,col 32)",
        "(line 172,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testMath280()",
      "begin_line": 187,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 68)",
        "(line 189,col 9)-(line 189,col 80)",
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 72)",
        "(line 192,col 9)-(line 192,col 52)",
        "(line 193,col 9)-(line 193,col 73)",
        "(line 194,col 9)-(line 194,col 52)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 196,col 9)-(line 196,col 52)"
      ]
    }
  ]
}