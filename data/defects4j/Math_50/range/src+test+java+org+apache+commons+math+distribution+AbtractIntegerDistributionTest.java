{
  "filepath": "/tmp/Math-50b/src/test/java/org/apache/commons/math/distribution/AbtractIntegerDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbtractIntegerDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 171,
      "comment": "\n * Test cases for AbstractIntegerDistribution default implementations.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "diceDistribution"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesSingleIntegerArguments()",
      "begin_line": 34,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 22)",
        "(line 37,col 9)-(line 41,col 9)",
        "(line 42,col 9)-(line 43,col 78)",
        "(line 44,col 9)-(line 45,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesSingleDoubleArguments()",
      "begin_line": 48,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)",
        "(line 51,col 9)-(line 51,col 23)",
        "(line 52,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesRangeIntegerArguments()",
      "begin_line": 66,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 22)",
        "(line 69,col 9)-(line 69,col 22)",
        "(line 70,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesRangeDoubleArguments()",
      "begin_line": 82,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 22)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 30)",
        "(line 88,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiceDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 119,
      "end_line": 170,
      "comment": "\n     * Simple distribution modeling a 6-sided die\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.probability(int)",
      "begin_line": 122,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 13)-(line 127,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.cumulativeProbability(int)",
      "begin_line": 130,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 138,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainLowerBound(double)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainUpperBound(double)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportLowerBound()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportUpperBound()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.calculateNumericalMean()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.calculateNumericalVariance()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 168,col 13)-(line 168,col 36)"
      ]
    }
  ]
}