{
  "filepath": "/tmp/Math-98b/src/test/org/apache/commons/math/distribution/NormalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NormalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 145,
      "comment": "\n * Test cases for NormalDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.NormalDistributionTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Constructor for NormalDistributionTest.\n     * @param arg0\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeDistribution()",
      "begin_line": 40,
      "end_line": 42,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 45,
      "end_line": 49,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 52,
      "end_line": 55,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 53,col 9)-(line 54,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.setUp()",
      "begin_line": 58,
      "end_line": 61,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)",
        "(line 60,col 9)-(line 60,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.verifyQuantiles()",
      "begin_line": 65,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 81)",
        "(line 67,col 9)-(line 67,col 43)",
        "(line 68,col 9)-(line 68,col 59)",
        "(line 69,col 9)-(line 71,col 33)",
        "(line 73,col 9)-(line 74,col 62)",
        "(line 75,col 9)-(line 75,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testQuantiles()",
      "begin_line": 78,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 26)",
        "(line 80,col 9)-(line 80,col 58)",
        "(line 81,col 9)-(line 81,col 26)",
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 60)",
        "(line 88,col 9)-(line 89,col 83)",
        "(line 90,col 9)-(line 90,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetMean()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 81)",
        "(line 95,col 9)-(line 95,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetMean()",
      "begin_line": 98,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 34)",
        "(line 100,col 9)-(line 100,col 81)",
        "(line 101,col 9)-(line 101,col 33)",
        "(line 102,col 9)-(line 102,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testGetStandardDeviation()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 81)",
        "(line 107,col 9)-(line 107,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testSetStandardDeviation()",
      "begin_line": 110,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 81)",
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 68)",
        "(line 115,col 9)-(line 115,col 26)",
        "(line 116,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.NormalDistributionTest.testExtremeValues()",
      "begin_line": 128,
      "end_line": 144,
      "comment": "\n     * Check to make sure top-coding of extreme values works correctly.\n     * Verifies fix for JIRA MATH-167\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 81)",
        "(line 130,col 9)-(line 130,col 32)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 132,col 9)-(line 143,col 9)"
      ]
    }
  ]
}