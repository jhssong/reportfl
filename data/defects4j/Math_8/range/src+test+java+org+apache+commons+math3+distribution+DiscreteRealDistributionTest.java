{
  "filepath": "/tmp/Math-8b/src/test/java/org/apache/commons/math3/distribution/DiscreteRealDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DiscreteRealDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 215,
      "comment": "\n * Test class for {@link DiscreteRealDistribution}.\n * \n * @version $Id: DiscreteRealDistributionTest.java 161 2013-03-07 09:47:32Z wydrych $\n "
    },
    {
      "type": "field",
      "varNames": [
        "testDistribution"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * The distribution object used for testing.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.DiscreteRealDistributionTest()",
      "begin_line": 46,
      "end_line": 52,
      "comment": "\n     * Creates the default distribution object uded for testing.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testExceptions()",
      "begin_line": 58,
      "end_line": 87,
      "comment": "\n     * Tests if the {@link DiscreteRealDistribution} constructor throws\n     * exceptions for ivalid data.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 48)",
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testProbability()",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Tests if the distribution returns proper probability values.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 96)",
        "(line 95,col 9)-(line 95,col 79)",
        "(line 96,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testDensity()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Tests if the distribution returns proper density values.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 96)",
        "(line 108,col 9)-(line 108,col 79)",
        "(line 109,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testCumulativeProbability()",
      "begin_line": 118,
      "end_line": 126,
      "comment": "\n     * Tests if the distribution returns proper cumulative probability values.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 96)",
        "(line 121,col 9)-(line 121,col 93)",
        "(line 122,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testGetNumericalMean()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Tests if the distribution returns proper mean value.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testGetNumericalVariance()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Tests if the distribution returns proper variance.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testGetSupportLowerBound()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Tests if the distribution returns proper lower bound.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testGetSupportUpperBound()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * Tests if the distribution returns proper upper bound.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testIsSupportLowerBoundInclusive()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Tests if the distribution returns properly that the support includes the\n     * lower bound.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testIsSupportUpperBoundInclusive()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Tests if the distribution returns properly that the support includes the\n     * upper bound.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testIsSupportConnected()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Tests if the distribution returns properly that the support is connected.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testSample()",
      "begin_line": 189,
      "end_line": 205,
      "comment": "\n     * Tests sampling.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 30)",
        "(line 192,col 9)-(line 192,col 59)",
        "(line 193,col 9)-(line 193,col 60)",
        "(line 194,col 9)-(line 194,col 47)",
        "(line 195,col 9)-(line 195,col 23)",
        "(line 196,col 9)-(line 196,col 32)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 202,col 31)",
        "(line 203,col 9)-(line 204,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.DiscreteRealDistributionTest.testIssue942()",
      "begin_line": 207,
      "end_line": 213,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 79)",
        "(line 210,col 9)-(line 210,col 75)",
        "(line 211,col 9)-(line 211,col 75)",
        "(line 212,col 9)-(line 212,col 88)"
      ]
    }
  ]
}