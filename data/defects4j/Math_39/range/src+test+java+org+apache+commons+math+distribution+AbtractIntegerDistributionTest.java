{
  "filepath": "/tmp/Math-39b/src/test/java/org/apache/commons/math/distribution/AbtractIntegerDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbtractIntegerDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 118,
      "comment": "\n * Test cases for AbstractIntegerDistribution default implementations.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "diceDistribution"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesSingleIntegerArguments()",
      "begin_line": 32,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 22)",
        "(line 35,col 9)-(line 39,col 9)",
        "(line 40,col 9)-(line 41,col 78)",
        "(line 42,col 9)-(line 43,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesRangeArguments()",
      "begin_line": 46,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)",
        "(line 49,col 9)-(line 49,col 22)",
        "(line 50,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiceDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 65,
      "end_line": 117,
      "comment": "\n     * Simple distribution modeling a 6-sided die\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.probability(int)",
      "begin_line": 70,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 71,col 13)-(line 75,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.cumulativeProbability(int)",
      "begin_line": 78,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 85,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainLowerBound(double)",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainUpperBound(double)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getNumericalMean()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getNumericalVariance()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportLowerBound()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportUpperBound()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.isSupportConnected()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 24)"
      ]
    }
  ]
}