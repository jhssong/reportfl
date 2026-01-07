{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/distribution/EnumeratedRealDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumeratedRealDistributionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 216,
      "comment": "\n * Test class for {@link EnumeratedRealDistribution}.\n * \n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "testDistribution"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * The distribution object used for testing.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.EnumeratedRealDistributionTest()",
      "begin_line": 47,
      "end_line": 53,
      "comment": "\n     * Creates the default distribution object used for testing.\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 52,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testExceptions()",
      "begin_line": 59,
      "end_line": 88,
      "comment": "\n     * Tests if the {@link EnumeratedRealDistribution} constructor throws\n     * exceptions for invalid data.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 50)",
        "(line 62,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testProbability()",
      "begin_line": 93,
      "end_line": 101,
      "comment": "\n     * Tests if the distribution returns proper probability values.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 96)",
        "(line 96,col 9)-(line 96,col 79)",
        "(line 97,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testDensity()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n     * Tests if the distribution returns proper density values.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 96)",
        "(line 109,col 9)-(line 109,col 79)",
        "(line 110,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testCumulativeProbability()",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Tests if the distribution returns proper cumulative probability values.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 96)",
        "(line 122,col 9)-(line 122,col 93)",
        "(line 123,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetNumericalMean()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Tests if the distribution returns proper mean value.\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetNumericalVariance()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Tests if the distribution returns proper variance.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetSupportLowerBound()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "\n     * Tests if the distribution returns proper lower bound.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testGetSupportUpperBound()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "\n     * Tests if the distribution returns proper upper bound.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportLowerBoundInclusive()",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * Tests if the distribution returns properly that the support includes the\n     * lower bound.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportUpperBoundInclusive()",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * Tests if the distribution returns properly that the support includes the\n     * upper bound.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIsSupportConnected()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Tests if the distribution returns properly that the support is connected.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testSample()",
      "begin_line": 190,
      "end_line": 206,
      "comment": "\n     * Tests sampling.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 30)",
        "(line 193,col 9)-(line 193,col 59)",
        "(line 194,col 9)-(line 194,col 60)",
        "(line 195,col 9)-(line 195,col 47)",
        "(line 196,col 9)-(line 196,col 23)",
        "(line 197,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 205,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.EnumeratedRealDistributionTest.testIssue942()",
      "begin_line": 208,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 79)",
        "(line 211,col 9)-(line 211,col 75)",
        "(line 212,col 9)-(line 212,col 75)",
        "(line 213,col 9)-(line 213,col 90)"
      ]
    }
  ]
}