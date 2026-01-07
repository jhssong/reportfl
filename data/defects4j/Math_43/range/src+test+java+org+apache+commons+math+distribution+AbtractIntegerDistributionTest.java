{
  "filepath": "/tmp/Math-43b/src/test/java/org/apache/commons/math/distribution/AbtractIntegerDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbtractIntegerDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 170,
      "comment": "\n * Test cases for AbstractIntegerDistribution default implementations.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "diceDistribution"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesSingleIntegerArguments()",
      "begin_line": 33,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 22)",
        "(line 36,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 42,col 78)",
        "(line 43,col 9)-(line 44,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesSingleDoubleArguments()",
      "begin_line": 47,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 22)",
        "(line 50,col 9)-(line 50,col 23)",
        "(line 51,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesRangeIntegerArguments()",
      "begin_line": 65,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 22)",
        "(line 68,col 9)-(line 68,col 22)",
        "(line 69,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.testCumulativeProbabilitiesRangeDoubleArguments()",
      "begin_line": 81,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 22)",
        "(line 84,col 9)-(line 84,col 22)",
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DiceDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.distribution.AbstractIntegerDistribution"
      ],
      "begin_line": 118,
      "end_line": 169,
      "comment": "\n     * Simple distribution modeling a 6-sided die\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "p"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.probability(int)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 122,col 13)-(line 126,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.cumulativeProbability(int)",
      "begin_line": 129,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 137,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainLowerBound(double)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getDomainUpperBound(double)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportLowerBound()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.getSupportUpperBound()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.calculateNumericalMean()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.distribution.AbtractIntegerDistributionTest.DiceDistribution.calculateNumericalVariance()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 36)"
      ]
    }
  ]
}