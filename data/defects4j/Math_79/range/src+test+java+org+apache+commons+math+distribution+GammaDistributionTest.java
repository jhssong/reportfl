{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/distribution/GammaDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GammaDistributionTest",
      "is_interface": false,
      "parent_types": [
        "ContinuousDistributionAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 150,
      "comment": "\n * Test cases for GammaDistribution.\n * Extends ContinuousDistributionAbstractTest.  See class javadoc for\n * ContinuousDistributionAbstractTest for details.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.GammaDistributionTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "\n     * Constructor for GammaDistributionTest.\n     * @param name\n     ",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.makeDistribution()",
      "begin_line": 40,
      "end_line": 43,
      "comment": " Creates the default continuous distribution instance to use in tests. ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 46,
      "end_line": 52,
      "comment": " Creates the default cumulative probability distribution test input values ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.makeCumulativeTestValues()",
      "begin_line": 55,
      "end_line": 59,
      "comment": " Creates the default cumulative probability density test expected values ",
      "child_ranges": [
        "(line 57,col 9)-(line 58,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.setUp()",
      "begin_line": 62,
      "end_line": 66,
      "comment": " --------------------- Override tolerance  --------------",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)",
        "(line 65,col 9)-(line 65,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testParameterAccessors()",
      "begin_line": 69,
      "end_line": 89,
      "comment": "---------------------------- Additional test cases -------------------------",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 79)",
        "(line 71,col 9)-(line 71,col 53)",
        "(line 72,col 9)-(line 72,col 34)",
        "(line 73,col 9)-(line 73,col 53)",
        "(line 74,col 9)-(line 74,col 52)",
        "(line 75,col 9)-(line 75,col 33)",
        "(line 76,col 9)-(line 76,col 52)",
        "(line 77,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testProbabilities()",
      "begin_line": 91,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 49)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 94,col 9)-(line 94,col 48)",
        "(line 95,col 9)-(line 95,col 49)",
        "(line 96,col 9)-(line 96,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testValues()",
      "begin_line": 99,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 43)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 43)",
        "(line 103,col 9)-(line 103,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testProbability(double, double, double, double)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 75)",
        "(line 108,col 9)-(line 108,col 62)",
        "(line 109,col 9)-(line 109,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testValue(double, double, double, double)",
      "begin_line": 112,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 75)",
        "(line 114,col 9)-(line 114,col 69)",
        "(line 115,col 9)-(line 115,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testDensity()",
      "begin_line": 118,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 60)",
        "(line 121,col 9)-(line 121,col 140)",
        "(line 123,col 9)-(line 123,col 140)",
        "(line 125,col 9)-(line 125,col 146)",
        "(line 127,col 9)-(line 127,col 147)",
        "(line 129,col 9)-(line 129,col 149)",
        "(line 131,col 9)-(line 131,col 149)",
        "(line 133,col 9)-(line 133,col 148)",
        "(line 135,col 9)-(line 135,col 148)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.checkDensity(double, double, double[], double[])",
      "begin_line": 138,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 73)",
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.GammaDistributionTest.testInverseCumulativeProbabilityExtremes()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 147,col 83)",
        "(line 148,col 9)-(line 148,col 47)"
      ]
    }
  ]
}